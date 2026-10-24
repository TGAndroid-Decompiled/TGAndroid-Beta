package ci;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.oc;
public final class j9 implements GestureDetector.OnGestureListener {
    public final z9 f5481a;

    public j9(z9 z9Var) {
        this.f5481a = z9Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        z9 z9Var = this.f5481a;
        z9Var.f6237g1 = false;
        if (z9.i(z9Var, z9Var.f6260s, motionEvent.getX(), motionEvent.getY(), false)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10;
        z9 z9Var = this.f5481a;
        if (z9Var.Z != 0.0f && z9Var.f6266u1 == null && f10 < -1000.0f && !z9Var.f6221a0) {
            z9Var.f6221a0 = true;
            try {
                z9Var.f6260s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z9.j(z9Var);
        }
        if (z9Var.f6231e0 != 0.0f) {
            if (f10 < -1000.0f) {
                z9Var.n(true);
            } else if (f10 > 1000.0f) {
                z9Var.n(false);
            } else {
                if (z9Var.f6269w.f5181f > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z9Var.n(z10);
            }
        }
        z9Var.f6237g1 = true;
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float f11;
        oc ocVar;
        z9 z9Var = this.f5481a;
        if (!z9Var.f6242j0) {
            return false;
        }
        if (z9Var.f6246l0) {
            z9Var.Z += f10;
            float dp = AndroidUtilities.dp(200.0f);
            if (z9Var.Z > dp && !z9Var.f6221a0) {
                z9Var.f6221a0 = true;
                z9.j(z9Var);
                try {
                    z9Var.f6260s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            z9Var.f6229d0 = Utilities.clamp(z9Var.Z / dp, 1.0f, 0.0f);
            if (z9Var.f6249n0.getCurrentPeerView() != null) {
                z9Var.f6249n0.getCurrentPeerView().invalidate();
            }
            if (z9Var.Z < 0.0f) {
                z9Var.Z = 0.0f;
                z9Var.f6246l0 = false;
            }
            return true;
        }
        if (z9Var.f6227c0) {
            float f12 = z9Var.f6231e0;
            if (f12 > z9Var.f6269w.f5180c && f10 > 0.0f) {
                z9Var.f6231e0 = (0.05f * f10) + f12;
            } else {
                z9Var.f6231e0 = f12 + f10;
            }
            n9 n9Var = z9Var.f6260s;
            oc ocVar2 = oc.f29196w;
            if (ocVar2 != null && ocVar2.h == n9Var) {
                ocVar2.b();
            }
            if (z9Var.f6249n0.getCurrentPeerView() != null) {
                z9Var.f6249n0.getCurrentPeerView().invalidate();
            }
            z9Var.v.invalidate();
            if (z9Var.f6231e0 < 0.0f) {
                z9Var.f6231e0 = 0.0f;
                z9Var.f6227c0 = false;
            }
            return true;
        }
        if (z9Var.V > 0.8f) {
            float f13 = -f10;
            if ((f13 > 0.0f && z9Var.W > 0.0f) || (f13 < 0.0f && z9Var.W < 0.0f)) {
                f11 = 0.3f;
                z9Var.W -= f10 * f11;
                n9 n9Var2 = z9Var.f6260s;
                ocVar = oc.f29196w;
                if (ocVar != null && ocVar.h == n9Var2) {
                    ocVar.b();
                }
                z9.k(z9Var);
                return true;
            }
        }
        f11 = 0.6f;
        z9Var.W -= f10 * f11;
        n9 n9Var22 = z9Var.f6260s;
        ocVar = oc.f29196w;
        if (ocVar != null) {
            ocVar.b();
        }
        z9.k(z9Var);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        p4 currentPeerView;
        boolean z10;
        z9 z9Var = this.f5481a;
        if (z9Var.f6231e0 == 0.0f && z9Var.f6234f0) {
            if (!z9Var.f6272x && !z9Var.L0 && !z9Var.f6247m1 && !z9Var.f6241i1 && !z9Var.f6243j1) {
                p4 t10 = z9Var.t();
                if (t10 == null || !t10.O1.f5598f) {
                    if (motionEvent.getX() > z9Var.v.getMeasuredWidth() * 0.33f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    p4 currentPeerView2 = z9Var.f6249n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.c1(z10)) {
                        if (!z9Var.f6249n0.E(z10)) {
                            if (z10) {
                                z9Var.q(true);
                                return false;
                            }
                            y9 y9Var = z9Var.f6276z0;
                            if (y9Var != null) {
                                y9Var.loopBack();
                                return false;
                            }
                        } else {
                            p9 p9Var = z9Var.f6249n0;
                            p9Var.L0 = true;
                            p9Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            androidx.activity.i iVar = p9Var.M0;
                            AndroidUtilities.cancelRunOnUIThread(iVar);
                            AndroidUtilities.runOnUIThread(iVar, 150L);
                            return false;
                        }
                    }
                }
            } else {
                p9 p9Var2 = z9Var.f6249n0;
                if (p9Var2 != null && (currentPeerView = p9Var2.getCurrentPeerView()) != null) {
                    currentPeerView.r0();
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
