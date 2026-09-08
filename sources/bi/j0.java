package bi;

import android.os.Build;
import android.text.TextUtils;
import di.dc;
import di.fc;
import di.pc;
import di.zc;
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
public final class j0 implements Utilities.Callback3 {
    public final int f3145a;
    public final Object f3146b;
    public final Object f3147c;

    public j0(int i10, Object obj, Object obj2) {
        this.f3145a = i10;
        this.f3146b = obj;
        this.f3147c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        di.rb rbVar;
        switch (this.f3145a) {
            case 0:
                e3 e3Var = (e3) this.f3146b;
                e1 e1Var = (e1) this.f3147c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i10 = e3Var.N;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = e3Var.O;
                    deletegroupcallparticipantmessages.participant = MessagesController.getInstance(i10).getInputPeer(e1Var.f2927c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallparticipantmessages, null);
                    long j3 = e1Var.f2927c;
                    ArrayList arrayList = e3Var.f3040r;
                    ArrayList arrayList2 = e3Var.f3041s;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 < arrayList.size()) {
                        if (((e1) arrayList.get(i11)).f2927c == j3) {
                            e1 e1Var2 = (e1) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (((f1) arrayList2.get(i12)).f2978f.contains(e1Var2)) {
                                        ((f1) arrayList2.get(i12)).f2978f.remove(e1Var2);
                                        if (((f1) arrayList2.get(i12)).f2978f.isEmpty()) {
                                            arrayList2.remove(i12);
                                            z10 = true;
                                        } else {
                                            e3Var.m();
                                        }
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                            arrayList.remove(i11);
                            e3Var.f3034e.N(true);
                            i11--;
                        }
                        i11++;
                    }
                    if (z10) {
                        ConnectionsManager.getInstance(i10).getCurrentTime();
                        Collections.sort(arrayList2, new a4.e(e3Var, 8));
                        e3Var.f3039n.N(true);
                        e3Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = e3Var.O;
                    deletegroupcallmessages.messages.add(Integer.valueOf(e1Var.f2925a));
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallmessages, null);
                    e3Var.c(e1Var.f2925a);
                }
                if (bool2.booleanValue()) {
                    if (e3Var.M >= 0) {
                        MessagesController.getInstance(i10).blockPeer(e3Var.M);
                        return;
                    } else {
                        MessagesController.getInstance(i10).deleteParticipantFromChat(-e3Var.M, MessagesController.getInstance(i10).getInputPeer(e1Var.f2927c), false, true);
                        return;
                    }
                }
                return;
            case 1:
                fc fcVar = (fc) this.f3146b;
                di.p pVar = (di.p) this.f3147c;
                File file = (File) obj;
                String str = (String) obj2;
                Long l4 = (Long) obj3;
                pc pcVar = fcVar.S1;
                dc dcVar = pcVar.X0;
                if (dcVar != null) {
                    dcVar.O = false;
                    dcVar.c();
                    dc dcVar2 = pcVar.X0;
                    dcVar2.m(0L);
                    zc zcVar = dcVar2.F;
                    if (zcVar != null) {
                        zcVar.setProgress(0L);
                    }
                }
                di.o8 o8Var = pcVar.K1;
                if (o8Var != null) {
                    o8Var.f7799o0 = file;
                    o8Var.f7801p0 = str;
                    o8Var.f7803q0 = l4.longValue();
                    di.o8 o8Var2 = pcVar.K1;
                    o8Var2.f7807s0 = 0.0f;
                    o8Var2.f7809t0 = 1.0f;
                    o8Var2.f7805r0 = 0L;
                    o8Var2.f7811u0 = 1.0f;
                    pcVar.u();
                    if (pcVar.X0 != null && (rbVar = pcVar.f7938v1) != null) {
                        rg.d2 m0 = rbVar.m0(pcVar.K1.f7801p0, true);
                        fcVar.setHasRoundVideo(true);
                        pcVar.X0.s(pcVar.K1, m0, true);
                        AndroidUtilities.cancelRunOnUIThread(pVar.h);
                        pVar.f8030a.destroy(true, null);
                        m0.setDraw(false);
                        pVar.post(new di.b7(3, pVar, m0));
                        return;
                    }
                    pVar.a(false);
                    return;
                }
                return;
            default:
                fi.s sVar = (fi.s) this.f3146b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f3147c;
                Boolean bool3 = (Boolean) obj;
                androidx.biometric.t tVar = (androidx.biometric.t) obj2;
                androidx.biometric.u uVar = (androidx.biometric.u) obj3;
                sVar.getClass();
                String str2 = null;
                if (tVar != null) {
                    try {
                        int i13 = Build.VERSION.SDK_INT;
                        if (i13 < 23) {
                            str2 = sVar.f9971g;
                        } else {
                            if (i13 >= 30) {
                                uVar = sVar.i(true);
                            }
                            if (uVar != null) {
                                str2 = !TextUtils.isEmpty(sVar.f9971g) ? new String(uVar.f1071b.doFinal(Utilities.hexToBytes(sVar.f9971g)), StandardCharsets.UTF_8) : sVar.f9971g;
                            } else if (!TextUtils.isEmpty(sVar.f9971g)) {
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
