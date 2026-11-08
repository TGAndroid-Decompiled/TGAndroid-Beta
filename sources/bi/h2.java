package bi;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.gf;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class h2 implements x10 {
    public final int f3986a;
    public final ls f3987b;

    public h2(ls lsVar, int i7) {
        this.f3986a = i7;
        this.f3987b = lsVar;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        boolean z9;
        int i7;
        fi.t tVar;
        float f10;
        switch (this.f3986a) {
            case 0:
                ((k7) this.f3987b).p2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                return;
            case 1:
                k7 k7Var = (k7) this.f3987b;
                ArrayList arrayList = (ArrayList) obj;
                v10 v10Var = (v10) obj2;
                Runnable runnable = (Runnable) obj3;
                zh.j3 j3Var = k7Var.O2;
                if (j3Var != null) {
                    j3Var.b();
                    k7Var.O2 = null;
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
                ConnectionsManager.getInstance(k7Var.f28616a).sendRequestTyped(craftstargift, new d3.b(1), new q2(k7Var, v10Var, arrayList, runnable, 0));
                return;
            default:
                fi.va vaVar = (fi.va) this.f3987b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj3;
                if (vaVar.f12953f0 == 0 && arrayList2 != null && !arrayList2.isEmpty() && vaVar.f12983p2 == null && !vaVar.W && vaVar.I()) {
                    vaVar.H1 = null;
                    vaVar.I1 = null;
                    vaVar.J1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList2.size() + vaVar.A0.getFilledCount() > vaVar.A0.getTotalCount()) {
                            int size2 = arrayList2.size() + vaVar.A0.getFilledCount();
                            ArrayList a10 = fi.t.a();
                            int size3 = a10.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size3) {
                                    Object obj5 = a10.get(i11);
                                    i11++;
                                    tVar = (fi.t) obj5;
                                    if (tVar.f12828e.size() >= size2) {
                                    }
                                } else {
                                    tVar = null;
                                }
                            }
                            if (tVar == null) {
                                vaVar.A0.o(null);
                                vaVar.A0.c();
                                vaVar.I0.setSelected((fi.t) null);
                                fi.y9 y9Var = vaVar.B0;
                                if (y9Var != null) {
                                    y9Var.recordHevc = !vaVar.A0.j();
                                }
                                vaVar.I0.a(false, true);
                                vaVar.l0(true);
                                return;
                            }
                            fi.ia iaVar = vaVar.A0;
                            vaVar.f13016z0 = tVar;
                            iaVar.o(tVar);
                            vaVar.I0.setSelected(tVar);
                            int indexOf = fi.t.a().indexOf(tVar);
                            if (indexOf >= 0) {
                                vaVar.I0.f13105a.v0(indexOf);
                            }
                            fi.y9 y9Var2 = vaVar.B0;
                            if (y9Var2 != null) {
                                y9Var2.recordHevc = !vaVar.A0.j();
                            }
                            vaVar.G0.setDrawable(new fi.u(tVar, false));
                            vaVar.b0(vaVar.H0, vaVar.I0.f13108e, true);
                            fi.g6 g6Var = vaVar.O0;
                            if (vaVar.A0.j()) {
                                f10 = vaVar.A0.getFilledProgress();
                            } else {
                                f10 = 0.0f;
                            }
                            g6Var.e(true, f10);
                        }
                    }
                    vaVar.L1 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList2.size()) {
                            fi.e7 l10 = fi.e7.l((gf) arrayList2.get(i12));
                            l10.M0 = (Bitmap) arrayList3.get(i12);
                            l10.J0 = vaVar.f13001v0;
                            l10.K0 = vaVar.f13005w0;
                            l10.A();
                            if (bool.booleanValue()) {
                                if (vaVar.A0.l(l10)) {
                                    vaVar.K1 = fi.e7.a(vaVar.A0.getLayout(), vaVar.A0.getContent());
                                } else {
                                    i12++;
                                }
                            } else {
                                if (vaVar.K1 == null) {
                                    vaVar.K1 = l10;
                                } else {
                                    if (vaVar.H1 == null) {
                                        ArrayList arrayList4 = new ArrayList();
                                        vaVar.H1 = arrayList4;
                                        arrayList4.add(vaVar.K1);
                                    }
                                    if (vaVar.H1.size() < 10) {
                                        vaVar.H1.add(l10);
                                    }
                                }
                                i12++;
                            }
                        }
                    }
                    if (vaVar.H1 != null) {
                        vaVar.h0(false, true);
                        vaVar.Q0.a(vaVar.O1);
                        fi.g6 g6Var2 = vaVar.O0;
                        if (vaVar.O1 == 1) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        g6Var2.f12089n0 = -1.0f;
                        g6Var2.f12090o0 = z9;
                        g6Var2.invalidate();
                        vaVar.I1 = new ArrayList();
                        vaVar.J1 = new ArrayList();
                        for (int i13 = 0; i13 < vaVar.H1.size(); i13 = com.google.android.recaptcha.internal.a.f(i13, i13, 1, vaVar.J1)) {
                            vaVar.I1.add(Integer.valueOf(i13));
                        }
                        vaVar.A0.n(null);
                        vaVar.I0.a(false, true);
                        vaVar.l0(true);
                        vaVar.e(false);
                        vaVar.J(1, true);
                        fi.o9 o9Var = vaVar.f12947d1;
                        if (o9Var != null) {
                            di.s7 s7Var = o9Var.h;
                            if (!o9Var.I && !o9Var.M && (i7 = qp.e1().getInt("multistorieshint", 0)) < 3) {
                                qp.e1().edit().putInt("multistorieshint", i7 + 1).apply();
                                org.telegram.messenger.g0.r(s7Var);
                                o9Var.I = true;
                                o9Var.invalidate();
                                org.telegram.messenger.g0.i3(s7Var, 5500L);
                            }
                        }
                        fi.i3 i3Var = vaVar.M0;
                        if (i3Var != null) {
                            vaVar.f12972l2 = i3Var.f11963e.e0();
                            vaVar.f12974m2 = vaVar.M0.getSelectedAlbum();
                            return;
                        }
                        return;
                    }
                    fi.e7 e7Var = vaVar.K1;
                    if (e7Var != null) {
                        e7Var.B();
                    }
                    vaVar.I0.a(false, true);
                    vaVar.l0(true);
                    vaVar.e(false);
                    fi.i3 i3Var2 = vaVar.M0;
                    if (i3Var2 != null) {
                        vaVar.f12972l2 = i3Var2.f11963e.e0();
                        vaVar.f12974m2 = vaVar.M0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
