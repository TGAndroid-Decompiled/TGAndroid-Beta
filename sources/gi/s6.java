package gi;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.bp;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.r31;
public final class s6 implements n10 {
    public final int f13564a;
    public final x6 f13565b;

    public s6(x6 x6Var, int i3) {
        this.f13564a = i3;
        this.f13565b = x6Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i3;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        switch (this.f13564a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                f41 f41Var = (f41) obj2;
                x6 x6Var = this.f13565b;
                bp bpVar = x6Var.X1;
                f41Var.G = 1;
                int L = org.telegram.messenger.g0.L(64.0f);
                arrayList.add(r31.D(org.telegram.messenger.g0.L(64.0f)));
                if (x6Var.S1 || x6Var.f13844a2) {
                    L += x6Var.d1(true, arrayList, bd.M0(2131753905, null), x6Var.U1, false, false, -1);
                }
                if (!x6Var.S1) {
                    if (TextUtils.isEmpty(x6Var.f13853k2) && !x6Var.f13844a2) {
                        f41Var.V();
                        r31 c2 = r31.c(1, 2131232027, bd.M0(2131744619, null));
                        c2.f37632q = true;
                        arrayList.add(c2);
                        f41Var.U();
                        L += org.telegram.messenger.g0.L(50.0f);
                    }
                    if (!x6Var.f13844a2 && bpVar != null) {
                        L += x6Var.d1(true, arrayList, bd.M0(2131753904, null), bpVar.f21866c, bpVar.f21868f, !bpVar.f21867e, 2);
                    }
                    String M0 = bd.M0(2131753907, null);
                    ArrayList arrayList2 = x6Var.V1;
                    if (!x6Var.f13857o2 && !x6Var.f13856n2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int d12 = L + x6Var.d1(false, arrayList, M0, arrayList2, z10, x6Var.f13855m2, 3);
                    String M02 = bd.M0(2131753906, null);
                    ArrayList arrayList3 = x6Var.W1;
                    if (!x6Var.f13864v2 && !x6Var.f13863u2) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    L = d12 + x6Var.d1(false, arrayList, M02, arrayList3, z11, x6Var.f13862t2, 4);
                }
                int size = arrayList.size();
                if (!x6Var.S1 && TextUtils.isEmpty(x6Var.f13853k2) && !x6Var.f13844a2) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                if (size <= i3) {
                    if (TextUtils.isEmpty(x6Var.f13853k2)) {
                        String M03 = bd.M0(2131748251, null);
                        String M04 = bd.M0(2131748252, null);
                        int i11 = li.f35732b;
                        r31 K = r31.K(li.class);
                        K.f37627l = M03;
                        K.f37628m = M04;
                        arrayList.add(K);
                    } else {
                        String M05 = bd.M0(2131748251, null);
                        if (x6Var.f13853k2.length() >= 3) {
                            i10 = 2131748249;
                        } else {
                            i10 = 2131748250;
                        }
                        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bd.a0(null, null, i10, x6Var.f13853k2));
                        int i12 = li.f35732b;
                        r31 K2 = r31.K(li.class);
                        K2.f37627l = M05;
                        K2.f37628m = X2;
                        arrayList.add(K2);
                    }
                }
                arrayList.add(r31.C(null));
                arrayList.add(r31.D(Math.max(0, org.telegram.messenger.g0.L(24.0f) + (((org.telegram.messenger.g0.f22608q.y - (org.telegram.messenger.g0.L(12.0f) + L)) - org.telegram.messenger.g0.f22602m) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                x6 x6Var2 = this.f13565b;
                ArrayList arrayList4 = x6Var2.W1;
                x6Var2.f13863u2 = false;
                x6Var2.f13864v2 = false;
                if (messages_botresults != null) {
                    hp.s1(x6Var2.f28583a).Y3(messages_botresults.users, false);
                    ArrayList<TLRPC.BotInlineResult> arrayList5 = messages_botresults.results;
                    int size2 = arrayList5.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        TLRPC.BotInlineResult botInlineResult = arrayList5.get(i13);
                        i13++;
                        TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
                        if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                            TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                            if (tL_botInlineMediaResult.document != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                int i14 = x6Var2.B2;
                                x6Var2.B2 = i14 - 1;
                                tL_message.f27022id = i14;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = h10.i(x6Var2.f28583a).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                arrayList4.add(new zi(x6Var2.f28583a, tL_message, false, true));
                            }
                        }
                    }
                    x6Var2.f13861s2 = messages_botresults.next_offset;
                    if (!arrayList4.isEmpty() && !TextUtils.isEmpty(x6Var2.f13861s2)) {
                        z12 = true;
                    }
                    x6Var2.f13862t2 = z12;
                    x6Var2.f13851i2.O(true);
                    return;
                }
                x6Var2.f13851i2.O(true);
                return;
        }
    }
}
