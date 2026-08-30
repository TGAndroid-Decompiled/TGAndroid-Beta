package eg;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mh;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.ey;
import org.telegram.ui.jx;
import org.telegram.ui.oy;
public final class l1 extends org.telegram.ui.ActionBar.k {
    public final int f5351q1;
    public final Object f5352r1;

    public l1(Object obj, Context context, int i10) {
        super(context, null);
        this.f5351q1 = i10;
        this.f5352r1 = obj;
    }

    @Override
    public void C(int i10, boolean z4) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.f5351q1) {
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f5352r1;
                super.C(i10, z4);
                if (!z4 && (imageView2 = profileActivity.V0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.F0 && (imageView = this.e) != null) {
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
        switch (this.f5351q1) {
            case 4:
                if (!super.N(view) && view != ((oy) this.f5352r1).f37050j0) {
                    return false;
                }
                return true;
            default:
                return super.N(view);
        }
    }

    @Override
    public void O(View[] viewArr, boolean[] zArr) {
        switch (this.f5351q1) {
            case 4:
                super.O(viewArr, zArr);
                ((oy) this.f5352r1).h.a(true, true);
                return;
            default:
                super.O(viewArr, zArr);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f5351q1) {
            case 4:
                oy oyVar = (oy) this.f5352r1;
                ey eyVar = oyVar.U;
                if (eyVar != null && eyVar.getAlpha() > 0.0f && oyVar.f37008b.f46893f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void h(boolean z4) {
        switch (this.f5351q1) {
            case 4:
                oy oyVar = (oy) this.f5352r1;
                oyVar.U.f23815r.getText().clear();
                if (z4 && oyVar.U.f23815r.isFocused()) {
                    AndroidUtilities.hideKeyboard(oyVar.U.f23815r);
                }
                oyVar.U.f23815r.clearFocus();
                oyVar.V.b(false);
                return;
            default:
                super.h(z4);
                return;
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f5351q1) {
            case 6:
                super.onLayout(z4, i10, i11, i12, i13);
                ((ProfileActivity) this.f5352r1).l5(false);
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f5351q1) {
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f5352r1;
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
        switch (this.f5351q1) {
            case 4:
                super.r();
                ((oy) this.f5352r1).h.a(false, true);
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
        switch (this.f5351q1) {
            case 0:
                if (getAlpha() != f10) {
                    super.setAlpha(f10);
                    viewGroup = ((g3) ((o1) this.f5352r1)).containerView;
                    viewGroup.invalidate();
                    return;
                }
                return;
            case 1:
                super.setAlpha(f10);
                viewGroup2 = ((g3) ((c8) this.f5352r1)).containerView;
                viewGroup2.invalidate();
                return;
            case 2:
                li liVar = (li) this.f5352r1;
                mh mhVar = liVar.A0;
                TextView textView = liVar.f26703g1;
                mh mhVar2 = liVar.f26746u1;
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
                    li.M(liVar);
                    viewGroup3 = ((g3) liVar).containerView;
                    viewGroup3.invalidate();
                    if (mhVar != null && mhVar2 != null) {
                        if (mhVar.getTag() == null) {
                            di diVar = liVar.f26748v0;
                            if (diVar == null || diVar.I()) {
                                mhVar2.setAlpha(1.0f - f10);
                                mhVar2.setTranslationY(AndroidUtilities.dp(44.0f) * f10);
                            }
                            mhVar.setTranslationY(AndroidUtilities.dp(48.0f) * f10);
                            return;
                        } else if (liVar.f26748v0 == null) {
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
                vg0.I((vg0) this.f5352r1).invalidate();
                return;
            case 4:
            case 6:
            default:
                super.setAlpha(f10);
                return;
            case 5:
                super.setAlpha(f10);
                ((PhotoViewer) this.f5352r1).f31705b0.invalidate();
                return;
            case 7:
                super.setAlpha(f10);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f5352r1;
                secretMediaViewer.f32261r.setAlpha(f10);
                secretMediaViewer.f32252n.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTag(Object obj) {
        boolean z4;
        switch (this.f5351q1) {
            case 0:
                super.setTag(obj);
                o1 o1Var = (o1) this.f5352r1;
                l1 l1Var = o1Var.K;
                if (l1Var != null && l1Var.getTag() != null) {
                    if (i0.a.f(o1Var.getThemedColor(j6.f19977h5)) > 0.699999988079071d) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    AndroidUtilities.setLightStatusBar(o1Var, z4);
                    return;
                }
                org.telegram.ui.ActionBar.p2 p2Var = o1Var.f5391b;
                if (p2Var != null) {
                    AndroidUtilities.setLightStatusBar(o1Var, p2Var.isLightStatusBar());
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
        switch (this.f5351q1) {
            case 4:
                if (f10 != getTranslationY() && (view = ((oy) this.f5352r1).fragmentView) != null) {
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
        switch (this.f5351q1) {
            case 2:
                super.setVisibility(i10);
                li.M((li) this.f5352r1);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    @Override
    public boolean u() {
        switch (this.f5351q1) {
            case 4:
                jx jxVar = ((oy) this.f5352r1).C3;
                if (jxVar != null && jxVar.c()) {
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
        switch (this.f5351q1) {
            case 4:
                jx jxVar = ((oy) this.f5352r1).C3;
                if (jxVar != null && jxVar.c() && getBackButton() != null) {
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

    public l1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, f6 f6Var, int i10) {
        super(context, f6Var);
        this.f5351q1 = i10;
        this.f5352r1 = notificationCenterDelegate;
    }
}
