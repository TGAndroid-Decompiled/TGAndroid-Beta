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
public final class c4 implements y10 {
    public final int f3430a = 1;
    public final int f3431b;
    public final Object f3432c;
    public final long d;
    public final Object f3433e;
    public final Object f3434f;
    public final Object f3435g;

    public c4(int i7, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f3431b = i7;
        this.f3434f = connectedbotstarref;
        this.f3435g = w2Var;
        this.f3432c = context;
        this.d = j3;
        this.f3433e = h6Var;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        SpannableStringBuilder W2;
        int i10 = this.f3430a;
        long j3 = this.d;
        Object obj2 = this.f3435g;
        Object obj3 = this.f3433e;
        Object obj4 = this.f3432c;
        Object obj5 = this.f3434f;
        switch (i10) {
            case 0:
                aa.r rVar = (aa.r) obj5;
                Context context = (Context) obj4;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj3;
                lc lcVar = (lc) obj2;
                String str = (String) obj;
                if (str != null) {
                    l4.g(j3);
                    rVar.run();
                    a5.q(context, this.f3431b, h6Var, lcVar, str, null);
                    return;
                }
                return;
            case 1:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj5;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj2;
                Context context2 = (Context) obj4;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj3;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i11 = this.f3431b;
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
                if (i12 == this.f3431b) {
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

    public c4(long j3, aa.r rVar, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, lc lcVar) {
        this.d = j3;
        this.f3434f = rVar;
        this.f3432c = context;
        this.f3431b = i7;
        this.f3433e = h6Var;
        this.f3435g = lcVar;
    }

    public c4(j91 j91Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i7, ArrayList arrayList, long j3) {
        this.f3434f = j91Var;
        this.f3432c = tL_messages_invitedUsers;
        this.f3433e = iArr;
        this.f3431b = i7;
        this.f3435g = arrayList;
        this.d = j3;
    }
}
