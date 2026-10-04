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
    public final int f19270a;
    public final boolean f19271b;
    public final Object f19272c;
    public final Object d;
    public final Object f19273e;

    public tj(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f19270a = i10;
        this.f19272c = obj;
        this.d = obj2;
        this.f19273e = obj3;
        this.f19271b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19270a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingMedia$127((SendMessagesHelper.MediaSendPrepareWorker) this.f19272c, (AccountInstance) this.d, (SendMessagesHelper.SendingMediaInfo) this.f19273e, this.f19271b);
                return;
            case 1:
                CacheFetcher.c((CacheFetcher) this.f19272c, (Pair) this.d, this.f19273e, this.f19271b);
                return;
            case 2:
                ((ChatObject.Call) this.f19272c).lambda$loadMembers$2(this.f19271b, (TLObject) this.d, (TL_phone.getGroupParticipants) this.f19273e);
                return;
            case 3:
                ((ChatThemeController) this.f19272c).lambda$requestAllChatThemes$2((List) this.d, (ResultCallback) this.f19273e, this.f19271b);
                return;
            case 4:
                ((ContactsController) this.f19272c).lambda$deleteContact$56((ArrayList) this.d, this.f19271b, (String) this.f19273e);
                return;
            case 5:
                ((MediaController) this.f19272c).lambda$toggleRecordingPause$27((File) this.d, this.f19271b, (TLRPC.TL_document) this.f19273e);
                return;
            case 6:
                ((MediaController) this.f19272c).lambda$playEmojiSound$19((MessagesController.EmojiSound) this.f19273e, (AccountInstance) this.d, this.f19271b);
                return;
            case 7:
                ((MediaDataController) this.f19272c).lambda$saveReplyMessages$178(this.f19271b, (ArrayList) this.d, (a0.i) this.f19273e);
                return;
            case 8:
                ((MediaDataController) this.f19272c).lambda$loadAvatarConstructor$242((TLObject) this.d, (SharedPreferences) this.f19273e, this.f19271b);
                return;
            case 9:
                ((MediaDataController) this.f19272c).lambda$broadcastPinnedMessage$167((ArrayList) this.d, this.f19271b, (ArrayList) this.f19273e);
                return;
            case 10:
                ((MessagesController) this.f19272c).lambda$processUpdates$377(this.f19271b, (TLRPC.Updates) this.d, (ArrayList) this.f19273e);
                return;
            case 11:
                ((MessagesController) this.f19272c).lambda$getBlockedPeers$112((TLObject) this.d, this.f19271b, (TLRPC.TL_contacts_getBlocked) this.f19273e);
                return;
            case 12:
                ((MessagesController.CommonChatsList) this.f19272c).lambda$load$0((int[]) this.d, (TLObject) this.f19273e, this.f19271b);
                return;
            case 13:
                ((MessagesStorage) this.f19272c).lambda$putUsersAndChats$181((List) this.d, (List) this.f19273e, this.f19271b);
                return;
            default:
                ((NotificationsController) this.f19272c).lambda$removeDeletedMessagesFromNotifications$10((a0.i) this.d, this.f19271b, (ArrayList) this.f19273e);
                return;
        }
    }

    public tj(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f19270a = i10;
        this.f19272c = obj;
        this.d = obj2;
        this.f19271b = z10;
        this.f19273e = obj3;
    }

    public tj(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f19270a = i10;
        this.f19272c = obj;
        this.f19271b = z10;
        this.d = obj2;
        this.f19273e = obj3;
    }

    public tj(MediaController mediaController, MessagesController.EmojiSound emojiSound, AccountInstance accountInstance, boolean z10) {
        this.f19270a = 6;
        this.f19272c = mediaController;
        this.f19273e = emojiSound;
        this.d = accountInstance;
        this.f19271b = z10;
    }
}
