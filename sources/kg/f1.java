package kg;

import android.view.KeyEvent;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.ui.Components.y9;
import org.telegram.ui.du0;
import th.e7;
import th.f7;
import th.k7;
import th.o7;
import th.v2;
import th.z2;
public final class f1 implements z4.e {
    public final int f11066a;
    public final Object f11067b;
    public final KeyEvent.Callback f11068c;

    public f1(KeyEvent.Callback callback, Object obj, int i10) {
        this.f11066a = i10;
        this.f11068c = callback;
        this.f11067b = obj;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f11066a;
        KeyEvent.Callback callback = this.f11068c;
        switch (i11) {
            case 0:
                i1 i1Var = (i1) callback;
                ArrayList arrayList = i1Var.f11113k1;
                if (((du0) arrayList.get(i10)).f36680a == 0) {
                    i1Var.E1.setTitle(dd.L0(2131751350, null));
                    i1Var.E1.requestLayout();
                } else if (((du0) arrayList.get(i10)).f36680a == 14) {
                    i1Var.E1.setTitle(dd.L0(2131743831, null));
                    i1Var.E1.requestLayout();
                } else if (((du0) arrayList.get(i10)).f36680a == 40) {
                    i1Var.E1.setTitle(dd.L0(2131750838, null));
                    i1Var.E1.requestLayout();
                } else if (((du0) arrayList.get(i10)).f36680a == 28) {
                    i1Var.E1.setTitle(dd.L0(2131744277, null));
                    i1Var.E1.requestLayout();
                }
                d();
                return;
            default:
                o7 o7Var = (o7) this.f11067b;
                th.q qVar = (th.q) callback;
                z2 currentPeerView = qVar.getCurrentPeerView();
                if (currentPeerView != null) {
                    v2 v2Var = qVar.B0;
                    f7 f7Var = (f7) v2Var;
                    f7Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
                    qVar.F();
                    k7 k7Var = o7Var.f49347t0;
                    if (k7Var != null) {
                        if (i10 < 3) {
                            k7Var.c(false);
                            return;
                        } else if (i10 > qVar.f48801z0.b() - 4) {
                            o7Var.f49347t0.c(true);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        int i12;
        int i13;
        switch (this.f11066a) {
            case 0:
                y9 y9Var = (y9) this.f11067b;
                y9Var.f32775b = f7;
                y9Var.f32776c = i10;
                y9Var.invalidate();
                i1 i1Var = (i1) this.f11068c;
                i1Var.f11125x1 = i10;
                if (i11 > 0) {
                    i12 = i10 + 1;
                } else {
                    i12 = i10 - 1;
                }
                i1Var.f11126y1 = i12;
                i1Var.f11127z1 = f7;
                d();
                return;
            default:
                th.q qVar = (th.q) this.f11068c;
                qVar.I0 = i10;
                if (i11 > 0) {
                    i13 = i10 + 1;
                } else {
                    i13 = i10 - 1;
                }
                qVar.J0 = i13;
                qVar.K0 = f7;
                long j10 = e20.i(qVar.f48800y0).f15524n;
                int i14 = qVar.I0;
                if (i14 >= 0 && (qVar.f48799x0 != null ? qVar.f48798w0 == j10 : !(i14 >= qVar.A0.size() || ((Long) qVar.A0.get(qVar.I0)).longValue() != j10))) {
                    ((f7) qVar.B0).d(1.0f - qVar.K0);
                    return;
                }
                int i15 = qVar.J0;
                if (i15 >= 0 && (qVar.f48799x0 != null ? qVar.f48798w0 == j10 : !(i15 >= qVar.A0.size() || ((Long) qVar.A0.get(qVar.J0)).longValue() != j10))) {
                    ((f7) qVar.B0).d(qVar.K0);
                    return;
                }
                ((f7) qVar.B0).d(0.0f);
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f11066a) {
            case 0:
                return;
            default:
                th.q qVar = (th.q) this.f11068c;
                ((f7) qVar.B0).d.d0();
                Runnable runnable = qVar.G0;
                if (runnable != null && i10 == 0) {
                    runnable.run();
                    qVar.G0 = null;
                }
                qVar.F0 = i10;
                o7 o7Var = ((e7) qVar).R0;
                if (o7Var.f49333n0.F0 == 1) {
                    org.telegram.messenger.i0.r(o7Var.f49309b1);
                    return;
                }
                return;
        }
    }

    public void d() {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        i1 i1Var = (i1) this.f11068c;
        d1 d1Var = i1Var.f11116o1;
        ArrayList arrayList = i1Var.f11113k1;
        int i12 = 0;
        while (true) {
            float f7 = 0.0f;
            if (i12 >= d1Var.getChildCount()) {
                break;
            }
            h1 h1Var = (h1) d1Var.getChildAt(i12);
            if (!i1Var.f11120s1 || !(h1Var.f11104f instanceof v0)) {
                int i13 = h1Var.f11101a;
                t0 t0Var = h1Var.e;
                if (i13 == i1Var.f11125x1) {
                    f7 = (-h1Var.getMeasuredWidth()) * i1Var.f11127z1;
                    t0Var.setOffset(f7);
                } else if (i13 == i1Var.f11126y1) {
                    f7 = ((-h1Var.getMeasuredWidth()) * i1Var.f11127z1) + h1Var.getMeasuredWidth();
                    t0Var.setOffset(f7);
                } else {
                    t0Var.setOffset(h1Var.getMeasuredWidth());
                }
            }
            if (h1Var.f11104f instanceof v0) {
                h1Var.setTranslationX(-f7);
                h1Var.f11102b.setTranslationX(f7);
                h1Var.f11103c.setTranslationX(f7);
            }
            i12++;
        }
        int i14 = i1Var.f11125x1;
        if (i14 >= 0 && i14 < arrayList.size() && ((i11 = ((du0) arrayList.get(i1Var.f11125x1)).f36680a) == 0 || i11 == 14 || i11 == 28)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i15 = i1Var.f11126y1;
        if (i15 >= 0 && i15 < arrayList.size() && ((i10 = ((du0) arrayList.get(i1Var.f11126y1)).f36680a) == 0 || i10 == 14 || i10 == 28)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            i1Var.f11114m1 = 1.0f;
            float f10 = i1Var.f11127z1;
            if (f10 == 0.0f) {
                f10 = 1.0f;
            }
            i1Var.l1 = f10;
            i1Var.f11115n1 = true;
        } else if (z10) {
            float f11 = 1.0f - i1Var.f11127z1;
            i1Var.l1 = f11;
            i1Var.f11114m1 = f11;
            i1Var.f11115n1 = true;
        } else if (z11) {
            float f12 = i1Var.f11127z1;
            i1Var.l1 = f12;
            i1Var.f11114m1 = f12;
            i1Var.f11115n1 = false;
        } else {
            i1Var.l1 = 0.0f;
            i1Var.f11114m1 = 0.0f;
            i1Var.f11115n1 = true;
        }
        int i16 = (int) ((1.0f - i1Var.l1) * 255.0f);
        if (i16 != i1Var.B1) {
            i1Var.B1 = i16;
            i1Var.f11117p1.invalidate();
            org.telegram.messenger.i0.g3(new gg.c(this, 24));
        }
    }

    private final void e(int i10) {
    }
}
