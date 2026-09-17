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
public final class uj implements Runnable {
    public final int f19206a;
    public final boolean f19207b;
    public final Object f19208c;
    public final Object d;
    public final Object f19209e;

    public uj(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f19206a = i10;
        this.f19208c = obj;
        this.d = obj2;
        this.f19209e = obj3;
        this.f19207b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19206a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingMedia$127((SendMessagesHelper.MediaSendPrepareWorker) this.f19208c, (AccountInstance) this.d, (SendMessagesHelper.SendingMediaInfo) this.f19209e, this.f19207b);
                return;
            case 1:
                CacheFetcher.c((CacheFetcher) this.f19208c, (Pair) this.d, this.f19209e, this.f19207b);
                return;
            case 2:
                ((ChatObject.Call) this.f19208c).lambda$loadMembers$2(this.f19207b, (TLObject) this.d, (TL_phone.getGroupParticipants) this.f19209e);
                return;
            case 3:
                ((ChatThemeController) this.f19208c).lambda$requestAllChatThemes$2((List) this.d, (ResultCallback) this.f19209e, this.f19207b);
                return;
            case 4:
                ((ContactsController) this.f19208c).lambda$deleteContact$56((ArrayList) this.d, this.f19207b, (String) this.f19209e);
                return;
            case 5:
                ((MediaController) this.f19208c).lambda$toggleRecordingPause$27((File) this.d, this.f19207b, (TLRPC.TL_document) this.f19209e);
                return;
            case 6:
                ((MediaController) this.f19208c).lambda$playEmojiSound$19((MessagesController.EmojiSound) this.f19209e, (AccountInstance) this.d, this.f19207b);
                return;
            case 7:
                ((MediaDataController) this.f19208c).lambda$saveReplyMessages$178(this.f19207b, (ArrayList) this.d, (a0.i) this.f19209e);
                return;
            case 8:
                ((MediaDataController) this.f19208c).lambda$loadAvatarConstructor$241((TLObject) this.d, (SharedPreferences) this.f19209e, this.f19207b);
                return;
            case 9:
                ((MediaDataController) this.f19208c).lambda$broadcastPinnedMessage$167((ArrayList) this.d, this.f19207b, (ArrayList) this.f19209e);
                return;
            case 10:
                ((MessagesController) this.f19208c).lambda$processUpdates$377(this.f19207b, (TLRPC.Updates) this.d, (ArrayList) this.f19209e);
                return;
            case 11:
                ((MessagesController) this.f19208c).lambda$getBlockedPeers$112((TLObject) this.d, this.f19207b, (TLRPC.TL_contacts_getBlocked) this.f19209e);
                return;
            case 12:
                ((MessagesController.CommonChatsList) this.f19208c).lambda$load$0((int[]) this.d, (TLObject) this.f19209e, this.f19207b);
                return;
            case 13:
                ((MessagesStorage) this.f19208c).lambda$putUsersAndChats$181((List) this.d, (List) this.f19209e, this.f19207b);
                return;
            default:
                ((NotificationsController) this.f19208c).lambda$removeDeletedMessagesFromNotifications$10((a0.i) this.d, this.f19207b, (ArrayList) this.f19209e);
                return;
        }
    }

    public uj(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f19206a = i10;
        this.f19208c = obj;
        this.d = obj2;
        this.f19207b = z10;
        this.f19209e = obj3;
    }

    public uj(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f19206a = i10;
        this.f19208c = obj;
        this.f19207b = z10;
        this.d = obj2;
        this.f19209e = obj3;
    }

    public uj(MediaController mediaController, MessagesController.EmojiSound emojiSound, AccountInstance accountInstance, boolean z10) {
        this.f19206a = 6;
        this.f19208c = mediaController;
        this.f19209e = emojiSound;
        this.d = accountInstance;
        this.f19207b = z10;
    }
}
