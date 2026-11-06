package di;

import android.view.KeyEvent;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.ea;
import org.telegram.ui.us0;
public final class v7 implements c5.g {
    public final int f9873a;
    public final Object f9874b;
    public final KeyEvent.Callback f9875c;

    public v7(KeyEvent.Callback callback, Object obj, int i7) {
        this.f9873a = i7;
        this.f9875c = callback;
        this.f9874b = obj;
    }

    @Override
    public final void a(int i7) {
        int i10 = this.f9873a;
        KeyEvent.Callback callback = this.f9875c;
        switch (i10) {
            case 0:
                p9 p9Var = (p9) this.f9874b;
                w wVar = (w) callback;
                i4 currentPeerView = wVar.getCurrentPeerView();
                if (currentPeerView != null) {
                    b4 b4Var = wVar.B0;
                    g9 g9Var = (g9) b4Var;
                    g9Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
                    wVar.F();
                    l9 l9Var = p9Var.f9572t0;
                    if (l9Var != null) {
                        if (i7 < 3) {
                            l9Var.b(false);
                            return;
                        } else if (i7 > wVar.f9942z0.b() - 4) {
                            p9Var.f9572t0.b(true);
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
                ArrayList arrayList = w0Var.f56729k1;
                if (((us0) arrayList.get(i7)).f50485a == 0) {
                    w0Var.E1.setTitle(hd.M0(2131751350, null));
                    w0Var.E1.requestLayout();
                } else if (((us0) arrayList.get(i7)).f50485a == 14) {
                    w0Var.E1.setTitle(hd.M0(2131743806, null));
                    w0Var.E1.requestLayout();
                } else if (((us0) arrayList.get(i7)).f50485a == 40) {
                    w0Var.E1.setTitle(hd.M0(2131750838, null));
                    w0Var.E1.requestLayout();
                } else if (((us0) arrayList.get(i7)).f50485a == 28) {
                    w0Var.E1.setTitle(hd.M0(2131744253, null));
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
        switch (this.f9873a) {
            case 0:
                w wVar = (w) this.f9875c;
                wVar.I0 = i7;
                if (i10 > 0) {
                    i11 = i7 + 1;
                } else {
                    i11 = i7 - 1;
                }
                wVar.J0 = i11;
                wVar.K0 = f10;
                long j3 = p10.i(wVar.f9941y0).f24478n;
                int i13 = wVar.I0;
                if (i13 >= 0 && (wVar.f9940x0 != null ? wVar.f9939w0 == j3 : !(i13 >= wVar.A0.size() || ((Long) wVar.A0.get(wVar.I0)).longValue() != j3))) {
                    ((g9) wVar.B0).d(1.0f - wVar.K0);
                    return;
                }
                int i14 = wVar.J0;
                if (i14 >= 0 && (wVar.f9940x0 != null ? wVar.f9939w0 == j3 : !(i14 >= wVar.A0.size() || ((Long) wVar.A0.get(wVar.J0)).longValue() != j3))) {
                    ((g9) wVar.B0).d(wVar.K0);
                    return;
                }
                ((g9) wVar.B0).d(0.0f);
                return;
            default:
                ea eaVar = (ea) this.f9874b;
                eaVar.f33185b = f10;
                eaVar.f33186c = i7;
                eaVar.invalidate();
                ug.w0 w0Var = (ug.w0) this.f9875c;
                w0Var.f56740x1 = i7;
                if (i10 > 0) {
                    i12 = i7 + 1;
                } else {
                    i12 = i7 - 1;
                }
                w0Var.f56741y1 = i12;
                w0Var.f56742z1 = f10;
                d();
                return;
        }
    }

    @Override
    public final void c(int i7) {
        switch (this.f9873a) {
            case 0:
                w wVar = (w) this.f9875c;
                ((g9) wVar.B0).d.V();
                Runnable runnable = wVar.G0;
                if (runnable != null && i7 == 0) {
                    runnable.run();
                    wVar.G0 = null;
                }
                wVar.F0 = i7;
                p9 p9Var = ((f9) wVar).R0;
                if (p9Var.f9559n0.F0 == 1) {
                    org.telegram.messenger.g0.r(p9Var.f9531a1);
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
        ug.w0 w0Var = (ug.w0) this.f9875c;
        ug.u0 u0Var = w0Var.f56731o1;
        ArrayList arrayList = w0Var.f56729k1;
        int i11 = 0;
        while (true) {
            float f10 = 0.0f;
            if (i11 >= u0Var.getChildCount()) {
                break;
            }
            ug.v0 v0Var = (ug.v0) u0Var.getChildAt(i11);
            if (!w0Var.f56735s1 || !(v0Var.f56723f instanceof ug.n0)) {
                int i12 = v0Var.f56719a;
                ug.l0 l0Var = v0Var.f56722e;
                if (i12 == w0Var.f56740x1) {
                    f10 = (-v0Var.getMeasuredWidth()) * w0Var.f56742z1;
                    l0Var.setOffset(f10);
                } else if (i12 == w0Var.f56741y1) {
                    f10 = ((-v0Var.getMeasuredWidth()) * w0Var.f56742z1) + v0Var.getMeasuredWidth();
                    l0Var.setOffset(f10);
                } else {
                    l0Var.setOffset(v0Var.getMeasuredWidth());
                }
            }
            if (v0Var.f56723f instanceof ug.n0) {
                v0Var.setTranslationX(-f10);
                v0Var.f56720b.setTranslationX(f10);
                v0Var.f56721c.setTranslationX(f10);
            }
            i11++;
        }
        int i13 = w0Var.f56740x1;
        if (i13 >= 0 && i13 < arrayList.size() && ((i10 = ((us0) arrayList.get(w0Var.f56740x1)).f50485a) == 0 || i10 == 14 || i10 == 28)) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i14 = w0Var.f56741y1;
        if (i14 >= 0 && i14 < arrayList.size() && ((i7 = ((us0) arrayList.get(w0Var.f56741y1)).f50485a) == 0 || i7 == 14 || i7 == 28)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 && z10) {
            w0Var.f56730m1 = 1.0f;
            float f11 = w0Var.f56742z1;
            if (f11 == 0.0f) {
                f11 = 1.0f;
            }
            w0Var.l1 = f11;
            w0Var.n1 = true;
        } else if (z9) {
            float f12 = 1.0f - w0Var.f56742z1;
            w0Var.l1 = f12;
            w0Var.f56730m1 = f12;
            w0Var.n1 = true;
        } else if (z10) {
            float f13 = w0Var.f56742z1;
            w0Var.l1 = f13;
            w0Var.f56730m1 = f13;
            w0Var.n1 = false;
        } else {
            w0Var.l1 = 0.0f;
            w0Var.f56730m1 = 0.0f;
            w0Var.n1 = true;
        }
        int i15 = (int) ((1.0f - w0Var.l1) * 255.0f);
        if (i15 != w0Var.B1) {
            w0Var.B1 = i15;
            w0Var.f56732p1.invalidate();
            org.telegram.messenger.g0.h3(new sg.t0(this, 18));
        }
    }

    private final void e(int i7) {
    }
}
