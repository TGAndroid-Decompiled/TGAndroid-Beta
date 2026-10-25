package fi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class v8 implements View.OnClickListener {
    public final int f11825a;
    public final g9 f11826b;

    public v8(g9 g9Var, int i10) {
        this.f11825a = i10;
        this.f11826b = g9Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        l9 l9Var;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.u6 u6Var;
        switch (this.f11825a) {
            case 0:
                g9 g9Var = this.f11826b;
                HashMap hashMap = g9Var.d;
                ArrayList arrayList = g9Var.f10922c;
                n9 n9Var = g9Var.W;
                d dVar = g9Var.v;
                if (!dVar.Q) {
                    i10 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                    HashMap hashMap2 = n9Var.e;
                    ArrayList arrayList2 = n9Var.d;
                    HashMap hashMap3 = n9Var.f11317r;
                    ArrayList arrayList3 = n9Var.f11316n;
                    MessagesController messagesController = MessagesController.getInstance(i10);
                    int i19 = g9Var.f10920a;
                    if (i19 == 5) {
                        x8 x8Var = n9Var.V;
                        if (x8Var != null) {
                            x8Var.run(arrayList);
                        }
                        n9Var.dismiss();
                        return;
                    } else if (i19 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.f22077id.addAll(arrayList);
                        dVar.setLoading(true);
                        i18 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                        ConnectionsManager.getInstance(i18).sendRequest(tL_editCloseFriends, new bi.j(15, g9Var, messagesController));
                        return;
                    } else if (i19 == 0) {
                        int i20 = n9Var.N;
                        if (i20 == 3) {
                            HashSet m12 = n9.m1(arrayList3, hashMap3);
                            int i21 = n9Var.N;
                            i17 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                            l9Var = new l9(i21, i17, new ArrayList(m12));
                            ArrayList arrayList4 = l9Var.f11183c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = l9Var.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i20 == 2) {
                            i16 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                            l9Var = new l9(i20, i16, n9Var.h);
                        } else if (i20 != 4) {
                            i14 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                            l9Var = new l9(i20, i14, (ArrayList) null);
                        } else {
                            HashSet m13 = n9.m1(arrayList2, hashMap2);
                            int i22 = n9Var.N;
                            i15 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                            l9Var = new l9(i22, i15, new ArrayList(m13));
                            ArrayList arrayList5 = l9Var.f11183c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = l9Var.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        }
                        n9Var.h1(l9Var, new di.e4(n9Var, 1), false);
                        return;
                    } else if (i19 == 2) {
                        if (n9Var.Z) {
                            n9Var.g1();
                            i13 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                            n9Var.h1(new l9(2, i13, arrayList), new di.e4(n9Var, 1), false);
                            return;
                        }
                        n9Var.g1();
                        n9Var.f11311b.E(0);
                        return;
                    } else if (i19 == 3) {
                        if (n9Var.Z) {
                            HashSet m14 = n9.m1(arrayList, hashMap);
                            if (!m14.isEmpty()) {
                                n9Var.g1();
                                i12 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                                l9 l9Var2 = new l9(3, i12, new ArrayList(m14));
                                ArrayList arrayList6 = l9Var2.f11183c;
                                arrayList6.clear();
                                arrayList6.addAll(arrayList);
                                HashMap hashMap6 = l9Var2.d;
                                hashMap6.clear();
                                hashMap6.putAll(hashMap);
                                n9Var.h1(l9Var2, new w8(g9Var, 0), false);
                                return;
                            }
                            return;
                        } else if (!n9.m1(arrayList, hashMap).isEmpty()) {
                            n9Var.N = 3;
                            n9Var.g1();
                            n9Var.f11311b.E(0);
                            return;
                        } else {
                            return;
                        }
                    } else if (i19 == 6) {
                        HashSet m15 = n9.m1(arrayList, hashMap);
                        dVar.setLoading(true);
                        i11 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                        di.h7 storiesController = MessagesController.getInstance(i11).getStoriesController();
                        w8 w8Var = new w8(g9Var, 1);
                        int i23 = storiesController.f8630a;
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
                                tL_contacts_setBlocked.f22074id.add(inputPeer);
                            }
                        }
                        storiesController.N = hashSet.size() + storiesController.N;
                        tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                        ConnectionsManager.getInstance(i23).sendRequest(tL_contacts_setBlocked, new bi.i0(w8Var, 5));
                        return;
                    } else {
                        n9Var.N = i19;
                        n9Var.g1();
                        n9Var.f11311b.E(0);
                        return;
                    }
                }
                return;
            case 1:
                g9 g9Var2 = this.f11826b;
                n9 n9Var2 = g9Var2.W;
                if (n9Var2.O) {
                    n9Var2.M = 5;
                    n9Var2.f11311b.E(1);
                    return;
                }
                Context context = g9Var2.getContext();
                u6Var = ((org.telegram.ui.ActionBar.k3) n9Var2).resourcesProvider;
                n9 n9Var3 = new n9(context, u6Var);
                n9Var3.V = new x8(g9Var2, 1);
                n9Var3.Q = n9Var2.Q;
                n9Var3.show();
                return;
            default:
                g9 g9Var3 = this.f11826b;
                HashMap hashMap7 = g9Var3.d;
                a0.h hVar = g9Var3.f10921b;
                ArrayList arrayList7 = g9Var3.f10922c;
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
                g9Var3.W.J.clear();
                g9Var3.f10928x.d.a();
                g9Var3.f(true);
                g9Var3.e(true);
                return;
        }
    }
}
