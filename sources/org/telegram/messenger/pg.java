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
public final class pg implements Runnable {
    public final int f19287a;
    public final Object f19288b;
    public final Object f19289c;

    public pg(int i10, Object obj, Object obj2) {
        this.f19287a = i10;
        this.f19288b = obj;
        this.f19289c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19287a) {
            case 0:
                ((NotificationBadge.ZukHomeBadger) this.f19288b).lambda$executeBadge$0((Bundle) this.f19289c);
                return;
            case 1:
                NotificationsController.lambda$loadTopicsNotificationsExceptions$54((Consumer) this.f19288b, (HashSet) this.f19289c);
                return;
            case 2:
                NotificationsController.lambda$showExtraNotifications$46((Uri) this.f19288b, (File) this.f19289c);
                return;
            case 3:
                ((NotificationsController) this.f19288b).lambda$didReceivedNotification$39((String) this.f19289c);
                return;
            case 4:
                ((NotificationsController) this.f19288b).lambda$processEditedMessages$23((a0.h) this.f19289c);
                return;
            case 5:
                PasskeysController.lambda$create$2((Utilities.Callback2) this.f19288b, (Throwable) this.f19289c);
                return;
            case 6:
                ((SavedMessagesController) this.f19288b).lambda$deleteCache$13((MessagesStorage) this.f19289c);
                return;
            case 7:
                ((SecretChatHelper) this.f19288b).lambda$performSendEncryptedRequest$6((TLRPC.Message) this.f19289c);
                return;
            case 8:
                ((SendMessagesHelper) this.f19288b).lambda$performSendMessageRequest$93((TLRPC.TL_updateShortSentMessage) this.f19289c);
                return;
            case 9:
                ((SendMessagesHelper) this.f19288b).lambda$sendMessage$19((ArrayList) this.f19289c);
                return;
            case 10:
                ((SendMessagesHelper.ImportingStickers) this.f19288b).lambda$onMediaImport$0((String) this.f19289c);
                return;
            case 11:
                ((TopicsController) this.f19288b).lambda$processUpdate$22((List) this.f19289c);
                return;
            case 12:
                ((TopicsController) this.f19288b).lambda$pinTopic$19((org.telegram.ui.ActionBar.n2) this.f19289c);
                return;
            case 13:
                ((TopicsController) this.f19288b).lambda$onTopicsDeletedServerSide$23((ArrayList) this.f19289c);
                return;
            case 14:
                ((TopicsController) this.f19288b).lambda$updateReadOutbox$26((HashMap) this.f19289c);
                return;
            default:
                ((UserConfig) this.f19288b).lambda$loadGlobalTTl$3((TLObject) this.f19289c);
                return;
        }
    }
}
