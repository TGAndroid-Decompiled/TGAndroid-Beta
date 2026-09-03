package lh;

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
import org.telegram.ui.zn;
public final class y8 implements Runnable {
    public final int f13387a;
    public final long f13388b;
    public final int f13389c;
    public final Object d;
    public final Object e;

    public y8(Object obj, long j10, int i10, Object obj2, int i11) {
        this.f13387a = i11;
        this.d = obj;
        this.f13388b = j10;
        this.f13389c = i10;
        this.e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f13387a) {
            case 0:
                ((ph.d) this.d).setLoading(false);
                org.telegram.ui.ActionBar.g3 g3Var = ((org.telegram.ui.ActionBar.g3[]) this.e)[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                }
                t7.y(this.f13389c, false).S();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(zn.R9(this.f13388b));
                    return;
                }
                return;
            case 1:
                ((MediaDataController) this.d).lambda$putMenuBotsToCache$6((TLRPC.TL_attachMenuBots) this.e, this.f13388b, this.f13389c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$processLoadedStickers$104((ArrayList) this.e, this.f13388b, this.f13389c);
                return;
            case 3:
                int i10 = this.f13389c;
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$168(this.f13388b, (TLRPC.TL_help_promoData) this.e, i10);
                return;
            case 4:
                ((MessagesController) this.d).lambda$processUpdateArray$388(this.f13388b, this.f13389c, (TLRPC.TL_sendMessageTextDraftAction) this.e);
                return;
            case 5:
                ((MessagesController) this.d).lambda$processUpdateArray$389(this.f13388b, this.f13389c, (TLRPC.TL_sendMessageRichMessageDraftAction) this.e);
                return;
            case 6:
                int i11 = this.f13389c;
                ((MessagesStorage) this.d).lambda$updateTopicData$48(this.f13388b, (TLRPC.TL_forumTopic) this.e, i11);
                return;
            case 7:
                ((MessagesStorage) this.d).lambda$updateMessageVoiceTranscriptionOpen$107(this.f13389c, this.f13388b, (TLRPC.Message) this.e);
                return;
            case 8:
                ((MessagesStorage) this.d).lambda$updateMessageReactions$104(this.f13389c, this.f13388b, (TLRPC.TL_messageReactions) this.e);
                return;
            case 9:
                ((MessagesStorage) this.d).lambda$updateChatDefaultBannedRights$180(this.f13388b, this.f13389c, (TLRPC.TL_chatBannedRights) this.e);
                return;
            case 10:
                ((SendMessagesHelper) this.d).lambda$sendNotificationCallback$30(this.f13388b, this.f13389c, (byte[]) this.e);
                return;
            case 11:
                ((TranslateController) this.d).lambda$checkLanguage$14((MessageObject) this.e, this.f13388b, this.f13389c);
                return;
            case 12:
                org.telegram.ui.n4 n4Var = (org.telegram.ui.n4) this.d;
                TLObject tLObject = (TLObject) this.e;
                if (n4Var.D0 != 0) {
                    n4Var.D0 = 0;
                    n4Var.b0(false);
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        int i12 = this.f13389c;
                        MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer.users, false);
                        MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            n4Var.P(this.f13388b, tL_contacts_resolvedPeer.users.get(0));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                org.telegram.ui.r6 r6Var = (org.telegram.ui.r6) this.d;
                long currentTimeMillis = System.currentTimeMillis();
                boolean z4 = false;
                Float valueOf = Float.valueOf(((int[]) this.e)[0] / this.f13389c);
                if (currentTimeMillis - this.f13388b > 250) {
                    z4 = true;
                }
                r6Var.run(valueOf, Boolean.valueOf(z4));
                return;
            default:
                ((ProfileActivity) this.d).getMessagesController().getStoriesController().b(this.f13389c, this.f13388b, (ArrayList) this.e);
                return;
        }
    }

    public y8(Object obj, Object obj2, int i10, long j10, int i11) {
        this.f13387a = i11;
        this.d = obj;
        this.e = obj2;
        this.f13389c = i10;
        this.f13388b = j10;
    }

    public y8(BaseController baseController, long j10, TLObject tLObject, int i10, int i11) {
        this.f13387a = i11;
        this.d = baseController;
        this.f13388b = j10;
        this.e = tLObject;
        this.f13389c = i10;
    }

    public y8(BaseController baseController, Object obj, long j10, int i10, int i11) {
        this.f13387a = i11;
        this.d = baseController;
        this.e = obj;
        this.f13388b = j10;
        this.f13389c = i10;
    }

    public y8(MessagesStorage messagesStorage, int i10, long j10, TLObject tLObject, int i11) {
        this.f13387a = i11;
        this.d = messagesStorage;
        this.f13389c = i10;
        this.f13388b = j10;
        this.e = tLObject;
    }
}
