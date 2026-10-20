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
public final class rg implements Runnable {
    public final int f19460a;
    public final Object f19461b;
    public final Object f19462c;

    public rg(int i10, Object obj, Object obj2) {
        this.f19460a = i10;
        this.f19461b = obj;
        this.f19462c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19460a) {
            case 0:
                ((NotificationBadge.ZukHomeBadger) this.f19461b).lambda$executeBadge$0((Bundle) this.f19462c);
                return;
            case 1:
                NotificationsController.lambda$loadTopicsNotificationsExceptions$54((Consumer) this.f19461b, (HashSet) this.f19462c);
                return;
            case 2:
                NotificationsController.lambda$showExtraNotifications$46((Uri) this.f19461b, (File) this.f19462c);
                return;
            case 3:
                ((NotificationsController) this.f19461b).lambda$didReceivedNotification$39((String) this.f19462c);
                return;
            case 4:
                ((NotificationsController) this.f19461b).lambda$processEditedMessages$23((a0.h) this.f19462c);
                return;
            case 5:
                PasskeysController.lambda$create$2((Utilities.Callback2) this.f19461b, (Throwable) this.f19462c);
                return;
            case 6:
                ((SavedMessagesController) this.f19461b).lambda$deleteCache$13((MessagesStorage) this.f19462c);
                return;
            case 7:
                ((SecretChatHelper) this.f19461b).lambda$performSendEncryptedRequest$6((TLRPC.Message) this.f19462c);
                return;
            case 8:
                ((SendMessagesHelper) this.f19461b).lambda$performSendMessageRequest$93((TLRPC.TL_updateShortSentMessage) this.f19462c);
                return;
            case 9:
                ((SendMessagesHelper) this.f19461b).lambda$sendMessage$19((ArrayList) this.f19462c);
                return;
            case 10:
                ((SendMessagesHelper.ImportingStickers) this.f19461b).lambda$onMediaImport$0((String) this.f19462c);
                return;
            case 11:
                ((TopicsController) this.f19461b).lambda$processUpdate$22((List) this.f19462c);
                return;
            case 12:
                ((TopicsController) this.f19461b).lambda$pinTopic$19((org.telegram.ui.ActionBar.n2) this.f19462c);
                return;
            case 13:
                ((TopicsController) this.f19461b).lambda$onTopicsDeletedServerSide$23((ArrayList) this.f19462c);
                return;
            case 14:
                ((TopicsController) this.f19461b).lambda$updateReadOutbox$26((HashMap) this.f19462c);
                return;
            default:
                ((UserConfig) this.f19461b).lambda$loadGlobalTTl$3((TLObject) this.f19462c);
                return;
        }
    }
}
