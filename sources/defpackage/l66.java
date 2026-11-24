package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class l66 extends TextView {
    public static Field J;
    public static Class K;
    public static Method L;
    public Object E;
    public boolean F;
    public boolean G;
    public PorterDuffColorFilter H;
    public int I;
    public final boolean a;
    public final i66 b;
    public final ylb c;
    public cn d;
    public m66 e;
    public k66 f;
    public k66 h;
    public boolean n;
    public boolean r;
    public boolean s;
    public CharacterStyle w;
    public int x;
    public boolean y;

    public l66(Context context, ylb ylbVar) {
        super(context);
        this.F = false;
        this.G = true;
        this.a = false;
        this.b = new i66(this);
        this.c = ylbVar;
    }

    public int a() {
        return 0;
    }

    public final ClickableSpan b(int i, int i2) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int textPaddingTop = i2 - getTextPaddingTop();
        int lineForVertical = layout.getLineForVertical(textPaddingTop);
        float paddingLeft = i - getPaddingLeft();
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, paddingLeft);
        float lineLeft = layout.getLineLeft(lineForVertical);
        if (lineLeft <= paddingLeft && layout.getLineWidth(lineForVertical) + lineLeft >= paddingLeft && textPaddingTop >= 0 && textPaddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !gm.A1()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    public int c() {
        return cmb.v0(cmb.Be, this.c);
    }

    public int getTextPaddingTop() {
        int paddingTop = getPaddingTop();
        if (getGravity() == 17 && getLayout() != null) {
            return Math.max(0, (((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2) + paddingTop;
        }
        return paddingTop;
    }

    @Override
    public final void invalidate() {
        if (!this.y) {
            this.y = true;
            try {
                if (K == null) {
                    Field declaredField = TextView.class.getDeclaredField("mEditor");
                    J = declaredField;
                    declaredField.setAccessible(true);
                    Class<?> cls = Class.forName("android.widget.Editor");
                    K = cls;
                    try {
                        Method declaredMethod = cls.getDeclaredMethod("invalidateTextDisplayList", null);
                        L = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                fc4.g(th, true);
            }
        }
        super.invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (L != null) {
                    Object obj = this.E;
                    if (obj == null) {
                        obj = J.get(this);
                        this.E = obj;
                    }
                    if (obj != null) {
                        L.invoke(obj, null);
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = gn.update(a(), this, this.d, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gn.release(this, this.d);
    }

    @Override
    public void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l66.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i, int i2) {
        int i3 = this.x;
        if (i3 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i)), View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
        this.d = gn.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        i66 i66Var = this.b;
        if (i66Var != null) {
            Layout layout = getLayout();
            ClickableSpan b = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b != null && motionEvent.getAction() == 0) {
                m66 m66Var = new m66(b, this.c, motionEvent.getX(), motionEvent.getY(), 0);
                m66Var.d(c());
                this.e = m66Var;
                i66Var.a(m66Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.e.i);
                int spanEnd = spannableString.getSpanEnd(this.e.i);
                b66 b2 = this.e.b();
                b2.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b2);
                gm.d3(new dt5(this, m66Var, b, (byte) 11), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                i66Var.e(true);
                m66 m66Var2 = this.e;
                if (m66Var2 != null && (characterStyle = m66Var2.i) == b) {
                    k66 k66Var = this.f;
                    if (k66Var != null) {
                        k66Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.e = null;
                    return true;
                }
                this.e = null;
            }
            if (motionEvent.getAction() == 3) {
                i66Var.e(true);
                this.e = null;
            }
        }
        if (this.e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z) {
        this.n = z;
    }

    public void setDisablePaddingsOffsetX(boolean z) {
        this.r = z;
    }

    public void setDisablePaddingsOffsetY(boolean z) {
        this.s = z;
    }

    public void setEmojiColor(int i) {
        this.G = false;
        this.H = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.w != characterStyle) {
            i66 i66Var = this.b;
            i66Var.f();
            this.w = characterStyle;
            qa6 j = i66.j(getLayout(), characterStyle, getPaddingTop());
            if (j != null) {
                int d = d(cmb.v0(cmb.Be, this.c));
                j.g(cmb.p1(0.8f, d), cmb.p1(1.3f, d), cmb.p1(1.0f, d), cmb.p1(4.0f, d));
                j.x.setStrokeWidth(gm.N(1.25f));
                i66Var.b(j, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i) {
        this.x = i;
    }

    public void setOnLinkLongPressListener(k66 k66Var) {
        this.h = k66Var;
    }

    public void setOnLinkPressListener(k66 k66Var) {
        this.f = k66Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = gn.update(a(), this, this.d, getLayout());
    }

    public l66(Context context) {
        this(context, null);
    }

    public l66(Context context, i66 i66Var, ylb ylbVar) {
        super(context);
        this.F = false;
        this.G = true;
        this.a = true;
        this.b = i66Var;
        this.c = ylbVar;
    }

    public int d(int i) {
        return i;
    }
}
