package lh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.mc;
public final class s8 implements GestureDetector.OnGestureListener {
    public final i9 f16246a;

    public s8(i9 i9Var) {
        this.f16246a = i9Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        i9 i9Var = this.f16246a;
        i9Var.f15750c1 = false;
        if (i9.i(i9Var, i9Var.f15783s, motionEvent.getX(), motionEvent.getY(), false)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        boolean z10;
        i9 i9Var = this.f16246a;
        if (i9Var.V != 0.0f && i9Var.f15779q1 == null && f10 < -1000.0f && !i9Var.W) {
            i9Var.W = true;
            try {
                i9Var.f15783s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            i9.j(i9Var);
        }
        if (i9Var.f15743a0 != 0.0f) {
            if (f10 < -1000.0f) {
                i9Var.n(true);
            } else if (f10 > 1000.0f) {
                i9Var.n(false);
            } else {
                if (i9Var.f15789w.f15886f > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i9Var.n(z10);
            }
        }
        i9Var.f15750c1 = true;
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        float f11;
        mc mcVar;
        i9 i9Var = this.f16246a;
        if (!i9Var.f15757f0) {
            return false;
        }
        if (i9Var.f15761h0) {
            i9Var.V += f10;
            float dp = AndroidUtilities.dp(200.0f);
            if (i9Var.V > dp && !i9Var.W) {
                i9Var.W = true;
                i9.j(i9Var);
                try {
                    i9Var.f15783s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            i9Var.Z = Utilities.clamp(i9Var.V / dp, 1.0f, 0.0f);
            if (i9Var.f15765j0.getCurrentPeerView() != null) {
                i9Var.f15765j0.getCurrentPeerView().invalidate();
            }
            if (i9Var.V < 0.0f) {
                i9Var.V = 0.0f;
                i9Var.f15761h0 = false;
            }
            return true;
        }
        if (i9Var.Y) {
            float f12 = i9Var.f15743a0;
            if (f12 > i9Var.f15789w.f15884c && f10 > 0.0f) {
                i9Var.f15743a0 = (0.05f * f10) + f12;
            } else {
                i9Var.f15743a0 = f12 + f10;
            }
            w8 w8Var = i9Var.f15783s;
            mc mcVar2 = mc.f30644w;
            if (mcVar2 != null && mcVar2.h == w8Var) {
                mcVar2.b();
            }
            if (i9Var.f15765j0.getCurrentPeerView() != null) {
                i9Var.f15765j0.getCurrentPeerView().invalidate();
            }
            i9Var.v.invalidate();
            if (i9Var.f15743a0 < 0.0f) {
                i9Var.f15743a0 = 0.0f;
                i9Var.Y = false;
            }
            return true;
        }
        if (i9Var.R > 0.8f) {
            float f13 = -f10;
            if ((f13 > 0.0f && i9Var.S > 0.0f) || (f13 < 0.0f && i9Var.S < 0.0f)) {
                f11 = 0.3f;
                i9Var.S -= f10 * f11;
                w8 w8Var2 = i9Var.f15783s;
                mcVar = mc.f30644w;
                if (mcVar != null && mcVar.h == w8Var2) {
                    mcVar.b();
                }
                i9.k(i9Var);
                return true;
            }
        }
        f11 = 0.6f;
        i9Var.S -= f10 * f11;
        w8 w8Var22 = i9Var.f15783s;
        mcVar = mc.f30644w;
        if (mcVar != null) {
            mcVar.b();
        }
        i9.k(i9Var);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        d4 currentPeerView;
        boolean z10;
        i9 i9Var = this.f16246a;
        if (i9Var.f15743a0 == 0.0f && i9Var.f15746b0) {
            if (!i9Var.f15791x && !i9Var.H0 && !i9Var.f15764i1 && !i9Var.f15755e1 && !i9Var.f15758f1) {
                d4 t10 = i9Var.t();
                if (t10 == null || !t10.K1.f15378f) {
                    if (motionEvent.getX() > i9Var.v.getMeasuredWidth() * 0.33f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    d4 currentPeerView2 = i9Var.f15765j0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.d1(z10)) {
                        if (!i9Var.f15765j0.E(z10)) {
                            if (z10) {
                                i9Var.q(true);
                                return false;
                            }
                            h9 h9Var = i9Var.f15788v0;
                            if (h9Var != null) {
                                h9Var.loopBack();
                                return false;
                            }
                        } else {
                            y8 y8Var = i9Var.f15765j0;
                            y8Var.H0 = true;
                            y8Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            m7 m7Var = y8Var.I0;
                            AndroidUtilities.cancelRunOnUIThread(m7Var);
                            AndroidUtilities.runOnUIThread(m7Var, 150L);
                            return false;
                        }
                    }
                }
            } else {
                y8 y8Var2 = i9Var.f15765j0;
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
