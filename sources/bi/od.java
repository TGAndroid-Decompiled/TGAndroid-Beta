package bi;

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
public final class od implements Utilities.Callback3 {
    public final int f3344a;
    public final Object f3345b;
    public final Object f3346c;

    public od(int i10, Object obj, Object obj2) {
        this.f3344a = i10;
        this.f3345b = obj;
        this.f3346c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        ad adVar;
        switch (this.f3344a) {
            case 0:
                qd qdVar = (qd) this.f3345b;
                t tVar = (t) this.f3346c;
                File file = (File) obj;
                String str = (String) obj2;
                Long l4 = (Long) obj3;
                ce ceVar = qdVar.S1;
                nd ndVar = ceVar.X0;
                if (ndVar != null) {
                    ndVar.O = false;
                    ndVar.c();
                    nd ndVar2 = ceVar.X0;
                    ndVar2.m(0L);
                    me meVar = ndVar2.F;
                    if (meVar != null) {
                        meVar.setProgress(0L);
                    }
                }
                r9 r9Var = ceVar.K1;
                if (r9Var != null) {
                    r9Var.f3589o0 = file;
                    r9Var.f3591p0 = str;
                    r9Var.f3593q0 = l4.longValue();
                    r9 r9Var2 = ceVar.K1;
                    r9Var2.f3597s0 = 0.0f;
                    r9Var2.f3599t0 = 1.0f;
                    r9Var2.f3595r0 = 0L;
                    r9Var2.f3601u0 = 1.0f;
                    ceVar.u();
                    if (ceVar.X0 != null && (adVar = ceVar.f2498v1) != null) {
                        pg.b2 m0 = adVar.m0(ceVar.K1.f3591p0, true);
                        qdVar.setHasRoundVideo(true);
                        ceVar.X0.s(ceVar.K1, m0, true);
                        AndroidUtilities.cancelRunOnUIThread(tVar.h);
                        tVar.f3549a.destroy(true, null);
                        m0.setDraw(false);
                        tVar.post(new a1.e(20, tVar, m0));
                        return;
                    }
                    tVar.a(false);
                    return;
                }
                return;
            case 1:
                di.u uVar = (di.u) this.f3345b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f3346c;
                Boolean bool = (Boolean) obj;
                androidx.biometric.t tVar2 = (androidx.biometric.t) obj2;
                androidx.biometric.u uVar2 = (androidx.biometric.u) obj3;
                uVar.getClass();
                String str2 = null;
                if (tVar2 != null) {
                    try {
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 < 23) {
                            str2 = uVar.f6932g;
                        } else {
                            if (i10 >= 30) {
                                uVar2 = uVar.i(true);
                            }
                            if (uVar2 != null) {
                                str2 = !TextUtils.isEmpty(uVar.f6932g) ? new String(uVar2.f758b.doFinal(Utilities.hexToBytes(uVar.f6932g)), StandardCharsets.UTF_8) : uVar.f6932g;
                            } else if (!TextUtils.isEmpty(uVar.f6932g)) {
                                throw new RuntimeException("No cryptoObject found");
                            }
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        bool = Boolean.FALSE;
                    }
                }
                callback2.run(bool, str2);
                return;
            default:
                zh.o1 o1Var = (zh.o1) this.f3345b;
                zh.k0 k0Var = (zh.k0) this.f3346c;
                Boolean bool2 = (Boolean) obj;
                Boolean bool3 = (Boolean) obj3;
                int i11 = o1Var.N;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = o1Var.O;
                    deletegroupcallparticipantmessages.participant = MessagesController.getInstance(i11).getInputPeer(k0Var.f48577c);
                    deletegroupcallparticipantmessages.report_spam = bool2.booleanValue();
                    ConnectionsManager.getInstance(i11).sendRequest(deletegroupcallparticipantmessages, null);
                    long j3 = k0Var.f48577c;
                    ArrayList arrayList = o1Var.f48673r;
                    ArrayList arrayList2 = o1Var.f48674s;
                    int i12 = 0;
                    boolean z10 = false;
                    while (i12 < arrayList.size()) {
                        if (((zh.k0) arrayList.get(i12)).f48577c == j3) {
                            zh.k0 k0Var2 = (zh.k0) arrayList.get(i12);
                            int i13 = 0;
                            while (true) {
                                if (i13 < arrayList2.size()) {
                                    if (((zh.l0) arrayList2.get(i13)).f48634f.contains(k0Var2)) {
                                        ((zh.l0) arrayList2.get(i13)).f48634f.remove(k0Var2);
                                        if (((zh.l0) arrayList2.get(i13)).f48634f.isEmpty()) {
                                            arrayList2.remove(i13);
                                            z10 = true;
                                        } else {
                                            o1Var.m();
                                        }
                                    } else {
                                        i13++;
                                    }
                                }
                            }
                            arrayList.remove(i12);
                            o1Var.e.N(true);
                            i12--;
                        }
                        i12++;
                    }
                    if (z10) {
                        ConnectionsManager.getInstance(i11).getCurrentTime();
                        Collections.sort(arrayList2, new sg.p(o1Var, 23));
                        o1Var.f48672n.N(true);
                        o1Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = o1Var.O;
                    deletegroupcallmessages.messages.add(Integer.valueOf(k0Var.f48575a));
                    ConnectionsManager.getInstance(i11).sendRequest(deletegroupcallmessages, null);
                    o1Var.c(k0Var.f48575a);
                }
                if (bool3.booleanValue()) {
                    if (o1Var.M >= 0) {
                        MessagesController.getInstance(i11).blockPeer(o1Var.M);
                        return;
                    } else {
                        MessagesController.getInstance(i11).deleteParticipantFromChat(-o1Var.M, MessagesController.getInstance(i11).getInputPeer(k0Var.f48577c), false, true);
                        return;
                    }
                }
                return;
        }
    }
}
