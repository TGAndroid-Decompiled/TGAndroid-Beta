package hi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.gp;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class p6 implements q10 {
    public final int f15236a;
    public final v6 f15237b;

    public p6(v6 v6Var, int i7) {
        this.f15236a = i7;
        this.f15237b = v6Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        switch (this.f15236a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                z41 z41Var = (z41) obj2;
                v6 v6Var = this.f15237b;
                gp gpVar = v6Var.f15577a2;
                z41Var.G = 1;
                int L = org.telegram.messenger.g0.L(64.0f);
                arrayList.add(l41.D(org.telegram.messenger.g0.L(64.0f)));
                if (v6Var.V1 || v6Var.d2) {
                    L += v6Var.e1(true, arrayList, gd.M0(2131753903, null), v6Var.X1, false, false, -1);
                }
                if (!v6Var.V1) {
                    if (TextUtils.isEmpty(v6Var.f15589n2) && !v6Var.d2) {
                        z41Var.V();
                        l41 c10 = l41.c(1, 2131232028, gd.M0(2131744374, null));
                        c10.f37023r = true;
                        arrayList.add(c10);
                        z41Var.U();
                        L += org.telegram.messenger.g0.L(50.0f);
                    }
                    if (!v6Var.d2 && gpVar != null) {
                        L += v6Var.e1(true, arrayList, gd.M0(2131753902, null), gpVar.f24291c, gpVar.f24293f, !gpVar.f24292e, 2);
                    }
                    String M0 = gd.M0(2131753905, null);
                    ArrayList arrayList2 = v6Var.Y1;
                    if (!v6Var.f15593r2 && !v6Var.f15592q2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int e12 = L + v6Var.e1(false, arrayList, M0, arrayList2, z10, v6Var.f15591p2, 3);
                    String M02 = gd.M0(2131753904, null);
                    ArrayList arrayList3 = v6Var.Z1;
                    if (!v6Var.f15600y2 && !v6Var.f15599x2) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    L = e12 + v6Var.e1(false, arrayList, M02, arrayList3, z11, v6Var.f15598w2, 4);
                }
                int size = arrayList.size();
                if (!v6Var.V1 && TextUtils.isEmpty(v6Var.f15589n2) && !v6Var.d2) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
                if (size <= i7) {
                    if (TextUtils.isEmpty(v6Var.f15589n2)) {
                        arrayList.add(aj.i(gd.M0(2131748052, null), gd.M0(2131748051, null)));
                    } else {
                        String M03 = gd.M0(2131748051, null);
                        if (v6Var.f15589n2.length() >= 3) {
                            i10 = 2131748049;
                        } else {
                            i10 = 2131748050;
                        }
                        arrayList.add(aj.i(org.telegram.messenger.g0.W2(gd.a0(null, null, i10, v6Var.f15589n2)), M03));
                    }
                }
                arrayList.add(l41.C(null));
                arrayList.add(l41.D(Math.max(0, org.telegram.messenger.g0.L(24.0f) + (((org.telegram.messenger.g0.f24118q.y - (org.telegram.messenger.g0.L(12.0f) + L)) - org.telegram.messenger.g0.f24112m) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                v6 v6Var2 = this.f15237b;
                ArrayList arrayList4 = v6Var2.Z1;
                v6Var2.f15599x2 = false;
                v6Var2.f15600y2 = false;
                if (messages_botresults != null) {
                    mp.u1(v6Var2.f30187a).f4(messages_botresults.users, false);
                    ArrayList<TLRPC.BotInlineResult> arrayList5 = messages_botresults.results;
                    int size2 = arrayList5.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        TLRPC.BotInlineResult botInlineResult = arrayList5.get(i11);
                        i11++;
                        TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
                        if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                            TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                            if (tL_botInlineMediaResult.document != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                int i12 = v6Var2.E2;
                                v6Var2.E2 = i12 - 1;
                                tL_message.f28424id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = j10.i(v6Var2.f30187a).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                arrayList4.add(new fj(v6Var2.f30187a, tL_message, false, true));
                            }
                        }
                    }
                    v6Var2.f15597v2 = messages_botresults.next_offset;
                    if (!arrayList4.isEmpty() && !TextUtils.isEmpty(v6Var2.f15597v2)) {
                        z12 = true;
                    }
                    v6Var2.f15598w2 = z12;
                    v6Var2.f15587l2.O(true);
                    return;
                }
                v6Var2.f15587l2.O(true);
                return;
        }
    }
}
