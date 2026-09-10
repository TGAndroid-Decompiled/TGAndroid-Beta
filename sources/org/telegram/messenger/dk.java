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
public final class dk implements Runnable {
    public final int f15022a;
    public final boolean f15023b;
    public final Object f15024c;
    public final Object d;
    public final Object e;

    public dk(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f15022a = i10;
        this.f15024c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f15023b = z10;
    }

    @Override
    public final void run() {
        switch (this.f15022a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingMedia$127((SendMessagesHelper.MediaSendPrepareWorker) this.f15024c, (AccountInstance) this.d, (SendMessagesHelper.SendingMediaInfo) this.e, this.f15023b);
                return;
            case 1:
                CacheFetcher.c((CacheFetcher) this.f15024c, (Pair) this.d, this.e, this.f15023b);
                return;
            case 2:
                ((ChatObject.Call) this.f15024c).lambda$loadMembers$2(this.f15023b, (TLObject) this.d, (TL_phone.getGroupParticipants) this.e);
                return;
            case 3:
                ((ChatThemeController) this.f15024c).lambda$requestAllChatThemes$2((List) this.d, (ResultCallback) this.e, this.f15023b);
                return;
            case 4:
                ((ContactsController) this.f15024c).lambda$deleteContact$56((ArrayList) this.d, this.f15023b, (String) this.e);
                return;
            case 5:
                ((MediaController) this.f15024c).lambda$toggleRecordingPause$27((File) this.d, this.f15023b, (TLRPC.TL_document) this.e);
                return;
            case 6:
                ((MediaController) this.f15024c).lambda$playEmojiSound$19((MessagesController.EmojiSound) this.e, (AccountInstance) this.d, this.f15023b);
                return;
            case 7:
                ((MediaDataController) this.f15024c).lambda$saveReplyMessages$178(this.f15023b, (ArrayList) this.d, (a0.i) this.e);
                return;
            case 8:
                ((MediaDataController) this.f15024c).lambda$loadAvatarConstructor$241((TLObject) this.d, (SharedPreferences) this.e, this.f15023b);
                return;
            case 9:
                ((MediaDataController) this.f15024c).lambda$broadcastPinnedMessage$167((ArrayList) this.d, this.f15023b, (ArrayList) this.e);
                return;
            case 10:
                ((MessagesController) this.f15024c).lambda$processUpdates$377(this.f15023b, (TLRPC.Updates) this.d, (ArrayList) this.e);
                return;
            case 11:
                ((MessagesController) this.f15024c).lambda$getBlockedPeers$112((TLObject) this.d, this.f15023b, (TLRPC.TL_contacts_getBlocked) this.e);
                return;
            case 12:
                ((MessagesController.CommonChatsList) this.f15024c).lambda$load$0((int[]) this.d, (TLObject) this.e, this.f15023b);
                return;
            case 13:
                ((MessagesStorage) this.f15024c).lambda$putUsersAndChats$181((List) this.d, (List) this.e, this.f15023b);
                return;
            default:
                ((NotificationsController) this.f15024c).lambda$removeDeletedMessagesFromNotifications$10((a0.i) this.d, this.f15023b, (ArrayList) this.e);
                return;
        }
    }

    public dk(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f15022a = i10;
        this.f15024c = obj;
        this.d = obj2;
        this.f15023b = z10;
        this.e = obj3;
    }

    public dk(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f15022a = i10;
        this.f15024c = obj;
        this.f15023b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public dk(MediaController mediaController, MessagesController.EmojiSound emojiSound, AccountInstance accountInstance, boolean z10) {
        this.f15022a = 6;
        this.f15024c = mediaController;
        this.e = emojiSound;
        this.d = accountInstance;
        this.f15023b = z10;
    }
}
