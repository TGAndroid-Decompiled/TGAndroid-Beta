package gi;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class b8 implements View.OnClickListener {
    public final int f12460a;
    public final o8 f12461b;

    public b8(o8 o8Var, int i3) {
        this.f12460a = i3;
        this.f12461b = o8Var;
    }

    @Override
    public final void onClick(View view) {
        r8 r8Var;
        int i3 = this.f12460a;
        o8 o8Var = this.f12461b;
        switch (i3) {
            case 0:
                HashMap hashMap = o8Var.d;
                ArrayList arrayList = o8Var.f13342c;
                t8 t8Var = o8Var.f13340a0;
                d dVar = o8Var.f13348w;
                if (!dVar.R) {
                    int i10 = t8.V1;
                    int i11 = t8Var.f28583a;
                    HashMap hashMap2 = t8Var.m1;
                    ArrayList arrayList2 = t8Var.f13622l1;
                    HashMap hashMap3 = t8Var.f13626q1;
                    ArrayList arrayList3 = t8Var.f13625p1;
                    hp s12 = hp.s1(i11);
                    int i12 = o8Var.f13339a;
                    if (i12 == 5) {
                        d8 d8Var = t8Var.N1;
                        if (d8Var != null) {
                            d8Var.a(arrayList);
                        }
                        t8Var.dismiss();
                        return;
                    } else if (i12 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.f27051id.addAll(arrayList);
                        dVar.setLoading(true);
                        ConnectionsManager.getInstance(t8Var.f28583a).sendRequest(tL_editCloseFriends, new ai.f3(17, o8Var, s12));
                        return;
                    } else if (i12 == 0) {
                        int i13 = t8Var.F1;
                        if (i13 == 3) {
                            r8Var = new r8(t8Var.F1, t8Var.f28583a, new ArrayList(t8.R0(arrayList3, hashMap3)));
                            ArrayList arrayList4 = r8Var.f13528c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = r8Var.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i13 == 2) {
                            r8Var = new r8(i13, t8Var.f28583a, t8Var.f13624o1);
                        } else if (i13 == 4) {
                            r8Var = new r8(t8Var.F1, t8Var.f28583a, new ArrayList(t8.R0(arrayList2, hashMap2)));
                            ArrayList arrayList5 = r8Var.f13528c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = r8Var.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        } else {
                            r8Var = new r8(i13, t8Var.f28583a, (ArrayList) null);
                        }
                        t8Var.N0(r8Var, new ei.y3(t8Var, 1), false);
                        return;
                    } else if (i12 == 2) {
                        if (t8Var.R1) {
                            t8Var.M0();
                            t8Var.N0(new r8(2, t8Var.f28583a, arrayList), new ei.y3(t8Var, 1), false);
                            return;
                        }
                        t8Var.M0();
                        t8Var.f13621j1.D(0);
                        return;
                    } else if (i12 == 3) {
                        if (t8Var.R1) {
                            HashSet R0 = t8.R0(arrayList, hashMap);
                            if (!R0.isEmpty()) {
                                t8Var.M0();
                                r8 r8Var2 = new r8(3, t8Var.f28583a, new ArrayList(R0));
                                ArrayList arrayList6 = r8Var2.f13528c;
                                arrayList6.clear();
                                arrayList6.addAll(arrayList);
                                HashMap hashMap6 = r8Var2.d;
                                hashMap6.clear();
                                hashMap6.putAll(hashMap);
                                t8Var.N0(r8Var2, new c8(o8Var, 0), false);
                                return;
                            }
                            return;
                        } else if (!t8.R0(arrayList, hashMap).isEmpty()) {
                            t8Var.F1 = 3;
                            t8Var.M0();
                            t8Var.f13621j1.D(0);
                            return;
                        } else {
                            return;
                        }
                    } else if (i12 == 6) {
                        HashSet R02 = t8.R0(arrayList, hashMap);
                        dVar.setLoading(true);
                        ei.z6 P1 = hp.s1(t8Var.f28583a).P1();
                        c8 c8Var = new c8(o8Var, 1);
                        int i14 = P1.f11274a;
                        TLRPC.TL_contacts_setBlocked tL_contacts_setBlocked = new TLRPC.TL_contacts_setBlocked();
                        tL_contacts_setBlocked.my_stories_from = true;
                        HashSet hashSet = P1.L;
                        tL_contacts_setBlocked.limit = hashSet.size();
                        int size = P1.N - hashSet.size();
                        P1.N = size;
                        if (size < 0) {
                            P1.N = 0;
                        }
                        hashSet.clear();
                        Iterator it = R02.iterator();
                        while (it.hasNext()) {
                            Long l10 = (Long) it.next();
                            TLRPC.InputPeer j12 = hp.s1(i14).j1(l10.longValue());
                            if (!(j12 instanceof TLRPC.TL_inputPeerEmpty)) {
                                hashSet.add(l10);
                                tL_contacts_setBlocked.f27048id.add(j12);
                            }
                        }
                        P1.N = hashSet.size() + P1.N;
                        tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                        ConnectionsManager.getInstance(i14).sendRequest(tL_contacts_setBlocked, new ci.d0(c8Var, 5));
                        return;
                    } else {
                        t8Var.F1 = i12;
                        t8Var.M0();
                        t8Var.f13621j1.D(0);
                        return;
                    }
                }
                return;
            case 1:
                t8 t8Var2 = o8Var.f13340a0;
                if (t8Var2.G1) {
                    t8Var2.E1 = 5;
                    t8Var2.f13621j1.D(1);
                    return;
                }
                t8 t8Var3 = new t8(o8Var.getContext(), t8Var2.J0);
                t8Var3.N1 = new d8(o8Var, 1);
                t8Var3.I1 = t8Var2.I1;
                t8Var3.show();
                return;
            default:
                HashMap hashMap7 = o8Var.d;
                a0.h hVar = o8Var.f13341b;
                ArrayList arrayList7 = o8Var.f13342c;
                int size2 = arrayList7.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj = arrayList7.get(i15);
                    i15++;
                    hVar.k(Boolean.FALSE, ((Long) obj).longValue());
                }
                for (ArrayList arrayList8 : hashMap7.values()) {
                    int size3 = arrayList8.size();
                    int i16 = 0;
                    while (i16 < size3) {
                        Object obj2 = arrayList8.get(i16);
                        i16++;
                        hVar.k(Boolean.FALSE, ((Long) obj2).longValue());
                    }
                }
                arrayList7.clear();
                hashMap7.clear();
                o8Var.f13340a0.B1.clear();
                o8Var.f13350y.d.a();
                o8Var.g(true);
                o8Var.f(true);
                return;
        }
    }
}
