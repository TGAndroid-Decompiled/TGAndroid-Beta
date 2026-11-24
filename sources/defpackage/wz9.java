package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
public final class wz9 implements jac {
    public final byte a;
    public final zz9 b;

    public wz9(zz9 zz9Var, byte b) {
        this.a = b;
        this.b = zz9Var;
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
                l7c l7cVar = (l7c) obj2;
                zz9 zz9Var = this.b;
                jc7 jc7Var = zz9Var.Z1;
                l7cVar.G = true;
                int L = gm.L(64.0f);
                arrayList.add(c6c.D(gm.L(64.0f)));
                if (zz9Var.U1 || zz9Var.c2) {
                    L += zz9Var.Y0(true, arrayList, jb6.M0(2131753870, null), zz9Var.W1, false, false, -1);
                }
                if (!zz9Var.U1) {
                    if (TextUtils.isEmpty(zz9Var.l2) && !zz9Var.c2) {
                        l7cVar.V();
                        c6c c = c6c.c(1, 2131232032, jb6.M0(2131744295, null));
                        c.r = true;
                        arrayList.add(c);
                        l7cVar.U();
                        L += gm.L(50.0f);
                    }
                    if (!zz9Var.c2 && jc7Var != null) {
                        L += zz9Var.Y0(true, arrayList, jb6.M0(2131753869, null), jc7Var.c, jc7Var.f, !jc7Var.e, 2);
                    }
                    String M0 = jb6.M0(2131753872, null);
                    ArrayList arrayList2 = zz9Var.X1;
                    if (!zz9Var.p2 && !zz9Var.o2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    int Y0 = L + zz9Var.Y0(false, arrayList, M0, arrayList2, z, zz9Var.n2, 3);
                    String M02 = jb6.M0(2131753871, null);
                    ArrayList arrayList3 = zz9Var.Y1;
                    if (!zz9Var.w2 && !zz9Var.v2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    L = Y0 + zz9Var.Y0(false, arrayList, M02, arrayList3, z2, zz9Var.u2, 4);
                }
                int size = arrayList.size();
                if (!zz9Var.U1 && TextUtils.isEmpty(zz9Var.l2) && !zz9Var.c2) {
                    i = 2;
                } else {
                    i = 1;
                }
                if (size <= i) {
                    if (TextUtils.isEmpty(zz9Var.l2)) {
                        arrayList.add(q22.i(jb6.M0(2131747978, null), jb6.M0(2131747977, null)));
                    } else {
                        String M03 = jb6.M0(2131747977, null);
                        if (zz9Var.l2.length() >= 3) {
                            i2 = 2131747975;
                        } else {
                            i2 = 2131747976;
                        }
                        arrayList.add(q22.i(gm.S2(jb6.a0(null, null, i2, zz9Var.l2)), M03));
                    }
                }
                arrayList.add(c6c.C(null));
                arrayList.add(c6c.D(Math.max(0, gm.L(24.0f) + (((gm.q.y - (gm.L(12.0f) + L)) - gm.m) - a.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                zz9 zz9Var2 = this.b;
                ArrayList arrayList4 = zz9Var2.Y1;
                zz9Var2.v2 = false;
                zz9Var2.w2 = false;
                if (messages_botresults != null) {
                    oc7.r1(zz9Var2.a).d4(messages_botresults.users, false);
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
                                int i4 = zz9Var2.C2;
                                zz9Var2.C2 = i4 - 1;
                                tL_message.id = i4;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = z8c.h(zz9Var2.a).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                arrayList4.add(new k47(zz9Var2.a, tL_message, false, true));
                            }
                        }
                    }
                    zz9Var2.t2 = messages_botresults.next_offset;
                    if (!arrayList4.isEmpty() && !TextUtils.isEmpty(zz9Var2.t2)) {
                        z3 = true;
                    }
                    zz9Var2.u2 = z3;
                    zz9Var2.j2.O(true);
                    return;
                }
                zz9Var2.j2.O(true);
                return;
        }
    }
}
