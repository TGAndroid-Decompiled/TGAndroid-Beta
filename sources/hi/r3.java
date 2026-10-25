package hi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.wc;
import org.telegram.ui.af1;
import org.telegram.ui.ke1;
public final class r3 implements Utilities.Callback {
    public final int f13242a = 0;
    public final int f13243b;
    public final long f13244c;
    public final Object d;
    public final Object e;
    public final Object f13245f;
    public final Object f13246g;

    public r3(int i10, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.k3 k3Var, u6 u6Var) {
        this.f13243b = i10;
        this.d = connectedbotstarref;
        this.e = k3Var;
        this.f13245f = context;
        this.f13244c = j10;
        this.f13246g = u6Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        SpannableStringBuilder replaceTags;
        int i11 = this.f13242a;
        Object obj2 = this.f13246g;
        Object obj3 = this.f13245f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i11) {
            case 0:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj5;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) obj4;
                Context context = (Context) obj3;
                u6 u6Var = (u6) obj2;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i12 = this.f13243b;
                long j10 = this.f13244c;
                if (connectedbotstarref2 == null) {
                    TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i12).loadFullUser(user, 0, true, new p3(k3Var, context, i12, j10, u6Var, 1));
                        return;
                    }
                    return;
                }
                k3Var.dismiss();
                d4.G0(context, i12, connectedbotstarref2, j10, u6Var);
                return;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                af1 af1Var = ((ke1) obj5).f40924b;
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i13 = iArr[0] + 1;
                iArr[0] = i13;
                if (i13 == this.f13243b) {
                    boolean isEmpty = tL_messages_invitedUsers.missing_invitees.isEmpty();
                    long j11 = this.f13244c;
                    if (isEmpty) {
                        wc b02 = wc.b0(af1Var);
                        TLRPC.Chat chat = af1Var.getMessagesController().getChat(Long.valueOf(j11));
                        b02.getClass();
                        if (arrayList.size() == 0) {
                            replaceTags = null;
                        } else if (arrayList.size() == 1) {
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, "**" + UserObject.getFirstName((TLRPC.User) arrayList.get(0)) + "**"));
                            } else {
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, "**" + UserObject.getFirstName((TLRPC.User) arrayList.get(0)) + "**"));
                            }
                        } else if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddedMembersToChannel", arrayList.size(), new Object[0]));
                        } else {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddedSubscribersToChannel", arrayList.size(), new Object[0]));
                        }
                        b02.W(arrayList, replaceTags, null, null).j();
                        return;
                    }
                    TLRPC.Chat chat2 = af1Var.getMessagesController().getChat(Long.valueOf(j11));
                    i10 = ((org.telegram.ui.ActionBar.r2) af1Var).currentAccount;
                    g5.f(i10, chat2, tL_messages_invitedUsers);
                    return;
                }
                return;
        }
    }

    public r3(ke1 ke1Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, ArrayList arrayList, long j10) {
        this.d = ke1Var;
        this.e = tL_messages_invitedUsers;
        this.f13245f = iArr;
        this.f13243b = i10;
        this.f13246g = arrayList;
        this.f13244c = j10;
    }
}
