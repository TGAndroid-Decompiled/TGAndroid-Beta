package gi;

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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.xc;
import org.telegram.ui.be1;
import org.telegram.ui.re1;
public final class i3 implements Utilities.Callback {
    public final int f11264a = 0;
    public final int f11265b;
    public final long f11266c;
    public final Object d;
    public final Object e;
    public final Object f11267f;
    public final Object f11268g;

    public i3(int i10, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.f3 f3Var, d6 d6Var) {
        this.f11265b = i10;
        this.d = connectedbotstarref;
        this.e = f3Var;
        this.f11267f = context;
        this.f11266c = j10;
        this.f11268g = d6Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        SpannableStringBuilder replaceTags;
        int i11 = this.f11264a;
        Object obj2 = this.f11268g;
        Object obj3 = this.f11267f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i11) {
            case 0:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj5;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj4;
                Context context = (Context) obj3;
                d6 d6Var = (d6) obj2;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i12 = this.f11265b;
                long j10 = this.f11266c;
                if (connectedbotstarref2 == null) {
                    TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i12).loadFullUser(user, 0, true, new g3(f3Var, context, i12, j10, d6Var, 1));
                        return;
                    }
                    return;
                }
                f3Var.dismiss();
                u3.I0(context, i12, connectedbotstarref2, j10, d6Var);
                return;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                re1 re1Var = ((be1) obj5).f35619b;
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i13 = iArr[0] + 1;
                iArr[0] = i13;
                if (i13 == this.f11265b) {
                    boolean isEmpty = tL_messages_invitedUsers.missing_invitees.isEmpty();
                    long j11 = this.f11266c;
                    if (isEmpty) {
                        xc a02 = xc.a0(re1Var);
                        TLRPC.Chat chat = re1Var.getMessagesController().getChat(Long.valueOf(j11));
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
                    TLRPC.Chat chat2 = re1Var.getMessagesController().getChat(Long.valueOf(j11));
                    i10 = ((org.telegram.ui.ActionBar.n2) re1Var).currentAccount;
                    f5.e(i10, chat2, tL_messages_invitedUsers);
                    return;
                }
                return;
        }
    }

    public i3(be1 be1Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, ArrayList arrayList, long j10) {
        this.d = be1Var;
        this.e = tL_messages_invitedUsers;
        this.f11267f = iArr;
        this.f11265b = i10;
        this.f11268g = arrayList;
        this.f11266c = j10;
    }
}
