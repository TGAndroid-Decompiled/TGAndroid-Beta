package fg;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.mh;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.fy;
import org.telegram.ui.kx;
import org.telegram.ui.py;
public final class k1 extends org.telegram.ui.ActionBar.k {
    public final int f6372q1;
    public final Object f6373r1;

    public k1(Object obj, Context context, int i10) {
        super(context, null);
        this.f6372q1 = i10;
        this.f6373r1 = obj;
    }

    @Override
    public void C(int i10, boolean z4) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.f6372q1) {
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f6373r1;
                super.C(i10, z4);
                if (!z4 && (imageView2 = profileActivity.V0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.F0 && (imageView = this.f21532e) != null) {
                    imageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
                    return;
                }
                return;
            default:
                super.C(i10, z4);
                return;
        }
    }

    @Override
    public boolean N(View view) {
        switch (this.f6372q1) {
            case 4:
                if (!super.N(view) && view != ((py) this.f6373r1).f40227j0) {
                    return false;
                }
                return true;
            default:
                return super.N(view);
        }
    }

    @Override
    public void O(View[] viewArr, boolean[] zArr) {
        switch (this.f6372q1) {
            case 4:
                super.O(viewArr, zArr);
                ((py) this.f6373r1).h.a(true, true);
                return;
            default:
                super.O(viewArr, zArr);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f6372q1) {
            case 4:
                py pyVar = (py) this.f6373r1;
                fy fyVar = pyVar.U;
                if (fyVar != null && fyVar.getAlpha() > 0.0f && pyVar.f40184b.f50505f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void h(boolean z4) {
        switch (this.f6372q1) {
            case 4:
                py pyVar = (py) this.f6373r1;
                pyVar.U.f26172r.getText().clear();
                if (z4 && pyVar.U.f26172r.isFocused()) {
                    AndroidUtilities.hideKeyboard(pyVar.U.f26172r);
                }
                pyVar.U.f26172r.clearFocus();
                pyVar.V.b(false);
                return;
            default:
                super.h(z4);
                return;
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f6372q1) {
            case 6:
                super.onLayout(z4, i10, i11, i12, i13);
                ((ProfileActivity) this.f6373r1).l5(false);
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f6372q1) {
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f6373r1;
                org.telegram.ui.l0 l0Var = profileActivity.V;
                Rect rect = profileActivity.I2;
                l0Var.getHitRect(rect);
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
        switch (this.f6372q1) {
            case 4:
                super.r();
                ((py) this.f6373r1).h.a(false, true);
                return;
            default:
                super.r();
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        int i10;
        switch (this.f6372q1) {
            case 0:
                if (getAlpha() != f10) {
                    super.setAlpha(f10);
                    viewGroup = ((h3) ((n1) this.f6373r1)).containerView;
                    viewGroup.invalidate();
                    return;
                }
                return;
            case 1:
                super.setAlpha(f10);
                viewGroup2 = ((h3) ((c8) this.f6373r1)).containerView;
                viewGroup2.invalidate();
                return;
            case 2:
                mi miVar = (mi) this.f6373r1;
                mh mhVar = miVar.A0;
                TextView textView = miVar.f29055g1;
                mh mhVar2 = miVar.f29098u1;
                float alpha = getAlpha();
                super.setAlpha(f10);
                if (alpha != f10) {
                    float f11 = 0.0f;
                    if (textView != null) {
                        float f12 = 1.0f - f10;
                        textView.setAlpha(f12);
                        if (f12 > 0.0f) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        textView.setVisibility(i10);
                    }
                    mi.M(miVar);
                    viewGroup3 = ((h3) miVar).containerView;
                    viewGroup3.invalidate();
                    if (mhVar != null && mhVar2 != null) {
                        if (mhVar.getTag() == null) {
                            ei eiVar = miVar.f29100v0;
                            if (eiVar == null || eiVar.I()) {
                                mhVar2.setAlpha(1.0f - f10);
                                mhVar2.setTranslationY(AndroidUtilities.dp(44.0f) * f10);
                            }
                            mhVar.setTranslationY(AndroidUtilities.dp(48.0f) * f10);
                            return;
                        } else if (miVar.f29100v0 == null) {
                            if (f10 == 0.0f) {
                                f11 = 1.0f;
                            }
                            if (mhVar2.getAlpha() != f11) {
                                mhVar2.setAlpha(f11);
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
                super.setAlpha(f10);
                xg0.I((xg0) this.f6373r1).invalidate();
                return;
            case 4:
            case 6:
            default:
                super.setAlpha(f10);
                return;
            case 5:
                super.setAlpha(f10);
                ((PhotoViewer) this.f6373r1).f34230b0.invalidate();
                return;
            case 7:
                super.setAlpha(f10);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f6373r1;
                secretMediaViewer.f34797r.setAlpha(f10);
                secretMediaViewer.f34788n.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTag(Object obj) {
        boolean z4;
        switch (this.f6372q1) {
            case 0:
                super.setTag(obj);
                n1 n1Var = (n1) this.f6373r1;
                k1 k1Var = n1Var.K;
                if (k1Var != null && k1Var.getTag() != null) {
                    if (i0.a.f(n1Var.getThemedColor(k6.f21731h5)) > 0.699999988079071d) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    AndroidUtilities.setLightStatusBar(n1Var, z4);
                    return;
                }
                org.telegram.ui.ActionBar.p2 p2Var = n1Var.f6411b;
                if (p2Var != null) {
                    AndroidUtilities.setLightStatusBar(n1Var, p2Var.isLightStatusBar());
                    return;
                }
                return;
            default:
                super.setTag(obj);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        View view;
        switch (this.f6372q1) {
            case 4:
                if (f10 != getTranslationY() && (view = ((py) this.f6373r1).fragmentView) != null) {
                    view.invalidate();
                }
                super.setTranslationY(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f6372q1) {
            case 2:
                super.setVisibility(i10);
                mi.M((mi) this.f6373r1);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    @Override
    public boolean u() {
        switch (this.f6372q1) {
            case 4:
                kx kxVar = ((py) this.f6373r1).C3;
                if (kxVar != null && kxVar.c()) {
                    return true;
                }
                return false;
            default:
                return super.u();
        }
    }

    @Override
    public void v(boolean z4) {
        float f10;
        switch (this.f6372q1) {
            case 4:
                kx kxVar = ((py) this.f6373r1).C3;
                if (kxVar != null && kxVar.c() && getBackButton() != null) {
                    ViewPropertyAnimator animate = getBackButton().animate();
                    if (z4) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).start();
                }
                super.v(z4);
                return;
            default:
                super.v(z4);
                return;
        }
    }

    public k1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, g6 g6Var, int i10) {
        super(context, g6Var);
        this.f6372q1 = i10;
        this.f6373r1 = notificationCenterDelegate;
    }
}
