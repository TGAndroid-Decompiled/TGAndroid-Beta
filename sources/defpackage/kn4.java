package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.Components.FragmentContextView;
public final class kn4 extends AnimatorListenerAdapter {
    public final byte a;
    public final FragmentContextView b;

    public kn4(FragmentContextView fragmentContextView, byte b) {
        this.a = b;
        this.b = fragmentContextView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        FragmentContextView fragmentContextView = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = fragmentContextView.f;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fragmentContextView.f = null;
                    return;
                }
                return;
            case 1:
                fragmentContextView.u0.e();
                AnimatorSet animatorSet2 = fragmentContextView.f;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fragmentContextView.setVisibility(8);
                    rn4 rn4Var = fragmentContextView.p0;
                    if (rn4Var != null) {
                        ((qba) rn4Var).b(false);
                    }
                    fragmentContextView.f = null;
                    if (fragmentContextView.x0) {
                        fragmentContextView.e(false);
                    } else if (fragmentContextView.w0) {
                        fragmentContextView.a(false);
                    } else if (fragmentContextView.y0) {
                        fragmentContextView.g(false);
                    } else if (fragmentContextView.z0) {
                        fragmentContextView.c(false);
                    }
                    fragmentContextView.x0 = false;
                    fragmentContextView.w0 = false;
                    fragmentContextView.y0 = false;
                    fragmentContextView.z0 = false;
                    return;
                }
                return;
            case 2:
                fragmentContextView.u0.e();
                AnimatorSet animatorSet3 = fragmentContextView.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    rn4 rn4Var2 = fragmentContextView.p0;
                    if (rn4Var2 != null) {
                        ((qba) rn4Var2).b(false);
                    }
                    fragmentContextView.f = null;
                    if (fragmentContextView.x0) {
                        fragmentContextView.e(false);
                    } else if (fragmentContextView.w0) {
                        fragmentContextView.a(false);
                    } else if (fragmentContextView.y0) {
                        fragmentContextView.g(false);
                    } else if (fragmentContextView.z0) {
                        fragmentContextView.c(false);
                    }
                    fragmentContextView.x0 = false;
                    fragmentContextView.w0 = false;
                    fragmentContextView.y0 = false;
                    fragmentContextView.z0 = false;
                    return;
                }
                return;
            case 3:
                fragmentContextView.u0.e();
                AnimatorSet animatorSet4 = fragmentContextView.f;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    fragmentContextView.setVisibility(8);
                    fragmentContextView.f = null;
                    if (fragmentContextView.x0) {
                        fragmentContextView.e(false);
                    } else if (fragmentContextView.w0) {
                        fragmentContextView.a(false);
                    } else if (fragmentContextView.y0) {
                        fragmentContextView.g(false);
                    } else if (fragmentContextView.z0) {
                        fragmentContextView.c(false);
                    }
                    fragmentContextView.x0 = false;
                    fragmentContextView.w0 = false;
                    fragmentContextView.y0 = false;
                    fragmentContextView.z0 = false;
                    return;
                }
                return;
            case 4:
                fragmentContextView.u0.e();
                AnimatorSet animatorSet5 = fragmentContextView.f;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    rn4 rn4Var3 = fragmentContextView.p0;
                    if (rn4Var3 != null) {
                        ((qba) rn4Var3).b(false);
                    }
                    fragmentContextView.f = null;
                    if (fragmentContextView.x0) {
                        fragmentContextView.e(false);
                    } else if (fragmentContextView.w0) {
                        fragmentContextView.a(false);
                    } else if (fragmentContextView.y0) {
                        fragmentContextView.g(false);
                    } else if (fragmentContextView.z0) {
                        fragmentContextView.c(false);
                    }
                    fragmentContextView.x0 = false;
                    fragmentContextView.w0 = false;
                    fragmentContextView.y0 = false;
                    fragmentContextView.z0 = false;
                    return;
                }
                return;
            case 5:
                fragmentContextView.u0.e();
                AnimatorSet animatorSet6 = fragmentContextView.f;
                if (animatorSet6 != null && animatorSet6.equals(animator)) {
                    fragmentContextView.setVisibility(8);
                    fragmentContextView.f = null;
                    if (fragmentContextView.x0) {
                        fragmentContextView.e(false);
                    } else if (fragmentContextView.w0) {
                        fragmentContextView.a(false);
                    } else if (fragmentContextView.y0) {
                        fragmentContextView.g(false);
                    } else if (fragmentContextView.z0) {
                        fragmentContextView.c(false);
                    }
                    fragmentContextView.x0 = false;
                    fragmentContextView.w0 = false;
                    fragmentContextView.y0 = false;
                    fragmentContextView.z0 = false;
                    return;
                }
                return;
            case 6:
                fragmentContextView.u0.e();
                AnimatorSet animatorSet7 = fragmentContextView.f;
                if (animatorSet7 != null && animatorSet7.equals(animator)) {
                    fragmentContextView.T = false;
                    fragmentContextView.f = null;
                    fragmentContextView.e(false);
                    return;
                }
                return;
            case 7:
                fragmentContextView.v0.e();
                AnimatorSet animatorSet8 = fragmentContextView.f;
                if (animatorSet8 != null && animatorSet8.equals(animator)) {
                    fragmentContextView.f = null;
                }
                if (fragmentContextView.x0) {
                    fragmentContextView.e(false);
                } else if (fragmentContextView.w0) {
                    fragmentContextView.a(false);
                } else if (fragmentContextView.y0) {
                    fragmentContextView.g(false);
                } else if (fragmentContextView.z0) {
                    fragmentContextView.c(false);
                }
                fragmentContextView.x0 = false;
                fragmentContextView.w0 = false;
                fragmentContextView.y0 = false;
                fragmentContextView.z0 = false;
                fragmentContextView.n();
                return;
            case 8:
                fragmentContextView.u0.e();
                AnimatorSet animatorSet9 = fragmentContextView.f;
                if (animatorSet9 != null && animatorSet9.equals(animator)) {
                    fragmentContextView.setVisibility(8);
                    fragmentContextView.f = null;
                    if (fragmentContextView.x0) {
                        fragmentContextView.e(false);
                    } else if (fragmentContextView.w0) {
                        fragmentContextView.a(false);
                    } else if (fragmentContextView.y0) {
                        fragmentContextView.g(false);
                    } else if (fragmentContextView.z0) {
                        fragmentContextView.c(false);
                    }
                    fragmentContextView.x0 = false;
                    fragmentContextView.w0 = false;
                    fragmentContextView.y0 = false;
                    fragmentContextView.z0 = false;
                    return;
                }
                return;
            case 9:
                fragmentContextView.u0.e();
                AnimatorSet animatorSet10 = fragmentContextView.f;
                if (animatorSet10 != null && animatorSet10.equals(animator)) {
                    fragmentContextView.T = false;
                    fragmentContextView.f = null;
                    fragmentContextView.a(false);
                    return;
                }
                return;
            case 10:
                fragmentContextView.v0.e();
                AnimatorSet animatorSet11 = fragmentContextView.f;
                if (animatorSet11 != null && animatorSet11.equals(animator)) {
                    fragmentContextView.f = null;
                }
                if (fragmentContextView.x0) {
                    fragmentContextView.e(false);
                } else if (fragmentContextView.w0) {
                    fragmentContextView.a(false);
                } else if (fragmentContextView.y0) {
                    fragmentContextView.g(false);
                } else if (fragmentContextView.z0) {
                    fragmentContextView.c(false);
                }
                fragmentContextView.x0 = false;
                fragmentContextView.w0 = false;
                fragmentContextView.y0 = false;
                fragmentContextView.z0 = false;
                fragmentContextView.n();
                return;
            default:
                AnimatorSet animatorSet12 = fragmentContextView.f;
                if (animatorSet12 != null && animatorSet12.equals(animator)) {
                    fragmentContextView.setVisibility(8);
                    fragmentContextView.f = null;
                    return;
                }
                return;
        }
    }
}
