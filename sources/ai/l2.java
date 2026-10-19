package ai;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class l2 implements Utilities.Callback3 {
    public final int f1684a;
    public final NotificationCenter.NotificationCenterDelegate f1685b;

    public l2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f1684a = i10;
        this.f1685b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z10;
        int i10;
        ei.t tVar;
        float f7;
        switch (this.f1684a) {
            case 0:
                ((l7) this.f1685b).S2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                return;
            case 1:
                l7.j0((l7) this.f1685b, (ArrayList) obj, (Utilities.Callback2) obj2, (Runnable) obj3);
                return;
            default:
                ei.vb vbVar = (ei.vb) this.f1685b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                if (vbVar.f9965f0 == 0 && arrayList != null && !arrayList.isEmpty() && vbVar.f9996p2 == null && !vbVar.W && vbVar.I()) {
                    vbVar.H1 = null;
                    vbVar.I1 = null;
                    vbVar.J1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList.size() + vbVar.A0.getFilledCount() > vbVar.A0.getTotalCount()) {
                            int size = arrayList.size() + vbVar.A0.getFilledCount();
                            ArrayList a2 = ei.t.a();
                            int size2 = a2.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size2) {
                                    Object obj4 = a2.get(i11);
                                    i11++;
                                    tVar = (ei.t) obj4;
                                    if (tVar.e.size() >= size) {
                                    }
                                } else {
                                    tVar = null;
                                }
                            }
                            if (tVar == null) {
                                vbVar.A0.o(null);
                                vbVar.A0.e();
                                vbVar.I0.setSelected((ei.t) null);
                                ei.ya yaVar = vbVar.B0;
                                if (yaVar != null) {
                                    yaVar.recordHevc = !vbVar.A0.j();
                                }
                                vbVar.I0.a(false, true);
                                vbVar.l0(true);
                                return;
                            }
                            ei.ib ibVar = vbVar.A0;
                            vbVar.f10029z0 = tVar;
                            ibVar.o(tVar);
                            vbVar.I0.setSelected(tVar);
                            int indexOf = ei.t.a().indexOf(tVar);
                            if (indexOf >= 0) {
                                vbVar.I0.f10119a.u0(indexOf);
                            }
                            ei.ya yaVar2 = vbVar.B0;
                            if (yaVar2 != null) {
                                yaVar2.recordHevc = !vbVar.A0.j();
                            }
                            vbVar.G0.setDrawable(new ei.u(tVar, false));
                            vbVar.b0(vbVar.H0, vbVar.I0.e, true);
                            ei.z6 z6Var = vbVar.O0;
                            if (vbVar.A0.j()) {
                                f7 = vbVar.A0.getFilledProgress();
                            } else {
                                f7 = 0.0f;
                            }
                            z6Var.e(f7, true);
                        }
                    }
                    vbVar.L1 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList.size()) {
                            ei.a8 l4 = ei.a8.l((MediaController.PhotoEntry) arrayList.get(i12));
                            l4.M0 = (Bitmap) arrayList2.get(i12);
                            l4.J0 = vbVar.f10014v0;
                            l4.K0 = vbVar.f10018w0;
                            l4.A();
                            if (bool.booleanValue()) {
                                if (vbVar.A0.l(l4)) {
                                    vbVar.K1 = ei.a8.a(vbVar.A0.getLayout(), vbVar.A0.getContent());
                                } else {
                                    i12++;
                                }
                            } else {
                                if (vbVar.K1 == null) {
                                    vbVar.K1 = l4;
                                } else {
                                    if (vbVar.H1 == null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        vbVar.H1 = arrayList3;
                                        arrayList3.add(vbVar.K1);
                                    }
                                    if (vbVar.H1.size() < 10) {
                                        vbVar.H1.add(l4);
                                    }
                                }
                                i12++;
                            }
                        }
                    }
                    if (vbVar.H1 != null) {
                        vbVar.h0(false, true);
                        vbVar.Q0.a(vbVar.O1);
                        ei.z6 z6Var2 = vbVar.O0;
                        if (vbVar.O1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z6Var2.f10222n0 = -1.0f;
                        z6Var2.f10223o0 = z10;
                        z6Var2.invalidate();
                        vbVar.I1 = new ArrayList();
                        vbVar.J1 = new ArrayList();
                        for (int i13 = 0; i13 < vbVar.H1.size(); i13 = com.google.android.gms.internal.play_billing.k3.f(i13, i13, 1, vbVar.J1)) {
                            vbVar.I1.add(Integer.valueOf(i13));
                        }
                        vbVar.A0.n(null);
                        vbVar.I0.a(false, true);
                        vbVar.l0(true);
                        vbVar.e(false);
                        vbVar.J(1, true);
                        ei.ma maVar = vbVar.f9959d1;
                        if (maVar != null) {
                            com.google.firebase.messaging.s sVar = maVar.h;
                            if (!maVar.I && !maVar.M && (i10 = MessagesController.getGlobalMainSettings().getInt("multistorieshint", 0)) < 3) {
                                MessagesController.getGlobalMainSettings().edit().putInt("multistorieshint", i10 + 1).apply();
                                AndroidUtilities.cancelRunOnUIThread(sVar);
                                maVar.I = true;
                                maVar.invalidate();
                                AndroidUtilities.runOnUIThread(sVar, 5500L);
                            }
                        }
                        ei.ua uaVar = vbVar.M0;
                        if (uaVar != null) {
                            vbVar.f9984l2 = uaVar.e.e0();
                            vbVar.f9986m2 = vbVar.M0.getSelectedAlbum();
                            return;
                        }
                        return;
                    }
                    ei.a8 a8Var = vbVar.K1;
                    if (a8Var != null) {
                        a8Var.B();
                    }
                    vbVar.I0.a(false, true);
                    vbVar.l0(true);
                    vbVar.e(false);
                    ei.ua uaVar2 = vbVar.M0;
                    if (uaVar2 != null) {
                        vbVar.f9984l2 = uaVar2.e.e0();
                        vbVar.f9986m2 = vbVar.M0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
