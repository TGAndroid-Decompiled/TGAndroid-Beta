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
public final class xj implements Runnable {
    public final int f20654a;
    public final boolean f20655b;
    public final Object f20656c;
    public final Object d;
    public final Object f20657e;

    public xj(Object obj, Object obj2, Object obj3, boolean z4, int i10) {
        this.f20654a = i10;
        this.f20656c = obj;
        this.d = obj2;
        this.f20657e = obj3;
        this.f20655b = z4;
    }

    @Override
    public final void run() {
        switch (this.f20654a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingMedia$127((SendMessagesHelper.MediaSendPrepareWorker) this.f20656c, (AccountInstance) this.d, (SendMessagesHelper.SendingMediaInfo) this.f20657e, this.f20655b);
                return;
            case 1:
                CacheFetcher.c((CacheFetcher) this.f20656c, (Pair) this.d, this.f20657e, this.f20655b);
                return;
            case 2:
                ((ChatObject.Call) this.f20656c).lambda$loadMembers$2(this.f20655b, (TLObject) this.d, (TL_phone.getGroupParticipants) this.f20657e);
                return;
            case 3:
                ((ChatThemeController) this.f20656c).lambda$requestAllChatThemes$2((List) this.d, (ResultCallback) this.f20657e, this.f20655b);
                return;
            case 4:
                ((ContactsController) this.f20656c).lambda$deleteContact$56((ArrayList) this.d, this.f20655b, (String) this.f20657e);
                return;
            case 5:
                ((MediaController) this.f20656c).lambda$toggleRecordingPause$27((File) this.d, this.f20655b, (TLRPC.TL_document) this.f20657e);
                return;
            case 6:
                ((MediaController) this.f20656c).lambda$playEmojiSound$19((MessagesController.EmojiSound) this.f20657e, (AccountInstance) this.d, this.f20655b);
                return;
            case 7:
                ((MediaDataController) this.f20656c).lambda$saveReplyMessages$178(this.f20655b, (ArrayList) this.d, (a0.h) this.f20657e);
                return;
            case 8:
                ((MediaDataController) this.f20656c).lambda$loadAvatarConstructor$241((TLObject) this.d, (SharedPreferences) this.f20657e, this.f20655b);
                return;
            case 9:
                ((MediaDataController) this.f20656c).lambda$broadcastPinnedMessage$167((ArrayList) this.d, this.f20655b, (ArrayList) this.f20657e);
                return;
            case 10:
                ((MessagesController) this.f20656c).lambda$processUpdates$377(this.f20655b, (TLRPC.Updates) this.d, (ArrayList) this.f20657e);
                return;
            case 11:
                ((MessagesController) this.f20656c).lambda$getBlockedPeers$112((TLObject) this.d, this.f20655b, (TLRPC.TL_contacts_getBlocked) this.f20657e);
                return;
            case 12:
                ((MessagesController.CommonChatsList) this.f20656c).lambda$load$0((int[]) this.d, (TLObject) this.f20657e, this.f20655b);
                return;
            case 13:
                ((MessagesStorage) this.f20656c).lambda$putUsersAndChats$181((List) this.d, (List) this.f20657e, this.f20655b);
                return;
            default:
                ((NotificationsController) this.f20656c).lambda$removeDeletedMessagesFromNotifications$10((a0.h) this.d, this.f20655b, (ArrayList) this.f20657e);
                return;
        }
    }

    public xj(Object obj, Object obj2, boolean z4, Object obj3, int i10) {
        this.f20654a = i10;
        this.f20656c = obj;
        this.d = obj2;
        this.f20655b = z4;
        this.f20657e = obj3;
    }

    public xj(Object obj, boolean z4, Object obj2, Object obj3, int i10) {
        this.f20654a = i10;
        this.f20656c = obj;
        this.f20655b = z4;
        this.d = obj2;
        this.f20657e = obj3;
    }

    public xj(MediaController mediaController, MessagesController.EmojiSound emojiSound, AccountInstance accountInstance, boolean z4) {
        this.f20654a = 6;
        this.f20656c = mediaController;
        this.f20657e = emojiSound;
        this.d = accountInstance;
        this.f20655b = z4;
    }
}
