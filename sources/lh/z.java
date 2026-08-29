package lh;

import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import nh.gb;
import nh.ja;
import nh.qb;
import nh.va;
import nh.wa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_phone;
public final class z implements Utilities.Callback3 {
    public final int f16441a;
    public final Object f16442b;
    public final Object f16443c;

    public z(int i10, Object obj, Object obj2) {
        this.f16441a = i10;
        this.f16442b = obj;
        this.f16443c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        ja jaVar;
        switch (this.f16441a) {
            case 0:
                f2 f2Var = (f2) this.f16442b;
                s0 s0Var = (s0) this.f16443c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i10 = f2Var.J;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = f2Var.K;
                    deletegroupcallparticipantmessages.participant = MessagesController.getInstance(i10).getInputPeer(s0Var.f16196c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallparticipantmessages, null);
                    long j10 = s0Var.f16196c;
                    ArrayList arrayList = f2Var.f16284r;
                    ArrayList arrayList2 = f2Var.f16285s;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 < arrayList.size()) {
                        if (((s0) arrayList.get(i11)).f16196c == j10) {
                            s0 s0Var2 = (s0) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (((t0) arrayList2.get(i12)).f16254f.contains(s0Var2)) {
                                        ((t0) arrayList2.get(i12)).f16254f.remove(s0Var2);
                                        if (((t0) arrayList2.get(i12)).f16254f.isEmpty()) {
                                            arrayList2.remove(i12);
                                            z10 = true;
                                        } else {
                                            f2Var.m();
                                        }
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                            arrayList.remove(i11);
                            f2Var.f16281e.N(true);
                            i11--;
                        }
                        i11++;
                    }
                    if (z10) {
                        ConnectionsManager.getInstance(i10).getCurrentTime();
                        Collections.sort(arrayList2, new c5.e(f2Var, 28));
                        f2Var.f16283n.N(true);
                        f2Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = f2Var.K;
                    deletegroupcallmessages.messages.add(Integer.valueOf(s0Var.f16194a));
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallmessages, null);
                    f2Var.c(s0Var.f16194a);
                }
                if (bool2.booleanValue()) {
                    if (f2Var.I >= 0) {
                        MessagesController.getInstance(i10).blockPeer(f2Var.I);
                        return;
                    } else {
                        MessagesController.getInstance(i10).deleteParticipantFromChat(-f2Var.I, MessagesController.getInstance(i10).getInputPeer(s0Var.f16196c), false, true);
                        return;
                    }
                }
                return;
            case 1:
                wa waVar = (wa) this.f16442b;
                nh.p pVar = (nh.p) this.f16443c;
                File file = (File) obj;
                String str = (String) obj2;
                Long l10 = (Long) obj3;
                gb gbVar = waVar.O1;
                va vaVar = gbVar.T0;
                if (vaVar != null) {
                    vaVar.K = false;
                    vaVar.c();
                    va vaVar2 = gbVar.T0;
                    vaVar2.m(0L);
                    qb qbVar = vaVar2.B;
                    if (qbVar != null) {
                        qbVar.setProgress(0L);
                    }
                }
                nh.o7 o7Var = gbVar.G1;
                if (o7Var != null) {
                    o7Var.f18285o0 = file;
                    o7Var.f18287p0 = str;
                    o7Var.f18289q0 = l10.longValue();
                    nh.o7 o7Var2 = gbVar.G1;
                    o7Var2.f18293s0 = 0.0f;
                    o7Var2.f18295t0 = 1.0f;
                    o7Var2.f18291r0 = 0L;
                    o7Var2.f18297u0 = 1.0f;
                    gbVar.u();
                    if (gbVar.T0 != null && (jaVar = gbVar.f17792r1) != null) {
                        bg.f3 m0 = jaVar.m0(gbVar.G1.f18287p0, true);
                        waVar.setHasRoundVideo(true);
                        gbVar.T0.s(gbVar.G1, m0, true);
                        AndroidUtilities.cancelRunOnUIThread(pVar.h);
                        pVar.f18672a.destroy(true, null);
                        m0.setDraw(false);
                        pVar.post(new nh.b6(5, pVar, m0));
                        return;
                    }
                    pVar.a(false);
                    return;
                }
                return;
            default:
                ph.p pVar2 = (ph.p) this.f16442b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f16443c;
                Boolean bool3 = (Boolean) obj;
                androidx.biometric.u uVar = (androidx.biometric.u) obj2;
                androidx.biometric.v vVar = (androidx.biometric.v) obj3;
                pVar2.getClass();
                String str2 = null;
                if (uVar != null) {
                    try {
                        int i13 = Build.VERSION.SDK_INT;
                        if (i13 < 23) {
                            str2 = pVar2.f45946g;
                        } else {
                            if (i13 >= 30) {
                                vVar = pVar2.i(true);
                            }
                            if (vVar != null) {
                                str2 = !TextUtils.isEmpty(pVar2.f45946g) ? new String(vVar.f1057b.doFinal(Utilities.hexToBytes(pVar2.f45946g)), StandardCharsets.UTF_8) : pVar2.f45946g;
                            } else if (!TextUtils.isEmpty(pVar2.f45946g)) {
                                throw new RuntimeException("No cryptoObject found");
                            }
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        bool3 = Boolean.FALSE;
                    }
                }
                callback2.run(bool3, str2);
                return;
        }
    }
}
