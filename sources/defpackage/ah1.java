package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d;
public final class ah1 implements qac {
    public final byte a = 0;
    public final long b;
    public final Object c;
    public final int d;
    public final Object e;
    public final Object f;
    public final Object g;

    public ah1(int i, long j, my0 my0Var, ylb ylbVar, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.d = i;
        this.f = connectedbotstarref;
        this.g = my0Var;
        this.c = context;
        this.b = j;
        this.e = ylbVar;
    }

    @Override
    public final void a(Object obj) {
        int i;
        SpannableStringBuilder S2;
        byte b = this.a;
        long j = this.b;
        Object obj2 = this.e;
        Object obj3 = this.c;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (b) {
            case 0:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj5;
                my0 my0Var = (my0) obj4;
                Context context = (Context) obj3;
                ylb ylbVar = (ylb) obj2;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i2 = this.d;
                long j2 = this.b;
                if (connectedbotstarref2 == null) {
                    TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(connectedbotstarref.bot_id));
                    if (W1 != null) {
                        oc7.r1(i2).b3(W1, 0, true, new yg1(my0Var, context, i2, j2, ylbVar, (byte) 1));
                        return;
                    }
                    return;
                }
                my0Var.dismiss();
                mh1.K0(context, i2, connectedbotstarref2, j2, ylbVar);
                return;
            case 1:
                ud7 ud7Var = (ud7) obj5;
                Context context2 = (Context) obj3;
                ylb ylbVar2 = (ylb) obj2;
                c41 c41Var = (c41) obj4;
                String str = (String) obj;
                if (str != null) {
                    yr7.g(j);
                    ud7Var.run();
                    fs7.q(context2, this.d, ylbVar2, c41Var, str, null);
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                sxb sxbVar = ((cxb) obj5).b;
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i3 = iArr[0] + 1;
                iArr[0] = i3;
                if (i3 == this.d) {
                    if (tL_messages_invitedUsers.missing_invitees.isEmpty()) {
                        c41 b0 = c41.b0(sxbVar);
                        TLRPC.Chat L0 = sxbVar.getMessagesController().L0(Long.valueOf(j));
                        b0.getClass();
                        if (arrayList.size() == 0) {
                            S2 = null;
                        } else if (arrayList.size() == 1) {
                            if (sd2.V(L0)) {
                                S2 = gm.S2(jb6.a0("HasBeenAddedToChannel", null, 2131749121, "**" + m9c.k((TLRPC.User) arrayList.get(0), true) + "**"));
                            } else {
                                S2 = gm.S2(jb6.a0("HasBeenAddedToGroup", null, 2131749120, "**" + m9c.k((TLRPC.User) arrayList.get(0), true) + "**"));
                            }
                        } else if (sd2.V(L0)) {
                            S2 = gm.S2(jb6.G(arrayList.size(), "AddedMembersToChannel", new Object[0]));
                        } else {
                            S2 = gm.S2(jb6.G(arrayList.size(), "AddedSubscribersToChannel", new Object[0]));
                        }
                        b0.V(arrayList, S2, null, null).j();
                        return;
                    }
                    TLRPC.Chat L02 = sxbVar.getMessagesController().L0(Long.valueOf(j));
                    i = ((d) sxbVar).currentAccount;
                    ik.f(i, L02, tL_messages_invitedUsers);
                    return;
                }
                return;
        }
    }

    public ah1(long j, ud7 ud7Var, Context context, int i, ylb ylbVar, c41 c41Var) {
        this.b = j;
        this.f = ud7Var;
        this.c = context;
        this.d = i;
        this.e = ylbVar;
        this.g = c41Var;
    }

    public ah1(cxb cxbVar, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i, ArrayList arrayList, long j) {
        this.f = cxbVar;
        this.g = tL_messages_invitedUsers;
        this.c = iArr;
        this.d = i;
        this.e = arrayList;
        this.b = j;
    }
}
