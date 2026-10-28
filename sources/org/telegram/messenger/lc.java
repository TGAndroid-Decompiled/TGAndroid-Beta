package org.telegram.messenger;

import android.content.Intent;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class lc implements Runnable {
    public final int f20600a;
    public final Object f20601b;
    public final Object f20602c;

    public lc(int i10, Object obj, Object obj2) {
        this.f20600a = i10;
        this.f20601b = obj;
        this.f20602c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f20600a) {
            case 0:
                ((MessagesController) this.f20601b).lambda$processUpdateArray$398((TLRPC.Message) this.f20602c);
                return;
            case 1:
                ((MessagesController) this.f20601b).lambda$processUpdateArray$400((TL_update.TL_updateLangPack) this.f20602c);
                return;
            case 2:
                ((MessagesController) this.f20601b).lambda$processUpdateArray$389((TL_update.TL_updateGroupCallMessage) this.f20602c);
                return;
            case 3:
                ((MessagesController) this.f20601b).lambda$processUpdateArray$390((TL_update.TL_updateDeleteGroupCallMessages) this.f20602c);
                return;
            case 4:
                ((MessagesController) this.f20601b).lambda$processUpdateArray$391((TL_update.TL_updateUserTyping) this.f20602c);
                return;
            case 5:
                ((MessagesController) this.f20601b).lambda$processUpdateArray$392((TL_update.TL_updateChatUserTyping) this.f20602c);
                return;
            case 6:
                MessagesController.lambda$toggleChatNoForwards$276((Utilities.Callback2) this.f20601b, (TLRPC.TL_error) this.f20602c);
                return;
            case 7:
                ((MessagesController) this.f20601b).lambda$getChannelDifference$339((TLRPC.updates_ChannelDifference) this.f20602c);
                return;
            case 8:
                ((MessagesController) this.f20601b).lambda$checkChatInviter$372((TLRPC.TL_channels_channelParticipant) this.f20602c);
                return;
            case 9:
                ((MessagesController) this.f20601b).lambda$getSendAsPeers$447((TLRPC.TL_channels_sendAsPeers) this.f20602c);
                return;
            case 10:
                ((MessagesController) this.f20601b).lambda$getDifference$352((TLRPC.updates_Difference) this.f20602c);
                return;
            case 11:
                MessagesController.lambda$addUserToChat$298((Utilities.Callback) this.f20601b, (Runnable) this.f20602c);
                return;
            case 12:
                ((MessagesController) this.f20601b).lambda$addToViewsQueue$229((MessageObject) this.f20602c);
                return;
            case 13:
                ((MessagesController) this.f20601b).lambda$loadAppConfig$31((TLRPC.TL_help_appConfig) this.f20602c);
                return;
            case 14:
                ((MessagesController) this.f20601b).lambda$changeChatAvatar$319((Runnable) this.f20602c);
                return;
            case 15:
                ((MessagesController) this.f20601b).lambda$updateConfig$40((TLRPC.TL_config) this.f20602c);
                return;
            case 16:
                MessagesController.lambda$addUsersToChat$293((q0.a) this.f20601b, (TLRPC.User) this.f20602c);
                return;
            case 17:
                ((MessagesController) this.f20601b).lambda$getSponsoredMessages$444((TLRPC.messages_SponsoredMessages) this.f20602c);
                return;
            case 18:
                ((MessagesController.SavedMusicIds) this.f20601b).lambda$load$0((TLObject) this.f20602c);
                return;
            case 19:
                ((MessagesStorage) this.f20601b).lambda$putGiftChatThemes$269((List) this.f20602c);
                return;
            case 20:
                ((MessagesStorage) this.f20601b).lambda$putPushMessage$42((MessageObject) this.f20602c);
                return;
            case 21:
                MessagesStorage.lambda$getMessages$165((Timer.Task) this.f20601b, (Runnable) this.f20602c);
                return;
            case 22:
                ((MessagesStorage) this.f20601b).lambda$updateChatParticipants$126((TLRPC.ChatParticipants) this.f20602c);
                return;
            case 23:
                ((MessagesStorage) this.f20601b).lambda$deleteDialogFilter$75((MessagesController.DialogFilter) this.f20602c);
                return;
            case 24:
                ((MessagesStorage) this.f20601b).lambda$loadGiftChatTheme$272((Utilities.Callback) this.f20602c);
                return;
            case 25:
                ((MessagesStorage) this.f20601b).lambda$putStoryPushMessage$38((NotificationsController.StoryNotification) this.f20602c);
                return;
            case 26:
                ((MessagesStorage) this.f20601b).lambda$updateMessageStateAndIdInternal$216((TLRPC.TL_updates) this.f20602c);
                return;
            case 27:
                ((MessagesStorage) this.f20601b).lambda$updateDialogData$245((TLRPC.Dialog) this.f20602c);
                return;
            case 28:
                ((MessagesStorage) this.f20601b).lambda$updateTopicsWithReadMessages$62((HashMap) this.f20602c);
                return;
            default:
                NotificationBadge.NewHtcHomeBadger.lambda$executeBadge$0((Intent) this.f20601b, (Intent) this.f20602c);
                return;
        }
    }
}
