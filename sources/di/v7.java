package di;

import android.view.KeyEvent;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.ea;
import org.telegram.ui.xs0;
public final class v7 implements c5.g {
    public final int f9867a;
    public final Object f9868b;
    public final KeyEvent.Callback f9869c;

    public v7(KeyEvent.Callback callback, Object obj, int i7) {
        this.f9867a = i7;
        this.f9869c = callback;
        this.f9868b = obj;
    }

    @Override
    public final void a(int i7) {
        int i10 = this.f9867a;
        KeyEvent.Callback callback = this.f9869c;
        switch (i10) {
            case 0:
                q9 q9Var = (q9) this.f9868b;
                w wVar = (w) callback;
                j4 currentPeerView = wVar.getCurrentPeerView();
                if (currentPeerView != null) {
                    c4 c4Var = wVar.B0;
                    h9 h9Var = (h9) c4Var;
                    h9Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
                    wVar.F();
                    m9 m9Var = q9Var.f9637t0;
                    if (m9Var != null) {
                        if (i7 < 3) {
                            m9Var.b(false);
                            return;
                        } else if (i7 > wVar.f9938z0.b() - 4) {
                            q9Var.f9637t0.b(true);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                ug.w0 w0Var = (ug.w0) callback;
                ArrayList arrayList = w0Var.f56858k1;
                if (((xs0) arrayList.get(i7)).f51756a == 0) {
                    w0Var.E1.setTitle(id.M0(2131751349, null));
                    w0Var.E1.requestLayout();
                } else if (((xs0) arrayList.get(i7)).f51756a == 14) {
                    w0Var.E1.setTitle(id.M0(2131743805, null));
                    w0Var.E1.requestLayout();
                } else if (((xs0) arrayList.get(i7)).f51756a == 40) {
                    w0Var.E1.setTitle(id.M0(2131750837, null));
                    w0Var.E1.requestLayout();
                } else if (((xs0) arrayList.get(i7)).f51756a == 28) {
                    w0Var.E1.setTitle(id.M0(2131744252, null));
                    w0Var.E1.requestLayout();
                }
                d();
                return;
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        int i11;
        int i12;
        switch (this.f9867a) {
            case 0:
                w wVar = (w) this.f9869c;
                wVar.I0 = i7;
                if (i10 > 0) {
                    i11 = i7 + 1;
                } else {
                    i11 = i7 - 1;
                }
                wVar.J0 = i11;
                wVar.K0 = f10;
                long j3 = p10.i(wVar.f9937y0).f24489n;
                int i13 = wVar.I0;
                if (i13 >= 0 && (wVar.f9936x0 != null ? wVar.f9935w0 == j3 : !(i13 >= wVar.A0.size() || ((Long) wVar.A0.get(wVar.I0)).longValue() != j3))) {
                    ((h9) wVar.B0).d(1.0f - wVar.K0);
                    return;
                }
                int i14 = wVar.J0;
                if (i14 >= 0 && (wVar.f9936x0 != null ? wVar.f9935w0 == j3 : !(i14 >= wVar.A0.size() || ((Long) wVar.A0.get(wVar.J0)).longValue() != j3))) {
                    ((h9) wVar.B0).d(wVar.K0);
                    return;
                }
                ((h9) wVar.B0).d(0.0f);
                return;
            default:
                ea eaVar = (ea) this.f9868b;
                eaVar.f33346b = f10;
                eaVar.f33347c = i7;
                eaVar.invalidate();
                ug.w0 w0Var = (ug.w0) this.f9869c;
                w0Var.f56869x1 = i7;
                if (i10 > 0) {
                    i12 = i7 + 1;
                } else {
                    i12 = i7 - 1;
                }
                w0Var.f56870y1 = i12;
                w0Var.f56871z1 = f10;
                d();
                return;
        }
    }

    @Override
    public final void c(int i7) {
        switch (this.f9867a) {
            case 0:
                w wVar = (w) this.f9869c;
                ((h9) wVar.B0).d.V();
                Runnable runnable = wVar.G0;
                if (runnable != null && i7 == 0) {
                    runnable.run();
                    wVar.G0 = null;
                }
                wVar.F0 = i7;
                q9 q9Var = ((g9) wVar).R0;
                if (q9Var.f9624n0.F0 == 1) {
                    org.telegram.messenger.g0.r(q9Var.f9596a1);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void d() {
        boolean z9;
        boolean z10;
        int i7;
        int i10;
        ug.w0 w0Var = (ug.w0) this.f9869c;
        ug.u0 u0Var = w0Var.f56860o1;
        ArrayList arrayList = w0Var.f56858k1;
        int i11 = 0;
        while (true) {
            float f10 = 0.0f;
            if (i11 >= u0Var.getChildCount()) {
                break;
            }
            ug.v0 v0Var = (ug.v0) u0Var.getChildAt(i11);
            if (!w0Var.f56864s1 || !(v0Var.f56852f instanceof ug.n0)) {
                int i12 = v0Var.f56848a;
                ug.l0 l0Var = v0Var.f56851e;
                if (i12 == w0Var.f56869x1) {
                    f10 = (-v0Var.getMeasuredWidth()) * w0Var.f56871z1;
                    l0Var.setOffset(f10);
                } else if (i12 == w0Var.f56870y1) {
                    f10 = ((-v0Var.getMeasuredWidth()) * w0Var.f56871z1) + v0Var.getMeasuredWidth();
                    l0Var.setOffset(f10);
                } else {
                    l0Var.setOffset(v0Var.getMeasuredWidth());
                }
            }
            if (v0Var.f56852f instanceof ug.n0) {
                v0Var.setTranslationX(-f10);
                v0Var.f56849b.setTranslationX(f10);
                v0Var.f56850c.setTranslationX(f10);
            }
            i11++;
        }
        int i13 = w0Var.f56869x1;
        if (i13 >= 0 && i13 < arrayList.size() && ((i10 = ((xs0) arrayList.get(w0Var.f56869x1)).f51756a) == 0 || i10 == 14 || i10 == 28)) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i14 = w0Var.f56870y1;
        if (i14 >= 0 && i14 < arrayList.size() && ((i7 = ((xs0) arrayList.get(w0Var.f56870y1)).f51756a) == 0 || i7 == 14 || i7 == 28)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 && z10) {
            w0Var.f56859m1 = 1.0f;
            float f11 = w0Var.f56871z1;
            if (f11 == 0.0f) {
                f11 = 1.0f;
            }
            w0Var.l1 = f11;
            w0Var.n1 = true;
        } else if (z9) {
            float f12 = 1.0f - w0Var.f56871z1;
            w0Var.l1 = f12;
            w0Var.f56859m1 = f12;
            w0Var.n1 = true;
        } else if (z10) {
            float f13 = w0Var.f56871z1;
            w0Var.l1 = f13;
            w0Var.f56859m1 = f13;
            w0Var.n1 = false;
        } else {
            w0Var.l1 = 0.0f;
            w0Var.f56859m1 = 0.0f;
            w0Var.n1 = true;
        }
        int i15 = (int) ((1.0f - w0Var.l1) * 255.0f);
        if (i15 != w0Var.B1) {
            w0Var.B1 = i15;
            w0Var.f56861p1.invalidate();
            org.telegram.messenger.g0.h3(new sh.b(this, 16));
        }
    }

    private final void e(int i7) {
    }
}
