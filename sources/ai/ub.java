package ai;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ub implements GestureDetector.OnGestureListener {
    public final kc f1810a;

    public ub(kc kcVar) {
        this.f1810a = kcVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        kc kcVar = this.f1810a;
        kcVar.f1269g1 = false;
        if (kc.i(kcVar, kcVar.f1292s, motionEvent.getX(), motionEvent.getY(), false)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10;
        kc kcVar = this.f1810a;
        if (kcVar.Z != 0.0f && kcVar.f1298u1 == null && f10 < -1000.0f && !kcVar.f1252a0) {
            kcVar.f1252a0 = true;
            try {
                kcVar.f1292s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            kc.j(kcVar);
        }
        if (kcVar.f1263e0 != 0.0f) {
            if (f10 < -1000.0f) {
                kcVar.n(true);
            } else if (f10 > 1000.0f) {
                kcVar.n(false);
            } else {
                if (kcVar.f1301w.f1740f > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                kcVar.n(z10);
            }
        }
        kcVar.f1269g1 = true;
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float f11;
        org.telegram.ui.Components.sc scVar;
        kc kcVar = this.f1810a;
        if (!kcVar.f1274j0) {
            return false;
        }
        if (kcVar.f1278l0) {
            kcVar.Z += f10;
            float dp = AndroidUtilities.dp(200.0f);
            if (kcVar.Z > dp && !kcVar.f1252a0) {
                kcVar.f1252a0 = true;
                kc.j(kcVar);
                try {
                    kcVar.f1292s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            kcVar.f1260d0 = Utilities.clamp(kcVar.Z / dp, 1.0f, 0.0f);
            if (kcVar.f1281n0.getCurrentPeerView() != null) {
                kcVar.f1281n0.getCurrentPeerView().invalidate();
            }
            if (kcVar.Z < 0.0f) {
                kcVar.Z = 0.0f;
                kcVar.f1278l0 = false;
            }
            return true;
        }
        if (kcVar.f1258c0) {
            float f12 = kcVar.f1263e0;
            if (f12 > kcVar.f1301w.f1738c && f10 > 0.0f) {
                kcVar.f1263e0 = (0.05f * f10) + f12;
            } else {
                kcVar.f1263e0 = f12 + f10;
            }
            yb ybVar = kcVar.f1292s;
            org.telegram.ui.Components.sc scVar2 = org.telegram.ui.Components.sc.f30528w;
            if (scVar2 != null && scVar2.h == ybVar) {
                scVar2.b();
            }
            if (kcVar.f1281n0.getCurrentPeerView() != null) {
                kcVar.f1281n0.getCurrentPeerView().invalidate();
            }
            kcVar.v.invalidate();
            if (kcVar.f1263e0 < 0.0f) {
                kcVar.f1263e0 = 0.0f;
                kcVar.f1258c0 = false;
            }
            return true;
        }
        if (kcVar.V > 0.8f) {
            float f13 = -f10;
            if ((f13 > 0.0f && kcVar.W > 0.0f) || (f13 < 0.0f && kcVar.W < 0.0f)) {
                f11 = 0.3f;
                kcVar.W -= f10 * f11;
                yb ybVar2 = kcVar.f1292s;
                scVar = org.telegram.ui.Components.sc.f30528w;
                if (scVar != null && scVar.h == ybVar2) {
                    scVar.b();
                }
                kc.k(kcVar);
                return true;
            }
        }
        f11 = 0.6f;
        kcVar.W -= f10 * f11;
        yb ybVar22 = kcVar.f1292s;
        scVar = org.telegram.ui.Components.sc.f30528w;
        if (scVar != null) {
            scVar.b();
        }
        kc.k(kcVar);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        f6 currentPeerView;
        boolean z10;
        kc kcVar = this.f1810a;
        if (kcVar.f1263e0 == 0.0f && kcVar.f1266f0) {
            if (!kcVar.f1304x && !kcVar.L0 && !kcVar.f1279m1 && !kcVar.f1273i1 && !kcVar.f1275j1) {
                f6 t10 = kcVar.t();
                if (t10 == null || !t10.O1.f824f) {
                    if (motionEvent.getX() > kcVar.v.getMeasuredWidth() * 0.33f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    f6 currentPeerView2 = kcVar.f1281n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.d1(z10)) {
                        if (!kcVar.f1281n0.E(z10)) {
                            if (z10) {
                                kcVar.q(true);
                                return false;
                            }
                            jc jcVar = kcVar.f1308z0;
                            if (jcVar != null) {
                                jcVar.loopBack();
                                return false;
                            }
                        } else {
                            ac acVar = kcVar.f1281n0;
                            acVar.L0 = true;
                            acVar.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            r4 r4Var = acVar.M0;
                            AndroidUtilities.cancelRunOnUIThread(r4Var);
                            AndroidUtilities.runOnUIThread(r4Var, 150L);
                            return false;
                        }
                    }
                }
            } else {
                ac acVar2 = kcVar.f1281n0;
                if (acVar2 != null && (currentPeerView = acVar2.getCurrentPeerView()) != null) {
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
