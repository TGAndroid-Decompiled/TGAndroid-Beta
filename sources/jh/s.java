package jh;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.z80;
public class s extends TextView implements v9 {
    public static Field L;
    public static Class M;
    public static Method N;
    public h90 B;
    public PorterDuffColorFilter C;
    public final boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public Layout H;
    public int I;
    public boolean J;
    public Object K;
    public final p f10185a;
    public final ArrayList f10186b;
    public final Stack f10187c;
    public boolean d;
    public final Path f10188e;
    public boolean f10189f;
    public int h;
    public q5 f10190n;
    public boolean f10191r;
    public final d90 f10192s;
    public final g6 v;
    public CharacterStyle f10193w;
    public f90 f10194x;
    public f90 f10195y;

    public s(Context context) {
        this(context, null, true);
    }

    public ClickableSpan a(int i10, int i11) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i10 - getPaddingLeft();
        int paddingTop = i11 - getPaddingTop();
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
        int i10;
        ArrayList arrayList = this.f10186b;
        if (arrayList == null) {
            return;
        }
        Stack stack = this.f10187c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (this.d) {
            invalidate();
            return;
        }
        if (getLayout() != null && (getText() instanceof Spanned)) {
            int i11 = k.A;
            int measuredWidth = getMeasuredWidth();
            Layout layout = getLayout();
            if (measuredWidth > 0) {
                i10 = measuredWidth;
            } else {
                i10 = -2;
            }
            k.a(this, layout, 0, i10, (Spanned) getText(), stack, arrayList, null);
        }
        invalidate();
    }

    public final void c(boolean z4) {
        int i10;
        if (getLayout() != null && getLayout().getText() != null) {
            i10 = getLayout().getText().length();
        } else {
            i10 = 0;
        }
        if (!z4 && this.H == getLayout() && this.I == i10) {
            return;
        }
        this.f10190n = u5.update(this.h, this, this.f10190n, getLayout());
        this.H = getLayout();
        this.I = i10;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        float paddingTop;
        d90 d90Var = this.f10192s;
        if (d90Var != null) {
            Layout layout = getLayout();
            ClickableSpan a2 = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a2 != null && motionEvent.getAction() == 0) {
                h90 h90Var = new h90(a2, this.v, motionEvent.getX(), motionEvent.getY(), 0);
                h90Var.d(k6.v0(k6.Ld, this.v));
                this.B = h90Var;
                d90Var.a(h90Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.B.f27417i);
                int spanEnd = spannableString.getSpanEnd(this.B.f27417i);
                z80 b10 = this.B.b();
                if (this.D) {
                    paddingTop = 0.0f;
                } else {
                    paddingTop = getPaddingTop();
                }
                b10.d(layout, spanStart, paddingTop);
                layout.getSelectionPath(spanStart, spanEnd, b10);
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(this, h90Var, a2, 13), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                d90Var.d(true);
                h90 h90Var2 = this.B;
                if (h90Var2 != null && (characterStyle = h90Var2.f27417i) == a2) {
                    f90 f90Var = this.f10194x;
                    if (f90Var != null) {
                        f90Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.B = null;
                    return true;
                }
                this.B = null;
            }
            if (motionEvent.getAction() == 3) {
                d90Var.d(true);
                this.B = null;
            }
        }
        if (this.B != null || (this.f10189f && ((GestureDetector) this.f10185a.f10177a.f22788b).onTouchEvent(motionEvent))) {
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
        if (!this.J) {
            this.J = true;
            try {
                if (M == null) {
                    Field declaredField = TextView.class.getDeclaredField("mEditor");
                    L = declaredField;
                    declaredField.setAccessible(true);
                    Class<?> cls = Class.forName("android.widget.Editor");
                    M = cls;
                    try {
                        Method declaredMethod = cls.getDeclaredMethod("invalidateTextDisplayList", null);
                        N = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        super.invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (N != null) {
                    if (this.K == null) {
                        this.K = L.get(this);
                    }
                    Object obj = this.K;
                    if (obj != null) {
                        N.invoke(obj, null);
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
        if (!this.E) {
            if (this.F) {
                f10 = 0.0f;
            } else {
                f10 = paddingLeft;
            }
            if (this.G) {
                f11 = 0.0f;
            } else {
                f11 = paddingTop;
            }
            canvas.translate(f10, f11);
        }
        d90 d90Var = this.f10192s;
        if (d90Var != null && d90Var.f(canvas)) {
            invalidate();
        }
        canvas.restore();
        ArrayList arrayList2 = this.f10186b;
        boolean isEmpty = arrayList2.isEmpty();
        boolean z4 = true;
        Path path = this.f10188e;
        if (isEmpty) {
            super.onDraw(canvas);
        } else {
            canvas.save();
            path.rewind();
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                Rect bounds = ((k) obj).getBounds();
                path.addRect(bounds.left + paddingLeft, bounds.top + paddingTop, bounds.right + paddingLeft, bounds.bottom + paddingTop, Path.Direction.CW);
            }
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            Emoji.emojiDrawingUseAlpha = this.f10191r;
            super.onDraw(canvas);
            Emoji.emojiDrawingUseAlpha = true;
            canvas.restore();
            k kVar = (k) arrayList2.get(0);
            if (kVar.f10143m > 0.0f && kVar.f10144n > 0.0f) {
                canvas.save();
                canvas.clipPath(path);
                path.rewind();
                ((k) arrayList2.get(0)).e(path);
                canvas.clipPath(path);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        c(false);
        if (this.f10190n != null) {
            canvas.save();
            canvas.translate(paddingLeft, paddingTop);
            u5.drawAnimatedEmojis(canvas, getLayout(), this.f10190n, 0.0f, arrayList2, 0.0f, getHeight(), 0.0f, 1.0f, this.C);
            arrayList = arrayList2;
            canvas.restore();
        } else {
            arrayList = arrayList2;
        }
        if (!arrayList.isEmpty()) {
            if (((k) arrayList.get(0)).f10144n == -1.0f) {
                z4 = false;
            }
            if (z4) {
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), null, 31);
            } else {
                canvas2 = canvas;
                canvas2.save();
            }
            canvas2.translate(paddingLeft, AndroidUtilities.dp(2.0f) + paddingTop);
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList.get(i11);
                i11++;
                k kVar2 = (k) obj2;
                kVar2.h(getPaint().getColor());
                kVar2.draw(canvas2);
            }
            if (z4) {
                path.rewind();
                ((k) arrayList.get(0)).e(path);
                canvas2.drawPath(path, k6.Il);
            }
            canvas2.restore();
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        b();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b();
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        b();
        c(true);
    }

    public void setDisablePaddingsOffset(boolean z4) {
        this.E = z4;
    }

    public void setDisablePaddingsOffsetX(boolean z4) {
        this.F = z4;
    }

    public void setDisablePaddingsOffsetY(boolean z4) {
        this.G = z4;
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.f10193w != characterStyle) {
            d90 d90Var = this.f10192s;
            d90Var.e();
            this.f10193w = characterStyle;
            k90 i10 = d90.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int v02 = k6.v0(k6.Ld, this.v);
                i10.f(k6.l1(0.8f, v02), k6.l1(1.3f, v02), k6.l1(1.0f, v02), k6.l1(4.0f, v02));
                i10.f28347w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                d90Var.b(i10, null);
            }
        }
    }

    public void setOnLinkLongPressListener(f90 f90Var) {
        this.f10195y = f90Var;
    }

    public void setOnLinkPressListener(f90 f90Var) {
        this.f10194x = f90Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.d = false;
        super.setText(charSequence, bufferType);
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.C = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setUseAlphaForEmoji(boolean z4) {
        this.f10191r = z4;
    }

    public s(Context context, g6 g6Var, boolean z4) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.f10186b = arrayList;
        this.f10187c = new Stack();
        this.f10188e = new Path();
        this.f10189f = true;
        this.h = 0;
        this.f10191r = true;
        this.D = true;
        this.H = null;
        this.f10192s = new d90(this);
        this.v = g6Var;
        this.f10185a = new p(this, arrayList, new q(0, this, z4));
    }

    public void setClearLinkOnLongPress(boolean z4) {
    }
}
