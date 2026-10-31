package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class e20 implements Runnable {
    public final int f15359a;
    public final Object f15360b;
    public final Serializable f15361c;
    public final Object d;
    public final Object e;

    public e20(Object obj, Serializable serializable, Object obj2, Object obj3, int i10) {
        this.f15359a = i10;
        this.f15360b = obj;
        this.f15361c = serializable;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.k2 Q;
        int i10 = this.f15359a;
        int i11 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Serializable serializable = this.f15361c;
        Object obj3 = this.f15360b;
        switch (i10) {
            case 0:
                g20 g20Var = (g20) obj3;
                String str = (String) serializable;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                int i12 = g20Var.f15662a;
                ArrayList arrayList = (ArrayList) g20Var.f15664c.remove(str);
                if (arrayList != null) {
                    if (tL_error != null) {
                        String str2 = tL_error.text;
                        if (str2 != null && "STARREF_EXPIRED".equals(str2)) {
                            while (i11 < arrayList.size()) {
                                ((q20) arrayList.get(i11)).a(Long.MAX_VALUE);
                                i11++;
                            }
                            return;
                        }
                        while (i11 < arrayList.size()) {
                            ((q20) arrayList.get(i11)).a(null);
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
                    vp.r1(i12).V3(tL_contacts_resolvedPeer.users, false);
                    vp.r1(i12).P3(tL_contacts_resolvedPeer.chats, false);
                    hs.a0(i12).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                    long C1 = jj.C1(tL_contacts_resolvedPeer.peer);
                    g20Var.f15663b.put(str, new f20(C1));
                    while (i11 < arrayList.size()) {
                        ((q20) arrayList.get(i11)).a(Long.valueOf(C1));
                        i11++;
                    }
                    return;
                }
                return;
            default:
                a20 a20Var = (a20) obj3;
                HashSet hashSet = (HashSet) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int i13 = a20Var.f14560a;
                vp.r1(i13).V3((ArrayList) serializable, true);
                ArrayList arrayList3 = a20Var.f14561b;
                boolean isEmpty = arrayList3.isEmpty();
                int i14 = 0;
                while (i14 < arrayList3.size()) {
                    z10 z10Var = (z10) arrayList3.get(i14);
                    if (z10Var != null) {
                        a20 a20Var2 = z10Var.f19474i;
                        if ((ConnectionsManager.getInstance(a20Var2.f14560a).getCurrentTime() + vp.r1(a20Var2.f14560a).f18862o4) - z10Var.d > 0 && !hashSet.contains(Long.valueOf(z10Var.f19471b))) {
                            i14++;
                        }
                    }
                    arrayList3.remove(i14);
                    i14--;
                    i14++;
                }
                arrayList3.addAll(arrayList2);
                boolean isEmpty2 = arrayList3.isEmpty();
                a20Var.f14562c = true;
                a20Var.d = false;
                if (isEmpty != isEmpty2) {
                    zs.f(i13).k(199, new Object[0]);
                }
                a20Var.e();
                if (a20Var.e) {
                    a20Var.e = false;
                    a20Var.d();
                    return;
                }
                return;
        }
    }
}
