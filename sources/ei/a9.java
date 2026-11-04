package ei;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ac;
public final class a9 implements GestureDetector.OnGestureListener {
    public final r9 f10099a;

    public a9(r9 r9Var) {
        this.f10099a = r9Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        r9 r9Var = this.f10099a;
        r9Var.f10928h1 = false;
        if (r9.u(r9Var, r9Var.f10948s, motionEvent.getX(), motionEvent.getY(), false)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z10;
        r9 r9Var = this.f10099a;
        if (r9Var.f10909a0 != 0.0f && r9Var.f10956v1 == null && f11 < -1000.0f && !r9Var.f10912b0) {
            r9Var.f10912b0 = true;
            try {
                r9Var.f10948s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            r9.v(r9Var);
        }
        if (r9Var.f10923f0 != 0.0f) {
            if (f11 < -1000.0f) {
                r9Var.A(true);
            } else if (f11 > 1000.0f) {
                r9Var.A(false);
            } else {
                if (r9Var.f10960x.f11001f > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r9Var.A(z10);
            }
        }
        r9Var.f10928h1 = true;
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float f12;
        ac acVar;
        r9 r9Var = this.f10099a;
        if (!r9Var.f10933k0) {
            return false;
        }
        if (r9Var.m0) {
            r9Var.f10909a0 += f11;
            float L = org.telegram.messenger.g0.L(200.0f);
            if (r9Var.f10909a0 > L && !r9Var.f10912b0) {
                r9Var.f10912b0 = true;
                r9.v(r9Var);
                try {
                    r9Var.f10948s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            r9Var.f10920e0 = Utilities.i(r9Var.f10909a0 / L, 1.0f, 0.0f);
            if (r9Var.f10939o0.getCurrentPeerView() != null) {
                r9Var.f10939o0.getCurrentPeerView().invalidate();
            }
            if (r9Var.f10909a0 < 0.0f) {
                r9Var.f10909a0 = 0.0f;
                r9Var.m0 = false;
            }
            return true;
        }
        if (r9Var.f10917d0) {
            float f13 = r9Var.f10923f0;
            if (f13 > r9Var.f10960x.f10999c && f11 > 0.0f) {
                r9Var.f10923f0 = (0.05f * f11) + f13;
            } else {
                r9Var.f10923f0 = f13 + f11;
            }
            e9 e9Var = r9Var.f10948s;
            ac acVar2 = ac.f31784w;
            if (acVar2 != null && acVar2.h == e9Var) {
                acVar2.b();
            }
            if (r9Var.f10939o0.getCurrentPeerView() != null) {
                r9Var.f10939o0.getCurrentPeerView().invalidate();
            }
            r9Var.f10957w.invalidate();
            if (r9Var.f10923f0 < 0.0f) {
                r9Var.f10923f0 = 0.0f;
                r9Var.f10917d0 = false;
            }
            return true;
        }
        if (r9Var.W > 0.8f) {
            float f14 = -f11;
            if ((f14 > 0.0f && r9Var.X > 0.0f) || (f14 < 0.0f && r9Var.X < 0.0f)) {
                f12 = 0.3f;
                r9Var.X -= f11 * f12;
                e9 e9Var2 = r9Var.f10948s;
                acVar = ac.f31784w;
                if (acVar != null && acVar.h == e9Var2) {
                    acVar.b();
                }
                r9.w(r9Var);
                return true;
            }
        }
        f12 = 0.6f;
        r9Var.X -= f11 * f12;
        e9 e9Var22 = r9Var.f10948s;
        acVar = ac.f31784w;
        if (acVar != null) {
            acVar.b();
        }
        r9.w(r9Var);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        j4 currentPeerView;
        boolean z10;
        r9 r9Var = this.f10099a;
        if (r9Var.f10923f0 == 0.0f && r9Var.f10925g0) {
            if (!r9Var.f10963y && !r9Var.M0 && !r9Var.f10938n1 && !r9Var.f10932j1 && !r9Var.k1) {
                j4 H = r9Var.H();
                if (H == null || !H.f10527y1.f10362f) {
                    if (motionEvent.getX() > r9Var.f10957w.getMeasuredWidth() * 0.33f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    j4 currentPeerView2 = r9Var.f10939o0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.b1(z10)) {
                        if (!r9Var.f10939o0.E(z10)) {
                            if (z10) {
                                r9Var.D(true);
                                return false;
                            }
                            q9 q9Var = r9Var.A0;
                            if (q9Var != null) {
                                q9Var.loopBack();
                                return false;
                            }
                        } else {
                            g9 g9Var = r9Var.f10939o0;
                            g9Var.M0 = true;
                            g9Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            a3.o oVar = g9Var.N0;
                            org.telegram.messenger.g0.r(oVar);
                            org.telegram.messenger.g0.i3(oVar, 150L);
                            return false;
                        }
                    }
                }
            } else {
                g9 g9Var2 = r9Var.f10939o0;
                if (g9Var2 != null && (currentPeerView = g9Var2.getCurrentPeerView()) != null) {
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
