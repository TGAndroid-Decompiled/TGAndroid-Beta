package ei;

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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.g5;
import org.telegram.ui.fg1;
import org.telegram.ui.pf1;
public final class s3 implements Utilities.Callback {
    public final int f9349a = 0;
    public final int f9350b;
    public final long f9351c;
    public final Object d;
    public final Object f9352e;
    public final Object f9353f;
    public final Object f9354g;

    public s3(int i10, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.f3 f3Var, e6 e6Var) {
        this.f9350b = i10;
        this.d = connectedbotstarref;
        this.f9352e = f3Var;
        this.f9353f = context;
        this.f9351c = j3;
        this.f9354g = e6Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        SpannableStringBuilder replaceTags;
        int i11 = this.f9349a;
        Object obj2 = this.f9354g;
        Object obj3 = this.f9353f;
        Object obj4 = this.f9352e;
        Object obj5 = this.d;
        switch (i11) {
            case 0:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj5;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj4;
                Context context = (Context) obj3;
                e6 e6Var = (e6) obj2;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i12 = this.f9350b;
                long j3 = this.f9351c;
                if (connectedbotstarref2 == null) {
                    TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i12).loadFullUser(user, 0, true, new q3(f3Var, context, i12, j3, e6Var, 1));
                        return;
                    }
                    return;
                }
                f3Var.dismiss();
                e4.I0(context, i12, connectedbotstarref2, j3, e6Var);
                return;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                fg1 fg1Var = ((pf1) obj5).f40791b;
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i13 = iArr[0] + 1;
                iArr[0] = i13;
                if (i13 == this.f9350b) {
                    boolean isEmpty = tL_messages_invitedUsers.missing_invitees.isEmpty();
                    long j10 = this.f9351c;
                    if (isEmpty) {
                        ad a02 = ad.a0(fg1Var);
                        TLRPC.Chat chat = fg1Var.getMessagesController().getChat(Long.valueOf(j10));
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
                    TLRPC.Chat chat2 = fg1Var.getMessagesController().getChat(Long.valueOf(j10));
                    i10 = ((org.telegram.ui.ActionBar.n2) fg1Var).currentAccount;
                    g5.e(i10, chat2, tL_messages_invitedUsers);
                    return;
                }
                return;
        }
    }

    public s3(pf1 pf1Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, ArrayList arrayList, long j3) {
        this.d = pf1Var;
        this.f9352e = tL_messages_invitedUsers;
        this.f9353f = iArr;
        this.f9350b = i10;
        this.f9354g = arrayList;
        this.f9351c = j3;
    }
}
