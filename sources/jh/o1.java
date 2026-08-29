package jh;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import nh.gb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.th;
public final class o1 implements Utilities.Callback3 {
    public final int f12533a;
    public final NotificationCenter.NotificationCenterDelegate f12534b;

    public o1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f12533a = i10;
        this.f12534b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z10;
        int i10;
        nh.t tVar;
        float f9;
        switch (this.f12533a) {
            case 0:
                ((h5) this.f12534b).o2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                return;
            case 1:
                h5.u0((h5) this.f12534b, (ArrayList) obj, (Utilities.Callback2) obj2, (Runnable) obj3);
                return;
            default:
                gb gbVar = (gb) this.f12534b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                if (gbVar.f17740b0 == 0 && arrayList != null && !arrayList.isEmpty() && gbVar.f17774l2 == null && !gbVar.S && gbVar.J()) {
                    gbVar.D1 = null;
                    gbVar.E1 = null;
                    gbVar.F1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList.size() + gbVar.f17808w0.getFilledCount() > gbVar.f17808w0.getTotalCount()) {
                            int size = arrayList.size() + gbVar.f17808w0.getFilledCount();
                            ArrayList a2 = nh.t.a();
                            int size2 = a2.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size2) {
                                    Object obj4 = a2.get(i11);
                                    i11++;
                                    tVar = (nh.t) obj4;
                                    if (tVar.f18567e.size() >= size) {
                                    }
                                } else {
                                    tVar = null;
                                }
                            }
                            if (tVar == null) {
                                gbVar.f17808w0.o(null);
                                gbVar.f17808w0.e();
                                gbVar.E0.setSelected((nh.t) null);
                                nh.ka kaVar = gbVar.f17812x0;
                                if (kaVar != null) {
                                    kaVar.recordHevc = !gbVar.f17808w0.j();
                                }
                                gbVar.E0.a(false, true);
                                gbVar.m0(true);
                                return;
                            }
                            nh.ua uaVar = gbVar.f17808w0;
                            gbVar.f17804v0 = tVar;
                            uaVar.o(tVar);
                            gbVar.E0.setSelected(tVar);
                            int indexOf = nh.t.a().indexOf(tVar);
                            if (indexOf >= 0) {
                                gbVar.E0.f18845a.u0(indexOf);
                            }
                            nh.ka kaVar2 = gbVar.f17812x0;
                            if (kaVar2 != null) {
                                kaVar2.recordHevc = !gbVar.f17808w0.j();
                            }
                            gbVar.C0.setDrawable(new nh.u(tVar, false));
                            gbVar.c0(gbVar.D0, gbVar.E0.f18848e, true);
                            nh.o6 o6Var = gbVar.K0;
                            if (gbVar.f17808w0.j()) {
                                f9 = gbVar.f17808w0.getFilledProgress();
                            } else {
                                f9 = 0.0f;
                            }
                            o6Var.e(f9, true);
                        }
                    }
                    gbVar.H1 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList.size()) {
                            nh.o7 l10 = nh.o7.l((MediaController.PhotoEntry) arrayList.get(i12));
                            l10.M0 = (Bitmap) arrayList2.get(i12);
                            l10.J0 = gbVar.f17791r0;
                            l10.K0 = gbVar.f17795s0;
                            l10.A();
                            if (bool.booleanValue()) {
                                if (gbVar.f17808w0.l(l10)) {
                                    gbVar.G1 = nh.o7.a(gbVar.f17808w0.getLayout(), gbVar.f17808w0.getContent());
                                } else {
                                    i12++;
                                }
                            } else {
                                if (gbVar.G1 == null) {
                                    gbVar.G1 = l10;
                                } else {
                                    if (gbVar.D1 == null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        gbVar.D1 = arrayList3;
                                        arrayList3.add(gbVar.G1);
                                    }
                                    if (gbVar.D1.size() < 10) {
                                        gbVar.D1.add(l10);
                                    }
                                }
                                i12++;
                            }
                        }
                    }
                    if (gbVar.D1 != null) {
                        gbVar.i0(false, true);
                        gbVar.M0.a(gbVar.K1);
                        nh.o6 o6Var2 = gbVar.K0;
                        if (gbVar.K1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        o6Var2.f18232j0 = -1.0f;
                        o6Var2.f18233k0 = z10;
                        o6Var2.invalidate();
                        gbVar.E1 = new ArrayList();
                        gbVar.F1 = new ArrayList();
                        for (int i13 = 0; i13 < gbVar.D1.size(); i13 = th.d(i13, i13, 1, gbVar.F1)) {
                            gbVar.E1.add(Integer.valueOf(i13));
                        }
                        gbVar.f17808w0.n(null);
                        gbVar.E0.a(false, true);
                        gbVar.m0(true);
                        gbVar.f(false);
                        gbVar.K(1, true);
                        nh.y9 y9Var = gbVar.Z0;
                        if (y9Var != null) {
                            lh.m5 m5Var = y9Var.h;
                            if (!y9Var.E && !y9Var.I && (i10 = MessagesController.getGlobalMainSettings().getInt("multistorieshint", 0)) < 3) {
                                MessagesController.getGlobalMainSettings().edit().putInt("multistorieshint", i10 + 1).apply();
                                AndroidUtilities.cancelRunOnUIThread(m5Var);
                                y9Var.E = true;
                                y9Var.invalidate();
                                AndroidUtilities.runOnUIThread(m5Var, 5500L);
                            }
                        }
                        nh.ga gaVar = gbVar.I0;
                        if (gaVar != null) {
                            gbVar.f17763h2 = gaVar.f18174e.e0();
                            gbVar.f17766i2 = gbVar.I0.getSelectedAlbum();
                            return;
                        }
                        return;
                    }
                    nh.o7 o7Var = gbVar.G1;
                    if (o7Var != null) {
                        o7Var.B();
                    }
                    gbVar.E0.a(false, true);
                    gbVar.m0(true);
                    gbVar.f(false);
                    nh.ga gaVar2 = gbVar.I0;
                    if (gaVar2 != null) {
                        gbVar.f17763h2 = gaVar2.f18174e.e0();
                        gbVar.f17766i2 = gbVar.I0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
