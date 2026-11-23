package fi;

import a8.sa;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gc;
public final class p8 implements GestureDetector.OnGestureListener {
    public final f9 f12403a;

    public p8(f9 f9Var) {
        this.f12403a = f9Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        f9 f9Var = this.f12403a;
        f9Var.f11965g1 = false;
        if (f9.c(f9Var, f9Var.f11987s, motionEvent.getX(), motionEvent.getY(), false)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z10;
        f9 f9Var = this.f12403a;
        if (f9Var.f11948a0 != 0.0f && f9Var.f11993u1 == null && f11 < -1000.0f && !f9Var.f11951b0) {
            f9Var.f11951b0 = true;
            try {
                f9Var.f11987s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            f9.g(f9Var);
        }
        if (f9Var.f11962f0 != 0.0f) {
            if (f11 < -1000.0f) {
                f9Var.o(true);
            } else if (f11 > 1000.0f) {
                f9Var.o(false);
            } else {
                if (f9Var.f11999x.f12097f > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f9Var.o(z10);
            }
        }
        f9Var.f11965g1 = true;
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float f12;
        gc gcVar;
        f9 f9Var = this.f12403a;
        if (!f9Var.f11972k0) {
            return false;
        }
        if (f9Var.m0) {
            f9Var.f11948a0 += f11;
            float L = org.telegram.messenger.g0.L(200.0f);
            if (f9Var.f11948a0 > L && !f9Var.f11951b0) {
                f9Var.f11951b0 = true;
                f9.g(f9Var);
                try {
                    f9Var.f11987s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            f9Var.f11959e0 = Utilities.i(f9Var.f11948a0 / L, 1.0f, 0.0f);
            if (f9Var.f11978o0.getCurrentPeerView() != null) {
                f9Var.f11978o0.getCurrentPeerView().invalidate();
            }
            if (f9Var.f11948a0 < 0.0f) {
                f9Var.f11948a0 = 0.0f;
                f9Var.m0 = false;
            }
            return true;
        }
        if (f9Var.f11956d0) {
            float f13 = f9Var.f11962f0;
            if (f13 > f9Var.f11999x.f12095c && f11 > 0.0f) {
                f9Var.f11962f0 = (0.05f * f11) + f13;
            } else {
                f9Var.f11962f0 = f13 + f11;
            }
            t8 t8Var = f9Var.f11987s;
            gc gcVar2 = gc.f35481w;
            if (gcVar2 != null && gcVar2.h == t8Var) {
                gcVar2.b();
            }
            if (f9Var.f11978o0.getCurrentPeerView() != null) {
                f9Var.f11978o0.getCurrentPeerView().invalidate();
            }
            f9Var.f11996w.invalidate();
            if (f9Var.f11962f0 < 0.0f) {
                f9Var.f11962f0 = 0.0f;
                f9Var.f11956d0 = false;
            }
            return true;
        }
        if (f9Var.W > 0.8f) {
            float f14 = -f11;
            if ((f14 > 0.0f && f9Var.X > 0.0f) || (f14 < 0.0f && f9Var.X < 0.0f)) {
                f12 = 0.3f;
                f9Var.X -= f11 * f12;
                t8 t8Var2 = f9Var.f11987s;
                gcVar = gc.f35481w;
                if (gcVar != null && gcVar.h == t8Var2) {
                    gcVar.b();
                }
                f9.i(f9Var);
                return true;
            }
        }
        f12 = 0.6f;
        f9Var.X -= f11 * f12;
        t8 t8Var22 = f9Var.f11987s;
        gcVar = gc.f35481w;
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
        f9 f9Var = this.f12403a;
        if (f9Var.f11962f0 == 0.0f && f9Var.f11964g0) {
            if (!f9Var.f12001y && !f9Var.L0 && !f9Var.f11975m1 && !f9Var.f11969i1 && !f9Var.f11971j1) {
                z3 z11 = f9Var.z();
                if (z11 == null || !z11.f12888y1.f12719f) {
                    if (motionEvent.getX() > f9Var.f11996w.getMeasuredWidth() * 0.33f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z3 currentPeerView2 = f9Var.f11978o0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.b1(z10)) {
                        if (!f9Var.f11978o0.E(z10)) {
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
                            v8 v8Var = f9Var.f11978o0;
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
                v8 v8Var2 = f9Var.f11978o0;
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
