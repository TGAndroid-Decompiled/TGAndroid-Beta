package org.telegram.messenger;

import android.net.Uri;
import android.os.Bundle;
import androidx.collection.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;

public final class UserConfig$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public UserConfig$$ExternalSyntheticLambda3(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((UserConfig) this.f$0).lambda$loadGlobalTTl$3((TLObject) this.f$1);
                break;
            case 1:
                ((NotificationBadge.ZukHomeBadger) this.f$0).lambda$executeBadge$0((Bundle) this.f$1);
                break;
            case 2:
                NotificationsController.lambda$showExtraNotifications$45((Uri) this.f$0, (File) this.f$1);
                break;
            case 3:
                NotificationsController.lambda$loadTopicsNotificationsExceptions$53((Consumer) this.f$0, (HashSet) this.f$1);
                break;
            case 4:
                ((NotificationsController) this.f$0).lambda$didReceivedNotification$38((String) this.f$1);
                break;
            case 5:
                ((NotificationsController) this.f$0).lambda$processEditedMessages$22((LongSparseArray) this.f$1);
                break;
            case 6:
                PasskeysController.lambda$create$2((Utilities.Callback2) this.f$0, (Throwable) this.f$1);
                break;
            case 7:
                ((SavedMessagesController) this.f$0).lambda$deleteCache$13((MessagesStorage) this.f$1);
                break;
            case 8:
                ((SecretChatHelper) this.f$0).lambda$performSendEncryptedRequest$6((TLRPC.Message) this.f$1);
                break;
            case 9:
                ((SendMessagesHelper) this.f$0).lambda$performSendMessageRequest$90((TLRPC.TL_updateShortSentMessage) this.f$1);
                break;
            case 10:
                ((SendMessagesHelper) this.f$0).lambda$sendMessage$16((ArrayList) this.f$1);
                break;
            case 11:
                ((SendMessagesHelper.ImportingStickers) this.f$0).lambda$onMediaImport$0((String) this.f$1);
                break;
            case 12:
                ((TopicsController) this.f$0).lambda$processUpdate$22((List) this.f$1);
                break;
            case 13:
                ((TopicsController) this.f$0).lambda$pinTopic$19((BaseFragment) this.f$1);
                break;
            case 14:
                ((TopicsController) this.f$0).lambda$onTopicsDeletedServerSide$23((ArrayList) this.f$1);
                break;
            default:
                ((TopicsController) this.f$0).lambda$updateReadOutbox$26((HashMap) this.f$1);
                break;
        }
    }
}
