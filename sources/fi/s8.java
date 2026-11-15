package fi;

import a8.sa;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xb;
public final class s8 implements GestureDetector.OnGestureListener {
    public final i9 f12345a;

    public s8(i9 i9Var) {
        this.f12345a = i9Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        i9 i9Var = this.f12345a;
        i9Var.f11848g1 = false;
        if (i9.c(i9Var, i9Var.f11870s, motionEvent.getX(), motionEvent.getY(), false)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z10;
        i9 i9Var = this.f12345a;
        if (i9Var.f11831a0 != 0.0f && i9Var.f11876u1 == null && f11 < -1000.0f && !i9Var.f11834b0) {
            i9Var.f11834b0 = true;
            try {
                i9Var.f11870s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            i9.g(i9Var);
        }
        if (i9Var.f11845f0 != 0.0f) {
            if (f11 < -1000.0f) {
                i9Var.o(true);
            } else if (f11 > 1000.0f) {
                i9Var.o(false);
            } else {
                if (i9Var.f11882x.f11931f > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i9Var.o(z10);
            }
        }
        i9Var.f11848g1 = true;
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float f12;
        xb xbVar;
        i9 i9Var = this.f12345a;
        if (!i9Var.f11855k0) {
            return false;
        }
        if (i9Var.m0) {
            i9Var.f11831a0 += f11;
            float L = org.telegram.messenger.g0.L(200.0f);
            if (i9Var.f11831a0 > L && !i9Var.f11834b0) {
                i9Var.f11834b0 = true;
                i9.g(i9Var);
                try {
                    i9Var.f11870s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            i9Var.f11842e0 = Utilities.i(i9Var.f11831a0 / L, 1.0f, 0.0f);
            if (i9Var.f11861o0.getCurrentPeerView() != null) {
                i9Var.f11861o0.getCurrentPeerView().invalidate();
            }
            if (i9Var.f11831a0 < 0.0f) {
                i9Var.f11831a0 = 0.0f;
                i9Var.m0 = false;
            }
            return true;
        }
        if (i9Var.f11839d0) {
            float f13 = i9Var.f11845f0;
            if (f13 > i9Var.f11882x.f11929c && f11 > 0.0f) {
                i9Var.f11845f0 = (0.05f * f11) + f13;
            } else {
                i9Var.f11845f0 = f13 + f11;
            }
            w8 w8Var = i9Var.f11870s;
            xb xbVar2 = xb.f41635w;
            if (xbVar2 != null && xbVar2.h == w8Var) {
                xbVar2.b();
            }
            if (i9Var.f11861o0.getCurrentPeerView() != null) {
                i9Var.f11861o0.getCurrentPeerView().invalidate();
            }
            i9Var.f11879w.invalidate();
            if (i9Var.f11845f0 < 0.0f) {
                i9Var.f11845f0 = 0.0f;
                i9Var.f11839d0 = false;
            }
            return true;
        }
        if (i9Var.W > 0.8f) {
            float f14 = -f11;
            if ((f14 > 0.0f && i9Var.X > 0.0f) || (f14 < 0.0f && i9Var.X < 0.0f)) {
                f12 = 0.3f;
                i9Var.X -= f11 * f12;
                w8 w8Var2 = i9Var.f11870s;
                xbVar = xb.f41635w;
                if (xbVar != null && xbVar.h == w8Var2) {
                    xbVar.b();
                }
                i9.i(i9Var);
                return true;
            }
        }
        f12 = 0.6f;
        i9Var.X -= f11 * f12;
        w8 w8Var22 = i9Var.f11870s;
        xbVar = xb.f41635w;
        if (xbVar != null) {
            xbVar.b();
        }
        i9.i(i9Var);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        b4 currentPeerView;
        boolean z10;
        i9 i9Var = this.f12345a;
        if (i9Var.f11845f0 == 0.0f && i9Var.f11847g0) {
            if (!i9Var.f11884y && !i9Var.L0 && !i9Var.f11858m1 && !i9Var.f11852i1 && !i9Var.f11854j1) {
                b4 z11 = i9Var.z();
                if (z11 == null || !z11.f11543y1.f12583f) {
                    if (motionEvent.getX() > i9Var.f11879w.getMeasuredWidth() * 0.33f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    b4 currentPeerView2 = i9Var.f11861o0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.b1(z10)) {
                        if (!i9Var.f11861o0.E(z10)) {
                            if (z10) {
                                i9Var.u(true);
                                return false;
                            }
                            h9 h9Var = i9Var.A0;
                            if (h9Var != null) {
                                h9Var.loopBack();
                                return false;
                            }
                        } else {
                            y8 y8Var = i9Var.f11861o0;
                            y8Var.M0 = true;
                            y8Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            sa saVar = y8Var.N0;
                            org.telegram.messenger.g0.r(saVar);
                            org.telegram.messenger.g0.i3(saVar, 150L);
                            return false;
                        }
                    }
                }
            } else {
                y8 y8Var2 = i9Var.f11861o0;
                if (y8Var2 != null && (currentPeerView = y8Var2.getCurrentPeerView()) != null) {
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
