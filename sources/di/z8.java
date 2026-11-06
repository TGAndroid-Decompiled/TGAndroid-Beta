package di;

import a8.ra;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.cc;
public final class z8 implements GestureDetector.OnGestureListener {
    public final p9 f10025a;

    public z8(p9 p9Var) {
        this.f10025a = p9Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        p9 p9Var = this.f10025a;
        p9Var.f9545f1 = false;
        if (p9.c(p9Var, p9Var.f9569s, motionEvent.getX(), motionEvent.getY(), false)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z9;
        p9 p9Var = this.f10025a;
        if (p9Var.Z != 0.0f && p9Var.f9573t1 == null && f11 < -1000.0f && !p9Var.f9530a0) {
            p9Var.f9530a0 = true;
            try {
                p9Var.f9569s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            p9.g(p9Var);
        }
        if (p9Var.f9541e0 != 0.0f) {
            if (f11 < -1000.0f) {
                p9Var.o(true);
            } else if (f11 > 1000.0f) {
                p9Var.o(false);
            } else {
                if (p9Var.f9580x.f9759f > 0.5f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                p9Var.o(z9);
            }
        }
        p9Var.f9545f1 = true;
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float f12;
        cc ccVar;
        p9 p9Var = this.f10025a;
        if (!p9Var.f9552j0) {
            return false;
        }
        if (p9Var.f9556l0) {
            p9Var.Z += f11;
            float L = org.telegram.messenger.g0.L(200.0f);
            if (p9Var.Z > L && !p9Var.f9530a0) {
                p9Var.f9530a0 = true;
                p9.g(p9Var);
                try {
                    p9Var.f9569s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            p9Var.f9538d0 = Utilities.i(p9Var.Z / L, 1.0f, 0.0f);
            if (p9Var.f9559n0.getCurrentPeerView() != null) {
                p9Var.f9559n0.getCurrentPeerView().invalidate();
            }
            if (p9Var.Z < 0.0f) {
                p9Var.Z = 0.0f;
                p9Var.f9556l0 = false;
            }
            return true;
        }
        if (p9Var.f9536c0) {
            float f13 = p9Var.f9541e0;
            if (f13 > p9Var.f9580x.f9757c && f11 > 0.0f) {
                p9Var.f9541e0 = (0.05f * f11) + f13;
            } else {
                p9Var.f9541e0 = f13 + f11;
            }
            d9 d9Var = p9Var.f9569s;
            cc ccVar2 = cc.f32515w;
            if (ccVar2 != null && ccVar2.h == d9Var) {
                ccVar2.b();
            }
            if (p9Var.f9559n0.getCurrentPeerView() != null) {
                p9Var.f9559n0.getCurrentPeerView().invalidate();
            }
            p9Var.f9578w.invalidate();
            if (p9Var.f9541e0 < 0.0f) {
                p9Var.f9541e0 = 0.0f;
                p9Var.f9536c0 = false;
            }
            return true;
        }
        if (p9Var.V > 0.8f) {
            float f14 = -f11;
            if ((f14 > 0.0f && p9Var.W > 0.0f) || (f14 < 0.0f && p9Var.W < 0.0f)) {
                f12 = 0.3f;
                p9Var.W -= f11 * f12;
                d9 d9Var2 = p9Var.f9569s;
                ccVar = cc.f32515w;
                if (ccVar != null && ccVar.h == d9Var2) {
                    ccVar.b();
                }
                p9.i(p9Var);
                return true;
            }
        }
        f12 = 0.6f;
        p9Var.W -= f11 * f12;
        d9 d9Var22 = p9Var.f9569s;
        ccVar = cc.f32515w;
        if (ccVar != null) {
            ccVar.b();
        }
        p9.i(p9Var);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i4 currentPeerView;
        boolean z9;
        p9 p9Var = this.f10025a;
        if (p9Var.f9541e0 == 0.0f && p9Var.f9544f0) {
            if (!p9Var.f9582y && !p9Var.K0 && !p9Var.l1 && !p9Var.f9549h1 && !p9Var.f9551i1) {
                i4 z10 = p9Var.z();
                if (z10 == null || !z10.f9213x1.f9042f) {
                    if (motionEvent.getX() > p9Var.f9578w.getMeasuredWidth() * 0.33f) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    i4 currentPeerView2 = p9Var.f9559n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.b1(z9)) {
                        if (!p9Var.f9559n0.E(z9)) {
                            if (z9) {
                                p9Var.u(true);
                                return false;
                            }
                            o9 o9Var = p9Var.f9584z0;
                            if (o9Var != null) {
                                o9Var.loopBack();
                                return false;
                            }
                        } else {
                            f9 f9Var = p9Var.f9559n0;
                            f9Var.L0 = true;
                            f9Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            ra raVar = f9Var.M0;
                            org.telegram.messenger.g0.r(raVar);
                            org.telegram.messenger.g0.i3(raVar, 150L);
                            return false;
                        }
                    }
                }
            } else {
                f9 f9Var2 = p9Var.f9559n0;
                if (f9Var2 != null && (currentPeerView = f9Var2.getCurrentPeerView()) != null) {
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
