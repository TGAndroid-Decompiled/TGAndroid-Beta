package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class q00 implements x10 {
    public final int f26330a;
    public final long f26331b;
    public final Object f26332c;
    public final Object d;
    public final Object f26333e;

    public q00(Object obj, long j3, Object obj2, Object obj3, int i7) {
        this.f26330a = i7;
        this.f26332c = obj;
        this.f26331b = j3;
        this.d = obj2;
        this.f26333e = obj3;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f26330a;
        String str = null;
        Object obj2 = this.f26333e;
        Object obj3 = this.d;
        long j3 = this.f26331b;
        Object obj4 = this.f26332c;
        switch (i7) {
            case 0:
                z00 z00Var = (z00) obj4;
                fj fjVar = (fj) obj3;
                String str2 = (String) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = fjVar.f23968k;
                if (tL_textWithEntities != null) {
                    str = str2;
                }
                message.translatedSummaryLanguage = str;
                message.translatedSummaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                z00Var.getMessagesStorage().X1(j3, fjVar.f23968k);
                ks.f(z00Var.currentAccount).k(128, fjVar, Boolean.TRUE);
                return;
            case 1:
                x6 x6Var = (x6) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                HashMap hashMap = (HashMap) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_getFactCheck tL_getFactCheck = new TLRPC.TL_getFactCheck();
                int i10 = x6Var.f27823a;
                tL_getFactCheck.peer = mp.u1(i10).l1(j3);
                ArrayList arrayList3 = new ArrayList();
                int i11 = 0;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    w6 w6Var = (w6) arrayList.get(i12);
                    TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) arrayList2.get(i12);
                    if (tL_factCheck == null) {
                        arrayList3.add(w6Var);
                        tL_getFactCheck.msg_id.add(Integer.valueOf(w6Var.f27647a));
                    } else {
                        x6Var.d.remove(w6Var);
                        x10 x10Var = (x10) hashMap.get(w6Var);
                        if (x10Var != null) {
                            x10Var.a(tL_factCheck);
                            i11++;
                        }
                    }
                }
                if (i11 > 0) {
                    ks.f(i10).k(226, new Object[0]);
                }
                if (!tL_getFactCheck.msg_id.isEmpty()) {
                    ConnectionsManager.getInstance(i10).sendRequest(tL_getFactCheck, new q6(x6Var, tL_getFactCheck, arrayList3, hashMap, 0));
                    return;
                }
                return;
            default:
                mp mpVar = (mp) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.zd zdVar = (org.telegram.ui.zd) obj2;
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (((Boolean) obj).booleanValue()) {
                    mpVar.f25614b8.add(Long.valueOf(j3));
                    mpVar.Q4(true);
                    if (T != null) {
                        org.telegram.ui.Components.lc.b0(T).P(2131623982, g0.H2(g0.x2(gd.M0(2131745379, null), new ln(0, T)), true)).k(true);
                    }
                    zArr[0] = true;
                    zdVar.run();
                    return;
                } else if (T != null) {
                    org.telegram.ui.Components.lc.b0(T).I(2131624012, gd.M0(2131754309, null), gd.M0(2131754310, null)).j();
                    return;
                } else {
                    return;
                }
        }
    }

    public q00(z00 z00Var, fj fjVar, String str, long j3) {
        this.f26330a = 0;
        this.f26332c = z00Var;
        this.d = fjVar;
        this.f26333e = str;
        this.f26331b = j3;
    }
}
