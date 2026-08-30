package nh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ic;
public final class s8 implements GestureDetector.OnGestureListener {
    public final i9 f15895a;

    public s8(i9 i9Var) {
        this.f15895a = i9Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        i9 i9Var = this.f15895a;
        i9Var.f15458d1 = false;
        if (i9.i(i9Var, i9Var.f15488s, motionEvent.getX(), motionEvent.getY(), false)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z4;
        i9 i9Var = this.f15895a;
        if (i9Var.W != 0.0f && i9Var.f15487r1 == null && f11 < -1000.0f && !i9Var.X) {
            i9Var.X = true;
            try {
                i9Var.f15488s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            i9.j(i9Var);
        }
        if (i9Var.f15452b0 != 0.0f) {
            if (f11 < -1000.0f) {
                i9Var.n(true);
            } else if (f11 > 1000.0f) {
                i9Var.n(false);
            } else {
                if (i9Var.f15495w.f15611f > 0.5f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                i9Var.n(z4);
            }
        }
        i9Var.f15458d1 = true;
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float f12;
        ic icVar;
        i9 i9Var = this.f15895a;
        if (!i9Var.f15464g0) {
            return false;
        }
        if (i9Var.f15468i0) {
            i9Var.W += f11;
            float dp = AndroidUtilities.dp(200.0f);
            if (i9Var.W > dp && !i9Var.X) {
                i9Var.X = true;
                i9.j(i9Var);
                try {
                    i9Var.f15488s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            i9Var.f15449a0 = Utilities.clamp(i9Var.W / dp, 1.0f, 0.0f);
            if (i9Var.f15472k0.getCurrentPeerView() != null) {
                i9Var.f15472k0.getCurrentPeerView().invalidate();
            }
            if (i9Var.W < 0.0f) {
                i9Var.W = 0.0f;
                i9Var.f15468i0 = false;
            }
            return true;
        }
        if (i9Var.Z) {
            float f13 = i9Var.f15452b0;
            if (f13 > i9Var.f15495w.f15610c && f11 > 0.0f) {
                i9Var.f15452b0 = (0.05f * f11) + f13;
            } else {
                i9Var.f15452b0 = f13 + f11;
            }
            w8 w8Var = i9Var.f15488s;
            ic icVar2 = ic.f25665w;
            if (icVar2 != null && icVar2.h == w8Var) {
                icVar2.b();
            }
            if (i9Var.f15472k0.getCurrentPeerView() != null) {
                i9Var.f15472k0.getCurrentPeerView().invalidate();
            }
            i9Var.v.invalidate();
            if (i9Var.f15452b0 < 0.0f) {
                i9Var.f15452b0 = 0.0f;
                i9Var.Z = false;
            }
            return true;
        }
        if (i9Var.S > 0.8f) {
            float f14 = -f11;
            if ((f14 > 0.0f && i9Var.T > 0.0f) || (f14 < 0.0f && i9Var.T < 0.0f)) {
                f12 = 0.3f;
                i9Var.T -= f11 * f12;
                w8 w8Var2 = i9Var.f15488s;
                icVar = ic.f25665w;
                if (icVar != null && icVar.h == w8Var2) {
                    icVar.b();
                }
                i9.k(i9Var);
                return true;
            }
        }
        f12 = 0.6f;
        i9Var.T -= f11 * f12;
        w8 w8Var22 = i9Var.f15488s;
        icVar = ic.f25665w;
        if (icVar != null) {
            icVar.b();
        }
        i9.k(i9Var);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        d4 currentPeerView;
        boolean z4;
        i9 i9Var = this.f15895a;
        if (i9Var.f15452b0 == 0.0f && i9Var.f15455c0) {
            if (!i9Var.f15497x && !i9Var.I0 && !i9Var.f15471j1 && !i9Var.f15463f1 && !i9Var.f15465g1) {
                d4 t6 = i9Var.t();
                if (t6 == null || !t6.L1.f15114f) {
                    if (motionEvent.getX() > i9Var.v.getMeasuredWidth() * 0.33f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    d4 currentPeerView2 = i9Var.f15472k0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.d1(z4)) {
                        if (!i9Var.f15472k0.E(z4)) {
                            if (z4) {
                                i9Var.q(true);
                                return false;
                            }
                            h9 h9Var = i9Var.f15496w0;
                            if (h9Var != null) {
                                h9Var.loopBack();
                                return false;
                            }
                        } else {
                            y8 y8Var = i9Var.f15472k0;
                            y8Var.I0 = true;
                            y8Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            m2.b bVar = y8Var.J0;
                            AndroidUtilities.cancelRunOnUIThread(bVar);
                            AndroidUtilities.runOnUIThread(bVar, 150L);
                            return false;
                        }
                    }
                }
            } else {
                y8 y8Var2 = i9Var.f15472k0;
                if (y8Var2 != null && (currentPeerView = y8Var2.getCurrentPeerView()) != null) {
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
