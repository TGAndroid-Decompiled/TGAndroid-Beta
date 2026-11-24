package defpackage;

import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.q;
import org.telegram.ui.LaunchActivity;
public final class zs1 extends gb {
    public final at1 x;

    public zs1(at1 at1Var, at1 at1Var2) {
        super(at1Var2);
        this.x = at1Var;
    }

    @Override
    public final boolean b() {
        boolean z;
        boolean z2;
        boolean z3;
        mu1 mu1Var = this.x.D0;
        ui5 parentLayout = mu1Var.getParentLayout();
        if (!mu1Var.mb) {
            z = ((d) mu1Var).inPreviewMode;
            if (!z) {
                z2 = ((d) mu1Var).inBubbleMode;
                if (!z2 && !gl.E && parentLayout != null && mu1Var.Ma <= 0 && System.currentTimeMillis() - mu1Var.ba >= 250) {
                    if ((mu1Var != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).z()) && !((ActionBarLayout) parentLayout).n) {
                        z3 = ((d) mu1Var).isPaused;
                        if (!z3 && mu1Var.f6) {
                            x31 x31Var = mu1Var.Y1;
                            if (x31Var == null || !x31Var.isShowing()) {
                                ar1 ar1Var = mu1Var.a0;
                                if (ar1Var == null || ar1Var.getTrendingStickersAlert() == null || !mu1Var.a0.getTrendingStickersAlert().isShowing()) {
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
        je5 je5Var;
        at1 at1Var = this.x;
        mu1 mu1Var = at1Var.D0;
        if (mu1Var.getParentLayout() == null || !((ActionBarLayout) mu1Var.getParentLayout()).n) {
            mu1Var.T9 = f;
            mu1Var.U9 = f2;
            x31 x31Var = mu1Var.Y1;
            if (x31Var == null || !x31Var.isShowing()) {
                aVar = ((d) mu1Var).actionBar;
                aVar.setTranslationY(f);
                sr1 sr1Var = mu1Var.Bb;
                if (sr1Var != null) {
                    float f3 = mu1Var.T9;
                    lr1 lr1Var = mu1Var.D1;
                    if (lr1Var != null) {
                        i = lr1Var.getCurrentHeight();
                    } else {
                        i = 0;
                    }
                    sr1Var.setTranslationY(f3 + i);
                }
                je5 je5Var2 = mu1Var.L1;
                if (je5Var2 != null) {
                    je5Var2.setTranslationY(f);
                }
                je5 je5Var3 = mu1Var.K1;
                if (je5Var3 != null) {
                    je5Var3.setTranslationY(f);
                }
                FrameLayout frameLayout = mu1Var.f1;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f / 2.0f);
                }
                mu1Var.R.setTranslationY(f / 2.0f);
                int i2 = (int) f;
                mu1Var.m1.setBackgroundTranslation(i2);
                q qVar = mu1Var.q3;
                if (qVar != null) {
                    float f4 = 0.5f * f;
                    qVar.y0 = f4;
                    qVar.w.setTranslationY(qVar.z0 + f4);
                }
                s71 s71Var = mu1Var.N2;
                if (s71Var != null) {
                    vk0 vk0Var = (vk0) s71Var.b;
                    vk0Var.u = f;
                    vk0Var.d.invalidate();
                }
                mu1Var.setFragmentPanTranslationOffset(i2);
                mu1Var.G7();
                mu1Var.I7();
            } else {
                at1Var.setNonNoveTranslation(f);
            }
            mu1Var.A0.invalidate();
            m21 m21Var = m21.w;
            if (m21Var != null && mu1Var.Fc != null) {
                m21Var.l();
            }
            if (gl.O1() && (mu1Var.getParentActivity() instanceof LaunchActivity)) {
                d lastFragment = ((LaunchActivity) mu1Var.getParentActivity()).N().getLastFragment();
                if (lastFragment instanceof cj3) {
                    cj3 cj3Var = (cj3) lastFragment;
                    cj3Var.x1 = f;
                    cj3Var.q5();
                }
            }
            je5 je5Var4 = mu1Var.H2;
            if (je5Var4 != null && je5Var4.W) {
                je5Var4.x(mu1Var.a0.getAudioVideoButtonContainer(), false);
            }
            uq1 uq1Var = mu1Var.m2;
            if (uq1Var != null && (je5Var = uq1Var.B0) != null) {
                je5Var.y();
            }
        }
    }

    @Override
    public final void f() {
        av1 av1Var;
        mu1 mu1Var = this.x.D0;
        ar1 ar1Var = mu1Var.a0;
        if (ar1Var != null && (av1Var = ar1Var.v0) != null) {
            av1Var.run();
            ar1Var.v0 = null;
        }
        je5 je5Var = mu1Var.H2;
        if (je5Var != null && je5Var.W) {
            je5Var.x(mu1Var.a0.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i, boolean z) {
        uv1 uv1Var;
        mu1 mu1Var = this.x.D0;
        mu1Var.R4 = true;
        ar1 ar1Var = mu1Var.a0;
        if (ar1Var != null) {
            if (z && (uv1Var = ar1Var.W) != null) {
                gl.r(uv1Var);
                ar1Var.W.run();
            }
            aj1 aj1Var = ar1Var.a0;
            if (aj1Var != null) {
                gl.r(aj1Var);
                ar1Var.a0.run();
            }
        }
        je5 je5Var = mu1Var.u2;
        if (je5Var != null) {
            je5Var.f(false);
        }
        je5 je5Var2 = mu1Var.P1;
        if (je5Var2 != null) {
            je5Var2.f(true);
        }
    }

    @Override
    public final int i() {
        at1 at1Var = this.x;
        mu1 mu1Var = at1Var.D0;
        if (at1Var.getKeyboardHeight() <= gl.L(20.0f) && mu1Var.a0.Q0()) {
            return mu1Var.a0.getEmojiPadding();
        }
        return 0;
    }
}
