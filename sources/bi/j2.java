package bi;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class j2 implements Utilities.Callback3 {
    public final int f4862a;
    public final NotificationCenter.NotificationCenterDelegate f4863b;

    public j2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f4862a = i10;
        this.f4863b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z10;
        int i10;
        fi.t tVar;
        float f7;
        switch (this.f4862a) {
            case 0:
                ((h7) this.f4863b).R2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                return;
            case 1:
                h7.i0((h7) this.f4863b, (ArrayList) obj, (Utilities.Callback2) obj2, (Runnable) obj3);
                return;
            default:
                fi.sb sbVar = (fi.sb) this.f4863b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                if (sbVar.f11623f0 == 0 && arrayList != null && !arrayList.isEmpty() && sbVar.f11654p2 == null && !sbVar.W && sbVar.I()) {
                    sbVar.H1 = null;
                    sbVar.I1 = null;
                    sbVar.J1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList.size() + sbVar.A0.getFilledCount() > sbVar.A0.getTotalCount()) {
                            int size = arrayList.size() + sbVar.A0.getFilledCount();
                            ArrayList a2 = fi.t.a();
                            int size2 = a2.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size2) {
                                    Object obj4 = a2.get(i11);
                                    i11++;
                                    tVar = (fi.t) obj4;
                                    if (tVar.e.size() >= size) {
                                    }
                                } else {
                                    tVar = null;
                                }
                            }
                            if (tVar == null) {
                                sbVar.A0.o(null);
                                sbVar.A0.e();
                                sbVar.I0.setSelected((fi.t) null);
                                fi.va vaVar = sbVar.B0;
                                if (vaVar != null) {
                                    vaVar.recordHevc = !sbVar.A0.j();
                                }
                                sbVar.I0.a(false, true);
                                sbVar.l0(true);
                                return;
                            }
                            fi.fb fbVar = sbVar.A0;
                            sbVar.f11687z0 = tVar;
                            fbVar.o(tVar);
                            sbVar.I0.setSelected(tVar);
                            int indexOf = fi.t.a().indexOf(tVar);
                            if (indexOf >= 0) {
                                sbVar.I0.f11977a.v0(indexOf);
                            }
                            fi.va vaVar2 = sbVar.B0;
                            if (vaVar2 != null) {
                                vaVar2.recordHevc = !sbVar.A0.j();
                            }
                            sbVar.G0.setDrawable(new fi.u(tVar, false));
                            sbVar.b0(sbVar.H0, sbVar.I0.e, true);
                            fi.w6 w6Var = sbVar.O0;
                            if (sbVar.A0.j()) {
                                f7 = sbVar.A0.getFilledProgress();
                            } else {
                                f7 = 0.0f;
                            }
                            w6Var.e(f7, true);
                        }
                    }
                    sbVar.L1 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList.size()) {
                            fi.w7 l4 = fi.w7.l((MediaController.PhotoEntry) arrayList.get(i12));
                            l4.M0 = (Bitmap) arrayList2.get(i12);
                            l4.J0 = sbVar.f11672v0;
                            l4.K0 = sbVar.f11676w0;
                            l4.A();
                            if (bool.booleanValue()) {
                                if (sbVar.A0.l(l4)) {
                                    sbVar.K1 = fi.w7.a(sbVar.A0.getLayout(), sbVar.A0.getContent());
                                } else {
                                    i12++;
                                }
                            } else {
                                if (sbVar.K1 == null) {
                                    sbVar.K1 = l4;
                                } else {
                                    if (sbVar.H1 == null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        sbVar.H1 = arrayList3;
                                        arrayList3.add(sbVar.K1);
                                    }
                                    if (sbVar.H1.size() < 10) {
                                        sbVar.H1.add(l4);
                                    }
                                }
                                i12++;
                            }
                        }
                    }
                    if (sbVar.H1 != null) {
                        sbVar.h0(false, true);
                        sbVar.Q0.a(sbVar.O1);
                        fi.w6 w6Var2 = sbVar.O0;
                        if (sbVar.O1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        w6Var2.f11870n0 = -1.0f;
                        w6Var2.f11871o0 = z10;
                        w6Var2.invalidate();
                        sbVar.I1 = new ArrayList();
                        sbVar.J1 = new ArrayList();
                        for (int i13 = 0; i13 < sbVar.H1.size(); i13 = c3.h0.i(i13, i13, 1, sbVar.J1)) {
                            sbVar.I1.add(Integer.valueOf(i13));
                        }
                        sbVar.A0.n(null);
                        sbVar.I0.a(false, true);
                        sbVar.l0(true);
                        sbVar.e(false);
                        sbVar.J(1, true);
                        fi.ia iaVar = sbVar.f11617d1;
                        if (iaVar != null) {
                            di.s8 s8Var = iaVar.h;
                            if (!iaVar.I && !iaVar.M && (i10 = MessagesController.getGlobalMainSettings().getInt("multistorieshint", 0)) < 3) {
                                MessagesController.getGlobalMainSettings().edit().putInt("multistorieshint", i10 + 1).apply();
                                AndroidUtilities.cancelRunOnUIThread(s8Var);
                                iaVar.I = true;
                                iaVar.invalidate();
                                AndroidUtilities.runOnUIThread(s8Var, 5500L);
                            }
                        }
                        fi.qa qaVar = sbVar.M0;
                        if (qaVar != null) {
                            sbVar.f11642l2 = qaVar.e.e0();
                            sbVar.f11644m2 = sbVar.M0.getSelectedAlbum();
                            return;
                        }
                        return;
                    }
                    fi.w7 w7Var = sbVar.K1;
                    if (w7Var != null) {
                        w7Var.B();
                    }
                    sbVar.I0.a(false, true);
                    sbVar.l0(true);
                    sbVar.e(false);
                    fi.qa qaVar2 = sbVar.M0;
                    if (qaVar2 != null) {
                        sbVar.f11642l2 = qaVar2.e.e0();
                        sbVar.f11644m2 = sbVar.M0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
