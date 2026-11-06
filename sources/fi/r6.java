package fi;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.kp;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.r31;
public final class r6 implements v10 {
    public final int f12743a;
    public final w6 f12744b;

    public r6(w6 w6Var, int i7) {
        this.f12743a = i7;
        this.f12744b = w6Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10;
        boolean z9;
        boolean z10;
        boolean z11 = false;
        switch (this.f12743a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                f41 f41Var = (f41) obj2;
                w6 w6Var = this.f12744b;
                kp kpVar = w6Var.W1;
                f41Var.F = 1;
                int L = org.telegram.messenger.g0.L(64.0f);
                arrayList.add(r31.D(org.telegram.messenger.g0.L(64.0f)));
                if (w6Var.R1 || w6Var.Z1) {
                    L += w6Var.d1(true, arrayList, hd.M0(2131753905, null), w6Var.T1, false, false, -1);
                }
                if (!w6Var.R1) {
                    if (TextUtils.isEmpty(w6Var.f13041j2) && !w6Var.Z1) {
                        f41Var.V();
                        r31 c10 = r31.c(1, 2131232027, hd.M0(2131744610, null));
                        c10.f37603q = true;
                        arrayList.add(c10);
                        f41Var.U();
                        L += org.telegram.messenger.g0.L(50.0f);
                    }
                    if (!w6Var.Z1 && kpVar != null) {
                        L += w6Var.d1(true, arrayList, hd.M0(2131753904, null), kpVar.f23734c, kpVar.f23736f, !kpVar.f23735e, 2);
                    }
                    String M0 = hd.M0(2131753907, null);
                    ArrayList arrayList2 = w6Var.U1;
                    if (!w6Var.f13045n2 && !w6Var.f13044m2) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    int d12 = L + w6Var.d1(false, arrayList, M0, arrayList2, z9, w6Var.f13043l2, 3);
                    String M02 = hd.M0(2131753906, null);
                    ArrayList arrayList3 = w6Var.V1;
                    if (!w6Var.f13052u2 && !w6Var.f13051t2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    L = d12 + w6Var.d1(false, arrayList, M02, arrayList3, z10, w6Var.f13050s2, 4);
                }
                int size = arrayList.size();
                if (!w6Var.R1 && TextUtils.isEmpty(w6Var.f13041j2) && !w6Var.Z1) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
                if (size <= i7) {
                    if (TextUtils.isEmpty(w6Var.f13041j2)) {
                        String M03 = hd.M0(2131748242, null);
                        String M04 = hd.M0(2131748243, null);
                        int i11 = li.f35659b;
                        r31 K = r31.K(li.class);
                        K.f37598l = M03;
                        K.f37599m = M04;
                        arrayList.add(K);
                    } else {
                        String M05 = hd.M0(2131748242, null);
                        if (w6Var.f13041j2.length() >= 3) {
                            i10 = 2131748240;
                        } else {
                            i10 = 2131748241;
                        }
                        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.a0(null, null, i10, w6Var.f13041j2));
                        int i12 = li.f35659b;
                        r31 K2 = r31.K(li.class);
                        K2.f37598l = M05;
                        K2.f37599m = X2;
                        arrayList.add(K2);
                    }
                }
                arrayList.add(r31.C(null));
                arrayList.add(r31.D(Math.max(0, org.telegram.messenger.g0.L(24.0f) + (((org.telegram.messenger.g0.f22537q.y - (org.telegram.messenger.g0.L(12.0f) + L)) - org.telegram.messenger.g0.f22531m) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                w6 w6Var2 = this.f12744b;
                ArrayList arrayList4 = w6Var2.V1;
                w6Var2.f13051t2 = false;
                w6Var2.f13052u2 = false;
                if (messages_botresults != null) {
                    qp.s1(w6Var2.f28612a).Y3(messages_botresults.users, false);
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
                                int i14 = w6Var2.A2;
                                w6Var2.A2 = i14 - 1;
                                tL_message.f26973id = i14;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = p10.i(w6Var2.f28612a).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                arrayList4.add(new ij(w6Var2.f28612a, tL_message, false, true));
                            }
                        }
                    }
                    w6Var2.f13049r2 = messages_botresults.next_offset;
                    if (!arrayList4.isEmpty() && !TextUtils.isEmpty(w6Var2.f13049r2)) {
                        z11 = true;
                    }
                    w6Var2.f13050s2 = z11;
                    w6Var2.f13039h2.O(true);
                    return;
                }
                w6Var2.f13039h2.O(true);
                return;
        }
    }
}
