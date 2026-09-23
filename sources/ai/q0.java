package ai;

import android.os.Build;
import android.text.TextUtils;
import ci.wc;
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
    public final int f1409a;
    public final Object f1410b;
    public final Object f1411c;

    public q0(int i10, Object obj, Object obj2) {
        this.f1409a = i10;
        this.f1410b = obj;
        this.f1411c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        ci.nb nbVar;
        switch (this.f1409a) {
            case 0:
                r3 r3Var = (r3) this.f1410b;
                m1 m1Var = (m1) this.f1411c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i10 = r3Var.N;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = r3Var.O;
                    deletegroupcallparticipantmessages.participant = MessagesController.getInstance(i10).getInputPeer(m1Var.f1228c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallparticipantmessages, null);
                    long j3 = m1Var.f1228c;
                    ArrayList arrayList = r3Var.f1339r;
                    ArrayList arrayList2 = r3Var.f1340s;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 < arrayList.size()) {
                        if (((m1) arrayList.get(i11)).f1228c == j3) {
                            m1 m1Var2 = (m1) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (((n1) arrayList2.get(i12)).f1289f.contains(m1Var2)) {
                                        ((n1) arrayList2.get(i12)).f1289f.remove(m1Var2);
                                        if (((n1) arrayList2.get(i12)).f1289f.isEmpty()) {
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
                            r3Var.e.N(true);
                            i11--;
                        }
                        i11++;
                    }
                    if (z10) {
                        ConnectionsManager.getInstance(i10).getCurrentTime();
                        Collections.sort(arrayList2, new a4.e(r3Var, 4));
                        r3Var.f1338n.N(true);
                        r3Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = r3Var.O;
                    deletegroupcallmessages.messages.add(Integer.valueOf(m1Var.f1226a));
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallmessages, null);
                    r3Var.c(m1Var.f1226a);
                }
                if (bool2.booleanValue()) {
                    if (r3Var.M >= 0) {
                        MessagesController.getInstance(i10).blockPeer(r3Var.M);
                        return;
                    } else {
                        MessagesController.getInstance(i10).deleteParticipantFromChat(-r3Var.M, MessagesController.getInstance(i10).getInputPeer(m1Var.f1228c), false, true);
                        return;
                    }
                }
                return;
            case 1:
                ci.bc bcVar = (ci.bc) this.f1410b;
                ci.p pVar = (ci.p) this.f1411c;
                File file = (File) obj;
                String str = (String) obj2;
                Long l4 = (Long) obj3;
                ci.lc lcVar = bcVar.S1;
                ci.zb zbVar = lcVar.X0;
                if (zbVar != null) {
                    zbVar.O = false;
                    zbVar.c();
                    ci.zb zbVar2 = lcVar.X0;
                    zbVar2.m(0L);
                    wc wcVar = zbVar2.F;
                    if (wcVar != null) {
                        wcVar.setProgress(0L);
                    }
                }
                ci.l8 l8Var = lcVar.K1;
                if (l8Var != null) {
                    l8Var.f4994o0 = file;
                    l8Var.f4996p0 = str;
                    l8Var.f4998q0 = l4.longValue();
                    ci.l8 l8Var2 = lcVar.K1;
                    l8Var2.f5002s0 = 0.0f;
                    l8Var2.f5004t0 = 1.0f;
                    l8Var2.f5000r0 = 0L;
                    l8Var2.f5006u0 = 1.0f;
                    lcVar.u();
                    if (lcVar.X0 != null && (nbVar = lcVar.f5094v1) != null) {
                        qg.e2 m0 = nbVar.m0(lcVar.K1.f4996p0, true);
                        bcVar.setHasRoundVideo(true);
                        lcVar.X0.s(lcVar.K1, m0, true);
                        AndroidUtilities.cancelRunOnUIThread(pVar.h);
                        pVar.f5243a.destroy(true, null);
                        m0.setDraw(false);
                        pVar.post(new ba(24, pVar, m0));
                        return;
                    }
                    pVar.a(false);
                    return;
                }
                return;
            default:
                ei.r rVar = (ei.r) this.f1410b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f1411c;
                Boolean bool3 = (Boolean) obj;
                androidx.biometric.s sVar = (androidx.biometric.s) obj2;
                androidx.biometric.t tVar = (androidx.biometric.t) obj3;
                rVar.getClass();
                String str2 = null;
                if (sVar != null) {
                    try {
                        int i13 = Build.VERSION.SDK_INT;
                        if (i13 < 23) {
                            str2 = rVar.f8565g;
                        } else {
                            if (i13 >= 30) {
                                tVar = rVar.i(true);
                            }
                            if (tVar != null) {
                                str2 = !TextUtils.isEmpty(rVar.f8565g) ? new String(tVar.f2064b.doFinal(Utilities.hexToBytes(rVar.f8565g)), StandardCharsets.UTF_8) : rVar.f8565g;
                            } else if (!TextUtils.isEmpty(rVar.f8565g)) {
                                throw new RuntimeException("No cryptoObject found");
                            }
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        bool3 = Boolean.FALSE;
                    }
                }
                callback2.run(bool3, str2);
                return;
        }
    }
}
