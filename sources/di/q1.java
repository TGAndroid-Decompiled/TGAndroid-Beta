package di;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ff;
import org.telegram.messenger.gs;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class q1 implements t10 {
    public final int f9555a;
    public final gs f9556b;

    public q1(gs gsVar, int i7) {
        this.f9555a = i7;
        this.f9556b = gsVar;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        boolean z10;
        int i7;
        hi.t tVar;
        float f10;
        switch (this.f9555a) {
            case 0:
                ((f6) this.f9556b).C2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                return;
            case 1:
                f6 f6Var = (f6) this.f9556b;
                ArrayList arrayList = (ArrayList) obj;
                r10 r10Var = (r10) obj2;
                Runnable runnable = (Runnable) obj3;
                bi.k8 k8Var = f6Var.S2;
                if (k8Var != null) {
                    k8Var.b();
                    f6Var.S2 = null;
                }
                TL_stars.craftStarGift craftstargift = new TL_stars.craftStarGift();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj4 = arrayList.get(i10);
                    i10++;
                    TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                    tL_inputSavedStarGiftSlug.slug = ((TL_stars.StarGift) obj4).slug;
                    craftstargift.stargift.add(tL_inputSavedStarGiftSlug);
                }
                ConnectionsManager.getInstance(f6Var.f30139a).sendRequestTyped(craftstargift, new d3.b(1), new e2(f6Var, r10Var, arrayList, runnable, 0));
                return;
            default:
                hi.ta taVar = (hi.ta) this.f9556b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj3;
                if (taVar.f15409g0 == 0 && arrayList2 != null && !arrayList2.isEmpty() && taVar.f15439q2 == null && !taVar.X && taVar.I()) {
                    taVar.I1 = null;
                    taVar.J1 = null;
                    taVar.K1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList2.size() + taVar.B0.getFilledCount() > taVar.B0.getTotalCount()) {
                            int size2 = arrayList2.size() + taVar.B0.getFilledCount();
                            ArrayList a10 = hi.t.a();
                            int size3 = a10.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size3) {
                                    Object obj5 = a10.get(i11);
                                    i11++;
                                    tVar = (hi.t) obj5;
                                    if (tVar.f15353e.size() >= size2) {
                                    }
                                } else {
                                    tVar = null;
                                }
                            }
                            if (tVar == null) {
                                taVar.B0.o(null);
                                taVar.B0.c();
                                taVar.J0.setSelected((hi.t) null);
                                hi.w9 w9Var = taVar.C0;
                                if (w9Var != null) {
                                    w9Var.recordHevc = !taVar.B0.j();
                                }
                                taVar.J0.a(false, true);
                                taVar.l0(true);
                                return;
                            }
                            hi.ga gaVar = taVar.B0;
                            taVar.A0 = tVar;
                            gaVar.o(tVar);
                            taVar.J0.setSelected(tVar);
                            int indexOf = hi.t.a().indexOf(tVar);
                            if (indexOf >= 0) {
                                taVar.J0.f15701a.v0(indexOf);
                            }
                            hi.w9 w9Var2 = taVar.C0;
                            if (w9Var2 != null) {
                                w9Var2.recordHevc = !taVar.B0.j();
                            }
                            taVar.H0.setDrawable(new hi.u(tVar, false));
                            taVar.b0(taVar.I0, taVar.J0.f15704e, true);
                            hi.e6 e6Var = taVar.P0;
                            if (taVar.B0.j()) {
                                f10 = taVar.B0.getFilledProgress();
                            } else {
                                f10 = 0.0f;
                            }
                            e6Var.e(true, f10);
                        }
                    }
                    taVar.M1 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList2.size()) {
                            hi.d7 l10 = hi.d7.l((ff) arrayList2.get(i12));
                            l10.M0 = (Bitmap) arrayList3.get(i12);
                            l10.J0 = taVar.f15458w0;
                            l10.K0 = taVar.f15462x0;
                            l10.A();
                            if (bool.booleanValue()) {
                                if (taVar.B0.l(l10)) {
                                    taVar.L1 = hi.d7.a(taVar.B0.getLayout(), taVar.B0.getContent());
                                } else {
                                    i12++;
                                }
                            } else {
                                if (taVar.L1 == null) {
                                    taVar.L1 = l10;
                                } else {
                                    if (taVar.I1 == null) {
                                        ArrayList arrayList4 = new ArrayList();
                                        taVar.I1 = arrayList4;
                                        arrayList4.add(taVar.L1);
                                    }
                                    if (taVar.I1.size() < 10) {
                                        taVar.I1.add(l10);
                                    }
                                }
                                i12++;
                            }
                        }
                    }
                    if (taVar.I1 != null) {
                        taVar.h0(false, true);
                        taVar.R0.a(taVar.P1);
                        hi.e6 e6Var2 = taVar.P0;
                        if (taVar.P1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        e6Var2.f14529o0 = -1.0f;
                        e6Var2.f14530p0 = z10;
                        e6Var2.invalidate();
                        taVar.J1 = new ArrayList();
                        taVar.K1 = new ArrayList();
                        for (int i13 = 0; i13 < taVar.I1.size(); i13 = com.google.android.gms.internal.vision.e2.f(i13, i13, 1, taVar.K1)) {
                            taVar.J1.add(Integer.valueOf(i13));
                        }
                        taVar.B0.n(null);
                        taVar.J0.a(false, true);
                        taVar.l0(true);
                        taVar.e(false);
                        taVar.J(1, true);
                        hi.m9 m9Var = taVar.f15403e1;
                        if (m9Var != null) {
                            hi.b0 b0Var = m9Var.h;
                            if (!m9Var.J && !m9Var.N && (i7 = np.g1().getInt("multistorieshint", 0)) < 3) {
                                np.g1().edit().putInt("multistorieshint", i7 + 1).apply();
                                org.telegram.messenger.g0.r(b0Var);
                                m9Var.J = true;
                                m9Var.invalidate();
                                org.telegram.messenger.g0.h3(b0Var, 5500L);
                            }
                        }
                        hi.g3 g3Var = taVar.N0;
                        if (g3Var != null) {
                            taVar.f15427m2 = g3Var.f14340e.e0();
                            taVar.f15430n2 = taVar.N0.getSelectedAlbum();
                            return;
                        }
                        return;
                    }
                    hi.d7 d7Var = taVar.L1;
                    if (d7Var != null) {
                        d7Var.B();
                    }
                    taVar.J0.a(false, true);
                    taVar.l0(true);
                    taVar.e(false);
                    hi.g3 g3Var2 = taVar.N0;
                    if (g3Var2 != null) {
                        taVar.f15427m2 = g3Var2.f14340e.e0();
                        taVar.f15430n2 = taVar.N0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
