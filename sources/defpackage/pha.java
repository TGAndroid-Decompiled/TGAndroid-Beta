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
public class pha extends FrameLayout implements x74, gk7, tjb, h07, as5 {
    public CharSequence E;
    public CharSequence F;
    public boolean G;
    public boolean H;
    public il0 I;
    public il0 J;
    public il0 K;
    public float L;
    public kl0 M;
    public nl0 N;
    public al0 O;
    public kl0 P;
    public h8c Q;
    public zha R;
    public r7 S;
    public final fm0 T;
    public final fm0 U;
    public final fm0 V;
    public c6 W;
    public final wjb a;
    public boolean a0;
    public final nha b;
    public int b0;
    public final a68 c;
    public boolean c0;
    public wha d;
    public boolean d0;
    public wha e;
    public int e0;
    public hn f;
    public int f0;
    public int g0;
    public hn h;
    public int h0;
    public int i0;
    public int j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public sha n;
    public boolean n0;
    public boolean o0;
    public kl0 p0;
    public jx4 q0;
    public FrameLayout r;
    public final RectF r0;
    public l7 s;
    public final Path s0;
    public final RectF t0;
    public int u0;
    public boolean v0;
    public ImageView w;
    public float w0;
    public TextView x;
    public xha y;

    public pha(Context context, wjb wjbVar) {
        super(context);
        this.L = -1.0f;
        s33 s33Var = s33.h;
        this.T = new fm0(0, this, s33Var, 380L, false);
        this.U = new fm0(1, this, s33Var, 380L, false);
        this.V = new fm0(2, this, s33Var, 250L, false);
        this.a0 = true;
        this.o0 = true;
        this.r0 = new RectF();
        this.s0 = new Path();
        this.t0 = new RectF();
        this.w0 = 1.0f;
        this.a = wjbVar;
        setClipChildren(false);
        setWillNotDraw(false);
        E();
        a68 a68Var = new a68(this, context);
        this.c = a68Var;
        addView(a68Var, nme.e(-1, -2, 51));
        nha nhaVar = new nha(this, context);
        this.b = nhaVar;
        nhaVar.setVisibility(8);
        nhaVar.setContentDescription(k96.M0(2131754878, null));
        nhaVar.setOnClickListener(new mha(this, (byte) 0));
        addView(nhaVar, nme.e(46, 46, 51));
    }

    public static void G(View view, float f) {
        int i;
        view.setAlpha(f);
        if (f > 0.0f) {
            i = 0;
        } else {
            i = 4;
        }
        view.setVisibility(i);
    }

    public static void H(View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i;
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.rightMargin = i3;
    }

    private int getRowTop() {
        if (this.a0) {
            return gl.m;
        }
        return 0;
    }

    public n7 getSearchListener() {
        xha xhaVar = this.y;
        if (xhaVar != null) {
            return xhaVar.getSearchListener();
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
        return gl.L(f);
    }

    public static n7 i(pha phaVar) {
        return phaVar.getSearchListener();
    }

    public final void A(int i, KeyEvent keyEvent) {
        if (i != 3) {
            if (keyEvent != null) {
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return;
                }
            } else {
                return;
            }
        }
        gl.t1(this.s);
        n7 searchListener = getSearchListener();
        if (searchListener != null) {
            searchListener.k(this.s);
        }
    }

    public final boolean B() {
        zha zhaVar = this.R;
        if (zhaVar != null) {
            zhaVar.a(true);
            return true;
        } else if (!this.H && this.G) {
            n(true);
            return true;
        } else {
            return false;
        }
    }

    public final boolean C(boolean z, boolean z2) {
        n7 searchListener;
        boolean z3 = false;
        if (this.y == null || this.G || this.H || ((searchListener = getSearchListener()) != null && !searchListener.c())) {
            return false;
        }
        u();
        this.G = true;
        wha whaVar = this.d;
        if (whaVar != null) {
            whaVar.f();
        }
        l7 l7Var = this.s;
        CharSequence charSequence = this.F;
        if (charSequence == null) {
            charSequence = "";
        }
        l7Var.setText(charSequence);
        this.F = null;
        this.s.requestFocus();
        if (z) {
            gl.F3(this.s);
        }
        if (z2 && y()) {
            z3 = true;
        }
        this.T.a(true, z3);
        k();
        if (searchListener != null) {
            searchListener.i();
        }
        return true;
    }

    public final void E() {
        boolean z = this.k0;
        wjb wjbVar = this.a;
        if (!z) {
            this.e0 = bkb.v0(bkb.F6, wjbVar);
        }
        if (!this.l0) {
            this.f0 = bkb.v0(bkb.x6, wjbVar);
        }
        if (!this.m0) {
            this.g0 = bkb.v0(bkb.F6, wjbVar);
        }
        this.h0 = bkb.v0(bkb.F6, wjbVar);
        if (!this.n0) {
            this.i0 = bkb.v0(bkb.h6, wjbVar);
        }
        this.j0 = bkb.v0(bkb.h6, wjbVar);
    }

    public final void F(int i, boolean z) {
        boolean z2;
        String E = k96.E(i, ' ');
        q();
        hn hnVar = this.f;
        if (z && y() && this.H) {
            z2 = true;
        } else {
            z2 = false;
        }
        hnVar.c(E, z2, true);
    }

    public final void I(CharSequence charSequence, boolean z, long j, s33 s33Var) {
        int L;
        if (!y()) {
            setTitle(charSequence);
            return;
        }
        a68 a68Var = this.c;
        a68Var.b(0);
        a68Var.b(1);
        jia[] jiaVarArr = (jia[]) a68Var.c;
        jia jiaVar = jiaVarArr[0];
        jia jiaVar2 = jiaVarArr[1];
        jiaVarArr[0] = jiaVar2;
        jiaVarArr[1] = jiaVar;
        jiaVar2.animate().cancel();
        jiaVar2.k(charSequence);
        jiaVar2.setVisibility(0);
        jiaVar2.setAlpha(0.0f);
        int L2 = gl.L(16.0f);
        if (!z) {
            L2 = -L2;
        }
        jiaVar2.setTranslationY(L2);
        jiaVar2.animate().alpha(1.0f).translationY(0.0f).setDuration(j).setInterpolator(s33Var).start();
        jiaVar.animate().cancel();
        ViewPropertyAnimator alpha = jiaVar.animate().alpha(0.0f);
        if (z) {
            L = -gl.L(16.0f);
        } else {
            L = gl.L(16.0f);
        }
        alpha.translationY(L).setDuration(j).setInterpolator(s33Var).withEndAction(new oha(jiaVar, (byte) 1)).start();
        a68Var.requestLayout();
    }

    public final void J() {
        if (this.e != null && !this.H) {
            this.H = true;
            wha whaVar = this.d;
            if (whaVar != null) {
                whaVar.f();
            }
            l7 l7Var = this.s;
            if (l7Var != null && this.G) {
                gl.t1(l7Var);
            }
            this.U.a(true, y());
            k();
            this.b.b(true, y());
            kk7.e().k(kk7.t4, new Object[0]);
        }
    }

    public final void K() {
        l7 l7Var = this.s;
        int i = bkb.F6;
        wjb wjbVar = this.a;
        l7Var.setTextColor(bkb.v0(i, wjbVar));
        this.x.setTextColor(bkb.v0(i, wjbVar));
        this.s.setHintTextColor(bkb.v0(bkb.G6, wjbVar));
        this.s.setCursorColor(bkb.v0(i, wjbVar));
        this.s.setHighlightColor(bkb.v0(bkb.kg, wjbVar));
        this.s.setHandlesColor(bkb.v0(bkb.lg, wjbVar));
        this.w.setColorFilter(new PorterDuffColorFilter(bkb.v0(bkb.l6, wjbVar), PorterDuff.Mode.SRC_IN));
        this.w.setBackground(bkb.f0(this.i0, 1, -1));
    }

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final void b(zha zhaVar, r7 r7Var) {
        this.R = zhaVar;
        this.S = r7Var;
        invalidate();
    }

    @Override
    public final boolean c(r7 r7Var, RectF rectF) {
        float f = 0.0f;
        if (r7Var.getParent() == this.d && getSearchFactor() == 0.0f && getActionModeFactor() == 0.0f) {
            o(rectF);
            return true;
        }
        float L = gl.L(23.0f);
        View view = (View) r7Var.getParent();
        if (view != null) {
            f = view.getX();
        }
        float width = (r7Var.getWidth() / 2.0f) + r7Var.getX() + f;
        float currentActionBarHeight = (a.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        rectF.set(width - L, currentActionBarHeight - L, width + L, currentActionBarHeight + L);
        return false;
    }

    @Override
    public final void d(yr5 yr5Var) {
        sha shaVar;
        if (this.I != null) {
            nha nhaVar = this.b;
            if (nhaVar.getVisibility() == 0 && nhaVar.getAlpha() > 0.0f) {
                j(nhaVar, yr5Var);
            }
        }
        if (this.K != null && (shaVar = this.n) != null && shaVar.c == rha.a && shaVar.getVisibility() == 0 && this.n.getAlpha() > 0.0f) {
            j(this.n, yr5Var);
        }
        il0 il0Var = this.J;
        Path path = this.s0;
        if (il0Var != null) {
            RectF rectF = this.t0;
            if (o(rectF) > 0.0f && rectF.width() > 0.0f) {
                path.rewind();
                path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
                yr5Var.a(path);
            }
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (!z(childAt) && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && (childAt.getBackground() instanceof il0)) {
                path.rewind();
                path.addPath(((il0) childAt.getBackground()).S.k, childAt.getX(), childAt.getY());
                yr5Var.a(path);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.p4) {
            updateColors();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        sha shaVar;
        this.c0 = this.d0;
        int L = gl.L(6.0f);
        if (this.I != null) {
            nha nhaVar = this.b;
            if (nhaVar.getVisibility() == 0 && nhaVar.getAlpha() > 0.0f) {
                float width = (nhaVar.getWidth() / 2.0f) + nhaVar.getX();
                float height = (nhaVar.getHeight() / 2.0f) + nhaVar.getY();
                float scaleX = nhaVar.getScaleX() * (nhaVar.getWidth() / 2.0f);
                float scaleY = nhaVar.getScaleY() * (nhaVar.getHeight() / 2.0f);
                this.I.setBounds(((int) (width - scaleX)) - L, ((int) (height - scaleY)) - L, ((int) (width + scaleX)) + L, ((int) (height + scaleY)) + L);
                this.I.setAlpha((int) (nhaVar.getAlpha() * 255.0f));
                this.I.draw(canvas);
            }
        }
        if (this.K != null && (shaVar = this.n) != null && shaVar.c == rha.a && shaVar.getVisibility() == 0 && this.n.getAlpha() > 0.0f) {
            float width2 = (this.n.getWidth() / 2.0f) + this.n.getX();
            float height2 = (this.n.getHeight() / 2.0f) + this.n.getY();
            float scaleX2 = this.n.getScaleX() * (this.n.getWidth() / 2.0f);
            float scaleY2 = this.n.getScaleY() * (this.n.getHeight() / 2.0f);
            this.K.setBounds(((int) (width2 - scaleX2)) - L, ((int) (height2 - scaleY2)) - L, ((int) (width2 + scaleX2)) + L, ((int) (height2 + scaleY2)) + L);
            this.K.setAlpha((int) (this.n.getAlpha() * 255.0f));
            this.K.draw(canvas);
        }
        if (this.J != null) {
            RectF rectF = this.r0;
            float o = o(rectF);
            r7 r7Var = this.S;
            if (r7Var != null && r7Var.getParent() == this.d) {
                z = true;
            } else {
                z = false;
            }
            if (o > 0.0f && rectF.width() > 0.0f && !z) {
                float height3 = rectF.height() / 2.0f;
                if (Math.abs(height3 - this.L) > 0.5f) {
                    this.L = height3;
                    this.J.r(height3);
                }
                this.J.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                this.J.setAlpha((int) (o * 255.0f));
                this.J.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        r7 r7Var;
        if (view == this.d && (r7Var = this.S) != null && r7Var.getParent() == this.d) {
            return false;
        }
        if (view == this.r && getSearchFactor() < 1.0f) {
            RectF rectF = this.r0;
            o(rectF);
            canvas.save();
            canvas.clipRect(rectF);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final boolean f() {
        return this.o0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    public c6 getActionBarMenuOnItemClick() {
        return this.W;
    }

    public wha getActionMode() {
        return this.e;
    }

    public float getActionModeFactor() {
        return this.U.e;
    }

    public hn getActionModeTitle() {
        q();
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
        al0 al0Var = this.O;
        if (al0Var == null) {
            al0Var = this.N;
        }
        if (al0Var != null) {
            return al0Var.t1();
        }
        return 0;
    }

    @Override
    public al0 getButtonsGlassColorProvider() {
        al0 al0Var = this.O;
        if (al0Var != null) {
            return al0Var;
        }
        return this.N;
    }

    public sha getDoneButton() {
        return this.n;
    }

    public int getExtraHeight() {
        return this.b0;
    }

    public wha getMenu() {
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
    public al0 getMenuGlassColorProvider() {
        return this.N;
    }

    @Override
    public int getMenuMaxHeight() {
        return 0;
    }

    public zha getMenuOverlay() {
        h8c h8cVar = this.Q;
        if (h8cVar != null) {
            return (zha) h8cVar.run();
        }
        return null;
    }

    public float getMenuPillLeft() {
        RectF rectF = this.r0;
        o(rectF);
        return rectF.left;
    }

    @Override
    public wjb getMenuResourcesProvider() {
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
        return this.a0;
    }

    @Override
    public zha getOpenMenuOverlay() {
        return this.R;
    }

    public float getSearchFactor() {
        return this.T.e;
    }

    public EditTextBoldCursor getSearchField() {
        u();
        return this.s;
    }

    public String getSubtitle() {
        CharSequence charSequence = (CharSequence) this.c.f;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public jia getSubtitleTextView() {
        return (jia) this.c.d;
    }

    public String getTitle() {
        CharSequence charSequence;
        jia jiaVar = ((jia[]) this.c.c)[0];
        if (jiaVar != null) {
            charSequence = jiaVar.getText();
        } else {
            charSequence = null;
        }
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        a68 a68Var = this.c;
        a68Var.b(0);
        return ((jia[]) a68Var.c)[0].getTextPaint().getFontMetricsInt();
    }

    public jia getTitleTextView() {
        return ((jia[]) this.c.c)[0];
    }

    public jia getTitleTextView2() {
        return ((jia[]) this.c.c)[1];
    }

    public float getTitlesAlpha() {
        return this.w0;
    }

    @Override
    public final il0 h(zha zhaVar) {
        kl0 kl0Var = this.p0;
        if (kl0Var == null) {
            kl0Var = this.M;
        }
        if (kl0Var == null) {
            return null;
        }
        il0 c = kl0Var.c(zhaVar, null, false);
        c.p(this.N);
        ug8.r(c, gl.L(23.0f), 6.0f);
        return c;
    }

    public final void j(View view, yr5 yr5Var) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        float height = (view.getHeight() / 2.0f) + view.getY();
        float scaleX = view.getScaleX() * (view.getWidth() / 2.0f);
        float scaleY = view.getScaleY() * (view.getHeight() / 2.0f);
        RectF rectF = this.t0;
        rectF.set(width - scaleX, height - scaleY, width + scaleX, height + scaleY);
        Path path = this.s0;
        path.rewind();
        path.addRoundRect(rectF, scaleY, scaleY, Path.Direction.CW);
        yr5Var.a(path);
    }

    public final void k() {
        wha whaVar;
        wha whaVar2;
        wha whaVar3;
        wha whaVar4;
        float R1;
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        float f = 1.0f - actionModeFactor;
        float f2 = searchFactor * f;
        float f3 = (1.0f - searchFactor) * f;
        float R12 = gl.R1(1.0f, 0.94f, Math.max(searchFactor, actionModeFactor));
        a68 a68Var = this.c;
        G(a68Var, this.w0 * f3);
        a68Var.setScaleX(R12);
        a68Var.setScaleY(R12);
        sha shaVar = this.n;
        if (shaVar != null) {
            float visibleFactor = shaVar.getVisibleFactor() * f3;
            G(this.n, visibleFactor);
            if (this.n.c == rha.a) {
                R1 = gl.R1(0.6f, 1.0f, visibleFactor);
            } else {
                R1 = gl.R1(0.8f, 1.0f, f3);
            }
            this.n.setScaleX(R1);
            this.n.setScaleY(R1);
        }
        wha whaVar5 = this.d;
        int i = 0;
        if (whaVar5 != null) {
            whaVar5.setTranslationX(-v(false));
            G(this.d, f3);
            float R13 = gl.R1(0.7f, 1.0f, f3);
            this.d.setPivotX(whaVar3.getWidth() - gl.L(19.0f));
            this.d.setPivotY(whaVar4.getHeight() / 2.0f);
            this.d.setScaleX(R13);
            this.d.setScaleY(R13);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (!z(childAt) && childAt.getVisibility() != 8) {
                G(childAt, f3);
            }
        }
        wha whaVar6 = this.e;
        if (whaVar6 != null) {
            G(whaVar6, actionModeFactor);
            float R14 = gl.R1(0.7f, 1.0f, actionModeFactor);
            this.e.setPivotX(whaVar.getWidth() - gl.L(19.0f));
            this.e.setPivotY(whaVar2.getHeight() / 2.0f);
            this.e.setScaleX(R14);
            this.e.setScaleY(R14);
        }
        hn hnVar = this.f;
        if (hnVar != null) {
            G(hnVar, actionModeFactor);
            this.f.setTranslationX((-gl.L(16.0f)) * f);
        }
        hn hnVar2 = this.h;
        if (hnVar2 != null) {
            G(hnVar2, actionModeFactor);
            this.h.setTranslationX((-gl.L(16.0f)) * f);
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            G(frameLayout, f2);
            RectF rectF = this.r0;
            o(rectF);
            this.r.setTranslationX(Math.max(0.0f, rectF.left - getSearchPillLeft()));
        }
        nha nhaVar = this.b;
        if (((Drawable) nhaVar.b) != null) {
            nhaVar.setVisibility(0);
            nhaVar.setAlpha(1.0f);
            nhaVar.setScaleX(1.0f);
            nhaVar.setScaleY(1.0f);
        } else {
            if (actionModeFactor <= 0.0f) {
                i = 8;
            }
            nhaVar.setVisibility(i);
            nhaVar.setAlpha(actionModeFactor);
            nhaVar.setScaleX(gl.R1(0.6f, 1.0f, actionModeFactor));
            nhaVar.setScaleY(gl.R1(0.6f, 1.0f, actionModeFactor));
        }
        nhaVar.invalidate();
        invalidate();
    }

    public final void l() {
        boolean z;
        TextView textView;
        if (this.s == null) {
            return;
        }
        n7 searchListener = getSearchListener();
        boolean z2 = true;
        if (this.s.length() <= 0 && (((textView = this.x) == null || textView.getVisibility() != 0 || (searchListener != null && !searchListener.m())) && (searchListener == null || !searchListener.d()))) {
            z = false;
        } else {
            z = true;
        }
        if (!y() || !this.G) {
            z2 = false;
        }
        this.V.a(z, z2);
        this.w.setEnabled(z);
    }

    public final void m() {
        n7 searchListener = getSearchListener();
        if (searchListener == null || searchListener.a()) {
            this.x.setVisibility(8);
            l();
            if (searchListener != null) {
                searchListener.f();
            }
        }
    }

    public final void n(boolean z) {
        if (this.G) {
            n7 searchListener = getSearchListener();
            if (searchListener == null || searchListener.b()) {
                this.G = false;
                this.s.clearFocus();
                if (z) {
                    gl.t1(this.s);
                }
                this.T.a(false, y());
                k();
                if (searchListener != null) {
                    searchListener.h();
                }
            }
        }
    }

    public final float o(RectF rectF) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int L = gl.L(6.0f);
        float L2 = gl.L(23.0f);
        float currentActionBarHeight = (a.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        wha whaVar = this.d;
        if (whaVar != null && whaVar.getVisibility() != 8) {
            f = this.d.getPillWidth();
        } else {
            f = 0.0f;
        }
        wha whaVar2 = this.e;
        if (whaVar2 != null) {
            f2 = whaVar2.getPillWidth();
        } else {
            f2 = 0.0f;
        }
        if (f <= 0.0f) {
            f3 = actionModeFactor;
            f = f2;
        } else if (f2 <= 0.0f) {
            f3 = 1.0f - actionModeFactor;
        } else {
            f = gl.R1(f, f2, actionModeFactor);
            f3 = 1.0f;
        }
        float f6 = (1.0f - actionModeFactor) * searchFactor;
        float f7 = L2 * 2.0f;
        float f8 = f / f7;
        float R1 = gl.R1(0.8f, 1.0f, f3) * Math.min(1.0f, f8);
        float width = (getWidth() - L) - v(false);
        float max = width - Math.max(f, f7);
        float f9 = currentActionBarHeight - L2;
        float f10 = currentActionBarHeight + L2;
        if (R1 < 1.0f) {
            float f11 = (max + width) / 2.0f;
            float B = ls6.B(1.0f, R1, L2, (width - max) / 2.0f);
            float f12 = f11 - B;
            width = f11 + B;
            float f13 = L2 * R1;
            float f14 = currentActionBarHeight - f13;
            f5 = currentActionBarHeight + f13;
            f4 = f14;
            max = f12;
        } else {
            f4 = f9;
            f5 = f10;
        }
        rectF.set(gl.R1(max, getSearchPillLeft(), f6), gl.R1(f4, f9, f6), gl.R1(width, getWidth() - L, f6), gl.R1(f5, f10, f6));
        return gl.R1(Math.min(1.0f, f8) * f3, 1.0f, f6);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d0 = true;
        kk7.e().b(this, kk7.p4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d0 = false;
        this.c0 = false;
        kk7.e().n(this, kk7.p4);
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
            if (!z(childAt) && childAt.getVisibility() != 8) {
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
                        g = ug8.g(i7, measuredWidth, 2, i9);
                        i6 = layoutParams.rightMargin;
                    } else {
                        i5 = i9;
                        int g2 = (ug8.g(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                        childAt.layout(i5, g2, measuredWidth + i5, measuredHeight + g2);
                    }
                }
                i5 = g - i6;
                int g22 = (ug8.g(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
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
        int size = View.MeasureSpec.getSize(i);
        int rowTop = getRowTop();
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        int i3 = rowTop + currentActionBarHeight + this.b0;
        nha nhaVar = this.b;
        boolean z2 = true;
        if (((Drawable) nhaVar.b) != null) {
            z = true;
        } else {
            z = false;
        }
        int L3 = ((currentActionBarHeight - gl.L(46.0f)) / 2) + rowTop;
        H(nhaVar, gl.L(6.0f), L3, 0);
        wha whaVar = this.d;
        float f2 = 0.0f;
        if (whaVar != null && whaVar.getVisibility() != 8) {
            f = this.d.getTargetPillWidth();
        } else {
            f = 0.0f;
        }
        float v = v(true);
        if (z) {
            L = gl.L(64.0f);
        } else {
            L = gl.L(18.0f);
        }
        if (f <= 0.0f && v <= 0.0f) {
            L2 = 0;
        } else {
            L2 = gl.L(18.0f) + ((int) (f + v));
        }
        int max = Math.max(Math.max(L, L2), this.u0);
        a68 a68Var = this.c;
        if (a68Var.b != max) {
            a68Var.b = max;
            a68Var.requestLayout();
        }
        H(a68Var, 0, rowTop, 0);
        a68Var.getLayoutParams().height = currentActionBarHeight;
        wha whaVar2 = this.d;
        if (whaVar2 != null) {
            H(whaVar2, 0, rowTop, gl.L(10.0f));
            this.d.getLayoutParams().height = currentActionBarHeight;
        }
        wha whaVar3 = this.e;
        if (whaVar3 != null) {
            H(whaVar3, 0, rowTop, gl.L(10.0f));
            this.e.getLayoutParams().height = currentActionBarHeight;
        }
        if (this.f != null) {
            wha whaVar4 = this.e;
            if (whaVar4 != null) {
                f2 = whaVar4.getTargetPillWidth();
            }
            int L4 = gl.L(18.0f) + ((int) f2);
            hn hnVar = this.h;
            if (hnVar == null || hnVar.getTag() == null) {
                z2 = false;
            }
            hn hnVar2 = this.f;
            if (z2) {
                int i4 = (currentActionBarHeight / 2) + rowTop;
                H(hnVar2, gl.L(66.0f), i4 - gl.L(22.0f), L4);
                this.f.getLayoutParams().height = gl.L(22.0f);
                H(this.h, gl.L(66.0f), gl.L(1.0f) + i4, L4);
                this.h.getLayoutParams().height = gl.L(18.0f);
            } else {
                H(hnVar2, gl.L(66.0f), rowTop, L4);
                this.f.getLayoutParams().height = currentActionBarHeight;
            }
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            H(frameLayout, (int) getSearchPillLeft(), L3, gl.L(6.0f));
        }
        sha shaVar = this.n;
        if (shaVar != null) {
            H(shaVar, 0, L3, gl.L(6.0f));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return !this.v0;
    }

    public void p(int i, float f, float f2, y74 y74Var) {
        int i2;
        if (i == 2) {
            ImageView imageView = this.w;
            if (imageView != null) {
                imageView.setAlpha(f);
                float f3 = (f * 0.5f) + 0.5f;
                this.w.setScaleX(f3);
                this.w.setScaleY(f3);
                ImageView imageView2 = this.w;
                if (f > 0.0f) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                imageView2.setVisibility(i2);
                return;
            }
            return;
        }
        k();
    }

    public final wha q() {
        if (this.e == null) {
            wha whaVar = new wha(getContext(), this, true);
            this.e = whaVar;
            View view = this.b;
            addView(whaVar, indexOfChild(view), nme.e(-2, -2, 53));
            hn hnVar = new hn(getContext(), true, true, true);
            this.f = hnVar;
            hnVar.setTextSize(gl.L(18.0f));
            this.f.setTypeface(gl.o());
            this.f.setTextColor(this.h0);
            this.f.setGravity(19);
            this.f.setEllipsizeByGradient(true);
            this.f.b(0.6f, 320L, s33.h);
            addView(this.f, indexOfChild(view), nme.e(-1, -2, 51));
            k();
        }
        return this.e;
    }

    public final void r() {
        kl0 kl0Var = this.P;
        if (kl0Var == null) {
            kl0Var = this.M;
        }
        if (kl0Var == null) {
            return;
        }
        al0 al0Var = this.O;
        if (al0Var == null) {
            al0Var = this.N;
        }
        il0 c = kl0Var.c(this, null, false);
        c.p(al0Var);
        ug8.r(c, gl.L(23.0f), 6.0f);
        this.I = c;
        il0 c2 = kl0Var.c(this, null, false);
        c2.p(al0Var);
        ug8.r(c2, gl.L(23.0f), 6.0f);
        this.J = c2;
        il0 c3 = kl0Var.c(this, null, false);
        c3.p(al0Var);
        ug8.r(c3, gl.L(23.0f), 6.0f);
        this.K = c3;
        this.L = gl.L(23.0f);
        invalidate();
    }

    public final sha s(String str) {
        if (this.n == null) {
            sha shaVar = new sha(getContext(), this, str);
            this.n = shaVar;
            addView(shaVar, indexOfChild(this.b), nme.e(-2, 46, 53));
            k();
        }
        return this.n;
    }

    public void setActionBarMenuOnItemClick(c6 c6Var) {
        this.W = c6Var;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        this.b.setContentDescription(charSequence);
    }

    public void setBackButtonDrawable(Drawable drawable) {
        this.b.c(drawable);
        k();
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
        nha nhaVar = this.b;
        Drawable drawable = (Drawable) nhaVar.b;
        if (drawable != null) {
            z = true;
        } else {
            z = false;
        }
        y74 y74Var = (y74) nhaVar.f;
        if (drawable != null && ((pha) nhaVar.h).y()) {
            nhaVar.c(mutate);
            nhaVar.c = (Drawable) nhaVar.b;
            y74Var.c(0.0f);
            y74Var.a(1.0f);
        } else {
            nhaVar.c(mutate);
        }
        if (!z) {
            k();
            requestLayout();
        }
    }

    public void setButtonsGlass(kl0 kl0Var) {
        this.P = kl0Var;
        if (this.M != null) {
            r();
        }
    }

    public void setButtonsGlassColorProvider(al0 al0Var) {
        this.O = al0Var;
        if (al0Var == null) {
            al0Var = this.N;
        }
        il0 il0Var = this.I;
        if (il0Var != null) {
            il0Var.p(al0Var);
            this.J.p(al0Var);
            this.K.p(al0Var);
        }
        invalidate();
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.b.setEnabled(z);
        wha whaVar = this.d;
        if (whaVar != null) {
            whaVar.setEnabled(z);
        }
        sha shaVar = this.n;
        if (shaVar != null) {
            shaVar.setEnabled(z);
        }
    }

    public void setExtraHeight(int i) {
        if (this.b0 != i) {
            this.b0 = i;
            requestLayout();
        }
    }

    public void setForceSkipTouches(boolean z) {
        this.v0 = z;
    }

    @Override
    public void setMenuGlassFrostedProgress(float f) {
        jx4 jx4Var = this.q0;
        if (jx4Var != null) {
            jx4Var.k(f);
        }
    }

    public void setMenuGlassStroke(boolean z) {
        this.o0 = z;
    }

    public void setMenuOverlayProvider(h8c h8cVar) {
        this.Q = h8cVar;
    }

    public void setOccupyStatusBar(boolean z) {
        if (this.a0 != z) {
            this.a0 = z;
            requestLayout();
        }
    }

    public void setSearchFieldCaption(CharSequence charSequence) {
        int i;
        u();
        this.x.setText(charSequence);
        TextView textView = this.x;
        if (TextUtils.isEmpty(charSequence)) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        l();
    }

    public void setSearchFieldHint(CharSequence charSequence) {
        this.E = charSequence;
        l7 l7Var = this.s;
        if (l7Var != null) {
            l7Var.setHint(charSequence);
        }
    }

    public void setSearchFieldText(CharSequence charSequence) {
        l7 l7Var = this.s;
        if (l7Var == null) {
            this.F = charSequence;
            return;
        }
        l7Var.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            this.s.setSelection(charSequence.length());
        }
    }

    public void setSearchItem(xha xhaVar) {
        if (xhaVar == null && this.y != null && this.G) {
            n(true);
        }
        this.y = xhaVar;
    }

    public void setSubtitle(CharSequence charSequence) {
        this.c.c(charSequence);
    }

    public void setSubtitleAnimated(CharSequence charSequence) {
        if (!y()) {
            setSubtitle(charSequence);
            return;
        }
        a68 a68Var = this.c;
        jia jiaVar = (jia) a68Var.d;
        if (jiaVar != null && jiaVar.getVisibility() != 8 && !TextUtils.isEmpty(charSequence) && !TextUtils.equals((CharSequence) a68Var.f, charSequence)) {
            a68Var.f = charSequence;
            jia jiaVar2 = (jia) a68Var.e;
            if (jiaVar2 == null) {
                jiaVar2 = a68Var.a();
                a68Var.e = jiaVar2;
            }
            jia jiaVar3 = (jia) a68Var.d;
            a68Var.d = jiaVar2;
            a68Var.e = jiaVar3;
            jiaVar2.animate().cancel();
            ((jia) a68Var.d).l(charSequence, false);
            ((jia) a68Var.d).setVisibility(0);
            ((jia) a68Var.d).setAlpha(0.0f);
            ((jia) a68Var.d).setTranslationY(gl.L(6.0f));
            ViewPropertyAnimator duration = ((jia) a68Var.d).animate().alpha(1.0f).translationY(0.0f).setDuration(380L);
            s33 s33Var = s33.h;
            duration.setInterpolator(s33Var).start();
            jiaVar3.animate().cancel();
            jiaVar3.animate().alpha(0.0f).translationY(-gl.L(6.0f)).setDuration(380L).setInterpolator(s33Var).withEndAction(new oha(jiaVar3, (byte) 0)).start();
            a68Var.requestLayout();
        } else if (!TextUtils.equals((CharSequence) a68Var.f, charSequence)) {
            a68Var.c(charSequence);
        }
    }

    public void setSubtitleColor(int i) {
        this.l0 = true;
        this.f0 = i;
        this.c.d();
    }

    public void setTitle(CharSequence charSequence) {
        a68 a68Var = this.c;
        int i = 0;
        a68Var.b(0);
        jia[] jiaVarArr = (jia[]) a68Var.c;
        jia jiaVar = jiaVarArr[1];
        if (jiaVar != null) {
            jiaVar.animate().cancel();
            jiaVarArr[1].setVisibility(8);
        }
        jiaVarArr[0].animate().cancel();
        jiaVarArr[0].setAlpha(1.0f);
        jiaVarArr[0].setTranslationY(0.0f);
        jiaVarArr[0].k(charSequence);
        jia jiaVar2 = jiaVarArr[0];
        if (TextUtils.isEmpty(charSequence)) {
            i = 4;
        }
        jiaVar2.setVisibility(i);
    }

    public void setTitleColor(int i) {
        this.k0 = true;
        this.e0 = i;
        this.c.d();
    }

    public void setTitleMinSideInset(int i) {
        if (this.u0 != i) {
            this.u0 = i;
            requestLayout();
        }
    }

    public void setTitlesAlpha(float f) {
        if (this.w0 != f) {
            this.w0 = f;
            k();
        }
    }

    public final wha t() {
        if (this.d == null) {
            wha whaVar = new wha(getContext(), this, false);
            this.d = whaVar;
            addView(whaVar, indexOfChild(this.b), nme.e(-2, -2, 53));
            k();
        }
        return this.d;
    }

    public final void u() {
        if (this.r != null) {
            return;
        }
        Context context = getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setVisibility(4);
        addView(this.r, indexOfChild(this.b), nme.e(-1, 46, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        this.r.addView(linearLayout, nme.d(-1, -1.0f, 51, 18.0f, 0.0f, 42.0f, 0.0f));
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setTextSize(1, 17.0f);
        this.x.setSingleLine(true);
        this.x.setEllipsize(TextUtils.TruncateAt.END);
        this.x.setGravity(19);
        this.x.setPadding(0, 0, gl.L(4.0f), 0);
        this.x.setVisibility(8);
        linearLayout.addView(this.x, nme.o(-2, -1));
        l7 l7Var = new l7((byte) 7, context, this);
        this.s = l7Var;
        l7Var.setTextSize(1, 17.0f);
        this.s.setSingleLine(true);
        this.s.setBackground(null);
        this.s.setPadding(0, 0, 0, 0);
        this.s.setGravity(19);
        l7 l7Var2 = this.s;
        l7Var2.setInputType(l7Var2.getInputType() | 524288);
        this.s.setImeOptions(33554435);
        this.s.setTextIsSelectable(false);
        this.s.setCursorSize(gl.L(20.0f));
        this.s.setCursorWidth(1.5f);
        CharSequence charSequence = this.E;
        if (charSequence != null) {
            this.s.setHint(charSequence);
        }
        this.s.setOnEditorActionListener(new j(this, (byte) 25));
        this.s.addTextChangedListener(new jf6(this, (byte) 13));
        linearLayout.addView(this.s, nme.l(1.0f, 0, -1));
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.w.setImageResource(2131231272);
        this.w.setContentDescription(k96.M0(2131752087, null));
        this.w.setOnClickListener(new mha(this, (byte) 1));
        this.r.addView(this.w, nme.d(42, 42.0f, 21, 0.0f, 0.0f, 2.0f, 0.0f));
        K();
        l();
        p(2, this.V.e, 0.0f, null);
    }

    @Override
    public final void updateColors() {
        E();
        this.c.d();
        this.b.d();
        wha whaVar = this.d;
        if (whaVar != null) {
            whaVar.h();
        }
        wha whaVar2 = this.e;
        if (whaVar2 != null) {
            whaVar2.h();
        }
        hn hnVar = this.f;
        if (hnVar != null) {
            hnVar.setTextColor(this.h0);
        }
        sha shaVar = this.n;
        if (shaVar != null) {
            shaVar.c();
        }
        hn hnVar2 = this.h;
        if (hnVar2 != null) {
            hnVar2.setTextColor(this.f0);
        }
        if (this.s != null) {
            K();
        }
        il0 il0Var = this.I;
        if (il0Var != null) {
            il0Var.updateColors();
        }
        il0 il0Var2 = this.J;
        if (il0Var2 != null) {
            il0Var2.updateColors();
        }
        invalidate();
    }

    public final float v(boolean z) {
        float actionModeFactor;
        sha shaVar = this.n;
        if (shaVar != null) {
            if (shaVar.getVisibility() != 8 || !z) {
                sha shaVar2 = this.n;
                if (z) {
                    actionModeFactor = shaVar2.getTargetVisibleFactor();
                } else {
                    actionModeFactor = (1.0f - getActionModeFactor()) * (1.0f - getSearchFactor()) * shaVar2.getVisibleFactor();
                }
                return (gl.L(12.0f) + this.n.getButtonWidth()) * actionModeFactor;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void w() {
        wha whaVar = this.e;
        if (whaVar != null && this.H) {
            this.H = false;
            whaVar.f();
            this.U.a(false, y());
            k();
            this.b.b(false, y());
            kk7.e().k(kk7.t4, new Object[0]);
        }
    }

    public final boolean x() {
        if (this.e != null && this.H) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        if (this.c0 && this.d0) {
            return true;
        }
        return false;
    }

    public final boolean z(View view) {
        if (view != this.b && view != this.c && view != this.d && view != this.e && view != this.f && view != this.h && view != this.r && view != this.n) {
            return false;
        }
        return true;
    }

    @Override
    public View getMenuHostView() {
        return this;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void D(float f, int i) {
    }
}
