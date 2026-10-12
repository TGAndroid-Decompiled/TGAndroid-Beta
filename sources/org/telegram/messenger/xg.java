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
public final class xg implements Runnable {
    public final int f19587a;
    public final Object f19588b;
    public final Object f19589c;

    public xg(int i10, Object obj, Object obj2) {
        this.f19587a = i10;
        this.f19588b = obj;
        this.f19589c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19587a) {
            case 0:
                NotificationBadge.NewHtcHomeBadger.lambda$executeBadge$0((Intent) this.f19588b, (Intent) this.f19589c);
                return;
            case 1:
                ((NotificationBadge.ZukHomeBadger) this.f19588b).lambda$executeBadge$0((Bundle) this.f19589c);
                return;
            case 2:
                NotificationsController.lambda$loadTopicsNotificationsExceptions$54((Consumer) this.f19588b, (HashSet) this.f19589c);
                return;
            case 3:
                NotificationsController.lambda$showExtraNotifications$46((Uri) this.f19588b, (File) this.f19589c);
                return;
            case 4:
                ((NotificationsController) this.f19588b).lambda$didReceivedNotification$39((String) this.f19589c);
                return;
            case 5:
                ((NotificationsController) this.f19588b).lambda$processEditedMessages$23((a0.i) this.f19589c);
                return;
            case 6:
                PasskeysController.lambda$create$2((Utilities.Callback2) this.f19588b, (Throwable) this.f19589c);
                return;
            case 7:
                ((SavedMessagesController) this.f19588b).lambda$deleteCache$13((MessagesStorage) this.f19589c);
                return;
            case 8:
                ((SecretChatHelper) this.f19588b).lambda$performSendEncryptedRequest$6((TLRPC.Message) this.f19589c);
                return;
            case 9:
                ((SendMessagesHelper) this.f19588b).lambda$performSendMessageRequest$93((TLRPC.TL_updateShortSentMessage) this.f19589c);
                return;
            case 10:
                ((SendMessagesHelper) this.f19588b).lambda$sendMessage$19((ArrayList) this.f19589c);
                return;
            case 11:
                ((SendMessagesHelper.ImportingStickers) this.f19588b).lambda$onMediaImport$0((String) this.f19589c);
                return;
            case 12:
                ((TopicsController) this.f19588b).lambda$processUpdate$22((List) this.f19589c);
                return;
            case 13:
                ((TopicsController) this.f19588b).lambda$pinTopic$19((org.telegram.ui.ActionBar.m2) this.f19589c);
                return;
            case 14:
                ((TopicsController) this.f19588b).lambda$onTopicsDeletedServerSide$23((ArrayList) this.f19589c);
                return;
            case 15:
                ((TopicsController) this.f19588b).lambda$updateReadOutbox$26((HashMap) this.f19589c);
                return;
            default:
                ((UserConfig) this.f19588b).lambda$loadGlobalTTl$3((TLObject) this.f19589c);
                return;
        }
    }
}
