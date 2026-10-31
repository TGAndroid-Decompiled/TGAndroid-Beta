package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class k10 implements q20 {
    public final int f16513a;
    public final long f16514b;
    public final Object f16515c;
    public final Object d;
    public final Object e;

    public k10(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f16513a = i10;
        this.f16515c = obj;
        this.f16514b = j10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f16513a;
        String str = null;
        Object obj2 = this.e;
        Object obj3 = this.d;
        long j10 = this.f16514b;
        Object obj4 = this.f16515c;
        switch (i10) {
            case 0:
                t10 t10Var = (t10) obj4;
                jj jjVar = (jj) obj3;
                String str2 = (String) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = jjVar.f16337k;
                if (tL_textWithEntities != null) {
                    str = str2;
                }
                message.translatedSummaryLanguage = str;
                message.translatedSummaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                t10Var.getMessagesStorage().X1(j10, jjVar.f16337k);
                zs.f(t10Var.currentAccount).k(128, jjVar, Boolean.TRUE);
                return;
            case 1:
                a7 a7Var = (a7) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                HashMap hashMap = (HashMap) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_getFactCheck tL_getFactCheck = new TLRPC.TL_getFactCheck();
                int i11 = a7Var.f14585a;
                tL_getFactCheck.peer = vp.r1(i11).i1(j10);
                ArrayList arrayList3 = new ArrayList();
                int i12 = 0;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    z6 z6Var = (z6) arrayList.get(i13);
                    TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) arrayList2.get(i13);
                    if (tL_factCheck == null) {
                        arrayList3.add(z6Var);
                        tL_getFactCheck.msg_id.add(Integer.valueOf(z6Var.f19484a));
                    } else {
                        a7Var.d.remove(z6Var);
                        q20 q20Var = (q20) hashMap.get(z6Var);
                        if (q20Var != null) {
                            q20Var.a(tL_factCheck);
                            i12++;
                        }
                    }
                }
                if (i12 > 0) {
                    zs.f(i11).k(224, new Object[0]);
                }
                if (!tL_getFactCheck.msg_id.isEmpty()) {
                    ConnectionsManager.getInstance(i11).sendRequest(tL_getFactCheck, new r6(a7Var, tL_getFactCheck, arrayList3, hashMap, 0));
                    return;
                }
                return;
            default:
                vp vpVar = (vp) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.me meVar = (org.telegram.ui.me) obj2;
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (((Boolean) obj).booleanValue()) {
                    vpVar.W7.add(Long.valueOf(j10));
                    vpVar.C4(true);
                    if (T != null) {
                        org.telegram.ui.Components.cc.a0(T).P(2131623981, i0.G2(i0.x2(cd.L0(2131745591, null), new xn(0, T)), true)).k(true);
                    }
                    zArr[0] = true;
                    meVar.run();
                    return;
                } else if (T != null) {
                    org.telegram.ui.Components.cc.a0(T).I(2131624011, cd.L0(2131754311, null), cd.L0(2131754312, null)).j();
                    return;
                } else {
                    return;
                }
        }
    }

    public k10(t10 t10Var, jj jjVar, String str, long j10) {
        this.f16513a = 0;
        this.f16515c = t10Var;
        this.d = jjVar;
        this.e = str;
        this.f16514b = j10;
    }
}
