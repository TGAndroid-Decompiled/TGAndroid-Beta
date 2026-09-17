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
public final class vg implements Runnable {
    public final int f19272a;
    public final Object f19273b;
    public final Object f19274c;

    public vg(int i10, Object obj, Object obj2) {
        this.f19272a = i10;
        this.f19273b = obj;
        this.f19274c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19272a) {
            case 0:
                ((NotificationBadge.ZukHomeBadger) this.f19273b).lambda$executeBadge$0((Bundle) this.f19274c);
                return;
            case 1:
                NotificationsController.lambda$showExtraNotifications$45((Uri) this.f19273b, (File) this.f19274c);
                return;
            case 2:
                NotificationsController.lambda$loadTopicsNotificationsExceptions$53((Consumer) this.f19273b, (HashSet) this.f19274c);
                return;
            case 3:
                ((NotificationsController) this.f19273b).lambda$didReceivedNotification$38((String) this.f19274c);
                return;
            case 4:
                ((NotificationsController) this.f19273b).lambda$processEditedMessages$22((a0.i) this.f19274c);
                return;
            case 5:
                PasskeysController.lambda$create$2((Utilities.Callback2) this.f19273b, (Throwable) this.f19274c);
                return;
            case 6:
                ((SavedMessagesController) this.f19273b).lambda$deleteCache$13((MessagesStorage) this.f19274c);
                return;
            case 7:
                ((SecretChatHelper) this.f19273b).lambda$performSendEncryptedRequest$6((TLRPC.Message) this.f19274c);
                return;
            case 8:
                ((SendMessagesHelper) this.f19273b).lambda$performSendMessageRequest$90((TLRPC.TL_updateShortSentMessage) this.f19274c);
                return;
            case 9:
                ((SendMessagesHelper) this.f19273b).lambda$sendMessage$16((ArrayList) this.f19274c);
                return;
            case 10:
                ((SendMessagesHelper.ImportingStickers) this.f19273b).lambda$onMediaImport$0((String) this.f19274c);
                return;
            case 11:
                ((TopicsController) this.f19273b).lambda$processUpdate$22((List) this.f19274c);
                return;
            case 12:
                ((TopicsController) this.f19273b).lambda$pinTopic$19((org.telegram.ui.ActionBar.n2) this.f19274c);
                return;
            case 13:
                ((TopicsController) this.f19273b).lambda$onTopicsDeletedServerSide$23((ArrayList) this.f19274c);
                return;
            case 14:
                ((TopicsController) this.f19273b).lambda$updateReadOutbox$26((HashMap) this.f19274c);
                return;
            default:
                ((UserConfig) this.f19273b).lambda$loadGlobalTTl$3((TLObject) this.f19274c);
                return;
        }
    }
}
