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
    public final int f19245a;
    public final Object f19246b;
    public final Object f19247c;

    public vg(int i10, Object obj, Object obj2) {
        this.f19245a = i10;
        this.f19246b = obj;
        this.f19247c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19245a) {
            case 0:
                ((NotificationBadge.ZukHomeBadger) this.f19246b).lambda$executeBadge$0((Bundle) this.f19247c);
                return;
            case 1:
                NotificationsController.lambda$showExtraNotifications$45((Uri) this.f19246b, (File) this.f19247c);
                return;
            case 2:
                NotificationsController.lambda$loadTopicsNotificationsExceptions$53((Consumer) this.f19246b, (HashSet) this.f19247c);
                return;
            case 3:
                ((NotificationsController) this.f19246b).lambda$didReceivedNotification$38((String) this.f19247c);
                return;
            case 4:
                ((NotificationsController) this.f19246b).lambda$processEditedMessages$22((a0.i) this.f19247c);
                return;
            case 5:
                PasskeysController.lambda$create$2((Utilities.Callback2) this.f19246b, (Throwable) this.f19247c);
                return;
            case 6:
                ((SavedMessagesController) this.f19246b).lambda$deleteCache$13((MessagesStorage) this.f19247c);
                return;
            case 7:
                ((SecretChatHelper) this.f19246b).lambda$performSendEncryptedRequest$6((TLRPC.Message) this.f19247c);
                return;
            case 8:
                ((SendMessagesHelper) this.f19246b).lambda$performSendMessageRequest$90((TLRPC.TL_updateShortSentMessage) this.f19247c);
                return;
            case 9:
                ((SendMessagesHelper) this.f19246b).lambda$sendMessage$16((ArrayList) this.f19247c);
                return;
            case 10:
                ((SendMessagesHelper.ImportingStickers) this.f19246b).lambda$onMediaImport$0((String) this.f19247c);
                return;
            case 11:
                ((TopicsController) this.f19246b).lambda$processUpdate$22((List) this.f19247c);
                return;
            case 12:
                ((TopicsController) this.f19246b).lambda$pinTopic$19((org.telegram.ui.ActionBar.n2) this.f19247c);
                return;
            case 13:
                ((TopicsController) this.f19246b).lambda$onTopicsDeletedServerSide$23((ArrayList) this.f19247c);
                return;
            case 14:
                ((TopicsController) this.f19246b).lambda$updateReadOutbox$26((HashMap) this.f19247c);
                return;
            default:
                ((UserConfig) this.f19246b).lambda$loadGlobalTTl$3((TLObject) this.f19247c);
                return;
        }
    }
}
