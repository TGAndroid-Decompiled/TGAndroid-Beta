package mh;

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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.y4;
import org.telegram.ui.fe1;
import org.telegram.ui.we1;
public final class h3 implements Utilities.Callback {
    public final int f17880a = 0;
    public final int f17881b;
    public final long f17882c;
    public final Object d;
    public final Object f17883e;
    public final Object f17884f;
    public final Object f17885g;

    public h3(int i9, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.f3 f3Var, b6 b6Var) {
        this.f17881b = i9;
        this.d = connectedbotstarref;
        this.f17883e = f3Var;
        this.f17884f = context;
        this.f17882c = j10;
        this.f17885g = b6Var;
    }

    @Override
    public final void run(Object obj) {
        int i9;
        SpannableStringBuilder replaceTags;
        int i10 = this.f17880a;
        Object obj2 = this.f17885g;
        Object obj3 = this.f17884f;
        Object obj4 = this.f17883e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj5;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj4;
                Context context = (Context) obj3;
                b6 b6Var = (b6) obj2;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i11 = this.f17881b;
                long j10 = this.f17882c;
                if (connectedbotstarref2 == null) {
                    TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i11).loadFullUser(user, 0, true, new f3(f3Var, context, i11, j10, b6Var, 1));
                        return;
                    }
                    return;
                }
                f3Var.dismiss();
                u3.G0(context, i11, connectedbotstarref2, j10, b6Var);
                return;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                we1 we1Var = ((fe1) obj5).f38246b;
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                if (i12 == this.f17881b) {
                    boolean isEmpty = tL_messages_invitedUsers.missing_invitees.isEmpty();
                    long j11 = this.f17882c;
                    if (isEmpty) {
                        oc a02 = oc.a0(we1Var);
                        TLRPC.Chat chat = we1Var.getMessagesController().getChat(Long.valueOf(j11));
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
                    TLRPC.Chat chat2 = we1Var.getMessagesController().getChat(Long.valueOf(j11));
                    i9 = ((org.telegram.ui.ActionBar.o2) we1Var).currentAccount;
                    y4.f(i9, chat2, tL_messages_invitedUsers);
                    return;
                }
                return;
        }
    }

    public h3(fe1 fe1Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i9, ArrayList arrayList, long j10) {
        this.d = fe1Var;
        this.f17883e = tL_messages_invitedUsers;
        this.f17884f = iArr;
        this.f17881b = i9;
        this.f17885g = arrayList;
        this.f17882c = j10;
    }
}
