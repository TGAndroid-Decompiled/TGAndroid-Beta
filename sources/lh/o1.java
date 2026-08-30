package lh;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.yh;
public final class o1 implements Utilities.Callback3 {
    public final int f12867a;
    public final NotificationCenter.NotificationCenterDelegate f12868b;

    public o1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f12867a = i10;
        this.f12868b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z4;
        int i10;
        ph.r rVar;
        float f10;
        switch (this.f12867a) {
            case 0:
                ((g5) this.f12868b).o2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                return;
            case 1:
                g5.u0((g5) this.f12868b, (ArrayList) obj, (Utilities.Callback2) obj2, (Runnable) obj3);
                return;
            default:
                ph.da daVar = (ph.da) this.f12868b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                if (daVar.f41480c0 == 0 && arrayList != null && !arrayList.isEmpty() && daVar.f41511m2 == null && !daVar.T && daVar.J()) {
                    daVar.E1 = null;
                    daVar.F1 = null;
                    daVar.G1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList.size() + daVar.f41547x0.getFilledCount() > daVar.f41547x0.getTotalCount()) {
                            int size = arrayList.size() + daVar.f41547x0.getFilledCount();
                            ArrayList a2 = ph.r.a();
                            int size2 = a2.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size2) {
                                    Object obj4 = a2.get(i11);
                                    i11++;
                                    rVar = (ph.r) obj4;
                                    if (rVar.e.size() >= size) {
                                    }
                                } else {
                                    rVar = null;
                                }
                            }
                            if (rVar == null) {
                                daVar.f41547x0.o(null);
                                daVar.f41547x0.e();
                                daVar.F0.setSelected((ph.r) null);
                                ph.i9 i9Var = daVar.f41551y0;
                                if (i9Var != null) {
                                    i9Var.recordHevc = !daVar.f41547x0.j();
                                }
                                daVar.F0.a(false, true);
                                daVar.m0(true);
                                return;
                            }
                            ph.r9 r9Var = daVar.f41547x0;
                            daVar.f41543w0 = rVar;
                            r9Var.o(rVar);
                            daVar.F0.setSelected(rVar);
                            int indexOf = ph.r.a().indexOf(rVar);
                            if (indexOf >= 0) {
                                daVar.F0.f42375a.u0(indexOf);
                            }
                            ph.i9 i9Var2 = daVar.f41551y0;
                            if (i9Var2 != null) {
                                i9Var2.recordHevc = !daVar.f41547x0.j();
                            }
                            daVar.D0.setDrawable(new jc0(rVar, false));
                            daVar.c0(daVar.E0, daVar.F0.e, true);
                            ph.t5 t5Var = daVar.L0;
                            if (daVar.f41547x0.j()) {
                                f10 = daVar.f41547x0.getFilledProgress();
                            } else {
                                f10 = 0.0f;
                            }
                            t5Var.e(f10, true);
                        }
                    }
                    daVar.I1 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList.size()) {
                            ph.u6 l10 = ph.u6.l((MediaController.PhotoEntry) arrayList.get(i12));
                            l10.M0 = (Bitmap) arrayList2.get(i12);
                            l10.J0 = daVar.f41530s0;
                            l10.K0 = daVar.f41533t0;
                            l10.A();
                            if (bool.booleanValue()) {
                                if (daVar.f41547x0.l(l10)) {
                                    daVar.H1 = ph.u6.a(daVar.f41547x0.getLayout(), daVar.f41547x0.getContent());
                                } else {
                                    i12++;
                                }
                            } else {
                                if (daVar.H1 == null) {
                                    daVar.H1 = l10;
                                } else {
                                    if (daVar.E1 == null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        daVar.E1 = arrayList3;
                                        arrayList3.add(daVar.H1);
                                    }
                                    if (daVar.E1.size() < 10) {
                                        daVar.E1.add(l10);
                                    }
                                }
                                i12++;
                            }
                        }
                    }
                    if (daVar.E1 != null) {
                        daVar.i0(false, true);
                        daVar.N0.a(daVar.L1);
                        ph.t5 t5Var2 = daVar.L0;
                        if (daVar.L1 == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        t5Var2.f42346k0 = -1.0f;
                        t5Var2.f42347l0 = z4;
                        t5Var2.invalidate();
                        daVar.F1 = new ArrayList();
                        daVar.G1 = new ArrayList();
                        for (int i13 = 0; i13 < daVar.E1.size(); i13 = yh.e(i13, i13, 1, daVar.G1)) {
                            daVar.F1.add(Integer.valueOf(i13));
                        }
                        daVar.f41547x0.n(null);
                        daVar.F0.a(false, true);
                        daVar.m0(true);
                        daVar.f(false);
                        daVar.K(1, true);
                        ph.w8 w8Var = daVar.f41474a1;
                        if (w8Var != null) {
                            org.telegram.ui.web.o0 o0Var = w8Var.h;
                            if (!w8Var.F && !w8Var.J && (i10 = MessagesController.getGlobalMainSettings().getInt("multistorieshint", 0)) < 3) {
                                MessagesController.getGlobalMainSettings().edit().putInt("multistorieshint", i10 + 1).apply();
                                AndroidUtilities.cancelRunOnUIThread(o0Var);
                                w8Var.F = true;
                                w8Var.invalidate();
                                AndroidUtilities.runOnUIThread(o0Var, 5500L);
                            }
                        }
                        ph.e9 e9Var = daVar.J0;
                        if (e9Var != null) {
                            daVar.f41501i2 = e9Var.e.e0();
                            daVar.f41504j2 = daVar.J0.getSelectedAlbum();
                            return;
                        }
                        return;
                    }
                    ph.u6 u6Var = daVar.H1;
                    if (u6Var != null) {
                        u6Var.B();
                    }
                    daVar.F0.a(false, true);
                    daVar.m0(true);
                    daVar.f(false);
                    ph.e9 e9Var2 = daVar.J0;
                    if (e9Var2 != null) {
                        daVar.f41501i2 = e9Var2.e.e0();
                        daVar.f41504j2 = daVar.J0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
