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
public final class tj implements Runnable {
    public final int f21674a;
    public final boolean f21675b;
    public final Object f21676c;
    public final Object d;
    public final Object f21677e;

    public tj(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f21674a = i10;
        this.f21676c = obj;
        this.d = obj2;
        this.f21677e = obj3;
        this.f21675b = z10;
    }

    @Override
    public final void run() {
        switch (this.f21674a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingMedia$127((SendMessagesHelper.MediaSendPrepareWorker) this.f21676c, (AccountInstance) this.d, (SendMessagesHelper.SendingMediaInfo) this.f21677e, this.f21675b);
                return;
            case 1:
                CacheFetcher.c((CacheFetcher) this.f21676c, (Pair) this.d, this.f21677e, this.f21675b);
                return;
            case 2:
                ((ChatObject.Call) this.f21676c).lambda$loadMembers$2(this.f21675b, (TLObject) this.d, (TL_phone.getGroupParticipants) this.f21677e);
                return;
            case 3:
                ((ChatThemeController) this.f21676c).lambda$requestAllChatThemes$2((List) this.d, (ResultCallback) this.f21677e, this.f21675b);
                return;
            case 4:
                ((ContactsController) this.f21676c).lambda$deleteContact$56((ArrayList) this.d, this.f21675b, (String) this.f21677e);
                return;
            case 5:
                ((MediaController) this.f21676c).lambda$toggleRecordingPause$27((File) this.d, this.f21675b, (TLRPC.TL_document) this.f21677e);
                return;
            case 6:
                ((MediaController) this.f21676c).lambda$playEmojiSound$19((MessagesController.EmojiSound) this.f21677e, (AccountInstance) this.d, this.f21675b);
                return;
            case 7:
                ((MediaDataController) this.f21676c).lambda$saveReplyMessages$178(this.f21675b, (ArrayList) this.d, (a0.h) this.f21677e);
                return;
            case 8:
                ((MediaDataController) this.f21676c).lambda$loadAvatarConstructor$241((TLObject) this.d, (SharedPreferences) this.f21677e, this.f21675b);
                return;
            case 9:
                ((MediaDataController) this.f21676c).lambda$broadcastPinnedMessage$167((ArrayList) this.d, this.f21675b, (ArrayList) this.f21677e);
                return;
            case 10:
                ((MessagesController) this.f21676c).lambda$processUpdates$377(this.f21675b, (TLRPC.Updates) this.d, (ArrayList) this.f21677e);
                return;
            case 11:
                ((MessagesController) this.f21676c).lambda$getBlockedPeers$112((TLObject) this.d, this.f21675b, (TLRPC.TL_contacts_getBlocked) this.f21677e);
                return;
            case 12:
                ((MessagesController.CommonChatsList) this.f21676c).lambda$load$0((int[]) this.d, (TLObject) this.f21677e, this.f21675b);
                return;
            case 13:
                ((MessagesStorage) this.f21676c).lambda$putUsersAndChats$181((List) this.d, (List) this.f21677e, this.f21675b);
                return;
            default:
                ((NotificationsController) this.f21676c).lambda$removeDeletedMessagesFromNotifications$10((a0.h) this.d, this.f21675b, (ArrayList) this.f21677e);
                return;
        }
    }

    public tj(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f21674a = i10;
        this.f21676c = obj;
        this.d = obj2;
        this.f21675b = z10;
        this.f21677e = obj3;
    }

    public tj(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f21674a = i10;
        this.f21676c = obj;
        this.f21675b = z10;
        this.d = obj2;
        this.f21677e = obj3;
    }

    public tj(MediaController mediaController, MessagesController.EmojiSound emojiSound, AccountInstance accountInstance, boolean z10) {
        this.f21674a = 6;
        this.f21676c = mediaController;
        this.f21677e = emojiSound;
        this.d = accountInstance;
        this.f21675b = z10;
    }
}
