package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.collection.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

public final class CacheFetcher$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final boolean f$3;

    public CacheFetcher$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((CacheFetcher) this.f$0).lambda$callCallbacks$3((Pair) this.f$1, this.f$2, this.f$3);
                break;
            case 1:
                SendMessagesHelper.lambda$prepareSendingMedia$127((SendMessagesHelper.MediaSendPrepareWorker) this.f$0, (AccountInstance) this.f$1, (SendMessagesHelper.SendingMediaInfo) this.f$2, this.f$3);
                break;
            case 2:
                ((ChatObject.Call) this.f$0).lambda$loadMembers$2(this.f$3, (TLObject) this.f$1, (TL_phone.getGroupParticipants) this.f$2);
                break;
            case 3:
                ((ChatThemeController) this.f$0).lambda$requestAllChatThemes$2((List) this.f$1, (ResultCallback) this.f$2, this.f$3);
                break;
            case 4:
                ((ContactsController) this.f$0).lambda$deleteContact$56((ArrayList) this.f$1, this.f$3, (String) this.f$2);
                break;
            case 5:
                ((MediaController) this.f$0).lambda$playEmojiSound$19((MessagesController.EmojiSound) this.f$1, (AccountInstance) this.f$2, this.f$3);
                break;
            case 6:
                ((MediaController) this.f$0).lambda$toggleRecordingPause$27((File) this.f$1, this.f$3, (TLRPC.TL_document) this.f$2);
                break;
            case 7:
                ((MediaDataController) this.f$0).lambda$saveReplyMessages$178(this.f$3, (ArrayList) this.f$1, (LongSparseArray) this.f$2);
                break;
            case 8:
                ((MediaDataController) this.f$0).lambda$loadAvatarConstructor$241((TLObject) this.f$1, (SharedPreferences) this.f$2, this.f$3);
                break;
            case 9:
                ((MediaDataController) this.f$0).lambda$broadcastPinnedMessage$167((ArrayList) this.f$1, this.f$3, (ArrayList) this.f$2);
                break;
            case 10:
                ((MessagesController) this.f$0).lambda$processUpdates$377(this.f$3, (TLRPC.Updates) this.f$1, (ArrayList) this.f$2);
                break;
            case 11:
                ((MessagesController) this.f$0).lambda$getBlockedPeers$112((TLObject) this.f$1, this.f$3, (TLRPC.TL_contacts_getBlocked) this.f$2);
                break;
            case 12:
                ((MessagesController.CommonChatsList) this.f$0).lambda$load$0((int[]) this.f$1, (TLObject) this.f$2, this.f$3);
                break;
            case 13:
                ((MessagesStorage) this.f$0).lambda$putUsersAndChats$181((List) this.f$1, (List) this.f$2, this.f$3);
                break;
            default:
                ((NotificationsController) this.f$0).lambda$removeDeletedMessagesFromNotifications$10((LongSparseArray) this.f$1, this.f$3, (ArrayList) this.f$2);
                break;
        }
    }

    public CacheFetcher$$ExternalSyntheticLambda0(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = z;
        this.f$2 = obj3;
    }

    public CacheFetcher$$ExternalSyntheticLambda0(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$3 = z;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }
}
