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
public final class wg implements Runnable {
    public final int f17794a;
    public final Object f17795b;
    public final Object f17796c;

    public wg(int i10, Object obj, Object obj2) {
        this.f17794a = i10;
        this.f17795b = obj;
        this.f17796c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17794a) {
            case 0:
                ((NotificationBadge.ZukHomeBadger) this.f17795b).lambda$executeBadge$0((Bundle) this.f17796c);
                return;
            case 1:
                NotificationsController.lambda$showExtraNotifications$45((Uri) this.f17795b, (File) this.f17796c);
                return;
            case 2:
                NotificationsController.lambda$loadTopicsNotificationsExceptions$53((Consumer) this.f17795b, (HashSet) this.f17796c);
                return;
            case 3:
                ((NotificationsController) this.f17795b).lambda$didReceivedNotification$38((String) this.f17796c);
                return;
            case 4:
                ((NotificationsController) this.f17795b).lambda$processEditedMessages$22((a0.i) this.f17796c);
                return;
            case 5:
                PasskeysController.lambda$create$2((Utilities.Callback2) this.f17795b, (Throwable) this.f17796c);
                return;
            case 6:
                ((SavedMessagesController) this.f17795b).lambda$deleteCache$13((MessagesStorage) this.f17796c);
                return;
            case 7:
                ((SecretChatHelper) this.f17795b).lambda$performSendEncryptedRequest$6((TLRPC.Message) this.f17796c);
                return;
            case 8:
                ((SendMessagesHelper) this.f17795b).lambda$performSendMessageRequest$90((TLRPC.TL_updateShortSentMessage) this.f17796c);
                return;
            case 9:
                ((SendMessagesHelper) this.f17795b).lambda$sendMessage$16((ArrayList) this.f17796c);
                return;
            case 10:
                ((SendMessagesHelper.ImportingStickers) this.f17795b).lambda$onMediaImport$0((String) this.f17796c);
                return;
            case 11:
                ((TopicsController) this.f17795b).lambda$processUpdate$22((List) this.f17796c);
                return;
            case 12:
                ((TopicsController) this.f17795b).lambda$pinTopic$19((org.telegram.ui.ActionBar.o2) this.f17796c);
                return;
            case 13:
                ((TopicsController) this.f17795b).lambda$onTopicsDeletedServerSide$23((ArrayList) this.f17796c);
                return;
            case 14:
                ((TopicsController) this.f17795b).lambda$updateReadOutbox$26((HashMap) this.f17796c);
                return;
            default:
                ((UserConfig) this.f17795b).lambda$loadGlobalTTl$3((TLObject) this.f17796c);
                return;
        }
    }
}
