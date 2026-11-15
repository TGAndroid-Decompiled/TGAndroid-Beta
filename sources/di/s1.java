package di;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ff;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class s1 implements u10 {
    public final int f9363a;
    public final is f9364b;

    public s1(is isVar, int i7) {
        this.f9363a = i7;
        this.f9364b = isVar;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        boolean z10;
        int i7;
        hi.t tVar;
        float f10;
        switch (this.f9363a) {
            case 0:
                ((c6) this.f9364b).q2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                return;
            case 1:
                c6 c6Var = (c6) this.f9364b;
                ArrayList arrayList = (ArrayList) obj;
                s10 s10Var = (s10) obj2;
                Runnable runnable = (Runnable) obj3;
                bi.y5 y5Var = c6Var.S2;
                if (y5Var != null) {
                    y5Var.b();
                    c6Var.S2 = null;
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
                ConnectionsManager.getInstance(c6Var.f29679a).sendRequestTyped(craftstargift, new d3.b(1), new b2(c6Var, s10Var, arrayList, runnable, 0));
                return;
            default:
                hi.sa saVar = (hi.sa) this.f9364b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj3;
                if (saVar.f15057g0 == 0 && arrayList2 != null && !arrayList2.isEmpty() && saVar.f15087q2 == null && !saVar.X && saVar.I()) {
                    saVar.I1 = null;
                    saVar.J1 = null;
                    saVar.K1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList2.size() + saVar.B0.getFilledCount() > saVar.B0.getTotalCount()) {
                            int size2 = arrayList2.size() + saVar.B0.getFilledCount();
                            ArrayList a10 = hi.t.a();
                            int size3 = a10.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size3) {
                                    Object obj5 = a10.get(i11);
                                    i11++;
                                    tVar = (hi.t) obj5;
                                    if (tVar.f15124e.size() >= size2) {
                                    }
                                } else {
                                    tVar = null;
                                }
                            }
                            if (tVar == null) {
                                saVar.B0.o(null);
                                saVar.B0.c();
                                saVar.J0.setSelected((hi.t) null);
                                hi.v9 v9Var = saVar.C0;
                                if (v9Var != null) {
                                    v9Var.recordHevc = !saVar.B0.j();
                                }
                                saVar.J0.a(false, true);
                                saVar.l0(true);
                                return;
                            }
                            hi.fa faVar = saVar.B0;
                            saVar.A0 = tVar;
                            faVar.o(tVar);
                            saVar.J0.setSelected(tVar);
                            int indexOf = hi.t.a().indexOf(tVar);
                            if (indexOf >= 0) {
                                saVar.J0.f15400a.v0(indexOf);
                            }
                            hi.v9 v9Var2 = saVar.C0;
                            if (v9Var2 != null) {
                                v9Var2.recordHevc = !saVar.B0.j();
                            }
                            saVar.H0.setDrawable(new hi.u(tVar, false));
                            saVar.b0(saVar.I0, saVar.J0.f15403e, true);
                            hi.f6 f6Var = saVar.P0;
                            if (saVar.B0.j()) {
                                f10 = saVar.B0.getFilledProgress();
                            } else {
                                f10 = 0.0f;
                            }
                            f6Var.e(true, f10);
                        }
                    }
                    saVar.M1 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList2.size()) {
                            hi.d7 l10 = hi.d7.l((ff) arrayList2.get(i12));
                            l10.M0 = (Bitmap) arrayList3.get(i12);
                            l10.J0 = saVar.f15106w0;
                            l10.K0 = saVar.f15110x0;
                            l10.A();
                            if (bool.booleanValue()) {
                                if (saVar.B0.l(l10)) {
                                    saVar.L1 = hi.d7.a(saVar.B0.getLayout(), saVar.B0.getContent());
                                } else {
                                    i12++;
                                }
                            } else {
                                if (saVar.L1 == null) {
                                    saVar.L1 = l10;
                                } else {
                                    if (saVar.I1 == null) {
                                        ArrayList arrayList4 = new ArrayList();
                                        saVar.I1 = arrayList4;
                                        arrayList4.add(saVar.L1);
                                    }
                                    if (saVar.I1.size() < 10) {
                                        saVar.I1.add(l10);
                                    }
                                }
                                i12++;
                            }
                        }
                    }
                    if (saVar.I1 != null) {
                        saVar.h0(false, true);
                        saVar.R0.a(saVar.P1);
                        hi.f6 f6Var2 = saVar.P0;
                        if (saVar.P1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        f6Var2.f14294o0 = -1.0f;
                        f6Var2.f14295p0 = z10;
                        f6Var2.invalidate();
                        saVar.J1 = new ArrayList();
                        saVar.K1 = new ArrayList();
                        for (int i13 = 0; i13 < saVar.I1.size(); i13 = com.google.android.gms.internal.vision.e2.f(i13, i13, 1, saVar.K1)) {
                            saVar.J1.add(Integer.valueOf(i13));
                        }
                        saVar.B0.n(null);
                        saVar.J0.a(false, true);
                        saVar.l0(true);
                        saVar.e(false);
                        saVar.J(1, true);
                        hi.l9 l9Var = saVar.f15051e1;
                        if (l9Var != null) {
                            hi.e1 e1Var = l9Var.h;
                            if (!l9Var.J && !l9Var.N && (i7 = np.e1().getInt("multistorieshint", 0)) < 3) {
                                np.e1().edit().putInt("multistorieshint", i7 + 1).apply();
                                org.telegram.messenger.g0.r(e1Var);
                                l9Var.J = true;
                                l9Var.invalidate();
                                org.telegram.messenger.g0.i3(e1Var, 5500L);
                            }
                        }
                        hi.g3 g3Var = saVar.N0;
                        if (g3Var != null) {
                            saVar.f15075m2 = g3Var.f14106e.e0();
                            saVar.f15078n2 = saVar.N0.getSelectedAlbum();
                            return;
                        }
                        return;
                    }
                    hi.d7 d7Var = saVar.L1;
                    if (d7Var != null) {
                        d7Var.B();
                    }
                    saVar.J0.a(false, true);
                    saVar.l0(true);
                    saVar.e(false);
                    hi.g3 g3Var2 = saVar.N0;
                    if (g3Var2 != null) {
                        saVar.f15075m2 = g3Var2.f14106e.e0();
                        saVar.f15078n2 = saVar.N0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
