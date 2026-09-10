package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class qa implements View.OnClickListener {
    public final int f3465a;
    public final kb f3466b;

    public qa(kb kbVar, int i10) {
        this.f3465a = i10;
        this.f3466b = kbVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        pb pbVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.f6 f6Var;
        switch (this.f3465a) {
            case 0:
                kb kbVar = this.f3466b;
                HashMap hashMap = kbVar.d;
                ArrayList arrayList = kbVar.f3008c;
                rb rbVar = kbVar.W;
                d dVar = kbVar.v;
                if (!dVar.N) {
                    i10 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                    HashMap hashMap2 = rbVar.e;
                    ArrayList arrayList2 = rbVar.d;
                    HashMap hashMap3 = rbVar.f3621r;
                    ArrayList arrayList3 = rbVar.f3620n;
                    MessagesController messagesController = MessagesController.getInstance(i10);
                    int i19 = kbVar.f3006a;
                    if (i19 == 5) {
                        ta taVar = rbVar.V;
                        if (taVar != null) {
                            taVar.run(arrayList);
                        }
                        rbVar.dismiss();
                        return;
                    } else if (i19 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.f17245id.addAll(arrayList);
                        dVar.setLoading(true);
                        i18 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                        ConnectionsManager.getInstance(i18).sendRequest(tL_editCloseFriends, new o2(2, kbVar, messagesController));
                        return;
                    } else if (i19 == 0) {
                        int i20 = rbVar.N;
                        if (i20 == 3) {
                            HashSet l1 = rb.l1(arrayList3, hashMap3);
                            int i21 = rbVar.N;
                            i17 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                            pbVar = new pb(i21, i17, new ArrayList(l1));
                            ArrayList arrayList4 = pbVar.f3417c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = pbVar.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i20 == 2) {
                            i16 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                            pbVar = new pb(i20, i16, rbVar.h);
                        } else if (i20 != 4) {
                            i14 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                            pbVar = new pb(i20, i14, (ArrayList) null);
                        } else {
                            HashSet l12 = rb.l1(arrayList2, hashMap2);
                            int i22 = rbVar.N;
                            i15 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                            pbVar = new pb(i22, i15, new ArrayList(l12));
                            ArrayList arrayList5 = pbVar.f3417c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = pbVar.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        }
                        rbVar.g1(pbVar, new ra(rbVar, 0), false);
                        return;
                    } else if (i19 == 2) {
                        if (rbVar.Z) {
                            rbVar.f1();
                            i13 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                            rbVar.g1(new pb(2, i13, arrayList), new ra(rbVar, 0), false);
                            return;
                        }
                        rbVar.f1();
                        rbVar.f3615b.D(0);
                        return;
                    } else if (i19 == 3) {
                        if (rbVar.Z) {
                            HashSet l13 = rb.l1(arrayList, hashMap);
                            if (!l13.isEmpty()) {
                                rbVar.f1();
                                i12 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                                pb pbVar2 = new pb(3, i12, new ArrayList(l13));
                                ArrayList arrayList6 = pbVar2.f3417c;
                                arrayList6.clear();
                                arrayList6.addAll(arrayList);
                                HashMap hashMap6 = pbVar2.d;
                                hashMap6.clear();
                                hashMap6.putAll(hashMap);
                                rbVar.g1(pbVar2, new sa(kbVar, 0), false);
                                return;
                            }
                            return;
                        } else if (!rb.l1(arrayList, hashMap).isEmpty()) {
                            rbVar.N = 3;
                            rbVar.f1();
                            rbVar.f3615b.D(0);
                            return;
                        } else {
                            return;
                        }
                    } else if (i19 == 6) {
                        HashSet l14 = rb.l1(arrayList, hashMap);
                        dVar.setLoading(true);
                        i11 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                        zh.i5 storiesController = MessagesController.getInstance(i11).getStoriesController();
                        sa saVar = new sa(kbVar, 1);
                        int i23 = storiesController.f48499a;
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
                                tL_contacts_setBlocked.f17242id.add(inputPeer);
                            }
                        }
                        storiesController.N = hashSet.size() + storiesController.N;
                        tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                        ConnectionsManager.getInstance(i23).sendRequest(tL_contacts_setBlocked, new c2(saVar, 27));
                        return;
                    } else {
                        rbVar.N = i19;
                        rbVar.f1();
                        rbVar.f3615b.D(0);
                        return;
                    }
                }
                return;
            case 1:
                kb kbVar2 = this.f3466b;
                rb rbVar2 = kbVar2.W;
                if (rbVar2.O) {
                    rbVar2.M = 5;
                    rbVar2.f3615b.D(1);
                    return;
                }
                Context context = kbVar2.getContext();
                f6Var = ((org.telegram.ui.ActionBar.h3) rbVar2).resourcesProvider;
                rb rbVar3 = new rb(context, f6Var);
                rbVar3.V = new ta(kbVar2, 1);
                rbVar3.Q = rbVar2.Q;
                rbVar3.show();
                return;
            default:
                kb kbVar3 = this.f3466b;
                HashMap hashMap7 = kbVar3.d;
                a0.i iVar = kbVar3.f3007b;
                ArrayList arrayList7 = kbVar3.f3008c;
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
                kbVar3.W.J.clear();
                kbVar3.f3014x.f3336c.a();
                kbVar3.f(true);
                kbVar3.e(true);
                return;
        }
    }
}
