package lh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

public final class y8 implements View.OnClickListener {

    public final int f17122a;

    public final k9 f17123b;

    public y8(k9 k9Var, int i10) {
        this.f17122a = i10;
        this.f17123b = k9Var;
    }

    @Override
    public final void onClick(View view) {
        o9 o9Var;
        switch (this.f17122a) {
            case 0:
                k9 k9Var = this.f17123b;
                HashMap map = k9Var.d;
                ArrayList arrayList = k9Var.f16251c;
                q9 q9Var = k9Var.S;
                d dVar = k9Var.v;
                if (!dVar.J) {
                    int i10 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                    HashMap map2 = q9Var.f16595e;
                    ArrayList arrayList2 = q9Var.d;
                    HashMap map3 = q9Var.f16598r;
                    ArrayList arrayList3 = q9Var.f16597n;
                    MessagesController messagesController = MessagesController.getInstance(i10);
                    int i11 = k9Var.f16249a;
                    if (i11 == 5) {
                        a9 a9Var = q9Var.R;
                        if (a9Var != null) {
                            a9Var.run(arrayList);
                        }
                        q9Var.dismiss();
                        break;
                    } else if (i11 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.f22430id.addAll(arrayList);
                        dVar.setLoading(true);
                        ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).sendRequest(tL_editCloseFriends, new cg.g0(k9Var, messagesController, 17));
                        break;
                    } else if (i11 == 0) {
                        int i12 = q9Var.J;
                        if (i12 == 3) {
                            o9Var = new o9(q9Var.J, ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount, new ArrayList(q9.l1(arrayList3, map3)));
                            ArrayList arrayList4 = o9Var.f16491c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap map4 = o9Var.d;
                            map4.clear();
                            map4.putAll(map3);
                        } else if (i12 == 2) {
                            o9Var = new o9(i12, ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount, q9Var.h);
                        } else if (i12 == 4) {
                            o9Var = new o9(q9Var.J, ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount, new ArrayList(q9.l1(arrayList2, map2)));
                            ArrayList arrayList5 = o9Var.f16491c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap map5 = o9Var.d;
                            map5.clear();
                            map5.putAll(map2);
                        } else {
                            o9Var = new o9(i12, ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount, (ArrayList) null);
                        }
                        q9Var.g1(o9Var, new jh.u3(q9Var, 1), false);
                        break;
                    } else if (i11 == 2) {
                        if (q9Var.V) {
                            q9Var.f1();
                            q9Var.g1(new o9(2, ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount, arrayList), new jh.u3(q9Var, 1), false);
                        } else {
                            q9Var.f1();
                            q9Var.f16593b.D(0);
                        }
                        break;
                    } else if (i11 != 3) {
                        if (i11 == 6) {
                            HashSet<Long> hashSetL1 = q9.l1(arrayList, map);
                            dVar.setLoading(true);
                            jh.s6 storiesController = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).getStoriesController();
                            z8 z8Var = new z8(k9Var, 1);
                            int i13 = storiesController.f13955a;
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
                            for (Long l10 : hashSetL1) {
                                TLRPC.InputPeer inputPeer = MessagesController.getInstance(i13).getInputPeer(l10.longValue());
                                if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerEmpty)) {
                                    hashSet.add(l10);
                                    tL_contacts_setBlocked.f22427id.add(inputPeer);
                                }
                            }
                            storiesController.N = hashSet.size() + storiesController.N;
                            tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                            ConnectionsManager.getInstance(i13).sendRequest(tL_contacts_setBlocked, new cf.a(z8Var, 11));
                        } else {
                            q9Var.J = i11;
                            q9Var.f1();
                            q9Var.f16593b.D(0);
                        }
                        break;
                    } else if (q9Var.V) {
                        HashSet hashSetL2 = q9.l1(arrayList, map);
                        if (!hashSetL2.isEmpty()) {
                            q9Var.f1();
                            o9 o9Var2 = new o9(3, ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount, new ArrayList(hashSetL2));
                            ArrayList arrayList6 = o9Var2.f16491c;
                            arrayList6.clear();
                            arrayList6.addAll(arrayList);
                            HashMap map6 = o9Var2.d;
                            map6.clear();
                            map6.putAll(map);
                            q9Var.g1(o9Var2, new z8(k9Var, 0), false);
                            break;
                        }
                    } else if (!q9.l1(arrayList, map).isEmpty()) {
                        q9Var.J = 3;
                        q9Var.f1();
                        q9Var.f16593b.D(0);
                        break;
                    }
                }
                break;
            case 1:
                k9 k9Var2 = this.f17123b;
                q9 q9Var2 = k9Var2.S;
                if (q9Var2.K) {
                    q9Var2.I = 5;
                    q9Var2.f16593b.D(1);
                } else {
                    q9 q9Var3 = new q9(k9Var2.getContext(), ((org.telegram.ui.ActionBar.e3) q9Var2).resourcesProvider);
                    q9Var3.R = new a9(k9Var2, 1);
                    q9Var3.M = q9Var2.M;
                    q9Var3.show();
                }
                break;
            default:
                k9 k9Var3 = this.f17123b;
                HashMap map7 = k9Var3.d;
                a0.h hVar = k9Var3.f16250b;
                ArrayList arrayList7 = k9Var3.f16251c;
                int size2 = arrayList7.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj = arrayList7.get(i14);
                    i14++;
                    hVar.k(Boolean.FALSE, ((Long) obj).longValue());
                }
                for (ArrayList arrayList8 : map7.values()) {
                    int size3 = arrayList8.size();
                    int i15 = 0;
                    while (i15 < size3) {
                        Object obj2 = arrayList8.get(i15);
                        i15++;
                        hVar.k(Boolean.FALSE, ((Long) obj2).longValue());
                    }
                }
                arrayList7.clear();
                map7.clear();
                k9Var3.S.F.clear();
                k9Var3.f16258x.f16442c.a();
                k9Var3.f(true);
                k9Var3.e(true);
                break;
        }
    }
}
