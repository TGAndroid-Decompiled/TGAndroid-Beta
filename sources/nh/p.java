package nh;

import ag.w0;
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
import li.s;
import m2.t;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.t80;
public class p extends TextView implements s9 {
    public static Field R;
    public static Class S;
    public static Method T;
    public final p6 D;
    public CharacterStyle E;
    public o80 F;
    public o80 G;
    public q80 H;
    public PorterDuffColorFilter I;
    public final boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public Layout N;
    public int O;
    public boolean P;
    public Object Q;
    public final n f13887a;
    public final ArrayList f13888b;
    public final Stack f13889c;
    public boolean d;
    public boolean e;
    public boolean f13890f;
    public int h;
    public final Path f13891n;
    public boolean f13892r;
    public int f13893s;
    public k5 f13894w;
    public boolean f13895x;
    public final ji.a f13896y;

    public p(Context context) {
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
        float f7 = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f7);
        float lineLeft = layout.getLineLeft(lineForVertical);
        if (lineLeft <= f7 && layout.getLineWidth(lineForVertical) + lineLeft >= f7 && paddingTop >= 0 && paddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !i0.C1()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    public final void b() {
        ArrayList arrayList = this.f13888b;
        if (arrayList == null) {
            return;
        }
        Stack stack = this.f13889c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (this.d) {
            invalidate();
            return;
        }
        if (getLayout() != null && (getText() instanceof Spanned)) {
            int i10 = i.A;
            int measuredWidth = getMeasuredWidth();
            Layout layout = getLayout();
            if (measuredWidth <= 0) {
                measuredWidth = -2;
            }
            i.a(this, layout, 0, measuredWidth, (Spanned) getText(), stack, arrayList, null);
        }
        invalidate();
    }

    public final void c(float f7, float f10) {
        this.e = false;
        ArrayList arrayList = this.f13888b;
        if (arrayList.isEmpty()) {
            this.d = true;
            b();
            return;
        }
        this.f13890f = true;
        int i10 = this.h + 1;
        this.h = i10;
        ((i) arrayList.get(0)).f13852q = new o(this, i10, 0);
        float hypot = (float) Math.hypot(getWidth(), getHeight());
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((i) obj).j(f7, f10, hypot, false);
        }
    }

    public final void d(boolean z10) {
        int i10;
        if (getLayout() != null && getLayout().getText() != null) {
            i10 = getLayout().getText().length();
        } else {
            i10 = 0;
        }
        if (!z10 && this.N == getLayout() && this.O == i10) {
            return;
        }
        this.f13894w = o5.update(this.f13893s, this, this.f13894w, getLayout());
        this.N = getLayout();
        this.O = i10;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        float paddingTop;
        ji.a aVar = this.f13896y;
        if (aVar != null) {
            Layout layout = getLayout();
            ClickableSpan a2 = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a2 != null && motionEvent.getAction() == 0) {
                q80 q80Var = new q80(a2, this.D, motionEvent.getX(), motionEvent.getY(), 0);
                q80Var.d(t6.w0(t6.f21336ze, this.D));
                this.H = q80Var;
                aVar.b(q80Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.H.f29568i);
                int spanEnd = spannableString.getSpanEnd(this.H.f29568i);
                k80 b10 = this.H.b();
                if (this.J) {
                    paddingTop = 0.0f;
                } else {
                    paddingTop = getPaddingTop();
                }
                b10.d(layout, spanStart, paddingTop);
                layout.getSelectionPath(spanStart, spanEnd, b10);
                i0.h3(new s(this, q80Var, a2, 11), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                aVar.f(true);
                q80 q80Var2 = this.H;
                if (q80Var2 != null && (characterStyle = q80Var2.f29568i) == a2) {
                    o80 o80Var = this.F;
                    if (o80Var != null) {
                        o80Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.H = null;
                    return true;
                }
                this.H = null;
            }
            if (motionEvent.getAction() == 3) {
                aVar.f(true);
                this.H = null;
            }
        }
        if (this.H != null || (this.f13892r && ((GestureDetector) ((t) this.f13887a.d).f12684b).onTouchEvent(motionEvent))) {
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
        if (!this.P) {
            this.P = true;
            try {
                if (S == null) {
                    Field declaredField = TextView.class.getDeclaredField("mEditor");
                    R = declaredField;
                    declaredField.setAccessible(true);
                    Class<?> cls = Class.forName("android.widget.Editor");
                    S = cls;
                    try {
                        Method declaredMethod = cls.getDeclaredMethod("invalidateTextDisplayList", null);
                        T = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                f8.g(th2, true);
            }
        }
        super.invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (T != null) {
                    if (this.Q == null) {
                        this.Q = R.get(this);
                    }
                    Object obj = this.Q;
                    if (obj != null) {
                        T.invoke(obj, null);
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d(true);
    }

    @Override
    public void onDraw(Canvas canvas) {
        ArrayList arrayList;
        Canvas canvas2;
        float f7;
        float f10;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        canvas.save();
        if (!this.K) {
            if (this.L) {
                f7 = 0.0f;
            } else {
                f7 = paddingLeft;
            }
            if (this.M) {
                f10 = 0.0f;
            } else {
                f10 = paddingTop;
            }
            canvas.translate(f7, f10);
        }
        ji.a aVar = this.f13896y;
        if (aVar != null && aVar.h(canvas)) {
            invalidate();
        }
        canvas.restore();
        ArrayList arrayList2 = this.f13888b;
        boolean isEmpty = arrayList2.isEmpty();
        boolean z10 = true;
        Path path = this.f13891n;
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
                Rect bounds = ((i) obj).getBounds();
                path.addRect(bounds.left + paddingLeft, bounds.top + paddingTop, bounds.right + paddingLeft, bounds.bottom + paddingTop, Path.Direction.CW);
            }
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            k6.f16540n = this.f13895x;
            super.onDraw(canvas);
            k6.f16540n = true;
            canvas.restore();
            i iVar = (i) arrayList2.get(0);
            if (iVar.f13848m > 0.0f && iVar.f13849n > 0.0f) {
                canvas.save();
                canvas.clipPath(path);
                path.rewind();
                ((i) arrayList2.get(0)).e(path);
                canvas.clipPath(path);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        d(false);
        if (this.f13894w != null) {
            canvas.save();
            canvas.translate(paddingLeft, paddingTop);
            o5.drawAnimatedEmojis(canvas, getLayout(), this.f13894w, 0.0f, arrayList2, 0.0f, getHeight(), 0.0f, 1.0f, this.I);
            arrayList = arrayList2;
            canvas.restore();
        } else {
            arrayList = arrayList2;
        }
        if (!arrayList.isEmpty()) {
            if (((i) arrayList.get(0)).f13849n == -1.0f) {
                z10 = false;
            }
            if (z10) {
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), null, 31);
            } else {
                canvas2 = canvas;
                canvas2.save();
            }
            canvas2.translate(paddingLeft, i0.L(2.0f) + paddingTop);
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList.get(i11);
                i11++;
                i iVar2 = (i) obj2;
                iVar2.h(getPaint().getColor());
                iVar2.draw(canvas2);
            }
            if (z10) {
                path.rewind();
                ((i) arrayList.get(0)).e(path);
                canvas2.drawPath(path, t6.Cm);
            }
            canvas2.restore();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b();
        if (this.e) {
            c((getWidth() / 2.0f) - getPaddingLeft(), ((getHeight() / 2.0f) - getPaddingTop()) + getScrollY());
        }
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
        d(true);
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.K = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.L = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.M = z10;
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.E != characterStyle) {
            ji.a aVar = this.f13896y;
            aVar.g();
            this.E = characterStyle;
            t80 k10 = ji.a.k(getLayout(), characterStyle, getPaddingTop());
            if (k10 != null) {
                int w02 = t6.w0(t6.f21336ze, this.D);
                k10.g(t6.r1(0.8f, w02), t6.r1(1.3f, w02), t6.r1(1.0f, w02), t6.r1(4.0f, w02));
                k10.f30520x.setStrokeWidth(i0.N(1.25f));
                aVar.c(k10, null);
            }
        }
    }

    public void setOnLinkLongPressListener(o80 o80Var) {
        this.G = o80Var;
    }

    public void setOnLinkPressListener(o80 o80Var) {
        this.F = o80Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.h++;
        this.e = false;
        this.f13890f = false;
        this.d = false;
        super.setText(charSequence, bufferType);
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.I = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setUseAlphaForEmoji(boolean z10) {
        this.f13895x = z10;
    }

    public p(Context context, p6 p6Var, boolean z10) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.f13888b = arrayList;
        this.f13889c = new Stack();
        this.f13891n = new Path();
        this.f13892r = true;
        this.f13893s = 0;
        this.f13895x = true;
        this.J = true;
        this.N = null;
        this.f13896y = new ji.a(this);
        this.D = p6Var;
        this.f13887a = new n(this, arrayList, new w0(4, this, z10));
    }

    public void setClearLinkOnLongPress(boolean z10) {
    }
}
