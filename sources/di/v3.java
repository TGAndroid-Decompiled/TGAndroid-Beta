package di;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.wc;
import org.telegram.ui.ig1;
import org.telegram.ui.sf1;
public final class v3 implements Utilities.Callback {
    public final int f6961a = 0;
    public final int f6962b;
    public final long f6963c;
    public final Object d;
    public final Object e;
    public final Object f6964f;
    public final Object f6965g;

    public v3(int i10, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.h3 h3Var, f6 f6Var) {
        this.f6962b = i10;
        this.d = connectedbotstarref;
        this.e = h3Var;
        this.f6964f = context;
        this.f6963c = j3;
        this.f6965g = f6Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        SpannableStringBuilder replaceTags;
        int i11 = this.f6961a;
        Object obj2 = this.f6965g;
        Object obj3 = this.f6964f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i11) {
            case 0:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj5;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj4;
                Context context = (Context) obj3;
                f6 f6Var = (f6) obj2;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i12 = this.f6962b;
                long j3 = this.f6963c;
                if (connectedbotstarref2 == null) {
                    TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i12).loadFullUser(user, 0, true, new t3(h3Var, context, i12, j3, f6Var, 1));
                        return;
                    }
                    return;
                }
                h3Var.dismiss();
                h4.H0(context, i12, connectedbotstarref2, j3, f6Var);
                return;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                ig1 ig1Var = ((sf1) obj5).f36673b;
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i13 = iArr[0] + 1;
                iArr[0] = i13;
                if (i13 == this.f6962b) {
                    boolean isEmpty = tL_messages_invitedUsers.missing_invitees.isEmpty();
                    long j10 = this.f6963c;
                    if (isEmpty) {
                        wc a02 = wc.a0(ig1Var);
                        TLRPC.Chat chat = ig1Var.getMessagesController().getChat(Long.valueOf(j10));
                        a02.getClass();
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
                        a02.V(arrayList, replaceTags, null, null).j();
                        return;
                    }
                    TLRPC.Chat chat2 = ig1Var.getMessagesController().getChat(Long.valueOf(j10));
                    i10 = ((org.telegram.ui.ActionBar.p2) ig1Var).currentAccount;
                    org.telegram.ui.Components.d5.f(i10, chat2, tL_messages_invitedUsers);
                    return;
                }
                return;
        }
    }

    public v3(sf1 sf1Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, ArrayList arrayList, long j3) {
        this.d = sf1Var;
        this.e = tL_messages_invitedUsers;
        this.f6964f = iArr;
        this.f6962b = i10;
        this.f6965g = arrayList;
        this.f6963c = j3;
    }
}
