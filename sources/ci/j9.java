package ci;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qc;
public final class j9 implements GestureDetector.OnGestureListener {
    public final z9 f5480a;

    public j9(z9 z9Var) {
        this.f5480a = z9Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        z9 z9Var = this.f5480a;
        z9Var.f6226g1 = false;
        if (z9.i(z9Var, z9Var.f6249s, motionEvent.getX(), motionEvent.getY(), false)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10;
        z9 z9Var = this.f5480a;
        if (z9Var.Z != 0.0f && z9Var.f6255u1 == null && f10 < -1000.0f && !z9Var.f6210a0) {
            z9Var.f6210a0 = true;
            try {
                z9Var.f6249s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z9.j(z9Var);
        }
        if (z9Var.f6220e0 != 0.0f) {
            if (f10 < -1000.0f) {
                z9Var.n(true);
            } else if (f10 > 1000.0f) {
                z9Var.n(false);
            } else {
                if (z9Var.f6258w.f5179f > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z9Var.n(z10);
            }
        }
        z9Var.f6226g1 = true;
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float f11;
        qc qcVar;
        z9 z9Var = this.f5480a;
        if (!z9Var.f6231j0) {
            return false;
        }
        if (z9Var.f6235l0) {
            z9Var.Z += f10;
            float dp = AndroidUtilities.dp(200.0f);
            if (z9Var.Z > dp && !z9Var.f6210a0) {
                z9Var.f6210a0 = true;
                z9.j(z9Var);
                try {
                    z9Var.f6249s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            z9Var.f6218d0 = Utilities.clamp(z9Var.Z / dp, 1.0f, 0.0f);
            if (z9Var.f6238n0.getCurrentPeerView() != null) {
                z9Var.f6238n0.getCurrentPeerView().invalidate();
            }
            if (z9Var.Z < 0.0f) {
                z9Var.Z = 0.0f;
                z9Var.f6235l0 = false;
            }
            return true;
        }
        if (z9Var.f6216c0) {
            float f12 = z9Var.f6220e0;
            if (f12 > z9Var.f6258w.f5178c && f10 > 0.0f) {
                z9Var.f6220e0 = (0.05f * f10) + f12;
            } else {
                z9Var.f6220e0 = f12 + f10;
            }
            n9 n9Var = z9Var.f6249s;
            qc qcVar2 = qc.f29631w;
            if (qcVar2 != null && qcVar2.h == n9Var) {
                qcVar2.b();
            }
            if (z9Var.f6238n0.getCurrentPeerView() != null) {
                z9Var.f6238n0.getCurrentPeerView().invalidate();
            }
            z9Var.v.invalidate();
            if (z9Var.f6220e0 < 0.0f) {
                z9Var.f6220e0 = 0.0f;
                z9Var.f6216c0 = false;
            }
            return true;
        }
        if (z9Var.V > 0.8f) {
            float f13 = -f10;
            if ((f13 > 0.0f && z9Var.W > 0.0f) || (f13 < 0.0f && z9Var.W < 0.0f)) {
                f11 = 0.3f;
                z9Var.W -= f10 * f11;
                n9 n9Var2 = z9Var.f6249s;
                qcVar = qc.f29631w;
                if (qcVar != null && qcVar.h == n9Var2) {
                    qcVar.b();
                }
                z9.k(z9Var);
                return true;
            }
        }
        f11 = 0.6f;
        z9Var.W -= f10 * f11;
        n9 n9Var22 = z9Var.f6249s;
        qcVar = qc.f29631w;
        if (qcVar != null) {
            qcVar.b();
        }
        z9.k(z9Var);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        p4 currentPeerView;
        boolean z10;
        z9 z9Var = this.f5480a;
        if (z9Var.f6220e0 == 0.0f && z9Var.f6223f0) {
            if (!z9Var.f6261x && !z9Var.L0 && !z9Var.f6236m1 && !z9Var.f6230i1 && !z9Var.f6232j1) {
                p4 t10 = z9Var.t();
                if (t10 == null || !t10.O1.f5594f) {
                    if (motionEvent.getX() > z9Var.v.getMeasuredWidth() * 0.33f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    p4 currentPeerView2 = z9Var.f6238n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.d1(z10)) {
                        if (!z9Var.f6238n0.E(z10)) {
                            if (z10) {
                                z9Var.q(true);
                                return false;
                            }
                            y9 y9Var = z9Var.f6265z0;
                            if (y9Var != null) {
                                y9Var.loopBack();
                                return false;
                            }
                        } else {
                            p9 p9Var = z9Var.f6238n0;
                            p9Var.L0 = true;
                            p9Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            androidx.activity.i iVar = p9Var.M0;
                            AndroidUtilities.cancelRunOnUIThread(iVar);
                            AndroidUtilities.runOnUIThread(iVar, 150L);
                            return false;
                        }
                    }
                }
            } else {
                p9 p9Var2 = z9Var.f6238n0;
                if (p9Var2 != null && (currentPeerView = p9Var2.getCurrentPeerView()) != null) {
                    currentPeerView.s0();
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
