package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
public final class vbb implements GestureDetector.OnGestureListener {
    public final lcb a;

    public vbb(lcb lcbVar) {
        this.a = lcbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        lcb lcbVar = this.a;
        lcbVar.g1 = false;
        if (lcbVar.v(lcbVar.s, motionEvent.getX(), motionEvent.getY(), false)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        lcb lcbVar = this.a;
        if (lcbVar.a0 != 0.0f && lcbVar.u1 == null && f2 < -1000.0f && !lcbVar.b0) {
            lcbVar.b0 = true;
            try {
                lcbVar.s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            lcbVar.R();
        }
        if (lcbVar.f0 != 0.0f) {
            if (f2 < -1000.0f) {
                lcbVar.k(true);
            } else if (f2 > 1000.0f) {
                lcbVar.k(false);
            } else {
                if (lcbVar.x.f > 0.5f) {
                    z = true;
                } else {
                    z = false;
                }
                lcbVar.k(z);
            }
        }
        lcbVar.g1 = true;
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        v21 v21Var;
        lcb lcbVar = this.a;
        if (!lcbVar.k0) {
            return false;
        }
        if (lcbVar.m0) {
            lcbVar.a0 += f2;
            float L = hl.L(200.0f);
            if (lcbVar.a0 > L && !lcbVar.b0) {
                lcbVar.b0 = true;
                lcbVar.R();
                try {
                    lcbVar.s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            lcbVar.e0 = Utilities.i(lcbVar.a0 / L, 1.0f, 0.0f);
            if (lcbVar.o0.getCurrentPeerView() != null) {
                lcbVar.o0.getCurrentPeerView().invalidate();
            }
            if (lcbVar.a0 < 0.0f) {
                lcbVar.a0 = 0.0f;
                lcbVar.m0 = false;
            }
            return true;
        }
        if (lcbVar.d0) {
            float f4 = lcbVar.f0;
            if (f4 > lcbVar.x.c && f2 > 0.0f) {
                lcbVar.f0 = (0.05f * f2) + f4;
            } else {
                lcbVar.f0 = f4 + f2;
            }
            zbb zbbVar = lcbVar.s;
            v21 v21Var2 = v21.x;
            if (v21Var2 != null && v21Var2.h == zbbVar) {
                v21Var2.b();
            }
            if (lcbVar.o0.getCurrentPeerView() != null) {
                lcbVar.o0.getCurrentPeerView().invalidate();
            }
            lcbVar.w.invalidate();
            if (lcbVar.f0 < 0.0f) {
                lcbVar.f0 = 0.0f;
                lcbVar.d0 = false;
            }
            return true;
        }
        if (lcbVar.W > 0.8f) {
            float f5 = -f2;
            if ((f5 > 0.0f && lcbVar.X > 0.0f) || (f5 < 0.0f && lcbVar.X < 0.0f)) {
                f3 = 0.3f;
                lcbVar.X -= f2 * f3;
                zbb zbbVar2 = lcbVar.s;
                v21Var = v21.x;
                if (v21Var != null && v21Var.h == zbbVar2) {
                    v21Var.b();
                }
                lcbVar.V();
                return true;
            }
        }
        f3 = 0.6f;
        lcbVar.X -= f2 * f3;
        zbb zbbVar22 = lcbVar.s;
        v21Var = v21.x;
        if (v21Var != null) {
            v21Var.b();
        }
        lcbVar.V();
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        o68 currentPeerView;
        boolean z;
        lcb lcbVar = this.a;
        if (lcbVar.f0 == 0.0f && lcbVar.g0) {
            if (!lcbVar.y && !lcbVar.L0 && !lcbVar.m1 && !lcbVar.i1 && !lcbVar.j1) {
                o68 w = lcbVar.w();
                if (w == null || !w.y1.f) {
                    if (motionEvent.getX() > lcbVar.w.getMeasuredWidth() * 0.33f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    o68 currentPeerView2 = lcbVar.o0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.Z0(z)) {
                        if (!lcbVar.o0.E(z)) {
                            if (z) {
                                lcbVar.o(true);
                                return false;
                            }
                            kcb kcbVar = lcbVar.A0;
                            if (kcbVar != null) {
                                kcbVar.loopBack();
                                return false;
                            }
                        } else {
                            bcb bcbVar = lcbVar.o0;
                            bcbVar.M0 = true;
                            bcbVar.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            bva bvaVar = bcbVar.N0;
                            hl.r(bvaVar);
                            hl.d3(bvaVar, 150L);
                            return false;
                        }
                    }
                }
            } else {
                bcb bcbVar2 = lcbVar.o0;
                if (bcbVar2 != null && (currentPeerView = bcbVar2.getCurrentPeerView()) != null) {
                    currentPeerView.i0();
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
