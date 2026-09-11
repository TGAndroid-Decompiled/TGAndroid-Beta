package bi;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qc;
public final class za implements GestureDetector.OnGestureListener {
    public final pb f4095a;

    public za(pb pbVar) {
        this.f4095a = pbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        pb pbVar = this.f4095a;
        pbVar.f3549g1 = false;
        if (pb.i(pbVar, pbVar.f3572s, motionEvent.getX(), motionEvent.getY(), false)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10;
        pb pbVar = this.f4095a;
        if (pbVar.Z != 0.0f && pbVar.f3578u1 == null && f10 < -1000.0f && !pbVar.f3532a0) {
            pbVar.f3532a0 = true;
            try {
                pbVar.f3572s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            pb.j(pbVar);
        }
        if (pbVar.f3543e0 != 0.0f) {
            if (f10 < -1000.0f) {
                pbVar.n(true);
            } else if (f10 > 1000.0f) {
                pbVar.n(false);
            } else {
                if (pbVar.f3581w.f2765f > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pbVar.n(z10);
            }
        }
        pbVar.f3549g1 = true;
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float f11;
        qc qcVar;
        pb pbVar = this.f4095a;
        if (!pbVar.f3554j0) {
            return false;
        }
        if (pbVar.f3558l0) {
            pbVar.Z += f10;
            float dp = AndroidUtilities.dp(200.0f);
            if (pbVar.Z > dp && !pbVar.f3532a0) {
                pbVar.f3532a0 = true;
                pb.j(pbVar);
                try {
                    pbVar.f3572s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            pbVar.f3540d0 = Utilities.clamp(pbVar.Z / dp, 1.0f, 0.0f);
            if (pbVar.f3561n0.getCurrentPeerView() != null) {
                pbVar.f3561n0.getCurrentPeerView().invalidate();
            }
            if (pbVar.Z < 0.0f) {
                pbVar.Z = 0.0f;
                pbVar.f3558l0 = false;
            }
            return true;
        }
        if (pbVar.f3538c0) {
            float f12 = pbVar.f3543e0;
            if (f12 > pbVar.f3581w.f2763c && f10 > 0.0f) {
                pbVar.f3543e0 = (0.05f * f10) + f12;
            } else {
                pbVar.f3543e0 = f12 + f10;
            }
            db dbVar = pbVar.f3572s;
            qc qcVar2 = qc.f29671w;
            if (qcVar2 != null && qcVar2.h == dbVar) {
                qcVar2.b();
            }
            if (pbVar.f3561n0.getCurrentPeerView() != null) {
                pbVar.f3561n0.getCurrentPeerView().invalidate();
            }
            pbVar.v.invalidate();
            if (pbVar.f3543e0 < 0.0f) {
                pbVar.f3543e0 = 0.0f;
                pbVar.f3538c0 = false;
            }
            return true;
        }
        if (pbVar.V > 0.8f) {
            float f13 = -f10;
            if ((f13 > 0.0f && pbVar.W > 0.0f) || (f13 < 0.0f && pbVar.W < 0.0f)) {
                f11 = 0.3f;
                pbVar.W -= f10 * f11;
                db dbVar2 = pbVar.f3572s;
                qcVar = qc.f29671w;
                if (qcVar != null && qcVar.h == dbVar2) {
                    qcVar.b();
                }
                pb.k(pbVar);
                return true;
            }
        }
        f11 = 0.6f;
        pbVar.W -= f10 * f11;
        db dbVar22 = pbVar.f3572s;
        qcVar = qc.f29671w;
        if (qcVar != null) {
            qcVar.b();
        }
        pb.k(pbVar);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        o5 currentPeerView;
        boolean z10;
        pb pbVar = this.f4095a;
        if (pbVar.f3543e0 == 0.0f && pbVar.f3546f0) {
            if (!pbVar.f3584x && !pbVar.L0 && !pbVar.f3559m1 && !pbVar.f3553i1 && !pbVar.f3555j1) {
                o5 t10 = pbVar.t();
                if (t10 == null || !t10.O1.f3314f) {
                    if (motionEvent.getX() > pbVar.v.getMeasuredWidth() * 0.33f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    o5 currentPeerView2 = pbVar.f3561n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.d1(z10)) {
                        if (!pbVar.f3561n0.E(z10)) {
                            if (z10) {
                                pbVar.q(true);
                                return false;
                            }
                            ob obVar = pbVar.f3588z0;
                            if (obVar != null) {
                                obVar.loopBack();
                                return false;
                            }
                        } else {
                            fb fbVar = pbVar.f3561n0;
                            fbVar.L0 = true;
                            fbVar.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            androidx.activity.i iVar = fbVar.M0;
                            AndroidUtilities.cancelRunOnUIThread(iVar);
                            AndroidUtilities.runOnUIThread(iVar, 150L);
                            return false;
                        }
                    }
                }
            } else {
                fb fbVar2 = pbVar.f3561n0;
                if (fbVar2 != null && (currentPeerView = fbVar2.getCurrentPeerView()) != null) {
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
