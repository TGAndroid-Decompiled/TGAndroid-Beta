package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class l7b implements View.OnClickListener {
    public final byte a;
    public final v7b b;

    public l7b(v7b v7bVar, byte b) {
        this.a = b;
        this.b = v7bVar;
    }

    @Override
    public final void onClick(View view) {
        y7b y7bVar;
        byte b = this.a;
        v7b v7bVar = this.b;
        switch (b) {
            case 0:
                HashMap hashMap = v7bVar.d;
                ArrayList arrayList = v7bVar.c;
                a8b a8bVar = v7bVar.a0;
                b61 b61Var = v7bVar.w;
                if (!b61Var.R) {
                    int i = a8b.X1;
                    int i2 = a8bVar.a;
                    HashMap hashMap2 = a8bVar.o1;
                    ArrayList arrayList2 = a8bVar.n1;
                    HashMap hashMap3 = a8bVar.s1;
                    ArrayList arrayList3 = a8bVar.r1;
                    oc7 r1 = oc7.r1(i2);
                    int i3 = v7bVar.a;
                    if (i3 == 5) {
                        n7b n7bVar = a8bVar.P1;
                        if (n7bVar != null) {
                            n7bVar.a(arrayList);
                        }
                        a8bVar.dismiss();
                        return;
                    } else if (i3 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.id.addAll(arrayList);
                        b61Var.setLoading(true);
                        ConnectionsManager.getInstance(a8bVar.a).sendRequest(tL_editCloseFriends, new ara(v7bVar, r1, (byte) 10));
                        return;
                    } else if (i3 == 0) {
                        int i4 = a8bVar.H1;
                        if (i4 == 3) {
                            y7bVar = new y7b(a8bVar.H1, a8bVar.a, new ArrayList(a8b.M0(arrayList3, hashMap3)));
                            ArrayList arrayList4 = y7bVar.c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = y7bVar.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i4 == 2) {
                            y7bVar = new y7b(i4, a8bVar.a, a8bVar.q1);
                        } else if (i4 == 4) {
                            y7bVar = new y7b(a8bVar.H1, a8bVar.a, new ArrayList(a8b.M0(arrayList2, hashMap2)));
                            ArrayList arrayList5 = y7bVar.c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = y7bVar.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        } else {
                            y7bVar = new y7b(i4, a8bVar.a, (ArrayList) null);
                        }
                        a8bVar.G0(y7bVar, new s48(a8bVar, (byte) 1), false);
                        return;
                    } else if (i3 == 2) {
                        if (a8bVar.T1) {
                            a8bVar.F0();
                            a8bVar.G0(new y7b(2, a8bVar.a, arrayList), new s48(a8bVar, (byte) 1), false);
                            return;
                        }
                        a8bVar.F0();
                        a8bVar.l1.E(0);
                        return;
                    } else if (i3 == 3) {
                        if (a8bVar.T1) {
                            HashSet M0 = a8b.M0(arrayList, hashMap);
                            if (!M0.isEmpty()) {
                                a8bVar.F0();
                                y7b y7bVar2 = new y7b(3, a8bVar.a, new ArrayList(M0));
                                ArrayList arrayList6 = y7bVar2.c;
                                arrayList6.clear();
                                arrayList6.addAll(arrayList);
                                HashMap hashMap6 = y7bVar2.d;
                                hashMap6.clear();
                                hashMap6.putAll(hashMap);
                                a8bVar.G0(y7bVar2, new m7b(v7bVar, (byte) 0), false);
                                return;
                            }
                            return;
                        } else if (!a8b.M0(arrayList, hashMap).isEmpty()) {
                            a8bVar.H1 = 3;
                            a8bVar.F0();
                            a8bVar.l1.E(0);
                            return;
                        } else {
                            return;
                        }
                    } else if (i3 == 6) {
                        HashSet M02 = a8b.M0(arrayList, hashMap);
                        b61Var.setLoading(true);
                        h4b N1 = oc7.r1(a8bVar.a).N1();
                        m7b m7bVar = new m7b(v7bVar, (byte) 1);
                        int i5 = N1.a;
                        TLRPC.TL_contacts_setBlocked tL_contacts_setBlocked = new TLRPC.TL_contacts_setBlocked();
                        tL_contacts_setBlocked.my_stories_from = true;
                        HashSet hashSet = N1.L;
                        tL_contacts_setBlocked.limit = hashSet.size();
                        int size = N1.N - hashSet.size();
                        N1.N = size;
                        if (size < 0) {
                            N1.N = 0;
                        }
                        hashSet.clear();
                        Iterator it = M02.iterator();
                        while (it.hasNext()) {
                            Long l = (Long) it.next();
                            TLRPC.InputPeer i1 = oc7.r1(i5).i1(l.longValue());
                            if (!(i1 instanceof TLRPC.TL_inputPeerEmpty)) {
                                hashSet.add(l);
                                tL_contacts_setBlocked.id.add(i1);
                            }
                        }
                        N1.N = hashSet.size() + N1.N;
                        tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                        ConnectionsManager.getInstance(i5).sendRequest(tL_contacts_setBlocked, new go9(m7bVar, (byte) 9));
                        return;
                    } else {
                        a8bVar.H1 = i3;
                        a8bVar.F0();
                        a8bVar.l1.E(0);
                        return;
                    }
                }
                return;
            case 1:
                a8b a8bVar2 = v7bVar.a0;
                if (a8bVar2.I1) {
                    a8bVar2.G1 = 5;
                    a8bVar2.l1.E(1);
                    return;
                }
                a8b a8bVar3 = new a8b(v7bVar.getContext(), a8bVar2.J0);
                a8bVar3.P1 = new n7b(v7bVar, (byte) 1);
                a8bVar3.K1 = a8bVar2.K1;
                a8bVar3.show();
                return;
            default:
                HashMap hashMap7 = v7bVar.d;
                vh6 vh6Var = v7bVar.b;
                ArrayList arrayList7 = v7bVar.c;
                int size2 = arrayList7.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj = arrayList7.get(i6);
                    i6++;
                    vh6Var.k(Boolean.FALSE, ((Long) obj).longValue());
                }
                for (ArrayList arrayList8 : hashMap7.values()) {
                    int size3 = arrayList8.size();
                    int i7 = 0;
                    while (i7 < size3) {
                        Object obj2 = arrayList8.get(i7);
                        i7++;
                        vh6Var.k(Boolean.FALSE, ((Long) obj2).longValue());
                    }
                }
                arrayList7.clear();
                hashMap7.clear();
                v7bVar.a0.D1.clear();
                v7bVar.y.d.a();
                v7bVar.g(true);
                v7bVar.f(true);
                return;
        }
    }
}
