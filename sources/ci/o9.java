package ci;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class o9 implements View.OnClickListener {
    public final int f5194a;
    public final ba f5195b;

    public o9(ba baVar, int i10) {
        this.f5194a = i10;
        this.f5195b = baVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        ga gaVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.e6 e6Var;
        switch (this.f5194a) {
            case 0:
                ba baVar = this.f5195b;
                HashMap hashMap = baVar.d;
                ArrayList arrayList = baVar.f4403c;
                ia iaVar = baVar.W;
                d dVar = baVar.v;
                if (!dVar.N) {
                    i10 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                    HashMap hashMap2 = iaVar.e;
                    ArrayList arrayList2 = iaVar.d;
                    HashMap hashMap3 = iaVar.f4812r;
                    ArrayList arrayList3 = iaVar.f4811n;
                    MessagesController messagesController = MessagesController.getInstance(i10);
                    int i19 = baVar.f4401a;
                    if (i19 == 5) {
                        q9 q9Var = iaVar.V;
                        if (q9Var != null) {
                            q9Var.run(arrayList);
                        }
                        iaVar.dismiss();
                        return;
                    } else if (i19 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.f18346id.addAll(arrayList);
                        dVar.setLoading(true);
                        i18 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                        ConnectionsManager.getInstance(i18).sendRequest(tL_editCloseFriends, new ai.v1(7, baVar, messagesController));
                        return;
                    } else if (i19 == 0) {
                        int i20 = iaVar.N;
                        if (i20 == 3) {
                            HashSet l1 = ia.l1(arrayList3, hashMap3);
                            int i21 = iaVar.N;
                            i17 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                            gaVar = new ga(i21, i17, new ArrayList(l1));
                            ArrayList arrayList4 = gaVar.f4727c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = gaVar.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i20 == 2) {
                            i16 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                            gaVar = new ga(i20, i16, iaVar.h);
                        } else if (i20 != 4) {
                            i14 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                            gaVar = new ga(i20, i14, (ArrayList) null);
                        } else {
                            HashSet l12 = ia.l1(arrayList2, hashMap2);
                            int i22 = iaVar.N;
                            i15 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                            gaVar = new ga(i22, i15, new ArrayList(l12));
                            ArrayList arrayList5 = gaVar.f4727c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = gaVar.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        }
                        iaVar.g1(gaVar, new ai.s5(iaVar, 1), false);
                        return;
                    } else if (i19 == 2) {
                        if (iaVar.Z) {
                            iaVar.f1();
                            i13 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                            iaVar.g1(new ga(2, i13, arrayList), new ai.s5(iaVar, 1), false);
                            return;
                        }
                        iaVar.f1();
                        iaVar.f4806b.E(0);
                        return;
                    } else if (i19 == 3) {
                        if (iaVar.Z) {
                            HashSet l13 = ia.l1(arrayList, hashMap);
                            if (!l13.isEmpty()) {
                                iaVar.f1();
                                i12 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                                ga gaVar2 = new ga(3, i12, new ArrayList(l13));
                                ArrayList arrayList6 = gaVar2.f4727c;
                                arrayList6.clear();
                                arrayList6.addAll(arrayList);
                                HashMap hashMap6 = gaVar2.d;
                                hashMap6.clear();
                                hashMap6.putAll(hashMap);
                                iaVar.g1(gaVar2, new p9(baVar, 0), false);
                                return;
                            }
                            return;
                        } else if (!ia.l1(arrayList, hashMap).isEmpty()) {
                            iaVar.N = 3;
                            iaVar.f1();
                            iaVar.f4806b.E(0);
                            return;
                        } else {
                            return;
                        }
                    } else if (i19 == 6) {
                        HashSet l14 = ia.l1(arrayList, hashMap);
                        dVar.setLoading(true);
                        i11 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                        ai.l9 storiesController = MessagesController.getInstance(i11).getStoriesController();
                        p9 p9Var = new p9(baVar, 1);
                        int i23 = storiesController.f1193a;
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
                            Long l4 = (Long) it.next();
                            TLRPC.InputPeer inputPeer = MessagesController.getInstance(i23).getInputPeer(l4.longValue());
                            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerEmpty)) {
                                hashSet.add(l4);
                                tL_contacts_setBlocked.f18343id.add(inputPeer);
                            }
                        }
                        storiesController.N = hashSet.size() + storiesController.N;
                        tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                        ConnectionsManager.getInstance(i23).sendRequest(tL_contacts_setBlocked, new ai.m8(p9Var, 0));
                        return;
                    } else {
                        iaVar.N = i19;
                        iaVar.f1();
                        iaVar.f4806b.E(0);
                        return;
                    }
                }
                return;
            case 1:
                ba baVar2 = this.f5195b;
                ia iaVar2 = baVar2.W;
                if (iaVar2.O) {
                    iaVar2.M = 5;
                    iaVar2.f4806b.E(1);
                    return;
                }
                Context context = baVar2.getContext();
                e6Var = ((org.telegram.ui.ActionBar.f3) iaVar2).resourcesProvider;
                ia iaVar3 = new ia(context, e6Var);
                iaVar3.V = new q9(baVar2, 1);
                iaVar3.Q = iaVar2.Q;
                iaVar3.show();
                return;
            default:
                ba baVar3 = this.f5195b;
                HashMap hashMap7 = baVar3.d;
                a0.i iVar = baVar3.f4402b;
                ArrayList arrayList7 = baVar3.f4403c;
                int size2 = arrayList7.size();
                int i24 = 0;
                while (i24 < size2) {
                    Object obj = arrayList7.get(i24);
                    i24++;
                    iVar.k(Boolean.FALSE, ((Long) obj).longValue());
                }
                for (ArrayList arrayList8 : hashMap7.values()) {
                    int size3 = arrayList8.size();
                    int i25 = 0;
                    while (i25 < size3) {
                        Object obj2 = arrayList8.get(i25);
                        i25++;
                        iVar.k(Boolean.FALSE, ((Long) obj2).longValue());
                    }
                }
                arrayList7.clear();
                hashMap7.clear();
                baVar3.W.J.clear();
                baVar3.f4409x.f4671c.a();
                baVar3.f(true);
                baVar3.e(true);
                return;
        }
    }
}
