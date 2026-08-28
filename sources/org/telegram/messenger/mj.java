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
public final class mj implements Runnable {
    public final int f20999a;
    public final boolean f21000b;
    public final Object f21001c;
    public final Object d;
    public final Object f21002e;

    public mj(Object obj, Object obj2, Object obj3, boolean z10, int i9) {
        this.f20999a = i9;
        this.f21001c = obj;
        this.d = obj2;
        this.f21002e = obj3;
        this.f21000b = z10;
    }

    @Override
    public final void run() {
        switch (this.f20999a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingMedia$127((SendMessagesHelper.MediaSendPrepareWorker) this.f21001c, (AccountInstance) this.d, (SendMessagesHelper.SendingMediaInfo) this.f21002e, this.f21000b);
                return;
            case 1:
                CacheFetcher.c((CacheFetcher) this.f21001c, (Pair) this.d, this.f21002e, this.f21000b);
                return;
            case 2:
                ((ChatObject.Call) this.f21001c).lambda$loadMembers$2(this.f21000b, (TLObject) this.d, (TL_phone.getGroupParticipants) this.f21002e);
                return;
            case 3:
                ((ChatThemeController) this.f21001c).lambda$requestAllChatThemes$2((List) this.d, (ResultCallback) this.f21002e, this.f21000b);
                return;
            case 4:
                ((ContactsController) this.f21001c).lambda$deleteContact$56((ArrayList) this.d, this.f21000b, (String) this.f21002e);
                return;
            case 5:
                ((MediaController) this.f21001c).lambda$toggleRecordingPause$27((File) this.d, this.f21000b, (TLRPC.TL_document) this.f21002e);
                return;
            case 6:
                ((MediaController) this.f21001c).lambda$playEmojiSound$19((MessagesController.EmojiSound) this.f21002e, (AccountInstance) this.d, this.f21000b);
                return;
            case 7:
                ((MediaDataController) this.f21001c).lambda$saveReplyMessages$178(this.f21000b, (ArrayList) this.d, (a0.h) this.f21002e);
                return;
            case 8:
                ((MediaDataController) this.f21001c).lambda$loadAvatarConstructor$241((TLObject) this.d, (SharedPreferences) this.f21002e, this.f21000b);
                return;
            case 9:
                ((MediaDataController) this.f21001c).lambda$broadcastPinnedMessage$167((ArrayList) this.d, this.f21000b, (ArrayList) this.f21002e);
                return;
            case 10:
                ((MessagesController) this.f21001c).lambda$processUpdates$377(this.f21000b, (TLRPC.Updates) this.d, (ArrayList) this.f21002e);
                return;
            case 11:
                ((MessagesController) this.f21001c).lambda$getBlockedPeers$112((TLObject) this.d, this.f21000b, (TLRPC.TL_contacts_getBlocked) this.f21002e);
                return;
            case 12:
                ((MessagesController.CommonChatsList) this.f21001c).lambda$load$0((int[]) this.d, (TLObject) this.f21002e, this.f21000b);
                return;
            case 13:
                ((MessagesStorage) this.f21001c).lambda$putUsersAndChats$181((List) this.d, (List) this.f21002e, this.f21000b);
                return;
            default:
                ((NotificationsController) this.f21001c).lambda$removeDeletedMessagesFromNotifications$10((a0.h) this.d, this.f21000b, (ArrayList) this.f21002e);
                return;
        }
    }

    public mj(Object obj, Object obj2, boolean z10, Object obj3, int i9) {
        this.f20999a = i9;
        this.f21001c = obj;
        this.d = obj2;
        this.f21000b = z10;
        this.f21002e = obj3;
    }

    public mj(Object obj, boolean z10, Object obj2, Object obj3, int i9) {
        this.f20999a = i9;
        this.f21001c = obj;
        this.f21000b = z10;
        this.d = obj2;
        this.f21002e = obj3;
    }

    public mj(MediaController mediaController, MessagesController.EmojiSound emojiSound, AccountInstance accountInstance, boolean z10) {
        this.f20999a = 6;
        this.f21001c = mediaController;
        this.f21002e = emojiSound;
        this.d = accountInstance;
        this.f21000b = z10;
    }
}
