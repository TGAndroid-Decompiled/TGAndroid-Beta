package ki;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.t4;
import org.telegram.ui.f91;
import org.telegram.ui.u91;
public final class c3 implements z10 {
    public final int f18237a = 0;
    public final int f18238b;
    public final long f18239c;
    public final Object d;
    public final Object f18240e;
    public final Object f18241f;
    public final Object f18242g;

    public c3(int i7, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.u2 u2Var, e6 e6Var) {
        this.f18238b = i7;
        this.d = connectedbotstarref;
        this.f18240e = u2Var;
        this.f18241f = context;
        this.f18239c = j3;
        this.f18242g = e6Var;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        SpannableStringBuilder X2;
        int i10 = this.f18237a;
        Object obj2 = this.f18242g;
        Object obj3 = this.f18241f;
        Object obj4 = this.f18240e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj5;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) obj4;
                Context context = (Context) obj3;
                e6 e6Var = (e6) obj2;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i11 = this.f18238b;
                long j3 = this.f18239c;
                if (connectedbotstarref2 == null) {
                    TLRPC.User a22 = np.s1(i11).a2(Long.valueOf(connectedbotstarref.bot_id));
                    if (a22 != null) {
                        np.s1(i11).W2(a22, 0, true, new a3(u2Var, context, i11, j3, e6Var, 1));
                        return;
                    }
                    return;
                }
                u2Var.dismiss();
                n3.K0(context, i11, connectedbotstarref2, j3, e6Var);
                return;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                u91 u91Var = ((f91) obj5).f47078b;
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                if (i12 == this.f18238b) {
                    boolean isEmpty = tL_messages_invitedUsers.missing_invitees.isEmpty();
                    long j10 = this.f18239c;
                    if (isEmpty) {
                        cc a02 = cc.a0(u91Var);
                        TLRPC.Chat M0 = u91Var.getMessagesController().M0(Long.valueOf(j10));
                        a02.getClass();
                        if (arrayList.size() == 0) {
                            X2 = null;
                        } else if (arrayList.size() == 1) {
                            if (org.telegram.messenger.t3.V(M0)) {
                                X2 = org.telegram.messenger.g0.X2(hd.a0("HasBeenAddedToChannel", null, 2131749364, "**" + q10.j((TLRPC.User) arrayList.get(0), true) + "**"));
                            } else {
                                X2 = org.telegram.messenger.g0.X2(hd.a0("HasBeenAddedToGroup", null, 2131749363, "**" + q10.j((TLRPC.User) arrayList.get(0), true) + "**"));
                            }
                        } else if (org.telegram.messenger.t3.V(M0)) {
                            X2 = org.telegram.messenger.g0.X2(hd.G(arrayList.size(), "AddedMembersToChannel", new Object[0]));
                        } else {
                            X2 = org.telegram.messenger.g0.X2(hd.G(arrayList.size(), "AddedSubscribersToChannel", new Object[0]));
                        }
                        a02.V(arrayList, X2, null, null).j();
                        return;
                    }
                    TLRPC.Chat M02 = u91Var.getMessagesController().M0(Long.valueOf(j10));
                    i7 = ((org.telegram.ui.ActionBar.e2) u91Var).currentAccount;
                    t4.f(i7, M02, tL_messages_invitedUsers);
                    return;
                }
                return;
        }
    }

    public c3(f91 f91Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i7, ArrayList arrayList, long j3) {
        this.d = f91Var;
        this.f18240e = tL_messages_invitedUsers;
        this.f18241f = iArr;
        this.f18238b = i7;
        this.f18242g = arrayList;
        this.f18239c = j3;
    }
}
