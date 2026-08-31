package mh;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.yh;
public final class n1 implements Utilities.Callback3 {
    public final int f14464a;
    public final NotificationCenter.NotificationCenterDelegate f14465b;

    public n1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f14464a = i10;
        this.f14465b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z4;
        int i10;
        qh.r rVar;
        float f10;
        switch (this.f14464a) {
            case 0:
                ((g5) this.f14465b).o2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                return;
            case 1:
                g5.u0((g5) this.f14465b, (ArrayList) obj, (Utilities.Callback2) obj2, (Runnable) obj3);
                return;
            default:
                qh.ca caVar = (qh.ca) this.f14465b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                if (caVar.f45082c0 == 0 && arrayList != null && !arrayList.isEmpty() && caVar.f45114m2 == null && !caVar.T && caVar.J()) {
                    caVar.E1 = null;
                    caVar.F1 = null;
                    caVar.G1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList.size() + caVar.f45150x0.getFilledCount() > caVar.f45150x0.getTotalCount()) {
                            int size = arrayList.size() + caVar.f45150x0.getFilledCount();
                            ArrayList a2 = qh.r.a();
                            int size2 = a2.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size2) {
                                    Object obj4 = a2.get(i11);
                                    i11++;
                                    rVar = (qh.r) obj4;
                                    if (rVar.f45927e.size() >= size) {
                                    }
                                } else {
                                    rVar = null;
                                }
                            }
                            if (rVar == null) {
                                caVar.f45150x0.o(null);
                                caVar.f45150x0.e();
                                caVar.F0.setSelected((qh.r) null);
                                qh.g9 g9Var = caVar.f45154y0;
                                if (g9Var != null) {
                                    g9Var.recordHevc = !caVar.f45150x0.j();
                                }
                                caVar.F0.a(false, true);
                                caVar.m0(true);
                                return;
                            }
                            qh.p9 p9Var = caVar.f45150x0;
                            caVar.f45146w0 = rVar;
                            p9Var.o(rVar);
                            caVar.F0.setSelected(rVar);
                            int indexOf = qh.r.a().indexOf(rVar);
                            if (indexOf >= 0) {
                                caVar.F0.f46134a.u0(indexOf);
                            }
                            qh.g9 g9Var2 = caVar.f45154y0;
                            if (g9Var2 != null) {
                                g9Var2.recordHevc = !caVar.f45150x0.j();
                            }
                            caVar.D0.setDrawable(new lc0(rVar, false));
                            caVar.c0(caVar.E0, caVar.F0.f46137e, true);
                            qh.r5 r5Var = caVar.L0;
                            if (caVar.f45150x0.j()) {
                                f10 = caVar.f45150x0.getFilledProgress();
                            } else {
                                f10 = 0.0f;
                            }
                            r5Var.e(f10, true);
                        }
                    }
                    caVar.I1 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList.size()) {
                            qh.s6 l10 = qh.s6.l((MediaController.PhotoEntry) arrayList.get(i12));
                            l10.M0 = (Bitmap) arrayList2.get(i12);
                            l10.J0 = caVar.f45133s0;
                            l10.K0 = caVar.f45136t0;
                            l10.A();
                            if (bool.booleanValue()) {
                                if (caVar.f45150x0.l(l10)) {
                                    caVar.H1 = qh.s6.a(caVar.f45150x0.getLayout(), caVar.f45150x0.getContent());
                                } else {
                                    i12++;
                                }
                            } else {
                                if (caVar.H1 == null) {
                                    caVar.H1 = l10;
                                } else {
                                    if (caVar.E1 == null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        caVar.E1 = arrayList3;
                                        arrayList3.add(caVar.H1);
                                    }
                                    if (caVar.E1.size() < 10) {
                                        caVar.E1.add(l10);
                                    }
                                }
                                i12++;
                            }
                        }
                    }
                    if (caVar.E1 != null) {
                        caVar.i0(false, true);
                        caVar.N0.a(caVar.L1);
                        qh.r5 r5Var2 = caVar.L0;
                        if (caVar.L1 == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        r5Var2.f45961k0 = -1.0f;
                        r5Var2.f45962l0 = z4;
                        r5Var2.invalidate();
                        caVar.F1 = new ArrayList();
                        caVar.G1 = new ArrayList();
                        for (int i13 = 0; i13 < caVar.E1.size(); i13 = yh.d(i13, i13, 1, caVar.G1)) {
                            caVar.F1.add(Integer.valueOf(i13));
                        }
                        caVar.f45150x0.n(null);
                        caVar.F0.a(false, true);
                        caVar.m0(true);
                        caVar.f(false);
                        caVar.K(1, true);
                        qh.u8 u8Var = caVar.f45076a1;
                        if (u8Var != null) {
                            org.telegram.ui.web.s0 s0Var = u8Var.h;
                            if (!u8Var.F && !u8Var.J && (i10 = MessagesController.getGlobalMainSettings().getInt("multistorieshint", 0)) < 3) {
                                MessagesController.getGlobalMainSettings().edit().putInt("multistorieshint", i10 + 1).apply();
                                AndroidUtilities.cancelRunOnUIThread(s0Var);
                                u8Var.F = true;
                                u8Var.invalidate();
                                AndroidUtilities.runOnUIThread(s0Var, 5500L);
                            }
                        }
                        qh.c9 c9Var = caVar.J0;
                        if (c9Var != null) {
                            caVar.f45104i2 = c9Var.f44898e.e0();
                            caVar.f45107j2 = caVar.J0.getSelectedAlbum();
                            return;
                        }
                        return;
                    }
                    qh.s6 s6Var = caVar.H1;
                    if (s6Var != null) {
                        s6Var.B();
                    }
                    caVar.F0.a(false, true);
                    caVar.m0(true);
                    caVar.f(false);
                    qh.c9 c9Var2 = caVar.J0;
                    if (c9Var2 != null) {
                        caVar.f45104i2 = c9Var2.f44898e.e0();
                        caVar.f45107j2 = caVar.J0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
