package mh;

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
import org.telegram.ui.xn;
public final class y8 implements Runnable {
    public final int f15106a;
    public final long f15107b;
    public final int f15108c;
    public final Object d;
    public final Object f15109e;

    public y8(Object obj, long j10, int i10, Object obj2, int i11) {
        this.f15106a = i11;
        this.d = obj;
        this.f15107b = j10;
        this.f15108c = i10;
        this.f15109e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f15106a) {
            case 0:
                ((qh.d) this.d).setLoading(false);
                org.telegram.ui.ActionBar.h3 h3Var = ((org.telegram.ui.ActionBar.h3[]) this.f15109e)[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                }
                t7.y(this.f15108c, false).S();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(xn.R9(this.f15107b));
                    return;
                }
                return;
            case 1:
                ((MediaDataController) this.d).lambda$putMenuBotsToCache$6((TLRPC.TL_attachMenuBots) this.f15109e, this.f15107b, this.f15108c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$processLoadedStickers$104((ArrayList) this.f15109e, this.f15107b, this.f15108c);
                return;
            case 3:
                int i10 = this.f15108c;
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$168(this.f15107b, (TLRPC.TL_help_promoData) this.f15109e, i10);
                return;
            case 4:
                ((MessagesController) this.d).lambda$processUpdateArray$388(this.f15107b, this.f15108c, (TLRPC.TL_sendMessageTextDraftAction) this.f15109e);
                return;
            case 5:
                ((MessagesController) this.d).lambda$processUpdateArray$389(this.f15107b, this.f15108c, (TLRPC.TL_sendMessageRichMessageDraftAction) this.f15109e);
                return;
            case 6:
                int i11 = this.f15108c;
                ((MessagesStorage) this.d).lambda$updateTopicData$48(this.f15107b, (TLRPC.TL_forumTopic) this.f15109e, i11);
                return;
            case 7:
                ((MessagesStorage) this.d).lambda$updateMessageVoiceTranscriptionOpen$107(this.f15108c, this.f15107b, (TLRPC.Message) this.f15109e);
                return;
            case 8:
                ((MessagesStorage) this.d).lambda$updateMessageReactions$104(this.f15108c, this.f15107b, (TLRPC.TL_messageReactions) this.f15109e);
                return;
            case 9:
                ((MessagesStorage) this.d).lambda$updateChatDefaultBannedRights$180(this.f15107b, this.f15108c, (TLRPC.TL_chatBannedRights) this.f15109e);
                return;
            case 10:
                ((SendMessagesHelper) this.d).lambda$sendNotificationCallback$30(this.f15107b, this.f15108c, (byte[]) this.f15109e);
                return;
            case 11:
                ((TranslateController) this.d).lambda$checkLanguage$14((MessageObject) this.f15109e, this.f15107b, this.f15108c);
                return;
            case 12:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.d;
                TLObject tLObject = (TLObject) this.f15109e;
                if (l4Var.D0 != 0) {
                    l4Var.D0 = 0;
                    l4Var.b0(false);
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        int i12 = this.f15108c;
                        MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer.users, false);
                        MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            l4Var.P(this.f15107b, tL_contacts_resolvedPeer.users.get(0));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) this.d;
                long currentTimeMillis = System.currentTimeMillis();
                boolean z4 = false;
                Float valueOf = Float.valueOf(((int[]) this.f15109e)[0] / this.f15108c);
                if (currentTimeMillis - this.f15107b > 250) {
                    z4 = true;
                }
                p6Var.run(valueOf, Boolean.valueOf(z4));
                return;
            default:
                ((ProfileActivity) this.d).getMessagesController().getStoriesController().b(this.f15108c, this.f15107b, (ArrayList) this.f15109e);
                return;
        }
    }

    public y8(Object obj, Object obj2, int i10, long j10, int i11) {
        this.f15106a = i11;
        this.d = obj;
        this.f15109e = obj2;
        this.f15108c = i10;
        this.f15107b = j10;
    }

    public y8(BaseController baseController, long j10, TLObject tLObject, int i10, int i11) {
        this.f15106a = i11;
        this.d = baseController;
        this.f15107b = j10;
        this.f15109e = tLObject;
        this.f15108c = i10;
    }

    public y8(BaseController baseController, Object obj, long j10, int i10, int i11) {
        this.f15106a = i11;
        this.d = baseController;
        this.f15109e = obj;
        this.f15107b = j10;
        this.f15108c = i10;
    }

    public y8(MessagesStorage messagesStorage, int i10, long j10, TLObject tLObject, int i11) {
        this.f15106a = i11;
        this.d = messagesStorage;
        this.f15108c = i10;
        this.f15107b = j10;
        this.f15109e = tLObject;
    }
}
