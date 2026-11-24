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
public class rt3 extends FrameLayout implements gk7, bja {
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;
    public final boolean J;
    public boolean K;
    public gb L;
    public final int M;
    public final wjb N;
    public boolean O;
    public boolean P;
    public final o1 Q;
    public boolean R;
    public float S;
    public boolean T;
    public boolean U;
    public int V;
    public final mt3 a;
    public final v31 b;
    public final l79 c;
    public nt3 d;
    public boolean e;
    public cja f;
    public final d h;
    public boolean n;
    public int r;
    public int s;
    public boolean w;
    public int x;
    public boolean y;

    public rt3(Context context, cja cjaVar, d dVar, int i, boolean z, wjb wjbVar) {
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
        this.N = wjbVar;
        this.M = i;
        this.h = dVar;
        this.f = cjaVar;
        cjaVar.r.add(this);
        mt3 mt3Var = new mt3(this, context, wjbVar, i);
        this.a = mt3Var;
        mt3Var.setImeOptions(268435456);
        mt3Var.setInputType(mt3Var.getInputType() | 16384);
        mt3Var.setFocusable(mt3Var.isEnabled());
        mt3Var.setCursorSize(gl.L(20.0f));
        mt3Var.setCursorWidth(1.5f);
        int i5 = bkb.F6;
        zkb.l(mt3Var, 30, i5, wjbVar);
        if (i == 0) {
            mt3Var.setTextSize(1, 18.0f);
            mt3Var.setMaxLines(4);
            if (k96.a0) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            mt3Var.setGravity(i3 | 16);
            mt3Var.setBackground(null);
            zkb.F(mt3Var, bkb.j6, bkb.k6, bkb.o7, wjbVar);
            zkb.D(mt3Var, bkb.G6, wjbVar);
            zkb.X(mt3Var, i5, wjbVar);
            zkb.l(mt3Var, 36, bkb.lg, wjbVar);
            if (k96.a0) {
                i4 = gl.L(40.0f);
            } else {
                i4 = 0;
            }
            if (k96.a0) {
                L = 0;
            } else {
                L = gl.L(40.0f);
            }
            mt3Var.setPadding(i4, 0, L, gl.L(11.0f));
            boolean z2 = k96.a0;
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
            addView(mt3Var, nme.d(-1, -2.0f, 19, f, 1.0f, f2, 0.0f));
        } else if (i != 2 && i != 3) {
            if (i == 4) {
                mt3Var.setTextSize(1, 18.0f);
                mt3Var.setMaxLines(4);
                mt3Var.setGravity(19);
                zkb.D(mt3Var, bkb.s5, wjbVar);
                zkb.X(mt3Var, bkb.i5, wjbVar);
                mt3Var.setBackground(null);
                mt3Var.setPadding(0, gl.L(11.0f), 0, gl.L(12.0f));
                addView(mt3Var, nme.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
            } else {
                mt3Var.setTextSize(1, 18.0f);
                mt3Var.setMaxLines(4);
                mt3Var.setGravity(19);
                zkb.D(mt3Var, bkb.s5, wjbVar);
                zkb.X(mt3Var, bkb.i5, wjbVar);
                mt3Var.setBackground(null);
                mt3Var.setPadding(0, gl.L(11.0f), 0, gl.L(12.0f));
                addView(mt3Var, nme.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
            }
        } else {
            mt3Var.setTextSize(1, 16.0f);
            mt3Var.setMaxLines(8);
            mt3Var.setGravity(19);
            mt3Var.setAllowTextEntitiesIntersection(true);
            mt3Var.setHintTextColor(-1929379841);
            mt3Var.setTextColor(-1);
            mt3Var.setCursorColor(-1);
            mt3Var.setBackground(null);
            mt3Var.setClipToPadding(false);
            mt3Var.setPadding(0, gl.L(9.0f), 0, gl.L(9.0f));
            mt3Var.setHandlesColor(-1);
            mt3Var.setHighlightColor(822083583);
            mt3Var.setLinkTextColor(-12147733);
            mt3Var.E = -1;
            mt3Var.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(mt3Var, nme.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        }
        v31 v31Var = new v31(this, context);
        this.b = v31Var;
        v31Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        l79 l79Var = new l79(context);
        this.c = l79Var;
        v31Var.setImageDrawable(l79Var);
        if (i == 0) {
            zkb.x(this, l79Var, bkb.Ne, wjbVar, PorterDuff.Mode.MULTIPLY);
            l79Var.a(2131232748, false);
            if (k96.a0) {
                i2 = 3;
            } else {
                i2 = 5;
            }
            addView(v31Var, nme.d(48, 48.0f, i2 | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i != 2 && i != 3) {
            if (i == 4) {
                zkb.x(this, l79Var, bkb.Ne, wjbVar, PorterDuff.Mode.MULTIPLY);
                l79Var.a(2131231516, false);
                addView(v31Var, nme.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
            } else if (i == 5) {
                zkb.x(this, l79Var, bkb.e7, wjbVar, PorterDuff.Mode.MULTIPLY);
                l79Var.a(2131231516, false);
                addView(v31Var, nme.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            } else {
                zkb.x(this, l79Var, bkb.Ne, wjbVar, PorterDuff.Mode.MULTIPLY);
                l79Var.a(2131231516, false);
                addView(v31Var, nme.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            }
        } else {
            l79Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            l79Var.a(2131231516, false);
            addView(v31Var, nme.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i6 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.v0(i6, wjbVar), 1, -1);
        vkb M = zkb.M(i6);
        v31Var.setBackground(f0);
        zkb.j(v31Var, f0, null, M, wjbVar);
        v31Var.setOnClickListener(new b0(this, cjaVar, wjbVar, (byte) 28));
        v31Var.setContentDescription(k96.M0(2131751184, null));
    }

    @Override
    public final void L(int i, boolean z) {
        boolean z2;
        int i2;
        int i3;
        int i4;
        if (i > gl.L(50.0f) && ((this.w || (i4 = this.M) == 2 || i4 == 3) && !gl.E && !gl.O1())) {
            if (z) {
                this.s = i;
                na7.b1().edit().putInt("kbd_height_land3", this.s).commit();
            } else {
                this.r = i;
                na7.b1().edit().putInt("kbd_height", this.r).commit();
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
                i3 = gl.n;
            } else {
                i3 = 0;
            }
            int i5 = i2 + i3;
            if (this.y) {
                i5 = Math.min(gl.L(200.0f) + i5, gl.q.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i6 = layoutParams.width;
            int i7 = gl.q.x;
            if (i6 != i7 || layoutParams.height != i5) {
                layoutParams.width = i7;
                layoutParams.height = i5;
                this.d.setLayoutParams(layoutParams);
                cja cjaVar = this.f;
                if (cjaVar != null) {
                    this.x = layoutParams.height;
                    cjaVar.requestLayout();
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
        mt3 mt3Var = this.a;
        if (i8 == i && this.I == z) {
            if (b()) {
                if (mt3Var.isFocused() && i > 0) {
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
        if (!mt3Var.isFocused() || i <= 0) {
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
            gl.r(this.Q);
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
        return this instanceof o55;
    }

    public final void d() {
        gl.t1(this.a);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.k4) {
            nt3 nt3Var = this.d;
            if (nt3Var != null) {
                nt3Var.Q.h1();
            }
            mt3 mt3Var = this.a;
            if (mt3Var != null) {
                int currentTextColor = mt3Var.getCurrentTextColor();
                mt3Var.setTextColor(-1);
                mt3Var.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z;
        nt3 nt3Var = this.d;
        if (nt3Var != null && nt3Var.d1 != y6c.t0) {
            this.f.removeView(nt3Var);
            nt3Var = null;
            this.d = null;
        }
        if (nt3Var != null) {
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
        nt3 nt3Var2 = new nt3(this, this.h, this.J, context, b, z, this.N, this.T);
        this.d = nt3Var2;
        nt3Var2.c = this.V;
        nt3Var2.V0 = this.R;
        nt3Var2.setVisibility(8);
        this.S = 0.0f;
        if (gl.O1()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new pt3(this));
        this.f.addView(this.d);
    }

    public gt3 getEditText() {
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

    public t14 getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        int i;
        int i2;
        Point point = gl.q;
        if (point.x > point.y) {
            i = this.s;
        } else {
            i = this.r;
        }
        if (this.K) {
            i2 = gl.n;
        } else {
            i2 = 0;
        }
        int i3 = i + i2;
        if (this.y) {
            return Math.min(gl.L(200.0f) + i3, point.y);
        }
        return i3;
    }

    public Editable getText() {
        return this.a.getText();
    }

    public int h() {
        return vl.f();
    }

    public final void j() {
        nt3 nt3Var;
        if (!this.e && (nt3Var = this.d) != null && nt3Var.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.S = 0.0f;
        }
        this.x = 0;
        boolean z = this.y;
        this.y = false;
        if (z) {
            nt3 nt3Var2 = this.d;
            if (nt3Var2 != null) {
                nt3Var2.s(false);
            }
            y();
        }
    }

    public final void k(boolean z) {
        if (this.e) {
            x(0);
        }
        if (z) {
            nt3 nt3Var = this.d;
            if (nt3Var != null && nt3Var.getVisibility() == 0 && !this.O) {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.S = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new tw0(this, measuredHeight, (byte) 1));
                this.P = true;
                ofFloat.addListener(new im2(this, (byte) 14));
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
            nt3 nt3Var2 = this.d;
            if (nt3Var2 != null) {
                nt3Var2.s(false);
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
        nt3 nt3Var = this.d;
        if (nt3Var != null && nt3Var.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.a.length();
    }

    public final void o() {
        this.E = true;
        nt3 nt3Var = this.d;
        if (nt3Var != null) {
            nt3Var.A();
        }
        cja cjaVar = this.f;
        if (cjaVar != null) {
            cjaVar.r.remove(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.e().b(this, kk7.k4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.e().n(this, kk7.k4);
    }

    public final void r() {
        this.F = true;
        d();
    }

    public final void s() {
        this.F = false;
        if (this.G) {
            this.G = false;
            mt3 mt3Var = this.a;
            mt3Var.requestFocus();
            gl.F3(mt3Var);
            if (!gl.D && !this.w && !gl.E && !gl.O1()) {
                this.O = true;
                u();
                o1 o1Var = this.Q;
                gl.r(o1Var);
                gl.e3(o1Var, 100L);
            }
        }
    }

    public void setAdjustPanLayoutHelper(gb gbVar) {
        this.L = gbVar;
    }

    public void setEmojiViewCacheType(int i) {
        this.V = i;
        nt3 nt3Var = this.d;
        if (nt3Var != null) {
            nt3Var.c = i;
        }
    }

    @Override
    public void setEnabled(boolean z) {
        int i;
        float f;
        int i2;
        int L;
        mt3 mt3Var = this.a;
        mt3Var.setEnabled(z);
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
        int L2 = gl.L(f);
        if (z) {
            if (k96.a0) {
                i2 = gl.L(40.0f);
            } else {
                i2 = 0;
            }
            if (k96.a0) {
                L = 0;
            } else {
                L = gl.L(40.0f);
            }
            mt3Var.setPadding(i2, 0, L, L2);
            return;
        }
        mt3Var.setPadding(0, 0, 0, L2);
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

    public void setSizeNotifierLayout(cja cjaVar) {
        cja cjaVar2 = this.f;
        if (cjaVar2 != null) {
            cjaVar2.r.remove(this);
        }
        this.f = cjaVar;
        cjaVar.r.add(this);
    }

    public void setSuggestionsEnabled(boolean z) {
        int i;
        mt3 mt3Var = this.a;
        int inputType = mt3Var.getInputType();
        if (!z) {
            i = inputType | 524288;
        } else {
            i = inputType & (-524289);
        }
        if (mt3Var.getInputType() != i) {
            mt3Var.setInputType(i);
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
        if (!gl.D && !this.F) {
            i = 2;
        } else {
            i = 0;
        }
        x(i);
        mt3 mt3Var = this.a;
        mt3Var.requestFocus();
        gl.F3(mt3Var);
        if (this.F) {
            this.G = true;
        } else if (!gl.D && !this.w && !gl.E && !gl.O1()) {
            this.O = true;
            o1 o1Var = this.Q;
            gl.r(o1Var);
            gl.e3(o1Var, 100L);
        }
    }

    public final void w(int i, int i2) {
        this.a.setSelection(i, i2);
    }

    public final void x(int i) {
        l79 l79Var = this.c;
        int i2 = 0;
        if (i == 1) {
            nt3 nt3Var = this.d;
            if (nt3Var != null) {
                nt3Var.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.e = true;
            this.S = 1.0f;
            nt3 nt3Var2 = this.d;
            if (this.r <= 0) {
                if (gl.O1()) {
                    this.r = gl.L(150.0f);
                } else {
                    this.r = na7.b1().getInt("kbd_height", gl.L(200.0f));
                }
            }
            int i3 = this.s;
            if (i3 <= 0) {
                if (gl.O1()) {
                    i3 = gl.L(150.0f);
                    this.s = i3;
                } else {
                    i3 = na7.b1().getInt("kbd_height_land3", gl.L(200.0f));
                    this.s = i3;
                }
            }
            Point point = gl.q;
            if (point.x <= point.y) {
                i3 = this.r;
            }
            if (this.K) {
                i2 = gl.n;
            }
            int i4 = i3 + i2;
            if (this.y) {
                i4 = Math.min(gl.L(200.0f) + i4, point.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) nt3Var2.getLayoutParams();
            layoutParams.height = i4;
            nt3Var2.setLayoutParams(layoutParams);
            if (!gl.E && !gl.O1()) {
                gl.t1(this.a);
            }
            cja cjaVar = this.f;
            if (cjaVar != null) {
                this.x = i4;
                cjaVar.requestLayout();
                l79Var.a(2131231508, true);
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
                l79Var.a(2131232748, true);
            } else {
                l79Var.a(2131231516, true);
            }
        }
        if (this.d != null) {
            this.e = false;
            p();
            if (gl.D || gl.E) {
                this.d.setVisibility(8);
                this.S = 0.0f;
            }
        }
        cja cjaVar2 = this.f;
        if (cjaVar2 != null) {
            if (i == 0) {
                this.x = 0;
                this.S = 0.0f;
            }
            cjaVar2.requestLayout();
            this.f.getHeight();
        }
    }

    public void e() {
    }

    public void p() {
    }

    public void u() {
    }

    public void y() {
    }

    public void c(float f) {
    }

    public void setDelegate(qt3 qt3Var) {
    }

    public void g(Canvas canvas, nt3 nt3Var) {
    }

    public void i(ActionMode actionMode, Menu menu) {
    }

    public void q(int i, int i2) {
    }

    public rt3(Context context, ay0 ay0Var, p82 p82Var) {
        this(context, ay0Var, p82Var, 0, false, null);
    }
}
