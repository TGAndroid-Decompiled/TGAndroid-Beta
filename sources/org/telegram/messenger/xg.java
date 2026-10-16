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
public final class xg implements Runnable {
    public final int f18728a;
    public final Object f18729b;
    public final Object f18730c;

    public xg(int i10, Object obj, Object obj2) {
        this.f18728a = i10;
        this.f18729b = obj;
        this.f18730c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18728a) {
            case 0:
                ((NotificationBadge.ZukHomeBadger) this.f18729b).lambda$executeBadge$0((Bundle) this.f18730c);
                return;
            case 1:
                NotificationsController.lambda$loadTopicsNotificationsExceptions$54((Consumer) this.f18729b, (HashSet) this.f18730c);
                return;
            case 2:
                NotificationsController.lambda$showExtraNotifications$46((Uri) this.f18729b, (File) this.f18730c);
                return;
            case 3:
                ((NotificationsController) this.f18729b).lambda$didReceivedNotification$39((String) this.f18730c);
                return;
            case 4:
                ((NotificationsController) this.f18729b).lambda$processEditedMessages$23((a0.h) this.f18730c);
                return;
            case 5:
                PasskeysController.lambda$create$2((Utilities.Callback2) this.f18729b, (Throwable) this.f18730c);
                return;
            case 6:
                ((SavedMessagesController) this.f18729b).lambda$deleteCache$13((MessagesStorage) this.f18730c);
                return;
            case 7:
                ((SecretChatHelper) this.f18729b).lambda$performSendEncryptedRequest$6((TLRPC.Message) this.f18730c);
                return;
            case 8:
                ((SendMessagesHelper) this.f18729b).lambda$performSendMessageRequest$93((TLRPC.TL_updateShortSentMessage) this.f18730c);
                return;
            case 9:
                ((SendMessagesHelper) this.f18729b).lambda$sendMessage$19((ArrayList) this.f18730c);
                return;
            case 10:
                ((SendMessagesHelper.ImportingStickers) this.f18729b).lambda$onMediaImport$0((String) this.f18730c);
                return;
            case 11:
                ((TopicsController) this.f18729b).lambda$processUpdate$22((List) this.f18730c);
                return;
            case 12:
                ((TopicsController) this.f18729b).lambda$pinTopic$19((org.telegram.ui.ActionBar.m2) this.f18730c);
                return;
            case 13:
                ((TopicsController) this.f18729b).lambda$onTopicsDeletedServerSide$23((ArrayList) this.f18730c);
                return;
            case 14:
                ((TopicsController) this.f18729b).lambda$updateReadOutbox$26((HashMap) this.f18730c);
                return;
            default:
                ((UserConfig) this.f18729b).lambda$loadGlobalTTl$3((TLObject) this.f18730c);
                return;
        }
    }
}
