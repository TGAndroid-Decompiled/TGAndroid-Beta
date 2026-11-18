package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.lc;
import org.telegram.ui.j91;
import org.telegram.ui.y91;
public final class w3 implements x10 {
    public final int f4176a = 1;
    public final int f4177b;
    public final Object f4178c;
    public final long d;
    public final Object f4179e;
    public final Object f4180f;
    public final Object f4181g;

    public w3(int i7, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.x2 x2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f4177b = i7;
        this.f4180f = connectedbotstarref;
        this.f4181g = x2Var;
        this.f4178c = context;
        this.d = j3;
        this.f4179e = i6Var;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        SpannableStringBuilder W2;
        int i10 = this.f4176a;
        long j3 = this.d;
        Object obj2 = this.f4181g;
        Object obj3 = this.f4179e;
        Object obj4 = this.f4178c;
        Object obj5 = this.f4180f;
        switch (i10) {
            case 0:
                aa.r rVar = (aa.r) obj5;
                Context context = (Context) obj4;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj3;
                lc lcVar = (lc) obj2;
                String str = (String) obj;
                if (str != null) {
                    f4.f(j3);
                    rVar.run();
                    v4.q(context, this.f4177b, i6Var, lcVar, str, null);
                    return;
                }
                return;
            case 1:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj5;
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) obj2;
                Context context2 = (Context) obj4;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj3;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i11 = this.f4177b;
                long j10 = this.d;
                if (connectedbotstarref2 == null) {
                    TLRPC.User c22 = mp.u1(i11).c2(Long.valueOf(connectedbotstarref.bot_id));
                    if (c22 != null) {
                        mp.u1(i11).c3(c22, 0, true, new ki.w2(x2Var, context2, i11, j10, i6Var2, 1));
                        return;
                    }
                    return;
                }
                x2Var.dismiss();
                ki.i3.K0(context2, i11, connectedbotstarref2, j10, i6Var2);
                return;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                y91 y91Var = ((j91) obj5).f48928b;
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                if (i12 == this.f4177b) {
                    if (tL_messages_invitedUsers.missing_invitees.isEmpty()) {
                        lc b02 = lc.b0(y91Var);
                        TLRPC.Chat O0 = y91Var.getMessagesController().O0(Long.valueOf(j3));
                        b02.getClass();
                        if (arrayList.size() == 0) {
                            W2 = null;
                        } else if (arrayList.size() == 1) {
                            if (org.telegram.messenger.v3.V(O0)) {
                                W2 = org.telegram.messenger.g0.W2(gd.a0("HasBeenAddedToChannel", null, 2131749172, "**" + o10.k((TLRPC.User) arrayList.get(0), true) + "**"));
                            } else {
                                W2 = org.telegram.messenger.g0.W2(gd.a0("HasBeenAddedToGroup", null, 2131749171, "**" + o10.k((TLRPC.User) arrayList.get(0), true) + "**"));
                            }
                        } else if (org.telegram.messenger.v3.V(O0)) {
                            W2 = org.telegram.messenger.g0.W2(gd.G(arrayList.size(), "AddedMembersToChannel", new Object[0]));
                        } else {
                            W2 = org.telegram.messenger.g0.W2(gd.G(arrayList.size(), "AddedSubscribersToChannel", new Object[0]));
                        }
                        b02.V(arrayList, W2, null, null).j();
                        return;
                    }
                    TLRPC.Chat O02 = y91Var.getMessagesController().O0(Long.valueOf(j3));
                    i7 = ((org.telegram.ui.ActionBar.h2) y91Var).currentAccount;
                    org.telegram.ui.Components.b5.f(i7, O02, tL_messages_invitedUsers);
                    return;
                }
                return;
        }
    }

    public w3(long j3, aa.r rVar, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, lc lcVar) {
        this.d = j3;
        this.f4180f = rVar;
        this.f4178c = context;
        this.f4177b = i7;
        this.f4179e = i6Var;
        this.f4181g = lcVar;
    }

    public w3(j91 j91Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i7, ArrayList arrayList, long j3) {
        this.f4180f = j91Var;
        this.f4178c = tL_messages_invitedUsers;
        this.f4179e = iArr;
        this.f4177b = i7;
        this.f4181g = arrayList;
        this.d = j3;
    }
}
