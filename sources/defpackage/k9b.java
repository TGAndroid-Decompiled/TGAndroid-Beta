package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class k9b implements View.OnClickListener {
    public final byte a;
    public final r9b b;

    public k9b(r9b r9bVar, byte b) {
        this.a = b;
        this.b = r9bVar;
    }

    @Override
    public final void onClick(View view) {
        u9b u9bVar;
        byte b = this.a;
        r9b r9bVar = this.b;
        switch (b) {
            case 0:
                HashMap hashMap = r9bVar.d;
                zh6 zh6Var = r9bVar.b;
                ArrayList arrayList = r9bVar.c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    zh6Var.k(((Long) obj).longValue(), Boolean.FALSE);
                }
                for (ArrayList arrayList2 : hashMap.values()) {
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        zh6Var.k(((Long) obj2).longValue(), Boolean.FALSE);
                    }
                }
                arrayList.clear();
                hashMap.clear();
                r9bVar.a0.D1.clear();
                r9bVar.y.d.a();
                r9bVar.g(true);
                r9bVar.f(true);
                return;
            case 1:
                HashMap hashMap2 = r9bVar.d;
                ArrayList arrayList3 = r9bVar.c;
                w9b w9bVar = r9bVar.a0;
                c51 c51Var = r9bVar.w;
                if (!c51Var.R) {
                    int i3 = w9b.X1;
                    int i4 = w9bVar.a;
                    HashMap hashMap3 = w9bVar.o1;
                    ArrayList arrayList4 = w9bVar.n1;
                    HashMap hashMap4 = w9bVar.s1;
                    ArrayList arrayList5 = w9bVar.r1;
                    uc7 s1 = uc7.s1(i4);
                    int i5 = r9bVar.a;
                    if (i5 == 5) {
                        j9b j9bVar = w9bVar.P1;
                        if (j9bVar != null) {
                            j9bVar.a(arrayList3);
                        }
                        w9bVar.dismiss();
                        return;
                    } else if (i5 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.id.addAll(arrayList3);
                        c51Var.setLoading(true);
                        ConnectionsManager.getInstance(w9bVar.a).sendRequest(tL_editCloseFriends, new isa(r9bVar, s1, (byte) 11));
                        return;
                    } else if (i5 == 0) {
                        int i6 = w9bVar.H1;
                        if (i6 == 3) {
                            u9bVar = new u9b(w9bVar.H1, w9bVar.a, new ArrayList(w9b.N0(arrayList5, hashMap4)));
                            ArrayList arrayList6 = u9bVar.c;
                            arrayList6.clear();
                            arrayList6.addAll(arrayList5);
                            HashMap hashMap5 = u9bVar.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap4);
                        } else if (i6 == 2) {
                            u9bVar = new u9b(i6, w9bVar.a, w9bVar.q1);
                        } else if (i6 == 4) {
                            u9bVar = new u9b(w9bVar.H1, w9bVar.a, new ArrayList(w9b.N0(arrayList4, hashMap3)));
                            ArrayList arrayList7 = u9bVar.c;
                            arrayList7.clear();
                            arrayList7.addAll(arrayList4);
                            HashMap hashMap6 = u9bVar.d;
                            hashMap6.clear();
                            hashMap6.putAll(hashMap3);
                        } else {
                            u9bVar = new u9b(i6, w9bVar.a, (ArrayList) null);
                        }
                        w9bVar.H0(u9bVar, new c68(w9bVar, (byte) 1), false);
                        return;
                    } else if (i5 == 2) {
                        if (w9bVar.T1) {
                            w9bVar.G0();
                            w9bVar.H0(new u9b(2, w9bVar.a, arrayList3), new c68(w9bVar, (byte) 1), false);
                            return;
                        }
                        w9bVar.G0();
                        w9bVar.l1.F(0);
                        return;
                    } else if (i5 == 3) {
                        if (w9bVar.T1) {
                            HashSet N0 = w9b.N0(arrayList3, hashMap2);
                            if (!N0.isEmpty()) {
                                w9bVar.G0();
                                u9b u9bVar2 = new u9b(3, w9bVar.a, new ArrayList(N0));
                                ArrayList arrayList8 = u9bVar2.c;
                                arrayList8.clear();
                                arrayList8.addAll(arrayList3);
                                HashMap hashMap7 = u9bVar2.d;
                                hashMap7.clear();
                                hashMap7.putAll(hashMap2);
                                w9bVar.H0(u9bVar2, new i9b(r9bVar, (byte) 1), false);
                                return;
                            }
                            return;
                        } else if (!w9b.N0(arrayList3, hashMap2).isEmpty()) {
                            w9bVar.H1 = 3;
                            w9bVar.G0();
                            w9bVar.l1.F(0);
                            return;
                        } else {
                            return;
                        }
                    } else if (i5 == 6) {
                        HashSet N02 = w9b.N0(arrayList3, hashMap2);
                        c51Var.setLoading(true);
                        c6b O1 = uc7.s1(w9bVar.a).O1();
                        i9b i9bVar = new i9b(r9bVar, (byte) 2);
                        int i7 = O1.a;
                        TLRPC.TL_contacts_setBlocked tL_contacts_setBlocked = new TLRPC.TL_contacts_setBlocked();
                        tL_contacts_setBlocked.my_stories_from = true;
                        HashSet hashSet = O1.L;
                        tL_contacts_setBlocked.limit = hashSet.size();
                        int size3 = O1.N - hashSet.size();
                        O1.N = size3;
                        if (size3 < 0) {
                            O1.N = 0;
                        }
                        hashSet.clear();
                        Iterator it = N02.iterator();
                        while (it.hasNext()) {
                            Long l = (Long) it.next();
                            TLRPC.InputPeer j1 = uc7.s1(i7).j1(l.longValue());
                            if (!(j1 instanceof TLRPC.TL_inputPeerEmpty)) {
                                hashSet.add(l);
                                tL_contacts_setBlocked.id.add(j1);
                            }
                        }
                        O1.N = hashSet.size() + O1.N;
                        tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                        ConnectionsManager.getInstance(i7).sendRequest(tL_contacts_setBlocked, new yp9(i9bVar, (byte) 9));
                        return;
                    } else {
                        w9bVar.H1 = i5;
                        w9bVar.G0();
                        w9bVar.l1.F(0);
                        return;
                    }
                }
                return;
            default:
                w9b w9bVar2 = r9bVar.a0;
                if (w9bVar2.I1) {
                    w9bVar2.G1 = 5;
                    w9bVar2.l1.F(1);
                    return;
                }
                w9b w9bVar3 = new w9b(r9bVar.getContext(), w9bVar2.J0);
                w9bVar3.P1 = new j9b(r9bVar, (byte) 1);
                w9bVar3.K1 = w9bVar2.K1;
                w9bVar3.show();
                return;
        }
    }
}
