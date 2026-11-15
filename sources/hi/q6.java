package hi;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.hp;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.ti;
public final class q6 implements s10 {
    public final int f14913a;
    public final v6 f14914b;

    public q6(v6 v6Var, int i7) {
        this.f14913a = i7;
        this.f14914b = v6Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        switch (this.f14913a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                p41 p41Var = (p41) obj2;
                v6 v6Var = this.f14914b;
                hp hpVar = v6Var.f15220a2;
                p41Var.G = 1;
                int L = org.telegram.messenger.g0.L(64.0f);
                arrayList.add(b41.D(org.telegram.messenger.g0.L(64.0f)));
                if (v6Var.V1 || v6Var.d2) {
                    L += v6Var.d1(true, arrayList, hd.M0(2131753905, null), v6Var.X1, false, false, -1);
                }
                if (!v6Var.V1) {
                    if (TextUtils.isEmpty(v6Var.f15232n2) && !v6Var.d2) {
                        p41Var.V();
                        b41 c10 = b41.c(1, 2131232027, hd.M0(2131744609, null));
                        c10.f33186q = true;
                        arrayList.add(c10);
                        p41Var.U();
                        L += org.telegram.messenger.g0.L(50.0f);
                    }
                    if (!v6Var.d2 && hpVar != null) {
                        L += v6Var.d1(true, arrayList, hd.M0(2131753904, null), hpVar.f24202c, hpVar.f24204f, !hpVar.f24203e, 2);
                    }
                    String M0 = hd.M0(2131753907, null);
                    ArrayList arrayList2 = v6Var.Y1;
                    if (!v6Var.f15236r2 && !v6Var.f15235q2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int d12 = L + v6Var.d1(false, arrayList, M0, arrayList2, z10, v6Var.f15234p2, 3);
                    String M02 = hd.M0(2131753906, null);
                    ArrayList arrayList3 = v6Var.Z1;
                    if (!v6Var.f15243y2 && !v6Var.f15242x2) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    L = d12 + v6Var.d1(false, arrayList, M02, arrayList3, z11, v6Var.f15241w2, 4);
                }
                int size = arrayList.size();
                if (!v6Var.V1 && TextUtils.isEmpty(v6Var.f15232n2) && !v6Var.d2) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
                if (size <= i7) {
                    if (TextUtils.isEmpty(v6Var.f15232n2)) {
                        String M03 = hd.M0(2131748243, null);
                        String M04 = hd.M0(2131748244, null);
                        int i11 = ti.f39703b;
                        b41 K = b41.K(ti.class);
                        K.f33181l = M03;
                        K.f33182m = M04;
                        arrayList.add(K);
                    } else {
                        String M05 = hd.M0(2131748243, null);
                        if (v6Var.f15232n2.length() >= 3) {
                            i10 = 2131748241;
                        } else {
                            i10 = 2131748242;
                        }
                        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.a0(null, null, i10, v6Var.f15232n2));
                        int i12 = ti.f39703b;
                        b41 K2 = b41.K(ti.class);
                        K2.f33181l = M05;
                        K2.f33182m = X2;
                        arrayList.add(K2);
                    }
                }
                arrayList.add(b41.C(null));
                arrayList.add(b41.D(Math.max(0, org.telegram.messenger.g0.L(24.0f) + (((org.telegram.messenger.g0.f23609q.y - (org.telegram.messenger.g0.L(12.0f) + L)) - org.telegram.messenger.g0.f23603m) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                v6 v6Var2 = this.f14914b;
                ArrayList arrayList4 = v6Var2.Z1;
                v6Var2.f15242x2 = false;
                v6Var2.f15243y2 = false;
                if (messages_botresults != null) {
                    np.s1(v6Var2.f29679a).Y3(messages_botresults.users, false);
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
                                int i14 = v6Var2.E2;
                                v6Var2.E2 = i14 - 1;
                                tL_message.f28072id = i14;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = m10.i(v6Var2.f29679a).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                arrayList4.add(new gj(v6Var2.f29679a, tL_message, false, true));
                            }
                        }
                    }
                    v6Var2.f15240v2 = messages_botresults.next_offset;
                    if (!arrayList4.isEmpty() && !TextUtils.isEmpty(v6Var2.f15240v2)) {
                        z12 = true;
                    }
                    v6Var2.f15241w2 = z12;
                    v6Var2.f15230l2.O(true);
                    return;
                }
                v6Var2.f15230l2.O(true);
                return;
        }
    }
}
