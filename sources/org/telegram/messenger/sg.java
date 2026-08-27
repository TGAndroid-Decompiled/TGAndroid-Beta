package org.telegram.messenger;

import android.net.Uri;
import android.os.Bundle;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class sg implements Runnable {

    public final int f21548a;

    public final Object f21549b;

    public final Object f21550c;

    public sg(int i10, Object obj, Object obj2) {
        this.f21548a = i10;
        this.f21549b = obj;
        this.f21550c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f21548a) {
            case 0:
                ((NotificationBadge.ZukHomeBadger) this.f21549b).lambda$executeBadge$0((Bundle) this.f21550c);
                break;
            case 1:
                NotificationsController.lambda$showExtraNotifications$45((Uri) this.f21549b, (File) this.f21550c);
                break;
            case 2:
                NotificationsController.lambda$loadTopicsNotificationsExceptions$53((Consumer) this.f21549b, (HashSet) this.f21550c);
                break;
            case 3:
                ((NotificationsController) this.f21549b).lambda$didReceivedNotification$38((String) this.f21550c);
                break;
            case 4:
                ((NotificationsController) this.f21549b).lambda$processEditedMessages$22((a0.h) this.f21550c);
                break;
            case 5:
                PasskeysController.lambda$create$2((Utilities.Callback2) this.f21549b, (Throwable) this.f21550c);
                break;
            case 6:
                ((SavedMessagesController) this.f21549b).lambda$deleteCache$13((MessagesStorage) this.f21550c);
                break;
            case 7:
                ((SecretChatHelper) this.f21549b).lambda$performSendEncryptedRequest$6((TLRPC.Message) this.f21550c);
                break;
            case 8:
                ((SendMessagesHelper) this.f21549b).lambda$performSendMessageRequest$90((TLRPC.TL_updateShortSentMessage) this.f21550c);
                break;
            case 9:
                ((SendMessagesHelper) this.f21549b).lambda$sendMessage$16((ArrayList) this.f21550c);
                break;
            case 10:
                ((SendMessagesHelper.ImportingStickers) this.f21549b).lambda$onMediaImport$0((String) this.f21550c);
                break;
            case 11:
                ((TopicsController) this.f21549b).lambda$processUpdate$22((List) this.f21550c);
                break;
            case 12:
                ((TopicsController) this.f21549b).lambda$pinTopic$19((org.telegram.ui.ActionBar.n2) this.f21550c);
                break;
            case 13:
                ((TopicsController) this.f21549b).lambda$onTopicsDeletedServerSide$23((ArrayList) this.f21550c);
                break;
            case 14:
                ((TopicsController) this.f21549b).lambda$updateReadOutbox$26((HashMap) this.f21550c);
                break;
            default:
                ((UserConfig) this.f21549b).lambda$loadGlobalTTl$3((TLObject) this.f21550c);
                break;
        }
    }
}
