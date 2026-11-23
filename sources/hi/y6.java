package hi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.gp;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.n41;
public final class y6 implements p10 {
    public final int f15876a;
    public final e7 f15877b;

    public y6(e7 e7Var, int i7) {
        this.f15876a = i7;
        this.f15877b = e7Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        switch (this.f15876a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                b51 b51Var = (b51) obj2;
                e7 e7Var = this.f15877b;
                gp gpVar = e7Var.f14375a2;
                b51Var.G = 1;
                int L = org.telegram.messenger.g0.L(64.0f);
                arrayList.add(n41.D(org.telegram.messenger.g0.L(64.0f)));
                if (e7Var.V1 || e7Var.d2) {
                    L += e7Var.e1(true, arrayList, gd.N0(2131753902, null), e7Var.X1, false, false, -1);
                }
                if (!e7Var.V1) {
                    if (TextUtils.isEmpty(e7Var.f14387n2) && !e7Var.d2) {
                        b51Var.V();
                        n41 c10 = n41.c(1, 2131232031, gd.N0(2131744365, null));
                        c10.f37660r = true;
                        arrayList.add(c10);
                        b51Var.U();
                        L += org.telegram.messenger.g0.L(50.0f);
                    }
                    if (!e7Var.d2 && gpVar != null) {
                        L += e7Var.e1(true, arrayList, gd.N0(2131753901, null), gpVar.f24392c, gpVar.f24394f, !gpVar.f24393e, 2);
                    }
                    String N0 = gd.N0(2131753904, null);
                    ArrayList arrayList2 = e7Var.Y1;
                    if (!e7Var.f14391r2 && !e7Var.f14390q2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int e12 = L + e7Var.e1(false, arrayList, N0, arrayList2, z10, e7Var.f14389p2, 3);
                    String N02 = gd.N0(2131753903, null);
                    ArrayList arrayList3 = e7Var.Z1;
                    if (!e7Var.f14398y2 && !e7Var.f14397x2) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    L = e12 + e7Var.e1(false, arrayList, N02, arrayList3, z11, e7Var.f14396w2, 4);
                }
                int size = arrayList.size();
                if (!e7Var.V1 && TextUtils.isEmpty(e7Var.f14387n2) && !e7Var.d2) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
                if (size <= i7) {
                    if (TextUtils.isEmpty(e7Var.f14387n2)) {
                        arrayList.add(bj.i(gd.N0(2131748051, null), gd.N0(2131748050, null)));
                    } else {
                        String N03 = gd.N0(2131748050, null);
                        if (e7Var.f14387n2.length() >= 3) {
                            i10 = 2131748048;
                        } else {
                            i10 = 2131748049;
                        }
                        arrayList.add(bj.i(org.telegram.messenger.g0.W2(gd.a0(null, null, i10, e7Var.f14387n2)), N03));
                    }
                }
                arrayList.add(n41.C(null));
                arrayList.add(n41.D(Math.max(0, org.telegram.messenger.g0.L(24.0f) + (((org.telegram.messenger.g0.f24226q.y - (org.telegram.messenger.g0.L(12.0f) + L)) - org.telegram.messenger.g0.f24220m) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                e7 e7Var2 = this.f15877b;
                ArrayList arrayList4 = e7Var2.Z1;
                e7Var2.f14397x2 = false;
                e7Var2.f14398y2 = false;
                if (messages_botresults != null) {
                    mp.u1(e7Var2.f30223a).f4(messages_botresults.users, false);
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
                                int i12 = e7Var2.E2;
                                e7Var2.E2 = i12 - 1;
                                tL_message.f28513id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = i10.i(e7Var2.f30223a).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                arrayList4.add(new fj(e7Var2.f30223a, tL_message, false, true));
                            }
                        }
                    }
                    e7Var2.f14395v2 = messages_botresults.next_offset;
                    if (!arrayList4.isEmpty() && !TextUtils.isEmpty(e7Var2.f14395v2)) {
                        z12 = true;
                    }
                    e7Var2.f14396w2 = z12;
                    e7Var2.f14385l2.O(true);
                    return;
                }
                e7Var2.f14385l2.O(true);
                return;
        }
    }
}
