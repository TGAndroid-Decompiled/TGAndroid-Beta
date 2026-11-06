package hi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.v4;
import org.telegram.ui.h91;
import org.telegram.ui.v91;
public final class f3 implements c20 {
    public final int f14652a = 0;
    public final int f14653b;
    public final long f14654c;
    public final Object d;
    public final Object f14655e;
    public final Object f14656f;
    public final Object f14657g;

    public f3(int i7, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.v2 v2Var, f6 f6Var) {
        this.f14653b = i7;
        this.d = connectedbotstarref;
        this.f14655e = v2Var;
        this.f14656f = context;
        this.f14654c = j3;
        this.f14657g = f6Var;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        SpannableStringBuilder X2;
        int i10 = this.f14652a;
        Object obj2 = this.f14657g;
        Object obj3 = this.f14656f;
        Object obj4 = this.f14655e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj5;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) obj4;
                Context context = (Context) obj3;
                f6 f6Var = (f6) obj2;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i11 = this.f14653b;
                long j3 = this.f14654c;
                if (connectedbotstarref2 == null) {
                    TLRPC.User a22 = qp.s1(i11).a2(Long.valueOf(connectedbotstarref.bot_id));
                    if (a22 != null) {
                        qp.s1(i11).W2(a22, 0, true, new d3(v2Var, context, i11, j3, f6Var, 1));
                        return;
                    }
                    return;
                }
                v2Var.dismiss();
                q3.K0(context, i11, connectedbotstarref2, j3, f6Var);
                return;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                v91 v91Var = ((h91) obj5).f46288b;
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                if (i12 == this.f14653b) {
                    boolean isEmpty = tL_messages_invitedUsers.missing_invitees.isEmpty();
                    long j10 = this.f14654c;
                    if (isEmpty) {
                        hc a02 = hc.a0(v91Var);
                        TLRPC.Chat M0 = v91Var.getMessagesController().M0(Long.valueOf(j10));
                        a02.getClass();
                        if (arrayList.size() == 0) {
                            X2 = null;
                        } else if (arrayList.size() == 1) {
                            if (org.telegram.messenger.t3.V(M0)) {
                                X2 = org.telegram.messenger.g0.X2(hd.a0("HasBeenAddedToChannel", null, 2131749363, "**" + t10.j((TLRPC.User) arrayList.get(0), true) + "**"));
                            } else {
                                X2 = org.telegram.messenger.g0.X2(hd.a0("HasBeenAddedToGroup", null, 2131749362, "**" + t10.j((TLRPC.User) arrayList.get(0), true) + "**"));
                            }
                        } else if (org.telegram.messenger.t3.V(M0)) {
                            X2 = org.telegram.messenger.g0.X2(hd.G(arrayList.size(), "AddedMembersToChannel", new Object[0]));
                        } else {
                            X2 = org.telegram.messenger.g0.X2(hd.G(arrayList.size(), "AddedSubscribersToChannel", new Object[0]));
                        }
                        a02.V(arrayList, X2, null, null).j();
                        return;
                    }
                    TLRPC.Chat M02 = v91Var.getMessagesController().M0(Long.valueOf(j10));
                    i7 = ((org.telegram.ui.ActionBar.f2) v91Var).currentAccount;
                    v4.f(i7, M02, tL_messages_invitedUsers);
                    return;
                }
                return;
        }
    }

    public f3(h91 h91Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i7, ArrayList arrayList, long j3) {
        this.d = h91Var;
        this.f14655e = tL_messages_invitedUsers;
        this.f14656f = iArr;
        this.f14653b = i7;
        this.f14657g = arrayList;
        this.f14654c = j3;
    }
}
