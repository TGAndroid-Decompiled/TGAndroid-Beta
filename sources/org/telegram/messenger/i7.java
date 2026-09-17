package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.co;
public final class i7 implements Runnable {
    public final int f17957a;
    public final Object f17958b;
    public final long f17959c;
    public final int d;
    public final Object f17960e;

    public i7(Object obj, long j3, int i10, Object obj2, int i11) {
        this.f17957a = i11;
        this.f17958b = obj;
        this.f17959c = j3;
        this.d = i10;
        this.f17960e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17957a) {
            case 0:
                ((MediaDataController) this.f17958b).lambda$putMenuBotsToCache$6((TLRPC.TL_attachMenuBots) this.f17960e, this.f17959c, this.d);
                return;
            case 1:
                ((MediaDataController) this.f17958b).lambda$processLoadedStickers$104((ArrayList) this.f17960e, this.f17959c, this.d);
                return;
            case 2:
                int i10 = this.d;
                ((MessagesController) this.f17958b).lambda$checkPromoInfoInternal$168(this.f17959c, (TLRPC.TL_help_promoData) this.f17960e, i10);
                return;
            case 3:
                ((MessagesController) this.f17958b).lambda$processUpdateArray$388(this.f17959c, this.d, (TLRPC.TL_sendMessageTextDraftAction) this.f17960e);
                return;
            case 4:
                ((MessagesController) this.f17958b).lambda$processUpdateArray$389(this.f17959c, this.d, (TLRPC.TL_sendMessageRichMessageDraftAction) this.f17960e);
                return;
            case 5:
                int i11 = this.d;
                ((MessagesStorage) this.f17958b).lambda$updateTopicData$48(this.f17959c, (TLRPC.TL_forumTopic) this.f17960e, i11);
                return;
            case 6:
                ((MessagesStorage) this.f17958b).lambda$updateMessageVoiceTranscriptionOpen$107(this.d, this.f17959c, (TLRPC.Message) this.f17960e);
                return;
            case 7:
                ((MessagesStorage) this.f17958b).lambda$updateMessageReactions$104(this.d, this.f17959c, (TLRPC.TL_messageReactions) this.f17960e);
                return;
            case 8:
                ((MessagesStorage) this.f17958b).lambda$updateChatDefaultBannedRights$180(this.f17959c, this.d, (TLRPC.TL_chatBannedRights) this.f17960e);
                return;
            case 9:
                ((SendMessagesHelper) this.f17958b).lambda$sendNotificationCallback$30(this.f17959c, this.d, (byte[]) this.f17960e);
                return;
            case 10:
                ((TranslateController) this.f17958b).lambda$checkLanguage$14((MessageObject) this.f17960e, this.f17959c, this.d);
                return;
            case 11:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f17958b;
                TLObject tLObject = (TLObject) this.f17960e;
                if (i4Var.G0 != 0) {
                    i4Var.G0 = 0;
                    i4Var.b0(false);
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        int i12 = this.d;
                        MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer.users, false);
                        MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            i4Var.P(this.f17959c, tL_contacts_resolvedPeer.users.get(0));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                org.telegram.ui.m6 m6Var = (org.telegram.ui.m6) this.f17958b;
                long currentTimeMillis = System.currentTimeMillis();
                boolean z10 = false;
                Float valueOf = Float.valueOf(((int[]) this.f17960e)[0] / this.d);
                if (currentTimeMillis - this.f17959c > 250) {
                    z10 = true;
                }
                m6Var.run(valueOf, Boolean.valueOf(z10));
                return;
            case 13:
                ((ProfileActivity) this.f17958b).getMessagesController().getStoriesController().b(this.d, this.f17959c, (ArrayList) this.f17960e);
                return;
            default:
                ((di.d) this.f17958b).setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) this.f17960e)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                zh.s5.y(this.d, false).S();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(co.R9(this.f17959c));
                    return;
                }
                return;
        }
    }

    public i7(Object obj, Object obj2, int i10, long j3, int i11) {
        this.f17957a = i11;
        this.f17958b = obj;
        this.f17960e = obj2;
        this.d = i10;
        this.f17959c = j3;
    }

    public i7(BaseController baseController, long j3, TLObject tLObject, int i10, int i11) {
        this.f17957a = i11;
        this.f17958b = baseController;
        this.f17959c = j3;
        this.f17960e = tLObject;
        this.d = i10;
    }

    public i7(BaseController baseController, Object obj, long j3, int i10, int i11) {
        this.f17957a = i11;
        this.f17958b = baseController;
        this.f17960e = obj;
        this.f17959c = j3;
        this.d = i10;
    }

    public i7(MessagesStorage messagesStorage, int i10, long j3, TLObject tLObject, int i11) {
        this.f17957a = i11;
        this.f17958b = messagesStorage;
        this.d = i10;
        this.f17959c = j3;
        this.f17960e = tLObject;
    }
}
