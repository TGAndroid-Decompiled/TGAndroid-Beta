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
public final class z96 implements xh5, nh5, ed, zh5, mg0 {
    public final byte a;
    public final qa6 b;

    public z96(qa6 qa6Var, byte b) {
        this.a = b;
        this.b = qa6Var;
    }

    @Override
    public final boolean a(MotionEvent motionEvent, wy4 wy4Var) {
        MotionEvent motionEvent2;
        Location location;
        byte b = this.a;
        qa6 qa6Var = this.b;
        switch (b) {
            case 0:
                qa6Var.C0();
                if (qa6Var.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-qa6Var.K) / 2.0f);
                    motionEvent2 = motionEvent;
                } else {
                    motionEvent2 = null;
                }
                boolean booleanValue = wy4Var.a(motionEvent).booleanValue();
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                return booleanValue;
            default:
                if (qa6Var.J0 == null && qa6Var.H0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = qa6Var.s0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        qa6Var.s0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        qa6Var.s0.playTogether(ObjectAnimator.ofFloat(qa6Var.U, View.TRANSLATION_Y, qa6Var.B0 - gl.L(10.0f)));
                        qa6Var.s0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = qa6Var.s0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        qa6Var.K = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        qa6Var.s0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        qa6Var.s0.playTogether(ObjectAnimator.ofFloat(qa6Var.U, View.TRANSLATION_Y, qa6Var.B0));
                        qa6Var.s0.start();
                        qa6Var.Q.H();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!qa6Var.K0) {
                            ImageView imageView = qa6Var.a;
                            int i = bkb.kj;
                            zkb.s(imageView, i, qa6Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            qa6Var.a.setTag(Integer.valueOf(i));
                            qa6Var.K0 = true;
                        }
                        ty4 ty4Var = qa6Var.F;
                        if (ty4Var != null && (location = qa6Var.A0) != null) {
                            location.setLatitude(((yh5) ty4Var.d().b).a);
                            qa6Var.A0.setLongitude(((yh5) qa6Var.F.d().b).b);
                        }
                        qa6Var.Q.L(qa6Var.A0);
                    }
                }
                return wy4Var.a(motionEvent).booleanValue();
        }
    }

    @Override
    public final void b() {
        qa6 qa6Var = this.b;
        qa6Var.w0 = false;
        qa6Var.N0();
    }

    @Override
    public final void c(int i) {
        View childAt;
        s49 T;
        int L;
        qa6 qa6Var = this.b;
        byte b = qa6Var.N0;
        if (i == 1) {
            qa6Var.q0 = -1L;
            if (qa6Var.r0) {
                qa6Var.r0 = false;
                qa6Var.Q0();
            }
            if (!qa6Var.N) {
                if ((b == 0 || b == 1) && qa6Var.R.getChildCount() > 0 && (childAt = qa6Var.R.getChildAt(0)) != null) {
                    fu fuVar = qa6Var.R;
                    View F = fuVar.F(childAt);
                    if (F == null) {
                        T = null;
                    } else {
                        T = fuVar.T(F);
                    }
                    if (T != null && T.b() == 0) {
                        if (b == 0) {
                            L = 0;
                        } else {
                            L = gl.L(66.0f);
                        }
                        int top = childAt.getTop();
                        if (top < (-L)) {
                            fw5 d = qa6Var.F.d();
                            qa6Var.I = ((ize) a.j()).newCameraUpdateLatLngZoom((yh5) d.b, d.c);
                            qa6Var.R.x0(0, top + L, null);
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
        qa6 qa6Var = this.b;
        qa6Var.D0(location);
        qa6Var.getLocationController().n(location, qa6Var.l0);
        qa6Var.l0 = false;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        qa6 qa6Var = this.b;
        switch (b) {
            case 4:
                if (qa6Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                        qa6Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        return;
                    }
                }
                return;
            default:
                if (qa6Var.getParentActivity() != null) {
                    try {
                        qa6Var.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }
}
