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
public final class n9 implements View.OnClickListener {
    public final int f7692a;
    public final ba f7693b;

    public n9(ba baVar, int i10) {
        this.f7692a = i10;
        this.f7693b = baVar;
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
        org.telegram.ui.ActionBar.f6 f6Var;
        switch (this.f7692a) {
            case 0:
                ba baVar = this.f7693b;
                HashMap hashMap = baVar.d;
                ArrayList arrayList = baVar.f6958c;
                ia iaVar = baVar.W;
                d dVar = baVar.v;
                if (!dVar.N) {
                    i10 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                    HashMap hashMap2 = iaVar.f7394e;
                    ArrayList arrayList2 = iaVar.d;
                    HashMap hashMap3 = iaVar.f7397r;
                    ArrayList arrayList3 = iaVar.f7396n;
                    MessagesController messagesController = MessagesController.getInstance(i10);
                    int i19 = baVar.f6956a;
                    if (i19 == 5) {
                        p9 p9Var = iaVar.V;
                        if (p9Var != null) {
                            p9Var.run(arrayList);
                        }
                        iaVar.dismiss();
                        return;
                    } else if (i19 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.f19919id.addAll(arrayList);
                        dVar.setLoading(true);
                        i18 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                        ConnectionsManager.getInstance(i18).sendRequest(tL_editCloseFriends, new bi.m1(7, baVar, messagesController));
                        return;
                    } else if (i19 == 0) {
                        int i20 = iaVar.N;
                        if (i20 == 3) {
                            HashSet l1 = ia.l1(arrayList3, hashMap3);
                            int i21 = iaVar.N;
                            i17 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                            gaVar = new ga(i21, i17, new ArrayList(l1));
                            ArrayList arrayList4 = gaVar.f7300c;
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
                            ArrayList arrayList5 = gaVar.f7300c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = gaVar.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        }
                        iaVar.g1(gaVar, new bi.b5(iaVar, 1), false);
                        return;
                    } else if (i19 == 2) {
                        if (iaVar.Z) {
                            iaVar.f1();
                            i13 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                            iaVar.g1(new ga(2, i13, arrayList), new bi.b5(iaVar, 1), false);
                            return;
                        }
                        iaVar.f1();
                        iaVar.f7390b.D(0);
                        return;
                    } else if (i19 == 3) {
                        if (iaVar.Z) {
                            HashSet l13 = ia.l1(arrayList, hashMap);
                            if (!l13.isEmpty()) {
                                iaVar.f1();
                                i12 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                                ga gaVar2 = new ga(3, i12, new ArrayList(l13));
                                ArrayList arrayList6 = gaVar2.f7300c;
                                arrayList6.clear();
                                arrayList6.addAll(arrayList);
                                HashMap hashMap6 = gaVar2.d;
                                hashMap6.clear();
                                hashMap6.putAll(hashMap);
                                iaVar.g1(gaVar2, new o9(baVar, 0), false);
                                return;
                            }
                            return;
                        } else if (!ia.l1(arrayList, hashMap).isEmpty()) {
                            iaVar.N = 3;
                            iaVar.f1();
                            iaVar.f7390b.D(0);
                            return;
                        } else {
                            return;
                        }
                    } else if (i19 == 6) {
                        HashSet l14 = ia.l1(arrayList, hashMap);
                        dVar.setLoading(true);
                        i11 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                        bi.u8 storiesController = MessagesController.getInstance(i11).getStoriesController();
                        o9 o9Var = new o9(baVar, 1);
                        int i23 = storiesController.f3805a;
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
                                tL_contacts_setBlocked.f19916id.add(inputPeer);
                            }
                        }
                        storiesController.N = hashSet.size() + storiesController.N;
                        tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                        ConnectionsManager.getInstance(i23).sendRequest(tL_contacts_setBlocked, new bi.v7(o9Var, 0));
                        return;
                    } else {
                        iaVar.N = i19;
                        iaVar.f1();
                        iaVar.f7390b.D(0);
                        return;
                    }
                }
                return;
            case 1:
                ba baVar2 = this.f7693b;
                ia iaVar2 = baVar2.W;
                if (iaVar2.O) {
                    iaVar2.M = 5;
                    iaVar2.f7390b.D(1);
                    return;
                }
                Context context = baVar2.getContext();
                f6Var = ((org.telegram.ui.ActionBar.f3) iaVar2).resourcesProvider;
                ia iaVar3 = new ia(context, f6Var);
                iaVar3.V = new p9(baVar2, 1);
                iaVar3.Q = iaVar2.Q;
                iaVar3.show();
                return;
            default:
                ba baVar3 = this.f7693b;
                HashMap hashMap7 = baVar3.d;
                a0.i iVar = baVar3.f6957b;
                ArrayList arrayList7 = baVar3.f6958c;
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
                baVar3.f6965x.f7241c.a();
                baVar3.f(true);
                baVar3.e(true);
                return;
        }
    }
}
