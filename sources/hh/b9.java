package hh;

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
import org.telegram.ui.rn;

public final class b9 implements Runnable {

    public final int f9021a;

    public final long f9022b;

    public final int f9023c;
    public final Object d;

    public final Object f9024e;

    public b9(Object obj, long j10, int i10, Object obj2, int i11) {
        this.f9021a = i11;
        this.d = obj;
        this.f9022b = j10;
        this.f9023c = i10;
        this.f9024e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f9021a) {
            case 0:
                lh.d dVar = (lh.d) this.d;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.f9024e;
                dVar.setLoading(false);
                org.telegram.ui.ActionBar.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                u7.y(this.f9023c, false).S();
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (n2VarU != null) {
                    n2VarU.presentFragment(rn.R9(this.f9022b));
                    break;
                }
                break;
            case 1:
                ((MediaDataController) this.d).lambda$putMenuBotsToCache$6((TLRPC.TL_attachMenuBots) this.f9024e, this.f9022b, this.f9023c);
                break;
            case 2:
                ((MediaDataController) this.d).lambda$processLoadedStickers$104((ArrayList) this.f9024e, this.f9022b, this.f9023c);
                break;
            case 3:
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$168(this.f9022b, (TLRPC.TL_help_promoData) this.f9024e, this.f9023c);
                break;
            case 4:
                ((MessagesController) this.d).lambda$processUpdateArray$388(this.f9022b, this.f9023c, (TLRPC.TL_sendMessageTextDraftAction) this.f9024e);
                break;
            case 5:
                ((MessagesController) this.d).lambda$processUpdateArray$389(this.f9022b, this.f9023c, (TLRPC.TL_sendMessageRichMessageDraftAction) this.f9024e);
                break;
            case 6:
                ((MessagesStorage) this.d).lambda$updateTopicData$48(this.f9022b, (TLRPC.TL_forumTopic) this.f9024e, this.f9023c);
                break;
            case 7:
                ((MessagesStorage) this.d).lambda$updateMessageVoiceTranscriptionOpen$107(this.f9023c, this.f9022b, (TLRPC.Message) this.f9024e);
                break;
            case 8:
                ((MessagesStorage) this.d).lambda$updateMessageReactions$104(this.f9023c, this.f9022b, (TLRPC.TL_messageReactions) this.f9024e);
                break;
            case 9:
                ((MessagesStorage) this.d).lambda$updateChatDefaultBannedRights$180(this.f9022b, this.f9023c, (TLRPC.TL_chatBannedRights) this.f9024e);
                break;
            case 10:
                ((SendMessagesHelper) this.d).lambda$sendNotificationCallback$30(this.f9022b, this.f9023c, (byte[]) this.f9024e);
                break;
            case 11:
                ((TranslateController) this.d).lambda$checkLanguage$14((MessageObject) this.f9024e, this.f9022b, this.f9023c);
                break;
            case 12:
                org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) this.d;
                TLObject tLObject = (TLObject) this.f9024e;
                if (m4Var.C0 != 0) {
                    m4Var.C0 = 0;
                    m4Var.b0(false);
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        int i10 = this.f9023c;
                        MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                        MessagesStorage.getInstance(i10).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            m4Var.P(this.f9022b, tL_contacts_resolvedPeer.users.get(0));
                        }
                    }
                    break;
                }
                break;
            case 13:
                ((org.telegram.ui.m6) this.d).run(Float.valueOf(((int[]) this.f9024e)[0] / this.f9023c), Boolean.valueOf(System.currentTimeMillis() - this.f9022b > 250));
                break;
            default:
                ((ProfileActivity) this.d).getMessagesController().getStoriesController().b(this.f9023c, this.f9022b, (ArrayList) this.f9024e);
                break;
        }
    }

    public b9(Object obj, Object obj2, int i10, long j10, int i11) {
        this.f9021a = i11;
        this.d = obj;
        this.f9024e = obj2;
        this.f9023c = i10;
        this.f9022b = j10;
    }

    public b9(BaseController baseController, long j10, TLObject tLObject, int i10, int i11) {
        this.f9021a = i11;
        this.d = baseController;
        this.f9022b = j10;
        this.f9024e = tLObject;
        this.f9023c = i10;
    }

    public b9(BaseController baseController, Object obj, long j10, int i10, int i11) {
        this.f9021a = i11;
        this.d = baseController;
        this.f9024e = obj;
        this.f9022b = j10;
        this.f9023c = i10;
    }

    public b9(MessagesStorage messagesStorage, int i10, long j10, TLObject tLObject, int i11) {
        this.f9021a = i11;
        this.d = messagesStorage;
        this.f9023c = i10;
        this.f9022b = j10;
        this.f9024e = tLObject;
    }
}
