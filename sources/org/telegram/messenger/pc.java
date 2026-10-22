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
public final class pc implements Runnable {
    public final int f19197a;
    public final Object f19198b;
    public final Object f19199c;

    public pc(int i10, Object obj, Object obj2) {
        this.f19197a = i10;
        this.f19198b = obj;
        this.f19199c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19197a) {
            case 0:
                ((MessagesController) this.f19198b).lambda$processUpdateArray$396((TLRPC.Message) this.f19199c);
                return;
            case 1:
                ((MessagesController) this.f19198b).lambda$processUpdateArray$397((TL_update.TL_updateLangPack) this.f19199c);
                return;
            case 2:
                ((MessagesController) this.f19198b).lambda$changeChatAvatar$317((Runnable) this.f19199c);
                return;
            case 3:
                ((MessagesController) this.f19198b).lambda$processUpdateArray$387((TL_update.TL_updateGroupCallMessage) this.f19199c);
                return;
            case 4:
                ((MessagesController) this.f19198b).lambda$processUpdateArray$388((TL_update.TL_updateDeleteGroupCallMessages) this.f19199c);
                return;
            case 5:
                ((MessagesController) this.f19198b).lambda$processUpdateArray$389((TL_update.TL_updateUserTyping) this.f19199c);
                return;
            case 6:
                ((MessagesController) this.f19198b).lambda$processUpdateArray$390((TL_update.TL_updateChatUserTyping) this.f19199c);
                return;
            case 7:
                MessagesController.lambda$toggleChatNoForwards$276((Utilities.Callback2) this.f19198b, (TLRPC.TL_error) this.f19199c);
                return;
            case 8:
                MessagesController.lambda$setCustomChatReactions$471((Utilities.Callback) this.f19198b, (TLRPC.TL_error) this.f19199c);
                return;
            case 9:
                ((MessagesController) this.f19198b).lambda$getSponsoredMessages$441((TLRPC.messages_SponsoredMessages) this.f19199c);
                return;
            case 10:
                ((MessagesController) this.f19198b).lambda$requestContactToken$478((Utilities.Callback) this.f19199c);
                return;
            case 11:
                ((MessagesController) this.f19198b).lambda$addToViewsQueue$229((MessageObject) this.f19199c);
                return;
            case 12:
                ((MessagesController) this.f19198b).lambda$loadAppConfig$31((TLRPC.TL_help_appConfig) this.f19199c);
                return;
            case 13:
                ((MessagesController) this.f19198b).lambda$getSendAsPeers$444((TLRPC.TL_channels_sendAsPeers) this.f19199c);
                return;
            case 14:
                ((MessagesController) this.f19198b).lambda$getDifference$350((TLRPC.updates_Difference) this.f19199c);
                return;
            case 15:
                MessagesController.lambda$addUsersToChat$293((q0.a) this.f19198b, (TLRPC.User) this.f19199c);
                return;
            case 16:
                ((MessagesController) this.f19198b).lambda$updateConfig$40((TLRPC.TL_config) this.f19199c);
                return;
            case 17:
                ((MessagesController) this.f19198b).lambda$getChannelDifference$337((TLRPC.updates_ChannelDifference) this.f19199c);
                return;
            case 18:
                ((MessagesController.SavedMusicIds) this.f19198b).lambda$load$0((TLObject) this.f19199c);
                return;
            case 19:
                ((MessagesStorage) this.f19198b).lambda$updateTopicsWithReadMessages$59((HashMap) this.f19199c);
                return;
            case 20:
                ((MessagesStorage) this.f19198b).lambda$putGiftChatThemes$265((List) this.f19199c);
                return;
            case 21:
                ((MessagesStorage) this.f19198b).lambda$putPushMessage$42((MessageObject) this.f19199c);
                return;
            case 22:
                MessagesStorage.lambda$getMessages$161((Timer.Task) this.f19198b, (Runnable) this.f19199c);
                return;
            case 23:
                ((MessagesStorage) this.f19198b).lambda$updateChatParticipants$122((TLRPC.ChatParticipants) this.f19199c);
                return;
            case 24:
                ((MessagesStorage) this.f19198b).lambda$deleteDialogFilter$72((MessagesController.DialogFilter) this.f19199c);
                return;
            case 25:
                ((MessagesStorage) this.f19198b).lambda$loadGiftChatTheme$268((Utilities.Callback) this.f19199c);
                return;
            case 26:
                ((MessagesStorage) this.f19198b).lambda$putStoryPushMessage$38((NotificationsController.StoryNotification) this.f19199c);
                return;
            case 27:
                ((MessagesStorage) this.f19198b).lambda$updateMessageStateAndIdInternal$212((TLRPC.TL_updates) this.f19199c);
                return;
            case 28:
                ((MessagesStorage) this.f19198b).lambda$updateDialogData$241((TLRPC.Dialog) this.f19199c);
                return;
            default:
                NotificationBadge.NewHtcHomeBadger.lambda$executeBadge$0((Intent) this.f19198b, (Intent) this.f19199c);
                return;
        }
    }
}
