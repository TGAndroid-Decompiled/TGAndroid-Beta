package defpackage;

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
public class tpa extends TextView implements imb {
    public static Field S;
    public static Class T;
    public static Method U;
    public final vnb E;
    public CharacterStyle F;
    public o66 G;
    public o66 H;
    public q66 I;
    public PorterDuffColorFilter J;
    public final boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public Layout O;
    public int P;
    public boolean Q;
    public Object R;
    public final nk0 a;
    public final ArrayList b;
    public final Stack c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int h;
    public final Path n;
    public boolean r;
    public byte s;
    public dm w;
    public boolean x;
    public final m66 y;

    public tpa(vnb vnbVar, Context context, boolean z) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = new Stack();
        this.n = new Path();
        this.r = true;
        this.s = (byte) 0;
        this.x = true;
        this.K = true;
        this.O = null;
        this.y = new m66(this);
        this.E = vnbVar;
        this.a = new nk0(this, arrayList, new t41((byte) 14, this, z));
    }

    public ClickableSpan a(int i, int i2) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingTop = i2 - getPaddingTop();
        int lineForVertical = layout.getLineForVertical(paddingTop);
        float paddingLeft = i - getPaddingLeft();
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, paddingLeft);
        float lineLeft = layout.getLineLeft(lineForVertical);
        if (lineLeft <= paddingLeft && layout.getLineWidth(lineForVertical) + lineLeft >= paddingLeft && paddingTop >= 0 && paddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !hl.A1()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    public final void b() {
        tpa tpaVar;
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            return;
        }
        Stack stack = this.c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (this.d) {
            invalidate();
            return;
        }
        if (getLayout() != null && (getText() instanceof Spanned)) {
            short s = npa.A;
            int measuredWidth = getMeasuredWidth();
            Layout layout = getLayout();
            if (measuredWidth <= 0) {
                measuredWidth = -2;
            }
            int i = measuredWidth;
            tpaVar = this;
            npa.a(tpaVar, layout, 0, i, (Spanned) getText(), stack, arrayList, null);
        } else {
            tpaVar = this;
        }
        tpaVar.invalidate();
    }

    public final void c(float f, float f2) {
        this.e = false;
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            this.d = true;
            b();
            return;
        }
        this.f = true;
        int i = this.h + 1;
        this.h = i;
        ((npa) arrayList.get(0)).q = new spa(this, i, (byte) 0);
        float hypot = (float) Math.hypot(getWidth(), getHeight());
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((npa) obj).j(f, f2, hypot, false);
        }
    }

    public final void d(boolean z) {
        int i;
        if (getLayout() != null && getLayout().getText() != null) {
            i = getLayout().getText().length();
        } else {
            i = 0;
        }
        if (!z && this.O == getLayout() && this.P == i) {
            return;
        }
        this.w = hm.update(this.s, this, this.w, getLayout());
        this.O = getLayout();
        this.P = i;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        float paddingTop;
        m66 m66Var = this.y;
        if (m66Var != null) {
            Layout layout = getLayout();
            ClickableSpan a = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a != null && motionEvent.getAction() == 0) {
                q66 q66Var = new q66(a, this.E, motionEvent.getX(), motionEvent.getY(), 0);
                q66Var.d(aob.v0(aob.Ce, this.E));
                this.I = q66Var;
                m66Var.a(q66Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.I.i);
                int spanEnd = spannableString.getSpanEnd(this.I.i);
                f66 b = this.I.b();
                if (this.K) {
                    paddingTop = 0.0f;
                } else {
                    paddingTop = getPaddingTop();
                }
                b.d(layout, spanStart, paddingTop);
                layout.getSelectionPath(spanStart, spanEnd, b);
                hl.d3(new jr9(this, q66Var, a, (byte) 19), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                m66Var.e(true);
                q66 q66Var2 = this.I;
                if (q66Var2 != null && (characterStyle = q66Var2.i) == a) {
                    o66 o66Var = this.G;
                    if (o66Var != null) {
                        o66Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.I = null;
                    return true;
                }
                this.I = null;
            }
            if (motionEvent.getAction() == 3) {
                m66Var.e(true);
                this.I = null;
            }
        }
        if (this.I != null || (this.r && ((GestureDetector) ((kj4) this.a.d).b).onTouchEvent(motionEvent))) {
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
        if (!this.Q) {
            this.Q = true;
            try {
                if (T == null) {
                    Field declaredField = TextView.class.getDeclaredField("mEditor");
                    S = declaredField;
                    declaredField.setAccessible(true);
                    Class<?> cls = Class.forName("android.widget.Editor");
                    T = cls;
                    try {
                        Method declaredMethod = cls.getDeclaredMethod("invalidateTextDisplayList", null);
                        U = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }
        super.invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (U != null) {
                    Object obj = this.R;
                    if (obj == null) {
                        obj = S.get(this);
                        this.R = obj;
                    }
                    if (obj != null) {
                        U.invoke(obj, null);
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
        float f;
        float f2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        canvas.save();
        if (!this.L) {
            if (this.M) {
                f = 0.0f;
            } else {
                f = paddingLeft;
            }
            if (this.N) {
                f2 = 0.0f;
            } else {
                f2 = paddingTop;
            }
            canvas.translate(f, f2);
        }
        m66 m66Var = this.y;
        if (m66Var != null && m66Var.g(canvas)) {
            invalidate();
        }
        canvas.restore();
        ArrayList arrayList2 = this.b;
        boolean isEmpty = arrayList2.isEmpty();
        boolean z = true;
        Path path = this.n;
        if (isEmpty) {
            super.onDraw(canvas);
        } else {
            canvas.save();
            path.rewind();
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                Rect bounds = ((npa) obj).getBounds();
                path.addRect(bounds.left + paddingLeft, bounds.top + paddingTop, bounds.right + paddingLeft, bounds.bottom + paddingTop, Path.Direction.CW);
            }
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            pv3.n = this.x;
            super.onDraw(canvas);
            pv3.n = true;
            canvas.restore();
            npa npaVar = (npa) arrayList2.get(0);
            if (npaVar.m > 0.0f && npaVar.n > 0.0f) {
                canvas.save();
                canvas.clipPath(path);
                path.rewind();
                ((npa) arrayList2.get(0)).e(path);
                canvas.clipPath(path);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        d(false);
        if (this.w != null) {
            canvas.save();
            canvas.translate(paddingLeft, paddingTop);
            hm.drawAnimatedEmojis(canvas, getLayout(), this.w, 0.0f, arrayList2, 0.0f, getHeight(), 0.0f, 1.0f, this.J);
            arrayList = arrayList2;
            canvas.restore();
        } else {
            arrayList = arrayList2;
        }
        if (!arrayList.isEmpty()) {
            if (((npa) arrayList.get(0)).n == -1.0f) {
                z = false;
            }
            if (z) {
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), null, 31);
            } else {
                canvas2 = canvas;
                canvas2.save();
            }
            canvas2.translate(paddingLeft, hl.L(2.0f) + paddingTop);
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                npa npaVar2 = (npa) obj2;
                npaVar2.h(getPaint().getColor());
                npaVar2.draw(canvas2);
            }
            if (z) {
                path.rewind();
                ((npa) arrayList.get(0)).e(path);
                canvas2.drawPath(path, aob.Gm);
            }
            canvas2.restore();
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        b();
        if (this.e) {
            c((getWidth() / 2.0f) - getPaddingLeft(), ((getHeight() / 2.0f) - getPaddingTop()) + getScrollY());
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b();
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        b();
        d(true);
    }

    public void setDisablePaddingsOffset(boolean z) {
        this.L = z;
    }

    public void setDisablePaddingsOffsetX(boolean z) {
        this.M = z;
    }

    public void setDisablePaddingsOffsetY(boolean z) {
        this.N = z;
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.F != characterStyle) {
            m66 m66Var = this.y;
            m66Var.f();
            this.F = characterStyle;
            va6 j = m66.j(getLayout(), characterStyle, getPaddingTop());
            if (j != null) {
                int v0 = aob.v0(aob.Ce, this.E);
                j.g(aob.p1(0.8f, v0), aob.p1(1.3f, v0), aob.p1(1.0f, v0), aob.p1(4.0f, v0));
                j.x.setStrokeWidth(hl.N(1.25f));
                m66Var.b(j, null);
            }
        }
    }

    public void setOnLinkLongPressListener(o66 o66Var) {
        this.H = o66Var;
    }

    public void setOnLinkPressListener(o66 o66Var) {
        this.G = o66Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.h++;
        this.e = false;
        this.f = false;
        this.d = false;
        super.setText(charSequence, bufferType);
    }

    @Override
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.J = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public void setUseAlphaForEmoji(boolean z) {
        this.x = z;
    }

    public void setClearLinkOnLongPress(boolean z) {
    }

    public tpa(Context context) {
        this(null, context, true);
    }
}
