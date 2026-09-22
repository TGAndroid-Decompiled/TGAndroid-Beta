package ai;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class tb implements GestureDetector.OnGestureListener {
    public final jc f1558a;

    public tb(jc jcVar) {
        this.f1558a = jcVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        jc jcVar = this.f1558a;
        jcVar.f1081g1 = false;
        if (jc.i(jcVar, jcVar.f1104s, motionEvent.getX(), motionEvent.getY(), false)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10;
        jc jcVar = this.f1558a;
        if (jcVar.Z != 0.0f && jcVar.f1110u1 == null && f10 < -1000.0f && !jcVar.f1065a0) {
            jcVar.f1065a0 = true;
            try {
                jcVar.f1104s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            jc.j(jcVar);
        }
        if (jcVar.f1075e0 != 0.0f) {
            if (f10 < -1000.0f) {
                jcVar.n(true);
            } else if (f10 > 1000.0f) {
                jcVar.n(false);
            } else {
                if (jcVar.f1113w.f1471f > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                jcVar.n(z10);
            }
        }
        jcVar.f1081g1 = true;
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float f11;
        org.telegram.ui.Components.pc pcVar;
        jc jcVar = this.f1558a;
        if (!jcVar.f1086j0) {
            return false;
        }
        if (jcVar.f1090l0) {
            jcVar.Z += f10;
            float dp = AndroidUtilities.dp(200.0f);
            if (jcVar.Z > dp && !jcVar.f1065a0) {
                jcVar.f1065a0 = true;
                jc.j(jcVar);
                try {
                    jcVar.f1104s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            jcVar.f1073d0 = Utilities.clamp(jcVar.Z / dp, 1.0f, 0.0f);
            if (jcVar.f1093n0.getCurrentPeerView() != null) {
                jcVar.f1093n0.getCurrentPeerView().invalidate();
            }
            if (jcVar.Z < 0.0f) {
                jcVar.Z = 0.0f;
                jcVar.f1090l0 = false;
            }
            return true;
        }
        if (jcVar.f1071c0) {
            float f12 = jcVar.f1075e0;
            if (f12 > jcVar.f1113w.f1470c && f10 > 0.0f) {
                jcVar.f1075e0 = (0.05f * f10) + f12;
            } else {
                jcVar.f1075e0 = f12 + f10;
            }
            xb xbVar = jcVar.f1104s;
            org.telegram.ui.Components.pc pcVar2 = org.telegram.ui.Components.pc.f27304w;
            if (pcVar2 != null && pcVar2.h == xbVar) {
                pcVar2.b();
            }
            if (jcVar.f1093n0.getCurrentPeerView() != null) {
                jcVar.f1093n0.getCurrentPeerView().invalidate();
            }
            jcVar.v.invalidate();
            if (jcVar.f1075e0 < 0.0f) {
                jcVar.f1075e0 = 0.0f;
                jcVar.f1071c0 = false;
            }
            return true;
        }
        if (jcVar.V > 0.8f) {
            float f13 = -f10;
            if ((f13 > 0.0f && jcVar.W > 0.0f) || (f13 < 0.0f && jcVar.W < 0.0f)) {
                f11 = 0.3f;
                jcVar.W -= f10 * f11;
                xb xbVar2 = jcVar.f1104s;
                pcVar = org.telegram.ui.Components.pc.f27304w;
                if (pcVar != null && pcVar.h == xbVar2) {
                    pcVar.b();
                }
                jc.k(jcVar);
                return true;
            }
        }
        f11 = 0.6f;
        jcVar.W -= f10 * f11;
        xb xbVar22 = jcVar.f1104s;
        pcVar = org.telegram.ui.Components.pc.f27304w;
        if (pcVar != null) {
            pcVar.b();
        }
        jc.k(jcVar);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        f6 currentPeerView;
        boolean z10;
        jc jcVar = this.f1558a;
        if (jcVar.f1075e0 == 0.0f && jcVar.f1078f0) {
            if (!jcVar.f1116x && !jcVar.L0 && !jcVar.f1091m1 && !jcVar.f1085i1 && !jcVar.f1087j1) {
                f6 t10 = jcVar.t();
                if (t10 == null || !t10.O1.f706f) {
                    if (motionEvent.getX() > jcVar.v.getMeasuredWidth() * 0.33f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    f6 currentPeerView2 = jcVar.f1093n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.d1(z10)) {
                        if (!jcVar.f1093n0.E(z10)) {
                            if (z10) {
                                jcVar.q(true);
                                return false;
                            }
                            ic icVar = jcVar.f1120z0;
                            if (icVar != null) {
                                icVar.loopBack();
                                return false;
                            }
                        } else {
                            zb zbVar = jcVar.f1093n0;
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
                zb zbVar2 = jcVar.f1093n0;
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
