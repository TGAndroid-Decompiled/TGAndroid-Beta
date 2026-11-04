package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class o00 implements u10 {
    public final int f24471a;
    public final long f24472b;
    public final Object f24473c;
    public final Object d;
    public final Object f24474e;

    public o00(Object obj, long j10, Object obj2, Object obj3, int i3) {
        this.f24471a = i3;
        this.f24473c = obj;
        this.f24472b = j10;
        this.d = obj2;
        this.f24474e = obj3;
    }

    @Override
    public final void a(Object obj) {
        int i3 = this.f24471a;
        String str = null;
        Object obj2 = this.f24474e;
        Object obj3 = this.d;
        long j10 = this.f24472b;
        Object obj4 = this.f24473c;
        switch (i3) {
            case 0:
                x00 x00Var = (x00) obj4;
                zi ziVar = (zi) obj3;
                String str2 = (String) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = ziVar.f26868k;
                if (tL_textWithEntities != null) {
                    str = str2;
                }
                message.translatedSummaryLanguage = str;
                message.translatedSummaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                x00Var.getMessagesStorage().X1(j10, ziVar.f26868k);
                hs.f(x00Var.currentAccount).k(128, ziVar, Boolean.TRUE);
                return;
            case 1:
                x6 x6Var = (x6) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                HashMap hashMap = (HashMap) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_getFactCheck tL_getFactCheck = new TLRPC.TL_getFactCheck();
                int i10 = x6Var.f26347a;
                tL_getFactCheck.peer = hp.s1(i10).j1(j10);
                ArrayList arrayList3 = new ArrayList();
                int i11 = 0;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    w6 w6Var = (w6) arrayList.get(i12);
                    TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) arrayList2.get(i12);
                    if (tL_factCheck == null) {
                        arrayList3.add(w6Var);
                        tL_getFactCheck.msg_id.add(Integer.valueOf(w6Var.f26164a));
                    } else {
                        x6Var.d.remove(w6Var);
                        u10 u10Var = (u10) hashMap.get(w6Var);
                        if (u10Var != null) {
                            u10Var.a(tL_factCheck);
                            i11++;
                        }
                    }
                }
                if (i11 > 0) {
                    hs.f(i10).k(224, new Object[0]);
                }
                if (!tL_getFactCheck.msg_id.isEmpty()) {
                    ConnectionsManager.getInstance(i10).sendRequest(tL_getFactCheck, new q6(x6Var, tL_getFactCheck, arrayList3, hashMap, 0));
                    return;
                }
                return;
            default:
                hp hpVar = (hp) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.yd ydVar = (org.telegram.ui.yd) obj2;
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (((Boolean) obj).booleanValue()) {
                    hpVar.V7.add(Long.valueOf(j10));
                    hpVar.F4(true);
                    if (T != null) {
                        org.telegram.ui.Components.fc.a0(T).P(2131623981, g0.H2(g0.x2(bd.M0(2131745584, null), new hn(0, T)), true)).k(true);
                    }
                    zArr[0] = true;
                    ydVar.run();
                    return;
                } else if (T != null) {
                    org.telegram.ui.Components.fc.a0(T).I(2131624011, bd.M0(2131754311, null), bd.M0(2131754312, null)).j();
                    return;
                } else {
                    return;
                }
        }
    }

    public o00(x00 x00Var, zi ziVar, String str, long j10) {
        this.f24471a = 0;
        this.f24473c = x00Var;
        this.d = ziVar;
        this.f24474e = str;
        this.f24472b = j10;
    }
}
