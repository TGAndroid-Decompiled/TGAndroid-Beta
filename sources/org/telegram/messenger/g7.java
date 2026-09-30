package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wn;
public final class g7 implements Runnable {
    public final int f16460a;
    public final Object f16461b;
    public final long f16462c;
    public final int d;
    public final Object e;

    public g7(Object obj, long j3, int i10, Object obj2, int i11) {
        this.f16460a = i11;
        this.f16461b = obj;
        this.f16462c = j3;
        this.d = i10;
        this.e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16460a) {
            case 0:
                ((MediaDataController) this.f16461b).lambda$putMenuBotsToCache$6((TLRPC.TL_attachMenuBots) this.e, this.f16462c, this.d);
                return;
            case 1:
                ((MediaDataController) this.f16461b).lambda$processLoadedStickers$104((ArrayList) this.e, this.f16462c, this.d);
                return;
            case 2:
                int i10 = this.d;
                ((MessagesController) this.f16461b).lambda$checkPromoInfoInternal$168(this.f16462c, (TLRPC.TL_help_promoData) this.e, i10);
                return;
            case 3:
                ((MessagesController) this.f16461b).lambda$processUpdateArray$388(this.f16462c, this.d, (TLRPC.TL_sendMessageTextDraftAction) this.e);
                return;
            case 4:
                ((MessagesController) this.f16461b).lambda$processUpdateArray$389(this.f16462c, this.d, (TLRPC.TL_sendMessageRichMessageDraftAction) this.e);
                return;
            case 5:
                int i11 = this.d;
                ((MessagesStorage) this.f16461b).lambda$updateTopicData$48(this.f16462c, (TLRPC.TL_forumTopic) this.e, i11);
                return;
            case 6:
                ((MessagesStorage) this.f16461b).lambda$updateMessageVoiceTranscriptionOpen$107(this.d, this.f16462c, (TLRPC.Message) this.e);
                return;
            case 7:
                ((MessagesStorage) this.f16461b).lambda$updateMessageReactions$104(this.d, this.f16462c, (TLRPC.TL_messageReactions) this.e);
                return;
            case 8:
                ((MessagesStorage) this.f16461b).lambda$updateChatDefaultBannedRights$180(this.f16462c, this.d, (TLRPC.TL_chatBannedRights) this.e);
                return;
            case 9:
                ((SendMessagesHelper) this.f16461b).lambda$sendNotificationCallback$30(this.f16462c, this.d, (byte[]) this.e);
                return;
            case 10:
                ((TelegramMediaSession) this.f16461b).lambda$loadMusicForDialog$7((MessagesStorage) this.e, this.f16462c, this.d);
                return;
            case 11:
                ((TranslateController) this.f16461b).lambda$checkLanguage$14((MessageObject) this.e, this.f16462c, this.d);
                return;
            case 12:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f16461b;
                TLObject tLObject = (TLObject) this.e;
                if (i4Var.G0 != 0) {
                    i4Var.G0 = 0;
                    i4Var.b0(false);
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        int i12 = this.d;
                        MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer.users, false);
                        MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            i4Var.P(this.f16462c, tL_contacts_resolvedPeer.users.get(0));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                org.telegram.ui.l6 l6Var = (org.telegram.ui.l6) this.f16461b;
                long currentTimeMillis = System.currentTimeMillis();
                boolean z10 = false;
                Float valueOf = Float.valueOf(((int[]) this.e)[0] / this.d);
                if (currentTimeMillis - this.f16462c > 250) {
                    z10 = true;
                }
                l6Var.run(valueOf, Boolean.valueOf(z10));
                return;
            case 14:
                ((ProfileActivity) this.f16461b).getMessagesController().getStoriesController().b(this.d, this.f16462c, (ArrayList) this.e);
                return;
            default:
                ((ci.d) this.f16461b).setLoading(false);
                org.telegram.ui.ActionBar.e3 e3Var = ((org.telegram.ui.ActionBar.e3[]) this.e)[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                yh.s5.y(this.d, false).S();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(wn.R9(this.f16462c));
                    return;
                }
                return;
        }
    }

    public g7(Object obj, Object obj2, int i10, long j3, int i11) {
        this.f16460a = i11;
        this.f16461b = obj;
        this.e = obj2;
        this.d = i10;
        this.f16462c = j3;
    }

    public g7(Object obj, Object obj2, long j3, int i10, int i11) {
        this.f16460a = i11;
        this.f16461b = obj;
        this.e = obj2;
        this.f16462c = j3;
        this.d = i10;
    }

    public g7(BaseController baseController, long j3, TLObject tLObject, int i10, int i11) {
        this.f16460a = i11;
        this.f16461b = baseController;
        this.f16462c = j3;
        this.e = tLObject;
        this.d = i10;
    }

    public g7(MessagesStorage messagesStorage, int i10, long j3, TLObject tLObject, int i11) {
        this.f16460a = i11;
        this.f16461b = messagesStorage;
        this.d = i10;
        this.f16462c = j3;
        this.e = tLObject;
    }
}
