package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class l10 implements r20 {
    public final int f16862a;
    public final long f16863b;
    public final Object f16864c;
    public final Object d;
    public final Object e;

    public l10(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f16862a = i10;
        this.f16864c = obj;
        this.f16863b = j10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f16862a;
        String str = null;
        Object obj2 = this.e;
        Object obj3 = this.d;
        long j10 = this.f16863b;
        Object obj4 = this.f16864c;
        switch (i10) {
            case 0:
                u10 u10Var = (u10) obj4;
                kj kjVar = (kj) obj3;
                String str2 = (String) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = kjVar.f16690k;
                if (tL_textWithEntities != null) {
                    str = str2;
                }
                message.translatedSummaryLanguage = str;
                message.translatedSummaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                u10Var.getMessagesStorage().X1(j10, kjVar.f16690k);
                at.f(u10Var.currentAccount).k(128, kjVar, Boolean.TRUE);
                return;
            case 1:
                a7 a7Var = (a7) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                HashMap hashMap = (HashMap) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_getFactCheck tL_getFactCheck = new TLRPC.TL_getFactCheck();
                int i11 = a7Var.f14575a;
                tL_getFactCheck.peer = wp.r1(i11).i1(j10);
                ArrayList arrayList3 = new ArrayList();
                int i12 = 0;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    z6 z6Var = (z6) arrayList.get(i13);
                    TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) arrayList2.get(i13);
                    if (tL_factCheck == null) {
                        arrayList3.add(z6Var);
                        tL_getFactCheck.msg_id.add(Integer.valueOf(z6Var.f19669a));
                    } else {
                        a7Var.d.remove(z6Var);
                        r20 r20Var = (r20) hashMap.get(z6Var);
                        if (r20Var != null) {
                            r20Var.a(tL_factCheck);
                            i12++;
                        }
                    }
                }
                if (i12 > 0) {
                    at.f(i11).k(224, new Object[0]);
                }
                if (!tL_getFactCheck.msg_id.isEmpty()) {
                    ConnectionsManager.getInstance(i11).sendRequest(tL_getFactCheck, new r6(a7Var, tL_getFactCheck, arrayList3, hashMap, 0));
                    return;
                }
                return;
            default:
                wp wpVar = (wp) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.me meVar = (org.telegram.ui.me) obj2;
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (((Boolean) obj).booleanValue()) {
                    wpVar.W7.add(Long.valueOf(j10));
                    wpVar.C4(true);
                    if (T != null) {
                        org.telegram.ui.Components.cc.a0(T).P(2131623981, i0.G2(i0.x2(dd.L0(2131745591, null), new yn(0, T)), true)).k(true);
                    }
                    zArr[0] = true;
                    meVar.run();
                    return;
                } else if (T != null) {
                    org.telegram.ui.Components.cc.a0(T).I(2131624011, dd.L0(2131754311, null), dd.L0(2131754312, null)).j();
                    return;
                } else {
                    return;
                }
        }
    }

    public l10(u10 u10Var, kj kjVar, String str, long j10) {
        this.f16862a = 0;
        this.f16864c = u10Var;
        this.d = kjVar;
        this.e = str;
        this.f16863b = j10;
    }
}
