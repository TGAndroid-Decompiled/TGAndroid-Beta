package di;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qc;
public final class i9 implements GestureDetector.OnGestureListener {
    public final y9 f8689a;

    public i9(y9 y9Var) {
        this.f8689a = y9Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        y9 y9Var = this.f8689a;
        y9Var.f9433g1 = false;
        if (y9.i(y9Var, y9Var.f9456s, motionEvent.getX(), motionEvent.getY(), false)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10;
        y9 y9Var = this.f8689a;
        if (y9Var.Z != 0.0f && y9Var.f9462u1 == null && f10 < -1000.0f && !y9Var.f9417a0) {
            y9Var.f9417a0 = true;
            try {
                y9Var.f9456s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            y9.j(y9Var);
        }
        if (y9Var.f9427e0 != 0.0f) {
            if (f10 < -1000.0f) {
                y9Var.n(true);
            } else if (f10 > 1000.0f) {
                y9Var.n(false);
            } else {
                if (y9Var.f9465w.f8429f > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y9Var.n(z10);
            }
        }
        y9Var.f9433g1 = true;
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float f11;
        qc qcVar;
        y9 y9Var = this.f8689a;
        if (!y9Var.f9438j0) {
            return false;
        }
        if (y9Var.f9442l0) {
            y9Var.Z += f10;
            float dp = AndroidUtilities.dp(200.0f);
            if (y9Var.Z > dp && !y9Var.f9417a0) {
                y9Var.f9417a0 = true;
                y9.j(y9Var);
                try {
                    y9Var.f9456s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            y9Var.f9425d0 = Utilities.clamp(y9Var.Z / dp, 1.0f, 0.0f);
            if (y9Var.f9445n0.getCurrentPeerView() != null) {
                y9Var.f9445n0.getCurrentPeerView().invalidate();
            }
            if (y9Var.Z < 0.0f) {
                y9Var.Z = 0.0f;
                y9Var.f9442l0 = false;
            }
            return true;
        }
        if (y9Var.f9423c0) {
            float f12 = y9Var.f9427e0;
            if (f12 > y9Var.f9465w.f8428c && f10 > 0.0f) {
                y9Var.f9427e0 = (0.05f * f10) + f12;
            } else {
                y9Var.f9427e0 = f12 + f10;
            }
            m9 m9Var = y9Var.f9456s;
            qc qcVar2 = qc.f31882x;
            if (qcVar2 != null && qcVar2.h == m9Var) {
                qcVar2.b();
            }
            if (y9Var.f9445n0.getCurrentPeerView() != null) {
                y9Var.f9445n0.getCurrentPeerView().invalidate();
            }
            y9Var.v.invalidate();
            if (y9Var.f9427e0 < 0.0f) {
                y9Var.f9427e0 = 0.0f;
                y9Var.f9423c0 = false;
            }
            return true;
        }
        if (y9Var.V > 0.8f) {
            float f13 = -f10;
            if ((f13 > 0.0f && y9Var.W > 0.0f) || (f13 < 0.0f && y9Var.W < 0.0f)) {
                f11 = 0.3f;
                y9Var.W -= f10 * f11;
                m9 m9Var2 = y9Var.f9456s;
                qcVar = qc.f31882x;
                if (qcVar != null && qcVar.h == m9Var2) {
                    qcVar.b();
                }
                y9.k(y9Var);
                return true;
            }
        }
        f11 = 0.6f;
        y9Var.W -= f10 * f11;
        m9 m9Var22 = y9Var.f9456s;
        qcVar = qc.f31882x;
        if (qcVar != null) {
            qcVar.b();
        }
        y9.k(y9Var);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        q4 currentPeerView;
        boolean z10;
        y9 y9Var = this.f8689a;
        if (y9Var.f9427e0 == 0.0f && y9Var.f9430f0) {
            if (!y9Var.f9468x && !y9Var.L0 && !y9Var.f9443m1 && !y9Var.f9437i1 && !y9Var.f9439j1) {
                q4 t10 = y9Var.t();
                if (t10 == null || !t10.D1.f8874f) {
                    if (motionEvent.getX() > y9Var.v.getMeasuredWidth() * 0.33f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q4 currentPeerView2 = y9Var.f9445n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.b1(z10)) {
                        if (!y9Var.f9445n0.E(z10)) {
                            if (z10) {
                                y9Var.q(true);
                                return false;
                            }
                            x9 x9Var = y9Var.f9472z0;
                            if (x9Var != null) {
                                x9Var.loopBack();
                                return false;
                            }
                        } else {
                            o9 o9Var = y9Var.f9445n0;
                            o9Var.L0 = true;
                            o9Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            a5.d dVar = o9Var.M0;
                            AndroidUtilities.cancelRunOnUIThread(dVar);
                            AndroidUtilities.runOnUIThread(dVar, 150L);
                            return false;
                        }
                    }
                }
            } else {
                o9 o9Var2 = y9Var.f9445n0;
                if (o9Var2 != null && (currentPeerView = o9Var2.getCurrentPeerView()) != null) {
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
