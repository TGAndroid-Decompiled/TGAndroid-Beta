package cg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.ph;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.ax;
import org.telegram.ui.fy;
import org.telegram.ui.ux;
public final class m1 extends org.telegram.ui.ActionBar.l {
    public final int f3214p1;
    public final Object f3215q1;

    public m1(Object obj, Context context, int i10) {
        super(context, null);
        this.f3214p1 = i10;
        this.f3215q1 = obj;
    }

    @Override
    public void C(int i10, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.f3214p1) {
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f3215q1;
                super.C(i10, z10);
                if (!z10 && (imageView2 = profileActivity.U0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.E0 && (imageView = this.f23600e) != null) {
                    imageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
                    return;
                }
                return;
            default:
                super.C(i10, z10);
                return;
        }
    }

    @Override
    public boolean M(View view) {
        switch (this.f3214p1) {
            case 4:
                if (!super.M(view) && view != ((fy) this.f3215q1).f38298i0) {
                    return false;
                }
                return true;
            default:
                return super.M(view);
        }
    }

    @Override
    public void O(View[] viewArr, boolean[] zArr) {
        switch (this.f3214p1) {
            case 4:
                super.O(viewArr, zArr);
                ((fy) this.f3215q1).h.a(true, true);
                return;
            default:
                super.O(viewArr, zArr);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f3214p1) {
            case 4:
                fy fyVar = (fy) this.f3215q1;
                ux uxVar = fyVar.T;
                if (uxVar != null && uxVar.getAlpha() > 0.0f && fyVar.f38260b.f49506f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void h(boolean z10) {
        switch (this.f3214p1) {
            case 4:
                fy fyVar = (fy) this.f3215q1;
                fyVar.T.f34546r.getText().clear();
                if (z10 && fyVar.T.f34546r.isFocused()) {
                    AndroidUtilities.hideKeyboard(fyVar.T.f34546r);
                }
                fyVar.T.f34546r.clearFocus();
                fyVar.U.b(false);
                return;
            default:
                super.h(z10);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f3214p1) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.f3215q1).l5(false);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3214p1) {
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f3215q1;
                org.telegram.ui.n0 n0Var = profileActivity.U;
                Rect rect = profileActivity.H2;
                n0Var.getHitRect(rect);
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void r() {
        switch (this.f3214p1) {
            case 4:
                super.r();
                ((fy) this.f3215q1).h.a(false, true);
                return;
            default:
                super.r();
                return;
        }
    }

    @Override
    public void setAlpha(float f9) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        int i10;
        switch (this.f3214p1) {
            case 0:
                if (getAlpha() != f9) {
                    super.setAlpha(f9);
                    viewGroup = ((f3) ((p1) this.f3215q1)).containerView;
                    viewGroup.invalidate();
                    return;
                }
                return;
            case 1:
                super.setAlpha(f9);
                viewGroup2 = ((f3) ((g8) this.f3215q1)).containerView;
                viewGroup2.invalidate();
                return;
            case 2:
                ni niVar = (ni) this.f3215q1;
                ph phVar = niVar.f31069z0;
                TextView textView = niVar.f31006f1;
                ph phVar2 = niVar.f31049t1;
                float alpha = getAlpha();
                super.setAlpha(f9);
                if (alpha != f9) {
                    float f10 = 0.0f;
                    if (textView != null) {
                        float f11 = 1.0f - f9;
                        textView.setAlpha(f11);
                        if (f11 > 0.0f) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        textView.setVisibility(i10);
                    }
                    ni.L(niVar);
                    viewGroup3 = ((f3) niVar).containerView;
                    viewGroup3.invalidate();
                    if (phVar != null && phVar2 != null) {
                        if (phVar.getTag() == null) {
                            fi fiVar = niVar.f31051u0;
                            if (fiVar == null || fiVar.I()) {
                                phVar2.setAlpha(1.0f - f9);
                                phVar2.setTranslationY(AndroidUtilities.dp(44.0f) * f9);
                            }
                            phVar.setTranslationY(AndroidUtilities.dp(48.0f) * f9);
                            return;
                        } else if (niVar.f31051u0 == null) {
                            if (f9 == 0.0f) {
                                f10 = 1.0f;
                            }
                            if (phVar2.getAlpha() != f10) {
                                phVar2.setAlpha(f10);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 3:
                super.setAlpha(f9);
                lg0.I((lg0) this.f3215q1).invalidate();
                return;
            case 4:
            case 6:
            default:
                super.setAlpha(f9);
                return;
            case 5:
                super.setAlpha(f9);
                ((PhotoViewer) this.f3215q1).f35647a0.invalidate();
                return;
            case 7:
                super.setAlpha(f9);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f3215q1;
                secretMediaViewer.f36219r.setAlpha(f9);
                secretMediaViewer.f36210n.setAlpha(f9);
                return;
        }
    }

    @Override
    public void setTag(Object obj) {
        boolean z10;
        switch (this.f3214p1) {
            case 0:
                super.setTag(obj);
                p1 p1Var = (p1) this.f3215q1;
                m1 m1Var = p1Var.J;
                if (m1Var != null && m1Var.getTag() != null) {
                    if (i0.a.f(p1Var.getThemedColor(g6.f23133h5)) > 0.699999988079071d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AndroidUtilities.setLightStatusBar(p1Var, z10);
                    return;
                }
                org.telegram.ui.ActionBar.o2 o2Var = p1Var.f3263b;
                if (o2Var != null) {
                    AndroidUtilities.setLightStatusBar(p1Var, o2Var.isLightStatusBar());
                    return;
                }
                return;
            default:
                super.setTag(obj);
                return;
        }
    }

    @Override
    public void setTranslationY(float f9) {
        View view;
        switch (this.f3214p1) {
            case 4:
                if (f9 != getTranslationY() && (view = ((fy) this.f3215q1).fragmentView) != null) {
                    view.invalidate();
                }
                super.setTranslationY(f9);
                return;
            default:
                super.setTranslationY(f9);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f3214p1) {
            case 2:
                super.setVisibility(i10);
                ni.L((ni) this.f3215q1);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    @Override
    public boolean u() {
        switch (this.f3214p1) {
            case 4:
                ax axVar = ((fy) this.f3215q1).B3;
                if (axVar != null && axVar.c()) {
                    return true;
                }
                return false;
            default:
                return super.u();
        }
    }

    @Override
    public void v(boolean z10) {
        float f9;
        switch (this.f3214p1) {
            case 4:
                ax axVar = ((fy) this.f3215q1).B3;
                if (axVar != null && axVar.c() && getBackButton() != null) {
                    ViewPropertyAnimator animate = getBackButton().animate();
                    if (z10) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    animate.alpha(f9).start();
                }
                super.v(z10);
                return;
            default:
                super.v(z10);
                return;
        }
    }

    public m1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, c6 c6Var, int i10) {
        super(context, c6Var);
        this.f3214p1 = i10;
        this.f3215q1 = notificationCenterDelegate;
    }
}
