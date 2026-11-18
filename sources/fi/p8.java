package fi;

import a8.sa;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gc;
public final class p8 implements GestureDetector.OnGestureListener {
    public final f9 f12408a;

    public p8(f9 f9Var) {
        this.f12408a = f9Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        f9 f9Var = this.f12408a;
        f9Var.f11970g1 = false;
        if (f9.c(f9Var, f9Var.f11992s, motionEvent.getX(), motionEvent.getY(), false)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z10;
        f9 f9Var = this.f12408a;
        if (f9Var.f11953a0 != 0.0f && f9Var.f11998u1 == null && f11 < -1000.0f && !f9Var.f11956b0) {
            f9Var.f11956b0 = true;
            try {
                f9Var.f11992s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            f9.g(f9Var);
        }
        if (f9Var.f11967f0 != 0.0f) {
            if (f11 < -1000.0f) {
                f9Var.o(true);
            } else if (f11 > 1000.0f) {
                f9Var.o(false);
            } else {
                if (f9Var.f12004x.f12102f > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f9Var.o(z10);
            }
        }
        f9Var.f11970g1 = true;
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float f12;
        gc gcVar;
        f9 f9Var = this.f12408a;
        if (!f9Var.f11977k0) {
            return false;
        }
        if (f9Var.m0) {
            f9Var.f11953a0 += f11;
            float L = org.telegram.messenger.g0.L(200.0f);
            if (f9Var.f11953a0 > L && !f9Var.f11956b0) {
                f9Var.f11956b0 = true;
                f9.g(f9Var);
                try {
                    f9Var.f11992s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            f9Var.f11964e0 = Utilities.i(f9Var.f11953a0 / L, 1.0f, 0.0f);
            if (f9Var.f11983o0.getCurrentPeerView() != null) {
                f9Var.f11983o0.getCurrentPeerView().invalidate();
            }
            if (f9Var.f11953a0 < 0.0f) {
                f9Var.f11953a0 = 0.0f;
                f9Var.m0 = false;
            }
            return true;
        }
        if (f9Var.f11961d0) {
            float f13 = f9Var.f11967f0;
            if (f13 > f9Var.f12004x.f12100c && f11 > 0.0f) {
                f9Var.f11967f0 = (0.05f * f11) + f13;
            } else {
                f9Var.f11967f0 = f13 + f11;
            }
            t8 t8Var = f9Var.f11992s;
            gc gcVar2 = gc.f35453w;
            if (gcVar2 != null && gcVar2.h == t8Var) {
                gcVar2.b();
            }
            if (f9Var.f11983o0.getCurrentPeerView() != null) {
                f9Var.f11983o0.getCurrentPeerView().invalidate();
            }
            f9Var.f12001w.invalidate();
            if (f9Var.f11967f0 < 0.0f) {
                f9Var.f11967f0 = 0.0f;
                f9Var.f11961d0 = false;
            }
            return true;
        }
        if (f9Var.W > 0.8f) {
            float f14 = -f11;
            if ((f14 > 0.0f && f9Var.X > 0.0f) || (f14 < 0.0f && f9Var.X < 0.0f)) {
                f12 = 0.3f;
                f9Var.X -= f11 * f12;
                t8 t8Var2 = f9Var.f11992s;
                gcVar = gc.f35453w;
                if (gcVar != null && gcVar.h == t8Var2) {
                    gcVar.b();
                }
                f9.i(f9Var);
                return true;
            }
        }
        f12 = 0.6f;
        f9Var.X -= f11 * f12;
        t8 t8Var22 = f9Var.f11992s;
        gcVar = gc.f35453w;
        if (gcVar != null) {
            gcVar.b();
        }
        f9.i(f9Var);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        z3 currentPeerView;
        boolean z10;
        f9 f9Var = this.f12408a;
        if (f9Var.f11967f0 == 0.0f && f9Var.f11969g0) {
            if (!f9Var.f12006y && !f9Var.L0 && !f9Var.f11980m1 && !f9Var.f11974i1 && !f9Var.f11976j1) {
                z3 z11 = f9Var.z();
                if (z11 == null || !z11.f12893y1.f12724f) {
                    if (motionEvent.getX() > f9Var.f12001w.getMeasuredWidth() * 0.33f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z3 currentPeerView2 = f9Var.f11983o0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.b1(z10)) {
                        if (!f9Var.f11983o0.E(z10)) {
                            if (z10) {
                                f9Var.u(true);
                                return false;
                            }
                            e9 e9Var = f9Var.A0;
                            if (e9Var != null) {
                                e9Var.loopBack();
                                return false;
                            }
                        } else {
                            v8 v8Var = f9Var.f11983o0;
                            v8Var.M0 = true;
                            v8Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            sa saVar = v8Var.N0;
                            org.telegram.messenger.g0.r(saVar);
                            org.telegram.messenger.g0.h3(saVar, 150L);
                            return false;
                        }
                    }
                }
            } else {
                v8 v8Var2 = f9Var.f11983o0;
                if (v8Var2 != null && (currentPeerView = v8Var2.getCurrentPeerView()) != null) {
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
