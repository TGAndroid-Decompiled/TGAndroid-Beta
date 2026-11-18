package fi;

import android.view.KeyEvent;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.ui.Components.ia;
import org.telegram.ui.ws0;
public final class l7 implements c5.h {
    public final int f12225a;
    public final Object f12226b;
    public final KeyEvent.Callback f12227c;

    public l7(KeyEvent.Callback callback, Object obj, int i7) {
        this.f12225a = i7;
        this.f12227c = callback;
        this.f12226b = obj;
    }

    @Override
    public final void a(int i7) {
        int i10 = this.f12225a;
        KeyEvent.Callback callback = this.f12227c;
        switch (i10) {
            case 0:
                f9 f9Var = (f9) this.f12226b;
                w wVar = (w) callback;
                z3 currentPeerView = wVar.getCurrentPeerView();
                if (currentPeerView != null) {
                    s3 s3Var = wVar.C0;
                    w8 w8Var = (w8) s3Var;
                    w8Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
                    wVar.F();
                    b9 b9Var = f9Var.f12000u0;
                    if (b9Var != null) {
                        if (i7 < 3) {
                            b9Var.b(false);
                            return;
                        } else if (i7 > wVar.A0.b() - 4) {
                            f9Var.f12000u0.b(true);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                ug.z0 z0Var = (ug.z0) callback;
                ArrayList arrayList = z0Var.f58958o1;
                if (((ws0) arrayList.get(i7)).f53518a == 0) {
                    z0Var.I1.setTitle(gd.M0(2131751338, null));
                    z0Var.I1.requestLayout();
                } else if (((ws0) arrayList.get(i7)).f53518a == 14) {
                    z0Var.I1.setTitle(gd.M0(2131743568, null));
                    z0Var.I1.requestLayout();
                } else if (((ws0) arrayList.get(i7)).f53518a == 40) {
                    z0Var.I1.setTitle(gd.M0(2131750826, null));
                    z0Var.I1.requestLayout();
                } else if (((ws0) arrayList.get(i7)).f53518a == 28) {
                    z0Var.I1.setTitle(gd.M0(2131744017, null));
                    z0Var.I1.requestLayout();
                }
                d();
                return;
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        int i11;
        int i12;
        switch (this.f12225a) {
            case 0:
                w wVar = (w) this.f12227c;
                wVar.J0 = i7;
                if (i10 > 0) {
                    i11 = i7 + 1;
                } else {
                    i11 = i7 - 1;
                }
                wVar.K0 = i11;
                wVar.L0 = f10;
                long j3 = j10.i(wVar.f12310z0).f24792n;
                int i13 = wVar.J0;
                if (i13 >= 0 && (wVar.f12309y0 != null ? wVar.f12308x0 == j3 : !(i13 >= wVar.B0.size() || ((Long) wVar.B0.get(wVar.J0)).longValue() != j3))) {
                    ((w8) wVar.C0).d(1.0f - wVar.L0);
                    return;
                }
                int i14 = wVar.K0;
                if (i14 >= 0 && (wVar.f12309y0 != null ? wVar.f12308x0 == j3 : !(i14 >= wVar.B0.size() || ((Long) wVar.B0.get(wVar.K0)).longValue() != j3))) {
                    ((w8) wVar.C0).d(wVar.L0);
                    return;
                }
                ((w8) wVar.C0).d(0.0f);
                return;
            default:
                ia iaVar = (ia) this.f12226b;
                iaVar.f36087b = f10;
                iaVar.f36088c = i7;
                iaVar.invalidate();
                ug.z0 z0Var = (ug.z0) this.f12227c;
                z0Var.B1 = i7;
                if (i10 > 0) {
                    i12 = i7 + 1;
                } else {
                    i12 = i7 - 1;
                }
                z0Var.C1 = i12;
                z0Var.D1 = f10;
                d();
                return;
        }
    }

    @Override
    public final void c(int i7) {
        switch (this.f12225a) {
            case 0:
                w wVar = (w) this.f12227c;
                ((w8) wVar.C0).d.V();
                Runnable runnable = wVar.H0;
                if (runnable != null && i7 == 0) {
                    runnable.run();
                    wVar.H0 = null;
                }
                wVar.G0 = i7;
                f9 f9Var = ((v8) wVar).S0;
                if (f9Var.f11986o0.G0 == 1) {
                    org.telegram.messenger.g0.r(f9Var.f11960b1);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void d() {
        boolean z10;
        boolean z11;
        int i7;
        int i10;
        ug.z0 z0Var = (ug.z0) this.f12227c;
        ug.x0 x0Var = z0Var.f58962s1;
        ArrayList arrayList = z0Var.f58958o1;
        int i11 = 0;
        while (true) {
            float f10 = 0.0f;
            if (i11 >= x0Var.getChildCount()) {
                break;
            }
            ug.y0 y0Var = (ug.y0) x0Var.getChildAt(i11);
            if (!z0Var.f58966w1 || !(y0Var.f58953f instanceof ug.q0)) {
                int i12 = y0Var.f58949a;
                ug.o0 o0Var = y0Var.f58952e;
                if (i12 == z0Var.B1) {
                    f10 = (-y0Var.getMeasuredWidth()) * z0Var.D1;
                    o0Var.setOffset(f10);
                } else if (i12 == z0Var.C1) {
                    f10 = ((-y0Var.getMeasuredWidth()) * z0Var.D1) + y0Var.getMeasuredWidth();
                    o0Var.setOffset(f10);
                } else {
                    o0Var.setOffset(y0Var.getMeasuredWidth());
                }
            }
            if (y0Var.f58953f instanceof ug.q0) {
                y0Var.setTranslationX(-f10);
                y0Var.f58950b.setTranslationX(f10);
                y0Var.f58951c.setTranslationX(f10);
            }
            i11++;
        }
        int i13 = z0Var.B1;
        if (i13 >= 0 && i13 < arrayList.size() && ((i10 = ((ws0) arrayList.get(z0Var.B1)).f53518a) == 0 || i10 == 14 || i10 == 28)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i14 = z0Var.C1;
        if (i14 >= 0 && i14 < arrayList.size() && ((i7 = ((ws0) arrayList.get(z0Var.C1)).f53518a) == 0 || i7 == 14 || i7 == 28)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            z0Var.f58960q1 = 1.0f;
            float f11 = z0Var.D1;
            if (f11 == 0.0f) {
                f11 = 1.0f;
            }
            z0Var.f58959p1 = f11;
            z0Var.f58961r1 = true;
        } else if (z10) {
            float f12 = 1.0f - z0Var.D1;
            z0Var.f58959p1 = f12;
            z0Var.f58960q1 = f12;
            z0Var.f58961r1 = true;
        } else if (z11) {
            float f13 = z0Var.D1;
            z0Var.f58959p1 = f13;
            z0Var.f58960q1 = f13;
            z0Var.f58961r1 = false;
        } else {
            z0Var.f58959p1 = 0.0f;
            z0Var.f58960q1 = 0.0f;
            z0Var.f58961r1 = true;
        }
        int i15 = (int) ((1.0f - z0Var.f58959p1) * 255.0f);
        if (i15 != z0Var.F1) {
            z0Var.F1 = i15;
            z0Var.f58963t1.invalidate();
            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(this, 26));
        }
    }

    private final void e(int i7) {
    }
}
