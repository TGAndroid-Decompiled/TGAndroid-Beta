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
public final class og implements Runnable {
    public final int f21151a;
    public final Object f21152b;
    public final Object f21153c;

    public og(int i9, Object obj, Object obj2) {
        this.f21151a = i9;
        this.f21152b = obj;
        this.f21153c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f21151a) {
            case 0:
                ((NotificationBadge.ZukHomeBadger) this.f21152b).lambda$executeBadge$0((Bundle) this.f21153c);
                return;
            case 1:
                NotificationsController.lambda$showExtraNotifications$45((Uri) this.f21152b, (File) this.f21153c);
                return;
            case 2:
                NotificationsController.lambda$loadTopicsNotificationsExceptions$53((Consumer) this.f21152b, (HashSet) this.f21153c);
                return;
            case 3:
                ((NotificationsController) this.f21152b).lambda$didReceivedNotification$38((String) this.f21153c);
                return;
            case 4:
                ((NotificationsController) this.f21152b).lambda$processEditedMessages$22((a0.h) this.f21153c);
                return;
            case 5:
                PasskeysController.lambda$create$2((Utilities.Callback2) this.f21152b, (Throwable) this.f21153c);
                return;
            case 6:
                ((SavedMessagesController) this.f21152b).lambda$deleteCache$13((MessagesStorage) this.f21153c);
                return;
            case 7:
                ((SecretChatHelper) this.f21152b).lambda$performSendEncryptedRequest$6((TLRPC.Message) this.f21153c);
                return;
            case 8:
                ((SendMessagesHelper) this.f21152b).lambda$performSendMessageRequest$90((TLRPC.TL_updateShortSentMessage) this.f21153c);
                return;
            case 9:
                ((SendMessagesHelper) this.f21152b).lambda$sendMessage$16((ArrayList) this.f21153c);
                return;
            case 10:
                ((SendMessagesHelper.ImportingStickers) this.f21152b).lambda$onMediaImport$0((String) this.f21153c);
                return;
            case 11:
                ((TopicsController) this.f21152b).lambda$processUpdate$22((List) this.f21153c);
                return;
            case 12:
                ((TopicsController) this.f21152b).lambda$pinTopic$19((org.telegram.ui.ActionBar.o2) this.f21153c);
                return;
            case 13:
                ((TopicsController) this.f21152b).lambda$onTopicsDeletedServerSide$23((ArrayList) this.f21153c);
                return;
            case 14:
                ((TopicsController) this.f21152b).lambda$updateReadOutbox$26((HashMap) this.f21153c);
                return;
            default:
                ((UserConfig) this.f21152b).lambda$loadGlobalTTl$3((TLObject) this.f21153c);
                return;
        }
    }
}
