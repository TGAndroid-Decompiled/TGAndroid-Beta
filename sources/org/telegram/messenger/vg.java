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
    public final int f19441a;
    public final Object f19442b;
    public final Object f19443c;

    public vg(int i10, Object obj, Object obj2) {
        this.f19441a = i10;
        this.f19442b = obj;
        this.f19443c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19441a) {
            case 0:
                NotificationBadge.NewHtcHomeBadger.lambda$executeBadge$0((Intent) this.f19442b, (Intent) this.f19443c);
                return;
            case 1:
                ((NotificationBadge.ZukHomeBadger) this.f19442b).lambda$executeBadge$0((Bundle) this.f19443c);
                return;
            case 2:
                NotificationsController.lambda$loadTopicsNotificationsExceptions$54((Consumer) this.f19442b, (HashSet) this.f19443c);
                return;
            case 3:
                NotificationsController.lambda$showExtraNotifications$46((Uri) this.f19442b, (File) this.f19443c);
                return;
            case 4:
                ((NotificationsController) this.f19442b).lambda$didReceivedNotification$39((String) this.f19443c);
                return;
            case 5:
                ((NotificationsController) this.f19442b).lambda$processEditedMessages$23((a0.i) this.f19443c);
                return;
            case 6:
                PasskeysController.lambda$create$2((Utilities.Callback2) this.f19442b, (Throwable) this.f19443c);
                return;
            case 7:
                ((SavedMessagesController) this.f19442b).lambda$deleteCache$13((MessagesStorage) this.f19443c);
                return;
            case 8:
                ((SecretChatHelper) this.f19442b).lambda$performSendEncryptedRequest$6((TLRPC.Message) this.f19443c);
                return;
            case 9:
                ((SendMessagesHelper) this.f19442b).lambda$performSendMessageRequest$93((TLRPC.TL_updateShortSentMessage) this.f19443c);
                return;
            case 10:
                ((SendMessagesHelper) this.f19442b).lambda$sendMessage$19((ArrayList) this.f19443c);
                return;
            case 11:
                ((SendMessagesHelper.ImportingStickers) this.f19442b).lambda$onMediaImport$0((String) this.f19443c);
                return;
            case 12:
                ((TopicsController) this.f19442b).lambda$processUpdate$22((List) this.f19443c);
                return;
            case 13:
                ((TopicsController) this.f19442b).lambda$pinTopic$19((org.telegram.ui.ActionBar.n2) this.f19443c);
                return;
            case 14:
                ((TopicsController) this.f19442b).lambda$onTopicsDeletedServerSide$23((ArrayList) this.f19443c);
                return;
            case 15:
                ((TopicsController) this.f19442b).lambda$updateReadOutbox$26((HashMap) this.f19443c);
                return;
            default:
                ((UserConfig) this.f19442b).lambda$loadGlobalTTl$3((TLObject) this.f19443c);
                return;
        }
    }
}
