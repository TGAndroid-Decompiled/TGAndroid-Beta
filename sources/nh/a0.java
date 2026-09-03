package nh;

import android.os.Build;
import android.text.TextUtils;
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
import org.telegram.ui.sg1;
import ph.da;
import ph.oa;
import ph.s9;
import ph.t9;
public final class a0 implements Utilities.Callback3 {
    public final int f15020a;
    public final Object f15021b;
    public final Object f15022c;

    public a0(int i10, Object obj, Object obj2) {
        this.f15020a = i10;
        this.f15021b = obj;
        this.f15022c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        ph.h9 h9Var;
        switch (this.f15020a) {
            case 0:
                g2 g2Var = (g2) this.f15021b;
                t0 t0Var = (t0) this.f15022c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i10 = g2Var.K;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = g2Var.L;
                    deletegroupcallparticipantmessages.participant = MessagesController.getInstance(i10).getInputPeer(t0Var.f15878c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallparticipantmessages, null);
                    long j10 = t0Var.f15878c;
                    ArrayList arrayList = g2Var.f15958r;
                    ArrayList arrayList2 = g2Var.f15959s;
                    int i11 = 0;
                    boolean z4 = false;
                    while (i11 < arrayList.size()) {
                        if (((t0) arrayList.get(i11)).f15878c == j10) {
                            t0 t0Var2 = (t0) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (((u0) arrayList2.get(i12)).f15930f.contains(t0Var2)) {
                                        ((u0) arrayList2.get(i12)).f15930f.remove(t0Var2);
                                        if (((u0) arrayList2.get(i12)).f15930f.isEmpty()) {
                                            arrayList2.remove(i12);
                                            z4 = true;
                                        } else {
                                            g2Var.m();
                                        }
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                            arrayList.remove(i11);
                            g2Var.e.N(true);
                            i11--;
                        }
                        i11++;
                    }
                    if (z4) {
                        ConnectionsManager.getInstance(i10).getCurrentTime();
                        Collections.sort(arrayList2, new e5.e(g2Var, 28));
                        g2Var.f15957n.N(true);
                        g2Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = g2Var.L;
                    deletegroupcallmessages.messages.add(Integer.valueOf(t0Var.f15876a));
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallmessages, null);
                    g2Var.c(t0Var.f15876a);
                }
                if (bool2.booleanValue()) {
                    if (g2Var.J >= 0) {
                        MessagesController.getInstance(i10).blockPeer(g2Var.J);
                        return;
                    } else {
                        MessagesController.getInstance(i10).deleteParticipantFromChat(-g2Var.J, MessagesController.getInstance(i10).getInputPeer(t0Var.f15878c), false, true);
                        return;
                    }
                }
                return;
            case 1:
                t9 t9Var = (t9) this.f15021b;
                ph.n nVar = (ph.n) this.f15022c;
                File file = (File) obj;
                String str = (String) obj2;
                Long l10 = (Long) obj3;
                da daVar = t9Var.P1;
                s9 s9Var = daVar.U0;
                if (s9Var != null) {
                    s9Var.L = false;
                    s9Var.c();
                    s9 s9Var2 = daVar.U0;
                    s9Var2.m(0L);
                    oa oaVar = s9Var2.C;
                    if (oaVar != null) {
                        oaVar.setProgress(0L);
                    }
                }
                ph.t6 t6Var = daVar.H1;
                if (t6Var != null) {
                    t6Var.f42429o0 = file;
                    t6Var.f42431p0 = str;
                    t6Var.f42433q0 = l10.longValue();
                    ph.t6 t6Var2 = daVar.H1;
                    t6Var2.f42437s0 = 0.0f;
                    t6Var2.f42439t0 = 1.0f;
                    t6Var2.f42435r0 = 0L;
                    t6Var2.f42441u0 = 1.0f;
                    daVar.u();
                    if (daVar.U0 != null && (h9Var = daVar.f41569s1) != null) {
                        dg.b3 m0 = h9Var.m0(daVar.H1.f42431p0, true);
                        t9Var.setHasRoundVideo(true);
                        daVar.U0.s(daVar.H1, m0, true);
                        AndroidUtilities.cancelRunOnUIThread(nVar.h);
                        nVar.f42592a.destroy(true, null);
                        m0.setDraw(false);
                        nVar.post(new sg1(28, nVar, m0));
                        return;
                    }
                    nVar.a(false);
                    return;
                }
                return;
            default:
                rh.p pVar = (rh.p) this.f15021b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f15022c;
                Boolean bool3 = (Boolean) obj;
                androidx.biometric.u uVar = (androidx.biometric.u) obj2;
                androidx.biometric.v vVar = (androidx.biometric.v) obj3;
                pVar.getClass();
                String str2 = null;
                if (uVar != null) {
                    try {
                        int i13 = Build.VERSION.SDK_INT;
                        if (i13 < 23) {
                            str2 = pVar.f43721g;
                        } else {
                            if (i13 >= 30) {
                                vVar = pVar.i(true);
                            }
                            if (vVar != null) {
                                str2 = !TextUtils.isEmpty(pVar.f43721g) ? new String(vVar.f502b.doFinal(Utilities.hexToBytes(pVar.f43721g)), StandardCharsets.UTF_8) : pVar.f43721g;
                            } else if (!TextUtils.isEmpty(pVar.f43721g)) {
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
