package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.co;
public final class j7 implements Runnable {
    public final int f18034a;
    public final Object f18035b;
    public final long f18036c;
    public final int d;
    public final Object f18037e;

    public j7(Object obj, long j3, int i10, Object obj2, int i11) {
        this.f18034a = i11;
        this.f18035b = obj;
        this.f18036c = j3;
        this.d = i10;
        this.f18037e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18034a) {
            case 0:
                ((MediaDataController) this.f18035b).lambda$putMenuBotsToCache$6((TLRPC.TL_attachMenuBots) this.f18037e, this.f18036c, this.d);
                return;
            case 1:
                ((MediaDataController) this.f18035b).lambda$processLoadedStickers$104((ArrayList) this.f18037e, this.f18036c, this.d);
                return;
            case 2:
                int i10 = this.d;
                ((MessagesController) this.f18035b).lambda$checkPromoInfoInternal$168(this.f18036c, (TLRPC.TL_help_promoData) this.f18037e, i10);
                return;
            case 3:
                ((MessagesController) this.f18035b).lambda$processUpdateArray$388(this.f18036c, this.d, (TLRPC.TL_sendMessageTextDraftAction) this.f18037e);
                return;
            case 4:
                ((MessagesController) this.f18035b).lambda$processUpdateArray$389(this.f18036c, this.d, (TLRPC.TL_sendMessageRichMessageDraftAction) this.f18037e);
                return;
            case 5:
                int i11 = this.d;
                ((MessagesStorage) this.f18035b).lambda$updateTopicData$48(this.f18036c, (TLRPC.TL_forumTopic) this.f18037e, i11);
                return;
            case 6:
                ((MessagesStorage) this.f18035b).lambda$updateMessageVoiceTranscriptionOpen$107(this.d, this.f18036c, (TLRPC.Message) this.f18037e);
                return;
            case 7:
                ((MessagesStorage) this.f18035b).lambda$updateMessageReactions$104(this.d, this.f18036c, (TLRPC.TL_messageReactions) this.f18037e);
                return;
            case 8:
                ((MessagesStorage) this.f18035b).lambda$updateChatDefaultBannedRights$180(this.f18036c, this.d, (TLRPC.TL_chatBannedRights) this.f18037e);
                return;
            case 9:
                ((SendMessagesHelper) this.f18035b).lambda$sendNotificationCallback$30(this.f18036c, this.d, (byte[]) this.f18037e);
                return;
            case 10:
                ((TranslateController) this.f18035b).lambda$checkLanguage$14((MessageObject) this.f18037e, this.f18036c, this.d);
                return;
            case 11:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f18035b;
                TLObject tLObject = (TLObject) this.f18037e;
                if (i4Var.G0 != 0) {
                    i4Var.G0 = 0;
                    i4Var.b0(false);
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        int i12 = this.d;
                        MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer.users, false);
                        MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            i4Var.P(this.f18036c, tL_contacts_resolvedPeer.users.get(0));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                org.telegram.ui.m6 m6Var = (org.telegram.ui.m6) this.f18035b;
                long currentTimeMillis = System.currentTimeMillis();
                boolean z10 = false;
                Float valueOf = Float.valueOf(((int[]) this.f18037e)[0] / this.d);
                if (currentTimeMillis - this.f18036c > 250) {
                    z10 = true;
                }
                m6Var.run(valueOf, Boolean.valueOf(z10));
                return;
            case 13:
                ((ProfileActivity) this.f18035b).getMessagesController().getStoriesController().b(this.d, this.f18036c, (ArrayList) this.f18037e);
                return;
            default:
                ((di.d) this.f18035b).setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) this.f18037e)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                zh.s5.y(this.d, false).S();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(co.R9(this.f18036c));
                    return;
                }
                return;
        }
    }

    public j7(Object obj, Object obj2, int i10, long j3, int i11) {
        this.f18034a = i11;
        this.f18035b = obj;
        this.f18037e = obj2;
        this.d = i10;
        this.f18036c = j3;
    }

    public j7(BaseController baseController, long j3, TLObject tLObject, int i10, int i11) {
        this.f18034a = i11;
        this.f18035b = baseController;
        this.f18036c = j3;
        this.f18037e = tLObject;
        this.d = i10;
    }

    public j7(BaseController baseController, Object obj, long j3, int i10, int i11) {
        this.f18034a = i11;
        this.f18035b = baseController;
        this.f18037e = obj;
        this.f18036c = j3;
        this.d = i10;
    }

    public j7(MessagesStorage messagesStorage, int i10, long j3, TLObject tLObject, int i11) {
        this.f18034a = i11;
        this.f18035b = messagesStorage;
        this.d = i10;
        this.f18036c = j3;
        this.f18037e = tLObject;
    }
}
