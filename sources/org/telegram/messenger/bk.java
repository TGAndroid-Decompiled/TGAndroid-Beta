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
    public final int f17455a;
    public final boolean f17456b;
    public final Object f17457c;
    public final Object d;
    public final Object f17458e;

    public bk(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f17455a = i10;
        this.f17457c = obj;
        this.d = obj2;
        this.f17458e = obj3;
        this.f17456b = z10;
    }

    @Override
    public final void run() {
        switch (this.f17455a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingMedia$130((SendMessagesHelper.MediaSendPrepareWorker) this.f17457c, (AccountInstance) this.d, (SendMessagesHelper.SendingMediaInfo) this.f17458e, this.f17456b);
                return;
            case 1:
                CacheFetcher.c((CacheFetcher) this.f17457c, (Pair) this.d, this.f17458e, this.f17456b);
                return;
            case 2:
                ((ChatObject.Call) this.f17457c).lambda$loadMembers$2(this.f17456b, (TLObject) this.d, (TL_phone.getGroupParticipants) this.f17458e);
                return;
            case 3:
                ((ChatThemeController) this.f17457c).lambda$requestAllChatThemes$2((List) this.d, (ResultCallback) this.f17458e, this.f17456b);
                return;
            case 4:
                ((ContactsController) this.f17457c).lambda$deleteContact$56((ArrayList) this.d, this.f17456b, (String) this.f17458e);
                return;
            case 5:
                ((MediaController) this.f17457c).lambda$toggleRecordingPause$27((File) this.d, this.f17456b, (TLRPC.TL_document) this.f17458e);
                return;
            case 6:
                ((MediaController) this.f17457c).lambda$playEmojiSound$19((MessagesController.EmojiSound) this.f17458e, (AccountInstance) this.d, this.f17456b);
                return;
            case 7:
                ((MediaDataController) this.f17457c).lambda$saveReplyMessages$178(this.f17456b, (ArrayList) this.d, (a0.i) this.f17458e);
                return;
            case 8:
                ((MediaDataController) this.f17457c).lambda$loadAvatarConstructor$242((TLObject) this.d, (SharedPreferences) this.f17458e, this.f17456b);
                return;
            case 9:
                ((MediaDataController) this.f17457c).lambda$broadcastPinnedMessage$167((ArrayList) this.d, this.f17456b, (ArrayList) this.f17458e);
                return;
            case 10:
                ((MessagesController) this.f17457c).lambda$getBlockedPeers$111((TLObject) this.d, this.f17456b, (TLRPC.TL_contacts_getBlocked) this.f17458e);
                return;
            case 11:
                ((MessagesController) this.f17457c).lambda$processUpdates$380(this.f17456b, (TLRPC.Updates) this.d, (ArrayList) this.f17458e);
                return;
            case 12:
                ((MessagesController.CommonChatsList) this.f17457c).lambda$load$0((int[]) this.d, (TLObject) this.f17458e, this.f17456b);
                return;
            case 13:
                ((MessagesStorage) this.f17457c).lambda$putUsersAndChats$181((List) this.d, (List) this.f17458e, this.f17456b);
                return;
            default:
                ((NotificationsController) this.f17457c).lambda$removeDeletedMessagesFromNotifications$11((a0.i) this.d, this.f17456b, (ArrayList) this.f17458e);
                return;
        }
    }

    public bk(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f17455a = i10;
        this.f17457c = obj;
        this.d = obj2;
        this.f17456b = z10;
        this.f17458e = obj3;
    }

    public bk(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f17455a = i10;
        this.f17457c = obj;
        this.f17456b = z10;
        this.d = obj2;
        this.f17458e = obj3;
    }

    public bk(MediaController mediaController, MessagesController.EmojiSound emojiSound, AccountInstance accountInstance, boolean z10) {
        this.f17455a = 6;
        this.f17457c = mediaController;
        this.f17458e = emojiSound;
        this.d = accountInstance;
        this.f17456b = z10;
    }
}
