package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class bk implements Runnable {
    public final int f17459a;
    public final boolean f17460b;
    public final Object f17461c;
    public final Object d;
    public final Object f17462e;

    public bk(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f17459a = i10;
        this.f17461c = obj;
        this.d = obj2;
        this.f17462e = obj3;
        this.f17460b = z10;
    }

    @Override
    public final void run() {
        switch (this.f17459a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingMedia$130((SendMessagesHelper.MediaSendPrepareWorker) this.f17461c, (AccountInstance) this.d, (SendMessagesHelper.SendingMediaInfo) this.f17462e, this.f17460b);
                return;
            case 1:
                CacheFetcher.c((CacheFetcher) this.f17461c, (Pair) this.d, this.f17462e, this.f17460b);
                return;
            case 2:
                ((ChatObject.Call) this.f17461c).lambda$loadMembers$2(this.f17460b, (TLObject) this.d, (TL_phone.getGroupParticipants) this.f17462e);
                return;
            case 3:
                ((ChatThemeController) this.f17461c).lambda$requestAllChatThemes$2((List) this.d, (ResultCallback) this.f17462e, this.f17460b);
                return;
            case 4:
                ((ContactsController) this.f17461c).lambda$deleteContact$56((ArrayList) this.d, this.f17460b, (String) this.f17462e);
                return;
            case 5:
                ((MediaController) this.f17461c).lambda$toggleRecordingPause$27((File) this.d, this.f17460b, (TLRPC.TL_document) this.f17462e);
                return;
            case 6:
                ((MediaController) this.f17461c).lambda$playEmojiSound$19((MessagesController.EmojiSound) this.f17462e, (AccountInstance) this.d, this.f17460b);
                return;
            case 7:
                ((MediaDataController) this.f17461c).lambda$saveReplyMessages$178(this.f17460b, (ArrayList) this.d, (a0.i) this.f17462e);
                return;
            case 8:
                ((MediaDataController) this.f17461c).lambda$loadAvatarConstructor$242((TLObject) this.d, (SharedPreferences) this.f17462e, this.f17460b);
                return;
            case 9:
                ((MediaDataController) this.f17461c).lambda$broadcastPinnedMessage$167((ArrayList) this.d, this.f17460b, (ArrayList) this.f17462e);
                return;
            case 10:
                ((MessagesController) this.f17461c).lambda$getBlockedPeers$111((TLObject) this.d, this.f17460b, (TLRPC.TL_contacts_getBlocked) this.f17462e);
                return;
            case 11:
                ((MessagesController) this.f17461c).lambda$processUpdates$380(this.f17460b, (TLRPC.Updates) this.d, (ArrayList) this.f17462e);
                return;
            case 12:
                ((MessagesController.CommonChatsList) this.f17461c).lambda$load$0((int[]) this.d, (TLObject) this.f17462e, this.f17460b);
                return;
            case 13:
                ((MessagesStorage) this.f17461c).lambda$putUsersAndChats$181((List) this.d, (List) this.f17462e, this.f17460b);
                return;
            default:
                ((NotificationsController) this.f17461c).lambda$removeDeletedMessagesFromNotifications$11((a0.i) this.d, this.f17460b, (ArrayList) this.f17462e);
                return;
        }
    }

    public bk(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f17459a = i10;
        this.f17461c = obj;
        this.d = obj2;
        this.f17460b = z10;
        this.f17462e = obj3;
    }

    public bk(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f17459a = i10;
        this.f17461c = obj;
        this.f17460b = z10;
        this.d = obj2;
        this.f17462e = obj3;
    }

    public bk(MediaController mediaController, MessagesController.EmojiSound emojiSound, AccountInstance accountInstance, boolean z10) {
        this.f17459a = 6;
        this.f17461c = mediaController;
        this.f17462e = emojiSound;
        this.d = accountInstance;
        this.f17460b = z10;
    }
}
