package ei;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class z8 implements View.OnClickListener {
    public final int f10243a;
    public final k9 f10244b;

    public z8(k9 k9Var, int i10) {
        this.f10243a = i10;
        this.f10244b = k9Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        p9 p9Var;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.d6 d6Var;
        switch (this.f10243a) {
            case 0:
                k9 k9Var = this.f10244b;
                HashMap hashMap = k9Var.d;
                ArrayList arrayList = k9Var.f9329c;
                r9 r9Var = k9Var.W;
                d dVar = k9Var.v;
                if (!dVar.N) {
                    i10 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                    HashMap hashMap2 = r9Var.e;
                    ArrayList arrayList2 = r9Var.d;
                    HashMap hashMap3 = r9Var.f9752r;
                    ArrayList arrayList3 = r9Var.f9751n;
                    MessagesController messagesController = MessagesController.getInstance(i10);
                    int i19 = k9Var.f9327a;
                    if (i19 == 5) {
                        b9 b9Var = r9Var.V;
                        if (b9Var != null) {
                            b9Var.run(arrayList);
                        }
                        r9Var.dismiss();
                        return;
                    } else if (i19 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.f20322id.addAll(arrayList);
                        dVar.setLoading(true);
                        i18 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                        ConnectionsManager.getInstance(i18).sendRequest(tL_editCloseFriends, new ai.g(14, k9Var, messagesController));
                        return;
                    } else if (i19 == 0) {
                        int i20 = r9Var.N;
                        if (i20 == 3) {
                            HashSet m12 = r9.m1(arrayList3, hashMap3);
                            int i21 = r9Var.N;
                            i17 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                            p9Var = new p9(i21, i17, new ArrayList(m12));
                            ArrayList arrayList4 = p9Var.f9603c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = p9Var.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i20 == 2) {
                            i16 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                            p9Var = new p9(i20, i16, r9Var.h);
                        } else if (i20 != 4) {
                            i14 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                            p9Var = new p9(i20, i14, (ArrayList) null);
                        } else {
                            HashSet m13 = r9.m1(arrayList2, hashMap2);
                            int i22 = r9Var.N;
                            i15 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                            p9Var = new p9(i22, i15, new ArrayList(m13));
                            ArrayList arrayList5 = p9Var.f9603c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = p9Var.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        }
                        r9Var.h1(p9Var, new ci.e4(r9Var, 1), false);
                        return;
                    } else if (i19 == 2) {
                        if (r9Var.Z) {
                            r9Var.g1();
                            i13 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                            r9Var.h1(new p9(2, i13, arrayList), new ci.e4(r9Var, 1), false);
                            return;
                        }
                        r9Var.g1();
                        r9Var.f9746b.D(0);
                        return;
                    } else if (i19 == 3) {
                        if (r9Var.Z) {
                            HashSet m14 = r9.m1(arrayList, hashMap);
                            if (!m14.isEmpty()) {
                                r9Var.g1();
                                i12 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                                p9 p9Var2 = new p9(3, i12, new ArrayList(m14));
                                ArrayList arrayList6 = p9Var2.f9603c;
                                arrayList6.clear();
                                arrayList6.addAll(arrayList);
                                HashMap hashMap6 = p9Var2.d;
                                hashMap6.clear();
                                hashMap6.putAll(hashMap);
                                r9Var.h1(p9Var2, new a9(k9Var, 0), false);
                                return;
                            }
                            return;
                        } else if (!r9.m1(arrayList, hashMap).isEmpty()) {
                            r9Var.N = 3;
                            r9Var.g1();
                            r9Var.f9746b.D(0);
                            return;
                        } else {
                            return;
                        }
                    } else if (i19 == 6) {
                        HashSet m15 = r9.m1(arrayList, hashMap);
                        dVar.setLoading(true);
                        i11 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                        ci.i7 storiesController = MessagesController.getInstance(i11).getStoriesController();
                        a9 a9Var = new a9(k9Var, 1);
                        int i23 = storiesController.f5493a;
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
                                tL_contacts_setBlocked.f20319id.add(inputPeer);
                            }
                        }
                        storiesController.N = hashSet.size() + storiesController.N;
                        tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                        ConnectionsManager.getInstance(i23).sendRequest(tL_contacts_setBlocked, new ai.h(a9Var, 6));
                        return;
                    } else {
                        r9Var.N = i19;
                        r9Var.g1();
                        r9Var.f9746b.D(0);
                        return;
                    }
                }
                return;
            case 1:
                k9 k9Var2 = this.f10244b;
                r9 r9Var2 = k9Var2.W;
                if (r9Var2.O) {
                    r9Var2.M = 5;
                    r9Var2.f9746b.D(1);
                    return;
                }
                Context context = k9Var2.getContext();
                d6Var = ((org.telegram.ui.ActionBar.f3) r9Var2).resourcesProvider;
                r9 r9Var3 = new r9(context, d6Var);
                r9Var3.V = new b9(k9Var2, 1);
                r9Var3.Q = r9Var2.Q;
                r9Var3.show();
                return;
            default:
                k9 k9Var3 = this.f10244b;
                HashMap hashMap7 = k9Var3.d;
                a0.h hVar = k9Var3.f9328b;
                ArrayList arrayList7 = k9Var3.f9329c;
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
                k9Var3.W.J.clear();
                k9Var3.f9335x.f9562c.a();
                k9Var3.f(true);
                k9Var3.e(true);
                return;
        }
    }
}
