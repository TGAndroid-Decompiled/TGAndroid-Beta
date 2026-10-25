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
public final class nc implements Runnable {
    public final int f20768a;
    public final Object f20769b;
    public final Object f20770c;

    public nc(int i10, Object obj, Object obj2) {
        this.f20768a = i10;
        this.f20769b = obj;
        this.f20770c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f20768a) {
            case 0:
                ((MessagesController) this.f20769b).lambda$processUpdateArray$398((TLRPC.Message) this.f20770c);
                return;
            case 1:
                ((MessagesController) this.f20769b).lambda$processUpdateArray$399((TL_update.TL_updateLangPack) this.f20770c);
                return;
            case 2:
                ((MessagesController) this.f20769b).lambda$processUpdateArray$389((TL_update.TL_updateGroupCallMessage) this.f20770c);
                return;
            case 3:
                ((MessagesController) this.f20769b).lambda$processUpdateArray$390((TL_update.TL_updateDeleteGroupCallMessages) this.f20770c);
                return;
            case 4:
                ((MessagesController) this.f20769b).lambda$processUpdateArray$391((TL_update.TL_updateUserTyping) this.f20770c);
                return;
            case 5:
                ((MessagesController) this.f20769b).lambda$processUpdateArray$392((TL_update.TL_updateChatUserTyping) this.f20770c);
                return;
            case 6:
                MessagesController.lambda$toggleChatNoForwards$276((Utilities.Callback2) this.f20769b, (TLRPC.TL_error) this.f20770c);
                return;
            case 7:
                ((MessagesController) this.f20769b).lambda$getChannelDifference$339((TLRPC.updates_ChannelDifference) this.f20770c);
                return;
            case 8:
                ((MessagesController) this.f20769b).lambda$checkChatInviter$372((TLRPC.TL_channels_channelParticipant) this.f20770c);
                return;
            case 9:
                ((MessagesController) this.f20769b).lambda$requestContactToken$480((Utilities.Callback) this.f20770c);
                return;
            case 10:
                ((MessagesController) this.f20769b).lambda$getDifference$352((TLRPC.updates_Difference) this.f20770c);
                return;
            case 11:
                MessagesController.lambda$addUserToChat$298((Utilities.Callback) this.f20769b, (Runnable) this.f20770c);
                return;
            case 12:
                ((MessagesController) this.f20769b).lambda$addToViewsQueue$229((MessageObject) this.f20770c);
                return;
            case 13:
                ((MessagesController) this.f20769b).lambda$processUpdateArray$417((TL_update.TL_updateChannel) this.f20770c);
                return;
            case 14:
                ((MessagesController) this.f20769b).lambda$loadAppConfig$31((TLRPC.TL_help_appConfig) this.f20770c);
                return;
            case 15:
                ((MessagesController) this.f20769b).lambda$changeChatAvatar$319((Runnable) this.f20770c);
                return;
            case 16:
                MessagesController.lambda$addUsersToChat$293((q0.a) this.f20769b, (TLRPC.User) this.f20770c);
                return;
            case 17:
                ((MessagesController) this.f20769b).lambda$updateConfig$40((TLRPC.TL_config) this.f20770c);
                return;
            case 18:
                ((MessagesController.SavedMusicIds) this.f20769b).lambda$load$0((TLObject) this.f20770c);
                return;
            case 19:
                ((MessagesStorage) this.f20769b).lambda$putGiftChatThemes$268((List) this.f20770c);
                return;
            case 20:
                ((MessagesStorage) this.f20769b).lambda$putPushMessage$42((MessageObject) this.f20770c);
                return;
            case 21:
                MessagesStorage.lambda$getMessages$164((Timer.Task) this.f20769b, (Runnable) this.f20770c);
                return;
            case 22:
                ((MessagesStorage) this.f20769b).lambda$updateChatParticipants$125((TLRPC.ChatParticipants) this.f20770c);
                return;
            case 23:
                ((MessagesStorage) this.f20769b).lambda$deleteDialogFilter$75((MessagesController.DialogFilter) this.f20770c);
                return;
            case 24:
                ((MessagesStorage) this.f20769b).lambda$loadGiftChatTheme$271((Utilities.Callback) this.f20770c);
                return;
            case 25:
                ((MessagesStorage) this.f20769b).lambda$putStoryPushMessage$38((NotificationsController.StoryNotification) this.f20770c);
                return;
            case 26:
                ((MessagesStorage) this.f20769b).lambda$updateMessageStateAndIdInternal$215((TLRPC.TL_updates) this.f20770c);
                return;
            case 27:
                ((MessagesStorage) this.f20769b).lambda$updateDialogData$244((TLRPC.Dialog) this.f20770c);
                return;
            case 28:
                ((MessagesStorage) this.f20769b).lambda$updateTopicsWithReadMessages$62((HashMap) this.f20770c);
                return;
            default:
                NotificationBadge.NewHtcHomeBadger.lambda$executeBadge$0((Intent) this.f20769b, (Intent) this.f20770c);
                return;
        }
    }
}
