package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class l10 implements Runnable {
    public final int f25187a;
    public final Object f25188b;
    public final Serializable f25189c;
    public final Object d;
    public final Object f25190e;

    public l10(Object obj, Serializable serializable, Object obj2, Object obj3, int i7) {
        this.f25187a = i7;
        this.f25188b = obj;
        this.f25189c = serializable;
        this.d = obj2;
        this.f25190e = obj3;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.g2 Q;
        int i7 = this.f25187a;
        int i10 = 0;
        Object obj = this.f25190e;
        Object obj2 = this.d;
        Serializable serializable = this.f25189c;
        Object obj3 = this.f25188b;
        switch (i7) {
            case 0:
                n10 n10Var = (n10) obj3;
                String str = (String) serializable;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                int i11 = n10Var.f25717a;
                ArrayList arrayList = (ArrayList) n10Var.f25719c.remove(str);
                if (arrayList != null) {
                    if (tL_error != null) {
                        String str2 = tL_error.text;
                        if (str2 != null && "STARREF_EXPIRED".equals(str2)) {
                            while (i10 < arrayList.size()) {
                                ((y10) arrayList.get(i10)).a(Long.MAX_VALUE);
                                i10++;
                            }
                            return;
                        }
                        while (i10 < arrayList.size()) {
                            ((y10) arrayList.get(i10)).a(null);
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
                    np.u1(i11).f4(tL_contacts_resolvedPeer.users, false);
                    np.u1(i11).Z3(tL_contacts_resolvedPeer.chats, false);
                    ur.a0(i11).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                    long B1 = gj.B1(tL_contacts_resolvedPeer.peer);
                    n10Var.f25718b.put(str, new m10(B1));
                    while (i10 < arrayList.size()) {
                        ((y10) arrayList.get(i10)).a(Long.valueOf(B1));
                        i10++;
                    }
                    return;
                }
                return;
            default:
                h10 h10Var = (h10) obj3;
                HashSet hashSet = (HashSet) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int i12 = h10Var.f24358a;
                np.u1(i12).f4((ArrayList) serializable, true);
                ArrayList arrayList3 = h10Var.f24359b;
                boolean isEmpty = arrayList3.isEmpty();
                int i13 = 0;
                while (i13 < arrayList3.size()) {
                    g10 g10Var = (g10) arrayList3.get(i13);
                    if (g10Var != null) {
                        h10 h10Var2 = g10Var.f24066i;
                        if ((ConnectionsManager.getInstance(h10Var2.f24358a).getCurrentTime() + np.u1(h10Var2.f24358a).f25938q4) - g10Var.d > 0 && !hashSet.contains(Long.valueOf(g10Var.f24062b))) {
                            i13++;
                        }
                    }
                    arrayList3.remove(i13);
                    i13--;
                    i13++;
                }
                arrayList3.addAll(arrayList2);
                boolean isEmpty2 = arrayList3.isEmpty();
                h10Var.f24360c = true;
                h10Var.d = false;
                if (isEmpty != isEmpty2) {
                    ls.f(i12).k(201, new Object[0]);
                }
                h10Var.e();
                if (h10Var.f24361e) {
                    h10Var.f24361e = false;
                    h10Var.d();
                    return;
                }
                return;
        }
    }
}
