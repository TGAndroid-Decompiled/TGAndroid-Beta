package bi;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qc;
public final class za implements GestureDetector.OnGestureListener {
    public final pb f4122a;

    public za(pb pbVar) {
        this.f4122a = pbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        pb pbVar = this.f4122a;
        pbVar.f3576g1 = false;
        if (pb.i(pbVar, pbVar.f3599s, motionEvent.getX(), motionEvent.getY(), false)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10;
        pb pbVar = this.f4122a;
        if (pbVar.Z != 0.0f && pbVar.f3605u1 == null && f10 < -1000.0f && !pbVar.f3559a0) {
            pbVar.f3559a0 = true;
            try {
                pbVar.f3599s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            pb.j(pbVar);
        }
        if (pbVar.f3570e0 != 0.0f) {
            if (f10 < -1000.0f) {
                pbVar.n(true);
            } else if (f10 > 1000.0f) {
                pbVar.n(false);
            } else {
                if (pbVar.f3608w.f2792f > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pbVar.n(z10);
            }
        }
        pbVar.f3576g1 = true;
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float f11;
        qc qcVar;
        pb pbVar = this.f4122a;
        if (!pbVar.f3581j0) {
            return false;
        }
        if (pbVar.f3585l0) {
            pbVar.Z += f10;
            float dp = AndroidUtilities.dp(200.0f);
            if (pbVar.Z > dp && !pbVar.f3559a0) {
                pbVar.f3559a0 = true;
                pb.j(pbVar);
                try {
                    pbVar.f3599s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            pbVar.f3567d0 = Utilities.clamp(pbVar.Z / dp, 1.0f, 0.0f);
            if (pbVar.f3588n0.getCurrentPeerView() != null) {
                pbVar.f3588n0.getCurrentPeerView().invalidate();
            }
            if (pbVar.Z < 0.0f) {
                pbVar.Z = 0.0f;
                pbVar.f3585l0 = false;
            }
            return true;
        }
        if (pbVar.f3565c0) {
            float f12 = pbVar.f3570e0;
            if (f12 > pbVar.f3608w.f2790c && f10 > 0.0f) {
                pbVar.f3570e0 = (0.05f * f10) + f12;
            } else {
                pbVar.f3570e0 = f12 + f10;
            }
            db dbVar = pbVar.f3599s;
            qc qcVar2 = qc.f29698w;
            if (qcVar2 != null && qcVar2.h == dbVar) {
                qcVar2.b();
            }
            if (pbVar.f3588n0.getCurrentPeerView() != null) {
                pbVar.f3588n0.getCurrentPeerView().invalidate();
            }
            pbVar.v.invalidate();
            if (pbVar.f3570e0 < 0.0f) {
                pbVar.f3570e0 = 0.0f;
                pbVar.f3565c0 = false;
            }
            return true;
        }
        if (pbVar.V > 0.8f) {
            float f13 = -f10;
            if ((f13 > 0.0f && pbVar.W > 0.0f) || (f13 < 0.0f && pbVar.W < 0.0f)) {
                f11 = 0.3f;
                pbVar.W -= f10 * f11;
                db dbVar2 = pbVar.f3599s;
                qcVar = qc.f29698w;
                if (qcVar != null && qcVar.h == dbVar2) {
                    qcVar.b();
                }
                pb.k(pbVar);
                return true;
            }
        }
        f11 = 0.6f;
        pbVar.W -= f10 * f11;
        db dbVar22 = pbVar.f3599s;
        qcVar = qc.f29698w;
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
        pb pbVar = this.f4122a;
        if (pbVar.f3570e0 == 0.0f && pbVar.f3573f0) {
            if (!pbVar.f3611x && !pbVar.L0 && !pbVar.f3586m1 && !pbVar.f3580i1 && !pbVar.f3582j1) {
                o5 t10 = pbVar.t();
                if (t10 == null || !t10.O1.f3341f) {
                    if (motionEvent.getX() > pbVar.v.getMeasuredWidth() * 0.33f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    o5 currentPeerView2 = pbVar.f3588n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.d1(z10)) {
                        if (!pbVar.f3588n0.E(z10)) {
                            if (z10) {
                                pbVar.q(true);
                                return false;
                            }
                            ob obVar = pbVar.f3615z0;
                            if (obVar != null) {
                                obVar.loopBack();
                                return false;
                            }
                        } else {
                            fb fbVar = pbVar.f3588n0;
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
                fb fbVar2 = pbVar.f3588n0;
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
