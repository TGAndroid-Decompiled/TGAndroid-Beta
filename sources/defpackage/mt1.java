package defpackage;

import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.q;
import org.telegram.ui.LaunchActivity;
public final class mt1 extends hb {
    public final nt1 x;

    public mt1(nt1 nt1Var, nt1 nt1Var2) {
        super(nt1Var2);
        this.x = nt1Var;
    }

    @Override
    public final boolean b() {
        boolean z;
        boolean z2;
        boolean z3;
        zu1 zu1Var = this.x.x0;
        wk5 parentLayout = zu1Var.getParentLayout();
        if (!zu1Var.mb) {
            z = ((e) zu1Var).inPreviewMode;
            if (!z) {
                z2 = ((e) zu1Var).inBubbleMode;
                if (!z2 && !hl.E && parentLayout != null && zu1Var.Ma <= 0 && System.currentTimeMillis() - zu1Var.ba >= 250) {
                    if ((zu1Var != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).z()) && !((ActionBarLayout) parentLayout).n) {
                        z3 = ((e) zu1Var).isPaused;
                        if (!z3 && zu1Var.f6) {
                            f41 f41Var = zu1Var.Y1;
                            if (f41Var == null || !f41Var.isShowing()) {
                                nr1 nr1Var = zu1Var.a0;
                                if (nr1Var == null || nr1Var.getTrendingStickersAlert() == null || !zu1Var.a0.getTrendingStickersAlert().isShowing()) {
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
        kg5 kg5Var;
        nt1 nt1Var = this.x;
        zu1 zu1Var = nt1Var.x0;
        if (zu1Var.getParentLayout() == null || !((ActionBarLayout) zu1Var.getParentLayout()).n) {
            zu1Var.T9 = f;
            zu1Var.U9 = f2;
            f41 f41Var = zu1Var.Y1;
            if (f41Var == null || !f41Var.isShowing()) {
                aVar = ((e) zu1Var).actionBar;
                aVar.setTranslationY(f);
                gs1 gs1Var = zu1Var.Mb;
                if (gs1Var != null) {
                    float f3 = zu1Var.T9;
                    zr1 zr1Var = zu1Var.D1;
                    if (zr1Var != null) {
                        i = zr1Var.getCurrentHeight();
                    } else {
                        i = 0;
                    }
                    gs1Var.setTranslationY(f3 + i);
                }
                kg5 kg5Var2 = zu1Var.L1;
                if (kg5Var2 != null) {
                    kg5Var2.setTranslationY(f);
                }
                kg5 kg5Var3 = zu1Var.K1;
                if (kg5Var3 != null) {
                    kg5Var3.setTranslationY(f);
                }
                FrameLayout frameLayout = zu1Var.f1;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f / 2.0f);
                }
                zu1Var.R.setTranslationY(f / 2.0f);
                int i2 = (int) f;
                zu1Var.m1.setBackgroundTranslation(i2);
                q qVar = zu1Var.q3;
                if (qVar != null) {
                    float f4 = 0.5f * f;
                    qVar.y0 = f4;
                    qVar.w.setTranslationY(qVar.z0 + f4);
                }
                a81 a81Var = zu1Var.N2;
                if (a81Var != null) {
                    wk0 wk0Var = (wk0) a81Var.b;
                    wk0Var.u = f;
                    wk0Var.d.invalidate();
                }
                zu1Var.setFragmentPanTranslationOffset(i2);
                zu1Var.O7();
                zu1Var.Q7();
            } else {
                nt1Var.setNonNoveTranslation(f);
            }
            zu1Var.A0.invalidate();
            v21 v21Var = v21.x;
            if (v21Var != null && zu1Var.Sc != null) {
                v21Var.l();
            }
            if (hl.O1() && (zu1Var.getParentActivity() instanceof LaunchActivity)) {
                e lastFragment = ((LaunchActivity) zu1Var.getParentActivity()).N().getLastFragment();
                if (lastFragment instanceof uj3) {
                    uj3 uj3Var = (uj3) lastFragment;
                    uj3Var.x1 = f;
                    uj3Var.u5();
                }
            }
            kg5 kg5Var4 = zu1Var.H2;
            if (kg5Var4 != null && kg5Var4.W) {
                kg5Var4.x(zu1Var.a0.getAudioVideoButtonContainer(), false);
            }
            hr1 hr1Var = zu1Var.m2;
            if (hr1Var != null && (kg5Var = hr1Var.B0) != null) {
                kg5Var.y();
            }
        }
    }

    @Override
    public final void f() {
        mv1 mv1Var;
        zu1 zu1Var = this.x.x0;
        nr1 nr1Var = zu1Var.a0;
        if (nr1Var != null && (mv1Var = nr1Var.v0) != null) {
            mv1Var.run();
            nr1Var.v0 = null;
        }
        kg5 kg5Var = zu1Var.H2;
        if (kg5Var != null && kg5Var.W) {
            kg5Var.x(zu1Var.a0.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i, boolean z) {
        fw1 fw1Var;
        zu1 zu1Var = this.x.x0;
        zu1Var.R4 = true;
        nr1 nr1Var = zu1Var.a0;
        if (nr1Var != null) {
            if (z && (fw1Var = nr1Var.W) != null) {
                hl.r(fw1Var);
                nr1Var.W.run();
            }
            jj1 jj1Var = nr1Var.a0;
            if (jj1Var != null) {
                hl.r(jj1Var);
                nr1Var.a0.run();
            }
        }
        kg5 kg5Var = zu1Var.u2;
        if (kg5Var != null) {
            kg5Var.f(false);
        }
        kg5 kg5Var2 = zu1Var.P1;
        if (kg5Var2 != null) {
            kg5Var2.f(true);
        }
    }

    @Override
    public final int i() {
        nt1 nt1Var = this.x;
        zu1 zu1Var = nt1Var.x0;
        if (nt1Var.getKeyboardHeight() <= hl.L(20.0f) && zu1Var.a0.U0()) {
            return zu1Var.a0.getEmojiPadding();
        }
        return 0;
    }
}
