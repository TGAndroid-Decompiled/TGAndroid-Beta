package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class i10 implements Runnable {
    public final int f23422a;
    public final Object f23423b;
    public final Serializable f23424c;
    public final Object d;
    public final Object f23425e;

    public i10(Object obj, Serializable serializable, Object obj2, Object obj3, int i3) {
        this.f23422a = i3;
        this.f23423b = obj;
        this.f23424c = serializable;
        this.d = obj2;
        this.f23425e = obj3;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.d2 Q;
        int i3 = this.f23422a;
        int i10 = 0;
        Object obj = this.f23425e;
        Object obj2 = this.d;
        Serializable serializable = this.f23424c;
        Object obj3 = this.f23423b;
        switch (i3) {
            case 0:
                k10 k10Var = (k10) obj3;
                String str = (String) serializable;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                int i11 = k10Var.f23788a;
                ArrayList arrayList = (ArrayList) k10Var.f23790c.remove(str);
                if (arrayList != null) {
                    if (tL_error != null) {
                        String str2 = tL_error.text;
                        if (str2 != null && "STARREF_EXPIRED".equals(str2)) {
                            while (i10 < arrayList.size()) {
                                ((u10) arrayList.get(i10)).a(Long.MAX_VALUE);
                                i10++;
                            }
                            return;
                        }
                        while (i10 < arrayList.size()) {
                            ((u10) arrayList.get(i10)).a(null);
                            i10++;
                        }
                        String str3 = tL_error.text;
                        if (str3 != null && str3.contains("FLOOD_WAIT") && (Q = LaunchActivity.Q()) != null) {
                            k5.p(null, 2131750688, org.telegram.ui.Components.fc.a0(Q), null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    hp.s1(i11).Y3(tL_contacts_resolvedPeer.users, false);
                    hp.s1(i11).S3(tL_contacts_resolvedPeer.chats, false);
                    qr.a0(i11).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                    long C1 = zi.C1(tL_contacts_resolvedPeer.peer);
                    k10Var.f23789b.put(str, new j10(C1));
                    while (i10 < arrayList.size()) {
                        ((u10) arrayList.get(i10)).a(Long.valueOf(C1));
                        i10++;
                    }
                    return;
                }
                return;
            default:
                e10 e10Var = (e10) obj3;
                HashSet hashSet = (HashSet) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int i12 = e10Var.f22287a;
                hp.s1(i12).Y3((ArrayList) serializable, true);
                ArrayList arrayList3 = e10Var.f22288b;
                boolean isEmpty = arrayList3.isEmpty();
                int i13 = 0;
                while (i13 < arrayList3.size()) {
                    d10 d10Var = (d10) arrayList3.get(i13);
                    if (d10Var != null) {
                        e10 e10Var2 = d10Var.f22126i;
                        if ((ConnectionsManager.getInstance(e10Var2.f22287a).getCurrentTime() + hp.s1(e10Var2.f22287a).n4) - d10Var.d > 0 && !hashSet.contains(Long.valueOf(d10Var.f22122b))) {
                            i13++;
                        }
                    }
                    arrayList3.remove(i13);
                    i13--;
                    i13++;
                }
                arrayList3.addAll(arrayList2);
                boolean isEmpty2 = arrayList3.isEmpty();
                e10Var.f22289c = true;
                e10Var.d = false;
                if (isEmpty != isEmpty2) {
                    hs.f(i12).k(199, new Object[0]);
                }
                e10Var.e();
                if (e10Var.f22290e) {
                    e10Var.f22290e = false;
                    e10Var.d();
                    return;
                }
                return;
        }
    }
}
