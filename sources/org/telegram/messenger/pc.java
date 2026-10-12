package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class pc implements Runnable {
    public final int f18565a;
    public final Object f18566b;
    public final Object f18567c;

    public pc(int i10, Object obj, Object obj2) {
        this.f18565a = i10;
        this.f18566b = obj;
        this.f18567c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18565a) {
            case 0:
                ((MessagesController) this.f18566b).lambda$processUpdateArray$395((TL_update.TL_updateServiceNotification) this.f18567c);
                return;
            case 1:
                ((MessagesController) this.f18566b).lambda$processUpdateArray$396((TLRPC.Message) this.f18567c);
                return;
            case 2:
                ((MessagesController) this.f18566b).lambda$processUpdateArray$397((TL_update.TL_updateLangPack) this.f18567c);
                return;
            case 3:
                ((MessagesController) this.f18566b).lambda$changeChatAvatar$317((Runnable) this.f18567c);
                return;
            case 4:
                ((MessagesController) this.f18566b).lambda$processUpdateArray$387((TL_update.TL_updateGroupCallMessage) this.f18567c);
                return;
            case 5:
                ((MessagesController) this.f18566b).lambda$processUpdateArray$388((TL_update.TL_updateDeleteGroupCallMessages) this.f18567c);
                return;
            case 6:
                ((MessagesController) this.f18566b).lambda$processUpdateArray$389((TL_update.TL_updateUserTyping) this.f18567c);
                return;
            case 7:
                ((MessagesController) this.f18566b).lambda$processUpdateArray$390((TL_update.TL_updateChatUserTyping) this.f18567c);
                return;
            case 8:
                MessagesController.lambda$toggleChatNoForwards$276((Utilities.Callback2) this.f18566b, (TLRPC.TL_error) this.f18567c);
                return;
            case 9:
                MessagesController.lambda$setCustomChatReactions$471((Utilities.Callback) this.f18566b, (TLRPC.TL_error) this.f18567c);
                return;
            case 10:
                ((MessagesController) this.f18566b).lambda$getSponsoredMessages$441((TLRPC.messages_SponsoredMessages) this.f18567c);
                return;
            case 11:
                ((MessagesController) this.f18566b).lambda$requestContactToken$478((Utilities.Callback) this.f18567c);
                return;
            case 12:
                ((MessagesController) this.f18566b).lambda$addToViewsQueue$229((MessageObject) this.f18567c);
                return;
            case 13:
                ((MessagesController) this.f18566b).lambda$loadAppConfig$31((TLRPC.TL_help_appConfig) this.f18567c);
                return;
            case 14:
                ((MessagesController) this.f18566b).lambda$getSendAsPeers$444((TLRPC.TL_channels_sendAsPeers) this.f18567c);
                return;
            case 15:
                ((MessagesController) this.f18566b).lambda$getDifference$350((TLRPC.updates_Difference) this.f18567c);
                return;
            case 16:
                MessagesController.lambda$addUsersToChat$293((q0.a) this.f18566b, (TLRPC.User) this.f18567c);
                return;
            case 17:
                ((MessagesController) this.f18566b).lambda$updateConfig$40((TLRPC.TL_config) this.f18567c);
                return;
            case 18:
                ((MessagesController) this.f18566b).lambda$getChannelDifference$337((TLRPC.updates_ChannelDifference) this.f18567c);
                return;
            case 19:
                ((MessagesController.SavedMusicIds) this.f18566b).lambda$load$0((TLObject) this.f18567c);
                return;
            case 20:
                ((MessagesStorage) this.f18566b).lambda$updateTopicsWithReadMessages$59((HashMap) this.f18567c);
                return;
            case 21:
                ((MessagesStorage) this.f18566b).lambda$putGiftChatThemes$265((List) this.f18567c);
                return;
            case 22:
                ((MessagesStorage) this.f18566b).lambda$putPushMessage$42((MessageObject) this.f18567c);
                return;
            case 23:
                MessagesStorage.lambda$getMessages$161((Timer.Task) this.f18566b, (Runnable) this.f18567c);
                return;
            case 24:
                ((MessagesStorage) this.f18566b).lambda$updateChatParticipants$122((TLRPC.ChatParticipants) this.f18567c);
                return;
            case 25:
                ((MessagesStorage) this.f18566b).lambda$deleteDialogFilter$72((MessagesController.DialogFilter) this.f18567c);
                return;
            case 26:
                ((MessagesStorage) this.f18566b).lambda$loadGiftChatTheme$268((Utilities.Callback) this.f18567c);
                return;
            case 27:
                ((MessagesStorage) this.f18566b).lambda$putStoryPushMessage$38((NotificationsController.StoryNotification) this.f18567c);
                return;
            case 28:
                ((MessagesStorage) this.f18566b).lambda$updateMessageStateAndIdInternal$212((TLRPC.TL_updates) this.f18567c);
                return;
            default:
                ((MessagesStorage) this.f18566b).lambda$updateDialogData$241((TLRPC.Dialog) this.f18567c);
                return;
        }
    }
}
