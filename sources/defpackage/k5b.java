package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class k5b implements View.OnClickListener {
    public final byte a;
    public final t5b b;

    public k5b(t5b t5bVar, byte b) {
        this.a = b;
        this.b = t5bVar;
    }

    @Override
    public final void onClick(View view) {
        w5b w5bVar;
        byte b = this.a;
        t5b t5bVar = this.b;
        switch (b) {
            case 0:
                HashMap hashMap = t5bVar.d;
                ArrayList arrayList = t5bVar.c;
                y5b y5bVar = t5bVar.a0;
                u41 u41Var = t5bVar.w;
                if (!u41Var.R) {
                    int i = y5b.X1;
                    int i2 = y5bVar.a;
                    HashMap hashMap2 = y5bVar.o1;
                    ArrayList arrayList2 = y5bVar.n1;
                    HashMap hashMap3 = y5bVar.s1;
                    ArrayList arrayList3 = y5bVar.r1;
                    na7 q1 = na7.q1(i2);
                    int i3 = t5bVar.a;
                    if (i3 == 5) {
                        m5b m5bVar = y5bVar.P1;
                        if (m5bVar != null) {
                            m5bVar.a(arrayList);
                        }
                        y5bVar.dismiss();
                        return;
                    } else if (i3 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.id.addAll(arrayList);
                        u41Var.setLoading(true);
                        ConnectionsManager.getInstance(y5bVar.a).sendRequest(tL_editCloseFriends, new apa(t5bVar, q1, (byte) 10));
                        return;
                    } else if (i3 == 0) {
                        int i4 = y5bVar.H1;
                        if (i4 == 3) {
                            w5bVar = new w5b(y5bVar.H1, y5bVar.a, new ArrayList(y5b.M0(arrayList3, hashMap3)));
                            ArrayList arrayList4 = w5bVar.c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = w5bVar.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i4 == 2) {
                            w5bVar = new w5b(i4, y5bVar.a, y5bVar.q1);
                        } else if (i4 == 4) {
                            w5bVar = new w5b(y5bVar.H1, y5bVar.a, new ArrayList(y5b.M0(arrayList2, hashMap2)));
                            ArrayList arrayList5 = w5bVar.c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = w5bVar.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        } else {
                            w5bVar = new w5b(i4, y5bVar.a, (ArrayList) null);
                        }
                        y5bVar.G0(w5bVar, new p28(y5bVar, (byte) 1), false);
                        return;
                    } else if (i3 == 2) {
                        if (y5bVar.T1) {
                            y5bVar.F0();
                            y5bVar.G0(new w5b(2, y5bVar.a, arrayList), new p28(y5bVar, (byte) 1), false);
                            return;
                        }
                        y5bVar.F0();
                        y5bVar.l1.E(0);
                        return;
                    } else if (i3 == 3) {
                        if (y5bVar.T1) {
                            HashSet M0 = y5b.M0(arrayList, hashMap);
                            if (!M0.isEmpty()) {
                                y5bVar.F0();
                                w5b w5bVar2 = new w5b(3, y5bVar.a, new ArrayList(M0));
                                ArrayList arrayList6 = w5bVar2.c;
                                arrayList6.clear();
                                arrayList6.addAll(arrayList);
                                HashMap hashMap6 = w5bVar2.d;
                                hashMap6.clear();
                                hashMap6.putAll(hashMap);
                                y5bVar.G0(w5bVar2, new l5b(t5bVar, (byte) 0), false);
                                return;
                            }
                            return;
                        } else if (!y5b.M0(arrayList, hashMap).isEmpty()) {
                            y5bVar.H1 = 3;
                            y5bVar.F0();
                            y5bVar.l1.E(0);
                            return;
                        } else {
                            return;
                        }
                    } else if (i3 == 6) {
                        HashSet M02 = y5b.M0(arrayList, hashMap);
                        u41Var.setLoading(true);
                        g2b M1 = na7.q1(y5bVar.a).M1();
                        l5b l5bVar = new l5b(t5bVar, (byte) 1);
                        int i5 = M1.a;
                        TLRPC.TL_contacts_setBlocked tL_contacts_setBlocked = new TLRPC.TL_contacts_setBlocked();
                        tL_contacts_setBlocked.my_stories_from = true;
                        HashSet hashSet = M1.L;
                        tL_contacts_setBlocked.limit = hashSet.size();
                        int size = M1.N - hashSet.size();
                        M1.N = size;
                        if (size < 0) {
                            M1.N = 0;
                        }
                        hashSet.clear();
                        Iterator it = M02.iterator();
                        while (it.hasNext()) {
                            Long l = (Long) it.next();
                            TLRPC.InputPeer h1 = na7.q1(i5).h1(l.longValue());
                            if (!(h1 instanceof TLRPC.TL_inputPeerEmpty)) {
                                hashSet.add(l);
                                tL_contacts_setBlocked.id.add(h1);
                            }
                        }
                        M1.N = hashSet.size() + M1.N;
                        tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                        ConnectionsManager.getInstance(i5).sendRequest(tL_contacts_setBlocked, new wx9(l5bVar, (byte) 8));
                        return;
                    } else {
                        y5bVar.H1 = i3;
                        y5bVar.F0();
                        y5bVar.l1.E(0);
                        return;
                    }
                }
                return;
            case 1:
                y5b y5bVar2 = t5bVar.a0;
                if (y5bVar2.I1) {
                    y5bVar2.G1 = 5;
                    y5bVar2.l1.E(1);
                    return;
                }
                y5b y5bVar3 = new y5b(t5bVar.getContext(), y5bVar2.J0);
                y5bVar3.P1 = new m5b(t5bVar, (byte) 1);
                y5bVar3.K1 = y5bVar2.K1;
                y5bVar3.show();
                return;
            default:
                HashMap hashMap7 = t5bVar.d;
                vf6 vf6Var = t5bVar.b;
                ArrayList arrayList7 = t5bVar.c;
                int size2 = arrayList7.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj = arrayList7.get(i6);
                    i6++;
                    vf6Var.k(Boolean.FALSE, ((Long) obj).longValue());
                }
                for (ArrayList arrayList8 : hashMap7.values()) {
                    int size3 = arrayList8.size();
                    int i7 = 0;
                    while (i7 < size3) {
                        Object obj2 = arrayList8.get(i7);
                        i7++;
                        vf6Var.k(Boolean.FALSE, ((Long) obj2).longValue());
                    }
                }
                arrayList7.clear();
                hashMap7.clear();
                t5bVar.a0.D1.clear();
                t5bVar.y.d.a();
                t5bVar.g(true);
                t5bVar.f(true);
                return;
        }
    }
}
