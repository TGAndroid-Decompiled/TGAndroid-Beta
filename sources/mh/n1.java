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
    public final int f14466a;
    public final NotificationCenter.NotificationCenterDelegate f14467b;

    public n1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f14466a = i10;
        this.f14467b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z4;
        int i10;
        qh.r rVar;
        float f10;
        switch (this.f14466a) {
            case 0:
                ((g5) this.f14467b).o2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                return;
            case 1:
                g5.u0((g5) this.f14467b, (ArrayList) obj, (Utilities.Callback2) obj2, (Runnable) obj3);
                return;
            default:
                qh.ba baVar = (qh.ba) this.f14467b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                if (baVar.f45048c0 == 0 && arrayList != null && !arrayList.isEmpty() && baVar.f45080m2 == null && !baVar.T && baVar.J()) {
                    baVar.E1 = null;
                    baVar.F1 = null;
                    baVar.G1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList.size() + baVar.f45116x0.getFilledCount() > baVar.f45116x0.getTotalCount()) {
                            int size = arrayList.size() + baVar.f45116x0.getFilledCount();
                            ArrayList a2 = qh.r.a();
                            int size2 = a2.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size2) {
                                    Object obj4 = a2.get(i11);
                                    i11++;
                                    rVar = (qh.r) obj4;
                                    if (rVar.f45974e.size() >= size) {
                                    }
                                } else {
                                    rVar = null;
                                }
                            }
                            if (rVar == null) {
                                baVar.f45116x0.o(null);
                                baVar.f45116x0.e();
                                baVar.F0.setSelected((qh.r) null);
                                qh.f9 f9Var = baVar.f45120y0;
                                if (f9Var != null) {
                                    f9Var.recordHevc = !baVar.f45116x0.j();
                                }
                                baVar.F0.a(false, true);
                                baVar.m0(true);
                                return;
                            }
                            qh.o9 o9Var = baVar.f45116x0;
                            baVar.f45112w0 = rVar;
                            o9Var.o(rVar);
                            baVar.F0.setSelected(rVar);
                            int indexOf = qh.r.a().indexOf(rVar);
                            if (indexOf >= 0) {
                                baVar.F0.f46149a.u0(indexOf);
                            }
                            qh.f9 f9Var2 = baVar.f45120y0;
                            if (f9Var2 != null) {
                                f9Var2.recordHevc = !baVar.f45116x0.j();
                            }
                            baVar.D0.setDrawable(new lc0(rVar, false));
                            baVar.c0(baVar.E0, baVar.F0.f46152e, true);
                            qh.q5 q5Var = baVar.L0;
                            if (baVar.f45116x0.j()) {
                                f10 = baVar.f45116x0.getFilledProgress();
                            } else {
                                f10 = 0.0f;
                            }
                            q5Var.e(f10, true);
                        }
                    }
                    baVar.I1 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList.size()) {
                            qh.r6 l10 = qh.r6.l((MediaController.PhotoEntry) arrayList.get(i12));
                            l10.M0 = (Bitmap) arrayList2.get(i12);
                            l10.J0 = baVar.f45099s0;
                            l10.K0 = baVar.f45102t0;
                            l10.A();
                            if (bool.booleanValue()) {
                                if (baVar.f45116x0.l(l10)) {
                                    baVar.H1 = qh.r6.a(baVar.f45116x0.getLayout(), baVar.f45116x0.getContent());
                                } else {
                                    i12++;
                                }
                            } else {
                                if (baVar.H1 == null) {
                                    baVar.H1 = l10;
                                } else {
                                    if (baVar.E1 == null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        baVar.E1 = arrayList3;
                                        arrayList3.add(baVar.H1);
                                    }
                                    if (baVar.E1.size() < 10) {
                                        baVar.E1.add(l10);
                                    }
                                }
                                i12++;
                            }
                        }
                    }
                    if (baVar.E1 != null) {
                        baVar.i0(false, true);
                        baVar.N0.a(baVar.L1);
                        qh.q5 q5Var2 = baVar.L0;
                        if (baVar.L1 == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        q5Var2.f45940k0 = -1.0f;
                        q5Var2.f45941l0 = z4;
                        q5Var2.invalidate();
                        baVar.F1 = new ArrayList();
                        baVar.G1 = new ArrayList();
                        for (int i13 = 0; i13 < baVar.E1.size(); i13 = yh.d(i13, i13, 1, baVar.G1)) {
                            baVar.F1.add(Integer.valueOf(i13));
                        }
                        baVar.f45116x0.n(null);
                        baVar.F0.a(false, true);
                        baVar.m0(true);
                        baVar.f(false);
                        baVar.K(1, true);
                        qh.t8 t8Var = baVar.f45042a1;
                        if (t8Var != null) {
                            org.telegram.ui.web.s0 s0Var = t8Var.h;
                            if (!t8Var.F && !t8Var.J && (i10 = MessagesController.getGlobalMainSettings().getInt("multistorieshint", 0)) < 3) {
                                MessagesController.getGlobalMainSettings().edit().putInt("multistorieshint", i10 + 1).apply();
                                AndroidUtilities.cancelRunOnUIThread(s0Var);
                                t8Var.F = true;
                                t8Var.invalidate();
                                AndroidUtilities.runOnUIThread(s0Var, 5500L);
                            }
                        }
                        qh.b9 b9Var = baVar.J0;
                        if (b9Var != null) {
                            baVar.f45070i2 = b9Var.f46393e.e0();
                            baVar.f45073j2 = baVar.J0.getSelectedAlbum();
                            return;
                        }
                        return;
                    }
                    qh.r6 r6Var = baVar.H1;
                    if (r6Var != null) {
                        r6Var.B();
                    }
                    baVar.F0.a(false, true);
                    baVar.m0(true);
                    baVar.f(false);
                    qh.b9 b9Var2 = baVar.J0;
                    if (b9Var2 != null) {
                        baVar.f45070i2 = b9Var2.f46393e.e0();
                        baVar.f45073j2 = baVar.J0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
