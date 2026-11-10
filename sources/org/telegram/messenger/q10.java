package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class q10 implements Runnable {
    public final int f24671a;
    public final Object f24672b;
    public final Serializable f24673c;
    public final Object d;
    public final Object f24674e;

    public q10(Object obj, Serializable serializable, Object obj2, Object obj3, int i7) {
        this.f24671a = i7;
        this.f24672b = obj;
        this.f24673c = serializable;
        this.d = obj2;
        this.f24674e = obj3;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f2 Q;
        int i7 = this.f24671a;
        int i10 = 0;
        Object obj = this.f24674e;
        Object obj2 = this.d;
        Serializable serializable = this.f24673c;
        Object obj3 = this.f24672b;
        switch (i7) {
            case 0:
                s10 s10Var = (s10) obj3;
                String str = (String) serializable;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                int i11 = s10Var.f25408a;
                ArrayList arrayList = (ArrayList) s10Var.f25410c.remove(str);
                if (arrayList != null) {
                    if (tL_error != null) {
                        String str2 = tL_error.text;
                        if (str2 != null && "STARREF_EXPIRED".equals(str2)) {
                            while (i10 < arrayList.size()) {
                                ((c20) arrayList.get(i10)).a(Long.MAX_VALUE);
                                i10++;
                            }
                            return;
                        }
                        while (i10 < arrayList.size()) {
                            ((c20) arrayList.get(i10)).a(null);
                            i10++;
                        }
                        String str3 = tL_error.text;
                        if (str3 != null && str3.contains("FLOOD_WAIT") && (Q = LaunchActivity.Q()) != null) {
                            k5.p(null, 2131750687, org.telegram.ui.Components.gc.a0(Q), null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    qp.s1(i11).Y3(tL_contacts_resolvedPeer.users, false);
                    qp.s1(i11).S3(tL_contacts_resolvedPeer.chats, false);
                    yr.a0(i11).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                    long B1 = ij.B1(tL_contacts_resolvedPeer.peer);
                    s10Var.f25409b.put(str, new r10(B1));
                    while (i10 < arrayList.size()) {
                        ((c20) arrayList.get(i10)).a(Long.valueOf(B1));
                        i10++;
                    }
                    return;
                }
                return;
            default:
                m10 m10Var = (m10) obj3;
                HashSet hashSet = (HashSet) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int i12 = m10Var.f23973a;
                qp.s1(i12).Y3((ArrayList) serializable, true);
                ArrayList arrayList3 = m10Var.f23974b;
                boolean isEmpty = arrayList3.isEmpty();
                int i13 = 0;
                while (i13 < arrayList3.size()) {
                    l10 l10Var = (l10) arrayList3.get(i13);
                    if (l10Var != null) {
                        m10 m10Var2 = l10Var.f23836i;
                        if ((ConnectionsManager.getInstance(m10Var2.f23973a).getCurrentTime() + qp.s1(m10Var2.f23973a).f24852n4) - l10Var.d > 0 && !hashSet.contains(Long.valueOf(l10Var.f23832b))) {
                            i13++;
                        }
                    }
                    arrayList3.remove(i13);
                    i13--;
                    i13++;
                }
                arrayList3.addAll(arrayList2);
                boolean isEmpty2 = arrayList3.isEmpty();
                m10Var.f23975c = true;
                m10Var.d = false;
                if (isEmpty != isEmpty2) {
                    qs.f(i12).k(199, new Object[0]);
                }
                m10Var.e();
                if (m10Var.f23976e) {
                    m10Var.f23976e = false;
                    m10Var.d();
                    return;
                }
                return;
        }
    }
}
