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
    public final int f18996a;
    public final boolean f18997b;
    public final Object f18998c;
    public final Object d;
    public final Object e;

    public xj(Object obj, Object obj2, Object obj3, boolean z4, int i10) {
        this.f18996a = i10;
        this.f18998c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18997b = z4;
    }

    @Override
    public final void run() {
        switch (this.f18996a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingMedia$127((SendMessagesHelper.MediaSendPrepareWorker) this.f18998c, (AccountInstance) this.d, (SendMessagesHelper.SendingMediaInfo) this.e, this.f18997b);
                return;
            case 1:
                CacheFetcher.c((CacheFetcher) this.f18998c, (Pair) this.d, this.e, this.f18997b);
                return;
            case 2:
                ((ChatObject.Call) this.f18998c).lambda$loadMembers$2(this.f18997b, (TLObject) this.d, (TL_phone.getGroupParticipants) this.e);
                return;
            case 3:
                ((ChatThemeController) this.f18998c).lambda$requestAllChatThemes$2((List) this.d, (ResultCallback) this.e, this.f18997b);
                return;
            case 4:
                ((ContactsController) this.f18998c).lambda$deleteContact$56((ArrayList) this.d, this.f18997b, (String) this.e);
                return;
            case 5:
                ((MediaController) this.f18998c).lambda$toggleRecordingPause$27((File) this.d, this.f18997b, (TLRPC.TL_document) this.e);
                return;
            case 6:
                ((MediaController) this.f18998c).lambda$playEmojiSound$19((MessagesController.EmojiSound) this.e, (AccountInstance) this.d, this.f18997b);
                return;
            case 7:
                ((MediaDataController) this.f18998c).lambda$saveReplyMessages$178(this.f18997b, (ArrayList) this.d, (a0.h) this.e);
                return;
            case 8:
                ((MediaDataController) this.f18998c).lambda$loadAvatarConstructor$241((TLObject) this.d, (SharedPreferences) this.e, this.f18997b);
                return;
            case 9:
                ((MediaDataController) this.f18998c).lambda$broadcastPinnedMessage$167((ArrayList) this.d, this.f18997b, (ArrayList) this.e);
                return;
            case 10:
                ((MessagesController) this.f18998c).lambda$processUpdates$377(this.f18997b, (TLRPC.Updates) this.d, (ArrayList) this.e);
                return;
            case 11:
                ((MessagesController) this.f18998c).lambda$getBlockedPeers$112((TLObject) this.d, this.f18997b, (TLRPC.TL_contacts_getBlocked) this.e);
                return;
            case 12:
                ((MessagesController.CommonChatsList) this.f18998c).lambda$load$0((int[]) this.d, (TLObject) this.e, this.f18997b);
                return;
            case 13:
                ((MessagesStorage) this.f18998c).lambda$putUsersAndChats$181((List) this.d, (List) this.e, this.f18997b);
                return;
            default:
                ((NotificationsController) this.f18998c).lambda$removeDeletedMessagesFromNotifications$10((a0.h) this.d, this.f18997b, (ArrayList) this.e);
                return;
        }
    }

    public xj(Object obj, Object obj2, boolean z4, Object obj3, int i10) {
        this.f18996a = i10;
        this.f18998c = obj;
        this.d = obj2;
        this.f18997b = z4;
        this.e = obj3;
    }

    public xj(Object obj, boolean z4, Object obj2, Object obj3, int i10) {
        this.f18996a = i10;
        this.f18998c = obj;
        this.f18997b = z4;
        this.d = obj2;
        this.e = obj3;
    }

    public xj(MediaController mediaController, MessagesController.EmojiSound emojiSound, AccountInstance accountInstance, boolean z4) {
        this.f18996a = 6;
        this.f18998c = mediaController;
        this.e = emojiSound;
        this.d = accountInstance;
        this.f18997b = z4;
    }
}
