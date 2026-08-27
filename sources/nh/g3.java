package nh;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.y4;
import org.telegram.ui.ge1;
import org.telegram.ui.we1;

public final class g3 implements Utilities.Callback {

    public final int f18700a = 0;

    public final int f18701b;

    public final long f18702c;
    public final Object d;

    public final Object f18703e;

    public final Object f18704f;

    public final Object f18705g;

    public g3(int i10, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.e3 e3Var, c6 c6Var) {
        this.f18701b = i10;
        this.d = connectedbotstarref;
        this.f18703e = e3Var;
        this.f18704f = context;
        this.f18702c = j10;
        this.f18705g = c6Var;
    }

    @Override
    public final void run(Object obj) {
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        int i10 = this.f18700a;
        Object obj2 = this.f18705g;
        Object obj3 = this.f18704f;
        Object obj4 = this.f18703e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj5;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj4;
                Context context = (Context) obj3;
                c6 c6Var = (c6) obj2;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i11 = this.f18701b;
                long j10 = this.f18702c;
                if (connectedbotstarref2 != null) {
                    e3Var.dismiss();
                    s3.H0(context, i11, connectedbotstarref2, j10, c6Var);
                } else {
                    TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i11).loadFullUser(user, 0, true, new e3(e3Var, context, i11, j10, c6Var, 1));
                    }
                }
                break;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                we1 we1Var = ((ge1) obj5).f38398b;
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                if (i12 == this.f18701b) {
                    boolean zIsEmpty = tL_messages_invitedUsers.missing_invitees.isEmpty();
                    long j11 = this.f18702c;
                    if (!zIsEmpty) {
                        y4.f(((org.telegram.ui.ActionBar.n2) we1Var).currentAccount, we1Var.getMessagesController().getChat(Long.valueOf(j11)), tL_messages_invitedUsers);
                    } else {
                        mc mcVarA0 = mc.a0(we1Var);
                        TLRPC.Chat chat = we1Var.getMessagesController().getChat(Long.valueOf(j11));
                        mcVarA0.getClass();
                        if (arrayList.size() == 0) {
                            spannableStringBuilderReplaceTags = null;
                        } else if (arrayList.size() != 1) {
                            spannableStringBuilderReplaceTags = ChatObject.isChannelAndNotMegaGroup(chat) ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddedMembersToChannel", arrayList.size(), new Object[0])) : AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddedSubscribersToChannel", arrayList.size(), new Object[0]));
                        } else if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, "**" + UserObject.getFirstName((TLRPC.User) arrayList.get(0)) + "**"));
                        } else {
                            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, "**" + UserObject.getFirstName((TLRPC.User) arrayList.get(0)) + "**"));
                        }
                        mcVarA0.V(arrayList, spannableStringBuilderReplaceTags, null, null).j();
                    }
                }
                break;
        }
    }

    public g3(ge1 ge1Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, ArrayList arrayList, long j10) {
        this.d = ge1Var;
        this.f18703e = tL_messages_invitedUsers;
        this.f18704f = iArr;
        this.f18701b = i10;
        this.f18705g = arrayList;
        this.f18702c = j10;
    }
}
