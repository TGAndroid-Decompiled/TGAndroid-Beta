package hi;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class a8 implements View.OnClickListener {
    public final int f14193a;
    public final l8 f14194b;

    public a8(l8 l8Var, int i7) {
        this.f14193a = i7;
        this.f14194b = l8Var;
    }

    @Override
    public final void onClick(View view) {
        o8 o8Var;
        int i7 = this.f14193a;
        l8 l8Var = this.f14194b;
        switch (i7) {
            case 0:
                HashMap hashMap = l8Var.d;
                ArrayList arrayList = l8Var.f14944c;
                q8 q8Var = l8Var.f14942a0;
                d dVar = l8Var.f14950w;
                if (!dVar.R) {
                    int i10 = q8.Y1;
                    int i11 = q8Var.f30139a;
                    HashMap hashMap2 = q8Var.f15244p1;
                    ArrayList arrayList2 = q8Var.f15243o1;
                    HashMap hashMap3 = q8Var.f15248t1;
                    ArrayList arrayList3 = q8Var.f15247s1;
                    np u12 = np.u1(i11);
                    int i12 = l8Var.f14941a;
                    if (i12 == 5) {
                        c8 c8Var = q8Var.Q1;
                        if (c8Var != null) {
                            c8Var.a(arrayList);
                        }
                        q8Var.dismiss();
                        return;
                    } else if (i12 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.f28448id.addAll(arrayList);
                        dVar.setLoading(true);
                        ConnectionsManager.getInstance(q8Var.f30139a).sendRequest(tL_editCloseFriends, new bi.o1(17, l8Var, u12));
                        return;
                    } else if (i12 == 0) {
                        int i13 = q8Var.I1;
                        if (i13 == 3) {
                            o8Var = new o8(q8Var.I1, q8Var.f30139a, new ArrayList(q8.S0(arrayList3, hashMap3)));
                            ArrayList arrayList4 = o8Var.f15152c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = o8Var.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i13 == 2) {
                            o8Var = new o8(i13, q8Var.f30139a, q8Var.f15246r1);
                        } else if (i13 == 4) {
                            o8Var = new o8(q8Var.I1, q8Var.f30139a, new ArrayList(q8.S0(arrayList2, hashMap2)));
                            ArrayList arrayList5 = o8Var.f15152c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = o8Var.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        } else {
                            o8Var = new o8(i13, q8Var.f30139a, (ArrayList) null);
                        }
                        q8Var.O0(o8Var, new fi.o3(q8Var, 1), false);
                        return;
                    } else if (i12 == 2) {
                        if (q8Var.U1) {
                            q8Var.N0();
                            q8Var.O0(new o8(2, q8Var.f30139a, arrayList), new fi.o3(q8Var, 1), false);
                            return;
                        }
                        q8Var.N0();
                        q8Var.f15242m1.A(0);
                        return;
                    } else if (i12 == 3) {
                        if (q8Var.U1) {
                            HashSet S0 = q8.S0(arrayList, hashMap);
                            if (!S0.isEmpty()) {
                                q8Var.N0();
                                o8 o8Var2 = new o8(3, q8Var.f30139a, new ArrayList(S0));
                                ArrayList arrayList6 = o8Var2.f15152c;
                                arrayList6.clear();
                                arrayList6.addAll(arrayList);
                                HashMap hashMap6 = o8Var2.d;
                                hashMap6.clear();
                                hashMap6.putAll(hashMap);
                                q8Var.O0(o8Var2, new b8(l8Var, 0), false);
                                return;
                            }
                            return;
                        } else if (!q8.S0(arrayList, hashMap).isEmpty()) {
                            q8Var.I1 = 3;
                            q8Var.N0();
                            q8Var.f15242m1.A(0);
                            return;
                        } else {
                            return;
                        }
                    } else if (i12 == 6) {
                        HashSet S02 = q8.S0(arrayList, hashMap);
                        dVar.setLoading(true);
                        fi.p6 R1 = np.u1(q8Var.f30139a).R1();
                        b8 b8Var = new b8(l8Var, 1);
                        int i14 = R1.f12377a;
                        TLRPC.TL_contacts_setBlocked tL_contacts_setBlocked = new TLRPC.TL_contacts_setBlocked();
                        tL_contacts_setBlocked.my_stories_from = true;
                        HashSet hashSet = R1.L;
                        tL_contacts_setBlocked.limit = hashSet.size();
                        int size = R1.N - hashSet.size();
                        R1.N = size;
                        if (size < 0) {
                            R1.N = 0;
                        }
                        hashSet.clear();
                        Iterator it = S02.iterator();
                        while (it.hasNext()) {
                            Long l10 = (Long) it.next();
                            TLRPC.InputPeer l1 = np.u1(i14).l1(l10.longValue());
                            if (!(l1 instanceof TLRPC.TL_inputPeerEmpty)) {
                                hashSet.add(l10);
                                tL_contacts_setBlocked.f28445id.add(l1);
                            }
                        }
                        R1.N = hashSet.size() + R1.N;
                        tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                        ConnectionsManager.getInstance(i14).sendRequest(tL_contacts_setBlocked, new ai.a1(b8Var, 6));
                        return;
                    } else {
                        q8Var.I1 = i12;
                        q8Var.N0();
                        q8Var.f15242m1.A(0);
                        return;
                    }
                }
                return;
            case 1:
                q8 q8Var2 = l8Var.f14942a0;
                if (q8Var2.J1) {
                    q8Var2.H1 = 5;
                    q8Var2.f15242m1.A(1);
                    return;
                }
                q8 q8Var3 = new q8(l8Var.getContext(), q8Var2.J0);
                q8Var3.Q1 = new c8(l8Var, 1);
                q8Var3.L1 = q8Var2.L1;
                q8Var3.show();
                return;
            default:
                HashMap hashMap7 = l8Var.d;
                a0.h hVar = l8Var.f14943b;
                ArrayList arrayList7 = l8Var.f14944c;
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
                l8Var.f14942a0.E1.clear();
                l8Var.f14952y.d.a();
                l8Var.g(true);
                l8Var.f(true);
                return;
        }
    }
}
