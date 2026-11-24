package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Editable;
import android.text.InputFilter;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.d;
public class cv3 extends FrameLayout implements jm7, dla {
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;
    public final boolean J;
    public boolean K;
    public gb L;
    public final int M;
    public final ylb N;
    public boolean O;
    public boolean P;
    public final o1 Q;
    public boolean R;
    public float S;
    public boolean T;
    public boolean U;
    public int V;
    public final wu3 a;
    public final c51 b;
    public final n99 c;
    public xu3 d;
    public boolean e;
    public ela f;
    public final d h;
    public boolean n;
    public int r;
    public int s;
    public boolean w;
    public int x;
    public boolean y;

    public cv3(Context context, ela elaVar, d dVar, int i, boolean z, ylb ylbVar) {
        super(context);
        int i2;
        int i3;
        int i4;
        int L;
        float f;
        float f2;
        this.F = true;
        this.Q = new o1(this, (byte) 28);
        this.V = 2;
        this.J = z;
        this.N = ylbVar;
        this.M = i;
        this.h = dVar;
        this.f = elaVar;
        elaVar.r.add(this);
        wu3 wu3Var = new wu3(this, context, ylbVar, i);
        this.a = wu3Var;
        wu3Var.setImeOptions(268435456);
        wu3Var.setInputType(wu3Var.getInputType() | 16384);
        wu3Var.setFocusable(wu3Var.isEnabled());
        wu3Var.setCursorSize(gm.L(20.0f));
        wu3Var.setCursorWidth(1.5f);
        int i5 = cmb.F6;
        anb.l(wu3Var, 30, i5, ylbVar);
        if (i == 0) {
            wu3Var.setTextSize(1, 18.0f);
            wu3Var.setMaxLines(4);
            if (jb6.a0) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            wu3Var.setGravity(i3 | 16);
            wu3Var.setBackground(null);
            anb.F(wu3Var, cmb.j6, cmb.k6, cmb.o7, ylbVar);
            anb.D(wu3Var, cmb.G6, ylbVar);
            anb.X(wu3Var, i5, ylbVar);
            anb.l(wu3Var, 36, cmb.lg, ylbVar);
            if (jb6.a0) {
                i4 = gm.L(40.0f);
            } else {
                i4 = 0;
            }
            if (jb6.a0) {
                L = 0;
            } else {
                L = gm.L(40.0f);
            }
            wu3Var.setPadding(i4, 0, L, gm.L(11.0f));
            boolean z2 = jb6.a0;
            if (z2) {
                f = 11.0f;
            } else {
                f = 0.0f;
            }
            if (z2) {
                f2 = 0.0f;
            } else {
                f2 = 11.0f;
            }
            addView(wu3Var, qoe.d(-1, -2.0f, 19, f, 1.0f, f2, 0.0f));
        } else if (i != 2 && i != 3) {
            if (i == 4) {
                wu3Var.setTextSize(1, 18.0f);
                wu3Var.setMaxLines(4);
                wu3Var.setGravity(19);
                anb.D(wu3Var, cmb.s5, ylbVar);
                anb.X(wu3Var, cmb.i5, ylbVar);
                wu3Var.setBackground(null);
                wu3Var.setPadding(0, gm.L(11.0f), 0, gm.L(12.0f));
                addView(wu3Var, qoe.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
            } else {
                wu3Var.setTextSize(1, 18.0f);
                wu3Var.setMaxLines(4);
                wu3Var.setGravity(19);
                anb.D(wu3Var, cmb.s5, ylbVar);
                anb.X(wu3Var, cmb.i5, ylbVar);
                wu3Var.setBackground(null);
                wu3Var.setPadding(0, gm.L(11.0f), 0, gm.L(12.0f));
                addView(wu3Var, qoe.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
            }
        } else {
            wu3Var.setTextSize(1, 16.0f);
            wu3Var.setMaxLines(8);
            wu3Var.setGravity(19);
            wu3Var.setAllowTextEntitiesIntersection(true);
            wu3Var.setHintTextColor(-1929379841);
            wu3Var.setTextColor(-1);
            wu3Var.setCursorColor(-1);
            wu3Var.setBackground(null);
            wu3Var.setClipToPadding(false);
            wu3Var.setPadding(0, gm.L(9.0f), 0, gm.L(9.0f));
            wu3Var.setHandlesColor(-1);
            wu3Var.setHighlightColor(822083583);
            wu3Var.setLinkTextColor(-12147733);
            wu3Var.E = -1;
            wu3Var.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(wu3Var, qoe.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        }
        c51 c51Var = new c51(this, context);
        this.b = c51Var;
        c51Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        n99 n99Var = new n99(context);
        this.c = n99Var;
        c51Var.setImageDrawable(n99Var);
        if (i == 0) {
            anb.x(this, n99Var, cmb.Ne, ylbVar, PorterDuff.Mode.MULTIPLY);
            n99Var.a(2131232760, false);
            if (jb6.a0) {
                i2 = 3;
            } else {
                i2 = 5;
            }
            addView(c51Var, qoe.d(48, 48.0f, i2 | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i != 2 && i != 3) {
            if (i == 4) {
                anb.x(this, n99Var, cmb.Ne, ylbVar, PorterDuff.Mode.MULTIPLY);
                n99Var.a(2131231517, false);
                addView(c51Var, qoe.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
            } else if (i == 5) {
                anb.x(this, n99Var, cmb.e7, ylbVar, PorterDuff.Mode.MULTIPLY);
                n99Var.a(2131231517, false);
                addView(c51Var, qoe.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            } else {
                anb.x(this, n99Var, cmb.Ne, ylbVar, PorterDuff.Mode.MULTIPLY);
                n99Var.a(2131231517, false);
                addView(c51Var, qoe.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            }
        } else {
            n99Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            n99Var.a(2131231517, false);
            addView(c51Var, qoe.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i6 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.v0(i6, ylbVar), 1, -1);
        wmb M = anb.M(i6);
        c51Var.setBackground(f0);
        anb.j(c51Var, f0, null, M, ylbVar);
        c51Var.setOnClickListener(new b0(this, elaVar, ylbVar, (byte) 28));
        c51Var.setContentDescription(jb6.M0(2131751133, null));
    }

    @Override
    public final void L(int i, boolean z) {
        boolean z2;
        int i2;
        int i3;
        int i4;
        if (i > gm.L(50.0f) && ((this.w || (i4 = this.M) == 2 || i4 == 3) && !gm.E && !gm.O1())) {
            if (z) {
                this.s = i;
                oc7.c1().edit().putInt("kbd_height_land3", this.s).commit();
            } else {
                this.r = i;
                oc7.c1().edit().putInt("kbd_height", this.r).commit();
            }
        }
        boolean z3 = false;
        if (this.e) {
            if (z) {
                i2 = this.s;
            } else {
                i2 = this.r;
            }
            if (this.K) {
                i3 = gm.n;
            } else {
                i3 = 0;
            }
            int i5 = i2 + i3;
            if (this.y) {
                i5 = Math.min(gm.L(200.0f) + i5, gm.q.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i6 = layoutParams.width;
            int i7 = gm.q.x;
            if (i6 != i7 || layoutParams.height != i5) {
                layoutParams.width = i7;
                layoutParams.height = i5;
                this.d.setLayoutParams(layoutParams);
                ela elaVar = this.f;
                if (elaVar != null) {
                    this.x = layoutParams.height;
                    elaVar.requestLayout();
                    this.f.getHeight();
                    if (this.U != this.y) {
                        p();
                    }
                }
            }
        }
        this.U = this.y;
        int i8 = this.H;
        boolean z4 = true;
        wu3 wu3Var = this.a;
        if (i8 == i && this.I == z) {
            if (b()) {
                if (wu3Var.isFocused() && i > 0) {
                    z3 = true;
                }
                this.w = z3;
            }
            this.f.getHeight();
            return;
        }
        this.H = i;
        this.I = z;
        boolean z5 = this.w;
        if (!wu3Var.isFocused() || i <= 0) {
            z4 = false;
        }
        this.w = z4;
        if (z4 && this.e) {
            x(0);
        }
        if (this.x != 0 && !(z2 = this.w) && z2 != z5 && !this.e) {
            this.x = 0;
            this.f.requestLayout();
        }
        if (this.w && this.O) {
            this.O = false;
            gm.r(this.Q);
        }
        this.f.getHeight();
    }

    public boolean a() {
        int i = this.M;
        if (i != 2 && i != 3 && i != 5) {
            return false;
        }
        return true;
    }

    public boolean b() {
        return this instanceof m75;
    }

    public final void d() {
        gm.t1(this.a);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.m4) {
            xu3 xu3Var = this.d;
            if (xu3Var != null) {
                xu3Var.Q.h1();
            }
            wu3 wu3Var = this.a;
            if (wu3Var != null) {
                int currentTextColor = wu3Var.getCurrentTextColor();
                wu3Var.setTextColor(-1);
                wu3Var.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z;
        xu3 xu3Var = this.d;
        if (xu3Var != null && xu3Var.d1 != z8c.t0) {
            this.f.removeView(xu3Var);
            xu3Var = null;
            this.d = null;
        }
        if (xu3Var != null) {
            return;
        }
        Context context = getContext();
        boolean b = b();
        int i = this.M;
        if (i != 2 && i != 3 && i != 5) {
            z = true;
        } else {
            z = false;
        }
        xu3 xu3Var2 = new xu3(this, this.h, this.J, context, b, z, this.N, this.T);
        this.d = xu3Var2;
        xu3Var2.c = this.V;
        xu3Var2.V0 = this.R;
        xu3Var2.setVisibility(8);
        this.S = 0.0f;
        if (gm.O1()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new av3(this));
        this.f.addView(this.d);
    }

    public qu3 getEditText() {
        return this.a;
    }

    public View getEmojiButton() {
        return this.b;
    }

    public int getEmojiPadding() {
        return this.x;
    }

    public float getEmojiPaddingShown() {
        return this.S;
    }

    public e34 getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        int i;
        int i2;
        Point point = gm.q;
        if (point.x > point.y) {
            i = this.s;
        } else {
            i = this.r;
        }
        if (this.K) {
            i2 = gm.n;
        } else {
            i2 = 0;
        }
        int i3 = i + i2;
        if (this.y) {
            return Math.min(gm.L(200.0f) + i3, point.y);
        }
        return i3;
    }

    public Editable getText() {
        return this.a.getText();
    }

    public int h() {
        return vm.f();
    }

    public final void j() {
        xu3 xu3Var;
        if (!this.e && (xu3Var = this.d) != null && xu3Var.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.S = 0.0f;
        }
        this.x = 0;
        boolean z = this.y;
        this.y = false;
        if (z) {
            xu3 xu3Var2 = this.d;
            if (xu3Var2 != null) {
                xu3Var2.r(false);
            }
            y();
        }
    }

    public final void k(boolean z) {
        if (this.e) {
            x(0);
        }
        if (z) {
            xu3 xu3Var = this.d;
            if (xu3Var != null && xu3Var.getVisibility() == 0 && !this.O) {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.S = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new by0(this, measuredHeight, (byte) 1));
                this.P = true;
                ofFloat.addListener(new kh2(this, (byte) 16));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(gb.w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z2 = this.y;
        this.y = false;
        if (z2) {
            xu3 xu3Var2 = this.d;
            if (xu3Var2 != null) {
                xu3Var2.r(false);
            }
            y();
        }
    }

    public final boolean l(View view) {
        if (view == this.d) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        xu3 xu3Var = this.d;
        if (xu3Var != null && xu3Var.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.a.length();
    }

    public final void o() {
        this.E = true;
        xu3 xu3Var = this.d;
        if (xu3Var != null) {
            xu3Var.z();
        }
        ela elaVar = this.f;
        if (elaVar != null) {
            elaVar.r.remove(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.e().b(this, nm7.m4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.e().n(this, nm7.m4);
    }

    public final void r() {
        this.F = true;
        d();
    }

    public final void s() {
        this.F = false;
        if (this.G) {
            this.G = false;
            wu3 wu3Var = this.a;
            wu3Var.requestFocus();
            gm.E3(wu3Var);
            if (!gm.D && !this.w && !gm.E && !gm.O1()) {
                this.O = true;
                u();
                o1 o1Var = this.Q;
                gm.r(o1Var);
                gm.d3(o1Var, 100L);
            }
        }
    }

    public void setAdjustPanLayoutHelper(gb gbVar) {
        this.L = gbVar;
    }

    public void setEmojiViewCacheType(int i) {
        this.V = i;
        xu3 xu3Var = this.d;
        if (xu3Var != null) {
            xu3Var.c = i;
        }
    }

    @Override
    public void setEnabled(boolean z) {
        int i;
        float f;
        int i2;
        int L;
        wu3 wu3Var = this.a;
        wu3Var.setEnabled(z);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.b.setVisibility(i);
        if (this.M == 0) {
            f = 11.0f;
        } else {
            f = 8.0f;
        }
        int L2 = gm.L(f);
        if (z) {
            if (jb6.a0) {
                i2 = gm.L(40.0f);
            } else {
                i2 = 0;
            }
            if (jb6.a0) {
                L = 0;
            } else {
                L = gm.L(40.0f);
            }
            wu3Var.setPadding(i2, 0, L, L2);
            return;
        }
        wu3Var.setPadding(0, 0, 0, L2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z) {
        this.a.setFocusable(z);
    }

    public void setHint(CharSequence charSequence) {
        this.a.setHint(charSequence);
    }

    public void setMaxLines(int i) {
        this.a.setMaxLines(i);
    }

    public void setSelection(int i) {
        this.a.setSelection(i);
    }

    public void setSizeNotifierLayout(ela elaVar) {
        ela elaVar2 = this.f;
        if (elaVar2 != null) {
            elaVar2.r.remove(this);
        }
        this.f = elaVar;
        elaVar.r.add(this);
    }

    public void setSuggestionsEnabled(boolean z) {
        int i;
        wu3 wu3Var = this.a;
        int inputType = wu3Var.getInputType();
        if (!z) {
            i = inputType | 524288;
        } else {
            i = inputType & (-524289);
        }
        if (wu3Var.getInputType() != i) {
            wu3Var.setInputType(i);
        }
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public boolean t(int i) {
        return true;
    }

    public final void v() {
        int i;
        u();
        if (!gm.D && !this.F) {
            i = 2;
        } else {
            i = 0;
        }
        x(i);
        wu3 wu3Var = this.a;
        wu3Var.requestFocus();
        gm.E3(wu3Var);
        if (this.F) {
            this.G = true;
        } else if (!gm.D && !this.w && !gm.E && !gm.O1()) {
            this.O = true;
            o1 o1Var = this.Q;
            gm.r(o1Var);
            gm.d3(o1Var, 100L);
        }
    }

    public final void w(int i, int i2) {
        this.a.setSelection(i, i2);
    }

    public final void x(int i) {
        n99 n99Var = this.c;
        int i2 = 0;
        if (i == 1) {
            xu3 xu3Var = this.d;
            if (xu3Var != null) {
                xu3Var.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.e = true;
            this.S = 1.0f;
            xu3 xu3Var2 = this.d;
            if (this.r <= 0) {
                if (gm.O1()) {
                    this.r = gm.L(150.0f);
                } else {
                    this.r = oc7.c1().getInt("kbd_height", gm.L(200.0f));
                }
            }
            int i3 = this.s;
            if (i3 <= 0) {
                if (gm.O1()) {
                    i3 = gm.L(150.0f);
                    this.s = i3;
                } else {
                    i3 = oc7.c1().getInt("kbd_height_land3", gm.L(200.0f));
                    this.s = i3;
                }
            }
            Point point = gm.q;
            if (point.x <= point.y) {
                i3 = this.r;
            }
            if (this.K) {
                i2 = gm.n;
            }
            int i4 = i3 + i2;
            if (this.y) {
                i4 = Math.min(gm.L(200.0f) + i4, point.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) xu3Var2.getLayoutParams();
            layoutParams.height = i4;
            xu3Var2.setLayoutParams(layoutParams);
            if (!gm.E && !gm.O1()) {
                gm.t1(this.a);
            }
            ela elaVar = this.f;
            if (elaVar != null) {
                this.x = i4;
                elaVar.requestLayout();
                n99Var.a(2131231509, true);
                this.f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.S = 1.0f;
            c(0.0f);
            return;
        }
        if (this.b != null) {
            if (this.M == 0) {
                n99Var.a(2131232760, true);
            } else {
                n99Var.a(2131231517, true);
            }
        }
        if (this.d != null) {
            this.e = false;
            p();
            if (gm.D || gm.E) {
                this.d.setVisibility(8);
                this.S = 0.0f;
            }
        }
        ela elaVar2 = this.f;
        if (elaVar2 != null) {
            if (i == 0) {
                this.x = 0;
                this.S = 0.0f;
            }
            elaVar2.requestLayout();
            this.f.getHeight();
        }
    }

    public void c(float f) {
    }

    public void e() {
    }

    public void p() {
    }

    public void setDelegate(bv3 bv3Var) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, xu3 xu3Var) {
    }

    public void i(ActionMode actionMode, Menu menu) {
    }

    public void q(int i, int i2) {
    }

    public cv3(Context context, hz0 hz0Var, ba2 ba2Var) {
        this(context, hz0Var, ba2Var, 0, false, null);
    }
}
