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
    public final int f9557a;
    public final fs f9558b;

    public q1(fs fsVar, int i7) {
        this.f9557a = i7;
        this.f9558b = fsVar;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        boolean z10;
        int i7;
        hi.u uVar;
        float f10;
        switch (this.f9557a) {
            case 0:
                ((f6) this.f9558b).C2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                return;
            case 1:
                f6 f6Var = (f6) this.f9558b;
                ArrayList arrayList = (ArrayList) obj;
                q10 q10Var = (q10) obj2;
                Runnable runnable = (Runnable) obj3;
                bi.f8 f8Var = f6Var.S2;
                if (f8Var != null) {
                    f8Var.b();
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
                ConnectionsManager.getInstance(f6Var.f30189a).sendRequestTyped(craftstargift, new d3.b(1), new e2(f6Var, q10Var, arrayList, runnable, 0));
                return;
            default:
                hi.ta taVar = (hi.ta) this.f9558b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj3;
                if (taVar.f15445g0 == 0 && arrayList2 != null && !arrayList2.isEmpty() && taVar.f15475q2 == null && !taVar.X && taVar.I()) {
                    taVar.I1 = null;
                    taVar.J1 = null;
                    taVar.K1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList2.size() + taVar.B0.getFilledCount() > taVar.B0.getTotalCount()) {
                            int size2 = arrayList2.size() + taVar.B0.getFilledCount();
                            ArrayList a10 = hi.u.a();
                            int size3 = a10.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size3) {
                                    Object obj5 = a10.get(i11);
                                    i11++;
                                    uVar = (hi.u) obj5;
                                    if (uVar.f15512e.size() >= size2) {
                                    }
                                } else {
                                    uVar = null;
                                }
                            }
                            if (uVar == null) {
                                taVar.B0.o(null);
                                taVar.B0.c();
                                taVar.J0.setSelected((hi.u) null);
                                hi.w9 w9Var = taVar.C0;
                                if (w9Var != null) {
                                    w9Var.recordHevc = !taVar.B0.j();
                                }
                                taVar.J0.a(false, true);
                                taVar.l0(true);
                                return;
                            }
                            hi.ga gaVar = taVar.B0;
                            taVar.A0 = uVar;
                            gaVar.o(uVar);
                            taVar.J0.setSelected(uVar);
                            int indexOf = hi.u.a().indexOf(uVar);
                            if (indexOf >= 0) {
                                taVar.J0.f15794a.v0(indexOf);
                            }
                            hi.w9 w9Var2 = taVar.C0;
                            if (w9Var2 != null) {
                                w9Var2.recordHevc = !taVar.B0.j();
                            }
                            taVar.H0.setDrawable(new hi.v(uVar, false));
                            taVar.b0(taVar.I0, taVar.J0.f15797e, true);
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
                            hi.d7 l10 = hi.d7.l((ef) arrayList2.get(i12));
                            l10.M0 = (Bitmap) arrayList3.get(i12);
                            l10.J0 = taVar.f15494w0;
                            l10.K0 = taVar.f15498x0;
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
                        e6Var2.f14580o0 = -1.0f;
                        e6Var2.f14581p0 = z10;
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
                        hi.m9 m9Var = taVar.f15439e1;
                        if (m9Var != null) {
                            hi.k kVar = m9Var.h;
                            if (!m9Var.J && !m9Var.N && (i7 = mp.g1().getInt("multistorieshint", 0)) < 3) {
                                mp.g1().edit().putInt("multistorieshint", i7 + 1).apply();
                                org.telegram.messenger.g0.r(kVar);
                                m9Var.J = true;
                                m9Var.invalidate();
                                org.telegram.messenger.g0.h3(kVar, 5500L);
                            }
                        }
                        hi.h3 h3Var = taVar.N0;
                        if (h3Var != null) {
                            taVar.f15463m2 = h3Var.f14543e.e0();
                            taVar.f15466n2 = taVar.N0.getSelectedAlbum();
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
                    hi.h3 h3Var2 = taVar.N0;
                    if (h3Var2 != null) {
                        taVar.f15463m2 = h3Var2.f14543e.e0();
                        taVar.f15466n2 = taVar.N0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
