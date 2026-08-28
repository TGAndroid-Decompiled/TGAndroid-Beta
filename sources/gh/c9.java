package gh;

import java.util.ArrayList;
import org.telegram.messenger.BaseController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qn;
public final class c9 implements Runnable {
    public final int f7936a;
    public final long f7937b;
    public final int f7938c;
    public final Object d;
    public final Object f7939e;

    public c9(Object obj, long j10, int i9, Object obj2, int i10) {
        this.f7936a = i10;
        this.d = obj;
        this.f7937b = j10;
        this.f7938c = i9;
        this.f7939e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f7936a) {
            case 0:
                ((kh.d) this.d).setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) this.f7939e)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                v7.y(this.f7938c, false).S();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(qn.R9(this.f7937b));
                    return;
                }
                return;
            case 1:
                ((MediaDataController) this.d).lambda$putMenuBotsToCache$6((TLRPC.TL_attachMenuBots) this.f7939e, this.f7937b, this.f7938c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$processLoadedStickers$104((ArrayList) this.f7939e, this.f7937b, this.f7938c);
                return;
            case 3:
                int i9 = this.f7938c;
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$168(this.f7937b, (TLRPC.TL_help_promoData) this.f7939e, i9);
                return;
            case 4:
                ((MessagesController) this.d).lambda$processUpdateArray$388(this.f7937b, this.f7938c, (TLRPC.TL_sendMessageTextDraftAction) this.f7939e);
                return;
            case 5:
                ((MessagesController) this.d).lambda$processUpdateArray$389(this.f7937b, this.f7938c, (TLRPC.TL_sendMessageRichMessageDraftAction) this.f7939e);
                return;
            case 6:
                int i10 = this.f7938c;
                ((MessagesStorage) this.d).lambda$updateTopicData$48(this.f7937b, (TLRPC.TL_forumTopic) this.f7939e, i10);
                return;
            case 7:
                ((MessagesStorage) this.d).lambda$updateMessageVoiceTranscriptionOpen$107(this.f7938c, this.f7937b, (TLRPC.Message) this.f7939e);
                return;
            case 8:
                ((MessagesStorage) this.d).lambda$updateMessageReactions$104(this.f7938c, this.f7937b, (TLRPC.TL_messageReactions) this.f7939e);
                return;
            case 9:
                ((MessagesStorage) this.d).lambda$updateChatDefaultBannedRights$180(this.f7937b, this.f7938c, (TLRPC.TL_chatBannedRights) this.f7939e);
                return;
            case 10:
                ((SendMessagesHelper) this.d).lambda$sendNotificationCallback$30(this.f7937b, this.f7938c, (byte[]) this.f7939e);
                return;
            case 11:
                ((TranslateController) this.d).lambda$checkLanguage$14((MessageObject) this.f7939e, this.f7937b, this.f7938c);
                return;
            case 12:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.d;
                TLObject tLObject = (TLObject) this.f7939e;
                if (l4Var.C0 != 0) {
                    l4Var.C0 = 0;
                    l4Var.b0(false);
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        int i11 = this.f7938c;
                        MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                        MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            l4Var.P(this.f7937b, tL_contacts_resolvedPeer.users.get(0));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                org.telegram.ui.l6 l6Var = (org.telegram.ui.l6) this.d;
                long currentTimeMillis = System.currentTimeMillis();
                boolean z10 = false;
                Float valueOf = Float.valueOf(((int[]) this.f7939e)[0] / this.f7938c);
                if (currentTimeMillis - this.f7937b > 250) {
                    z10 = true;
                }
                l6Var.run(valueOf, Boolean.valueOf(z10));
                return;
            default:
                ((ProfileActivity) this.d).getMessagesController().getStoriesController().b(this.f7938c, this.f7937b, (ArrayList) this.f7939e);
                return;
        }
    }

    public c9(Object obj, Object obj2, int i9, long j10, int i10) {
        this.f7936a = i10;
        this.d = obj;
        this.f7939e = obj2;
        this.f7938c = i9;
        this.f7937b = j10;
    }

    public c9(BaseController baseController, long j10, TLObject tLObject, int i9, int i10) {
        this.f7936a = i10;
        this.d = baseController;
        this.f7937b = j10;
        this.f7939e = tLObject;
        this.f7938c = i9;
    }

    public c9(BaseController baseController, Object obj, long j10, int i9, int i10) {
        this.f7936a = i10;
        this.d = baseController;
        this.f7939e = obj;
        this.f7937b = j10;
        this.f7938c = i9;
    }

    public c9(MessagesStorage messagesStorage, int i9, long j10, TLObject tLObject, int i10) {
        this.f7936a = i10;
        this.d = messagesStorage;
        this.f7938c = i9;
        this.f7937b = j10;
        this.f7939e = tLObject;
    }
}
