package hh;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.d00;
import org.telegram.ui.ke;
import org.telegram.ui.rn;

public final class p2 implements Runnable {

    public final int f9856a;

    public final long f9857b;

    public final Object f9858c;
    public final Object d;

    public final Object f9859e;

    public final Object f9860f;
    public final Object h;

    public p2(i5 i5Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        this.f9856a = 0;
        this.d = i5Var;
        this.f9858c = tLObject;
        this.f9859e = str;
        this.f9860f = inputSavedStarGift;
        this.h = tL_error;
        this.f9857b = j10;
    }

    @Override
    public final void run() {
        long j10;
        boolean z10;
        TLRPC.Chat chat;
        TLRPC.User user;
        int i10 = this.f9856a;
        int i11 = 1;
        Object obj = this.f9860f;
        Object obj2 = this.h;
        Object obj3 = this.f9859e;
        Object obj4 = this.f9858c;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                i5.h0((i5) obj5, (TLObject) obj4, (String) obj3, (TL_stars.InputSavedStarGift) obj, (TLRPC.TL_error) obj2, this.f9857b);
                break;
            case 1:
                ((boolean[]) obj3)[0] = true;
                ((u7) obj5).g(this.f9857b, (TLObject) obj4, (TLRPC.TL_textWithEntities) obj, (Utilities.Callback2) obj2);
                break;
            case 2:
                ((boolean[]) obj4)[0] = true;
                ((u7) obj5).h((TLRPC.TL_payments_paymentFormStarGift) obj3, (TL_stars.StarGift) obj, this.f9857b, null, true, (Utilities.Callback2) obj2);
                break;
            case 3:
                jh.k7 k7Var = (jh.k7) obj5;
                TLObject tLObject = (TLObject) obj4;
                View view = (View) obj3;
                jh.h7 h7Var = (jh.h7) obj;
                MessagesController messagesController = (MessagesController) obj2;
                long j11 = this.f9857b;
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    MessagesController.getInstance(k7Var.f13591a).putUsers(tL_stories_peerStories.users, false);
                    MessagesController.getInstance(k7Var.f13591a).putChats(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    if (peerStories.stories.isEmpty()) {
                        j10 = j11;
                        z10 = true;
                    } else {
                        MessagesController.getInstance(k7Var.f13591a).getStoriesController().a0(j11, peerStories);
                        j10 = j11;
                        jh.l7.n(peerStories, new e2(k7Var, view, j11, h7Var, 11));
                        z10 = false;
                    }
                } else {
                    j10 = j11;
                    z10 = true;
                }
                if (j10 > 0 && (user = messagesController.getUser(Long.valueOf(j10))) != null) {
                    user.stories_unavailable = true;
                    MessagesStorage.getInstance(k7Var.f13591a).putUsersAndChats(Collections.singletonList(user), null, false, true);
                    messagesController.putUser(user, false);
                }
                if (j10 < 0 && (chat = messagesController.getChat(Long.valueOf(-j10))) != null) {
                    chat.stories_unavailable = true;
                    MessagesStorage.getInstance(k7Var.f13591a).putUsersAndChats(null, Collections.singletonList(chat), false, true);
                    messagesController.putChat(chat, false);
                }
                if (z10) {
                    view.invalidate();
                    MessagesController.getInstance(k7Var.f13591a).getStoriesController().e0(j10, false);
                }
                break;
            case 4:
                ((ConnectionsManager) obj5).lambda$sendRequestInternal$7((RequestDelegate) obj3, (TLObject) obj4, (TLRPC.TL_error) obj2, (RequestDelegateTimestamp) obj, this.f9857b);
                break;
            case 5:
                rn rnVar = (rn) obj5;
                ol0 ol0Var = (ol0) obj2;
                ((b70) obj4).f26984n0 = true;
                Activity parentActivity = rnVar.getParentActivity();
                long j12 = ((TLRPC.TL_messageEntityFormattedDate) obj3).date;
                long j13 = this.f9857b;
                a9.d dVar = new a9.d(rnVar, (ArrayList) obj, j13, ol0Var, 5);
                ke keVar = new ke(ol0Var, i11);
                Pattern pattern = org.telegram.ui.Components.y4.f34802a;
                org.telegram.ui.Components.y4.K(parentActivity, j13, j12, 0, true, dVar, keVar, new org.telegram.ui.Components.w4(null), null);
                break;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Runnable runnable = (Runnable) obj;
                if (n2Var.getContext() != null) {
                    if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                        TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject2;
                        n2Var.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                        n2Var.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                        new d00(n2Var, dialogFilter, tL_chatlists_exportedInvites.invites).show();
                    } else if (tL_error == null || !"FILTER_ID_INVALID".equals(tL_error.text) || dialogFilter.isDefault()) {
                        org.telegram.messenger.y1.r(R.string.UnknownError, mc.a0(n2Var), null);
                    } else {
                        new d00(n2Var, dialogFilter, null).show();
                    }
                    if (runnable != null) {
                        AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 200 - (System.currentTimeMillis() - this.f9857b)));
                    }
                    break;
                }
                break;
        }
    }

    public p2(u7 u7Var, boolean[] zArr, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, Utilities.Callback2 callback2) {
        this.f9856a = 1;
        this.d = u7Var;
        this.f9859e = zArr;
        this.f9857b = j10;
        this.f9858c = tLObject;
        this.f9860f = tL_textWithEntities;
        this.h = callback2;
    }

    public p2(u7 u7Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, Utilities.Callback2 callback2) {
        this.f9856a = 2;
        this.d = u7Var;
        this.f9858c = zArr;
        this.f9859e = tL_payments_paymentFormStarGift;
        this.f9860f = starGift;
        this.f9857b = j10;
        this.h = callback2;
    }

    public p2(Object obj, Object obj2, long j10, Object obj3, Object obj4, Object obj5, int i10) {
        this.f9856a = i10;
        this.d = obj;
        this.f9858c = obj2;
        this.f9857b = j10;
        this.f9859e = obj3;
        this.f9860f = obj4;
        this.h = obj5;
    }

    public p2(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j10) {
        this.f9856a = 4;
        this.d = connectionsManager;
        this.f9859e = requestDelegate;
        this.f9858c = tLObject;
        this.h = tL_error;
        this.f9860f = requestDelegateTimestamp;
        this.f9857b = j10;
    }

    public p2(org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, MessagesController.DialogFilter dialogFilter, TLRPC.TL_error tL_error, Runnable runnable, long j10) {
        this.f9856a = 6;
        this.d = n2Var;
        this.f9858c = tLObject;
        this.f9859e = dialogFilter;
        this.h = tL_error;
        this.f9860f = runnable;
        this.f9857b = j10;
    }
}
