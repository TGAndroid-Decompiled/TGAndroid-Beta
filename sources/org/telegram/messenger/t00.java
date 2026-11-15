package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class t00 implements z10 {
    public final int f26619a;
    public final long f26620b;
    public final Object f26621c;
    public final Object d;
    public final Object f26622e;

    public t00(Object obj, long j3, Object obj2, Object obj3, int i7) {
        this.f26619a = i7;
        this.f26621c = obj;
        this.f26620b = j3;
        this.d = obj2;
        this.f26622e = obj3;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f26619a;
        String str = null;
        Object obj2 = this.f26622e;
        Object obj3 = this.d;
        long j3 = this.f26620b;
        Object obj4 = this.f26621c;
        switch (i7) {
            case 0:
                c10 c10Var = (c10) obj4;
                gj gjVar = (gj) obj3;
                String str2 = (String) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = gjVar.f23819k;
                if (tL_textWithEntities != null) {
                    str = str2;
                }
                message.translatedSummaryLanguage = str;
                message.translatedSummaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                c10Var.getMessagesStorage().X1(j3, gjVar.f23819k);
                ns.f(c10Var.currentAccount).k(128, gjVar, Boolean.TRUE);
                return;
            case 1:
                x6 x6Var = (x6) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                HashMap hashMap = (HashMap) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_getFactCheck tL_getFactCheck = new TLRPC.TL_getFactCheck();
                int i10 = x6Var.f27467a;
                tL_getFactCheck.peer = np.s1(i10).j1(j3);
                ArrayList arrayList3 = new ArrayList();
                int i11 = 0;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    w6 w6Var = (w6) arrayList.get(i12);
                    TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) arrayList2.get(i12);
                    if (tL_factCheck == null) {
                        arrayList3.add(w6Var);
                        tL_getFactCheck.msg_id.add(Integer.valueOf(w6Var.f27304a));
                    } else {
                        x6Var.d.remove(w6Var);
                        z10 z10Var = (z10) hashMap.get(w6Var);
                        if (z10Var != null) {
                            z10Var.a(tL_factCheck);
                            i11++;
                        }
                    }
                }
                if (i11 > 0) {
                    ns.f(i10).k(224, new Object[0]);
                }
                if (!tL_getFactCheck.msg_id.isEmpty()) {
                    ConnectionsManager.getInstance(i10).sendRequest(tL_getFactCheck, new q6(x6Var, tL_getFactCheck, arrayList3, hashMap, 0));
                    return;
                }
                return;
            default:
                np npVar = (np) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.yd ydVar = (org.telegram.ui.yd) obj2;
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (((Boolean) obj).booleanValue()) {
                    npVar.W7.add(Long.valueOf(j3));
                    npVar.G4(true);
                    if (T != null) {
                        org.telegram.ui.Components.cc.a0(T).P(2131623982, g0.H2(g0.x2(hd.M0(2131745574, null), new on(0, T)), true)).k(true);
                    }
                    zArr[0] = true;
                    ydVar.run();
                    return;
                } else if (T != null) {
                    org.telegram.ui.Components.cc.a0(T).I(2131624012, hd.M0(2131754311, null), hd.M0(2131754312, null)).j();
                    return;
                } else {
                    return;
                }
        }
    }

    public t00(c10 c10Var, gj gjVar, String str, long j3) {
        this.f26619a = 0;
        this.f26621c = c10Var;
        this.d = gjVar;
        this.f26622e = str;
        this.f26620b = j3;
    }
}
