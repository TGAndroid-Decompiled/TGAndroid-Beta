package ai;

import android.os.Build;
import android.text.TextUtils;
import ci.vc;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_phone;
public final class q0 implements Utilities.Callback3 {
    public final int f1532a;
    public final Object f1533b;
    public final Object f1534c;

    public q0(int i10, Object obj, Object obj2) {
        this.f1532a = i10;
        this.f1533b = obj;
        this.f1534c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        ci.mb mbVar;
        switch (this.f1532a) {
            case 0:
                r3 r3Var = (r3) this.f1533b;
                m1 m1Var = (m1) this.f1534c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i10 = r3Var.N;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = r3Var.O;
                    deletegroupcallparticipantmessages.participant = MessagesController.getInstance(i10).getInputPeer(m1Var.f1327c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallparticipantmessages, null);
                    long j3 = m1Var.f1327c;
                    ArrayList arrayList = r3Var.f1448r;
                    ArrayList arrayList2 = r3Var.f1449s;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 < arrayList.size()) {
                        if (((m1) arrayList.get(i11)).f1327c == j3) {
                            m1 m1Var2 = (m1) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (((n1) arrayList2.get(i12)).f1396f.contains(m1Var2)) {
                                        ((n1) arrayList2.get(i12)).f1396f.remove(m1Var2);
                                        if (((n1) arrayList2.get(i12)).f1396f.isEmpty()) {
                                            arrayList2.remove(i12);
                                            z10 = true;
                                        } else {
                                            r3Var.m();
                                        }
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                            arrayList.remove(i11);
                            r3Var.f1442e.N(true);
                            i11--;
                        }
                        i11++;
                    }
                    if (z10) {
                        ConnectionsManager.getInstance(i10).getCurrentTime();
                        Collections.sort(arrayList2, new a4.e(r3Var, 4));
                        r3Var.f1447n.N(true);
                        r3Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = r3Var.O;
                    deletegroupcallmessages.messages.add(Integer.valueOf(m1Var.f1325a));
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallmessages, null);
                    r3Var.c(m1Var.f1325a);
                }
                if (bool2.booleanValue()) {
                    if (r3Var.M >= 0) {
                        MessagesController.getInstance(i10).blockPeer(r3Var.M);
                        return;
                    } else {
                        MessagesController.getInstance(i10).deleteParticipantFromChat(-r3Var.M, MessagesController.getInstance(i10).getInputPeer(m1Var.f1327c), false, true);
                        return;
                    }
                }
                return;
            case 1:
                ci.ac acVar = (ci.ac) this.f1533b;
                ci.p pVar = (ci.p) this.f1534c;
                File file = (File) obj;
                String str = (String) obj2;
                Long l4 = (Long) obj3;
                ci.kc kcVar = acVar.S1;
                ci.yb ybVar = kcVar.X0;
                if (ybVar != null) {
                    ybVar.O = false;
                    ybVar.c();
                    ci.yb ybVar2 = kcVar.X0;
                    ybVar2.m(0L);
                    vc vcVar = ybVar2.F;
                    if (vcVar != null) {
                        vcVar.setProgress(0L);
                    }
                }
                ci.k8 k8Var = kcVar.K1;
                if (k8Var != null) {
                    k8Var.f5341o0 = file;
                    k8Var.f5343p0 = str;
                    k8Var.f5345q0 = l4.longValue();
                    ci.k8 k8Var2 = kcVar.K1;
                    k8Var2.f5349s0 = 0.0f;
                    k8Var2.f5351t0 = 1.0f;
                    k8Var2.f5347r0 = 0L;
                    k8Var2.f5353u0 = 1.0f;
                    kcVar.u();
                    if (kcVar.X0 != null && (mbVar = kcVar.f5443v1) != null) {
                        qg.b2 m0 = mbVar.m0(kcVar.K1.f5343p0, true);
                        acVar.setHasRoundVideo(true);
                        kcVar.X0.s(kcVar.K1, m0, true);
                        AndroidUtilities.cancelRunOnUIThread(pVar.h);
                        pVar.f5656a.destroy(true, null);
                        m0.setDraw(false);
                        pVar.post(new ba(24, pVar, m0));
                        return;
                    }
                    pVar.a(false);
                    return;
                }
                return;
            default:
                ei.s sVar = (ei.s) this.f1533b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f1534c;
                Boolean bool3 = (Boolean) obj;
                androidx.biometric.s sVar2 = (androidx.biometric.s) obj2;
                androidx.biometric.t tVar = (androidx.biometric.t) obj3;
                sVar.getClass();
                String str2 = null;
                if (sVar2 != null) {
                    try {
                        int i13 = Build.VERSION.SDK_INT;
                        if (i13 < 23) {
                            str2 = sVar.f9320g;
                        } else {
                            if (i13 >= 30) {
                                tVar = sVar.i(true);
                            }
                            if (tVar != null) {
                                str2 = !TextUtils.isEmpty(sVar.f9320g) ? new String(tVar.f2242b.doFinal(Utilities.hexToBytes(sVar.f9320g)), StandardCharsets.UTF_8) : sVar.f9320g;
                            } else if (!TextUtils.isEmpty(sVar.f9320g)) {
                                throw new RuntimeException("No cryptoObject found");
                            }
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        bool3 = Boolean.FALSE;
                    }
                }
                callback2.run(bool3, str2);
                return;
        }
    }
}
