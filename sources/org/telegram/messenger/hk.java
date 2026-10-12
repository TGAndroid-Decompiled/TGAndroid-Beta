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
public final class hk implements Runnable {
    public final int f17825a;
    public final boolean f17826b;
    public final Object f17827c;
    public final Object d;
    public final Object f17828e;

    public hk(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f17825a = i10;
        this.f17827c = obj;
        this.d = obj2;
        this.f17828e = obj3;
        this.f17826b = z10;
    }

    @Override
    public final void run() {
        switch (this.f17825a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingMedia$130((SendMessagesHelper.MediaSendPrepareWorker) this.f17827c, (AccountInstance) this.d, (SendMessagesHelper.SendingMediaInfo) this.f17828e, this.f17826b);
                return;
            case 1:
                CacheFetcher.c((CacheFetcher) this.f17827c, (Pair) this.d, this.f17828e, this.f17826b);
                return;
            case 2:
                ((ChatObject.Call) this.f17827c).lambda$loadMembers$2(this.f17826b, (TLObject) this.d, (TL_phone.getGroupParticipants) this.f17828e);
                return;
            case 3:
                ((ChatThemeController) this.f17827c).lambda$requestAllChatThemes$2((List) this.d, (ResultCallback) this.f17828e, this.f17826b);
                return;
            case 4:
                ((ContactsController) this.f17827c).lambda$deleteContact$56((ArrayList) this.d, this.f17826b, (String) this.f17828e);
                return;
            case 5:
                ((MediaController) this.f17827c).lambda$toggleRecordingPause$28((File) this.d, this.f17826b, (TLRPC.TL_document) this.f17828e);
                return;
            case 6:
                ((MediaController) this.f17827c).lambda$playEmojiSound$19((MessagesController.EmojiSound) this.f17828e, (AccountInstance) this.d, this.f17826b);
                return;
            case 7:
                ((MediaDataController) this.f17827c).lambda$saveReplyMessages$178(this.f17826b, (ArrayList) this.d, (a0.i) this.f17828e);
                return;
            case 8:
                ((MediaDataController) this.f17827c).lambda$loadAvatarConstructor$242((TLObject) this.d, (SharedPreferences) this.f17828e, this.f17826b);
                return;
            case 9:
                ((MediaDataController) this.f17827c).lambda$broadcastPinnedMessage$167((ArrayList) this.d, this.f17826b, (ArrayList) this.f17828e);
                return;
            case 10:
                ((MessagesController) this.f17827c).lambda$getBlockedPeers$111((TLObject) this.d, this.f17826b, (TLRPC.TL_contacts_getBlocked) this.f17828e);
                return;
            case 11:
                ((MessagesController) this.f17827c).lambda$processUpdates$380(this.f17826b, (TLRPC.Updates) this.d, (ArrayList) this.f17828e);
                return;
            case 12:
                ((MessagesController.CommonChatsList) this.f17827c).lambda$load$0((int[]) this.d, (TLObject) this.f17828e, this.f17826b);
                return;
            case 13:
                ((MessagesStorage) this.f17827c).lambda$putUsersAndChats$181((List) this.d, (List) this.f17828e, this.f17826b);
                return;
            default:
                ((NotificationsController) this.f17827c).lambda$removeDeletedMessagesFromNotifications$11((a0.i) this.d, this.f17826b, (ArrayList) this.f17828e);
                return;
        }
    }

    public hk(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f17825a = i10;
        this.f17827c = obj;
        this.d = obj2;
        this.f17826b = z10;
        this.f17828e = obj3;
    }

    public hk(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f17825a = i10;
        this.f17827c = obj;
        this.f17826b = z10;
        this.d = obj2;
        this.f17828e = obj3;
    }

    public hk(MediaController mediaController, MessagesController.EmojiSound emojiSound, AccountInstance accountInstance, boolean z10) {
        this.f17825a = 6;
        this.f17827c = mediaController;
        this.f17828e = emojiSound;
        this.d = accountInstance;
        this.f17826b = z10;
    }
}
