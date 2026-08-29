package nh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class n8 implements View.OnClickListener {
    public final int f18194a;
    public final y8 f18195b;

    public n8(y8 y8Var, int i10) {
        this.f18194a = i10;
        this.f18195b = y8Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        c9 c9Var;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.c6 c6Var;
        switch (this.f18194a) {
            case 0:
                y8 y8Var = this.f18195b;
                HashMap hashMap = y8Var.d;
                ArrayList arrayList = y8Var.f18903c;
                e9 e9Var = y8Var.S;
                d dVar = y8Var.v;
                if (!dVar.J) {
                    i10 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                    HashMap hashMap2 = e9Var.f17605e;
                    ArrayList arrayList2 = e9Var.d;
                    HashMap hashMap3 = e9Var.f17608r;
                    ArrayList arrayList3 = e9Var.f17607n;
                    MessagesController messagesController = MessagesController.getInstance(i10);
                    int i19 = y8Var.f18901a;
                    if (i19 == 5) {
                        p8 p8Var = e9Var.R;
                        if (p8Var != null) {
                            p8Var.run(arrayList);
                        }
                        e9Var.dismiss();
                        return;
                    } else if (i19 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.f22442id.addAll(arrayList);
                        dVar.setLoading(true);
                        i18 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                        ConnectionsManager.getInstance(i18).sendRequest(tL_editCloseFriends, new bg.h3(18, y8Var, messagesController));
                        return;
                    } else if (i19 == 0) {
                        int i20 = e9Var.J;
                        if (i20 == 3) {
                            HashSet l1 = e9.l1(arrayList3, hashMap3);
                            int i21 = e9Var.J;
                            i17 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                            c9Var = new c9(i21, i17, new ArrayList(l1));
                            ArrayList arrayList4 = c9Var.f17483c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = c9Var.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i20 == 2) {
                            i16 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                            c9Var = new c9(i20, i16, e9Var.h);
                        } else if (i20 != 4) {
                            i14 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                            c9Var = new c9(i20, i14, (ArrayList) null);
                        } else {
                            HashSet l12 = e9.l1(arrayList2, hashMap2);
                            int i22 = e9Var.J;
                            i15 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                            c9Var = new c9(i22, i15, new ArrayList(l12));
                            ArrayList arrayList5 = c9Var.f17483c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = c9Var.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        }
                        e9Var.g1(c9Var, new lh.t3(e9Var, 1), false);
                        return;
                    } else if (i19 == 2) {
                        if (e9Var.V) {
                            e9Var.f1();
                            i13 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                            e9Var.g1(new c9(2, i13, arrayList), new lh.t3(e9Var, 1), false);
                            return;
                        }
                        e9Var.f1();
                        e9Var.f17603b.D(0);
                        return;
                    } else if (i19 == 3) {
                        if (e9Var.V) {
                            HashSet l13 = e9.l1(arrayList, hashMap);
                            if (!l13.isEmpty()) {
                                e9Var.f1();
                                i12 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                                c9 c9Var2 = new c9(3, i12, new ArrayList(l13));
                                ArrayList arrayList6 = c9Var2.f17483c;
                                arrayList6.clear();
                                arrayList6.addAll(arrayList);
                                HashMap hashMap6 = c9Var2.d;
                                hashMap6.clear();
                                hashMap6.putAll(hashMap);
                                e9Var.g1(c9Var2, new o8(y8Var, 0), false);
                                return;
                            }
                            return;
                        } else if (!e9.l1(arrayList, hashMap).isEmpty()) {
                            e9Var.J = 3;
                            e9Var.f1();
                            e9Var.f17603b.D(0);
                            return;
                        } else {
                            return;
                        }
                    } else if (i19 == 6) {
                        HashSet l14 = e9.l1(arrayList, hashMap);
                        dVar.setLoading(true);
                        i11 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                        lh.s6 storiesController = MessagesController.getInstance(i11).getStoriesController();
                        o8 o8Var = new o8(y8Var, 1);
                        int i23 = storiesController.f16218a;
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
                            TLRPC.InputPeer inputPeer = MessagesController.getInstance(i23).getInputPeer(l10.longValue());
                            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerEmpty)) {
                                hashSet.add(l10);
                                tL_contacts_setBlocked.f22439id.add(inputPeer);
                            }
                        }
                        storiesController.N = hashSet.size() + storiesController.N;
                        tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                        ConnectionsManager.getInstance(i23).sendRequest(tL_contacts_setBlocked, new ef.a(o8Var, 11));
                        return;
                    } else {
                        e9Var.J = i19;
                        e9Var.f1();
                        e9Var.f17603b.D(0);
                        return;
                    }
                }
                return;
            case 1:
                y8 y8Var2 = this.f18195b;
                e9 e9Var2 = y8Var2.S;
                if (e9Var2.K) {
                    e9Var2.I = 5;
                    e9Var2.f17603b.D(1);
                    return;
                }
                Context context = y8Var2.getContext();
                c6Var = ((org.telegram.ui.ActionBar.f3) e9Var2).resourcesProvider;
                e9 e9Var3 = new e9(context, c6Var);
                e9Var3.R = new p8(y8Var2, 1);
                e9Var3.M = e9Var2.M;
                e9Var3.show();
                return;
            default:
                y8 y8Var3 = this.f18195b;
                HashMap hashMap7 = y8Var3.d;
                a0.h hVar = y8Var3.f18902b;
                ArrayList arrayList7 = y8Var3.f18903c;
                int size2 = arrayList7.size();
                int i24 = 0;
                while (i24 < size2) {
                    Object obj = arrayList7.get(i24);
                    i24++;
                    hVar.k(Boolean.FALSE, ((Long) obj).longValue());
                }
                for (ArrayList arrayList8 : hashMap7.values()) {
                    int size3 = arrayList8.size();
                    int i25 = 0;
                    while (i25 < size3) {
                        Object obj2 = arrayList8.get(i25);
                        i25++;
                        hVar.k(Boolean.FALSE, ((Long) obj2).longValue());
                    }
                }
                arrayList7.clear();
                hashMap7.clear();
                y8Var3.S.F.clear();
                y8Var3.f18910x.f17432c.a();
                y8Var3.f(true);
                y8Var3.e(true);
                return;
        }
    }
}
