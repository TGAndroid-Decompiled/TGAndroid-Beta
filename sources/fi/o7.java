package fi;

import android.view.KeyEvent;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.ui.Components.aa;
import org.telegram.ui.ss0;
public final class o7 implements c5.h {
    public final int f12125a;
    public final Object f12126b;
    public final KeyEvent.Callback f12127c;

    public o7(KeyEvent.Callback callback, Object obj, int i7) {
        this.f12125a = i7;
        this.f12127c = callback;
        this.f12126b = obj;
    }

    @Override
    public final void a(int i7) {
        int i10 = this.f12125a;
        KeyEvent.Callback callback = this.f12127c;
        switch (i10) {
            case 0:
                i9 i9Var = (i9) this.f12126b;
                w wVar = (w) callback;
                b4 currentPeerView = wVar.getCurrentPeerView();
                if (currentPeerView != null) {
                    u3 u3Var = wVar.C0;
                    z8 z8Var = (z8) u3Var;
                    z8Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
                    wVar.F();
                    e9 e9Var = i9Var.f11875u0;
                    if (e9Var != null) {
                        if (i7 < 3) {
                            e9Var.c(false);
                            return;
                        } else if (i7 > wVar.A0.b() - 4) {
                            i9Var.f11875u0.c(true);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                ug.x0 x0Var = (ug.x0) callback;
                ArrayList arrayList = x0Var.f58371o1;
                if (((ss0) arrayList.get(i7)).f51269a == 0) {
                    x0Var.I1.setTitle(hd.M0(2131751349, null));
                    x0Var.I1.requestLayout();
                } else if (((ss0) arrayList.get(i7)).f51269a == 14) {
                    x0Var.I1.setTitle(hd.M0(2131743805, null));
                    x0Var.I1.requestLayout();
                } else if (((ss0) arrayList.get(i7)).f51269a == 40) {
                    x0Var.I1.setTitle(hd.M0(2131750837, null));
                    x0Var.I1.requestLayout();
                } else if (((ss0) arrayList.get(i7)).f51269a == 28) {
                    x0Var.I1.setTitle(hd.M0(2131744252, null));
                    x0Var.I1.requestLayout();
                }
                d();
                return;
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        int i11;
        int i12;
        switch (this.f12125a) {
            case 0:
                w wVar = (w) this.f12127c;
                wVar.J0 = i7;
                if (i10 > 0) {
                    i11 = i7 + 1;
                } else {
                    i11 = i7 - 1;
                }
                wVar.K0 = i11;
                wVar.L0 = f10;
                long j3 = m10.i(wVar.f12234z0).f24959n;
                int i13 = wVar.J0;
                if (i13 >= 0 && (wVar.f12233y0 != null ? wVar.f12232x0 == j3 : !(i13 >= wVar.B0.size() || ((Long) wVar.B0.get(wVar.J0)).longValue() != j3))) {
                    ((z8) wVar.C0).d(1.0f - wVar.L0);
                    return;
                }
                int i14 = wVar.K0;
                if (i14 >= 0 && (wVar.f12233y0 != null ? wVar.f12232x0 == j3 : !(i14 >= wVar.B0.size() || ((Long) wVar.B0.get(wVar.K0)).longValue() != j3))) {
                    ((z8) wVar.C0).d(wVar.L0);
                    return;
                }
                ((z8) wVar.C0).d(0.0f);
                return;
            default:
                aa aaVar = (aa) this.f12126b;
                aaVar.f32937b = f10;
                aaVar.f32938c = i7;
                aaVar.invalidate();
                ug.x0 x0Var = (ug.x0) this.f12127c;
                x0Var.B1 = i7;
                if (i10 > 0) {
                    i12 = i7 + 1;
                } else {
                    i12 = i7 - 1;
                }
                x0Var.C1 = i12;
                x0Var.D1 = f10;
                d();
                return;
        }
    }

    @Override
    public final void c(int i7) {
        switch (this.f12125a) {
            case 0:
                w wVar = (w) this.f12127c;
                ((z8) wVar.C0).d.V();
                Runnable runnable = wVar.H0;
                if (runnable != null && i7 == 0) {
                    runnable.run();
                    wVar.H0 = null;
                }
                wVar.G0 = i7;
                i9 i9Var = ((y8) wVar).S0;
                if (i9Var.f11861o0.G0 == 1) {
                    org.telegram.messenger.g0.r(i9Var.f11835b1);
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
        ug.x0 x0Var = (ug.x0) this.f12127c;
        ug.v0 v0Var = x0Var.f58375s1;
        ArrayList arrayList = x0Var.f58371o1;
        int i11 = 0;
        while (true) {
            float f10 = 0.0f;
            if (i11 >= v0Var.getChildCount()) {
                break;
            }
            ug.w0 w0Var = (ug.w0) v0Var.getChildAt(i11);
            if (!x0Var.f58379w1 || !(w0Var.f58356f instanceof ug.o0)) {
                int i12 = w0Var.f58352a;
                ug.m0 m0Var = w0Var.f58355e;
                if (i12 == x0Var.B1) {
                    f10 = (-w0Var.getMeasuredWidth()) * x0Var.D1;
                    m0Var.setOffset(f10);
                } else if (i12 == x0Var.C1) {
                    f10 = ((-w0Var.getMeasuredWidth()) * x0Var.D1) + w0Var.getMeasuredWidth();
                    m0Var.setOffset(f10);
                } else {
                    m0Var.setOffset(w0Var.getMeasuredWidth());
                }
            }
            if (w0Var.f58356f instanceof ug.o0) {
                w0Var.setTranslationX(-f10);
                w0Var.f58353b.setTranslationX(f10);
                w0Var.f58354c.setTranslationX(f10);
            }
            i11++;
        }
        int i13 = x0Var.B1;
        if (i13 >= 0 && i13 < arrayList.size() && ((i10 = ((ss0) arrayList.get(x0Var.B1)).f51269a) == 0 || i10 == 14 || i10 == 28)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i14 = x0Var.C1;
        if (i14 >= 0 && i14 < arrayList.size() && ((i7 = ((ss0) arrayList.get(x0Var.C1)).f51269a) == 0 || i7 == 14 || i7 == 28)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            x0Var.f58373q1 = 1.0f;
            float f11 = x0Var.D1;
            if (f11 == 0.0f) {
                f11 = 1.0f;
            }
            x0Var.f58372p1 = f11;
            x0Var.f58374r1 = true;
        } else if (z10) {
            float f12 = 1.0f - x0Var.D1;
            x0Var.f58372p1 = f12;
            x0Var.f58373q1 = f12;
            x0Var.f58374r1 = true;
        } else if (z11) {
            float f13 = x0Var.D1;
            x0Var.f58372p1 = f13;
            x0Var.f58373q1 = f13;
            x0Var.f58374r1 = false;
        } else {
            x0Var.f58372p1 = 0.0f;
            x0Var.f58373q1 = 0.0f;
            x0Var.f58374r1 = true;
        }
        int i15 = (int) ((1.0f - x0Var.f58372p1) * 255.0f);
        if (i15 != x0Var.F1) {
            x0Var.F1 = i15;
            x0Var.f58376t1.invalidate();
            org.telegram.messenger.g0.h3(new q2.d(this, 23));
        }
    }

    private final void e(int i7) {
    }
}
