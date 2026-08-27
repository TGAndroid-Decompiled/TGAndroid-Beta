package jh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ec;

public final class s8 implements GestureDetector.OnGestureListener {

    public final i9 f13981a;

    public s8(i9 i9Var) {
        this.f13981a = i9Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        i9 i9Var = this.f13981a;
        i9Var.f13472c1 = false;
        return !i9.i(i9Var, i9Var.f13505s, motionEvent.getX(), motionEvent.getY(), false);
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i9 i9Var = this.f13981a;
        if (i9Var.V != 0.0f && i9Var.f13501q1 == null && f11 < -1000.0f && !i9Var.W) {
            i9Var.W = true;
            try {
                i9Var.f13505s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            i9.j(i9Var);
        }
        if (i9Var.f13465a0 != 0.0f) {
            if (f11 < -1000.0f) {
                i9Var.n(true);
            } else if (f11 > 1000.0f) {
                i9Var.n(false);
            } else {
                i9Var.n(i9Var.f13511w.f13581f > 0.5f);
            }
        }
        i9Var.f13472c1 = true;
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float f12;
        ec ecVar;
        float f13;
        float f14;
        ec ecVar2;
        i9 i9Var = this.f13981a;
        if (!i9Var.f13479f0) {
            return false;
        }
        if (!i9Var.f13483h0) {
            if (i9Var.Y) {
                f14 = i9Var.f13465a0;
                if (f14 > i9Var.f13511w.f13579c) {
                    i9Var.f13465a0 = f14 + f11;
                } else {
                    i9Var.f13465a0 = f14 + f11;
                }
                w8 w8Var = i9Var.f13505s;
                ecVar2 = ec.f28012w;
                if (ecVar2 != null) {
                    ecVar2.b();
                }
                if (i9Var.f13487j0.getCurrentPeerView() != null) {
                    i9Var.f13487j0.getCurrentPeerView().invalidate();
                }
                i9Var.v.invalidate();
                if (i9Var.f13465a0 < 0.0f) {
                    i9Var.f13465a0 = 0.0f;
                    i9Var.Y = false;
                }
            }
            if (i9Var.R > 0.8f) {
                f13 = -f11;
                if (f13 > 0.0f) {
                    f12 = 0.6f;
                } else {
                    f12 = 0.6f;
                }
            } else {
                f12 = 0.6f;
            }
            i9Var.S -= f11 * f12;
            w8 w8Var2 = i9Var.f13505s;
            ecVar = ec.f28012w;
            if (ecVar != null) {
                ecVar.b();
            }
            i9.k(i9Var);
            return true;
        }
        i9Var.V += f11;
        float fDp = AndroidUtilities.dp(200.0f);
        if (i9Var.V > fDp && !i9Var.W) {
            i9Var.W = true;
            i9.j(i9Var);
            try {
                i9Var.f13505s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
        i9Var.Z = Utilities.clamp(i9Var.V / fDp, 1.0f, 0.0f);
        if (i9Var.f13487j0.getCurrentPeerView() != null) {
            i9Var.f13487j0.getCurrentPeerView().invalidate();
        }
        if (i9Var.V < 0.0f) {
            i9Var.V = 0.0f;
            i9Var.f13483h0 = false;
            if (i9Var.Y) {
                f14 = i9Var.f13465a0;
                if (f14 > i9Var.f13511w.f13579c || f11 <= 0.0f) {
                    i9Var.f13465a0 = f14 + f11;
                } else {
                    i9Var.f13465a0 = (0.05f * f11) + f14;
                }
                w8 w8Var3 = i9Var.f13505s;
                ecVar2 = ec.f28012w;
                if (ecVar2 != null && ecVar2.h == w8Var3) {
                    ecVar2.b();
                }
                if (i9Var.f13487j0.getCurrentPeerView() != null) {
                    i9Var.f13487j0.getCurrentPeerView().invalidate();
                }
                i9Var.v.invalidate();
                if (i9Var.f13465a0 < 0.0f) {
                    i9Var.f13465a0 = 0.0f;
                    i9Var.Y = false;
                }
            }
            if (i9Var.R > 0.8f) {
                f13 = -f11;
                if ((f13 > 0.0f || i9Var.S <= 0.0f) && (f13 >= 0.0f || i9Var.S >= 0.0f)) {
                    f12 = 0.6f;
                } else {
                    f12 = 0.3f;
                }
            } else {
                f12 = 0.6f;
            }
            i9Var.S -= f11 * f12;
            w8 w8Var4 = i9Var.f13505s;
            ecVar = ec.f28012w;
            if (ecVar != null && ecVar.h == w8Var4) {
                ecVar.b();
            }
            i9.k(i9Var);
            return true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        e4 currentPeerView;
        i9 i9Var = this.f13981a;
        if (i9Var.f13465a0 == 0.0f && i9Var.f13468b0) {
            if (i9Var.f13513x || i9Var.H0 || i9Var.f13486i1 || i9Var.f13477e1 || i9Var.f13480f1) {
                y8 y8Var = i9Var.f13487j0;
                if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null) {
                    currentPeerView.s0();
                }
            } else {
                e4 e4VarT = i9Var.t();
                if (e4VarT == null || !e4VarT.K1.f13145f) {
                    boolean z10 = motionEvent.getX() > ((float) i9Var.v.getMeasuredWidth()) * 0.33f;
                    e4 currentPeerView2 = i9Var.f13487j0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.d1(z10)) {
                        if (i9Var.f13487j0.E(z10)) {
                            y8 y8Var2 = i9Var.f13487j0;
                            y8Var2.H0 = true;
                            y8Var2.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            a8.b bVar = y8Var2.I0;
                            AndroidUtilities.cancelRunOnUIThread(bVar);
                            AndroidUtilities.runOnUIThread(bVar, 150L);
                            return false;
                        }
                        if (z10) {
                            i9Var.q(true);
                            return false;
                        }
                        h9 h9Var = i9Var.f13510v0;
                        if (h9Var != null) {
                            h9Var.loopBack();
                            return false;
                        }
                    }
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
