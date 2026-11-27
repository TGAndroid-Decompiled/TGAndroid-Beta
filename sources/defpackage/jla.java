package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.EditTextBoldCursor;
public class jla extends FrameLayout implements s84, fn7, snb, o27, cu5 {
    public final RectF A0;
    public int B0;
    public boolean C0;
    public float D0;
    public ImageView E;
    public View F;
    public boolean G;
    public final RectF H;
    public sla I;
    public CharSequence J;
    public CharSequence K;
    public boolean L;
    public boolean M;
    public jl0 N;
    public jl0 O;
    public jl0 P;
    public jl0 Q;
    public float R;
    public ll0 S;
    public ol0 T;
    public bl0 U;
    public ll0 V;
    public hcc W;
    public final vnb a;
    public ula a0;
    public final gla b;
    public s7 b0;
    public final r98 c;
    public final fm0 c0;
    public rla d;
    public final fm0 d0;
    public rla e;
    public final fm0 e0;
    public in f;
    public d6 f0;
    public boolean g0;
    public in h;
    public int h0;
    public boolean i0;
    public boolean j0;
    public int k0;
    public int l0;
    public int m0;
    public nla n;
    public int n0;
    public int o0;
    public int p0;
    public boolean q0;
    public FrameLayout r;
    public boolean r0;
    public m7 s;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public ll0 v0;
    public ImageView w;
    public pz4 w0;
    public TextView x;
    public final RectF x0;
    public LinearLayout y;
    public float y0;
    public final Path z0;

    public jla(Context context, vnb vnbVar) {
        super(context);
        this.H = new RectF();
        this.R = -1.0f;
        k43 k43Var = k43.h;
        this.c0 = new fm0(0, this, k43Var, 380L, false);
        this.d0 = new fm0(1, this, k43Var, 380L, false);
        this.e0 = new fm0(2, this, k43Var, 250L, false);
        this.g0 = true;
        this.u0 = true;
        this.x0 = new RectF();
        this.y0 = 1.0f;
        this.z0 = new Path();
        this.A0 = new RectF();
        this.D0 = 1.0f;
        this.a = vnbVar;
        setClipChildren(false);
        setWillNotDraw(false);
        G();
        r98 r98Var = new r98(this, context);
        this.c = r98Var;
        addView(r98Var, tre.e(-1, -2, 51));
        gla glaVar = new gla(this, context);
        this.b = glaVar;
        glaVar.setVisibility(8);
        glaVar.setContentDescription(ob6.M0(2131754874, null));
        glaVar.setOnClickListener(new fla(this, (byte) 0));
        addView(glaVar, tre.e(46, 46, 51));
    }

    public static void I(View view, float f) {
        int i;
        view.setAlpha(f);
        if (f > 0.0f) {
            i = 0;
        } else {
            i = 4;
        }
        view.setVisibility(i);
    }

    public static void J(View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i;
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.rightMargin = i3;
    }

    private int getRowTop() {
        if (this.g0) {
            return hl.m;
        }
        return 0;
    }

    public o7 getSearchListener() {
        sla slaVar = this.I;
        if (slaVar != null) {
            return slaVar.getSearchListener();
        }
        return null;
    }

    private float getSearchPillLeft() {
        float f;
        if (((Drawable) this.b.b) != null) {
            f = 58.0f;
        } else {
            f = 6.0f;
        }
        return hl.L(f);
    }

    public static o7 j(jla jlaVar) {
        return jlaVar.getSearchListener();
    }

    private void setSearchCloseCircle(boolean z) {
        int i;
        float f;
        if (this.G == z) {
            return;
        }
        this.G = z;
        ImageView imageView = this.w;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.y.getLayoutParams();
        if (z) {
            f = 18.0f;
        } else {
            f = 42.0f;
        }
        marginLayoutParams.rightMargin = hl.L(f);
        this.y.setLayoutParams(marginLayoutParams);
        requestLayout();
    }

    public final boolean A() {
        if (this.i0 && this.j0) {
            return true;
        }
        return false;
    }

    public final boolean B(View view) {
        if (view != this.b && view != this.c && view != this.d && view != this.e && view != this.f && view != this.h && view != this.r && view != this.n && view != this.E) {
            return false;
        }
        return true;
    }

    public final boolean C() {
        TextView textView = this.x;
        if (textView != null && textView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void D(int i, KeyEvent keyEvent) {
        if (i != 3) {
            if (keyEvent != null) {
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return;
                }
            } else {
                return;
            }
        }
        hl.t1(this.s);
        o7 searchListener = getSearchListener();
        if (searchListener != null) {
            searchListener.k(this.s);
        }
    }

    public final boolean E() {
        ula ulaVar = this.a0;
        if (ulaVar != null) {
            ulaVar.a(true);
            return true;
        } else if (!this.M && this.L) {
            o(true);
            return true;
        } else {
            return false;
        }
    }

    public final boolean F(boolean z, boolean z2) {
        o7 searchListener;
        boolean z3;
        boolean z4;
        k43 k43Var;
        long j;
        rla rlaVar;
        boolean z5 = false;
        if (this.I == null || this.L || this.M || ((searchListener = getSearchListener()) != null && !searchListener.c())) {
            return false;
        }
        w();
        if (this.F != null && ((rlaVar = this.d) == null || rlaVar.getVisibility() == 8 || this.d.getPillWidth() <= 0.0f)) {
            z3 = true;
        } else {
            z3 = false;
        }
        setSearchCloseCircle(z3);
        this.L = true;
        rla rlaVar2 = this.d;
        if (rlaVar2 != null) {
            rlaVar2.f();
        }
        m7 m7Var = this.s;
        CharSequence charSequence = this.K;
        if (charSequence == null) {
            charSequence = "";
        }
        m7Var.setText(charSequence);
        this.K = null;
        this.s.requestFocus();
        if (z) {
            hl.E3(this.s);
        }
        rla rlaVar3 = this.d;
        if (rlaVar3 != null && rlaVar3.getVisibility() != 8 && this.d.getPillWidth() > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            k43Var = k43.h;
        } else {
            k43Var = k43.f;
        }
        fm0 fm0Var = this.c0;
        fm0Var.c = k43Var;
        t84 t84Var = fm0Var.h;
        if (t84Var != null) {
            t84Var.c = k43Var;
        }
        if (z4) {
            j = 380;
        } else {
            j = 220;
        }
        fm0Var.d = j;
        if (t84Var != null) {
            t84Var.d = j;
        }
        if (z2 && A()) {
            z5 = true;
        }
        fm0Var.a(true, z5);
        l();
        if (searchListener != null) {
            searchListener.i();
        }
        return true;
    }

    public final void G() {
        boolean z = this.q0;
        vnb vnbVar = this.a;
        if (!z) {
            this.k0 = aob.v0(aob.G6, vnbVar);
        }
        if (!this.r0) {
            this.l0 = aob.v0(aob.y6, vnbVar);
        }
        if (!this.s0) {
            this.m0 = aob.v0(aob.G6, vnbVar);
        }
        this.n0 = aob.v0(aob.G6, vnbVar);
        if (!this.t0) {
            this.o0 = aob.v0(aob.i6, vnbVar);
        }
        this.p0 = aob.v0(aob.i6, vnbVar);
    }

    public final void H(int i, boolean z) {
        boolean z2;
        String E = ob6.E(i, ' ');
        r();
        in inVar = this.f;
        if (z && A() && this.M) {
            z2 = true;
        } else {
            z2 = false;
        }
        inVar.c(E, z2, true);
    }

    public final void K(CharSequence charSequence, boolean z, long j, k43 k43Var) {
        int L;
        if (!A()) {
            setTitle(charSequence);
            return;
        }
        r98 r98Var = this.c;
        r98Var.b(0);
        r98Var.b(1);
        ema[] emaVarArr = (ema[]) r98Var.c;
        ema emaVar = emaVarArr[0];
        ema emaVar2 = emaVarArr[1];
        emaVarArr[0] = emaVar2;
        emaVarArr[1] = emaVar;
        emaVar2.animate().cancel();
        emaVar2.k(charSequence);
        emaVar2.setVisibility(0);
        emaVar2.setAlpha(0.0f);
        int L2 = hl.L(16.0f);
        if (!z) {
            L2 = -L2;
        }
        emaVar2.setTranslationY(L2);
        emaVar2.animate().alpha(1.0f).translationY(0.0f).setDuration(j).setInterpolator(k43Var).start();
        emaVar.animate().cancel();
        ViewPropertyAnimator alpha = emaVar.animate().alpha(0.0f);
        if (z) {
            L = -hl.L(16.0f);
        } else {
            L = hl.L(16.0f);
        }
        alpha.translationY(L).setDuration(j).setInterpolator(k43Var).withEndAction(new ila(emaVar, (byte) 1)).start();
        r98Var.requestLayout();
    }

    public final void L() {
        if (this.e != null && !this.M) {
            this.M = true;
            rla rlaVar = this.d;
            if (rlaVar != null) {
                rlaVar.f();
            }
            m7 m7Var = this.s;
            if (m7Var != null && this.L) {
                hl.t1(m7Var);
            }
            this.d0.a(true, A());
            l();
            this.b.b(true, A());
            jn7.e().k(jn7.u4, new Object[0]);
        }
    }

    public final void M() {
        jl0 jl0Var = this.N;
        if (jl0Var != null) {
            jl0Var.updateColors();
            this.O.updateColors();
            this.P.updateColors();
            this.Q.updateColors();
        }
        invalidate();
        ula ulaVar = this.a0;
        if (ulaVar != null) {
            ulaVar.invalidate();
        }
    }

    public final void N() {
        m7 m7Var = this.s;
        int i = aob.G6;
        vnb vnbVar = this.a;
        m7Var.setTextColor(aob.v0(i, vnbVar));
        this.x.setTextColor(aob.v0(i, vnbVar));
        this.s.setHintTextColor(aob.v0(aob.H6, vnbVar));
        this.s.setCursorColor(aob.v0(i, vnbVar));
        this.s.setHighlightColor(aob.v0(aob.lg, vnbVar));
        this.s.setHandlesColor(aob.v0(aob.mg, vnbVar));
        int v0 = aob.v0(aob.m6, vnbVar);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.w.setColorFilter(new PorterDuffColorFilter(v0, mode));
        this.w.setBackground(aob.f0(this.o0, 1, -1));
        this.E.setColorFilter(new PorterDuffColorFilter(this.m0, mode));
        this.E.setBackground(aob.f0(this.o0, 1, -1));
    }

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final void b(ula ulaVar, s7 s7Var) {
        this.a0 = ulaVar;
        this.b0 = s7Var;
        invalidate();
    }

    @Override
    public final boolean c(s7 s7Var, RectF rectF) {
        float f = 0.0f;
        if (s7Var.getParent() == this.d && getSearchFactor() == 0.0f && getActionModeFactor() == 0.0f) {
            p(rectF);
            return true;
        }
        float L = hl.L(23.0f);
        View view = (View) s7Var.getParent();
        if (view != null) {
            f = view.getX();
        }
        float width = (s7Var.getWidth() / 2.0f) + s7Var.getX() + f;
        float currentActionBarHeight = (a.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        rectF.set(width - L, currentActionBarHeight - L, width + L, currentActionBarHeight + L);
        return false;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.q4) {
            updateColors();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        nla nlaVar;
        this.i0 = this.j0;
        int L = hl.L(6.0f);
        if (this.N != null) {
            gla glaVar = this.b;
            if (glaVar.getVisibility() == 0 && glaVar.getAlpha() > 0.0f) {
                float width = (glaVar.getWidth() / 2.0f) + glaVar.getX();
                float height = (glaVar.getHeight() / 2.0f) + glaVar.getY();
                float scaleX = glaVar.getScaleX() * (glaVar.getWidth() / 2.0f);
                float scaleY = glaVar.getScaleY() * (glaVar.getHeight() / 2.0f);
                this.N.setBounds(((int) (width - scaleX)) - L, ((int) (height - scaleY)) - L, ((int) (width + scaleX)) + L, ((int) (height + scaleY)) + L);
                this.N.setAlpha((int) (glaVar.getAlpha() * 255.0f));
                this.N.draw(canvas);
            }
        }
        if (this.P != null && (nlaVar = this.n) != null && nlaVar.c == mla.a && nlaVar.getVisibility() == 0 && this.n.getAlpha() > 0.0f) {
            float width2 = (this.n.getWidth() / 2.0f) + this.n.getX();
            float height2 = (this.n.getHeight() / 2.0f) + this.n.getY();
            float scaleX2 = this.n.getScaleX() * (this.n.getWidth() / 2.0f);
            float scaleY2 = this.n.getScaleY() * (this.n.getHeight() / 2.0f);
            this.P.setBounds(((int) (width2 - scaleX2)) - L, ((int) (height2 - scaleY2)) - L, ((int) (width2 + scaleX2)) + L, ((int) (height2 + scaleY2)) + L);
            this.P.setAlpha((int) (this.n.getAlpha() * 255.0f));
            this.P.draw(canvas);
        }
        if (this.O != null) {
            RectF rectF = this.x0;
            float p = p(rectF);
            s7 s7Var = this.b0;
            if (s7Var != null && s7Var.getParent() == this.d) {
                z = true;
            } else {
                z = false;
            }
            if (p > 0.0f && rectF.width() > 0.0f && !z) {
                float height3 = rectF.height() / 2.0f;
                if (Math.abs(height3 - this.R) > 0.5f) {
                    this.R = height3;
                    this.O.r(height3);
                }
                this.O.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                this.O.setAlpha((int) (p * 255.0f * this.y0));
                this.O.draw(canvas);
            }
        }
        if (this.Q != null) {
            RectF rectF2 = this.H;
            if (q(rectF2)) {
                this.Q.setBounds(((int) rectF2.left) - L, ((int) rectF2.top) - L, ((int) rectF2.right) + L, ((int) rectF2.bottom) + L);
                this.Q.setAlpha(255);
                this.Q.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        s7 s7Var;
        if (view == this.d && (s7Var = this.b0) != null && s7Var.getParent() == this.d) {
            return false;
        }
        if (view == this.r && getSearchFactor() < 1.0f) {
            RectF rectF = this.x0;
            p(rectF);
            canvas.save();
            canvas.clipRect(rectF);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void e(au5 au5Var) {
        nla nlaVar;
        if (this.N != null) {
            gla glaVar = this.b;
            if (glaVar.getVisibility() == 0 && glaVar.getAlpha() > 0.0f) {
                k(glaVar, au5Var);
            }
        }
        if (this.P != null && (nlaVar = this.n) != null && nlaVar.c == mla.a && nlaVar.getVisibility() == 0 && this.n.getAlpha() > 0.0f) {
            k(this.n, au5Var);
        }
        jl0 jl0Var = this.O;
        RectF rectF = this.A0;
        Path path = this.z0;
        if (jl0Var != null && p(rectF) > 0.0f && rectF.width() > 0.0f) {
            path.rewind();
            path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
            au5Var.a(path);
        }
        if (this.Q != null && q(rectF)) {
            path.rewind();
            path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
            au5Var.a(path);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (!B(childAt) && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && (childAt.getBackground() instanceof jl0) && (childAt != this.F || !this.G || getSearchFactor() <= 0.0f)) {
                path.rewind();
                path.addPath(((jl0) childAt.getBackground()).S.k, childAt.getX(), childAt.getY());
                au5Var.a(path);
            }
        }
    }

    @Override
    public final boolean f() {
        return this.u0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    public d6 getActionBarMenuOnItemClick() {
        return this.f0;
    }

    public rla getActionMode() {
        return this.e;
    }

    public float getActionModeFactor() {
        return this.d0.e;
    }

    public in getActionModeTitle() {
        r();
        return this.f;
    }

    public View getBackButton() {
        return this.b;
    }

    public Drawable getBackButtonDrawable() {
        return (Drawable) this.b.b;
    }

    @Override
    public int getButtonsGlassBackgroundColor() {
        bl0 bl0Var = this.U;
        if (bl0Var == null) {
            bl0Var = this.T;
        }
        if (bl0Var != null) {
            return bl0Var.Q1();
        }
        return 0;
    }

    @Override
    public bl0 getButtonsGlassColorProvider() {
        bl0 bl0Var = this.U;
        if (bl0Var != null) {
            return bl0Var;
        }
        return this.T;
    }

    public nla getDoneButton() {
        return this.n;
    }

    public int getExtraHeight() {
        return this.h0;
    }

    public rla getMenu() {
        return this.d;
    }

    @Override
    public int getMenuAnchorTint() {
        return 0;
    }

    @Override
    public int getMenuDimAlpha() {
        return -1;
    }

    @Override
    public int getMenuExtraBelow() {
        return 0;
    }

    @Override
    public bl0 getMenuGlassColorProvider() {
        return this.T;
    }

    @Override
    public int getMenuMaxHeight() {
        return 0;
    }

    public ula getMenuOverlay() {
        hcc hccVar = this.W;
        if (hccVar != null) {
            return (ula) hccVar.run();
        }
        return null;
    }

    public float getMenuPillLeft() {
        RectF rectF = this.x0;
        p(rectF);
        return rectF.left;
    }

    @Override
    public vnb getMenuResourcesProvider() {
        return this.a;
    }

    @Override
    public int getMenuRise() {
        return 0;
    }

    @Override
    public View getMenuView() {
        return this.d;
    }

    public boolean getOccupyStatusBar() {
        return this.g0;
    }

    @Override
    public ula getOpenMenuOverlay() {
        return this.a0;
    }

    public float getSearchFactor() {
        return this.c0.e;
    }

    public EditTextBoldCursor getSearchField() {
        w();
        return this.s;
    }

    public String getSubtitle() {
        CharSequence charSequence = (CharSequence) this.c.f;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public ema getSubtitleTextView() {
        return (ema) this.c.d;
    }

    public String getTitle() {
        CharSequence charSequence;
        ema emaVar = ((ema[]) this.c.c)[0];
        if (emaVar != null) {
            charSequence = emaVar.getText();
        } else {
            charSequence = null;
        }
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        r98 r98Var = this.c;
        r98Var.b(0);
        return ((ema[]) r98Var.c)[0].getTextPaint().getFontMetricsInt();
    }

    public ema getTitleTextView() {
        return ((ema[]) this.c.c)[0];
    }

    public ema getTitleTextView2() {
        return ((ema[]) this.c.c)[1];
    }

    public float getTitlesAlpha() {
        return this.D0;
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final jl0 i(ula ulaVar) {
        ll0 ll0Var = this.v0;
        if (ll0Var == null) {
            ll0Var = this.S;
        }
        if (ll0Var == null) {
            return null;
        }
        jl0 c = ll0Var.c(ulaVar, null, false);
        c.p(this.T);
        ik8.r(c, hl.L(23.0f), 6.0f);
        return c;
    }

    public final void k(View view, au5 au5Var) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        float height = (view.getHeight() / 2.0f) + view.getY();
        float scaleX = view.getScaleX() * (view.getWidth() / 2.0f);
        float scaleY = view.getScaleY() * (view.getHeight() / 2.0f);
        RectF rectF = this.A0;
        rectF.set(width - scaleX, height - scaleY, width + scaleX, height + scaleY);
        Path path = this.z0;
        path.rewind();
        path.addRoundRect(rectF, scaleY, scaleY, Path.Direction.CW);
        au5Var.a(path);
    }

    public final void l() {
        float f;
        rla rlaVar;
        rla rlaVar2;
        float f2;
        float f3;
        rla rlaVar3;
        rla rlaVar4;
        float R1;
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        float f4 = 1.0f - actionModeFactor;
        float f5 = searchFactor * f4;
        float f6 = (1.0f - searchFactor) * f4;
        float R12 = hl.R1(1.0f, 0.94f, Math.max(searchFactor, actionModeFactor));
        r98 r98Var = this.c;
        I(r98Var, this.D0 * f6);
        r98Var.setScaleX(R12);
        r98Var.setScaleY(R12);
        nla nlaVar = this.n;
        if (nlaVar != null) {
            float visibleFactor = nlaVar.getVisibleFactor() * f6;
            I(this.n, visibleFactor);
            if (this.n.c == mla.a) {
                R1 = hl.R1(0.6f, 1.0f, visibleFactor);
            } else {
                R1 = hl.R1(0.8f, 1.0f, f6);
            }
            this.n.setScaleX(R1);
            this.n.setScaleY(R1);
        }
        rla rlaVar5 = this.d;
        float f7 = 2.0f;
        int i = 0;
        if (rlaVar5 != null) {
            rlaVar5.setTranslationX(-x(false));
            I(this.d, f6);
            float R13 = hl.R1(0.7f, 1.0f, f6);
            this.d.setPivotX(rlaVar3.getWidth() - hl.L(19.0f));
            this.d.setPivotY(rlaVar4.getHeight() / 2.0f);
            this.d.setScaleX(R13);
            this.d.setScaleY(R13);
        }
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            float f8 = 0.0f;
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (!B(childAt)) {
                f2 = f7;
                if (childAt.getVisibility() != 8) {
                    if (childAt == this.F) {
                        if (this.G) {
                            f3 = f5;
                        } else {
                            f3 = 0.0f;
                        }
                        ((qc9) ((hla) childAt)).setSearchCloseMorph(f3);
                        if (this.G) {
                            if (f3 < 1.0f) {
                                f8 = 1.0f;
                            }
                            I(childAt, f8);
                        }
                    }
                    I(childAt, f6);
                }
            } else {
                f2 = f7;
            }
            i2++;
            f7 = f2;
        }
        float f9 = f7;
        rla rlaVar6 = this.e;
        if (rlaVar6 != null) {
            I(rlaVar6, actionModeFactor);
            float R14 = hl.R1(0.7f, 1.0f, actionModeFactor);
            this.e.setPivotX(rlaVar.getWidth() - hl.L(19.0f));
            this.e.setPivotY(rlaVar2.getHeight() / f9);
            this.e.setScaleX(R14);
            this.e.setScaleY(R14);
        }
        in inVar = this.f;
        if (inVar != null) {
            I(inVar, actionModeFactor);
            this.f.setTranslationX((-hl.L(16.0f)) * f4);
        }
        in inVar2 = this.h;
        if (inVar2 != null) {
            I(inVar2, actionModeFactor);
            this.h.setTranslationX((-hl.L(16.0f)) * f4);
        }
        ImageView imageView = this.E;
        if (imageView != null) {
            if (this.G) {
                f = f5;
            } else {
                f = 0.0f;
            }
            I(imageView, f);
            this.E.setScaleX(hl.R1(0.5f, 1.0f, f));
            this.E.setScaleY(hl.R1(0.5f, 1.0f, f));
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            I(frameLayout, f5);
            RectF rectF = this.x0;
            p(rectF);
            this.r.setTranslationX(Math.max(0.0f, rectF.left - getSearchPillLeft()));
        }
        gla glaVar = this.b;
        if (((Drawable) glaVar.b) != null) {
            glaVar.setVisibility(0);
            glaVar.setAlpha(1.0f);
            glaVar.setScaleX(1.0f);
            glaVar.setScaleY(1.0f);
        } else {
            if (actionModeFactor <= 0.0f) {
                i = 8;
            }
            glaVar.setVisibility(i);
            glaVar.setAlpha(actionModeFactor);
            glaVar.setScaleX(hl.R1(0.6f, 1.0f, actionModeFactor));
            glaVar.setScaleY(hl.R1(0.6f, 1.0f, actionModeFactor));
        }
        glaVar.invalidate();
        invalidate();
    }

    public final void m() {
        boolean z;
        if (this.s == null) {
            return;
        }
        o7 searchListener = getSearchListener();
        boolean z2 = true;
        if (this.s.length() <= 0 && ((!C() || (searchListener != null && !searchListener.m())) && (searchListener == null || !searchListener.d()))) {
            z = false;
        } else {
            z = true;
        }
        if (!A() || !this.L) {
            z2 = false;
        }
        this.e0.a(z, z2);
        this.w.setEnabled(z);
    }

    public final void n() {
        o7 searchListener = getSearchListener();
        if (searchListener == null || searchListener.a()) {
            this.x.setVisibility(8);
            m();
            if (searchListener != null) {
                searchListener.f();
            }
        }
    }

    public final void o(boolean z) {
        boolean z2;
        k43 k43Var;
        long j;
        if (this.L) {
            o7 searchListener = getSearchListener();
            if (searchListener == null || searchListener.b()) {
                this.L = false;
                this.s.clearFocus();
                if (z) {
                    hl.t1(this.s);
                }
                rla rlaVar = this.d;
                if (rlaVar != null && rlaVar.getVisibility() != 8 && this.d.getPillWidth() > 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    k43Var = k43.h;
                } else {
                    k43Var = k43.f;
                }
                fm0 fm0Var = this.c0;
                fm0Var.c = k43Var;
                t84 t84Var = fm0Var.h;
                if (t84Var != null) {
                    t84Var.c = k43Var;
                }
                if (z2) {
                    j = 380;
                } else {
                    j = 220;
                }
                fm0Var.d = j;
                if (t84Var != null) {
                    t84Var.d = j;
                }
                fm0Var.a(false, A());
                l();
                if (searchListener != null) {
                    searchListener.h();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j0 = true;
        jn7.e().b(this, jn7.q4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.j0 = false;
        this.i0 = false;
        jn7.e().n(this, jn7.q4);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int g;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        int rowTop = getRowTop();
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        int i7 = i3 - i;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (!B(childAt) && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.gravity, getLayoutDirection()) & 7;
                if (absoluteGravity == 5) {
                    g = i7 - measuredWidth;
                    i6 = layoutParams.rightMargin;
                } else {
                    int i9 = layoutParams.leftMargin;
                    if (absoluteGravity == 1) {
                        g = ik8.g(i7, measuredWidth, 2, i9);
                        i6 = layoutParams.rightMargin;
                    } else {
                        i5 = i9;
                        int g2 = (ik8.g(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                        childAt.layout(i5, g2, measuredWidth + i5, measuredHeight + g2);
                    }
                }
                i5 = g - i6;
                int g22 = (ik8.g(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                childAt.layout(i5, g22, measuredWidth + i5, measuredHeight + g22);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z;
        float f;
        int L;
        int L2;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int rowTop = getRowTop();
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        int i4 = rowTop + currentActionBarHeight + this.h0;
        gla glaVar = this.b;
        boolean z2 = true;
        if (((Drawable) glaVar.b) != null) {
            z = true;
        } else {
            z = false;
        }
        int L3 = ((currentActionBarHeight - hl.L(46.0f)) / 2) + rowTop;
        J(glaVar, hl.L(6.0f), L3, 0);
        rla rlaVar = this.d;
        float f2 = 0.0f;
        if (rlaVar != null && rlaVar.getVisibility() != 8) {
            f = this.d.getTargetPillWidth();
        } else {
            f = 0.0f;
        }
        float x = x(true);
        if (z) {
            L = hl.L(64.0f);
        } else {
            L = hl.L(18.0f);
        }
        if (f <= 0.0f && x <= 0.0f) {
            L2 = 0;
        } else {
            L2 = hl.L(18.0f) + ((int) (f + x));
        }
        int max = Math.max(Math.max(L, L2), this.B0);
        r98 r98Var = this.c;
        if (r98Var.b != max) {
            r98Var.b = max;
            r98Var.requestLayout();
        }
        J(r98Var, 0, rowTop, 0);
        r98Var.getLayoutParams().height = currentActionBarHeight;
        rla rlaVar2 = this.d;
        if (rlaVar2 != null) {
            J(rlaVar2, 0, rowTop, hl.L(10.0f));
            this.d.getLayoutParams().height = currentActionBarHeight;
        }
        rla rlaVar3 = this.e;
        if (rlaVar3 != null) {
            J(rlaVar3, 0, rowTop, hl.L(10.0f));
            this.e.getLayoutParams().height = currentActionBarHeight;
        }
        if (this.f != null) {
            rla rlaVar4 = this.e;
            if (rlaVar4 != null) {
                f2 = rlaVar4.getTargetPillWidth();
            }
            int L4 = hl.L(18.0f) + ((int) f2);
            in inVar = this.h;
            if (inVar == null || inVar.getTag() == null) {
                z2 = false;
            }
            in inVar2 = this.f;
            if (z2) {
                int i5 = (currentActionBarHeight / 2) + rowTop;
                J(inVar2, hl.L(66.0f), i5 - hl.L(22.0f), L4);
                this.f.getLayoutParams().height = hl.L(22.0f);
                J(this.h, hl.L(66.0f), hl.L(1.0f) + i5, L4);
                this.h.getLayoutParams().height = hl.L(18.0f);
            } else {
                J(inVar2, hl.L(66.0f), rowTop, L4);
                this.f.getLayoutParams().height = currentActionBarHeight;
            }
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            int searchPillLeft = (int) getSearchPillLeft();
            int L5 = hl.L(6.0f);
            if (this.G) {
                i3 = hl.L(52.0f);
            } else {
                i3 = 0;
            }
            J(frameLayout, searchPillLeft, L3, L5 + i3);
        }
        ImageView imageView = this.E;
        if (imageView != null) {
            J(imageView, 0, L3, hl.L(6.0f));
        }
        nla nlaVar = this.n;
        if (nlaVar != null) {
            J(nlaVar, 0, L3, hl.L(6.0f));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return !this.C0;
    }

    public final float p(RectF rectF) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int L = hl.L(6.0f);
        float L2 = hl.L(23.0f);
        float currentActionBarHeight = (a.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        rla rlaVar = this.d;
        float f6 = 0.0f;
        if (rlaVar != null && rlaVar.getVisibility() != 8) {
            f = this.d.getPillWidth();
        } else {
            f = 0.0f;
        }
        rla rlaVar2 = this.e;
        if (rlaVar2 != null) {
            f2 = rlaVar2.getPillWidth();
        } else {
            f2 = 0.0f;
        }
        if (f <= 0.0f) {
            if (f2 <= 0.0f) {
                float f7 = (1.0f - actionModeFactor) * searchFactor;
                float L3 = (1.0f - f7) * hl.L(12.0f);
                float R1 = hl.R1(0.85f, 1.0f, f7) * L2;
                float width = getWidth() - L;
                if (this.G) {
                    f6 = (L2 * 2.0f) + L;
                }
                rectF.set(getSearchPillLeft() + L3, currentActionBarHeight - R1, (width - f6) - L3, currentActionBarHeight + R1);
                return f7;
            }
            f3 = actionModeFactor;
            f = f2;
        } else if (f2 <= 0.0f) {
            f3 = 1.0f - actionModeFactor;
        } else {
            f = hl.R1(f, f2, actionModeFactor);
            f3 = 1.0f;
        }
        float f8 = (1.0f - actionModeFactor) * searchFactor;
        float f9 = L2 * 2.0f;
        float f10 = f / f9;
        float R12 = hl.R1(0.8f, 1.0f, f3) * Math.min(1.0f, f10);
        float width2 = (getWidth() - L) - x(false);
        float max = width2 - Math.max(f, f9);
        float f11 = currentActionBarHeight - L2;
        float f12 = currentActionBarHeight + L2;
        if (R12 < 1.0f) {
            float f13 = (max + width2) / 2.0f;
            float B = qu6.B(1.0f, R12, L2, (width2 - max) / 2.0f);
            float f14 = f13 - B;
            width2 = f13 + B;
            float f15 = L2 * R12;
            float f16 = currentActionBarHeight - f15;
            f5 = currentActionBarHeight + f15;
            f4 = f16;
            max = f14;
        } else {
            f4 = f11;
            f5 = f12;
        }
        rectF.set(hl.R1(max, getSearchPillLeft(), f8), hl.R1(f4, f11, f8), hl.R1(width2, getWidth() - L, f8), hl.R1(f5, f12, f8));
        return hl.R1(Math.min(1.0f, f10) * f3, 1.0f, f8);
    }

    public final boolean q(RectF rectF) {
        int L;
        float actionModeFactor = (1.0f - getActionModeFactor()) * getSearchFactor();
        if (this.G && actionModeFactor > 0.0f) {
            int L2 = hl.L(6.0f);
            float L3 = hl.L(23.0f);
            float currentActionBarHeight = (a.getCurrentActionBarHeight() / 2.0f) + getRowTop();
            float width = getWidth() - L2;
            float f = width - (2.0f * L3);
            View view = this.F;
            if (view != null && view.getParent() == this && view.getVisibility() != 8) {
                qc9 qc9Var = (qc9) ((hla) view);
                float L4 = hl.L(6.0f);
                rectF.set(L4, L4, qc9Var.getWidth() - L, qc9Var.getHeight() - L);
                rectF.offset(view.getX(), view.getY());
            } else {
                rectF.set(f, currentActionBarHeight - L3, width, currentActionBarHeight + L3);
            }
            rectF.set(hl.R1(rectF.left, f, actionModeFactor), hl.R1(rectF.top, currentActionBarHeight - L3, actionModeFactor), hl.R1(rectF.right, width, actionModeFactor), hl.R1(rectF.bottom, currentActionBarHeight + L3, actionModeFactor));
            return true;
        }
        return false;
    }

    public final rla r() {
        if (this.e == null) {
            rla rlaVar = new rla(getContext(), this, true);
            this.e = rlaVar;
            View view = this.b;
            addView(rlaVar, indexOfChild(view), tre.e(-2, -2, 53));
            in inVar = new in(getContext(), true, true, true);
            this.f = inVar;
            inVar.setTextSize(hl.L(18.0f));
            this.f.setTypeface(hl.o());
            this.f.setTextColor(this.n0);
            this.f.setGravity(19);
            this.f.setEllipsizeByGradient(true);
            this.f.b(0.6f, 320L, k43.h);
            addView(this.f, indexOfChild(view), tre.e(-1, -2, 51));
            l();
        }
        return this.e;
    }

    public final void s() {
        ll0 ll0Var = this.V;
        if (ll0Var == null) {
            ll0Var = this.S;
        }
        if (ll0Var == null) {
            return;
        }
        bl0 bl0Var = this.U;
        if (bl0Var == null) {
            bl0Var = this.T;
        }
        jl0 c = ll0Var.c(this, null, false);
        c.p(bl0Var);
        ik8.r(c, hl.L(23.0f), 6.0f);
        this.N = c;
        jl0 c2 = ll0Var.c(this, null, false);
        c2.p(bl0Var);
        ik8.r(c2, hl.L(23.0f), 6.0f);
        this.O = c2;
        jl0 c3 = ll0Var.c(this, null, false);
        c3.p(bl0Var);
        ik8.r(c3, hl.L(23.0f), 6.0f);
        this.P = c3;
        jl0 c4 = ll0Var.c(this, null, false);
        c4.p(bl0Var);
        ik8.r(c4, hl.L(23.0f), 6.0f);
        this.Q = c4;
        this.R = hl.L(23.0f);
        invalidate();
    }

    public void setActionBarMenuOnItemClick(d6 d6Var) {
        this.f0 = d6Var;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        this.b.setContentDescription(charSequence);
    }

    public void setBackButtonDrawable(Drawable drawable) {
        this.b.c(drawable);
        l();
        requestLayout();
    }

    public void setBackButtonImage(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = getContext().getDrawable(i).mutate();
        } else {
            drawable = null;
        }
        setBackButtonDrawable(drawable);
    }

    public void setBackButtonImageAnimated(int i) {
        boolean z;
        Drawable mutate = getContext().getDrawable(i).mutate();
        gla glaVar = this.b;
        Drawable drawable = (Drawable) glaVar.b;
        if (drawable != null) {
            z = true;
        } else {
            z = false;
        }
        t84 t84Var = (t84) glaVar.f;
        if (drawable != null && ((jla) glaVar.h).A()) {
            glaVar.c(mutate);
            glaVar.c = (Drawable) glaVar.b;
            t84Var.c(0.0f);
            t84Var.a(1.0f);
        } else {
            glaVar.c(mutate);
        }
        if (!z) {
            l();
            requestLayout();
        }
    }

    public void setButtonsGlass(ll0 ll0Var) {
        this.V = ll0Var;
        if (this.S != null) {
            s();
        }
    }

    public void setButtonsGlassColorProvider(bl0 bl0Var) {
        this.U = bl0Var;
        if (bl0Var == null) {
            bl0Var = this.T;
        }
        jl0 jl0Var = this.N;
        if (jl0Var != null) {
            jl0Var.p(bl0Var);
            this.O.p(bl0Var);
            this.P.p(bl0Var);
            this.Q.p(bl0Var);
        }
        invalidate();
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.b.setEnabled(z);
        rla rlaVar = this.d;
        if (rlaVar != null) {
            rlaVar.setEnabled(z);
        }
        nla nlaVar = this.n;
        if (nlaVar != null) {
            nlaVar.setEnabled(z);
        }
    }

    public void setExtraHeight(int i) {
        if (this.h0 != i) {
            this.h0 = i;
            requestLayout();
        }
    }

    public void setForceSkipTouches(boolean z) {
        this.C0 = z;
    }

    @Override
    public void setMenuGlassFrostedProgress(float f) {
        pz4 pz4Var = this.w0;
        if (pz4Var != null) {
            pz4Var.k(f);
        }
    }

    public void setMenuGlassStroke(boolean z) {
        this.u0 = z;
    }

    public void setMenuOverlayProvider(hcc hccVar) {
        this.W = hccVar;
    }

    public void setMenuPillAlpha(float f) {
        if (this.y0 == f) {
            return;
        }
        this.y0 = f;
        invalidate();
    }

    public void setOccupyStatusBar(boolean z) {
        if (this.g0 != z) {
            this.g0 = z;
            requestLayout();
        }
    }

    public void setSearchCloseAnchor(View view) {
        if (view != null && !(view instanceof hla)) {
            lq5.j("the anchor must implement SearchCloseAnchor");
            return;
        }
        View view2 = this.F;
        if (view2 != null && view2 != view) {
            ((qc9) ((hla) view2)).setSearchCloseMorph(0.0f);
            I(this.F, 1.0f);
        }
        this.F = view;
        l();
    }

    public void setSearchFieldCaption(CharSequence charSequence) {
        int i;
        w();
        this.x.setText(charSequence);
        TextView textView = this.x;
        if (TextUtils.isEmpty(charSequence)) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        m();
    }

    public void setSearchFieldHint(CharSequence charSequence) {
        this.J = charSequence;
        m7 m7Var = this.s;
        if (m7Var != null) {
            m7Var.setHint(charSequence);
        }
    }

    public void setSearchFieldText(CharSequence charSequence) {
        m7 m7Var = this.s;
        if (m7Var == null) {
            this.K = charSequence;
            return;
        }
        m7Var.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            this.s.setSelection(charSequence.length());
        }
    }

    public void setSearchItem(sla slaVar) {
        if (slaVar == null && this.I != null && this.L) {
            o(true);
        }
        this.I = slaVar;
    }

    public void setSubtitle(CharSequence charSequence) {
        this.c.c(charSequence);
    }

    public void setSubtitleAnimated(CharSequence charSequence) {
        if (!A()) {
            setSubtitle(charSequence);
            return;
        }
        r98 r98Var = this.c;
        ema emaVar = (ema) r98Var.d;
        if (emaVar != null && emaVar.getVisibility() != 8 && !TextUtils.isEmpty(charSequence) && !TextUtils.equals((CharSequence) r98Var.f, charSequence)) {
            r98Var.f = charSequence;
            ema emaVar2 = (ema) r98Var.e;
            if (emaVar2 == null) {
                emaVar2 = r98Var.a();
                r98Var.e = emaVar2;
            }
            ema emaVar3 = (ema) r98Var.d;
            r98Var.d = emaVar2;
            r98Var.e = emaVar3;
            emaVar2.animate().cancel();
            ((ema) r98Var.d).l(charSequence, false);
            ((ema) r98Var.d).setVisibility(0);
            ((ema) r98Var.d).setAlpha(0.0f);
            ((ema) r98Var.d).setTranslationY(hl.L(6.0f));
            ViewPropertyAnimator duration = ((ema) r98Var.d).animate().alpha(1.0f).translationY(0.0f).setDuration(380L);
            k43 k43Var = k43.h;
            duration.setInterpolator(k43Var).start();
            emaVar3.animate().cancel();
            emaVar3.animate().alpha(0.0f).translationY(-hl.L(6.0f)).setDuration(380L).setInterpolator(k43Var).withEndAction(new ila(emaVar3, (byte) 0)).start();
            r98Var.requestLayout();
        } else if (!TextUtils.equals((CharSequence) r98Var.f, charSequence)) {
            r98Var.c(charSequence);
        }
    }

    public void setSubtitleColor(int i) {
        this.r0 = true;
        this.l0 = i;
        this.c.d();
    }

    public void setTitle(CharSequence charSequence) {
        r98 r98Var = this.c;
        int i = 0;
        r98Var.b(0);
        ema[] emaVarArr = (ema[]) r98Var.c;
        ema emaVar = emaVarArr[1];
        if (emaVar != null) {
            emaVar.animate().cancel();
            emaVarArr[1].setVisibility(8);
        }
        emaVarArr[0].animate().cancel();
        emaVarArr[0].setAlpha(1.0f);
        emaVarArr[0].setTranslationY(0.0f);
        emaVarArr[0].k(charSequence);
        ema emaVar2 = emaVarArr[0];
        if (TextUtils.isEmpty(charSequence)) {
            i = 4;
        }
        emaVar2.setVisibility(i);
    }

    public void setTitleColor(int i) {
        this.q0 = true;
        this.k0 = i;
        this.c.d();
    }

    public void setTitleMinSideInset(int i) {
        if (this.B0 != i) {
            this.B0 = i;
            requestLayout();
        }
    }

    public void setTitlesAlpha(float f) {
        if (this.D0 != f) {
            this.D0 = f;
            l();
        }
    }

    @Override
    public void t(int i, float f, float f2, t84 t84Var) {
        int i2;
        if (i == 2) {
            ImageView imageView = this.w;
            if (imageView != null) {
                imageView.setAlpha(f);
                float f3 = (f * 0.5f) + 0.5f;
                this.w.setScaleX(f3);
                this.w.setScaleY(f3);
                ImageView imageView2 = this.w;
                if (this.G) {
                    i2 = 8;
                } else if (f > 0.0f) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                imageView2.setVisibility(i2);
                return;
            }
            return;
        }
        l();
    }

    public final nla u(String str) {
        if (this.n == null) {
            nla nlaVar = new nla(getContext(), this, str);
            this.n = nlaVar;
            addView(nlaVar, indexOfChild(this.b), tre.e(-2, 46, 53));
            l();
        }
        return this.n;
    }

    @Override
    public final void updateColors() {
        G();
        this.c.d();
        this.b.d();
        rla rlaVar = this.d;
        if (rlaVar != null) {
            rlaVar.h();
        }
        rla rlaVar2 = this.e;
        if (rlaVar2 != null) {
            rlaVar2.h();
        }
        in inVar = this.f;
        if (inVar != null) {
            inVar.setTextColor(this.n0);
        }
        nla nlaVar = this.n;
        if (nlaVar != null) {
            nlaVar.c();
        }
        in inVar2 = this.h;
        if (inVar2 != null) {
            inVar2.setTextColor(this.l0);
        }
        if (this.s != null) {
            N();
        }
        jl0 jl0Var = this.N;
        if (jl0Var != null) {
            jl0Var.updateColors();
        }
        jl0 jl0Var2 = this.O;
        if (jl0Var2 != null) {
            jl0Var2.updateColors();
        }
        invalidate();
    }

    public final rla v() {
        if (this.d == null) {
            rla rlaVar = new rla(getContext(), this, false);
            this.d = rlaVar;
            addView(rlaVar, indexOfChild(this.b), tre.e(-2, -2, 53));
            l();
        }
        return this.d;
    }

    public final void w() {
        if (this.r != null) {
            return;
        }
        Context context = getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setVisibility(4);
        addView(this.r, indexOfChild(this.b), tre.e(-1, 46, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.y = linearLayout;
        linearLayout.setOrientation(0);
        this.r.addView(this.y, tre.d(-1, -1.0f, 51, 18.0f, 0.0f, 42.0f, 0.0f));
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setTextSize(1, 17.0f);
        this.x.setSingleLine(true);
        this.x.setEllipsize(TextUtils.TruncateAt.END);
        this.x.setGravity(19);
        this.x.setPadding(0, 0, hl.L(4.0f), 0);
        this.x.setVisibility(8);
        this.y.addView(this.x, tre.o(-2, -1));
        m7 m7Var = new m7((byte) 7, context, this);
        this.s = m7Var;
        m7Var.setTextSize(1, 17.0f);
        this.s.setSingleLine(true);
        this.s.setBackground(null);
        this.s.setPadding(0, 0, 0, 0);
        this.s.setGravity(19);
        m7 m7Var2 = this.s;
        m7Var2.setInputType(m7Var2.getInputType() | 524288);
        this.s.setImeOptions(33554435);
        this.s.setTextIsSelectable(false);
        this.s.setCursorSize(hl.L(20.0f));
        this.s.setCursorWidth(1.5f);
        CharSequence charSequence = this.J;
        if (charSequence != null) {
            this.s.setHint(charSequence);
        }
        this.s.setOnEditorActionListener(new j(this, (byte) 25));
        this.s.addTextChangedListener(new nh6(this, (byte) 14));
        this.y.addView(this.s, tre.l(1.0f, 0, -1));
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.w.setImageResource(2131231272);
        this.w.setContentDescription(ob6.M0(2131752064, null));
        this.w.setOnClickListener(new fla(this, (byte) 1));
        this.r.addView(this.w, tre.d(42, 42.0f, 21, 0.0f, 0.0f, 2.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.E = imageView2;
        imageView2.setScaleType(scaleType);
        this.E.setImageResource(2131231272);
        this.E.setContentDescription(ob6.M0(2131752006, null));
        this.E.setVisibility(8);
        this.E.setOnClickListener(new fla(this, (byte) 2));
        addView(this.E, tre.e(46, 46, 53));
        N();
        m();
        t(2, this.e0.e, 0.0f, null);
    }

    public final float x(boolean z) {
        float actionModeFactor;
        nla nlaVar = this.n;
        if (nlaVar != null) {
            if (nlaVar.getVisibility() != 8 || !z) {
                nla nlaVar2 = this.n;
                if (z) {
                    actionModeFactor = nlaVar2.getTargetVisibleFactor();
                } else {
                    actionModeFactor = (1.0f - getActionModeFactor()) * (1.0f - getSearchFactor()) * nlaVar2.getVisibleFactor();
                }
                return (hl.L(12.0f) + this.n.getButtonWidth()) * actionModeFactor;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void y() {
        rla rlaVar = this.e;
        if (rlaVar != null && this.M) {
            this.M = false;
            rlaVar.f();
            this.d0.a(false, A());
            l();
            this.b.b(false, A());
            jn7.e().k(jn7.u4, new Object[0]);
        }
    }

    public final boolean z() {
        if (this.e != null && this.M) {
            return true;
        }
        return false;
    }

    @Override
    public View getMenuHostView() {
        return this;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void v0(float f, int i) {
    }
}
