package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class j10 implements Runnable {
    public final int f24907a;
    public final Object f24908b;
    public final Serializable f24909c;
    public final Object d;
    public final Object f24910e;

    public j10(Object obj, Serializable serializable, Object obj2, Object obj3, int i7) {
        this.f24907a = i7;
        this.f24908b = obj;
        this.f24909c = serializable;
        this.d = obj2;
        this.f24910e = obj3;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.g2 Q;
        int i7 = this.f24907a;
        int i10 = 0;
        Object obj = this.f24910e;
        Object obj2 = this.d;
        Serializable serializable = this.f24909c;
        Object obj3 = this.f24908b;
        switch (i7) {
            case 0:
                l10 l10Var = (l10) obj3;
                String str = (String) serializable;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                int i11 = l10Var.f25438a;
                ArrayList arrayList = (ArrayList) l10Var.f25440c.remove(str);
                if (arrayList != null) {
                    if (tL_error != null) {
                        String str2 = tL_error.text;
                        if (str2 != null && "STARREF_EXPIRED".equals(str2)) {
                            while (i10 < arrayList.size()) {
                                ((w10) arrayList.get(i10)).a(Long.MAX_VALUE);
                                i10++;
                            }
                            return;
                        }
                        while (i10 < arrayList.size()) {
                            ((w10) arrayList.get(i10)).a(null);
                            i10++;
                        }
                        String str3 = tL_error.text;
                        if (str3 != null && str3.contains("FLOOD_WAIT") && (Q = LaunchActivity.Q()) != null) {
                            f3.o(null, 2131750670, org.telegram.ui.Components.kc.b0(Q), null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    mp.u1(i11).f4(tL_contacts_resolvedPeer.users, false);
                    mp.u1(i11).Z3(tL_contacts_resolvedPeer.chats, false);
                    tr.a0(i11).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                    long B1 = fj.B1(tL_contacts_resolvedPeer.peer);
                    l10Var.f25439b.put(str, new k10(B1));
                    while (i10 < arrayList.size()) {
                        ((w10) arrayList.get(i10)).a(Long.valueOf(B1));
                        i10++;
                    }
                    return;
                }
                return;
            default:
                f10 f10Var = (f10) obj3;
                HashSet hashSet = (HashSet) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int i12 = f10Var.f23922a;
                mp.u1(i12).f4((ArrayList) serializable, true);
                ArrayList arrayList3 = f10Var.f23923b;
                boolean isEmpty = arrayList3.isEmpty();
                int i13 = 0;
                while (i13 < arrayList3.size()) {
                    e10 e10Var = (e10) arrayList3.get(i13);
                    if (e10Var != null) {
                        f10 f10Var2 = e10Var.f23758i;
                        if ((ConnectionsManager.getInstance(f10Var2.f23922a).getCurrentTime() + mp.u1(f10Var2.f23922a).f25834q4) - e10Var.d > 0 && !hashSet.contains(Long.valueOf(e10Var.f23754b))) {
                            i13++;
                        }
                    }
                    arrayList3.remove(i13);
                    i13--;
                    i13++;
                }
                arrayList3.addAll(arrayList2);
                boolean isEmpty2 = arrayList3.isEmpty();
                f10Var.f23924c = true;
                f10Var.d = false;
                if (isEmpty != isEmpty2) {
                    ks.f(i12).k(201, new Object[0]);
                }
                f10Var.e();
                if (f10Var.f23925e) {
                    f10Var.f23925e = false;
                    f10Var.d();
                    return;
                }
                return;
        }
    }
}
