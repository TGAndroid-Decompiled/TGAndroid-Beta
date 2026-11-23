package di;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ef;
import org.telegram.messenger.fs;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.r10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class q1 implements r10 {
    public final int f9553a;
    public final fs f9554b;

    public q1(fs fsVar, int i7) {
        this.f9553a = i7;
        this.f9554b = fsVar;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        boolean z10;
        int i7;
        hi.c0 c0Var;
        float f10;
        switch (this.f9553a) {
            case 0:
                ((f6) this.f9554b).C2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                return;
            case 1:
                f6 f6Var = (f6) this.f9554b;
                ArrayList arrayList = (ArrayList) obj;
                p10 p10Var = (p10) obj2;
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
                ConnectionsManager.getInstance(f6Var.f30223a).sendRequestTyped(craftstargift, new d3.b(1), new e2(f6Var, p10Var, arrayList, runnable, 0));
                return;
            default:
                hi.nb nbVar = (hi.nb) this.f9554b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj3;
                if (nbVar.f15076g0 == 0 && arrayList2 != null && !arrayList2.isEmpty() && nbVar.f15106q2 == null && !nbVar.X && nbVar.I()) {
                    nbVar.I1 = null;
                    nbVar.J1 = null;
                    nbVar.K1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList2.size() + nbVar.B0.getFilledCount() > nbVar.B0.getTotalCount()) {
                            int size2 = arrayList2.size() + nbVar.B0.getFilledCount();
                            ArrayList a10 = hi.c0.a();
                            int size3 = a10.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size3) {
                                    Object obj5 = a10.get(i11);
                                    i11++;
                                    c0Var = (hi.c0) obj5;
                                    if (c0Var.f14250e.size() >= size2) {
                                    }
                                } else {
                                    c0Var = null;
                                }
                            }
                            if (c0Var == null) {
                                nbVar.B0.o(null);
                                nbVar.B0.c();
                                nbVar.J0.setSelected((hi.c0) null);
                                hi.qa qaVar = nbVar.C0;
                                if (qaVar != null) {
                                    qaVar.recordHevc = !nbVar.B0.j();
                                }
                                nbVar.J0.a(false, true);
                                nbVar.l0(true);
                                return;
                            }
                            hi.ab abVar = nbVar.B0;
                            nbVar.A0 = c0Var;
                            abVar.o(c0Var);
                            nbVar.J0.setSelected(c0Var);
                            int indexOf = hi.c0.a().indexOf(c0Var);
                            if (indexOf >= 0) {
                                nbVar.J0.f14567a.v0(indexOf);
                            }
                            hi.qa qaVar2 = nbVar.C0;
                            if (qaVar2 != null) {
                                qaVar2.recordHevc = !nbVar.B0.j();
                            }
                            nbVar.H0.setDrawable(new hi.d0(c0Var, false));
                            nbVar.b0(nbVar.I0, nbVar.J0.f14570e, true);
                            hi.n6 n6Var = nbVar.P0;
                            if (nbVar.B0.j()) {
                                f10 = nbVar.B0.getFilledProgress();
                            } else {
                                f10 = 0.0f;
                            }
                            n6Var.e(true, f10);
                        }
                    }
                    nbVar.M1 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList2.size()) {
                            hi.x7 l10 = hi.x7.l((ef) arrayList2.get(i12));
                            l10.M0 = (Bitmap) arrayList3.get(i12);
                            l10.J0 = nbVar.f15125w0;
                            l10.K0 = nbVar.f15129x0;
                            l10.A();
                            if (bool.booleanValue()) {
                                if (nbVar.B0.l(l10)) {
                                    nbVar.L1 = hi.x7.a(nbVar.B0.getLayout(), nbVar.B0.getContent());
                                } else {
                                    i12++;
                                }
                            } else {
                                if (nbVar.L1 == null) {
                                    nbVar.L1 = l10;
                                } else {
                                    if (nbVar.I1 == null) {
                                        ArrayList arrayList4 = new ArrayList();
                                        nbVar.I1 = arrayList4;
                                        arrayList4.add(nbVar.L1);
                                    }
                                    if (nbVar.I1.size() < 10) {
                                        nbVar.I1.add(l10);
                                    }
                                }
                                i12++;
                            }
                        }
                    }
                    if (nbVar.I1 != null) {
                        nbVar.h0(false, true);
                        nbVar.R0.a(nbVar.P1);
                        hi.n6 n6Var2 = nbVar.P0;
                        if (nbVar.P1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        n6Var2.f15032o0 = -1.0f;
                        n6Var2.f15033p0 = z10;
                        n6Var2.invalidate();
                        nbVar.J1 = new ArrayList();
                        nbVar.K1 = new ArrayList();
                        for (int i13 = 0; i13 < nbVar.I1.size(); i13 = com.google.android.gms.internal.vision.e2.f(i13, i13, 1, nbVar.K1)) {
                            nbVar.J1.add(Integer.valueOf(i13));
                        }
                        nbVar.B0.n(null);
                        nbVar.J0.a(false, true);
                        nbVar.l0(true);
                        nbVar.e(false);
                        nbVar.J(1, true);
                        hi.ga gaVar = nbVar.f15070e1;
                        if (gaVar != null) {
                            hi.w wVar = gaVar.h;
                            if (!gaVar.J && !gaVar.N && (i7 = mp.g1().getInt("multistorieshint", 0)) < 3) {
                                mp.g1().edit().putInt("multistorieshint", i7 + 1).apply();
                                org.telegram.messenger.g0.r(wVar);
                                gaVar.J = true;
                                gaVar.invalidate();
                                org.telegram.messenger.g0.h3(wVar, 5500L);
                            }
                        }
                        hi.p3 p3Var = nbVar.N0;
                        if (p3Var != null) {
                            nbVar.f15094m2 = p3Var.f14894e.e0();
                            nbVar.f15097n2 = nbVar.N0.getSelectedAlbum();
                            return;
                        }
                        return;
                    }
                    hi.x7 x7Var = nbVar.L1;
                    if (x7Var != null) {
                        x7Var.B();
                    }
                    nbVar.J0.a(false, true);
                    nbVar.l0(true);
                    nbVar.e(false);
                    hi.p3 p3Var2 = nbVar.N0;
                    if (p3Var2 != null) {
                        nbVar.f15094m2 = p3Var2.f14894e.e0();
                        nbVar.f15097n2 = nbVar.N0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
