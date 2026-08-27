package ag;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.yh;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.bx;
import org.telegram.ui.gy;
import org.telegram.ui.vx;

public final class d2 extends org.telegram.ui.ActionBar.k {

    public final int f333p1;

    public final Object f334q1;

    public d2(Object obj, Context context, int i10) {
        super(context, null);
        this.f333p1 = i10;
        this.f334q1 = obj;
    }

    @Override
    public void D(int i10, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.f333p1) {
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f334q1;
                super.D(i10, z10);
                if (!z10 && (imageView2 = profileActivity.U0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.E0 && (imageView = this.f23566e) != null) {
                    imageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
                    break;
                }
                break;
            default:
                super.D(i10, z10);
                break;
        }
    }

    @Override
    public boolean N(View view) {
        switch (this.f333p1) {
            case 4:
                return super.N(view) || view == ((gy) this.f334q1).f38540i0;
            default:
                return super.N(view);
        }
    }

    @Override
    public void O(View[] viewArr, boolean[] zArr) {
        switch (this.f333p1) {
            case 4:
                super.O(viewArr, zArr);
                ((gy) this.f334q1).h.a(true, true);
                break;
            default:
                super.O(viewArr, zArr);
                break;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f333p1) {
            case 4:
                gy gyVar = (gy) this.f334q1;
                vx vxVar = gyVar.T;
                if (vxVar == null || vxVar.getAlpha() <= 0.0f || !gyVar.f38501b.f48498f) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void h(boolean z10) {
        switch (this.f333p1) {
            case 4:
                gy gyVar = (gy) this.f334q1;
                gyVar.T.f31468r.getText().clear();
                if (z10 && gyVar.T.f31468r.isFocused()) {
                    AndroidUtilities.hideKeyboard(gyVar.T.f31468r);
                }
                gyVar.T.f31468r.clearFocus();
                gyVar.U.b(false);
                break;
            default:
                super.h(z10);
                break;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f333p1) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.f334q1).l5(false);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f333p1) {
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f334q1;
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
    public void s() {
        switch (this.f333p1) {
            case 4:
                super.s();
                ((gy) this.f334q1).h.a(false, true);
                break;
            default:
                super.s();
                break;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f333p1) {
            case 0:
                if (getAlpha() != f10) {
                    super.setAlpha(f10);
                    ((org.telegram.ui.ActionBar.e3) ((g2) this.f334q1)).containerView.invalidate();
                }
                break;
            case 1:
                super.setAlpha(f10);
                ((org.telegram.ui.ActionBar.e3) ((b8) this.f334q1)).containerView.invalidate();
                break;
            case 2:
                gi giVar = (gi) this.f334q1;
                ih ihVar = giVar.f28714z0;
                TextView textView = giVar.f28651f1;
                ih ihVar2 = giVar.f28694t1;
                float alpha = getAlpha();
                super.setAlpha(f10);
                if (alpha != f10) {
                    if (textView != null) {
                        float f11 = 1.0f - f10;
                        textView.setAlpha(f11);
                        textView.setVisibility(f11 > 0.0f ? 0 : 8);
                    }
                    gi.M(giVar);
                    ((org.telegram.ui.ActionBar.e3) giVar).containerView.invalidate();
                    if (ihVar != null && ihVar2 != null) {
                        if (ihVar.getTag() == null) {
                            yh yhVar = giVar.f28696u0;
                            if (yhVar == null || yhVar.J()) {
                                ihVar2.setAlpha(1.0f - f10);
                                ihVar2.setTranslationY(AndroidUtilities.dp(44.0f) * f10);
                            }
                            ihVar.setTranslationY(AndroidUtilities.dp(48.0f) * f10);
                        } else if (giVar.f28696u0 == null) {
                            float f12 = f10 == 0.0f ? 1.0f : 0.0f;
                            if (ihVar2.getAlpha() != f12) {
                                ihVar2.setAlpha(f12);
                            }
                        }
                        break;
                    }
                }
                break;
            case 3:
                super.setAlpha(f10);
                ((org.telegram.ui.ActionBar.e3) ((cg0) this.f334q1)).containerView.invalidate();
                break;
            case 4:
            case 6:
            default:
                super.setAlpha(f10);
                break;
            case 5:
                super.setAlpha(f10);
                ((PhotoViewer) this.f334q1).f35583a0.invalidate();
                break;
            case 7:
                super.setAlpha(f10);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f334q1;
                secretMediaViewer.f36157r.setAlpha(f10);
                secretMediaViewer.f36148n.setAlpha(f10);
                break;
        }
    }

    @Override
    public void setTag(Object obj) {
        switch (this.f333p1) {
            case 0:
                super.setTag(obj);
                g2 g2Var = (g2) this.f334q1;
                d2 d2Var = g2Var.J;
                if (d2Var == null || d2Var.getTag() == null) {
                    org.telegram.ui.ActionBar.n2 n2Var = g2Var.f390b;
                    if (n2Var != null) {
                        AndroidUtilities.setLightStatusBar(g2Var, n2Var.isLightStatusBar());
                    }
                } else {
                    AndroidUtilities.setLightStatusBar(g2Var, i0.b.f(g2Var.getThemedColor(g6.f23124h5)) > 0.699999988079071d);
                }
                break;
            default:
                super.setTag(obj);
                break;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        View view;
        switch (this.f333p1) {
            case 4:
                if (f10 != getTranslationY() && (view = ((gy) this.f334q1).fragmentView) != null) {
                    view.invalidate();
                }
                super.setTranslationY(f10);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f333p1) {
            case 2:
                super.setVisibility(i10);
                gi.M((gi) this.f334q1);
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    @Override
    public boolean v() {
        switch (this.f333p1) {
            case 4:
                bx bxVar = ((gy) this.f334q1).B3;
                return bxVar != null && bxVar.c();
            default:
                return super.v();
        }
    }

    @Override
    public void w(boolean z10) {
        switch (this.f333p1) {
            case 4:
                bx bxVar = ((gy) this.f334q1).B3;
                if (bxVar != null && bxVar.c() && getBackButton() != null) {
                    getBackButton().animate().alpha(z10 ? 1.0f : 0.0f).start();
                }
                super.w(z10);
                break;
            default:
                super.w(z10);
                break;
        }
    }

    public d2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, c6 c6Var, int i10) {
        super(context, c6Var);
        this.f333p1 = i10;
        this.f334q1 = notificationCenterDelegate;
    }
}
