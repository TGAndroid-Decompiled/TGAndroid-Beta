package ai;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class tb implements GestureDetector.OnGestureListener {
    public final jc f1564a;

    public tb(jc jcVar) {
        this.f1564a = jcVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        jc jcVar = this.f1564a;
        jcVar.f1075g1 = false;
        if (jc.i(jcVar, jcVar.f1098s, motionEvent.getX(), motionEvent.getY(), false)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10;
        jc jcVar = this.f1564a;
        if (jcVar.Z != 0.0f && jcVar.f1104u1 == null && f10 < -1000.0f && !jcVar.f1059a0) {
            jcVar.f1059a0 = true;
            try {
                jcVar.f1098s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            jc.j(jcVar);
        }
        if (jcVar.f1069e0 != 0.0f) {
            if (f10 < -1000.0f) {
                jcVar.n(true);
            } else if (f10 > 1000.0f) {
                jcVar.n(false);
            } else {
                if (jcVar.f1107w.f1501f > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                jcVar.n(z10);
            }
        }
        jcVar.f1075g1 = true;
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float f11;
        org.telegram.ui.Components.qc qcVar;
        jc jcVar = this.f1564a;
        if (!jcVar.f1080j0) {
            return false;
        }
        if (jcVar.f1084l0) {
            jcVar.Z += f10;
            float dp = AndroidUtilities.dp(200.0f);
            if (jcVar.Z > dp && !jcVar.f1059a0) {
                jcVar.f1059a0 = true;
                jc.j(jcVar);
                try {
                    jcVar.f1098s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            jcVar.f1067d0 = Utilities.clamp(jcVar.Z / dp, 1.0f, 0.0f);
            if (jcVar.f1087n0.getCurrentPeerView() != null) {
                jcVar.f1087n0.getCurrentPeerView().invalidate();
            }
            if (jcVar.Z < 0.0f) {
                jcVar.Z = 0.0f;
                jcVar.f1084l0 = false;
            }
            return true;
        }
        if (jcVar.f1065c0) {
            float f12 = jcVar.f1069e0;
            if (f12 > jcVar.f1107w.f1500c && f10 > 0.0f) {
                jcVar.f1069e0 = (0.05f * f10) + f12;
            } else {
                jcVar.f1069e0 = f12 + f10;
            }
            xb xbVar = jcVar.f1098s;
            org.telegram.ui.Components.qc qcVar2 = org.telegram.ui.Components.qc.f27570w;
            if (qcVar2 != null && qcVar2.h == xbVar) {
                qcVar2.b();
            }
            if (jcVar.f1087n0.getCurrentPeerView() != null) {
                jcVar.f1087n0.getCurrentPeerView().invalidate();
            }
            jcVar.v.invalidate();
            if (jcVar.f1069e0 < 0.0f) {
                jcVar.f1069e0 = 0.0f;
                jcVar.f1065c0 = false;
            }
            return true;
        }
        if (jcVar.V > 0.8f) {
            float f13 = -f10;
            if ((f13 > 0.0f && jcVar.W > 0.0f) || (f13 < 0.0f && jcVar.W < 0.0f)) {
                f11 = 0.3f;
                jcVar.W -= f10 * f11;
                xb xbVar2 = jcVar.f1098s;
                qcVar = org.telegram.ui.Components.qc.f27570w;
                if (qcVar != null && qcVar.h == xbVar2) {
                    qcVar.b();
                }
                jc.k(jcVar);
                return true;
            }
        }
        f11 = 0.6f;
        jcVar.W -= f10 * f11;
        xb xbVar22 = jcVar.f1098s;
        qcVar = org.telegram.ui.Components.qc.f27570w;
        if (qcVar != null) {
            qcVar.b();
        }
        jc.k(jcVar);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        e6 currentPeerView;
        boolean z10;
        jc jcVar = this.f1564a;
        if (jcVar.f1069e0 == 0.0f && jcVar.f1072f0) {
            if (!jcVar.f1110x && !jcVar.L0 && !jcVar.f1085m1 && !jcVar.f1079i1 && !jcVar.f1081j1) {
                e6 t10 = jcVar.t();
                if (t10 == null || !t10.O1.f645f) {
                    if (motionEvent.getX() > jcVar.v.getMeasuredWidth() * 0.33f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e6 currentPeerView2 = jcVar.f1087n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.d1(z10)) {
                        if (!jcVar.f1087n0.E(z10)) {
                            if (z10) {
                                jcVar.q(true);
                                return false;
                            }
                            ic icVar = jcVar.f1114z0;
                            if (icVar != null) {
                                icVar.loopBack();
                                return false;
                            }
                        } else {
                            zb zbVar = jcVar.f1087n0;
                            zbVar.L0 = true;
                            zbVar.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            q4 q4Var = zbVar.M0;
                            AndroidUtilities.cancelRunOnUIThread(q4Var);
                            AndroidUtilities.runOnUIThread(q4Var, 150L);
                            return false;
                        }
                    }
                }
            } else {
                zb zbVar2 = jcVar.f1087n0;
                if (zbVar2 != null && (currentPeerView = zbVar2.getCurrentPeerView()) != null) {
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
