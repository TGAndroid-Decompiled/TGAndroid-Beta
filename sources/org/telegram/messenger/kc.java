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
public final class kc implements Runnable {
    public final int f18779a;
    public final Object f18780b;
    public final Object f18781c;

    public kc(int i10, Object obj, Object obj2) {
        this.f18779a = i10;
        this.f18780b = obj;
        this.f18781c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18779a) {
            case 0:
                ((MessagesController) this.f18780b).lambda$processUpdateArray$396((TLRPC.Message) this.f18781c);
                return;
            case 1:
                ((MessagesController) this.f18780b).lambda$processUpdateArray$397((TL_update.TL_updateLangPack) this.f18781c);
                return;
            case 2:
                ((MessagesController) this.f18780b).lambda$changeChatAvatar$317((Runnable) this.f18781c);
                return;
            case 3:
                ((MessagesController) this.f18780b).lambda$processUpdateArray$387((TL_update.TL_updateGroupCallMessage) this.f18781c);
                return;
            case 4:
                ((MessagesController) this.f18780b).lambda$processUpdateArray$388((TL_update.TL_updateDeleteGroupCallMessages) this.f18781c);
                return;
            case 5:
                ((MessagesController) this.f18780b).lambda$processUpdateArray$389((TL_update.TL_updateUserTyping) this.f18781c);
                return;
            case 6:
                ((MessagesController) this.f18780b).lambda$processUpdateArray$390((TL_update.TL_updateChatUserTyping) this.f18781c);
                return;
            case 7:
                MessagesController.lambda$toggleChatNoForwards$276((Utilities.Callback2) this.f18780b, (TLRPC.TL_error) this.f18781c);
                return;
            case 8:
                MessagesController.lambda$setCustomChatReactions$471((Utilities.Callback) this.f18780b, (TLRPC.TL_error) this.f18781c);
                return;
            case 9:
                ((MessagesController) this.f18780b).lambda$getSponsoredMessages$441((TLRPC.messages_SponsoredMessages) this.f18781c);
                return;
            case 10:
                ((MessagesController) this.f18780b).lambda$requestContactToken$478((Utilities.Callback) this.f18781c);
                return;
            case 11:
                ((MessagesController) this.f18780b).lambda$addToViewsQueue$229((MessageObject) this.f18781c);
                return;
            case 12:
                ((MessagesController) this.f18780b).lambda$loadAppConfig$31((TLRPC.TL_help_appConfig) this.f18781c);
                return;
            case 13:
                ((MessagesController) this.f18780b).lambda$getSendAsPeers$444((TLRPC.TL_channels_sendAsPeers) this.f18781c);
                return;
            case 14:
                ((MessagesController) this.f18780b).lambda$getDifference$350((TLRPC.updates_Difference) this.f18781c);
                return;
            case 15:
                MessagesController.lambda$addUsersToChat$293((q0.a) this.f18780b, (TLRPC.User) this.f18781c);
                return;
            case 16:
                ((MessagesController) this.f18780b).lambda$updateConfig$40((TLRPC.TL_config) this.f18781c);
                return;
            case 17:
                ((MessagesController) this.f18780b).lambda$getChannelDifference$337((TLRPC.updates_ChannelDifference) this.f18781c);
                return;
            case 18:
                ((MessagesController.SavedMusicIds) this.f18780b).lambda$load$0((TLObject) this.f18781c);
                return;
            case 19:
                ((MessagesStorage) this.f18780b).lambda$updateTopicsWithReadMessages$59((HashMap) this.f18781c);
                return;
            case 20:
                ((MessagesStorage) this.f18780b).lambda$putGiftChatThemes$265((List) this.f18781c);
                return;
            case 21:
                ((MessagesStorage) this.f18780b).lambda$putPushMessage$42((MessageObject) this.f18781c);
                return;
            case 22:
                MessagesStorage.lambda$getMessages$161((Timer.Task) this.f18780b, (Runnable) this.f18781c);
                return;
            case 23:
                ((MessagesStorage) this.f18780b).lambda$updateChatParticipants$122((TLRPC.ChatParticipants) this.f18781c);
                return;
            case 24:
                ((MessagesStorage) this.f18780b).lambda$deleteDialogFilter$72((MessagesController.DialogFilter) this.f18781c);
                return;
            case 25:
                ((MessagesStorage) this.f18780b).lambda$loadGiftChatTheme$268((Utilities.Callback) this.f18781c);
                return;
            case 26:
                ((MessagesStorage) this.f18780b).lambda$putStoryPushMessage$38((NotificationsController.StoryNotification) this.f18781c);
                return;
            case 27:
                ((MessagesStorage) this.f18780b).lambda$updateMessageStateAndIdInternal$212((TLRPC.TL_updates) this.f18781c);
                return;
            case 28:
                ((MessagesStorage) this.f18780b).lambda$updateDialogData$241((TLRPC.Dialog) this.f18781c);
                return;
            default:
                NotificationBadge.NewHtcHomeBadger.lambda$executeBadge$0((Intent) this.f18780b, (Intent) this.f18781c);
                return;
        }
    }
}
