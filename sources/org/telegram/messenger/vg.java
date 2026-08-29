package org.telegram.messenger;

import android.content.Intent;
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
    public final int f21830a;
    public final Object f21831b;
    public final Object f21832c;

    public vg(int i10, Object obj, Object obj2) {
        this.f21830a = i10;
        this.f21831b = obj;
        this.f21832c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f21830a) {
            case 0:
                NotificationBadge.NewHtcHomeBadger.lambda$executeBadge$0((Intent) this.f21831b, (Intent) this.f21832c);
                return;
            case 1:
                ((NotificationBadge.ZukHomeBadger) this.f21831b).lambda$executeBadge$0((Bundle) this.f21832c);
                return;
            case 2:
                NotificationsController.lambda$showExtraNotifications$45((Uri) this.f21831b, (File) this.f21832c);
                return;
            case 3:
                NotificationsController.lambda$loadTopicsNotificationsExceptions$53((Consumer) this.f21831b, (HashSet) this.f21832c);
                return;
            case 4:
                ((NotificationsController) this.f21831b).lambda$didReceivedNotification$38((String) this.f21832c);
                return;
            case 5:
                ((NotificationsController) this.f21831b).lambda$processEditedMessages$22((a0.h) this.f21832c);
                return;
            case 6:
                PasskeysController.lambda$create$2((Utilities.Callback2) this.f21831b, (Throwable) this.f21832c);
                return;
            case 7:
                ((SavedMessagesController) this.f21831b).lambda$deleteCache$13((MessagesStorage) this.f21832c);
                return;
            case 8:
                ((SecretChatHelper) this.f21831b).lambda$performSendEncryptedRequest$6((TLRPC.Message) this.f21832c);
                return;
            case 9:
                ((SendMessagesHelper) this.f21831b).lambda$performSendMessageRequest$90((TLRPC.TL_updateShortSentMessage) this.f21832c);
                return;
            case 10:
                ((SendMessagesHelper) this.f21831b).lambda$sendMessage$16((ArrayList) this.f21832c);
                return;
            case 11:
                ((SendMessagesHelper.ImportingStickers) this.f21831b).lambda$onMediaImport$0((String) this.f21832c);
                return;
            case 12:
                ((TopicsController) this.f21831b).lambda$processUpdate$22((List) this.f21832c);
                return;
            case 13:
                ((TopicsController) this.f21831b).lambda$pinTopic$19((org.telegram.ui.ActionBar.o2) this.f21832c);
                return;
            case 14:
                ((TopicsController) this.f21831b).lambda$onTopicsDeletedServerSide$23((ArrayList) this.f21832c);
                return;
            case 15:
                ((TopicsController) this.f21831b).lambda$updateReadOutbox$26((HashMap) this.f21832c);
                return;
            case 16:
                ((UserConfig) this.f21831b).lambda$loadGlobalTTl$3((TLObject) this.f21832c);
                return;
            default:
                ((WebProxyTransport) this.f21831b).lambda$onWebMessage$3((byte[]) this.f21832c);
                return;
        }
    }
}
