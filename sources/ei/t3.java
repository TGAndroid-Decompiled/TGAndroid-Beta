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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.yc;
import org.telegram.ui.gf1;
import org.telegram.ui.wf1;
public final class t3 implements Utilities.Callback {
    public final int f9348a = 0;
    public final int f9349b;
    public final long f9350c;
    public final Object d;
    public final Object f9351e;
    public final Object f9352f;
    public final Object f9353g;

    public t3(int i10, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.f3 f3Var, d6 d6Var) {
        this.f9349b = i10;
        this.d = connectedbotstarref;
        this.f9351e = f3Var;
        this.f9352f = context;
        this.f9350c = j3;
        this.f9353g = d6Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        SpannableStringBuilder replaceTags;
        int i11 = this.f9348a;
        Object obj2 = this.f9353g;
        Object obj3 = this.f9352f;
        Object obj4 = this.f9351e;
        Object obj5 = this.d;
        switch (i11) {
            case 0:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj5;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj4;
                Context context = (Context) obj3;
                d6 d6Var = (d6) obj2;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i12 = this.f9349b;
                long j3 = this.f9350c;
                if (connectedbotstarref2 == null) {
                    TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i12).loadFullUser(user, 0, true, new r3(f3Var, context, i12, j3, d6Var, 1));
                        return;
                    }
                    return;
                }
                f3Var.dismiss();
                f4.M0(context, i12, connectedbotstarref2, j3, d6Var);
                return;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                wf1 wf1Var = ((gf1) obj5).f36660b;
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i13 = iArr[0] + 1;
                iArr[0] = i13;
                if (i13 == this.f9349b) {
                    boolean isEmpty = tL_messages_invitedUsers.missing_invitees.isEmpty();
                    long j10 = this.f9350c;
                    if (isEmpty) {
                        yc a02 = yc.a0(wf1Var);
                        TLRPC.Chat chat = wf1Var.getMessagesController().getChat(Long.valueOf(j10));
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
                    TLRPC.Chat chat2 = wf1Var.getMessagesController().getChat(Long.valueOf(j10));
                    i10 = ((org.telegram.ui.ActionBar.n2) wf1Var).currentAccount;
                    org.telegram.ui.Components.e5.f(i10, chat2, tL_messages_invitedUsers);
                    return;
                }
                return;
        }
    }

    public t3(gf1 gf1Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, ArrayList arrayList, long j3) {
        this.d = gf1Var;
        this.f9351e = tL_messages_invitedUsers;
        this.f9352f = iArr;
        this.f9349b = i10;
        this.f9353g = arrayList;
        this.f9350c = j3;
    }
}
