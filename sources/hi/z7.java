package hi;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class z7 implements View.OnClickListener {
    public final int f15864a;
    public final k8 f15865b;

    public z7(k8 k8Var, int i7) {
        this.f15864a = i7;
        this.f15865b = k8Var;
    }

    @Override
    public final void onClick(View view) {
        n8 n8Var;
        int i7 = this.f15864a;
        k8 k8Var = this.f15865b;
        switch (i7) {
            case 0:
                HashMap hashMap = k8Var.d;
                ArrayList arrayList = k8Var.f14932c;
                p8 p8Var = k8Var.f14930a0;
                e eVar = k8Var.f14938w;
                if (!eVar.R) {
                    int i10 = p8.Y1;
                    int i11 = p8Var.f30173a;
                    HashMap hashMap2 = p8Var.f15271p1;
                    ArrayList arrayList2 = p8Var.f15270o1;
                    HashMap hashMap3 = p8Var.f15275t1;
                    ArrayList arrayList3 = p8Var.f15274s1;
                    np u12 = np.u1(i11);
                    int i12 = k8Var.f14929a;
                    if (i12 == 5) {
                        b8 b8Var = p8Var.Q1;
                        if (b8Var != null) {
                            b8Var.a(arrayList);
                        }
                        p8Var.dismiss();
                        return;
                    } else if (i12 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.f28484id.addAll(arrayList);
                        eVar.setLoading(true);
                        ConnectionsManager.getInstance(p8Var.f30173a).sendRequest(tL_editCloseFriends, new bi.o1(17, k8Var, u12));
                        return;
                    } else if (i12 == 0) {
                        int i13 = p8Var.I1;
                        if (i13 == 3) {
                            n8Var = new n8(p8Var.I1, p8Var.f30173a, new ArrayList(p8.S0(arrayList3, hashMap3)));
                            ArrayList arrayList4 = n8Var.f15130c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = n8Var.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i13 == 2) {
                            n8Var = new n8(i13, p8Var.f30173a, p8Var.f15273r1);
                        } else if (i13 == 4) {
                            n8Var = new n8(p8Var.I1, p8Var.f30173a, new ArrayList(p8.S0(arrayList2, hashMap2)));
                            ArrayList arrayList5 = n8Var.f15130c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = n8Var.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        } else {
                            n8Var = new n8(i13, p8Var.f30173a, (ArrayList) null);
                        }
                        p8Var.O0(n8Var, new fi.o3(p8Var, 1), false);
                        return;
                    } else if (i12 == 2) {
                        if (p8Var.U1) {
                            p8Var.N0();
                            p8Var.O0(new n8(2, p8Var.f30173a, arrayList), new fi.o3(p8Var, 1), false);
                            return;
                        }
                        p8Var.N0();
                        p8Var.f15269m1.A(0);
                        return;
                    } else if (i12 == 3) {
                        if (p8Var.U1) {
                            HashSet S0 = p8.S0(arrayList, hashMap);
                            if (!S0.isEmpty()) {
                                p8Var.N0();
                                n8 n8Var2 = new n8(3, p8Var.f30173a, new ArrayList(S0));
                                ArrayList arrayList6 = n8Var2.f15130c;
                                arrayList6.clear();
                                arrayList6.addAll(arrayList);
                                HashMap hashMap6 = n8Var2.d;
                                hashMap6.clear();
                                hashMap6.putAll(hashMap);
                                p8Var.O0(n8Var2, new a8(k8Var, 0), false);
                                return;
                            }
                            return;
                        } else if (!p8.S0(arrayList, hashMap).isEmpty()) {
                            p8Var.I1 = 3;
                            p8Var.N0();
                            p8Var.f15269m1.A(0);
                            return;
                        } else {
                            return;
                        }
                    } else if (i12 == 6) {
                        HashSet S02 = p8.S0(arrayList, hashMap);
                        eVar.setLoading(true);
                        fi.p6 R1 = np.u1(p8Var.f30173a).R1();
                        a8 a8Var = new a8(k8Var, 1);
                        int i14 = R1.f12425a;
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
                                tL_contacts_setBlocked.f28481id.add(l1);
                            }
                        }
                        R1.N = hashSet.size() + R1.N;
                        tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                        ConnectionsManager.getInstance(i14).sendRequest(tL_contacts_setBlocked, new ai.g1(a8Var, 6));
                        return;
                    } else {
                        p8Var.I1 = i12;
                        p8Var.N0();
                        p8Var.f15269m1.A(0);
                        return;
                    }
                }
                return;
            case 1:
                p8 p8Var2 = k8Var.f14930a0;
                if (p8Var2.J1) {
                    p8Var2.H1 = 5;
                    p8Var2.f15269m1.A(1);
                    return;
                }
                p8 p8Var3 = new p8(k8Var.getContext(), p8Var2.J0);
                p8Var3.Q1 = new b8(k8Var, 1);
                p8Var3.L1 = p8Var2.L1;
                p8Var3.show();
                return;
            default:
                HashMap hashMap7 = k8Var.d;
                a0.h hVar = k8Var.f14931b;
                ArrayList arrayList7 = k8Var.f14932c;
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
                k8Var.f14930a0.E1.clear();
                k8Var.f14940y.d.a();
                k8Var.g(true);
                k8Var.f(true);
                return;
        }
    }
}
