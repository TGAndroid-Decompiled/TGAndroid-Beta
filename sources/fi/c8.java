package fi;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class c8 implements View.OnClickListener {
    public final int f11737a;
    public final n8 f11738b;

    public c8(n8 n8Var, int i7) {
        this.f11737a = i7;
        this.f11738b = n8Var;
    }

    @Override
    public final void onClick(View view) {
        q8 q8Var;
        int i7 = this.f11737a;
        n8 n8Var = this.f11738b;
        switch (i7) {
            case 0:
                HashMap hashMap = n8Var.d;
                ArrayList arrayList = n8Var.f12487c;
                s8 s8Var = n8Var.W;
                d dVar = n8Var.f12493w;
                if (!dVar.Q) {
                    int i10 = s8.U1;
                    int i11 = s8Var.f28612a;
                    HashMap hashMap2 = s8Var.l1;
                    ArrayList arrayList2 = s8Var.f12805k1;
                    HashMap hashMap3 = s8Var.f12808p1;
                    ArrayList arrayList3 = s8Var.f12807o1;
                    qp s12 = qp.s1(i11);
                    int i12 = n8Var.f12485a;
                    if (i12 == 5) {
                        e8 e8Var = s8Var.M1;
                        if (e8Var != null) {
                            e8Var.a(arrayList);
                        }
                        s8Var.dismiss();
                        return;
                    } else if (i12 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.f27002id.addAll(arrayList);
                        dVar.setLoading(true);
                        ConnectionsManager.getInstance(s8Var.f28612a).sendRequest(tL_editCloseFriends, new bi.j(14, n8Var, s12));
                        return;
                    } else if (i12 == 0) {
                        int i13 = s8Var.E1;
                        if (i13 == 3) {
                            q8Var = new q8(s8Var.E1, s8Var.f28612a, new ArrayList(s8.R0(arrayList3, hashMap3)));
                            ArrayList arrayList4 = q8Var.f12680c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = q8Var.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i13 == 2) {
                            q8Var = new q8(i13, s8Var.f28612a, s8Var.n1);
                        } else if (i13 == 4) {
                            q8Var = new q8(s8Var.E1, s8Var.f28612a, new ArrayList(s8.R0(arrayList2, hashMap2)));
                            ArrayList arrayList5 = q8Var.f12680c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = q8Var.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        } else {
                            q8Var = new q8(i13, s8Var.f28612a, (ArrayList) null);
                        }
                        s8Var.N0(q8Var, new di.w3(s8Var, 1), false);
                        return;
                    } else if (i12 == 2) {
                        if (s8Var.Q1) {
                            s8Var.M0();
                            s8Var.N0(new q8(2, s8Var.f28612a, arrayList), new di.w3(s8Var, 1), false);
                            return;
                        }
                        s8Var.M0();
                        s8Var.f12803i1.E(0);
                        return;
                    } else if (i12 == 3) {
                        if (s8Var.Q1) {
                            HashSet R0 = s8.R0(arrayList, hashMap);
                            if (!R0.isEmpty()) {
                                s8Var.M0();
                                q8 q8Var2 = new q8(3, s8Var.f28612a, new ArrayList(R0));
                                ArrayList arrayList6 = q8Var2.f12680c;
                                arrayList6.clear();
                                arrayList6.addAll(arrayList);
                                HashMap hashMap6 = q8Var2.d;
                                hashMap6.clear();
                                hashMap6.putAll(hashMap);
                                s8Var.N0(q8Var2, new d8(n8Var, 0), false);
                                return;
                            }
                            return;
                        } else if (!s8.R0(arrayList, hashMap).isEmpty()) {
                            s8Var.E1 = 3;
                            s8Var.M0();
                            s8Var.f12803i1.E(0);
                            return;
                        } else {
                            return;
                        }
                    } else if (i12 == 6) {
                        HashSet R02 = s8.R0(arrayList, hashMap);
                        dVar.setLoading(true);
                        di.y6 P1 = qp.s1(s8Var.f28612a).P1();
                        d8 d8Var = new d8(n8Var, 1);
                        int i14 = P1.f9963a;
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
                            TLRPC.InputPeer j12 = qp.s1(i14).j1(l10.longValue());
                            if (!(j12 instanceof TLRPC.TL_inputPeerEmpty)) {
                                hashSet.add(l10);
                                tL_contacts_setBlocked.f26999id.add(j12);
                            }
                        }
                        P1.N = hashSet.size() + P1.N;
                        tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                        ConnectionsManager.getInstance(i14).sendRequest(tL_contacts_setBlocked, new bi.j0(d8Var, 5));
                        return;
                    } else {
                        s8Var.E1 = i12;
                        s8Var.M0();
                        s8Var.f12803i1.E(0);
                        return;
                    }
                }
                return;
            case 1:
                s8 s8Var2 = n8Var.W;
                if (s8Var2.F1) {
                    s8Var2.D1 = 5;
                    s8Var2.f12803i1.E(1);
                    return;
                }
                s8 s8Var3 = new s8(n8Var.getContext(), s8Var2.I0);
                s8Var3.M1 = new e8(n8Var, 1);
                s8Var3.H1 = s8Var2.H1;
                s8Var3.show();
                return;
            default:
                HashMap hashMap7 = n8Var.d;
                a0.h hVar = n8Var.f12486b;
                ArrayList arrayList7 = n8Var.f12487c;
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
                n8Var.W.A1.clear();
                n8Var.f12495y.d.a();
                n8Var.g(true);
                n8Var.f(true);
                return;
        }
    }
}
