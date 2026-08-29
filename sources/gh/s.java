package gh;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.z80;
public class s extends TextView implements t9 {
    public static Field K;
    public static Class L;
    public static Method M;
    public z80 A;
    public PorterDuffColorFilter B;
    public final boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public Layout G;
    public int H;
    public boolean I;
    public Object J;
    public final p f7455a;
    public final ArrayList f7456b;
    public final Stack f7457c;
    public boolean d;
    public final Path f7458e;
    public boolean f7459f;
    public int h;
    public u5 f7460n;
    public boolean f7461r;
    public final v80 f7462s;
    public final c6 v;
    public CharacterStyle f7463w;
    public x80 f7464x;
    public x80 f7465y;

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
        float f9 = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f9);
        float lineLeft = layout.getLineLeft(lineForVertical);
        if (lineLeft <= f9 && layout.getLineWidth(lineForVertical) + lineLeft >= f9 && paddingTop >= 0 && paddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    public final void b() {
        int i10;
        ArrayList arrayList = this.f7456b;
        if (arrayList == null) {
            return;
        }
        Stack stack = this.f7457c;
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

    public final void c(boolean z10) {
        int i10;
        if (getLayout() != null && getLayout().getText() != null) {
            i10 = getLayout().getText().length();
        } else {
            i10 = 0;
        }
        if (!z10 && this.G == getLayout() && this.H == i10) {
            return;
        }
        this.f7460n = y5.update(this.h, this, this.f7460n, getLayout());
        this.G = getLayout();
        this.H = i10;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        float paddingTop;
        v80 v80Var = this.f7462s;
        if (v80Var != null) {
            Layout layout = getLayout();
            ClickableSpan a2 = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a2 != null && motionEvent.getAction() == 0) {
                z80 z80Var = new z80(a2, this.v, motionEvent.getX(), motionEvent.getY(), 0);
                z80Var.d(g6.v0(g6.Ld, this.v));
                this.A = z80Var;
                v80Var.a(z80Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.A.f35285i);
                int spanEnd = spannableString.getSpanEnd(this.A.f35285i);
                s80 b10 = this.A.b();
                if (this.C) {
                    paddingTop = 0.0f;
                } else {
                    paddingTop = getPaddingTop();
                }
                b10.d(layout, spanStart, paddingTop);
                layout.getSelectionPath(spanStart, spanEnd, b10);
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(this, z80Var, a2, 11), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                v80Var.d(true);
                z80 z80Var2 = this.A;
                if (z80Var2 != null && (characterStyle = z80Var2.f35285i) == a2) {
                    x80 x80Var = this.f7464x;
                    if (x80Var != null) {
                        x80Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.A = null;
                    return true;
                }
                this.A = null;
            }
            if (motionEvent.getAction() == 3) {
                v80Var.d(true);
                this.A = null;
            }
        }
        if (this.A != null || (this.f7459f && ((GestureDetector) this.f7455a.f7447a.f19159b).onTouchEvent(motionEvent))) {
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
            } catch (Throwable th2) {
                FileLog.e(th2);
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
        float f9;
        float f10;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        canvas.save();
        if (!this.D) {
            if (this.E) {
                f9 = 0.0f;
            } else {
                f9 = paddingLeft;
            }
            if (this.F) {
                f10 = 0.0f;
            } else {
                f10 = paddingTop;
            }
            canvas.translate(f9, f10);
        }
        v80 v80Var = this.f7462s;
        if (v80Var != null && v80Var.f(canvas)) {
            invalidate();
        }
        canvas.restore();
        ArrayList arrayList2 = this.f7456b;
        boolean isEmpty = arrayList2.isEmpty();
        boolean z10 = true;
        Path path = this.f7458e;
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
            Emoji.emojiDrawingUseAlpha = this.f7461r;
            super.onDraw(canvas);
            Emoji.emojiDrawingUseAlpha = true;
            canvas.restore();
            k kVar = (k) arrayList2.get(0);
            if (kVar.f7413m > 0.0f && kVar.f7414n > 0.0f) {
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
        if (this.f7460n != null) {
            canvas.save();
            canvas.translate(paddingLeft, paddingTop);
            y5.drawAnimatedEmojis(canvas, getLayout(), this.f7460n, 0.0f, arrayList2, 0.0f, getHeight(), 0.0f, 1.0f, this.B);
            arrayList = arrayList2;
            canvas.restore();
        } else {
            arrayList = arrayList2;
        }
        if (!arrayList.isEmpty()) {
            if (((k) arrayList.get(0)).f7414n == -1.0f) {
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
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList.get(i11);
                i11++;
                k kVar2 = (k) obj2;
                kVar2.h(getPaint().getColor());
                kVar2.draw(canvas2);
            }
            if (z10) {
                path.rewind();
                ((k) arrayList.get(0)).e(path);
                canvas2.drawPath(path, g6.Il);
            }
            canvas2.restore();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
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
        if (this.f7463w != characterStyle) {
            v80 v80Var = this.f7462s;
            v80Var.e();
            this.f7463w = characterStyle;
            c90 i10 = v80.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int v02 = g6.v0(g6.Ld, this.v);
                i10.f(g6.l1(0.8f, v02), g6.l1(1.3f, v02), g6.l1(1.0f, v02), g6.l1(4.0f, v02));
                i10.f27399w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                v80Var.b(i10, null);
            }
        }
    }

    public void setOnLinkLongPressListener(x80 x80Var) {
        this.f7465y = x80Var;
    }

    public void setOnLinkPressListener(x80 x80Var) {
        this.f7464x = x80Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.d = false;
        super.setText(charSequence, bufferType);
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.B = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setUseAlphaForEmoji(boolean z10) {
        this.f7461r = z10;
    }

    public s(Context context, c6 c6Var, boolean z10) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.f7456b = arrayList;
        this.f7457c = new Stack();
        this.f7458e = new Path();
        this.f7459f = true;
        this.h = 0;
        this.f7461r = true;
        this.C = true;
        this.G = null;
        this.f7462s = new v80(this);
        this.v = c6Var;
        this.f7455a = new p(this, arrayList, new q(0, this, z10));
    }

    public void setClearLinkOnLongPress(boolean z10) {
    }
}
