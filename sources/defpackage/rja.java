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
public class rja extends FrameLayout implements g94, jm7, vlb, h27, zt5 {
    public CharSequence E;
    public CharSequence F;
    public boolean G;
    public boolean H;
    public im0 I;
    public im0 J;
    public im0 K;
    public float L;
    public km0 M;
    public nm0 N;
    public am0 O;
    public km0 P;
    public iac Q;
    public bka R;
    public r7 S;
    public final fn0 T;
    public final fn0 U;
    public final fn0 V;
    public c6 W;
    public final ylb a;
    public boolean a0;
    public final pja b;
    public int b0;
    public final c88 c;
    public boolean c0;
    public yja d;
    public boolean d0;
    public yja e;
    public int e0;
    public io f;
    public int f0;
    public int g0;
    public io h;
    public int h0;
    public int i0;
    public int j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public uja n;
    public boolean n0;
    public boolean o0;
    public km0 p0;
    public lz4 q0;
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
    public zja y;

    public rja(Context context, ylb ylbVar) {
        super(context);
        this.L = -1.0f;
        d53 d53Var = d53.h;
        this.T = new fn0(0, this, d53Var, 380L, false);
        this.U = new fn0(1, this, d53Var, 380L, false);
        this.V = new fn0(2, this, d53Var, 250L, false);
        this.a0 = true;
        this.o0 = true;
        this.r0 = new RectF();
        this.s0 = new Path();
        this.t0 = new RectF();
        this.w0 = 1.0f;
        this.a = ylbVar;
        setClipChildren(false);
        setWillNotDraw(false);
        E();
        c88 c88Var = new c88(this, context);
        this.c = c88Var;
        addView(c88Var, qoe.e(-1, -2, 51));
        pja pjaVar = new pja(this, context);
        this.b = pjaVar;
        pjaVar.setVisibility(8);
        pjaVar.setContentDescription(jb6.M0(2131754878, null));
        pjaVar.setOnClickListener(new oja(this, (byte) 0));
        addView(pjaVar, qoe.e(46, 46, 51));
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
            return gm.m;
        }
        return 0;
    }

    public n7 getSearchListener() {
        zja zjaVar = this.y;
        if (zjaVar != null) {
            return zjaVar.getSearchListener();
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
        return gm.L(f);
    }

    public static n7 j(rja rjaVar) {
        return rjaVar.getSearchListener();
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
        gm.t1(this.s);
        n7 searchListener = getSearchListener();
        if (searchListener != null) {
            searchListener.k(this.s);
        }
    }

    public final boolean B() {
        bka bkaVar = this.R;
        if (bkaVar != null) {
            bkaVar.a(true);
            return true;
        } else if (!this.H && this.G) {
            o(true);
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
        yja yjaVar = this.d;
        if (yjaVar != null) {
            yjaVar.f();
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
            gm.E3(this.s);
        }
        if (z2 && y()) {
            z3 = true;
        }
        this.T.a(true, z3);
        l();
        if (searchListener != null) {
            searchListener.i();
        }
        return true;
    }

    public void D(int i, float f, float f2, h94 h94Var) {
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
        l();
    }

    public final void E() {
        boolean z = this.k0;
        ylb ylbVar = this.a;
        if (!z) {
            this.e0 = cmb.v0(cmb.F6, ylbVar);
        }
        if (!this.l0) {
            this.f0 = cmb.v0(cmb.x6, ylbVar);
        }
        if (!this.m0) {
            this.g0 = cmb.v0(cmb.F6, ylbVar);
        }
        this.h0 = cmb.v0(cmb.F6, ylbVar);
        if (!this.n0) {
            this.i0 = cmb.v0(cmb.h6, ylbVar);
        }
        this.j0 = cmb.v0(cmb.h6, ylbVar);
    }

    public final void F(int i, boolean z) {
        boolean z2;
        String E = jb6.E(i, ' ');
        q();
        io ioVar = this.f;
        if (z && y() && this.H) {
            z2 = true;
        } else {
            z2 = false;
        }
        ioVar.c(E, z2, true);
    }

    public final void I(CharSequence charSequence, boolean z, long j, d53 d53Var) {
        int L;
        if (!y()) {
            setTitle(charSequence);
            return;
        }
        c88 c88Var = this.c;
        c88Var.b(0);
        c88Var.b(1);
        lka[] lkaVarArr = (lka[]) c88Var.c;
        lka lkaVar = lkaVarArr[0];
        lka lkaVar2 = lkaVarArr[1];
        lkaVarArr[0] = lkaVar2;
        lkaVarArr[1] = lkaVar;
        lkaVar2.animate().cancel();
        lkaVar2.k(charSequence);
        lkaVar2.setVisibility(0);
        lkaVar2.setAlpha(0.0f);
        int L2 = gm.L(16.0f);
        if (!z) {
            L2 = -L2;
        }
        lkaVar2.setTranslationY(L2);
        lkaVar2.animate().alpha(1.0f).translationY(0.0f).setDuration(j).setInterpolator(d53Var).start();
        lkaVar.animate().cancel();
        ViewPropertyAnimator alpha = lkaVar.animate().alpha(0.0f);
        if (z) {
            L = -gm.L(16.0f);
        } else {
            L = gm.L(16.0f);
        }
        alpha.translationY(L).setDuration(j).setInterpolator(d53Var).withEndAction(new qja(lkaVar, (byte) 1)).start();
        c88Var.requestLayout();
    }

    public final void J() {
        if (this.e != null && !this.H) {
            this.H = true;
            yja yjaVar = this.d;
            if (yjaVar != null) {
                yjaVar.f();
            }
            l7 l7Var = this.s;
            if (l7Var != null && this.G) {
                gm.t1(l7Var);
            }
            this.U.a(true, y());
            l();
            this.b.b(true, y());
            nm7.e().k(nm7.v4, new Object[0]);
        }
    }

    public final void K() {
        l7 l7Var = this.s;
        int i = cmb.F6;
        ylb ylbVar = this.a;
        l7Var.setTextColor(cmb.v0(i, ylbVar));
        this.x.setTextColor(cmb.v0(i, ylbVar));
        this.s.setHintTextColor(cmb.v0(cmb.G6, ylbVar));
        this.s.setCursorColor(cmb.v0(i, ylbVar));
        this.s.setHighlightColor(cmb.v0(cmb.kg, ylbVar));
        this.s.setHandlesColor(cmb.v0(cmb.lg, ylbVar));
        this.w.setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.l6, ylbVar), PorterDuff.Mode.SRC_IN));
        this.w.setBackground(cmb.f0(this.i0, 1, -1));
    }

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final void b(bka bkaVar, r7 r7Var) {
        this.R = bkaVar;
        this.S = r7Var;
        invalidate();
    }

    @Override
    public final boolean c(r7 r7Var, RectF rectF) {
        float f = 0.0f;
        if (r7Var.getParent() == this.d && getSearchFactor() == 0.0f && getActionModeFactor() == 0.0f) {
            p(rectF);
            return true;
        }
        float L = gm.L(23.0f);
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
    public final boolean d() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.r4) {
            updateColors();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        uja ujaVar;
        this.c0 = this.d0;
        int L = gm.L(6.0f);
        if (this.I != null) {
            pja pjaVar = this.b;
            if (pjaVar.getVisibility() == 0 && pjaVar.getAlpha() > 0.0f) {
                float width = (pjaVar.getWidth() / 2.0f) + pjaVar.getX();
                float height = (pjaVar.getHeight() / 2.0f) + pjaVar.getY();
                float scaleX = pjaVar.getScaleX() * (pjaVar.getWidth() / 2.0f);
                float scaleY = pjaVar.getScaleY() * (pjaVar.getHeight() / 2.0f);
                this.I.setBounds(((int) (width - scaleX)) - L, ((int) (height - scaleY)) - L, ((int) (width + scaleX)) + L, ((int) (height + scaleY)) + L);
                this.I.setAlpha((int) (pjaVar.getAlpha() * 255.0f));
                this.I.draw(canvas);
            }
        }
        if (this.K != null && (ujaVar = this.n) != null && ujaVar.c == tja.a && ujaVar.getVisibility() == 0 && this.n.getAlpha() > 0.0f) {
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
            float p = p(rectF);
            r7 r7Var = this.S;
            if (r7Var != null && r7Var.getParent() == this.d) {
                z = true;
            } else {
                z = false;
            }
            if (p > 0.0f && rectF.width() > 0.0f && !z) {
                float height3 = rectF.height() / 2.0f;
                if (Math.abs(height3 - this.L) > 0.5f) {
                    this.L = height3;
                    this.J.r(height3);
                }
                this.J.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                this.J.setAlpha((int) (p * 255.0f));
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
    public final void e(xt5 xt5Var) {
        uja ujaVar;
        if (this.I != null) {
            pja pjaVar = this.b;
            if (pjaVar.getVisibility() == 0 && pjaVar.getAlpha() > 0.0f) {
                k(pjaVar, xt5Var);
            }
        }
        if (this.K != null && (ujaVar = this.n) != null && ujaVar.c == tja.a && ujaVar.getVisibility() == 0 && this.n.getAlpha() > 0.0f) {
            k(this.n, xt5Var);
        }
        im0 im0Var = this.J;
        Path path = this.s0;
        if (im0Var != null) {
            RectF rectF = this.t0;
            if (p(rectF) > 0.0f && rectF.width() > 0.0f) {
                path.rewind();
                path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
                xt5Var.a(path);
            }
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (!z(childAt) && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && (childAt.getBackground() instanceof im0)) {
                path.rewind();
                path.addPath(((im0) childAt.getBackground()).S.k, childAt.getX(), childAt.getY());
                xt5Var.a(path);
            }
        }
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final boolean g() {
        return this.o0;
    }

    public c6 getActionBarMenuOnItemClick() {
        return this.W;
    }

    public yja getActionMode() {
        return this.e;
    }

    public float getActionModeFactor() {
        return this.U.e;
    }

    public io getActionModeTitle() {
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
        am0 am0Var = this.O;
        if (am0Var == null) {
            am0Var = this.N;
        }
        if (am0Var != null) {
            return am0Var.K1();
        }
        return 0;
    }

    @Override
    public am0 getButtonsGlassColorProvider() {
        am0 am0Var = this.O;
        if (am0Var != null) {
            return am0Var;
        }
        return this.N;
    }

    public uja getDoneButton() {
        return this.n;
    }

    public int getExtraHeight() {
        return this.b0;
    }

    public yja getMenu() {
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
    public am0 getMenuGlassColorProvider() {
        return this.N;
    }

    @Override
    public int getMenuMaxHeight() {
        return 0;
    }

    public bka getMenuOverlay() {
        iac iacVar = this.Q;
        if (iacVar != null) {
            return (bka) iacVar.run();
        }
        return null;
    }

    public float getMenuPillLeft() {
        RectF rectF = this.r0;
        p(rectF);
        return rectF.left;
    }

    @Override
    public ylb getMenuResourcesProvider() {
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
    public bka getOpenMenuOverlay() {
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

    public lka getSubtitleTextView() {
        return (lka) this.c.d;
    }

    public String getTitle() {
        CharSequence charSequence;
        lka lkaVar = ((lka[]) this.c.c)[0];
        if (lkaVar != null) {
            charSequence = lkaVar.getText();
        } else {
            charSequence = null;
        }
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        c88 c88Var = this.c;
        c88Var.b(0);
        return ((lka[]) c88Var.c)[0].getTextPaint().getFontMetricsInt();
    }

    public lka getTitleTextView() {
        return ((lka[]) this.c.c)[0];
    }

    public lka getTitleTextView2() {
        return ((lka[]) this.c.c)[1];
    }

    public float getTitlesAlpha() {
        return this.w0;
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final im0 i(bka bkaVar) {
        km0 km0Var = this.p0;
        if (km0Var == null) {
            km0Var = this.M;
        }
        if (km0Var == null) {
            return null;
        }
        im0 c = km0Var.c(bkaVar, null, false);
        c.p(this.N);
        wi8.r(c, gm.L(23.0f), 6.0f);
        return c;
    }

    public final void k(View view, xt5 xt5Var) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        float height = (view.getHeight() / 2.0f) + view.getY();
        float scaleX = view.getScaleX() * (view.getWidth() / 2.0f);
        float scaleY = view.getScaleY() * (view.getHeight() / 2.0f);
        RectF rectF = this.t0;
        rectF.set(width - scaleX, height - scaleY, width + scaleX, height + scaleY);
        Path path = this.s0;
        path.rewind();
        path.addRoundRect(rectF, scaleY, scaleY, Path.Direction.CW);
        xt5Var.a(path);
    }

    public final void l() {
        yja yjaVar;
        yja yjaVar2;
        yja yjaVar3;
        yja yjaVar4;
        float R1;
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        float f = 1.0f - actionModeFactor;
        float f2 = searchFactor * f;
        float f3 = (1.0f - searchFactor) * f;
        float R12 = gm.R1(1.0f, 0.94f, Math.max(searchFactor, actionModeFactor));
        c88 c88Var = this.c;
        G(c88Var, this.w0 * f3);
        c88Var.setScaleX(R12);
        c88Var.setScaleY(R12);
        uja ujaVar = this.n;
        if (ujaVar != null) {
            float visibleFactor = ujaVar.getVisibleFactor() * f3;
            G(this.n, visibleFactor);
            if (this.n.c == tja.a) {
                R1 = gm.R1(0.6f, 1.0f, visibleFactor);
            } else {
                R1 = gm.R1(0.8f, 1.0f, f3);
            }
            this.n.setScaleX(R1);
            this.n.setScaleY(R1);
        }
        yja yjaVar5 = this.d;
        int i = 0;
        if (yjaVar5 != null) {
            yjaVar5.setTranslationX(-v(false));
            G(this.d, f3);
            float R13 = gm.R1(0.7f, 1.0f, f3);
            this.d.setPivotX(yjaVar3.getWidth() - gm.L(19.0f));
            this.d.setPivotY(yjaVar4.getHeight() / 2.0f);
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
        yja yjaVar6 = this.e;
        if (yjaVar6 != null) {
            G(yjaVar6, actionModeFactor);
            float R14 = gm.R1(0.7f, 1.0f, actionModeFactor);
            this.e.setPivotX(yjaVar.getWidth() - gm.L(19.0f));
            this.e.setPivotY(yjaVar2.getHeight() / 2.0f);
            this.e.setScaleX(R14);
            this.e.setScaleY(R14);
        }
        io ioVar = this.f;
        if (ioVar != null) {
            G(ioVar, actionModeFactor);
            this.f.setTranslationX((-gm.L(16.0f)) * f);
        }
        io ioVar2 = this.h;
        if (ioVar2 != null) {
            G(ioVar2, actionModeFactor);
            this.h.setTranslationX((-gm.L(16.0f)) * f);
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            G(frameLayout, f2);
            RectF rectF = this.r0;
            p(rectF);
            this.r.setTranslationX(Math.max(0.0f, rectF.left - getSearchPillLeft()));
        }
        pja pjaVar = this.b;
        if (((Drawable) pjaVar.b) != null) {
            pjaVar.setVisibility(0);
            pjaVar.setAlpha(1.0f);
            pjaVar.setScaleX(1.0f);
            pjaVar.setScaleY(1.0f);
        } else {
            if (actionModeFactor <= 0.0f) {
                i = 8;
            }
            pjaVar.setVisibility(i);
            pjaVar.setAlpha(actionModeFactor);
            pjaVar.setScaleX(gm.R1(0.6f, 1.0f, actionModeFactor));
            pjaVar.setScaleY(gm.R1(0.6f, 1.0f, actionModeFactor));
        }
        pjaVar.invalidate();
        invalidate();
    }

    public final void m() {
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

    public final void n() {
        n7 searchListener = getSearchListener();
        if (searchListener == null || searchListener.a()) {
            this.x.setVisibility(8);
            m();
            if (searchListener != null) {
                searchListener.f();
            }
        }
    }

    public final void o(boolean z) {
        if (this.G) {
            n7 searchListener = getSearchListener();
            if (searchListener == null || searchListener.b()) {
                this.G = false;
                this.s.clearFocus();
                if (z) {
                    gm.t1(this.s);
                }
                this.T.a(false, y());
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
        this.d0 = true;
        nm7.e().b(this, nm7.r4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d0 = false;
        this.c0 = false;
        nm7.e().n(this, nm7.r4);
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
                        g = wi8.g(i7, measuredWidth, 2, i9);
                        i6 = layoutParams.rightMargin;
                    } else {
                        i5 = i9;
                        int g2 = (wi8.g(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                        childAt.layout(i5, g2, measuredWidth + i5, measuredHeight + g2);
                    }
                }
                i5 = g - i6;
                int g22 = (wi8.g(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
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
        pja pjaVar = this.b;
        boolean z2 = true;
        if (((Drawable) pjaVar.b) != null) {
            z = true;
        } else {
            z = false;
        }
        int L3 = ((currentActionBarHeight - gm.L(46.0f)) / 2) + rowTop;
        H(pjaVar, gm.L(6.0f), L3, 0);
        yja yjaVar = this.d;
        float f2 = 0.0f;
        if (yjaVar != null && yjaVar.getVisibility() != 8) {
            f = this.d.getTargetPillWidth();
        } else {
            f = 0.0f;
        }
        float v = v(true);
        if (z) {
            L = gm.L(64.0f);
        } else {
            L = gm.L(18.0f);
        }
        if (f <= 0.0f && v <= 0.0f) {
            L2 = 0;
        } else {
            L2 = gm.L(18.0f) + ((int) (f + v));
        }
        int max = Math.max(Math.max(L, L2), this.u0);
        c88 c88Var = this.c;
        if (c88Var.b != max) {
            c88Var.b = max;
            c88Var.requestLayout();
        }
        H(c88Var, 0, rowTop, 0);
        c88Var.getLayoutParams().height = currentActionBarHeight;
        yja yjaVar2 = this.d;
        if (yjaVar2 != null) {
            H(yjaVar2, 0, rowTop, gm.L(10.0f));
            this.d.getLayoutParams().height = currentActionBarHeight;
        }
        yja yjaVar3 = this.e;
        if (yjaVar3 != null) {
            H(yjaVar3, 0, rowTop, gm.L(10.0f));
            this.e.getLayoutParams().height = currentActionBarHeight;
        }
        if (this.f != null) {
            yja yjaVar4 = this.e;
            if (yjaVar4 != null) {
                f2 = yjaVar4.getTargetPillWidth();
            }
            int L4 = gm.L(18.0f) + ((int) f2);
            io ioVar = this.h;
            if (ioVar == null || ioVar.getTag() == null) {
                z2 = false;
            }
            io ioVar2 = this.f;
            if (z2) {
                int i4 = (currentActionBarHeight / 2) + rowTop;
                H(ioVar2, gm.L(66.0f), i4 - gm.L(22.0f), L4);
                this.f.getLayoutParams().height = gm.L(22.0f);
                H(this.h, gm.L(66.0f), gm.L(1.0f) + i4, L4);
                this.h.getLayoutParams().height = gm.L(18.0f);
            } else {
                H(ioVar2, gm.L(66.0f), rowTop, L4);
                this.f.getLayoutParams().height = currentActionBarHeight;
            }
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            H(frameLayout, (int) getSearchPillLeft(), L3, gm.L(6.0f));
        }
        uja ujaVar = this.n;
        if (ujaVar != null) {
            H(ujaVar, 0, L3, gm.L(6.0f));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return !this.v0;
    }

    public final float p(RectF rectF) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int L = gm.L(6.0f);
        float L2 = gm.L(23.0f);
        float currentActionBarHeight = (a.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        yja yjaVar = this.d;
        if (yjaVar != null && yjaVar.getVisibility() != 8) {
            f = this.d.getPillWidth();
        } else {
            f = 0.0f;
        }
        yja yjaVar2 = this.e;
        if (yjaVar2 != null) {
            f2 = yjaVar2.getPillWidth();
        } else {
            f2 = 0.0f;
        }
        if (f <= 0.0f) {
            f3 = actionModeFactor;
            f = f2;
        } else if (f2 <= 0.0f) {
            f3 = 1.0f - actionModeFactor;
        } else {
            f = gm.R1(f, f2, actionModeFactor);
            f3 = 1.0f;
        }
        float f6 = (1.0f - actionModeFactor) * searchFactor;
        float f7 = L2 * 2.0f;
        float f8 = f / f7;
        float R1 = gm.R1(0.8f, 1.0f, f3) * Math.min(1.0f, f8);
        float width = (getWidth() - L) - v(false);
        float max = width - Math.max(f, f7);
        float f9 = currentActionBarHeight - L2;
        float f10 = currentActionBarHeight + L2;
        if (R1 < 1.0f) {
            float f11 = (max + width) / 2.0f;
            float B = kt6.B(1.0f, R1, L2, (width - max) / 2.0f);
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
        rectF.set(gm.R1(max, getSearchPillLeft(), f6), gm.R1(f4, f9, f6), gm.R1(width, getWidth() - L, f6), gm.R1(f5, f10, f6));
        return gm.R1(Math.min(1.0f, f8) * f3, 1.0f, f6);
    }

    public final yja q() {
        if (this.e == null) {
            yja yjaVar = new yja(getContext(), this, true);
            this.e = yjaVar;
            View view = this.b;
            addView(yjaVar, indexOfChild(view), qoe.e(-2, -2, 53));
            io ioVar = new io(getContext(), true, true, true);
            this.f = ioVar;
            ioVar.setTextSize(gm.L(18.0f));
            this.f.setTypeface(gm.o());
            this.f.setTextColor(this.h0);
            this.f.setGravity(19);
            this.f.setEllipsizeByGradient(true);
            this.f.b(0.6f, 320L, d53.h);
            addView(this.f, indexOfChild(view), qoe.e(-1, -2, 51));
            l();
        }
        return this.e;
    }

    public final void r() {
        km0 km0Var = this.P;
        if (km0Var == null) {
            km0Var = this.M;
        }
        if (km0Var == null) {
            return;
        }
        am0 am0Var = this.O;
        if (am0Var == null) {
            am0Var = this.N;
        }
        im0 c = km0Var.c(this, null, false);
        c.p(am0Var);
        wi8.r(c, gm.L(23.0f), 6.0f);
        this.I = c;
        im0 c2 = km0Var.c(this, null, false);
        c2.p(am0Var);
        wi8.r(c2, gm.L(23.0f), 6.0f);
        this.J = c2;
        im0 c3 = km0Var.c(this, null, false);
        c3.p(am0Var);
        wi8.r(c3, gm.L(23.0f), 6.0f);
        this.K = c3;
        this.L = gm.L(23.0f);
        invalidate();
    }

    public final uja s(String str) {
        if (this.n == null) {
            uja ujaVar = new uja(getContext(), this, str);
            this.n = ujaVar;
            addView(ujaVar, indexOfChild(this.b), qoe.e(-2, 46, 53));
            l();
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
        pja pjaVar = this.b;
        Drawable drawable = (Drawable) pjaVar.b;
        if (drawable != null) {
            z = true;
        } else {
            z = false;
        }
        h94 h94Var = (h94) pjaVar.f;
        if (drawable != null && ((rja) pjaVar.h).y()) {
            pjaVar.c(mutate);
            pjaVar.c = (Drawable) pjaVar.b;
            h94Var.c(0.0f);
            h94Var.a(1.0f);
        } else {
            pjaVar.c(mutate);
        }
        if (!z) {
            l();
            requestLayout();
        }
    }

    public void setButtonsGlass(km0 km0Var) {
        this.P = km0Var;
        if (this.M != null) {
            r();
        }
    }

    public void setButtonsGlassColorProvider(am0 am0Var) {
        this.O = am0Var;
        if (am0Var == null) {
            am0Var = this.N;
        }
        im0 im0Var = this.I;
        if (im0Var != null) {
            im0Var.p(am0Var);
            this.J.p(am0Var);
            this.K.p(am0Var);
        }
        invalidate();
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.b.setEnabled(z);
        yja yjaVar = this.d;
        if (yjaVar != null) {
            yjaVar.setEnabled(z);
        }
        uja ujaVar = this.n;
        if (ujaVar != null) {
            ujaVar.setEnabled(z);
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
        lz4 lz4Var = this.q0;
        if (lz4Var != null) {
            lz4Var.k(f);
        }
    }

    public void setMenuGlassStroke(boolean z) {
        this.o0 = z;
    }

    public void setMenuOverlayProvider(iac iacVar) {
        this.Q = iacVar;
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
        m();
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

    public void setSearchItem(zja zjaVar) {
        if (zjaVar == null && this.y != null && this.G) {
            o(true);
        }
        this.y = zjaVar;
    }

    public void setSubtitle(CharSequence charSequence) {
        this.c.c(charSequence);
    }

    public void setSubtitleAnimated(CharSequence charSequence) {
        if (!y()) {
            setSubtitle(charSequence);
            return;
        }
        c88 c88Var = this.c;
        lka lkaVar = (lka) c88Var.d;
        if (lkaVar != null && lkaVar.getVisibility() != 8 && !TextUtils.isEmpty(charSequence) && !TextUtils.equals((CharSequence) c88Var.f, charSequence)) {
            c88Var.f = charSequence;
            lka lkaVar2 = (lka) c88Var.e;
            if (lkaVar2 == null) {
                lkaVar2 = c88Var.a();
                c88Var.e = lkaVar2;
            }
            lka lkaVar3 = (lka) c88Var.d;
            c88Var.d = lkaVar2;
            c88Var.e = lkaVar3;
            lkaVar2.animate().cancel();
            ((lka) c88Var.d).l(charSequence, false);
            ((lka) c88Var.d).setVisibility(0);
            ((lka) c88Var.d).setAlpha(0.0f);
            ((lka) c88Var.d).setTranslationY(gm.L(6.0f));
            ViewPropertyAnimator duration = ((lka) c88Var.d).animate().alpha(1.0f).translationY(0.0f).setDuration(380L);
            d53 d53Var = d53.h;
            duration.setInterpolator(d53Var).start();
            lkaVar3.animate().cancel();
            lkaVar3.animate().alpha(0.0f).translationY(-gm.L(6.0f)).setDuration(380L).setInterpolator(d53Var).withEndAction(new qja(lkaVar3, (byte) 0)).start();
            c88Var.requestLayout();
        } else if (!TextUtils.equals((CharSequence) c88Var.f, charSequence)) {
            c88Var.c(charSequence);
        }
    }

    public void setSubtitleColor(int i) {
        this.l0 = true;
        this.f0 = i;
        this.c.d();
    }

    public void setTitle(CharSequence charSequence) {
        c88 c88Var = this.c;
        int i = 0;
        c88Var.b(0);
        lka[] lkaVarArr = (lka[]) c88Var.c;
        lka lkaVar = lkaVarArr[1];
        if (lkaVar != null) {
            lkaVar.animate().cancel();
            lkaVarArr[1].setVisibility(8);
        }
        lkaVarArr[0].animate().cancel();
        lkaVarArr[0].setAlpha(1.0f);
        lkaVarArr[0].setTranslationY(0.0f);
        lkaVarArr[0].k(charSequence);
        lka lkaVar2 = lkaVarArr[0];
        if (TextUtils.isEmpty(charSequence)) {
            i = 4;
        }
        lkaVar2.setVisibility(i);
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
            l();
        }
    }

    public final yja t() {
        if (this.d == null) {
            yja yjaVar = new yja(getContext(), this, false);
            this.d = yjaVar;
            addView(yjaVar, indexOfChild(this.b), qoe.e(-2, -2, 53));
            l();
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
        addView(this.r, indexOfChild(this.b), qoe.e(-1, 46, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        this.r.addView(linearLayout, qoe.d(-1, -1.0f, 51, 18.0f, 0.0f, 42.0f, 0.0f));
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setTextSize(1, 17.0f);
        this.x.setSingleLine(true);
        this.x.setEllipsize(TextUtils.TruncateAt.END);
        this.x.setGravity(19);
        this.x.setPadding(0, 0, gm.L(4.0f), 0);
        this.x.setVisibility(8);
        linearLayout.addView(this.x, qoe.o(-2, -1));
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
        this.s.setCursorSize(gm.L(20.0f));
        this.s.setCursorWidth(1.5f);
        CharSequence charSequence = this.E;
        if (charSequence != null) {
            this.s.setHint(charSequence);
        }
        this.s.setOnEditorActionListener(new j(this, (byte) 26));
        this.s.addTextChangedListener(new og6(this, (byte) 14));
        linearLayout.addView(this.s, qoe.l(1.0f, 0, -1));
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.w.setImageResource(2131231273);
        this.w.setContentDescription(jb6.M0(2131752036, null));
        this.w.setOnClickListener(new oja(this, (byte) 1));
        this.r.addView(this.w, qoe.d(42, 42.0f, 21, 0.0f, 0.0f, 2.0f, 0.0f));
        K();
        m();
        D(2, this.V.e, 0.0f, null);
    }

    @Override
    public final void updateColors() {
        E();
        this.c.d();
        this.b.d();
        yja yjaVar = this.d;
        if (yjaVar != null) {
            yjaVar.h();
        }
        yja yjaVar2 = this.e;
        if (yjaVar2 != null) {
            yjaVar2.h();
        }
        io ioVar = this.f;
        if (ioVar != null) {
            ioVar.setTextColor(this.h0);
        }
        uja ujaVar = this.n;
        if (ujaVar != null) {
            ujaVar.c();
        }
        io ioVar2 = this.h;
        if (ioVar2 != null) {
            ioVar2.setTextColor(this.f0);
        }
        if (this.s != null) {
            K();
        }
        im0 im0Var = this.I;
        if (im0Var != null) {
            im0Var.updateColors();
        }
        im0 im0Var2 = this.J;
        if (im0Var2 != null) {
            im0Var2.updateColors();
        }
        invalidate();
    }

    public final float v(boolean z) {
        float actionModeFactor;
        uja ujaVar = this.n;
        if (ujaVar != null) {
            if (ujaVar.getVisibility() != 8 || !z) {
                uja ujaVar2 = this.n;
                if (z) {
                    actionModeFactor = ujaVar2.getTargetVisibleFactor();
                } else {
                    actionModeFactor = (1.0f - getActionModeFactor()) * (1.0f - getSearchFactor()) * ujaVar2.getVisibleFactor();
                }
                return (gm.L(12.0f) + this.n.getButtonWidth()) * actionModeFactor;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void w() {
        yja yjaVar = this.e;
        if (yjaVar != null && this.H) {
            this.H = false;
            yjaVar.f();
            this.U.a(false, y());
            l();
            this.b.b(false, y());
            nm7.e().k(nm7.v4, new Object[0]);
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
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public View getMenuHostView() {
        return this;
    }

    @Override
    public final void V(float f, int i) {
    }
}
