package bi;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.sc;
public final class cb implements GestureDetector.OnGestureListener {
    public final sb f2935a;

    public cb(sb sbVar) {
        this.f2935a = sbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        sb sbVar = this.f2935a;
        sbVar.f3677g1 = false;
        if (sb.i(sbVar, sbVar.f3700s, motionEvent.getX(), motionEvent.getY(), false)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10;
        sb sbVar = this.f2935a;
        if (sbVar.Z != 0.0f && sbVar.f3706u1 == null && f10 < -1000.0f && !sbVar.f3661a0) {
            sbVar.f3661a0 = true;
            try {
                sbVar.f3700s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            sb.j(sbVar);
        }
        if (sbVar.f3671e0 != 0.0f) {
            if (f10 < -1000.0f) {
                sbVar.n(true);
            } else if (f10 > 1000.0f) {
                sbVar.n(false);
            } else {
                if (sbVar.f3709w.f2991f > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sbVar.n(z10);
            }
        }
        sbVar.f3677g1 = true;
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float f11;
        sc scVar;
        sb sbVar = this.f2935a;
        if (!sbVar.f3682j0) {
            return false;
        }
        if (sbVar.f3686l0) {
            sbVar.Z += f10;
            float dp = AndroidUtilities.dp(200.0f);
            if (sbVar.Z > dp && !sbVar.f3661a0) {
                sbVar.f3661a0 = true;
                sb.j(sbVar);
                try {
                    sbVar.f3700s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            sbVar.f3669d0 = Utilities.clamp(sbVar.Z / dp, 1.0f, 0.0f);
            if (sbVar.f3689n0.getCurrentPeerView() != null) {
                sbVar.f3689n0.getCurrentPeerView().invalidate();
            }
            if (sbVar.Z < 0.0f) {
                sbVar.Z = 0.0f;
                sbVar.f3686l0 = false;
            }
            return true;
        }
        if (sbVar.f3667c0) {
            float f12 = sbVar.f3671e0;
            if (f12 > sbVar.f3709w.f2990c && f10 > 0.0f) {
                sbVar.f3671e0 = (0.05f * f10) + f12;
            } else {
                sbVar.f3671e0 = f12 + f10;
            }
            gb gbVar = sbVar.f3700s;
            sc scVar2 = sc.f29095w;
            if (scVar2 != null && scVar2.h == gbVar) {
                scVar2.b();
            }
            if (sbVar.f3689n0.getCurrentPeerView() != null) {
                sbVar.f3689n0.getCurrentPeerView().invalidate();
            }
            sbVar.v.invalidate();
            if (sbVar.f3671e0 < 0.0f) {
                sbVar.f3671e0 = 0.0f;
                sbVar.f3667c0 = false;
            }
            return true;
        }
        if (sbVar.V > 0.8f) {
            float f13 = -f10;
            if ((f13 > 0.0f && sbVar.W > 0.0f) || (f13 < 0.0f && sbVar.W < 0.0f)) {
                f11 = 0.3f;
                sbVar.W -= f10 * f11;
                gb gbVar2 = sbVar.f3700s;
                scVar = sc.f29095w;
                if (scVar != null && scVar.h == gbVar2) {
                    scVar.b();
                }
                sb.k(sbVar);
                return true;
            }
        }
        f11 = 0.6f;
        sbVar.W -= f10 * f11;
        gb gbVar22 = sbVar.f3700s;
        scVar = sc.f29095w;
        if (scVar != null) {
            scVar.b();
        }
        sb.k(sbVar);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        q5 currentPeerView;
        boolean z10;
        sb sbVar = this.f2935a;
        if (sbVar.f3671e0 == 0.0f && sbVar.f3674f0) {
            if (!sbVar.f3712x && !sbVar.L0 && !sbVar.f3687m1 && !sbVar.f3681i1 && !sbVar.f3683j1) {
                q5 t10 = sbVar.t();
                if (t10 == null || !t10.O1.f3416f) {
                    if (motionEvent.getX() > sbVar.v.getMeasuredWidth() * 0.33f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q5 currentPeerView2 = sbVar.f3689n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.d1(z10)) {
                        if (!sbVar.f3689n0.E(z10)) {
                            if (z10) {
                                sbVar.q(true);
                                return false;
                            }
                            rb rbVar = sbVar.f3716z0;
                            if (rbVar != null) {
                                rbVar.loopBack();
                                return false;
                            }
                        } else {
                            ib ibVar = sbVar.f3689n0;
                            ibVar.L0 = true;
                            ibVar.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            androidx.activity.i iVar = ibVar.M0;
                            AndroidUtilities.cancelRunOnUIThread(iVar);
                            AndroidUtilities.runOnUIThread(iVar, 150L);
                            return false;
                        }
                    }
                }
            } else {
                ib ibVar2 = sbVar.f3689n0;
                if (ibVar2 != null && (currentPeerView = ibVar2.getCurrentPeerView()) != null) {
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
