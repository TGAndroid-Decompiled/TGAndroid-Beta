package hh;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import lh.sb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;

public final class q1 implements Utilities.Callback3 {

    public final int f9893a;

    public final NotificationCenter.NotificationCenterDelegate f9894b;

    public q1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f9893a = i10;
        this.f9894b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        lh.z7 z7Var;
        lh.sa saVar;
        boolean z10;
        int iF;
        lh.ka kaVar;
        lh.sa saVar2;
        kh.c cVar;
        int i10;
        lh.u uVar;
        int iIndexOf;
        lh.wa waVar;
        float filledProgress;
        lh.wa waVar2;
        switch (this.f9893a) {
            case 0:
                ((i5) this.f9894b).o2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                break;
            case 1:
                i5.u0((i5) this.f9894b, (ArrayList) obj, (Utilities.Callback2) obj2, (Runnable) obj3);
                break;
            default:
                sb sbVar = (sb) this.f9894b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                if (sbVar.f16746b0 == 0 && arrayList != null && !arrayList.isEmpty() && sbVar.f16780l2 == null && !sbVar.S && sbVar.J()) {
                    sbVar.D1 = null;
                    sbVar.E1 = null;
                    sbVar.F1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList.size() + sbVar.f16814w0.getFilledCount() > sbVar.f16814w0.getTotalCount()) {
                            int size = arrayList.size() + sbVar.f16814w0.getFilledCount();
                            ArrayList arrayListA = lh.u.a();
                            int size2 = arrayListA.size();
                            int i11 = 0;
                            do {
                                if (i11 < size2) {
                                    Object obj4 = arrayListA.get(i11);
                                    i11++;
                                    uVar = (lh.u) obj4;
                                } else {
                                    uVar = null;
                                }
                                if (uVar == null) {
                                    sbVar.f16814w0.o(null);
                                    sbVar.f16814w0.e();
                                    sbVar.E0.setSelected((lh.u) null);
                                    waVar2 = sbVar.f16818x0;
                                    if (waVar2 != null) {
                                        waVar2.recordHevc = !sbVar.f16814w0.j();
                                    }
                                    sbVar.E0.a(false, true);
                                    sbVar.m0(true);
                                } else {
                                    lh.gb gbVar = sbVar.f16814w0;
                                    sbVar.f16810v0 = uVar;
                                    gbVar.o(uVar);
                                    sbVar.E0.setSelected(uVar);
                                    iIndexOf = lh.u.a().indexOf(uVar);
                                    if (iIndexOf >= 0) {
                                        sbVar.E0.f17134a.u0(iIndexOf);
                                    }
                                    waVar = sbVar.f16818x0;
                                    if (waVar != null) {
                                        waVar.recordHevc = !sbVar.f16814w0.j();
                                    }
                                    sbVar.C0.setDrawable(new lh.v(uVar, false));
                                    sbVar.c0(sbVar.D0, sbVar.E0.f17137e, true);
                                    lh.y6 y6Var = sbVar.K0;
                                    if (sbVar.f16814w0.j()) {
                                        filledProgress = sbVar.f16814w0.getFilledProgress();
                                    } else {
                                        filledProgress = 0.0f;
                                    }
                                    y6Var.e(filledProgress, true);
                                }
                                break;
                            } while (uVar.f16885e.size() < size);
                            if (uVar == null) {
                                sbVar.f16814w0.o(null);
                                sbVar.f16814w0.e();
                                sbVar.E0.setSelected((lh.u) null);
                                waVar2 = sbVar.f16818x0;
                                if (waVar2 != null) {
                                    waVar2.recordHevc = !sbVar.f16814w0.j();
                                }
                                sbVar.E0.a(false, true);
                                sbVar.m0(true);
                            } else {
                                lh.gb gbVar2 = sbVar.f16814w0;
                                sbVar.f16810v0 = uVar;
                                gbVar2.o(uVar);
                                sbVar.E0.setSelected(uVar);
                                iIndexOf = lh.u.a().indexOf(uVar);
                                if (iIndexOf >= 0) {
                                    sbVar.E0.f17134a.u0(iIndexOf);
                                }
                                waVar = sbVar.f16818x0;
                                if (waVar != null) {
                                    waVar.recordHevc = !sbVar.f16814w0.j();
                                }
                                sbVar.C0.setDrawable(new lh.v(uVar, false));
                                sbVar.c0(sbVar.D0, sbVar.E0.f17137e, true);
                                lh.y6 y6Var2 = sbVar.K0;
                                if (sbVar.f16814w0.j()) {
                                    filledProgress = sbVar.f16814w0.getFilledProgress();
                                } else {
                                    filledProgress = 0.0f;
                                }
                                y6Var2.e(filledProgress, true);
                            }
                        }
                    }
                    sbVar.H1 = true;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        lh.z7 z7VarL = lh.z7.l((MediaController.PhotoEntry) arrayList.get(i12));
                        z7VarL.M0 = (Bitmap) arrayList2.get(i12);
                        z7VarL.J0 = sbVar.f16797r0;
                        z7VarL.K0 = sbVar.f16801s0;
                        z7VarL.A();
                        if (!bool.booleanValue()) {
                            if (sbVar.G1 != null) {
                                if (sbVar.D1 == null) {
                                    ArrayList arrayList3 = new ArrayList();
                                    sbVar.D1 = arrayList3;
                                    arrayList3.add(sbVar.G1);
                                }
                                if (sbVar.D1.size() < 10) {
                                    sbVar.D1.add(z7VarL);
                                } else if (sbVar.D1 != null) {
                                    sbVar.i0(false, true);
                                    sbVar.M0.a(sbVar.K1);
                                    lh.y6 y6Var3 = sbVar.K0;
                                    if (sbVar.K1 == 1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    y6Var3.f17098j0 = -1.0f;
                                    y6Var3.f17099k0 = z10;
                                    y6Var3.invalidate();
                                    sbVar.E1 = new ArrayList();
                                    sbVar.F1 = new ArrayList();
                                    for (iF = 0; iF < sbVar.D1.size(); iF = i0.a.f(iF, iF, 1, sbVar.F1)) {
                                        sbVar.E1.add(Integer.valueOf(iF));
                                    }
                                    sbVar.f16814w0.n(null);
                                    sbVar.E0.a(false, true);
                                    sbVar.m0(true);
                                    sbVar.f(false);
                                    sbVar.K(1, true);
                                    kaVar = sbVar.Z0;
                                    if (kaVar != null) {
                                        cVar = kaVar.h;
                                        if (!kaVar.E) {
                                            MessagesController.getGlobalMainSettings().edit().putInt("multistorieshint", i10 + 1).apply();
                                            AndroidUtilities.cancelRunOnUIThread(cVar);
                                            kaVar.E = true;
                                            kaVar.invalidate();
                                            AndroidUtilities.runOnUIThread(cVar, 5500L);
                                        }
                                    }
                                    saVar2 = sbVar.I0;
                                    if (saVar2 != null) {
                                        sbVar.f16769h2 = saVar2.f16514e.e0();
                                        sbVar.f16772i2 = sbVar.I0.getSelectedAlbum();
                                    }
                                } else {
                                    z7Var = sbVar.G1;
                                    if (z7Var != null) {
                                        z7Var.B();
                                    }
                                    sbVar.E0.a(false, true);
                                    sbVar.m0(true);
                                    sbVar.f(false);
                                    saVar = sbVar.I0;
                                    if (saVar != null) {
                                        sbVar.f16769h2 = saVar.f16514e.e0();
                                        sbVar.f16772i2 = sbVar.I0.getSelectedAlbum();
                                    }
                                }
                            } else {
                                sbVar.G1 = z7VarL;
                            }
                            break;
                        } else if (sbVar.f16814w0.l(z7VarL)) {
                            sbVar.G1 = lh.z7.a(sbVar.f16814w0.getLayout(), sbVar.f16814w0.getContent());
                            if (sbVar.D1 != null) {
                                sbVar.i0(false, true);
                                sbVar.M0.a(sbVar.K1);
                                lh.y6 y6Var4 = sbVar.K0;
                                if (sbVar.K1 == 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                y6Var4.f17098j0 = -1.0f;
                                y6Var4.f17099k0 = z10;
                                y6Var4.invalidate();
                                sbVar.E1 = new ArrayList();
                                sbVar.F1 = new ArrayList();
                                while (iF < sbVar.D1.size()) {
                                    sbVar.E1.add(Integer.valueOf(iF));
                                }
                                sbVar.f16814w0.n(null);
                                sbVar.E0.a(false, true);
                                sbVar.m0(true);
                                sbVar.f(false);
                                sbVar.K(1, true);
                                kaVar = sbVar.Z0;
                                if (kaVar != null) {
                                    cVar = kaVar.h;
                                    if (!kaVar.E && !kaVar.I && (i10 = MessagesController.getGlobalMainSettings().getInt("multistorieshint", 0)) < 3) {
                                        MessagesController.getGlobalMainSettings().edit().putInt("multistorieshint", i10 + 1).apply();
                                        AndroidUtilities.cancelRunOnUIThread(cVar);
                                        kaVar.E = true;
                                        kaVar.invalidate();
                                        AndroidUtilities.runOnUIThread(cVar, 5500L);
                                    }
                                }
                                saVar2 = sbVar.I0;
                                if (saVar2 != null) {
                                    sbVar.f16769h2 = saVar2.f16514e.e0();
                                    sbVar.f16772i2 = sbVar.I0.getSelectedAlbum();
                                }
                            } else {
                                z7Var = sbVar.G1;
                                if (z7Var != null) {
                                    z7Var.B();
                                }
                                sbVar.E0.a(false, true);
                                sbVar.m0(true);
                                sbVar.f(false);
                                saVar = sbVar.I0;
                                if (saVar != null) {
                                    sbVar.f16769h2 = saVar.f16514e.e0();
                                    sbVar.f16772i2 = sbVar.I0.getSelectedAlbum();
                                }
                            }
                        }
                        break;
                    }
                    if (sbVar.D1 != null) {
                        sbVar.i0(false, true);
                        sbVar.M0.a(sbVar.K1);
                        lh.y6 y6Var5 = sbVar.K0;
                        if (sbVar.K1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        y6Var5.f17098j0 = -1.0f;
                        y6Var5.f17099k0 = z10;
                        y6Var5.invalidate();
                        sbVar.E1 = new ArrayList();
                        sbVar.F1 = new ArrayList();
                        while (iF < sbVar.D1.size()) {
                            sbVar.E1.add(Integer.valueOf(iF));
                        }
                        sbVar.f16814w0.n(null);
                        sbVar.E0.a(false, true);
                        sbVar.m0(true);
                        sbVar.f(false);
                        sbVar.K(1, true);
                        kaVar = sbVar.Z0;
                        if (kaVar != null) {
                            cVar = kaVar.h;
                            if (!kaVar.E) {
                                MessagesController.getGlobalMainSettings().edit().putInt("multistorieshint", i10 + 1).apply();
                                AndroidUtilities.cancelRunOnUIThread(cVar);
                                kaVar.E = true;
                                kaVar.invalidate();
                                AndroidUtilities.runOnUIThread(cVar, 5500L);
                            }
                        }
                        saVar2 = sbVar.I0;
                        if (saVar2 != null) {
                            sbVar.f16769h2 = saVar2.f16514e.e0();
                            sbVar.f16772i2 = sbVar.I0.getSelectedAlbum();
                        }
                    } else {
                        z7Var = sbVar.G1;
                        if (z7Var != null) {
                            z7Var.B();
                        }
                        sbVar.E0.a(false, true);
                        sbVar.m0(true);
                        sbVar.f(false);
                        saVar = sbVar.I0;
                        if (saVar != null) {
                            sbVar.f16769h2 = saVar.f16514e.e0();
                            sbVar.f16772i2 = sbVar.I0.getSelectedAlbum();
                        }
                    }
                }
                break;
        }
    }
}
