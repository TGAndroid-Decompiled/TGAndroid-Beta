package dh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.t5;
public class u extends TextView implements w9 {
    public static Field K;
    public static Class L;
    public static Method M;
    public m80 A;
    public PorterDuffColorFilter B;
    public final boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public Layout G;
    public int H;
    public boolean I;
    public Object J;
    public final r f4667a;
    public final ArrayList f4668b;
    public final Stack f4669c;
    public boolean d;
    public final Path f4670e;
    public boolean f4671f;
    public int h;
    public p5 f4672n;
    public boolean f4673r;
    public final i80 f4674s;
    public final b6 v;
    public CharacterStyle f4675w;
    public k80 f4676x;
    public k80 f4677y;

    public u(Context context) {
        this(context, null, true);
    }

    public ClickableSpan a(int i9, int i10) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i9 - getPaddingLeft();
        int paddingTop = i10 - getPaddingTop();
        int lineForVertical = layout.getLineForVertical(paddingTop);
        float f10 = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f10);
        float lineLeft = layout.getLineLeft(lineForVertical);
        if (lineLeft <= f10 && layout.getLineWidth(lineForVertical) + lineLeft >= f10 && paddingTop >= 0 && paddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    public final void b() {
        int i9;
        ArrayList arrayList = this.f4668b;
        if (arrayList == null) {
            return;
        }
        Stack stack = this.f4669c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (this.d) {
            invalidate();
            return;
        }
        if (getLayout() != null && (getText() instanceof Spanned)) {
            int i10 = l.A;
            int measuredWidth = getMeasuredWidth();
            Layout layout = getLayout();
            if (measuredWidth > 0) {
                i9 = measuredWidth;
            } else {
                i9 = -2;
            }
            l.a(this, layout, 0, i9, (Spanned) getText(), stack, arrayList, null);
        }
        invalidate();
    }

    public final void c(boolean z10) {
        int i9;
        if (getLayout() != null && getLayout().getText() != null) {
            i9 = getLayout().getText().length();
        } else {
            i9 = 0;
        }
        if (!z10 && this.G == getLayout() && this.H == i9) {
            return;
        }
        this.f4672n = t5.update(this.h, this, this.f4672n, getLayout());
        this.G = getLayout();
        this.H = i9;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        float paddingTop;
        i80 i80Var = this.f4674s;
        if (i80Var != null) {
            Layout layout = getLayout();
            ClickableSpan a2 = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a2 != null && motionEvent.getAction() == 0) {
                m80 m80Var = new m80(a2, this.v, motionEvent.getX(), motionEvent.getY(), 0);
                m80Var.d(f6.v0(f6.Ld, this.v));
                this.A = m80Var;
                i80Var.a(m80Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.A.f30768i);
                int spanEnd = spannableString.getSpanEnd(this.A.f30768i);
                f80 b10 = this.A.b();
                if (this.C) {
                    paddingTop = 0.0f;
                } else {
                    paddingTop = getPaddingTop();
                }
                b10.d(layout, spanStart, paddingTop);
                layout.getSelectionPath(spanStart, spanEnd, b10);
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(this, m80Var, a2, 9), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                i80Var.d(true);
                m80 m80Var2 = this.A;
                if (m80Var2 != null && (characterStyle = m80Var2.f30768i) == a2) {
                    k80 k80Var = this.f4676x;
                    if (k80Var != null) {
                        k80Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.A = null;
                    return true;
                }
                this.A = null;
            }
            if (motionEvent.getAction() == 3) {
                i80Var.d(true);
                this.A = null;
            }
        }
        if (this.A != null || (this.f4671f && ((GestureDetector) this.f4667a.f4659a.f17378b).onTouchEvent(motionEvent))) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public Layout getStaticTextLayout() {
        return getLayout();
    }

    @Override
    public final void invalidate() {
        if (!this.I) {
            this.I = true;
            try {
                if (L == null) {
                    Field declaredField = TextView.class.getDeclaredField("mEditor");
                    K = declaredField;
                    declaredField.setAccessible(true);
                    Class<?> cls = Class.forName("android.widget.Editor");
                    L = cls;
                    try {
                        Method declaredMethod = cls.getDeclaredMethod("invalidateTextDisplayList", null);
                        M = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        super.invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (M != null) {
                    if (this.J == null) {
                        this.J = K.get(this);
                    }
                    Object obj = this.J;
                    if (obj != null) {
                        M.invoke(obj, null);
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c(true);
    }

    @Override
    public void onDraw(Canvas canvas) {
        ArrayList arrayList;
        Canvas canvas2;
        float f10;
        float f11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        canvas.save();
        if (!this.D) {
            if (this.E) {
                f10 = 0.0f;
            } else {
                f10 = paddingLeft;
            }
            if (this.F) {
                f11 = 0.0f;
            } else {
                f11 = paddingTop;
            }
            canvas.translate(f10, f11);
        }
        i80 i80Var = this.f4674s;
        if (i80Var != null && i80Var.f(canvas)) {
            invalidate();
        }
        canvas.restore();
        ArrayList arrayList2 = this.f4668b;
        boolean isEmpty = arrayList2.isEmpty();
        boolean z10 = true;
        Path path = this.f4670e;
        if (isEmpty) {
            super.onDraw(canvas);
        } else {
            canvas.save();
            path.rewind();
            int size = arrayList2.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                Rect bounds = ((l) obj).getBounds();
                path.addRect(bounds.left + paddingLeft, bounds.top + paddingTop, bounds.right + paddingLeft, bounds.bottom + paddingTop, Path.Direction.CW);
            }
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            Emoji.emojiDrawingUseAlpha = this.f4673r;
            super.onDraw(canvas);
            Emoji.emojiDrawingUseAlpha = true;
            canvas.restore();
            l lVar = (l) arrayList2.get(0);
            if (lVar.f4623m > 0.0f && lVar.f4624n > 0.0f) {
                canvas.save();
                canvas.clipPath(path);
                path.rewind();
                ((l) arrayList2.get(0)).e(path);
                canvas.clipPath(path);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        c(false);
        if (this.f4672n != null) {
            canvas.save();
            canvas.translate(paddingLeft, paddingTop);
            t5.drawAnimatedEmojis(canvas, getLayout(), this.f4672n, 0.0f, arrayList2, 0.0f, getHeight(), 0.0f, 1.0f, this.B);
            arrayList = arrayList2;
            canvas.restore();
        } else {
            arrayList = arrayList2;
        }
        if (!arrayList.isEmpty()) {
            if (((l) arrayList.get(0)).f4624n == -1.0f) {
                z10 = false;
            }
            if (z10) {
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), null, 31);
            } else {
                canvas2 = canvas;
                canvas2.save();
            }
            canvas2.translate(paddingLeft, AndroidUtilities.dp(2.0f) + paddingTop);
            int size2 = arrayList.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                l lVar2 = (l) obj2;
                lVar2.h(getPaint().getColor());
                lVar2.draw(canvas2);
            }
            if (z10) {
                path.rewind();
                ((l) arrayList.get(0)).e(path);
                canvas2.drawPath(path, f6.Il);
            }
            canvas2.restore();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        b();
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        b();
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
        b();
        c(true);
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.D = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.E = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.F = z10;
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.f4675w != characterStyle) {
            i80 i80Var = this.f4674s;
            i80Var.e();
            this.f4675w = characterStyle;
            p80 i9 = i80.i(getLayout(), characterStyle, getPaddingTop());
            if (i9 != null) {
                int v02 = f6.v0(f6.Ld, this.v);
                i9.f(f6.l1(0.8f, v02), f6.l1(1.3f, v02), f6.l1(1.0f, v02), f6.l1(4.0f, v02));
                i9.f31590w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                i80Var.b(i9, null);
            }
        }
    }

    public void setOnLinkLongPressListener(k80 k80Var) {
        this.f4677y = k80Var;
    }

    public void setOnLinkPressListener(k80 k80Var) {
        this.f4676x = k80Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.d = false;
        super.setText(charSequence, bufferType);
    }

    @Override
    public void setTextColor(int i9) {
        super.setTextColor(i9);
        this.B = new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN);
    }

    public void setUseAlphaForEmoji(boolean z10) {
        this.f4673r = z10;
    }

    public u(Context context, b6 b6Var, boolean z10) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.f4668b = arrayList;
        this.f4669c = new Stack();
        this.f4670e = new Path();
        this.f4671f = true;
        this.h = 0;
        this.f4673r = true;
        this.C = true;
        this.G = null;
        this.f4674s = new i80(this);
        this.v = b6Var;
        this.f4667a = new r(this, arrayList, new s(0, this, z10));
    }

    public void setClearLinkOnLongPress(boolean z10) {
    }
}
