package kh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class b9 implements View.OnClickListener {
    public final int f15007a;
    public final n9 f15008b;

    public b9(n9 n9Var, int i9) {
        this.f15007a = i9;
        this.f15008b = n9Var;
    }

    @Override
    public final void onClick(View view) {
        int i9;
        int i10;
        int i11;
        int i12;
        r9 r9Var;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.ActionBar.b6 b6Var;
        switch (this.f15007a) {
            case 0:
                n9 n9Var = this.f15008b;
                HashMap hashMap = n9Var.d;
                ArrayList arrayList = n9Var.f15769c;
                t9 t9Var = n9Var.S;
                d dVar = n9Var.v;
                if (!dVar.J) {
                    i9 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                    HashMap hashMap2 = t9Var.f16099e;
                    ArrayList arrayList2 = t9Var.d;
                    HashMap hashMap3 = t9Var.f16102r;
                    ArrayList arrayList3 = t9Var.f16101n;
                    MessagesController messagesController = MessagesController.getInstance(i9);
                    int i18 = n9Var.f15767a;
                    if (i18 == 5) {
                        d9 d9Var = t9Var.R;
                        if (d9Var != null) {
                            d9Var.run(arrayList);
                        }
                        t9Var.dismiss();
                        return;
                    } else if (i18 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.f22430id.addAll(arrayList);
                        dVar.setLoading(true);
                        i17 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                        ConnectionsManager.getInstance(i17).sendRequest(tL_editCloseFriends, new bg.j0(n9Var, messagesController, 17));
                        return;
                    } else if (i18 == 0) {
                        int i19 = t9Var.J;
                        if (i19 == 3) {
                            HashSet l1 = t9.l1(arrayList3, hashMap3);
                            int i20 = t9Var.J;
                            i16 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                            r9Var = new r9(i20, i16, new ArrayList(l1));
                            ArrayList arrayList4 = r9Var.f15968c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = r9Var.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i19 == 2) {
                            i15 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                            r9Var = new r9(i19, i15, t9Var.h);
                        } else if (i19 != 4) {
                            i13 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                            r9Var = new r9(i19, i13, (ArrayList) null);
                        } else {
                            HashSet l12 = t9.l1(arrayList2, hashMap2);
                            int i21 = t9Var.J;
                            i14 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                            r9Var = new r9(i21, i14, new ArrayList(l12));
                            ArrayList arrayList5 = r9Var.f15968c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = r9Var.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        }
                        t9Var.g1(r9Var, new ih.y3(t9Var, 1), false);
                        return;
                    } else if (i18 == 2) {
                        if (t9Var.V) {
                            t9Var.f1();
                            i12 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                            t9Var.g1(new r9(2, i12, arrayList), new ih.y3(t9Var, 1), false);
                            return;
                        }
                        t9Var.f1();
                        t9Var.f16097b.D(0);
                        return;
                    } else if (i18 == 3) {
                        if (t9Var.V) {
                            HashSet l13 = t9.l1(arrayList, hashMap);
                            if (!l13.isEmpty()) {
                                t9Var.f1();
                                i11 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                                r9 r9Var2 = new r9(3, i11, new ArrayList(l13));
                                ArrayList arrayList6 = r9Var2.f15968c;
                                arrayList6.clear();
                                arrayList6.addAll(arrayList);
                                HashMap hashMap6 = r9Var2.d;
                                hashMap6.clear();
                                hashMap6.putAll(hashMap);
                                t9Var.g1(r9Var2, new c9(n9Var, 0), false);
                                return;
                            }
                            return;
                        } else if (!t9.l1(arrayList, hashMap).isEmpty()) {
                            t9Var.J = 3;
                            t9Var.f1();
                            t9Var.f16097b.D(0);
                            return;
                        } else {
                            return;
                        }
                    } else if (i18 == 6) {
                        HashSet l14 = t9.l1(arrayList, hashMap);
                        dVar.setLoading(true);
                        i10 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                        ih.v6 storiesController = MessagesController.getInstance(i10).getStoriesController();
                        c9 c9Var = new c9(n9Var, 1);
                        int i22 = storiesController.f12236a;
                        TLRPC.TL_contacts_setBlocked tL_contacts_setBlocked = new TLRPC.TL_contacts_setBlocked();
                        tL_contacts_setBlocked.my_stories_from = true;
                        HashSet hashSet = storiesController.L;
                        tL_contacts_setBlocked.limit = hashSet.size();
                        int size = storiesController.N - hashSet.size();
                        storiesController.N = size;
                        if (size < 0) {
                            storiesController.N = 0;
                        }
                        hashSet.clear();
                        Iterator it = l14.iterator();
                        while (it.hasNext()) {
                            Long l10 = (Long) it.next();
                            TLRPC.InputPeer inputPeer = MessagesController.getInstance(i22).getInputPeer(l10.longValue());
                            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerEmpty)) {
                                hashSet.add(l10);
                                tL_contacts_setBlocked.f22427id.add(inputPeer);
                            }
                        }
                        storiesController.N = hashSet.size() + storiesController.N;
                        tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                        ConnectionsManager.getInstance(i22).sendRequest(tL_contacts_setBlocked, new bf.a(c9Var, 11));
                        return;
                    } else {
                        t9Var.J = i18;
                        t9Var.f1();
                        t9Var.f16097b.D(0);
                        return;
                    }
                }
                return;
            case 1:
                n9 n9Var2 = this.f15008b;
                t9 t9Var2 = n9Var2.S;
                if (t9Var2.K) {
                    t9Var2.I = 5;
                    t9Var2.f16097b.D(1);
                    return;
                }
                Context context = n9Var2.getContext();
                b6Var = ((org.telegram.ui.ActionBar.f3) t9Var2).resourcesProvider;
                t9 t9Var3 = new t9(context, b6Var);
                t9Var3.R = new d9(n9Var2, 1);
                t9Var3.M = t9Var2.M;
                t9Var3.show();
                return;
            default:
                n9 n9Var3 = this.f15008b;
                HashMap hashMap7 = n9Var3.d;
                a0.h hVar = n9Var3.f15768b;
                ArrayList arrayList7 = n9Var3.f15769c;
                int size2 = arrayList7.size();
                int i23 = 0;
                while (i23 < size2) {
                    Object obj = arrayList7.get(i23);
                    i23++;
                    hVar.k(Boolean.FALSE, ((Long) obj).longValue());
                }
                for (ArrayList arrayList8 : hashMap7.values()) {
                    int size3 = arrayList8.size();
                    int i24 = 0;
                    while (i24 < size3) {
                        Object obj2 = arrayList8.get(i24);
                        i24++;
                        hVar.k(Boolean.FALSE, ((Long) obj2).longValue());
                    }
                }
                arrayList7.clear();
                hashMap7.clear();
                n9Var3.S.F.clear();
                n9Var3.f15776x.f15891c.a();
                n9Var3.f(true);
                n9Var3.e(true);
                return;
        }
    }
}
