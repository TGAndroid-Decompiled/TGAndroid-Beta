package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

public final class qj implements Runnable {

    public final int f21383a;

    public final boolean f21384b;

    public final Object f21385c;
    public final Object d;

    public final Object f21386e;

    public qj(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f21383a = i10;
        this.f21385c = obj;
        this.d = obj2;
        this.f21386e = obj3;
        this.f21384b = z10;
    }

    @Override
    public final void run() {
        switch (this.f21383a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingMedia$127((SendMessagesHelper.MediaSendPrepareWorker) this.f21385c, (AccountInstance) this.d, (SendMessagesHelper.SendingMediaInfo) this.f21386e, this.f21384b);
                break;
            case 1:
                ((CacheFetcher) this.f21385c).lambda$callCallbacks$3((Pair) this.d, this.f21386e, this.f21384b);
                break;
            case 2:
                ((ChatObject.Call) this.f21385c).lambda$loadMembers$2(this.f21384b, (TLObject) this.d, (TL_phone.getGroupParticipants) this.f21386e);
                break;
            case 3:
                ((ChatThemeController) this.f21385c).lambda$requestAllChatThemes$2((List) this.d, (ResultCallback) this.f21386e, this.f21384b);
                break;
            case 4:
                ((ContactsController) this.f21385c).lambda$deleteContact$56((ArrayList) this.d, this.f21384b, (String) this.f21386e);
                break;
            case 5:
                ((MediaController) this.f21385c).lambda$toggleRecordingPause$27((File) this.d, this.f21384b, (TLRPC.TL_document) this.f21386e);
                break;
            case 6:
                ((MediaController) this.f21385c).lambda$playEmojiSound$19((MessagesController.EmojiSound) this.f21386e, (AccountInstance) this.d, this.f21384b);
                break;
            case 7:
                ((MediaDataController) this.f21385c).lambda$saveReplyMessages$178(this.f21384b, (ArrayList) this.d, (a0.h) this.f21386e);
                break;
            case 8:
                ((MediaDataController) this.f21385c).lambda$loadAvatarConstructor$241((TLObject) this.d, (SharedPreferences) this.f21386e, this.f21384b);
                break;
            case 9:
                ((MediaDataController) this.f21385c).lambda$broadcastPinnedMessage$167((ArrayList) this.d, this.f21384b, (ArrayList) this.f21386e);
                break;
            case 10:
                ((MessagesController) this.f21385c).lambda$processUpdates$377(this.f21384b, (TLRPC.Updates) this.d, (ArrayList) this.f21386e);
                break;
            case 11:
                ((MessagesController) this.f21385c).lambda$getBlockedPeers$112((TLObject) this.d, this.f21384b, (TLRPC.TL_contacts_getBlocked) this.f21386e);
                break;
            case 12:
                ((MessagesController.CommonChatsList) this.f21385c).lambda$load$0((int[]) this.d, (TLObject) this.f21386e, this.f21384b);
                break;
            case 13:
                ((MessagesStorage) this.f21385c).lambda$putUsersAndChats$181((List) this.d, (List) this.f21386e, this.f21384b);
                break;
            default:
                ((NotificationsController) this.f21385c).lambda$removeDeletedMessagesFromNotifications$10((a0.h) this.d, this.f21384b, (ArrayList) this.f21386e);
                break;
        }
    }

    public qj(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f21383a = i10;
        this.f21385c = obj;
        this.d = obj2;
        this.f21384b = z10;
        this.f21386e = obj3;
    }

    public qj(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f21383a = i10;
        this.f21385c = obj;
        this.f21384b = z10;
        this.d = obj2;
        this.f21386e = obj3;
    }

    public qj(MediaController mediaController, MessagesController.EmojiSound emojiSound, AccountInstance accountInstance, boolean z10) {
        this.f21383a = 6;
        this.f21385c = mediaController;
        this.f21386e = emojiSound;
        this.d = accountInstance;
        this.f21384b = z10;
    }
}
