package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.location.Location;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.a;
public final class yb6 implements wj5, mj5, ee, yj5, nh0 {
    public final byte a;
    public final pc6 b;

    public yb6(pc6 pc6Var, byte b) {
        this.a = b;
        this.b = pc6Var;
    }

    @Override
    public final boolean a(MotionEvent motionEvent, v05 v05Var) {
        MotionEvent motionEvent2;
        Location location;
        byte b = this.a;
        pc6 pc6Var = this.b;
        switch (b) {
            case 0:
                pc6Var.D0();
                if (pc6Var.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-pc6Var.K) / 2.0f);
                    motionEvent2 = motionEvent;
                } else {
                    motionEvent2 = null;
                }
                boolean booleanValue = v05Var.a(motionEvent).booleanValue();
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                return booleanValue;
            default:
                if (pc6Var.J0 == null && pc6Var.H0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = pc6Var.s0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        pc6Var.s0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        pc6Var.s0.playTogether(ObjectAnimator.ofFloat(pc6Var.U, View.TRANSLATION_Y, pc6Var.B0 - gm.L(10.0f)));
                        pc6Var.s0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = pc6Var.s0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        pc6Var.K = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        pc6Var.s0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        pc6Var.s0.playTogether(ObjectAnimator.ofFloat(pc6Var.U, View.TRANSLATION_Y, pc6Var.B0));
                        pc6Var.s0.start();
                        pc6Var.Q.H();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!pc6Var.K0) {
                            ImageView imageView = pc6Var.a;
                            int i = cmb.kj;
                            anb.s(imageView, i, pc6Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            pc6Var.a.setTag(Integer.valueOf(i));
                            pc6Var.K0 = true;
                        }
                        s05 s05Var = pc6Var.F;
                        if (s05Var != null && (location = pc6Var.A0) != null) {
                            location.setLatitude(((xj5) s05Var.d().b).a);
                            pc6Var.A0.setLongitude(((xj5) pc6Var.F.d().b).b);
                        }
                        pc6Var.Q.L(pc6Var.A0);
                    }
                }
                return v05Var.a(motionEvent).booleanValue();
        }
    }

    @Override
    public final void b() {
        pc6 pc6Var = this.b;
        pc6Var.w0 = false;
        pc6Var.O0();
    }

    @Override
    public final void c(int i) {
        View childAt;
        u69 T;
        int L;
        pc6 pc6Var = this.b;
        byte b = pc6Var.N0;
        if (i == 1) {
            pc6Var.q0 = -1L;
            if (pc6Var.r0) {
                pc6Var.r0 = false;
                pc6Var.R0();
            }
            if (!pc6Var.N) {
                if ((b == 0 || b == 1) && pc6Var.R.getChildCount() > 0 && (childAt = pc6Var.R.getChildAt(0)) != null) {
                    fv fvVar = pc6Var.R;
                    View F = fvVar.F(childAt);
                    if (F == null) {
                        T = null;
                    } else {
                        T = fvVar.T(F);
                    }
                    if (T != null && T.b() == 0) {
                        if (b == 0) {
                            L = 0;
                        } else {
                            L = gm.L(66.0f);
                        }
                        int top = childAt.getTop();
                        if (top < (-L)) {
                            fy5 d = pc6Var.F.d();
                            pc6Var.I = ((k1f) a.j()).newCameraUpdateLatLngZoom((xj5) d.b, d.c);
                            pc6Var.R.x0(0, top + L, null);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void onLocationChanged(Location location) {
        if (location == null) {
            return;
        }
        pc6 pc6Var = this.b;
        pc6Var.E0(location);
        pc6Var.getLocationController().n(location, pc6Var.l0);
        pc6Var.l0 = false;
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        pc6 pc6Var = this.b;
        switch (b) {
            case 4:
                if (pc6Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                        pc6Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        return;
                    }
                }
                return;
            default:
                if (pc6Var.getParentActivity() != null) {
                    try {
                        pc6Var.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }
}
