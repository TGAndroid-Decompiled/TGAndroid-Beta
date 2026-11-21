package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class k10 implements Runnable {
    public final int f24993a;
    public final Object f24994b;
    public final Serializable f24995c;
    public final Object d;
    public final Object f24996e;

    public k10(Object obj, Serializable serializable, Object obj2, Object obj3, int i7) {
        this.f24993a = i7;
        this.f24994b = obj;
        this.f24995c = serializable;
        this.d = obj2;
        this.f24996e = obj3;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.g2 Q;
        int i7 = this.f24993a;
        int i10 = 0;
        Object obj = this.f24996e;
        Object obj2 = this.d;
        Serializable serializable = this.f24995c;
        Object obj3 = this.f24994b;
        switch (i7) {
            case 0:
                m10 m10Var = (m10) obj3;
                String str = (String) serializable;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                int i11 = m10Var.f25541a;
                ArrayList arrayList = (ArrayList) m10Var.f25543c.remove(str);
                if (arrayList != null) {
                    if (tL_error != null) {
                        String str2 = tL_error.text;
                        if (str2 != null && "STARREF_EXPIRED".equals(str2)) {
                            while (i10 < arrayList.size()) {
                                ((x10) arrayList.get(i10)).a(Long.MAX_VALUE);
                                i10++;
                            }
                            return;
                        }
                        while (i10 < arrayList.size()) {
                            ((x10) arrayList.get(i10)).a(null);
                            i10++;
                        }
                        String str3 = tL_error.text;
                        if (str3 != null && str3.contains("FLOOD_WAIT") && (Q = LaunchActivity.Q()) != null) {
                            f3.o(null, 2131750670, org.telegram.ui.Components.lc.b0(Q), null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    mp.u1(i11).f4(tL_contacts_resolvedPeer.users, false);
                    mp.u1(i11).Z3(tL_contacts_resolvedPeer.chats, false);
                    tr.a0(i11).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                    long B1 = fj.B1(tL_contacts_resolvedPeer.peer);
                    m10Var.f25542b.put(str, new l10(B1));
                    while (i10 < arrayList.size()) {
                        ((x10) arrayList.get(i10)).a(Long.valueOf(B1));
                        i10++;
                    }
                    return;
                }
                return;
            default:
                g10 g10Var = (g10) obj3;
                HashSet hashSet = (HashSet) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int i12 = g10Var.f24163a;
                mp.u1(i12).f4((ArrayList) serializable, true);
                ArrayList arrayList3 = g10Var.f24164b;
                boolean isEmpty = arrayList3.isEmpty();
                int i13 = 0;
                while (i13 < arrayList3.size()) {
                    f10 f10Var = (f10) arrayList3.get(i13);
                    if (f10Var != null) {
                        g10 g10Var2 = f10Var.f23848i;
                        if ((ConnectionsManager.getInstance(g10Var2.f24163a).getCurrentTime() + mp.u1(g10Var2.f24163a).f25767q4) - f10Var.d > 0 && !hashSet.contains(Long.valueOf(f10Var.f23844b))) {
                            i13++;
                        }
                    }
                    arrayList3.remove(i13);
                    i13--;
                    i13++;
                }
                arrayList3.addAll(arrayList2);
                boolean isEmpty2 = arrayList3.isEmpty();
                g10Var.f24165c = true;
                g10Var.d = false;
                if (isEmpty != isEmpty2) {
                    ks.f(i12).k(201, new Object[0]);
                }
                g10Var.e();
                if (g10Var.f24166e) {
                    g10Var.f24166e = false;
                    g10Var.d();
                    return;
                }
                return;
        }
    }
}
