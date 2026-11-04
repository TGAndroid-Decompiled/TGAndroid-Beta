package ci;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.messenger.ye;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class y1 implements p10 {
    public final int f6385a;
    public final cs f6386b;

    public y1(cs csVar, int i3) {
        this.f6385a = i3;
        this.f6386b = csVar;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        boolean z10;
        int i3;
        gi.t tVar;
        float f10;
        switch (this.f6385a) {
            case 0:
                ((l6) this.f6386b).p2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                return;
            case 1:
                l6 l6Var = (l6) this.f6386b;
                ArrayList arrayList = (ArrayList) obj;
                n10 n10Var = (n10) obj2;
                Runnable runnable = (Runnable) obj3;
                ai.g6 g6Var = l6Var.P2;
                if (g6Var != null) {
                    g6Var.b();
                    l6Var.P2 = null;
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
                ConnectionsManager.getInstance(l6Var.f28583a).sendRequestTyped(craftstargift, new c3.b(1), new h2(l6Var, n10Var, arrayList, runnable, 0));
                return;
            default:
                gi.va vaVar = (gi.va) this.f6386b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj3;
                if (vaVar.f13720g0 == 0 && arrayList2 != null && !arrayList2.isEmpty() && vaVar.f13750q2 == null && !vaVar.X && vaVar.I()) {
                    vaVar.I1 = null;
                    vaVar.J1 = null;
                    vaVar.K1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList2.size() + vaVar.B0.getFilledCount() > vaVar.B0.getTotalCount()) {
                            int size2 = arrayList2.size() + vaVar.B0.getFilledCount();
                            ArrayList a10 = gi.t.a();
                            int size3 = a10.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size3) {
                                    Object obj5 = a10.get(i11);
                                    i11++;
                                    tVar = (gi.t) obj5;
                                    if (tVar.f13589e.size() >= size2) {
                                    }
                                } else {
                                    tVar = null;
                                }
                            }
                            if (tVar == null) {
                                vaVar.B0.o(null);
                                vaVar.B0.c();
                                vaVar.J0.setSelected((gi.t) null);
                                gi.y9 y9Var = vaVar.C0;
                                if (y9Var != null) {
                                    y9Var.recordHevc = !vaVar.B0.j();
                                }
                                vaVar.J0.a(false, true);
                                vaVar.l0(true);
                                return;
                            }
                            gi.ia iaVar = vaVar.B0;
                            vaVar.A0 = tVar;
                            iaVar.o(tVar);
                            vaVar.J0.setSelected(tVar);
                            int indexOf = gi.t.a().indexOf(tVar);
                            if (indexOf >= 0) {
                                vaVar.J0.f13875a.v0(indexOf);
                            }
                            gi.y9 y9Var2 = vaVar.C0;
                            if (y9Var2 != null) {
                                y9Var2.recordHevc = !vaVar.B0.j();
                            }
                            vaVar.H0.setDrawable(new gi.u(tVar, false));
                            vaVar.b0(vaVar.I0, vaVar.J0.f13878e, true);
                            gi.h6 h6Var = vaVar.P0;
                            if (vaVar.B0.j()) {
                                f10 = vaVar.B0.getFilledProgress();
                            } else {
                                f10 = 0.0f;
                            }
                            h6Var.e(true, f10);
                        }
                    }
                    vaVar.M1 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList2.size()) {
                            gi.f7 l10 = gi.f7.l((ye) arrayList2.get(i12));
                            l10.M0 = (Bitmap) arrayList3.get(i12);
                            l10.J0 = vaVar.f13769w0;
                            l10.K0 = vaVar.f13773x0;
                            l10.A();
                            if (bool.booleanValue()) {
                                if (vaVar.B0.l(l10)) {
                                    vaVar.L1 = gi.f7.a(vaVar.B0.getLayout(), vaVar.B0.getContent());
                                } else {
                                    i12++;
                                }
                            } else {
                                if (vaVar.L1 == null) {
                                    vaVar.L1 = l10;
                                } else {
                                    if (vaVar.I1 == null) {
                                        ArrayList arrayList4 = new ArrayList();
                                        vaVar.I1 = arrayList4;
                                        arrayList4.add(vaVar.L1);
                                    }
                                    if (vaVar.I1.size() < 10) {
                                        vaVar.I1.add(l10);
                                    }
                                }
                                i12++;
                            }
                        }
                    }
                    if (vaVar.I1 != null) {
                        vaVar.h0(false, true);
                        vaVar.R0.a(vaVar.P1);
                        gi.h6 h6Var2 = vaVar.P0;
                        if (vaVar.P1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        h6Var2.f12902o0 = -1.0f;
                        h6Var2.f12903p0 = z10;
                        h6Var2.invalidate();
                        vaVar.J1 = new ArrayList();
                        vaVar.K1 = new ArrayList();
                        for (int i13 = 0; i13 < vaVar.I1.size(); i13 = com.google.android.recaptcha.internal.a.f(i13, i13, 1, vaVar.K1)) {
                            vaVar.J1.add(Integer.valueOf(i13));
                        }
                        vaVar.B0.n(null);
                        vaVar.J0.a(false, true);
                        vaVar.l0(true);
                        vaVar.e(false);
                        vaVar.J(1, true);
                        gi.o9 o9Var = vaVar.f13714e1;
                        if (o9Var != null) {
                            ei.z5 z5Var = o9Var.h;
                            if (!o9Var.J && !o9Var.N && (i3 = hp.e1().getInt("multistorieshint", 0)) < 3) {
                                hp.e1().edit().putInt("multistorieshint", i3 + 1).apply();
                                org.telegram.messenger.g0.r(z5Var);
                                o9Var.J = true;
                                o9Var.invalidate();
                                org.telegram.messenger.g0.i3(z5Var, 5500L);
                            }
                        }
                        gi.g3 g3Var = vaVar.N0;
                        if (g3Var != null) {
                            vaVar.f13737m2 = g3Var.f12566e.e0();
                            vaVar.f13741n2 = vaVar.N0.getSelectedAlbum();
                            return;
                        }
                        return;
                    }
                    gi.f7 f7Var = vaVar.L1;
                    if (f7Var != null) {
                        f7Var.B();
                    }
                    vaVar.J0.a(false, true);
                    vaVar.l0(true);
                    vaVar.e(false);
                    gi.g3 g3Var2 = vaVar.N0;
                    if (g3Var2 != null) {
                        vaVar.f13737m2 = g3Var2.f12566e.e0();
                        vaVar.f13741n2 = vaVar.N0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
