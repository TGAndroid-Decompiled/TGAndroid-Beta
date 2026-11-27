package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
public final class o1a implements icc {
    public final byte a;
    public final r1a b;

    public o1a(r1a r1aVar, byte b) {
        this.a = b;
        this.b = r1aVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3 = false;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                l9c l9cVar = (l9c) obj2;
                r1a r1aVar = this.b;
                pc7 pc7Var = r1aVar.Z1;
                l9cVar.G = true;
                int L = hl.L(64.0f);
                arrayList.add(b8c.D(hl.L(64.0f)));
                if (r1aVar.U1 || r1aVar.c2) {
                    L += r1aVar.Z0(true, arrayList, ob6.M0(2131753898, null), r1aVar.W1, false, false, -1);
                }
                if (!r1aVar.U1) {
                    if (TextUtils.isEmpty(r1aVar.l2) && !r1aVar.c2) {
                        l9cVar.V();
                        b8c c = b8c.c(1, 2131232031, ob6.M0(2131744263, null));
                        c.r = true;
                        arrayList.add(c);
                        l9cVar.U();
                        L += hl.L(50.0f);
                    }
                    if (!r1aVar.c2 && pc7Var != null) {
                        L += r1aVar.Z0(true, arrayList, ob6.M0(2131753897, null), pc7Var.c, pc7Var.f, !pc7Var.e, 2);
                    }
                    String M0 = ob6.M0(2131753900, null);
                    ArrayList arrayList2 = r1aVar.X1;
                    if (!r1aVar.p2 && !r1aVar.o2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    int Z0 = L + r1aVar.Z0(false, arrayList, M0, arrayList2, z, r1aVar.n2, 3);
                    String M02 = ob6.M0(2131753899, null);
                    ArrayList arrayList3 = r1aVar.Y1;
                    if (!r1aVar.w2 && !r1aVar.v2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    L = Z0 + r1aVar.Z0(false, arrayList, M02, arrayList3, z2, r1aVar.u2, 4);
                }
                int size = arrayList.size();
                if (!r1aVar.U1 && TextUtils.isEmpty(r1aVar.l2) && !r1aVar.c2) {
                    i = 2;
                } else {
                    i = 1;
                }
                if (size <= i) {
                    if (TextUtils.isEmpty(r1aVar.l2)) {
                        arrayList.add(v12.i(ob6.M0(2131747975, null), ob6.M0(2131747974, null)));
                    } else {
                        String M03 = ob6.M0(2131747974, null);
                        if (r1aVar.l2.length() >= 3) {
                            i2 = 2131747972;
                        } else {
                            i2 = 2131747973;
                        }
                        arrayList.add(v12.i(hl.S2(ob6.a0(null, null, i2, r1aVar.l2)), M03));
                    }
                }
                arrayList.add(b8c.C(null));
                arrayList.add(b8c.D(Math.max(0, hl.L(24.0f) + (((hl.q.y - (hl.L(12.0f) + L)) - hl.m) - a.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                r1a r1aVar2 = this.b;
                ArrayList arrayList4 = r1aVar2.Y1;
                r1aVar2.v2 = false;
                r1aVar2.w2 = false;
                if (messages_botresults != null) {
                    uc7.s1(r1aVar2.a).j4(messages_botresults.users, false);
                    ArrayList<TLRPC.BotInlineResult> arrayList5 = messages_botresults.results;
                    int size2 = arrayList5.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        TLRPC.BotInlineResult botInlineResult = arrayList5.get(i3);
                        i3++;
                        TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
                        if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                            TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                            if (tL_botInlineMediaResult.document != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                int i4 = r1aVar2.C2;
                                r1aVar2.C2 = i4 - 1;
                                tL_message.id = i4;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = yac.h(r1aVar2.a).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                arrayList4.add(new r47(r1aVar2.a, tL_message, false, true));
                            }
                        }
                    }
                    r1aVar2.t2 = messages_botresults.next_offset;
                    if (!arrayList4.isEmpty() && !TextUtils.isEmpty(r1aVar2.t2)) {
                        z3 = true;
                    }
                    r1aVar2.u2 = z3;
                    r1aVar2.j2.O(true);
                    return;
                }
                r1aVar2.j2.O(true);
                return;
        }
    }
}
