package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bo;
public final class j7 implements Runnable {
    public final int f16459a;
    public final Object f16460b;
    public final long f16461c;
    public final int d;
    public final Object e;

    public j7(Object obj, long j3, int i10, Object obj2, int i11) {
        this.f16459a = i11;
        this.f16460b = obj;
        this.f16461c = j3;
        this.d = i10;
        this.e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16459a) {
            case 0:
                ((MediaDataController) this.f16460b).lambda$putMenuBotsToCache$6((TLRPC.TL_attachMenuBots) this.e, this.f16461c, this.d);
                return;
            case 1:
                ((MediaDataController) this.f16460b).lambda$processLoadedStickers$104((ArrayList) this.e, this.f16461c, this.d);
                return;
            case 2:
                int i10 = this.d;
                ((MessagesController) this.f16460b).lambda$checkPromoInfoInternal$168(this.f16461c, (TLRPC.TL_help_promoData) this.e, i10);
                return;
            case 3:
                ((MessagesController) this.f16460b).lambda$processUpdateArray$388(this.f16461c, this.d, (TLRPC.TL_sendMessageTextDraftAction) this.e);
                return;
            case 4:
                ((MessagesController) this.f16460b).lambda$processUpdateArray$389(this.f16461c, this.d, (TLRPC.TL_sendMessageRichMessageDraftAction) this.e);
                return;
            case 5:
                int i11 = this.d;
                ((MessagesStorage) this.f16460b).lambda$updateTopicData$48(this.f16461c, (TLRPC.TL_forumTopic) this.e, i11);
                return;
            case 6:
                ((MessagesStorage) this.f16460b).lambda$updateMessageVoiceTranscriptionOpen$107(this.d, this.f16461c, (TLRPC.Message) this.e);
                return;
            case 7:
                ((MessagesStorage) this.f16460b).lambda$updateMessageReactions$104(this.d, this.f16461c, (TLRPC.TL_messageReactions) this.e);
                return;
            case 8:
                ((MessagesStorage) this.f16460b).lambda$updateChatDefaultBannedRights$180(this.f16461c, this.d, (TLRPC.TL_chatBannedRights) this.e);
                return;
            case 9:
                ((SendMessagesHelper) this.f16460b).lambda$sendNotificationCallback$30(this.f16461c, this.d, (byte[]) this.e);
                return;
            case 10:
                ((TranslateController) this.f16460b).lambda$checkLanguage$14((MessageObject) this.e, this.f16461c, this.d);
                return;
            case 11:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.f16460b;
                TLObject tLObject = (TLObject) this.e;
                if (h4Var.G0 != 0) {
                    h4Var.G0 = 0;
                    h4Var.b0(false);
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        int i12 = this.d;
                        MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer.users, false);
                        MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            h4Var.P(this.f16461c, tL_contacts_resolvedPeer.users.get(0));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                org.telegram.ui.m6 m6Var = (org.telegram.ui.m6) this.f16460b;
                long currentTimeMillis = System.currentTimeMillis();
                boolean z10 = false;
                Float valueOf = Float.valueOf(((int[]) this.e)[0] / this.d);
                if (currentTimeMillis - this.f16461c > 250) {
                    z10 = true;
                }
                m6Var.run(valueOf, Boolean.valueOf(z10));
                return;
            case 13:
                ((ProfileActivity) this.f16460b).getMessagesController().getStoriesController().b(this.d, this.f16461c, (ArrayList) this.e);
                return;
            default:
                ((ci.d) this.f16460b).setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) this.e)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                yh.u5.y(this.d, false).S();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(bo.R9(this.f16461c));
                    return;
                }
                return;
        }
    }

    public j7(Object obj, Object obj2, int i10, long j3, int i11) {
        this.f16459a = i11;
        this.f16460b = obj;
        this.e = obj2;
        this.d = i10;
        this.f16461c = j3;
    }

    public j7(BaseController baseController, long j3, TLObject tLObject, int i10, int i11) {
        this.f16459a = i11;
        this.f16460b = baseController;
        this.f16461c = j3;
        this.e = tLObject;
        this.d = i10;
    }

    public j7(BaseController baseController, Object obj, long j3, int i10, int i11) {
        this.f16459a = i11;
        this.f16460b = baseController;
        this.e = obj;
        this.f16461c = j3;
        this.d = i10;
    }

    public j7(MessagesStorage messagesStorage, int i10, long j3, TLObject tLObject, int i11) {
        this.f16459a = i11;
        this.f16460b = messagesStorage;
        this.d = i10;
        this.f16461c = j3;
        this.e = tLObject;
    }
}
