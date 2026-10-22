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
public final class ak implements Runnable {
    public final int f17889a;
    public final boolean f17890b;
    public final Object f17891c;
    public final Object d;
    public final Object e;

    public ak(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f17889a = i10;
        this.f17891c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f17890b = z10;
    }

    @Override
    public final void run() {
        switch (this.f17889a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingMedia$130((SendMessagesHelper.MediaSendPrepareWorker) this.f17891c, (AccountInstance) this.d, (SendMessagesHelper.SendingMediaInfo) this.e, this.f17890b);
                return;
            case 1:
                CacheFetcher.c((CacheFetcher) this.f17891c, (Pair) this.d, this.e, this.f17890b);
                return;
            case 2:
                ((ChatObject.Call) this.f17891c).lambda$loadMembers$2(this.f17890b, (TLObject) this.d, (TL_phone.getGroupParticipants) this.e);
                return;
            case 3:
                ((ChatThemeController) this.f17891c).lambda$requestAllChatThemes$2((List) this.d, (ResultCallback) this.e, this.f17890b);
                return;
            case 4:
                ((ContactsController) this.f17891c).lambda$deleteContact$56((ArrayList) this.d, this.f17890b, (String) this.e);
                return;
            case 5:
                ((MediaController) this.f17891c).lambda$toggleRecordingPause$29((File) this.d, this.f17890b, (TLRPC.TL_document) this.e);
                return;
            case 6:
                ((MediaController) this.f17891c).lambda$playEmojiSound$19((MessagesController.EmojiSound) this.e, (AccountInstance) this.d, this.f17890b);
                return;
            case 7:
                ((MediaDataController) this.f17891c).lambda$saveReplyMessages$178(this.f17890b, (ArrayList) this.d, (a0.h) this.e);
                return;
            case 8:
                ((MediaDataController) this.f17891c).lambda$loadAvatarConstructor$242((TLObject) this.d, (SharedPreferences) this.e, this.f17890b);
                return;
            case 9:
                ((MediaDataController) this.f17891c).lambda$broadcastPinnedMessage$167((ArrayList) this.d, this.f17890b, (ArrayList) this.e);
                return;
            case 10:
                ((MessagesController) this.f17891c).lambda$getBlockedPeers$111((TLObject) this.d, this.f17890b, (TLRPC.TL_contacts_getBlocked) this.e);
                return;
            case 11:
                ((MessagesController) this.f17891c).lambda$processUpdates$380(this.f17890b, (TLRPC.Updates) this.d, (ArrayList) this.e);
                return;
            case 12:
                ((MessagesController.CommonChatsList) this.f17891c).lambda$load$0((int[]) this.d, (TLObject) this.e, this.f17890b);
                return;
            case 13:
                ((MessagesStorage) this.f17891c).lambda$putUsersAndChats$181((List) this.d, (List) this.e, this.f17890b);
                return;
            default:
                ((NotificationsController) this.f17891c).lambda$removeDeletedMessagesFromNotifications$11((a0.h) this.d, this.f17890b, (ArrayList) this.e);
                return;
        }
    }

    public ak(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f17889a = i10;
        this.f17891c = obj;
        this.d = obj2;
        this.f17890b = z10;
        this.e = obj3;
    }

    public ak(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f17889a = i10;
        this.f17891c = obj;
        this.f17890b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public ak(MediaController mediaController, MessagesController.EmojiSound emojiSound, AccountInstance accountInstance, boolean z10) {
        this.f17889a = 6;
        this.f17891c = mediaController;
        this.e = emojiSound;
        this.d = accountInstance;
        this.f17890b = z10;
    }
}
