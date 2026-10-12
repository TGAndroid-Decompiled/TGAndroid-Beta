package di;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class k9 implements View.OnClickListener {
    public final int f7224a;
    public final x9 f7225b;

    public k9(x9 x9Var, int i10) {
        this.f7224a = i10;
        this.f7225b = x9Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        ca caVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.c6 c6Var;
        switch (this.f7224a) {
            case 0:
                x9 x9Var = this.f7225b;
                HashMap hashMap = x9Var.d;
                ArrayList arrayList = x9Var.f8096c;
                ea eaVar = x9Var.W;
                d dVar = x9Var.v;
                if (!dVar.N) {
                    i10 = ((org.telegram.ui.ActionBar.e3) eaVar).currentAccount;
                    HashMap hashMap2 = eaVar.e;
                    ArrayList arrayList2 = eaVar.d;
                    HashMap hashMap3 = eaVar.f6920r;
                    ArrayList arrayList3 = eaVar.f6919n;
                    MessagesController messagesController = MessagesController.getInstance(i10);
                    int i19 = x9Var.f8094a;
                    if (i19 == 5) {
                        m9 m9Var = eaVar.V;
                        if (m9Var != null) {
                            m9Var.run(arrayList);
                        }
                        eaVar.dismiss();
                        return;
                    } else if (i19 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.f19266id.addAll(arrayList);
                        dVar.setLoading(true);
                        i18 = ((org.telegram.ui.ActionBar.e3) eaVar).currentAccount;
                        ConnectionsManager.getInstance(i18).sendRequest(tL_editCloseFriends, new bi.m1(7, x9Var, messagesController));
                        return;
                    } else if (i19 == 0) {
                        int i20 = eaVar.N;
                        if (i20 == 3) {
                            HashSet m12 = ea.m1(arrayList3, hashMap3);
                            int i21 = eaVar.N;
                            i17 = ((org.telegram.ui.ActionBar.e3) eaVar).currentAccount;
                            caVar = new ca(i21, i17, new ArrayList(m12));
                            ArrayList arrayList4 = caVar.f6739c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = caVar.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i20 == 2) {
                            i16 = ((org.telegram.ui.ActionBar.e3) eaVar).currentAccount;
                            caVar = new ca(i20, i16, eaVar.h);
                        } else if (i20 != 4) {
                            i14 = ((org.telegram.ui.ActionBar.e3) eaVar).currentAccount;
                            caVar = new ca(i20, i14, (ArrayList) null);
                        } else {
                            HashSet m13 = ea.m1(arrayList2, hashMap2);
                            int i22 = eaVar.N;
                            i15 = ((org.telegram.ui.ActionBar.e3) eaVar).currentAccount;
                            caVar = new ca(i22, i15, new ArrayList(m13));
                            ArrayList arrayList5 = caVar.f6739c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = caVar.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        }
                        eaVar.h1(caVar, new bi.d5(eaVar, 1), false);
                        return;
                    } else if (i19 == 2) {
                        if (eaVar.Z) {
                            eaVar.g1();
                            i13 = ((org.telegram.ui.ActionBar.e3) eaVar).currentAccount;
                            eaVar.h1(new ca(2, i13, arrayList), new bi.d5(eaVar, 1), false);
                            return;
                        }
                        eaVar.g1();
                        eaVar.f6914b.D(0);
                        return;
                    } else if (i19 == 3) {
                        if (eaVar.Z) {
                            HashSet m14 = ea.m1(arrayList, hashMap);
                            if (!m14.isEmpty()) {
                                eaVar.g1();
                                i12 = ((org.telegram.ui.ActionBar.e3) eaVar).currentAccount;
                                ca caVar2 = new ca(3, i12, new ArrayList(m14));
                                ArrayList arrayList6 = caVar2.f6739c;
                                arrayList6.clear();
                                arrayList6.addAll(arrayList);
                                HashMap hashMap6 = caVar2.d;
                                hashMap6.clear();
                                hashMap6.putAll(hashMap);
                                eaVar.h1(caVar2, new l9(x9Var, 0), false);
                                return;
                            }
                            return;
                        } else if (!ea.m1(arrayList, hashMap).isEmpty()) {
                            eaVar.N = 3;
                            eaVar.g1();
                            eaVar.f6914b.D(0);
                            return;
                        } else {
                            return;
                        }
                    } else if (i19 == 6) {
                        HashSet m15 = ea.m1(arrayList, hashMap);
                        dVar.setLoading(true);
                        i11 = ((org.telegram.ui.ActionBar.e3) eaVar).currentAccount;
                        bi.x8 storiesController = MessagesController.getInstance(i11).getStoriesController();
                        l9 l9Var = new l9(x9Var, 1);
                        int i23 = storiesController.f3962a;
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
                        Iterator it = m15.iterator();
                        while (it.hasNext()) {
                            Long l4 = (Long) it.next();
                            TLRPC.InputPeer inputPeer = MessagesController.getInstance(i23).getInputPeer(l4.longValue());
                            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerEmpty)) {
                                hashSet.add(l4);
                                tL_contacts_setBlocked.f19263id.add(inputPeer);
                            }
                        }
                        storiesController.N = hashSet.size() + storiesController.N;
                        tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                        ConnectionsManager.getInstance(i23).sendRequest(tL_contacts_setBlocked, new bi.z7(l9Var, 0));
                        return;
                    } else {
                        eaVar.N = i19;
                        eaVar.g1();
                        eaVar.f6914b.D(0);
                        return;
                    }
                }
                return;
            case 1:
                x9 x9Var2 = this.f7225b;
                ea eaVar2 = x9Var2.W;
                if (eaVar2.O) {
                    eaVar2.M = 5;
                    eaVar2.f6914b.D(1);
                    return;
                }
                Context context = x9Var2.getContext();
                c6Var = ((org.telegram.ui.ActionBar.e3) eaVar2).resourcesProvider;
                ea eaVar3 = new ea(context, c6Var);
                eaVar3.V = new m9(x9Var2, 1);
                eaVar3.Q = eaVar2.Q;
                eaVar3.show();
                return;
            default:
                x9 x9Var3 = this.f7225b;
                HashMap hashMap7 = x9Var3.d;
                a0.h hVar = x9Var3.f8095b;
                ArrayList arrayList7 = x9Var3.f8096c;
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
                x9Var3.W.J.clear();
                x9Var3.f8102x.f6667c.a();
                x9Var3.f(true);
                x9Var3.e(true);
                return;
        }
    }
}
