package org.telegram.messenger;

import android.net.Uri;
import android.os.Bundle;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class eh implements Runnable {
    public final int f15095a;
    public final Object f15096b;
    public final Object f15097c;

    public eh(int i10, Object obj, Object obj2) {
        this.f15095a = i10;
        this.f15096b = obj;
        this.f15097c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f15095a) {
            case 0:
                ((NotificationBadge.ZukHomeBadger) this.f15096b).lambda$executeBadge$0((Bundle) this.f15097c);
                return;
            case 1:
                NotificationsController.lambda$showExtraNotifications$45((Uri) this.f15096b, (File) this.f15097c);
                return;
            case 2:
                NotificationsController.lambda$loadTopicsNotificationsExceptions$53((Consumer) this.f15096b, (HashSet) this.f15097c);
                return;
            case 3:
                ((NotificationsController) this.f15096b).lambda$didReceivedNotification$38((String) this.f15097c);
                return;
            case 4:
                ((NotificationsController) this.f15096b).lambda$processEditedMessages$22((a0.i) this.f15097c);
                return;
            case 5:
                PasskeysController.lambda$create$2((Utilities.Callback2) this.f15096b, (Throwable) this.f15097c);
                return;
            case 6:
                ((SavedMessagesController) this.f15096b).lambda$deleteCache$13((MessagesStorage) this.f15097c);
                return;
            case 7:
                ((SecretChatHelper) this.f15096b).lambda$performSendEncryptedRequest$6((TLRPC.Message) this.f15097c);
                return;
            case 8:
                ((SendMessagesHelper) this.f15096b).lambda$performSendMessageRequest$90((TLRPC.TL_updateShortSentMessage) this.f15097c);
                return;
            case 9:
                ((SendMessagesHelper) this.f15096b).lambda$sendMessage$16((ArrayList) this.f15097c);
                return;
            case 10:
                ((SendMessagesHelper.ImportingStickers) this.f15096b).lambda$onMediaImport$0((String) this.f15097c);
                return;
            case 11:
                ((TopicsController) this.f15096b).lambda$processUpdate$22((List) this.f15097c);
                return;
            case 12:
                ((TopicsController) this.f15096b).lambda$pinTopic$19((org.telegram.ui.ActionBar.p2) this.f15097c);
                return;
            case 13:
                ((TopicsController) this.f15096b).lambda$onTopicsDeletedServerSide$23((ArrayList) this.f15097c);
                return;
            case 14:
                ((TopicsController) this.f15096b).lambda$updateReadOutbox$26((HashMap) this.f15097c);
                return;
            default:
                ((UserConfig) this.f15096b).lambda$loadGlobalTTl$3((TLObject) this.f15097c);
                return;
        }
    }
}
