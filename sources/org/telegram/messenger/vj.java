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
public final class vj implements Runnable {
    public final int f17792a;
    public final boolean f17793b;
    public final Object f17794c;
    public final Object d;
    public final Object e;

    public vj(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f17792a = i10;
        this.f17794c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f17793b = z10;
    }

    @Override
    public final void run() {
        switch (this.f17792a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingMedia$127((SendMessagesHelper.MediaSendPrepareWorker) this.f17794c, (AccountInstance) this.d, (SendMessagesHelper.SendingMediaInfo) this.e, this.f17793b);
                return;
            case 1:
                CacheFetcher.c((CacheFetcher) this.f17794c, (Pair) this.d, this.e, this.f17793b);
                return;
            case 2:
                ((ChatObject.Call) this.f17794c).lambda$loadMembers$2(this.f17793b, (TLObject) this.d, (TL_phone.getGroupParticipants) this.e);
                return;
            case 3:
                ((ChatThemeController) this.f17794c).lambda$requestAllChatThemes$2((List) this.d, (ResultCallback) this.e, this.f17793b);
                return;
            case 4:
                ((ContactsController) this.f17794c).lambda$deleteContact$56((ArrayList) this.d, this.f17793b, (String) this.e);
                return;
            case 5:
                ((MediaController) this.f17794c).lambda$toggleRecordingPause$27((File) this.d, this.f17793b, (TLRPC.TL_document) this.e);
                return;
            case 6:
                ((MediaController) this.f17794c).lambda$playEmojiSound$19((MessagesController.EmojiSound) this.e, (AccountInstance) this.d, this.f17793b);
                return;
            case 7:
                ((MediaDataController) this.f17794c).lambda$saveReplyMessages$178(this.f17793b, (ArrayList) this.d, (a0.i) this.e);
                return;
            case 8:
                ((MediaDataController) this.f17794c).lambda$loadAvatarConstructor$241((TLObject) this.d, (SharedPreferences) this.e, this.f17793b);
                return;
            case 9:
                ((MediaDataController) this.f17794c).lambda$broadcastPinnedMessage$167((ArrayList) this.d, this.f17793b, (ArrayList) this.e);
                return;
            case 10:
                ((MessagesController) this.f17794c).lambda$processUpdates$377(this.f17793b, (TLRPC.Updates) this.d, (ArrayList) this.e);
                return;
            case 11:
                ((MessagesController) this.f17794c).lambda$getBlockedPeers$112((TLObject) this.d, this.f17793b, (TLRPC.TL_contacts_getBlocked) this.e);
                return;
            case 12:
                ((MessagesController.CommonChatsList) this.f17794c).lambda$load$0((int[]) this.d, (TLObject) this.e, this.f17793b);
                return;
            case 13:
                ((MessagesStorage) this.f17794c).lambda$putUsersAndChats$181((List) this.d, (List) this.e, this.f17793b);
                return;
            default:
                ((NotificationsController) this.f17794c).lambda$removeDeletedMessagesFromNotifications$10((a0.i) this.d, this.f17793b, (ArrayList) this.e);
                return;
        }
    }

    public vj(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f17792a = i10;
        this.f17794c = obj;
        this.d = obj2;
        this.f17793b = z10;
        this.e = obj3;
    }

    public vj(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f17792a = i10;
        this.f17794c = obj;
        this.f17793b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public vj(MediaController mediaController, MessagesController.EmojiSound emojiSound, AccountInstance accountInstance, boolean z10) {
        this.f17792a = 6;
        this.f17794c = mediaController;
        this.e = emojiSound;
        this.d = accountInstance;
        this.f17793b = z10;
    }
}
