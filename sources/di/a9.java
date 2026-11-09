package di;

import a8.ra;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.cc;
public final class a9 implements GestureDetector.OnGestureListener {
    public final q9 f8819a;

    public a9(q9 q9Var) {
        this.f8819a = q9Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        q9 q9Var = this.f8819a;
        q9Var.f9610f1 = false;
        if (q9.c(q9Var, q9Var.f9634s, motionEvent.getX(), motionEvent.getY(), false)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z9;
        q9 q9Var = this.f8819a;
        if (q9Var.Z != 0.0f && q9Var.f9638t1 == null && f11 < -1000.0f && !q9Var.f9595a0) {
            q9Var.f9595a0 = true;
            try {
                q9Var.f9634s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            q9.g(q9Var);
        }
        if (q9Var.f9606e0 != 0.0f) {
            if (f11 < -1000.0f) {
                q9Var.o(true);
            } else if (f11 > 1000.0f) {
                q9Var.o(false);
            } else {
                if (q9Var.f9645x.f9788f > 0.5f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                q9Var.o(z9);
            }
        }
        q9Var.f9610f1 = true;
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float f12;
        cc ccVar;
        q9 q9Var = this.f8819a;
        if (!q9Var.f9617j0) {
            return false;
        }
        if (q9Var.f9621l0) {
            q9Var.Z += f11;
            float L = org.telegram.messenger.g0.L(200.0f);
            if (q9Var.Z > L && !q9Var.f9595a0) {
                q9Var.f9595a0 = true;
                q9.g(q9Var);
                try {
                    q9Var.f9634s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            q9Var.f9603d0 = Utilities.i(q9Var.Z / L, 1.0f, 0.0f);
            if (q9Var.f9624n0.getCurrentPeerView() != null) {
                q9Var.f9624n0.getCurrentPeerView().invalidate();
            }
            if (q9Var.Z < 0.0f) {
                q9Var.Z = 0.0f;
                q9Var.f9621l0 = false;
            }
            return true;
        }
        if (q9Var.f9601c0) {
            float f13 = q9Var.f9606e0;
            if (f13 > q9Var.f9645x.f9786c && f11 > 0.0f) {
                q9Var.f9606e0 = (0.05f * f11) + f13;
            } else {
                q9Var.f9606e0 = f13 + f11;
            }
            e9 e9Var = q9Var.f9634s;
            cc ccVar2 = cc.f32619w;
            if (ccVar2 != null && ccVar2.h == e9Var) {
                ccVar2.b();
            }
            if (q9Var.f9624n0.getCurrentPeerView() != null) {
                q9Var.f9624n0.getCurrentPeerView().invalidate();
            }
            q9Var.f9643w.invalidate();
            if (q9Var.f9606e0 < 0.0f) {
                q9Var.f9606e0 = 0.0f;
                q9Var.f9601c0 = false;
            }
            return true;
        }
        if (q9Var.V > 0.8f) {
            float f14 = -f11;
            if ((f14 > 0.0f && q9Var.W > 0.0f) || (f14 < 0.0f && q9Var.W < 0.0f)) {
                f12 = 0.3f;
                q9Var.W -= f11 * f12;
                e9 e9Var2 = q9Var.f9634s;
                ccVar = cc.f32619w;
                if (ccVar != null && ccVar.h == e9Var2) {
                    ccVar.b();
                }
                q9.i(q9Var);
                return true;
            }
        }
        f12 = 0.6f;
        q9Var.W -= f11 * f12;
        e9 e9Var22 = q9Var.f9634s;
        ccVar = cc.f32619w;
        if (ccVar != null) {
            ccVar.b();
        }
        q9.i(q9Var);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        j4 currentPeerView;
        boolean z9;
        q9 q9Var = this.f8819a;
        if (q9Var.f9606e0 == 0.0f && q9Var.f9609f0) {
            if (!q9Var.f9647y && !q9Var.K0 && !q9Var.l1 && !q9Var.f9614h1 && !q9Var.f9616i1) {
                j4 z10 = q9Var.z();
                if (z10 == null || !z10.f9245x1.f9068f) {
                    if (motionEvent.getX() > q9Var.f9643w.getMeasuredWidth() * 0.33f) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    j4 currentPeerView2 = q9Var.f9624n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.b1(z9)) {
                        if (!q9Var.f9624n0.E(z9)) {
                            if (z9) {
                                q9Var.u(true);
                                return false;
                            }
                            p9 p9Var = q9Var.f9649z0;
                            if (p9Var != null) {
                                p9Var.loopBack();
                                return false;
                            }
                        } else {
                            g9 g9Var = q9Var.f9624n0;
                            g9Var.L0 = true;
                            g9Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            ra raVar = g9Var.M0;
                            org.telegram.messenger.g0.r(raVar);
                            org.telegram.messenger.g0.i3(raVar, 150L);
                            return false;
                        }
                    }
                }
            } else {
                g9 g9Var2 = q9Var.f9624n0;
                if (g9Var2 != null && (currentPeerView = g9Var2.getCurrentPeerView()) != null) {
                    currentPeerView.q0();
                }
            }
        }
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
