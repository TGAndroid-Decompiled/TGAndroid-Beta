package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class r00 implements y10 {
    public final int f26505a;
    public final long f26506b;
    public final Object f26507c;
    public final Object d;
    public final Object f26508e;

    public r00(Object obj, long j3, Object obj2, Object obj3, int i7) {
        this.f26505a = i7;
        this.f26507c = obj;
        this.f26506b = j3;
        this.d = obj2;
        this.f26508e = obj3;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f26505a;
        String str = null;
        Object obj2 = this.f26508e;
        Object obj3 = this.d;
        long j3 = this.f26506b;
        Object obj4 = this.f26507c;
        switch (i7) {
            case 0:
                a10 a10Var = (a10) obj4;
                gj gjVar = (gj) obj3;
                String str2 = (String) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = gjVar.f24177k;
                if (tL_textWithEntities != null) {
                    str = str2;
                }
                message.translatedSummaryLanguage = str;
                message.translatedSummaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                a10Var.getMessagesStorage().X1(j3, gjVar.f24177k);
                ls.f(a10Var.currentAccount).k(128, gjVar, Boolean.TRUE);
                return;
            case 1:
                x6 x6Var = (x6) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                HashMap hashMap = (HashMap) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_getFactCheck tL_getFactCheck = new TLRPC.TL_getFactCheck();
                int i10 = x6Var.f27816a;
                tL_getFactCheck.peer = np.u1(i10).l1(j3);
                ArrayList arrayList3 = new ArrayList();
                int i11 = 0;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    w6 w6Var = (w6) arrayList.get(i12);
                    TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) arrayList2.get(i12);
                    if (tL_factCheck == null) {
                        arrayList3.add(w6Var);
                        tL_getFactCheck.msg_id.add(Integer.valueOf(w6Var.f27655a));
                    } else {
                        x6Var.d.remove(w6Var);
                        y10 y10Var = (y10) hashMap.get(w6Var);
                        if (y10Var != null) {
                            y10Var.a(tL_factCheck);
                            i11++;
                        }
                    }
                }
                if (i11 > 0) {
                    ls.f(i10).k(226, new Object[0]);
                }
                if (!tL_getFactCheck.msg_id.isEmpty()) {
                    ConnectionsManager.getInstance(i10).sendRequest(tL_getFactCheck, new q6(x6Var, tL_getFactCheck, arrayList3, hashMap, 0));
                    return;
                }
                return;
            default:
                np npVar = (np) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.zd zdVar = (org.telegram.ui.zd) obj2;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (((Boolean) obj).booleanValue()) {
                    npVar.f25775b8.add(Long.valueOf(j3));
                    npVar.Q4(true);
                    if (T != null) {
                        org.telegram.ui.Components.lc.b0(T).P(2131623982, g0.H2(g0.x2(hd.N0(2131745378, null), new mn(0, T)), true)).k(true);
                    }
                    zArr[0] = true;
                    zdVar.run();
                    return;
                } else if (T != null) {
                    org.telegram.ui.Components.lc.b0(T).I(2131624012, hd.N0(2131754308, null), hd.N0(2131754309, null)).j();
                    return;
                } else {
                    return;
                }
        }
    }

    public r00(a10 a10Var, gj gjVar, String str, long j3) {
        this.f26505a = 0;
        this.f26507c = a10Var;
        this.d = gjVar;
        this.f26508e = str;
        this.f26506b = j3;
    }
}
