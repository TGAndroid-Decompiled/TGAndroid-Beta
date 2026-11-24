package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class lf8 extends FrameLayout implements ViewTreeObserver.OnPreDrawListener, vlb {
    public final int[] E;
    public final Rect F;
    public ViewTreeObserver G;
    public int H;
    public final fn0 I;
    public final fn0 J;
    public final pz a;
    public final yc b;
    public final mf8 c;
    public final yv1 d;
    public final FrameLayout.LayoutParams e;
    public final lka f;
    public nf8 h;
    public rc2 n;
    public int r;
    public ho1 s;
    public final a6 w;
    public final a6 x;
    public final int y;

    public lf8(yv1 yv1Var, ylb ylbVar, Activity activity) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.E = new int[2];
        this.F = new Rect();
        h68 h68Var = new h68(this, (byte) 5);
        d53 d53Var = d53.h;
        this.I = new fn0(0, h68Var, d53Var, 380L, false);
        this.J = new fn0(0, new h68(this, (byte) 5), d53Var, 380L, false);
        this.d = yv1Var;
        this.y = yv1Var.getMessagesController().l4.M.f();
        pz pzVar = new pz(this, activity, ylbVar, (byte) 1);
        this.a = pzVar;
        pzVar.setAllowTextEntitiesIntersection(true);
        anb.X(pzVar, cmb.F6, ylbVar);
        anb.G(pzVar, cmb.Wc, ylbVar);
        anb.D(pzVar, cmb.G6, ylbVar);
        pzVar.setHint(jb6.M0(2131746916, null));
        pzVar.setTextSize(1, 15.0f);
        pzVar.setMaxLines(Integer.MAX_VALUE);
        pzVar.setBackground(null);
        pzVar.setImeOptions(268435462);
        pzVar.setInputType(pzVar.getInputType() | 16384);
        pzVar.addTextChangedListener(new og6(this, (byte) 7));
        yc ycVar = new yc(activity);
        this.b = ycVar;
        int i = cmb.Li;
        fg0 f0 = cmb.f0(cmb.v0(i, ylbVar), 1, -1);
        wmb M = anb.M(i);
        ycVar.setBackground(f0);
        anb.j(ycVar, f0, null, M, ylbVar);
        rve.a(ycVar);
        mf8 mf8Var = new mf8(getContext(), 36);
        this.c = mf8Var;
        fg0 f02 = cmb.f0(cmb.v0(i, ylbVar), 1, -1);
        wmb M2 = anb.M(i);
        mf8Var.setBackground(f02);
        anb.j(mf8Var, f02, null, M2, ylbVar);
        mf8Var.setOnClickListener(new n06(this, yv1Var, (byte) 20));
        rve.a(mf8Var);
        lka lkaVar = new lka(getContext());
        this.f = lkaVar;
        lkaVar.setTextSize(13);
        lkaVar.setGravity(17);
        lkaVar.setTranslationY(gm.L(44.0f));
        lkaVar.setVisibility(8);
        a6 a6Var = new a6(activity, (byte) 27);
        this.x = a6Var;
        addView(a6Var, layoutParams);
        a6 a6Var2 = new a6(activity, (byte) 26);
        this.w = a6Var2;
        a6Var.addView(a6Var2, qoe.c(-2.0f, -1));
        a6Var2.addView(lkaVar, qoe.e(54, 24, 53));
        a6Var2.addView(ycVar, qoe.e(44, 44, 51));
        a6Var2.addView(mf8Var, qoe.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        a6Var2.addView(pzVar, qoe.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        pzVar.setPadding(gm.L(5.0f), gm.L(11.0f), gm.L(5.0f), gm.L(11.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.z6));
        hashSet.add(Integer.valueOf(cmb.o7));
    }

    public nf8 getAttachedMedia() {
        return this.h;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.G = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.G;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.G.removeOnPreDrawListener(this);
        }
        this.G = null;
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onPreDraw() {
        xc2 xc2Var;
        kf8 kf8Var;
        rc2 rc2Var = this.n;
        if (rc2Var != null) {
            int e1 = rc2Var.getMessageObject().e1();
            if (this.n.isAttachedToWindow() && this.r == e1 && (xc2Var = this.n.x2) != null && (kf8Var = xc2Var.l) != null && xc2Var.s) {
                Rect bounds = kf8Var.getBounds();
                Rect rect = this.F;
                rect.set(bounds);
                rc2 rc2Var2 = this.n;
                int[] iArr = this.E;
                rc2Var2.getLocationInWindow(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i - iArr[0], i2 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i3 = layoutParams.width;
                a6 a6Var = this.x;
                if (i3 != width) {
                    layoutParams.width = width;
                    a6Var.setLayoutParams(layoutParams);
                }
                a6Var.setTranslationX(rect.left);
                a6Var.setTranslationY(gm.L(0.66f) + rect.top);
                return true;
            }
            ho1 ho1Var = this.s;
            if (ho1Var != null) {
                ho1Var.run();
                this.s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f) {
        this.w.setAlpha(f);
    }

    public void setCellToWatch(rc2 rc2Var) {
        this.n = rc2Var;
        this.r = rc2Var.getMessageObject().e1();
    }

    public void setColor(int i) {
        if (this.H != i) {
            this.H = i;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
            yc ycVar = this.b;
            ((Drawable) ycVar.c).setColorFilter(porterDuffColorFilter);
            ((Drawable) ycVar.d).setColorFilter(porterDuffColorFilter);
            this.c.a.setColorFilter(porterDuffColorFilter);
            pz pzVar = this.a;
            pzVar.setCursorColor(i);
            pzVar.setHandlesColor(i);
            pzVar.setHintTextColor(i);
        }
    }

    @Override
    public final void updateColors() {
        yv1 yv1Var;
        try {
            lka lkaVar = this.f;
            if (lkaVar != null && (yv1Var = this.d) != null) {
                lkaVar.setTextColor(on2.f(this.J.e, cmb.v0(cmb.z6, yv1Var.getResourceProvider()), cmb.v0(cmb.o7, yv1Var.getResourceProvider())));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
