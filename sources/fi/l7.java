package fi;

import android.view.KeyEvent;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.ui.Components.ia;
import org.telegram.ui.ws0;
public final class l7 implements c5.h {
    public final int f12268a;
    public final Object f12269b;
    public final KeyEvent.Callback f12270c;

    public l7(KeyEvent.Callback callback, Object obj, int i7) {
        this.f12268a = i7;
        this.f12270c = callback;
        this.f12269b = obj;
    }

    @Override
    public final void a(int i7) {
        int i10 = this.f12268a;
        KeyEvent.Callback callback = this.f12270c;
        switch (i10) {
            case 0:
                f9 f9Var = (f9) this.f12269b;
                w wVar = (w) callback;
                z3 currentPeerView = wVar.getCurrentPeerView();
                if (currentPeerView != null) {
                    s3 s3Var = wVar.C0;
                    w8 w8Var = (w8) s3Var;
                    w8Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
                    wVar.F();
                    b9 b9Var = f9Var.f12041u0;
                    if (b9Var != null) {
                        if (i7 < 3) {
                            b9Var.b(false);
                            return;
                        } else if (i7 > wVar.A0.b() - 4) {
                            f9Var.f12041u0.b(true);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                ug.y0 y0Var = (ug.y0) callback;
                ArrayList arrayList = y0Var.f58997o1;
                if (((ws0) arrayList.get(i7)).f53519a == 0) {
                    y0Var.I1.setTitle(hd.N0(2131751337, null));
                    y0Var.I1.requestLayout();
                } else if (((ws0) arrayList.get(i7)).f53519a == 14) {
                    y0Var.I1.setTitle(hd.N0(2131743560, null));
                    y0Var.I1.requestLayout();
                } else if (((ws0) arrayList.get(i7)).f53519a == 40) {
                    y0Var.I1.setTitle(hd.N0(2131750825, null));
                    y0Var.I1.requestLayout();
                } else if (((ws0) arrayList.get(i7)).f53519a == 28) {
                    y0Var.I1.setTitle(hd.N0(2131744009, null));
                    y0Var.I1.requestLayout();
                }
                d();
                return;
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        int i11;
        int i12;
        switch (this.f12268a) {
            case 0:
                w wVar = (w) this.f12270c;
                wVar.J0 = i7;
                if (i10 > 0) {
                    i11 = i7 + 1;
                } else {
                    i11 = i7 - 1;
                }
                wVar.K0 = i11;
                wVar.L0 = f10;
                long j3 = k10.i(wVar.f12352z0).f24987n;
                int i13 = wVar.J0;
                if (i13 >= 0 && (wVar.f12351y0 != null ? wVar.f12350x0 == j3 : !(i13 >= wVar.B0.size() || ((Long) wVar.B0.get(wVar.J0)).longValue() != j3))) {
                    ((w8) wVar.C0).d(1.0f - wVar.L0);
                    return;
                }
                int i14 = wVar.K0;
                if (i14 >= 0 && (wVar.f12351y0 != null ? wVar.f12350x0 == j3 : !(i14 >= wVar.B0.size() || ((Long) wVar.B0.get(wVar.K0)).longValue() != j3))) {
                    ((w8) wVar.C0).d(wVar.L0);
                    return;
                }
                ((w8) wVar.C0).d(0.0f);
                return;
            default:
                ia iaVar = (ia) this.f12269b;
                iaVar.f36228b = f10;
                iaVar.f36229c = i7;
                iaVar.invalidate();
                ug.y0 y0Var = (ug.y0) this.f12270c;
                y0Var.B1 = i7;
                if (i10 > 0) {
                    i12 = i7 + 1;
                } else {
                    i12 = i7 - 1;
                }
                y0Var.C1 = i12;
                y0Var.D1 = f10;
                d();
                return;
        }
    }

    @Override
    public final void c(int i7) {
        switch (this.f12268a) {
            case 0:
                w wVar = (w) this.f12270c;
                ((w8) wVar.C0).d.V();
                Runnable runnable = wVar.H0;
                if (runnable != null && i7 == 0) {
                    runnable.run();
                    wVar.H0 = null;
                }
                wVar.G0 = i7;
                f9 f9Var = ((v8) wVar).S0;
                if (f9Var.f12027o0.G0 == 1) {
                    org.telegram.messenger.g0.r(f9Var.f12001b1);
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
        ug.y0 y0Var = (ug.y0) this.f12270c;
        ug.w0 w0Var = y0Var.f59001s1;
        ArrayList arrayList = y0Var.f58997o1;
        int i11 = 0;
        while (true) {
            float f10 = 0.0f;
            if (i11 >= w0Var.getChildCount()) {
                break;
            }
            ug.x0 x0Var = (ug.x0) w0Var.getChildAt(i11);
            if (!y0Var.f59005w1 || !(x0Var.f58991f instanceof ug.p0)) {
                int i12 = x0Var.f58987a;
                ug.n0 n0Var = x0Var.f58990e;
                if (i12 == y0Var.B1) {
                    f10 = (-x0Var.getMeasuredWidth()) * y0Var.D1;
                    n0Var.setOffset(f10);
                } else if (i12 == y0Var.C1) {
                    f10 = ((-x0Var.getMeasuredWidth()) * y0Var.D1) + x0Var.getMeasuredWidth();
                    n0Var.setOffset(f10);
                } else {
                    n0Var.setOffset(x0Var.getMeasuredWidth());
                }
            }
            if (x0Var.f58991f instanceof ug.p0) {
                x0Var.setTranslationX(-f10);
                x0Var.f58988b.setTranslationX(f10);
                x0Var.f58989c.setTranslationX(f10);
            }
            i11++;
        }
        int i13 = y0Var.B1;
        if (i13 >= 0 && i13 < arrayList.size() && ((i10 = ((ws0) arrayList.get(y0Var.B1)).f53519a) == 0 || i10 == 14 || i10 == 28)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i14 = y0Var.C1;
        if (i14 >= 0 && i14 < arrayList.size() && ((i7 = ((ws0) arrayList.get(y0Var.C1)).f53519a) == 0 || i7 == 14 || i7 == 28)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            y0Var.f58999q1 = 1.0f;
            float f11 = y0Var.D1;
            if (f11 == 0.0f) {
                f11 = 1.0f;
            }
            y0Var.f58998p1 = f11;
            y0Var.f59000r1 = true;
        } else if (z10) {
            float f12 = 1.0f - y0Var.D1;
            y0Var.f58998p1 = f12;
            y0Var.f58999q1 = f12;
            y0Var.f59000r1 = true;
        } else if (z11) {
            float f13 = y0Var.D1;
            y0Var.f58998p1 = f13;
            y0Var.f58999q1 = f13;
            y0Var.f59000r1 = false;
        } else {
            y0Var.f58998p1 = 0.0f;
            y0Var.f58999q1 = 0.0f;
            y0Var.f59000r1 = true;
        }
        int i15 = (int) ((1.0f - y0Var.f58998p1) * 255.0f);
        if (i15 != y0Var.F1) {
            y0Var.F1 = i15;
            y0Var.f59002t1.invalidate();
            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(this, 26));
        }
    }

    private final void e(int i7) {
    }
}
