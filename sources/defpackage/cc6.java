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
public final class cc6 implements zj5, pj5, fd, bk5, ng0 {
    public final byte a;
    public final uc6 b;

    public cc6(uc6 uc6Var, byte b) {
        this.a = b;
        this.b = uc6Var;
    }

    @Override
    public final boolean a(MotionEvent motionEvent, a15 a15Var) {
        MotionEvent motionEvent2;
        Location location;
        byte b = this.a;
        uc6 uc6Var = this.b;
        switch (b) {
            case 0:
                uc6Var.D0();
                if (uc6Var.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-uc6Var.K) / 2.0f);
                    motionEvent2 = motionEvent;
                } else {
                    motionEvent2 = null;
                }
                boolean booleanValue = a15Var.a(motionEvent).booleanValue();
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                return booleanValue;
            default:
                if (uc6Var.J0 == null && uc6Var.H0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = uc6Var.s0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        uc6Var.s0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        uc6Var.s0.playTogether(ObjectAnimator.ofFloat(uc6Var.U, View.TRANSLATION_Y, uc6Var.B0 - hl.L(10.0f)));
                        uc6Var.s0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = uc6Var.s0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        uc6Var.K = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        uc6Var.s0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        uc6Var.s0.playTogether(ObjectAnimator.ofFloat(uc6Var.U, View.TRANSLATION_Y, uc6Var.B0));
                        uc6Var.s0.start();
                        uc6Var.Q.H();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!uc6Var.K0) {
                            ImageView imageView = uc6Var.a;
                            int i = aob.lj;
                            yob.s(imageView, i, uc6Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            uc6Var.a.setTag(Integer.valueOf(i));
                            uc6Var.K0 = true;
                        }
                        x05 x05Var = uc6Var.F;
                        if (x05Var != null && (location = uc6Var.A0) != null) {
                            location.setLatitude(((ak5) x05Var.d().b).a);
                            uc6Var.A0.setLongitude(((ak5) uc6Var.F.d().b).b);
                        }
                        uc6Var.Q.L(uc6Var.A0);
                    }
                }
                return a15Var.a(motionEvent).booleanValue();
        }
    }

    @Override
    public final void b() {
        uc6 uc6Var = this.b;
        uc6Var.w0 = false;
        uc6Var.O0();
    }

    @Override
    public final void c(int i) {
        View childAt;
        f89 U;
        int L;
        uc6 uc6Var = this.b;
        byte b = uc6Var.N0;
        if (i == 1) {
            uc6Var.q0 = -1L;
            if (uc6Var.r0) {
                uc6Var.r0 = false;
                uc6Var.R0();
            }
            if (!uc6Var.N) {
                if ((b == 0 || b == 1) && uc6Var.R.getChildCount() > 0 && (childAt = uc6Var.R.getChildAt(0)) != null) {
                    gu guVar = uc6Var.R;
                    View G = guVar.G(childAt);
                    if (G == null) {
                        U = null;
                    } else {
                        U = guVar.U(G);
                    }
                    if (U != null && U.b() == 0) {
                        if (b == 0) {
                            L = 0;
                        } else {
                            L = hl.L(66.0f);
                        }
                        int top = childAt.getTop();
                        if (top < (-L)) {
                            ky5 d = uc6Var.F.d();
                            uc6Var.I = ((z3f) a.j()).newCameraUpdateLatLngZoom((ak5) d.b, d.c);
                            uc6Var.R.y0(0, top + L, null);
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
        uc6 uc6Var = this.b;
        uc6Var.E0(location);
        uc6Var.getLocationController().n(location, uc6Var.l0);
        uc6Var.l0 = false;
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        uc6 uc6Var = this.b;
        switch (b) {
            case 4:
                if (uc6Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                        uc6Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                return;
            default:
                if (uc6Var.getParentActivity() != null) {
                    try {
                        uc6Var.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }
}
