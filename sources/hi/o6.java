package hi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.hp;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.cj;
import org.telegram.ui.Components.o41;
public final class o6 implements r10 {
    public final int f15221a;
    public final u6 f15222b;

    public o6(u6 u6Var, int i7) {
        this.f15221a = i7;
        this.f15222b = u6Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        switch (this.f15221a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                c51 c51Var = (c51) obj2;
                u6 u6Var = this.f15222b;
                hp hpVar = u6Var.f15547a2;
                c51Var.G = 1;
                int L = org.telegram.messenger.g0.L(64.0f);
                arrayList.add(o41.D(org.telegram.messenger.g0.L(64.0f)));
                if (u6Var.V1 || u6Var.d2) {
                    L += u6Var.e1(true, arrayList, hd.N0(2131753902, null), u6Var.X1, false, false, -1);
                }
                if (!u6Var.V1) {
                    if (TextUtils.isEmpty(u6Var.f15559n2) && !u6Var.d2) {
                        c51Var.V();
                        o41 c10 = o41.c(1, 2131232028, hd.N0(2131744366, null));
                        c10.f38097r = true;
                        arrayList.add(c10);
                        c51Var.U();
                        L += org.telegram.messenger.g0.L(50.0f);
                    }
                    if (!u6Var.d2 && hpVar != null) {
                        L += u6Var.e1(true, arrayList, hd.N0(2131753901, null), hpVar.f24522c, hpVar.f24524f, !hpVar.f24523e, 2);
                    }
                    String N0 = hd.N0(2131753904, null);
                    ArrayList arrayList2 = u6Var.Y1;
                    if (!u6Var.f15563r2 && !u6Var.f15562q2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int e12 = L + u6Var.e1(false, arrayList, N0, arrayList2, z10, u6Var.f15561p2, 3);
                    String N02 = hd.N0(2131753903, null);
                    ArrayList arrayList3 = u6Var.Z1;
                    if (!u6Var.f15570y2 && !u6Var.f15569x2) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    L = e12 + u6Var.e1(false, arrayList, N02, arrayList3, z11, u6Var.f15568w2, 4);
                }
                int size = arrayList.size();
                if (!u6Var.V1 && TextUtils.isEmpty(u6Var.f15559n2) && !u6Var.d2) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
                if (size <= i7) {
                    if (TextUtils.isEmpty(u6Var.f15559n2)) {
                        arrayList.add(cj.i(hd.N0(2131748051, null), hd.N0(2131748050, null)));
                    } else {
                        String N03 = hd.N0(2131748050, null);
                        if (u6Var.f15559n2.length() >= 3) {
                            i10 = 2131748048;
                        } else {
                            i10 = 2131748049;
                        }
                        arrayList.add(cj.i(org.telegram.messenger.g0.W2(hd.a0(null, null, i10, u6Var.f15559n2)), N03));
                    }
                }
                arrayList.add(o41.C(null));
                arrayList.add(o41.D(Math.max(0, org.telegram.messenger.g0.L(24.0f) + (((org.telegram.messenger.g0.f24046q.y - (org.telegram.messenger.g0.L(12.0f) + L)) - org.telegram.messenger.g0.f24040m) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                u6 u6Var2 = this.f15222b;
                ArrayList arrayList4 = u6Var2.Z1;
                u6Var2.f15569x2 = false;
                u6Var2.f15570y2 = false;
                if (messages_botresults != null) {
                    np.u1(u6Var2.f30173a).f4(messages_botresults.users, false);
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
                                int i12 = u6Var2.E2;
                                u6Var2.E2 = i12 - 1;
                                tL_message.f28455id = i12;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = k10.i(u6Var2.f30173a).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                arrayList4.add(new gj(u6Var2.f30173a, tL_message, false, true));
                            }
                        }
                    }
                    u6Var2.f15567v2 = messages_botresults.next_offset;
                    if (!arrayList4.isEmpty() && !TextUtils.isEmpty(u6Var2.f15567v2)) {
                        z12 = true;
                    }
                    u6Var2.f15568w2 = z12;
                    u6Var2.f15557l2.O(true);
                    return;
                }
                u6Var2.f15557l2.O(true);
                return;
        }
    }
}
