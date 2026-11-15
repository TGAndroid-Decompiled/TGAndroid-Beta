package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class n10 implements Runnable {
    public final int f25138a;
    public final Object f25139b;
    public final Serializable f25140c;
    public final Object d;
    public final Object f25141e;

    public n10(Object obj, Serializable serializable, Object obj2, Object obj3, int i7) {
        this.f25138a = i7;
        this.f25139b = obj;
        this.f25140c = serializable;
        this.d = obj2;
        this.f25141e = obj3;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e2 Q;
        int i7 = this.f25138a;
        int i10 = 0;
        Object obj = this.f25141e;
        Object obj2 = this.d;
        Serializable serializable = this.f25140c;
        Object obj3 = this.f25139b;
        switch (i7) {
            case 0:
                p10 p10Var = (p10) obj3;
                String str = (String) serializable;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                int i11 = p10Var.f25876a;
                ArrayList arrayList = (ArrayList) p10Var.f25878c.remove(str);
                if (arrayList != null) {
                    if (tL_error != null) {
                        String str2 = tL_error.text;
                        if (str2 != null && "STARREF_EXPIRED".equals(str2)) {
                            while (i10 < arrayList.size()) {
                                ((z10) arrayList.get(i10)).a(Long.MAX_VALUE);
                                i10++;
                            }
                            return;
                        }
                        while (i10 < arrayList.size()) {
                            ((z10) arrayList.get(i10)).a(null);
                            i10++;
                        }
                        String str3 = tL_error.text;
                        if (str3 != null && str3.contains("FLOOD_WAIT") && (Q = LaunchActivity.Q()) != null) {
                            k5.o(null, 2131750687, org.telegram.ui.Components.cc.a0(Q), null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    np.s1(i11).Y3(tL_contacts_resolvedPeer.users, false);
                    np.s1(i11).S3(tL_contacts_resolvedPeer.chats, false);
                    vr.a0(i11).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                    long B1 = gj.B1(tL_contacts_resolvedPeer.peer);
                    p10Var.f25877b.put(str, new o10(B1));
                    while (i10 < arrayList.size()) {
                        ((z10) arrayList.get(i10)).a(Long.valueOf(B1));
                        i10++;
                    }
                    return;
                }
                return;
            default:
                j10 j10Var = (j10) obj3;
                HashSet hashSet = (HashSet) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int i12 = j10Var.f24501a;
                np.s1(i12).Y3((ArrayList) serializable, true);
                ArrayList arrayList3 = j10Var.f24502b;
                boolean isEmpty = arrayList3.isEmpty();
                int i13 = 0;
                while (i13 < arrayList3.size()) {
                    i10 i10Var = (i10) arrayList3.get(i13);
                    if (i10Var != null) {
                        j10 j10Var2 = i10Var.f24269i;
                        if ((ConnectionsManager.getInstance(j10Var2.f24501a).getCurrentTime() + np.s1(j10Var2.f24501a).o4) - i10Var.d > 0 && !hashSet.contains(Long.valueOf(i10Var.f24265b))) {
                            i13++;
                        }
                    }
                    arrayList3.remove(i13);
                    i13--;
                    i13++;
                }
                arrayList3.addAll(arrayList2);
                boolean isEmpty2 = arrayList3.isEmpty();
                j10Var.f24503c = true;
                j10Var.d = false;
                if (isEmpty != isEmpty2) {
                    ns.f(i12).k(199, new Object[0]);
                }
                j10Var.e();
                if (j10Var.f24504e) {
                    j10Var.f24504e = false;
                    j10Var.d();
                    return;
                }
                return;
        }
    }
}
