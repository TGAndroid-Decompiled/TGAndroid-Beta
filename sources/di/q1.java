package di;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ef;
import org.telegram.messenger.fs;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.s10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class q1 implements s10 {
    public final int f9589a;
    public final fs f9590b;

    public q1(fs fsVar, int i7) {
        this.f9589a = i7;
        this.f9590b = fsVar;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        boolean z10;
        int i7;
        hi.v vVar;
        float f10;
        switch (this.f9589a) {
            case 0:
                ((f6) this.f9590b).C2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                return;
            case 1:
                f6 f6Var = (f6) this.f9590b;
                ArrayList arrayList = (ArrayList) obj;
                q10 q10Var = (q10) obj2;
                Runnable runnable = (Runnable) obj3;
                bi.i8 i8Var = f6Var.S2;
                if (i8Var != null) {
                    i8Var.b();
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
                ConnectionsManager.getInstance(f6Var.f30170a).sendRequestTyped(craftstargift, new d3.b(1), new e2(f6Var, q10Var, arrayList, runnable, 0));
                return;
            default:
                hi.sa saVar = (hi.sa) this.f9590b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj3;
                if (saVar.f15403g0 == 0 && arrayList2 != null && !arrayList2.isEmpty() && saVar.f15433q2 == null && !saVar.X && saVar.I()) {
                    saVar.I1 = null;
                    saVar.J1 = null;
                    saVar.K1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList2.size() + saVar.B0.getFilledCount() > saVar.B0.getTotalCount()) {
                            int size2 = arrayList2.size() + saVar.B0.getFilledCount();
                            ArrayList a10 = hi.v.a();
                            int size3 = a10.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size3) {
                                    Object obj5 = a10.get(i11);
                                    i11++;
                                    vVar = (hi.v) obj5;
                                    if (vVar.f15588e.size() >= size2) {
                                    }
                                } else {
                                    vVar = null;
                                }
                            }
                            if (vVar == null) {
                                saVar.B0.o(null);
                                saVar.B0.c();
                                saVar.J0.setSelected((hi.v) null);
                                hi.v9 v9Var = saVar.C0;
                                if (v9Var != null) {
                                    v9Var.recordHevc = !saVar.B0.j();
                                }
                                saVar.J0.a(false, true);
                                saVar.l0(true);
                                return;
                            }
                            hi.fa faVar = saVar.B0;
                            saVar.A0 = vVar;
                            faVar.o(vVar);
                            saVar.J0.setSelected(vVar);
                            int indexOf = hi.v.a().indexOf(vVar);
                            if (indexOf >= 0) {
                                saVar.J0.f14202a.v0(indexOf);
                            }
                            hi.v9 v9Var2 = saVar.C0;
                            if (v9Var2 != null) {
                                v9Var2.recordHevc = !saVar.B0.j();
                            }
                            saVar.H0.setDrawable(new hi.w(vVar, false));
                            saVar.b0(saVar.I0, saVar.J0.f14205e, true);
                            hi.d6 d6Var = saVar.P0;
                            if (saVar.B0.j()) {
                                f10 = saVar.B0.getFilledProgress();
                            } else {
                                f10 = 0.0f;
                            }
                            d6Var.e(true, f10);
                        }
                    }
                    saVar.M1 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList2.size()) {
                            hi.c7 l10 = hi.c7.l((ef) arrayList2.get(i12));
                            l10.M0 = (Bitmap) arrayList3.get(i12);
                            l10.J0 = saVar.f15452w0;
                            l10.K0 = saVar.f15456x0;
                            l10.A();
                            if (bool.booleanValue()) {
                                if (saVar.B0.l(l10)) {
                                    saVar.L1 = hi.c7.a(saVar.B0.getLayout(), saVar.B0.getContent());
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
                        hi.d6 d6Var2 = saVar.P0;
                        if (saVar.P1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        d6Var2.f14528o0 = -1.0f;
                        d6Var2.f14529p0 = z10;
                        d6Var2.invalidate();
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
                        hi.l9 l9Var = saVar.f15397e1;
                        if (l9Var != null) {
                            hi.l lVar = l9Var.h;
                            if (!l9Var.J && !l9Var.N && (i7 = mp.g1().getInt("multistorieshint", 0)) < 3) {
                                mp.g1().edit().putInt("multistorieshint", i7 + 1).apply();
                                org.telegram.messenger.g0.r(lVar);
                                l9Var.J = true;
                                l9Var.invalidate();
                                org.telegram.messenger.g0.h3(lVar, 5500L);
                            }
                        }
                        hi.g3 g3Var = saVar.N0;
                        if (g3Var != null) {
                            saVar.f15421m2 = g3Var.f14491e.e0();
                            saVar.f15424n2 = saVar.N0.getSelectedAlbum();
                            return;
                        }
                        return;
                    }
                    hi.c7 c7Var = saVar.L1;
                    if (c7Var != null) {
                        c7Var.B();
                    }
                    saVar.J0.a(false, true);
                    saVar.l0(true);
                    saVar.e(false);
                    hi.g3 g3Var2 = saVar.N0;
                    if (g3Var2 != null) {
                        saVar.f15421m2 = g3Var2.f14491e.e0();
                        saVar.f15424n2 = saVar.N0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
