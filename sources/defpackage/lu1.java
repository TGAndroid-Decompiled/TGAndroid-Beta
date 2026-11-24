package defpackage;

import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.q;
import org.telegram.ui.LaunchActivity;
public final class lu1 extends gb {
    public final mu1 x;

    public lu1(mu1 mu1Var, mu1 mu1Var2) {
        super(mu1Var2);
        this.x = mu1Var;
    }

    @Override
    public final boolean b() {
        boolean z;
        boolean z2;
        boolean z3;
        yv1 yv1Var = this.x.D0;
        tk5 parentLayout = yv1Var.getParentLayout();
        if (!yv1Var.mb) {
            z = ((d) yv1Var).inPreviewMode;
            if (!z) {
                z2 = ((d) yv1Var).inBubbleMode;
                if (!z2 && !gm.E && parentLayout != null && yv1Var.Ma <= 0 && System.currentTimeMillis() - yv1Var.ba >= 250) {
                    if ((yv1Var != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).z()) && !((ActionBarLayout) parentLayout).n) {
                        z3 = ((d) yv1Var).isPaused;
                        if (!z3 && yv1Var.f6) {
                            e51 e51Var = yv1Var.Y1;
                            if (e51Var == null || !e51Var.isShowing()) {
                                ms1 ms1Var = yv1Var.a0;
                                if (ms1Var == null || ms1Var.getTrendingStickersAlert() == null || !yv1Var.a0.getTrendingStickersAlert().isShowing()) {
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e(float f, float f2, boolean z) {
        a aVar;
        int i;
        hg5 hg5Var;
        mu1 mu1Var = this.x;
        yv1 yv1Var = mu1Var.D0;
        if (yv1Var.getParentLayout() == null || !((ActionBarLayout) yv1Var.getParentLayout()).n) {
            yv1Var.T9 = f;
            yv1Var.U9 = f2;
            e51 e51Var = yv1Var.Y1;
            if (e51Var == null || !e51Var.isShowing()) {
                aVar = ((d) yv1Var).actionBar;
                aVar.setTranslationY(f);
                ft1 ft1Var = yv1Var.Jb;
                if (ft1Var != null) {
                    float f3 = yv1Var.T9;
                    ys1 ys1Var = yv1Var.D1;
                    if (ys1Var != null) {
                        i = ys1Var.getCurrentHeight();
                    } else {
                        i = 0;
                    }
                    ft1Var.setTranslationY(f3 + i);
                }
                hg5 hg5Var2 = yv1Var.L1;
                if (hg5Var2 != null) {
                    hg5Var2.setTranslationY(f);
                }
                hg5 hg5Var3 = yv1Var.K1;
                if (hg5Var3 != null) {
                    hg5Var3.setTranslationY(f);
                }
                FrameLayout frameLayout = yv1Var.f1;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f / 2.0f);
                }
                yv1Var.R.setTranslationY(f / 2.0f);
                int i2 = (int) f;
                yv1Var.m1.setBackgroundTranslation(i2);
                q qVar = yv1Var.q3;
                if (qVar != null) {
                    float f4 = 0.5f * f;
                    qVar.y0 = f4;
                    qVar.w.setTranslationY(qVar.z0 + f4);
                }
                a91 a91Var = yv1Var.N2;
                if (a91Var != null) {
                    vl0 vl0Var = (vl0) a91Var.b;
                    vl0Var.u = f;
                    vl0Var.d.invalidate();
                }
                yv1Var.setFragmentPanTranslationOffset(i2);
                yv1Var.O7();
                yv1Var.Q7();
            } else {
                mu1Var.setNonNoveTranslation(f);
            }
            yv1Var.A0.invalidate();
            u31 u31Var = u31.x;
            if (u31Var != null && yv1Var.Pc != null) {
                u31Var.l();
            }
            if (gm.O1() && (yv1Var.getParentActivity() instanceof LaunchActivity)) {
                d lastFragment = ((LaunchActivity) yv1Var.getParentActivity()).N().getLastFragment();
                if (lastFragment instanceof nk3) {
                    nk3 nk3Var = (nk3) lastFragment;
                    nk3Var.x1 = f;
                    nk3Var.u5();
                }
            }
            hg5 hg5Var4 = yv1Var.H2;
            if (hg5Var4 != null && hg5Var4.W) {
                hg5Var4.x(yv1Var.a0.getAudioVideoButtonContainer(), false);
            }
            gs1 gs1Var = yv1Var.m2;
            if (gs1Var != null && (hg5Var = gs1Var.B0) != null) {
                hg5Var.y();
            }
        }
    }

    @Override
    public final void f() {
        mw1 mw1Var;
        yv1 yv1Var = this.x.D0;
        ms1 ms1Var = yv1Var.a0;
        if (ms1Var != null && (mw1Var = ms1Var.v0) != null) {
            mw1Var.run();
            ms1Var.v0 = null;
        }
        hg5 hg5Var = yv1Var.H2;
        if (hg5Var != null && hg5Var.W) {
            hg5Var.x(yv1Var.a0.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i, boolean z) {
        gx1 gx1Var;
        yv1 yv1Var = this.x.D0;
        yv1Var.R4 = true;
        ms1 ms1Var = yv1Var.a0;
        if (ms1Var != null) {
            if (z && (gx1Var = ms1Var.W) != null) {
                gm.r(gx1Var);
                ms1Var.W.run();
            }
            lx1 lx1Var = ms1Var.a0;
            if (lx1Var != null) {
                gm.r(lx1Var);
                ms1Var.a0.run();
            }
        }
        hg5 hg5Var = yv1Var.u2;
        if (hg5Var != null) {
            hg5Var.f(false);
        }
        hg5 hg5Var2 = yv1Var.P1;
        if (hg5Var2 != null) {
            hg5Var2.f(true);
        }
    }

    @Override
    public final int i() {
        mu1 mu1Var = this.x;
        yv1 yv1Var = mu1Var.D0;
        if (mu1Var.getKeyboardHeight() <= gm.L(20.0f) && yv1Var.a0.R0()) {
            return yv1Var.a0.getEmojiPadding();
        }
        return 0;
    }
}
