package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class w00 implements c20 {
    public final int f26238a;
    public final long f26239b;
    public final Object f26240c;
    public final Object d;
    public final Object f26241e;

    public w00(Object obj, long j3, Object obj2, Object obj3, int i7) {
        this.f26238a = i7;
        this.f26240c = obj;
        this.f26239b = j3;
        this.d = obj2;
        this.f26241e = obj3;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f26238a;
        String str = null;
        Object obj2 = this.f26241e;
        Object obj3 = this.d;
        long j3 = this.f26239b;
        Object obj4 = this.f26240c;
        switch (i7) {
            case 0:
                f10 f10Var = (f10) obj4;
                ij ijVar = (ij) obj3;
                String str2 = (String) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = ijVar.f23244k;
                if (tL_textWithEntities != null) {
                    str = str2;
                }
                message.translatedSummaryLanguage = str;
                message.translatedSummaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                f10Var.getMessagesStorage().X1(j3, ijVar.f23244k);
                qs.f(f10Var.currentAccount).k(128, ijVar, Boolean.TRUE);
                return;
            case 1:
                x6 x6Var = (x6) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                HashMap hashMap = (HashMap) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_getFactCheck tL_getFactCheck = new TLRPC.TL_getFactCheck();
                int i10 = x6Var.f26436a;
                tL_getFactCheck.peer = qp.s1(i10).j1(j3);
                ArrayList arrayList3 = new ArrayList();
                int i11 = 0;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    w6 w6Var = (w6) arrayList.get(i12);
                    TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) arrayList2.get(i12);
                    if (tL_factCheck == null) {
                        arrayList3.add(w6Var);
                        tL_getFactCheck.msg_id.add(Integer.valueOf(w6Var.f26258a));
                    } else {
                        x6Var.d.remove(w6Var);
                        c20 c20Var = (c20) hashMap.get(w6Var);
                        if (c20Var != null) {
                            c20Var.a(tL_factCheck);
                            i11++;
                        }
                    }
                }
                if (i11 > 0) {
                    qs.f(i10).k(224, new Object[0]);
                }
                if (!tL_getFactCheck.msg_id.isEmpty()) {
                    ConnectionsManager.getInstance(i10).sendRequest(tL_getFactCheck, new q6(x6Var, tL_getFactCheck, arrayList3, hashMap, 0));
                    return;
                }
                return;
            default:
                qp qpVar = (qp) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ae aeVar = (org.telegram.ui.ae) obj2;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (((Boolean) obj).booleanValue()) {
                    qpVar.V7.add(Long.valueOf(j3));
                    qpVar.F4(true);
                    if (T != null) {
                        org.telegram.ui.Components.hc.a0(T).P(2131623981, g0.H2(g0.x2(hd.M0(2131745575, null), new rn(0, T)), true)).k(true);
                    }
                    zArr[0] = true;
                    aeVar.run();
                    return;
                } else if (T != null) {
                    org.telegram.ui.Components.hc.a0(T).I(2131624011, hd.M0(2131754311, null), hd.M0(2131754312, null)).j();
                    return;
                } else {
                    return;
                }
        }
    }

    public w00(f10 f10Var, ij ijVar, String str, long j3) {
        this.f26238a = 0;
        this.f26240c = f10Var;
        this.d = ijVar;
        this.f26241e = str;
        this.f26239b = j3;
    }
}
