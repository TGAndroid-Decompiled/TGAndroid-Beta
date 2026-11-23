package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.lc;
import org.telegram.ui.j91;
import org.telegram.ui.y91;
public final class a4 implements y10 {
    public final int f3401a = 1;
    public final int f3402b;
    public final Object f3403c;
    public final long d;
    public final Object f3404e;
    public final Object f3405f;
    public final Object f3406g;

    public a4(int i7, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f3402b = i7;
        this.f3405f = connectedbotstarref;
        this.f3406g = w2Var;
        this.f3403c = context;
        this.d = j3;
        this.f3404e = h6Var;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        SpannableStringBuilder W2;
        int i10 = this.f3401a;
        long j3 = this.d;
        Object obj2 = this.f3406g;
        Object obj3 = this.f3404e;
        Object obj4 = this.f3403c;
        Object obj5 = this.f3405f;
        switch (i10) {
            case 0:
                aa.r rVar = (aa.r) obj5;
                Context context = (Context) obj4;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj3;
                lc lcVar = (lc) obj2;
                String str = (String) obj;
                if (str != null) {
                    i4.g(j3);
                    rVar.run();
                    x4.q(context, this.f3402b, h6Var, lcVar, str, null);
                    return;
                }
                return;
            case 1:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj5;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj2;
                Context context2 = (Context) obj4;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj3;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i11 = this.f3402b;
                long j10 = this.d;
                if (connectedbotstarref2 == null) {
                    TLRPC.User c22 = np.u1(i11).c2(Long.valueOf(connectedbotstarref.bot_id));
                    if (c22 != null) {
                        np.u1(i11).c3(c22, 0, true, new ki.v2(w2Var, context2, i11, j10, h6Var2, 1));
                        return;
                    }
                    return;
                }
                w2Var.dismiss();
                ki.h3.K0(context2, i11, connectedbotstarref2, j10, h6Var2);
                return;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                y91 y91Var = ((j91) obj5).f48945b;
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                if (i12 == this.f3402b) {
                    if (tL_messages_invitedUsers.missing_invitees.isEmpty()) {
                        lc b02 = lc.b0(y91Var);
                        TLRPC.Chat O0 = y91Var.getMessagesController().O0(Long.valueOf(j3));
                        b02.getClass();
                        if (arrayList.size() == 0) {
                            W2 = null;
                        } else if (arrayList.size() == 1) {
                            if (org.telegram.messenger.v3.V(O0)) {
                                W2 = org.telegram.messenger.g0.W2(hd.a0("HasBeenAddedToChannel", null, 2131749171, "**" + p10.k((TLRPC.User) arrayList.get(0), true) + "**"));
                            } else {
                                W2 = org.telegram.messenger.g0.W2(hd.a0("HasBeenAddedToGroup", null, 2131749170, "**" + p10.k((TLRPC.User) arrayList.get(0), true) + "**"));
                            }
                        } else if (org.telegram.messenger.v3.V(O0)) {
                            W2 = org.telegram.messenger.g0.W2(hd.G(arrayList.size(), "AddedMembersToChannel", new Object[0]));
                        } else {
                            W2 = org.telegram.messenger.g0.W2(hd.G(arrayList.size(), "AddedSubscribersToChannel", new Object[0]));
                        }
                        b02.V(arrayList, W2, null, null).j();
                        return;
                    }
                    TLRPC.Chat O02 = y91Var.getMessagesController().O0(Long.valueOf(j3));
                    i7 = ((org.telegram.ui.ActionBar.g2) y91Var).currentAccount;
                    org.telegram.ui.Components.c5.f(i7, O02, tL_messages_invitedUsers);
                    return;
                }
                return;
        }
    }

    public a4(long j3, aa.r rVar, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, lc lcVar) {
        this.d = j3;
        this.f3405f = rVar;
        this.f3403c = context;
        this.f3402b = i7;
        this.f3404e = h6Var;
        this.f3406g = lcVar;
    }

    public a4(j91 j91Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i7, ArrayList arrayList, long j3) {
        this.f3405f = j91Var;
        this.f3403c = tL_messages_invitedUsers;
        this.f3404e = iArr;
        this.f3402b = i7;
        this.f3406g = arrayList;
        this.d = j3;
    }
}
