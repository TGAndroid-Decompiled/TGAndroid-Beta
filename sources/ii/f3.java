package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.t4;
import org.telegram.ui.m91;
import org.telegram.ui.y81;
public final class f3 implements u10 {
    public final int f14937a = 0;
    public final int f14938b;
    public final long f14939c;
    public final Object d;
    public final Object f14940e;
    public final Object f14941f;
    public final Object f14942g;

    public f3(int i3, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.t2 t2Var, e6 e6Var) {
        this.f14938b = i3;
        this.d = connectedbotstarref;
        this.f14940e = t2Var;
        this.f14941f = context;
        this.f14939c = j10;
        this.f14942g = e6Var;
    }

    @Override
    public final void a(Object obj) {
        int i3;
        SpannableStringBuilder X2;
        int i10 = this.f14937a;
        Object obj2 = this.f14942g;
        Object obj3 = this.f14941f;
        Object obj4 = this.f14940e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj5;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj4;
                Context context = (Context) obj3;
                e6 e6Var = (e6) obj2;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i11 = this.f14938b;
                long j10 = this.f14939c;
                if (connectedbotstarref2 == null) {
                    TLRPC.User a22 = hp.s1(i11).a2(Long.valueOf(connectedbotstarref.bot_id));
                    if (a22 != null) {
                        hp.s1(i11).W2(a22, 0, true, new d3(t2Var, context, i11, j10, e6Var, 1));
                        return;
                    }
                    return;
                }
                t2Var.dismiss();
                q3.K0(context, i11, connectedbotstarref2, j10, e6Var);
                return;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                m91 m91Var = ((y81) obj5).f52227b;
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                if (i12 == this.f14938b) {
                    boolean isEmpty = tL_messages_invitedUsers.missing_invitees.isEmpty();
                    long j11 = this.f14939c;
                    if (isEmpty) {
                        fc a02 = fc.a0(m91Var);
                        TLRPC.Chat M0 = m91Var.getMessagesController().M0(Long.valueOf(j11));
                        a02.getClass();
                        if (arrayList.size() == 0) {
                            X2 = null;
                        } else if (arrayList.size() == 1) {
                            if (org.telegram.messenger.t3.V(M0)) {
                                X2 = org.telegram.messenger.g0.X2(bd.a0("HasBeenAddedToChannel", null, 2131749372, "**" + l10.j((TLRPC.User) arrayList.get(0), true) + "**"));
                            } else {
                                X2 = org.telegram.messenger.g0.X2(bd.a0("HasBeenAddedToGroup", null, 2131749371, "**" + l10.j((TLRPC.User) arrayList.get(0), true) + "**"));
                            }
                        } else if (org.telegram.messenger.t3.V(M0)) {
                            X2 = org.telegram.messenger.g0.X2(bd.G(arrayList.size(), "AddedMembersToChannel", new Object[0]));
                        } else {
                            X2 = org.telegram.messenger.g0.X2(bd.G(arrayList.size(), "AddedSubscribersToChannel", new Object[0]));
                        }
                        a02.V(arrayList, X2, null, null).j();
                        return;
                    }
                    TLRPC.Chat M02 = m91Var.getMessagesController().M0(Long.valueOf(j11));
                    i3 = ((org.telegram.ui.ActionBar.d2) m91Var).currentAccount;
                    t4.f(i3, M02, tL_messages_invitedUsers);
                    return;
                }
                return;
        }
    }

    public f3(y81 y81Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i3, ArrayList arrayList, long j10) {
        this.d = y81Var;
        this.f14940e = tL_messages_invitedUsers;
        this.f14941f = iArr;
        this.f14938b = i3;
        this.f14942g = arrayList;
        this.f14939c = j10;
    }
}
