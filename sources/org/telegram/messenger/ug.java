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
public final class ug implements Runnable {
    public final int f19764a;
    public final Object f19765b;
    public final Object f19766c;

    public ug(int i10, Object obj, Object obj2) {
        this.f19764a = i10;
        this.f19765b = obj;
        this.f19766c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19764a) {
            case 0:
                ((NotificationBadge.ZukHomeBadger) this.f19765b).lambda$executeBadge$0((Bundle) this.f19766c);
                return;
            case 1:
                NotificationsController.lambda$loadTopicsNotificationsExceptions$54((Consumer) this.f19765b, (HashSet) this.f19766c);
                return;
            case 2:
                NotificationsController.lambda$showExtraNotifications$46((Uri) this.f19765b, (File) this.f19766c);
                return;
            case 3:
                ((NotificationsController) this.f19765b).lambda$didReceivedNotification$39((String) this.f19766c);
                return;
            case 4:
                ((NotificationsController) this.f19765b).lambda$processEditedMessages$23((a0.h) this.f19766c);
                return;
            case 5:
                PasskeysController.lambda$create$2((Utilities.Callback2) this.f19765b, (Throwable) this.f19766c);
                return;
            case 6:
                ((SavedMessagesController) this.f19765b).lambda$deleteCache$13((MessagesStorage) this.f19766c);
                return;
            case 7:
                ((SecretChatHelper) this.f19765b).lambda$performSendEncryptedRequest$6((TLRPC.Message) this.f19766c);
                return;
            case 8:
                ((SendMessagesHelper) this.f19765b).lambda$performSendMessageRequest$93((TLRPC.TL_updateShortSentMessage) this.f19766c);
                return;
            case 9:
                ((SendMessagesHelper) this.f19765b).lambda$sendMessage$19((ArrayList) this.f19766c);
                return;
            case 10:
                ((SendMessagesHelper.ImportingStickers) this.f19765b).lambda$onMediaImport$0((String) this.f19766c);
                return;
            case 11:
                ((TopicsController) this.f19765b).lambda$processUpdate$22((List) this.f19766c);
                return;
            case 12:
                ((TopicsController) this.f19765b).lambda$pinTopic$19((org.telegram.ui.ActionBar.o2) this.f19766c);
                return;
            case 13:
                ((TopicsController) this.f19765b).lambda$onTopicsDeletedServerSide$23((ArrayList) this.f19766c);
                return;
            case 14:
                ((TopicsController) this.f19765b).lambda$updateReadOutbox$26((HashMap) this.f19766c);
                return;
            default:
                ((UserConfig) this.f19765b).lambda$loadGlobalTTl$3((TLObject) this.f19766c);
                return;
        }
    }
}
