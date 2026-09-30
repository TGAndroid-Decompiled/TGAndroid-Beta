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
    public final int f17799a;
    public final Object f17800b;
    public final Object f17801c;

    public vg(int i10, Object obj, Object obj2) {
        this.f17799a = i10;
        this.f17800b = obj;
        this.f17801c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17799a) {
            case 0:
                ((NotificationBadge.ZukHomeBadger) this.f17800b).lambda$executeBadge$0((Bundle) this.f17801c);
                return;
            case 1:
                NotificationsController.lambda$showExtraNotifications$45((Uri) this.f17800b, (File) this.f17801c);
                return;
            case 2:
                NotificationsController.lambda$loadTopicsNotificationsExceptions$53((Consumer) this.f17800b, (HashSet) this.f17801c);
                return;
            case 3:
                ((NotificationsController) this.f17800b).lambda$didReceivedNotification$38((String) this.f17801c);
                return;
            case 4:
                ((NotificationsController) this.f17800b).lambda$processEditedMessages$22((a0.i) this.f17801c);
                return;
            case 5:
                PasskeysController.lambda$create$2((Utilities.Callback2) this.f17800b, (Throwable) this.f17801c);
                return;
            case 6:
                ((SavedMessagesController) this.f17800b).lambda$deleteCache$13((MessagesStorage) this.f17801c);
                return;
            case 7:
                ((SecretChatHelper) this.f17800b).lambda$performSendEncryptedRequest$6((TLRPC.Message) this.f17801c);
                return;
            case 8:
                ((SendMessagesHelper) this.f17800b).lambda$performSendMessageRequest$90((TLRPC.TL_updateShortSentMessage) this.f17801c);
                return;
            case 9:
                ((SendMessagesHelper) this.f17800b).lambda$sendMessage$16((ArrayList) this.f17801c);
                return;
            case 10:
                ((SendMessagesHelper.ImportingStickers) this.f17800b).lambda$onMediaImport$0((String) this.f17801c);
                return;
            case 11:
                ((TopicsController) this.f17800b).lambda$processUpdate$22((List) this.f17801c);
                return;
            case 12:
                ((TopicsController) this.f17800b).lambda$pinTopic$19((org.telegram.ui.ActionBar.m2) this.f17801c);
                return;
            case 13:
                ((TopicsController) this.f17800b).lambda$onTopicsDeletedServerSide$23((ArrayList) this.f17801c);
                return;
            case 14:
                ((TopicsController) this.f17800b).lambda$updateReadOutbox$26((HashMap) this.f17801c);
                return;
            default:
                ((UserConfig) this.f17800b).lambda$loadGlobalTTl$3((TLObject) this.f17801c);
                return;
        }
    }
}
