package ai;

import android.os.Build;
import android.text.TextUtils;
import ci.zc;
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
    public final int f1408a;
    public final Object f1409b;
    public final Object f1410c;

    public q0(int i10, Object obj, Object obj2) {
        this.f1408a = i10;
        this.f1409b = obj;
        this.f1410c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        ci.qb qbVar;
        switch (this.f1408a) {
            case 0:
                r3 r3Var = (r3) this.f1409b;
                m1 m1Var = (m1) this.f1410c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i10 = r3Var.N;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = r3Var.O;
                    deletegroupcallparticipantmessages.participant = MessagesController.getInstance(i10).getInputPeer(m1Var.f1226c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallparticipantmessages, null);
                    long j3 = m1Var.f1226c;
                    ArrayList arrayList = r3Var.f1335r;
                    ArrayList arrayList2 = r3Var.f1336s;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 < arrayList.size()) {
                        if (((m1) arrayList.get(i11)).f1226c == j3) {
                            m1 m1Var2 = (m1) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (((n1) arrayList2.get(i12)).f1279f.contains(m1Var2)) {
                                        ((n1) arrayList2.get(i12)).f1279f.remove(m1Var2);
                                        if (((n1) arrayList2.get(i12)).f1279f.isEmpty()) {
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
                        r3Var.f1334n.N(true);
                        r3Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = r3Var.O;
                    deletegroupcallmessages.messages.add(Integer.valueOf(m1Var.f1224a));
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallmessages, null);
                    r3Var.c(m1Var.f1224a);
                }
                if (bool2.booleanValue()) {
                    if (r3Var.M >= 0) {
                        MessagesController.getInstance(i10).blockPeer(r3Var.M);
                        return;
                    } else {
                        MessagesController.getInstance(i10).deleteParticipantFromChat(-r3Var.M, MessagesController.getInstance(i10).getInputPeer(m1Var.f1226c), false, true);
                        return;
                    }
                }
                return;
            case 1:
                ci.ec ecVar = (ci.ec) this.f1409b;
                ci.p pVar = (ci.p) this.f1410c;
                File file = (File) obj;
                String str = (String) obj2;
                Long l4 = (Long) obj3;
                ci.oc ocVar = ecVar.S1;
                ci.cc ccVar = ocVar.X0;
                if (ccVar != null) {
                    ccVar.O = false;
                    ccVar.c();
                    ci.cc ccVar2 = ocVar.X0;
                    ccVar2.m(0L);
                    zc zcVar = ccVar2.F;
                    if (zcVar != null) {
                        zcVar.setProgress(0L);
                    }
                }
                ci.o8 o8Var = ocVar.K1;
                if (o8Var != null) {
                    o8Var.f5169o0 = file;
                    o8Var.f5171p0 = str;
                    o8Var.f5173q0 = l4.longValue();
                    ci.o8 o8Var2 = ocVar.K1;
                    o8Var2.f5177s0 = 0.0f;
                    o8Var2.f5179t0 = 1.0f;
                    o8Var2.f5175r0 = 0L;
                    o8Var2.f5181u0 = 1.0f;
                    ocVar.u();
                    if (ocVar.X0 != null && (qbVar = ocVar.f5269v1) != null) {
                        qg.e2 m0 = qbVar.m0(ocVar.K1.f5171p0, true);
                        ecVar.setHasRoundVideo(true);
                        ocVar.X0.s(ocVar.K1, m0, true);
                        AndroidUtilities.cancelRunOnUIThread(pVar.h);
                        pVar.f5346a.destroy(true, null);
                        m0.setDraw(false);
                        pVar.post(new ba(24, pVar, m0));
                        return;
                    }
                    pVar.a(false);
                    return;
                }
                return;
            default:
                ei.r rVar = (ei.r) this.f1409b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f1410c;
                Boolean bool3 = (Boolean) obj;
                androidx.biometric.s sVar = (androidx.biometric.s) obj2;
                androidx.biometric.t tVar = (androidx.biometric.t) obj3;
                rVar.getClass();
                String str2 = null;
                if (sVar != null) {
                    try {
                        int i13 = Build.VERSION.SDK_INT;
                        if (i13 < 23) {
                            str2 = rVar.f8579g;
                        } else {
                            if (i13 >= 30) {
                                tVar = rVar.i(true);
                            }
                            if (tVar != null) {
                                str2 = !TextUtils.isEmpty(rVar.f8579g) ? new String(tVar.f2069b.doFinal(Utilities.hexToBytes(rVar.f8579g)), StandardCharsets.UTF_8) : rVar.f8579g;
                            } else if (!TextUtils.isEmpty(rVar.f8579g)) {
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
