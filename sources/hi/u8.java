package hi;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u8 implements View.OnClickListener {
    public final int f15526a;
    public final f9 f15527b;

    public u8(f9 f9Var, int i7) {
        this.f15526a = i7;
        this.f15527b = f9Var;
    }

    @Override
    public final void onClick(View view) {
        i9 i9Var;
        int i7 = this.f15526a;
        f9 f9Var = this.f15527b;
        switch (i7) {
            case 0:
                HashMap hashMap = f9Var.d;
                ArrayList arrayList = f9Var.f14497c;
                k9 k9Var = f9Var.f14495a0;
                e eVar = f9Var.f14503w;
                if (!eVar.R) {
                    int i10 = k9.Y1;
                    int i11 = k9Var.f30223a;
                    HashMap hashMap2 = k9Var.f14789p1;
                    ArrayList arrayList2 = k9Var.f14788o1;
                    HashMap hashMap3 = k9Var.f14793t1;
                    ArrayList arrayList3 = k9Var.f14792s1;
                    mp u12 = mp.u1(i11);
                    int i12 = f9Var.f14494a;
                    if (i12 == 5) {
                        w8 w8Var = k9Var.Q1;
                        if (w8Var != null) {
                            w8Var.a(arrayList);
                        }
                        k9Var.dismiss();
                        return;
                    } else if (i12 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.f28542id.addAll(arrayList);
                        eVar.setLoading(true);
                        ConnectionsManager.getInstance(k9Var.f30223a).sendRequest(tL_editCloseFriends, new bi.o1(17, f9Var, u12));
                        return;
                    } else if (i12 == 0) {
                        int i13 = k9Var.I1;
                        if (i13 == 3) {
                            i9Var = new i9(k9Var.I1, k9Var.f30223a, new ArrayList(k9.S0(arrayList3, hashMap3)));
                            ArrayList arrayList4 = i9Var.f14703c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = i9Var.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i13 == 2) {
                            i9Var = new i9(i13, k9Var.f30223a, k9Var.f14791r1);
                        } else if (i13 == 4) {
                            i9Var = new i9(k9Var.I1, k9Var.f30223a, new ArrayList(k9.S0(arrayList2, hashMap2)));
                            ArrayList arrayList5 = i9Var.f14703c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = i9Var.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        } else {
                            i9Var = new i9(i13, k9Var.f30223a, (ArrayList) null);
                        }
                        k9Var.O0(i9Var, new fi.o3(k9Var, 1), false);
                        return;
                    } else if (i12 == 2) {
                        if (k9Var.U1) {
                            k9Var.N0();
                            k9Var.O0(new i9(2, k9Var.f30223a, arrayList), new fi.o3(k9Var, 1), false);
                            return;
                        }
                        k9Var.N0();
                        k9Var.f14787m1.C(0);
                        return;
                    } else if (i12 == 3) {
                        if (k9Var.U1) {
                            HashSet S0 = k9.S0(arrayList, hashMap);
                            if (!S0.isEmpty()) {
                                k9Var.N0();
                                i9 i9Var2 = new i9(3, k9Var.f30223a, new ArrayList(S0));
                                ArrayList arrayList6 = i9Var2.f14703c;
                                arrayList6.clear();
                                arrayList6.addAll(arrayList);
                                HashMap hashMap6 = i9Var2.d;
                                hashMap6.clear();
                                hashMap6.putAll(hashMap);
                                k9Var.O0(i9Var2, new v8(f9Var, 0), false);
                                return;
                            }
                            return;
                        } else if (!k9.S0(arrayList, hashMap).isEmpty()) {
                            k9Var.I1 = 3;
                            k9Var.N0();
                            k9Var.f14787m1.C(0);
                            return;
                        } else {
                            return;
                        }
                    } else if (i12 == 6) {
                        HashSet S02 = k9.S0(arrayList, hashMap);
                        eVar.setLoading(true);
                        fi.p6 R1 = mp.u1(k9Var.f30223a).R1();
                        v8 v8Var = new v8(f9Var, 1);
                        int i14 = R1.f12387a;
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
                            TLRPC.InputPeer l1 = mp.u1(i14).l1(l10.longValue());
                            if (!(l1 instanceof TLRPC.TL_inputPeerEmpty)) {
                                hashSet.add(l10);
                                tL_contacts_setBlocked.f28539id.add(l1);
                            }
                        }
                        R1.N = hashSet.size() + R1.N;
                        tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                        ConnectionsManager.getInstance(i14).sendRequest(tL_contacts_setBlocked, new ai.b1(v8Var, 6));
                        return;
                    } else {
                        k9Var.I1 = i12;
                        k9Var.N0();
                        k9Var.f14787m1.C(0);
                        return;
                    }
                }
                return;
            case 1:
                k9 k9Var2 = f9Var.f14495a0;
                if (k9Var2.J1) {
                    k9Var2.H1 = 5;
                    k9Var2.f14787m1.C(1);
                    return;
                }
                k9 k9Var3 = new k9(f9Var.getContext(), k9Var2.J0);
                k9Var3.Q1 = new w8(f9Var, 1);
                k9Var3.L1 = k9Var2.L1;
                k9Var3.show();
                return;
            default:
                HashMap hashMap7 = f9Var.d;
                a0.h hVar = f9Var.f14496b;
                ArrayList arrayList7 = f9Var.f14497c;
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
                f9Var.f14495a0.E1.clear();
                f9Var.f14505y.d.a();
                f9Var.g(true);
                f9Var.f(true);
                return;
        }
    }
}
