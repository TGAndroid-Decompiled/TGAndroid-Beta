package jh;

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
import org.telegram.ui.tn;
public final class x8 implements Runnable {
    public final int f13081a;
    public final long f13082b;
    public final int f13083c;
    public final Object d;
    public final Object f13084e;

    public x8(Object obj, long j10, int i10, Object obj2, int i11) {
        this.f13081a = i11;
        this.d = obj;
        this.f13082b = j10;
        this.f13083c = i10;
        this.f13084e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f13081a) {
            case 0:
                ((nh.d) this.d).setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) this.f13084e)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                s7.y(this.f13083c, false).S();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(tn.R9(this.f13082b));
                    return;
                }
                return;
            case 1:
                ((MediaDataController) this.d).lambda$putMenuBotsToCache$6((TLRPC.TL_attachMenuBots) this.f13084e, this.f13082b, this.f13083c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$processLoadedStickers$104((ArrayList) this.f13084e, this.f13082b, this.f13083c);
                return;
            case 3:
                int i10 = this.f13083c;
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$168(this.f13082b, (TLRPC.TL_help_promoData) this.f13084e, i10);
                return;
            case 4:
                ((MessagesController) this.d).lambda$processUpdateArray$388(this.f13082b, this.f13083c, (TLRPC.TL_sendMessageTextDraftAction) this.f13084e);
                return;
            case 5:
                ((MessagesController) this.d).lambda$processUpdateArray$389(this.f13082b, this.f13083c, (TLRPC.TL_sendMessageRichMessageDraftAction) this.f13084e);
                return;
            case 6:
                int i11 = this.f13083c;
                ((MessagesStorage) this.d).lambda$updateTopicData$48(this.f13082b, (TLRPC.TL_forumTopic) this.f13084e, i11);
                return;
            case 7:
                ((MessagesStorage) this.d).lambda$updateMessageVoiceTranscriptionOpen$107(this.f13083c, this.f13082b, (TLRPC.Message) this.f13084e);
                return;
            case 8:
                ((MessagesStorage) this.d).lambda$updateMessageReactions$104(this.f13083c, this.f13082b, (TLRPC.TL_messageReactions) this.f13084e);
                return;
            case 9:
                ((MessagesStorage) this.d).lambda$updateChatDefaultBannedRights$180(this.f13082b, this.f13083c, (TLRPC.TL_chatBannedRights) this.f13084e);
                return;
            case 10:
                ((SendMessagesHelper) this.d).lambda$sendNotificationCallback$30(this.f13082b, this.f13083c, (byte[]) this.f13084e);
                return;
            case 11:
                ((TranslateController) this.d).lambda$checkLanguage$14((MessageObject) this.f13084e, this.f13082b, this.f13083c);
                return;
            case 12:
                org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) this.d;
                TLObject tLObject = (TLObject) this.f13084e;
                if (m4Var.C0 != 0) {
                    m4Var.C0 = 0;
                    m4Var.b0(false);
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        int i12 = this.f13083c;
                        MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer.users, false);
                        MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            m4Var.P(this.f13082b, tL_contacts_resolvedPeer.users.get(0));
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
                Float valueOf = Float.valueOf(((int[]) this.f13084e)[0] / this.f13083c);
                if (currentTimeMillis - this.f13082b > 250) {
                    z10 = true;
                }
                l6Var.run(valueOf, Boolean.valueOf(z10));
                return;
            default:
                ((ProfileActivity) this.d).getMessagesController().getStoriesController().b(this.f13083c, this.f13082b, (ArrayList) this.f13084e);
                return;
        }
    }

    public x8(Object obj, Object obj2, int i10, long j10, int i11) {
        this.f13081a = i11;
        this.d = obj;
        this.f13084e = obj2;
        this.f13083c = i10;
        this.f13082b = j10;
    }

    public x8(BaseController baseController, long j10, TLObject tLObject, int i10, int i11) {
        this.f13081a = i11;
        this.d = baseController;
        this.f13082b = j10;
        this.f13084e = tLObject;
        this.f13083c = i10;
    }

    public x8(BaseController baseController, Object obj, long j10, int i10, int i11) {
        this.f13081a = i11;
        this.d = baseController;
        this.f13084e = obj;
        this.f13082b = j10;
        this.f13083c = i10;
    }

    public x8(MessagesStorage messagesStorage, int i10, long j10, TLObject tLObject, int i11) {
        this.f13081a = i11;
        this.d = messagesStorage;
        this.f13083c = i10;
        this.f13082b = j10;
        this.f13084e = tLObject;
    }
}
