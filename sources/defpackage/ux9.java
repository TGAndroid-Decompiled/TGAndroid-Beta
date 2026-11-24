package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
public final class ux9 implements i8c {
    public final byte a;
    public final yx9 b;

    public ux9(yx9 yx9Var, byte b) {
        this.a = b;
        this.b = yx9Var;
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
                l5c l5cVar = (l5c) obj2;
                yx9 yx9Var = this.b;
                ia7 ia7Var = yx9Var.Z1;
                l5cVar.G = true;
                int L = gl.L(64.0f);
                arrayList.add(c4c.D(gl.L(64.0f)));
                if (yx9Var.U1 || yx9Var.c2) {
                    L += yx9Var.Y0(true, arrayList, k96.M0(2131753902, null), yx9Var.W1, false, false, -1);
                }
                if (!yx9Var.U1) {
                    if (TextUtils.isEmpty(yx9Var.l2) && !yx9Var.c2) {
                        l5cVar.V();
                        c4c c = c4c.c(1, 2131232031, k96.M0(2131744369, null));
                        c.r = true;
                        arrayList.add(c);
                        l5cVar.U();
                        L += gl.L(50.0f);
                    }
                    if (!yx9Var.c2 && ia7Var != null) {
                        L += yx9Var.Y0(true, arrayList, k96.M0(2131753901, null), ia7Var.c, ia7Var.f, !ia7Var.e, 2);
                    }
                    String M0 = k96.M0(2131753904, null);
                    ArrayList arrayList2 = yx9Var.X1;
                    if (!yx9Var.p2 && !yx9Var.o2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    int Y0 = L + yx9Var.Y0(false, arrayList, M0, arrayList2, z, yx9Var.n2, 3);
                    String M02 = k96.M0(2131753903, null);
                    ArrayList arrayList3 = yx9Var.Y1;
                    if (!yx9Var.w2 && !yx9Var.v2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    L = Y0 + yx9Var.Y0(false, arrayList, M02, arrayList3, z2, yx9Var.u2, 4);
                }
                int size = arrayList.size();
                if (!yx9Var.U1 && TextUtils.isEmpty(yx9Var.l2) && !yx9Var.c2) {
                    i = 2;
                } else {
                    i = 1;
                }
                if (size <= i) {
                    if (TextUtils.isEmpty(yx9Var.l2)) {
                        arrayList.add(f12.i(k96.M0(2131748052, null), k96.M0(2131748051, null)));
                    } else {
                        String M03 = k96.M0(2131748051, null);
                        if (yx9Var.l2.length() >= 3) {
                            i2 = 2131748049;
                        } else {
                            i2 = 2131748050;
                        }
                        arrayList.add(f12.i(gl.S2(k96.a0(null, null, i2, yx9Var.l2)), M03));
                    }
                }
                arrayList.add(c4c.C(null));
                arrayList.add(c4c.D(Math.max(0, gl.L(24.0f) + (((gl.q.y - (gl.L(12.0f) + L)) - gl.m) - a.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                yx9 yx9Var2 = this.b;
                ArrayList arrayList4 = yx9Var2.Y1;
                yx9Var2.v2 = false;
                yx9Var2.w2 = false;
                if (messages_botresults != null) {
                    na7.q1(yx9Var2.a).b4(messages_botresults.users, false);
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
                                int i4 = yx9Var2.C2;
                                yx9Var2.C2 = i4 - 1;
                                tL_message.id = i4;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = y6c.h(yx9Var2.a).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                arrayList4.add(new k27(yx9Var2.a, tL_message, false, true));
                            }
                        }
                    }
                    yx9Var2.t2 = messages_botresults.next_offset;
                    if (!arrayList4.isEmpty() && !TextUtils.isEmpty(yx9Var2.t2)) {
                        z3 = true;
                    }
                    yx9Var2.u2 = z3;
                    yx9Var2.j2.O(true);
                    return;
                }
                yx9Var2.j2.O(true);
                return;
        }
    }
}
