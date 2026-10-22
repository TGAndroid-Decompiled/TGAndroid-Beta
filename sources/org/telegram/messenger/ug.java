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
    public final int f19699a;
    public final Object f19700b;
    public final Object f19701c;

    public ug(int i10, Object obj, Object obj2) {
        this.f19699a = i10;
        this.f19700b = obj;
        this.f19701c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19699a) {
            case 0:
                ((NotificationBadge.ZukHomeBadger) this.f19700b).lambda$executeBadge$0((Bundle) this.f19701c);
                return;
            case 1:
                NotificationsController.lambda$loadTopicsNotificationsExceptions$54((Consumer) this.f19700b, (HashSet) this.f19701c);
                return;
            case 2:
                NotificationsController.lambda$showExtraNotifications$46((Uri) this.f19700b, (File) this.f19701c);
                return;
            case 3:
                ((NotificationsController) this.f19700b).lambda$didReceivedNotification$39((String) this.f19701c);
                return;
            case 4:
                ((NotificationsController) this.f19700b).lambda$processEditedMessages$23((a0.h) this.f19701c);
                return;
            case 5:
                PasskeysController.lambda$create$2((Utilities.Callback2) this.f19700b, (Throwable) this.f19701c);
                return;
            case 6:
                ((SavedMessagesController) this.f19700b).lambda$deleteCache$13((MessagesStorage) this.f19701c);
                return;
            case 7:
                ((SecretChatHelper) this.f19700b).lambda$performSendEncryptedRequest$6((TLRPC.Message) this.f19701c);
                return;
            case 8:
                ((SendMessagesHelper) this.f19700b).lambda$performSendMessageRequest$93((TLRPC.TL_updateShortSentMessage) this.f19701c);
                return;
            case 9:
                ((SendMessagesHelper) this.f19700b).lambda$sendMessage$19((ArrayList) this.f19701c);
                return;
            case 10:
                ((SendMessagesHelper.ImportingStickers) this.f19700b).lambda$onMediaImport$0((String) this.f19701c);
                return;
            case 11:
                ((TopicsController) this.f19700b).lambda$processUpdate$22((List) this.f19701c);
                return;
            case 12:
                ((TopicsController) this.f19700b).lambda$pinTopic$19((org.telegram.ui.ActionBar.n2) this.f19701c);
                return;
            case 13:
                ((TopicsController) this.f19700b).lambda$onTopicsDeletedServerSide$23((ArrayList) this.f19701c);
                return;
            case 14:
                ((TopicsController) this.f19700b).lambda$updateReadOutbox$26((HashMap) this.f19701c);
                return;
            default:
                ((UserConfig) this.f19700b).lambda$loadGlobalTTl$3((TLObject) this.f19701c);
                return;
        }
    }
}
