package ci;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qc;
public final class k9 implements GestureDetector.OnGestureListener {
    public final aa f5573a;

    public k9(aa aaVar) {
        this.f5573a = aaVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        aa aaVar = this.f5573a;
        aaVar.f5191g1 = false;
        if (aa.i(aaVar, aaVar.f5214s, motionEvent.getX(), motionEvent.getY(), false)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10;
        aa aaVar = this.f5573a;
        if (aaVar.Z != 0.0f && aaVar.f5220u1 == null && f10 < -1000.0f && !aaVar.f5175a0) {
            aaVar.f5175a0 = true;
            try {
                aaVar.f5214s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            aa.j(aaVar);
        }
        if (aaVar.f5185e0 != 0.0f) {
            if (f10 < -1000.0f) {
                aaVar.n(true);
            } else if (f10 > 1000.0f) {
                aaVar.n(false);
            } else {
                if (aaVar.f5223w.f5280f > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                aaVar.n(z10);
            }
        }
        aaVar.f5191g1 = true;
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float f11;
        qc qcVar;
        aa aaVar = this.f5573a;
        if (!aaVar.f5196j0) {
            return false;
        }
        if (aaVar.f5200l0) {
            aaVar.Z += f10;
            float dp = AndroidUtilities.dp(200.0f);
            if (aaVar.Z > dp && !aaVar.f5175a0) {
                aaVar.f5175a0 = true;
                aa.j(aaVar);
                try {
                    aaVar.f5214s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            aaVar.f5183d0 = Utilities.clamp(aaVar.Z / dp, 1.0f, 0.0f);
            if (aaVar.f5203n0.getCurrentPeerView() != null) {
                aaVar.f5203n0.getCurrentPeerView().invalidate();
            }
            if (aaVar.Z < 0.0f) {
                aaVar.Z = 0.0f;
                aaVar.f5200l0 = false;
            }
            return true;
        }
        if (aaVar.f5181c0) {
            float f12 = aaVar.f5185e0;
            if (f12 > aaVar.f5223w.f5279c && f10 > 0.0f) {
                aaVar.f5185e0 = (0.05f * f10) + f12;
            } else {
                aaVar.f5185e0 = f12 + f10;
            }
            o9 o9Var = aaVar.f5214s;
            qc qcVar2 = qc.f29528w;
            if (qcVar2 != null && qcVar2.h == o9Var) {
                qcVar2.b();
            }
            if (aaVar.f5203n0.getCurrentPeerView() != null) {
                aaVar.f5203n0.getCurrentPeerView().invalidate();
            }
            aaVar.v.invalidate();
            if (aaVar.f5185e0 < 0.0f) {
                aaVar.f5185e0 = 0.0f;
                aaVar.f5181c0 = false;
            }
            return true;
        }
        if (aaVar.V > 0.8f) {
            float f13 = -f10;
            if ((f13 > 0.0f && aaVar.W > 0.0f) || (f13 < 0.0f && aaVar.W < 0.0f)) {
                f11 = 0.3f;
                aaVar.W -= f10 * f11;
                o9 o9Var2 = aaVar.f5214s;
                qcVar = qc.f29528w;
                if (qcVar != null && qcVar.h == o9Var2) {
                    qcVar.b();
                }
                aa.k(aaVar);
                return true;
            }
        }
        f11 = 0.6f;
        aaVar.W -= f10 * f11;
        o9 o9Var22 = aaVar.f5214s;
        qcVar = qc.f29528w;
        if (qcVar != null) {
            qcVar.b();
        }
        aa.k(aaVar);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        q4 currentPeerView;
        boolean z10;
        aa aaVar = this.f5573a;
        if (aaVar.f5185e0 == 0.0f && aaVar.f5188f0) {
            if (!aaVar.f5226x && !aaVar.L0 && !aaVar.f5201m1 && !aaVar.f5195i1 && !aaVar.f5197j1) {
                q4 t10 = aaVar.t();
                if (t10 == null || !t10.O1.f5691f) {
                    if (motionEvent.getX() > aaVar.v.getMeasuredWidth() * 0.33f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q4 currentPeerView2 = aaVar.f5203n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.d1(z10)) {
                        if (!aaVar.f5203n0.E(z10)) {
                            if (z10) {
                                aaVar.q(true);
                                return false;
                            }
                            z9 z9Var = aaVar.f5230z0;
                            if (z9Var != null) {
                                z9Var.loopBack();
                                return false;
                            }
                        } else {
                            q9 q9Var = aaVar.f5203n0;
                            q9Var.L0 = true;
                            q9Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            androidx.activity.i iVar = q9Var.M0;
                            AndroidUtilities.cancelRunOnUIThread(iVar);
                            AndroidUtilities.runOnUIThread(iVar, 150L);
                            return false;
                        }
                    }
                }
            } else {
                q9 q9Var2 = aaVar.f5203n0;
                if (q9Var2 != null && (currentPeerView = q9Var2.getCurrentPeerView()) != null) {
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
