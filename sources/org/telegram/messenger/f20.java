package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class f20 implements Runnable {
    public final int f15685a;
    public final Object f15686b;
    public final Serializable f15687c;
    public final Object d;
    public final Object e;

    public f20(Object obj, Serializable serializable, Object obj2, Object obj3, int i10) {
        this.f15685a = i10;
        this.f15686b = obj;
        this.f15687c = serializable;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.k2 Q;
        int i10 = this.f15685a;
        int i11 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Serializable serializable = this.f15687c;
        Object obj3 = this.f15686b;
        switch (i10) {
            case 0:
                h20 h20Var = (h20) obj3;
                String str = (String) serializable;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                int i12 = h20Var.f16002a;
                ArrayList arrayList = (ArrayList) h20Var.f16004c.remove(str);
                if (arrayList != null) {
                    if (tL_error != null) {
                        String str2 = tL_error.text;
                        if (str2 != null && "STARREF_EXPIRED".equals(str2)) {
                            while (i11 < arrayList.size()) {
                                ((r20) arrayList.get(i11)).a(Long.MAX_VALUE);
                                i11++;
                            }
                            return;
                        }
                        while (i11 < arrayList.size()) {
                            ((r20) arrayList.get(i11)).a(null);
                            i11++;
                        }
                        String str3 = tL_error.text;
                        if (str3 != null && str3.contains("FLOOD_WAIT") && (Q = LaunchActivity.Q()) != null) {
                            m5.o(null, 2131750688, org.telegram.ui.Components.cc.a0(Q), null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    wp.r1(i12).V3(tL_contacts_resolvedPeer.users, false);
                    wp.r1(i12).P3(tL_contacts_resolvedPeer.chats, false);
                    is.a0(i12).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                    long C1 = kj.C1(tL_contacts_resolvedPeer.peer);
                    h20Var.f16003b.put(str, new g20(C1));
                    while (i11 < arrayList.size()) {
                        ((r20) arrayList.get(i11)).a(Long.valueOf(C1));
                        i11++;
                    }
                    return;
                }
                return;
            default:
                b20 b20Var = (b20) obj3;
                HashSet hashSet = (HashSet) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int i13 = b20Var.f14906a;
                wp.r1(i13).V3((ArrayList) serializable, true);
                ArrayList arrayList3 = b20Var.f14907b;
                boolean isEmpty = arrayList3.isEmpty();
                int i14 = 0;
                while (i14 < arrayList3.size()) {
                    a20 a20Var = (a20) arrayList3.get(i14);
                    if (a20Var != null) {
                        b20 b20Var2 = a20Var.f14559i;
                        if ((ConnectionsManager.getInstance(b20Var2.f14906a).getCurrentTime() + wp.r1(b20Var2.f14906a).f19205o4) - a20Var.d > 0 && !hashSet.contains(Long.valueOf(a20Var.f14556b))) {
                            i14++;
                        }
                    }
                    arrayList3.remove(i14);
                    i14--;
                    i14++;
                }
                arrayList3.addAll(arrayList2);
                boolean isEmpty2 = arrayList3.isEmpty();
                b20Var.f14908c = true;
                b20Var.d = false;
                if (isEmpty != isEmpty2) {
                    at.f(i13).k(199, new Object[0]);
                }
                b20Var.e();
                if (b20Var.e) {
                    b20Var.e = false;
                    b20Var.d();
                    return;
                }
                return;
        }
    }
}
