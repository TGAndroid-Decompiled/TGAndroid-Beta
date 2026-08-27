package jh;

import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import lh.cc;
import lh.hb;
import lh.ib;
import lh.sb;
import lh.va;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_phone;

public final class z implements Utilities.Callback3 {

    public final int f14175a;

    public final Object f14176b;

    public final Object f14177c;

    public z(int i10, Object obj, Object obj2) {
        this.f14175a = i10;
        this.f14176b = obj;
        this.f14177c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        va vaVar;
        switch (this.f14175a) {
            case 0:
                g2 g2Var = (g2) this.f14176b;
                s0 s0Var = (s0) this.f14177c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i10 = g2Var.J;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = g2Var.K;
                    deletegroupcallparticipantmessages.participant = MessagesController.getInstance(i10).getInputPeer(s0Var.f13931c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallparticipantmessages, null);
                    long j10 = s0Var.f13931c;
                    ArrayList arrayList = g2Var.f14017r;
                    ArrayList arrayList2 = g2Var.f14018s;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 < arrayList.size()) {
                        if (((s0) arrayList.get(i11)).f13931c == j10) {
                            s0 s0Var2 = (s0) arrayList.get(i11);
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                if (((t0) arrayList2.get(i12)).f13989f.contains(s0Var2)) {
                                    ((t0) arrayList2.get(i12)).f13989f.remove(s0Var2);
                                    if (((t0) arrayList2.get(i12)).f13989f.isEmpty()) {
                                        arrayList2.remove(i12);
                                        z10 = true;
                                    } else {
                                        g2Var.m();
                                    }
                                    arrayList.remove(i11);
                                    g2Var.f14014e.N(true);
                                    i11--;
                                }
                            }
                            arrayList.remove(i11);
                            g2Var.f14014e.N(true);
                            i11--;
                        }
                        i11++;
                    }
                    if (z10) {
                        ConnectionsManager.getInstance(i10).getCurrentTime();
                        Collections.sort(arrayList2, new a5.f(g2Var, 26));
                        g2Var.f14016n.N(true);
                        g2Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = g2Var.K;
                    deletegroupcallmessages.messages.add(Integer.valueOf(s0Var.f13929a));
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallmessages, null);
                    g2Var.c(s0Var.f13929a);
                }
                if (bool2.booleanValue()) {
                    if (g2Var.I >= 0) {
                        MessagesController.getInstance(i10).blockPeer(g2Var.I);
                        return;
                    } else {
                        MessagesController.getInstance(i10).deleteParticipantFromChat(-g2Var.I, MessagesController.getInstance(i10).getInputPeer(s0Var.f13931c), false, true);
                        return;
                    }
                }
                return;
            case 1:
                ib ibVar = (ib) this.f14176b;
                lh.q qVar = (lh.q) this.f14177c;
                File file = (File) obj;
                String str = (String) obj2;
                Long l10 = (Long) obj3;
                sb sbVar = ibVar.O1;
                hb hbVar = sbVar.T0;
                if (hbVar != null) {
                    hbVar.K = false;
                    hbVar.c();
                    hb hbVar2 = sbVar.T0;
                    hbVar2.m(0L);
                    cc ccVar = hbVar2.B;
                    if (ccVar != null) {
                        ccVar.setProgress(0L);
                    }
                }
                lh.z7 z7Var = sbVar.G1;
                if (z7Var != null) {
                    z7Var.f17224o0 = file;
                    z7Var.f17226p0 = str;
                    z7Var.f17228q0 = l10.longValue();
                    lh.z7 z7Var2 = sbVar.G1;
                    z7Var2.f17232s0 = 0.0f;
                    z7Var2.f17234t0 = 1.0f;
                    z7Var2.f17230r0 = 0L;
                    z7Var2.f17236u0 = 1.0f;
                    sbVar.u();
                    if (sbVar.T0 == null || (vaVar = sbVar.f16798r1) == null) {
                        qVar.a(false);
                        return;
                    }
                    zf.c2 c2VarM0 = vaVar.m0(sbVar.G1.f17226p0, true);
                    ibVar.setHasRoundVideo(true);
                    sbVar.T0.s(sbVar.G1, c2VarM0, true);
                    AndroidUtilities.cancelRunOnUIThread(qVar.h);
                    qVar.f15860a.destroy(true, null);
                    c2VarM0.setDraw(false);
                    qVar.post(new p6(28, qVar, c2VarM0));
                    return;
                }
                return;
            default:
                nh.q qVar2 = (nh.q) this.f14176b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f14177c;
                Boolean bool3 = (Boolean) obj;
                androidx.biometric.t tVar = (androidx.biometric.t) obj2;
                androidx.biometric.u uVarI = (androidx.biometric.u) obj3;
                qVar2.getClass();
                String str2 = null;
                if (tVar != null) {
                    try {
                        int i13 = Build.VERSION.SDK_INT;
                        if (i13 < 23) {
                            str2 = qVar2.f18892g;
                        } else {
                            if (i13 >= 30) {
                                uVarI = qVar2.i(true);
                            }
                            if (uVarI != null) {
                                str2 = !TextUtils.isEmpty(qVar2.f18892g) ? new String(uVarI.f1067b.doFinal(Utilities.hexToBytes(qVar2.f18892g)), StandardCharsets.UTF_8) : qVar2.f18892g;
                            } else if (!TextUtils.isEmpty(qVar2.f18892g)) {
                                throw new RuntimeException("No cryptoObject found");
                            }
                        }
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        bool3 = Boolean.FALSE;
                    }
                }
                callback2.run(bool3, str2);
                return;
        }
    }
}
