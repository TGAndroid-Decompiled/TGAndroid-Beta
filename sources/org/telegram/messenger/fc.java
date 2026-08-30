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
public final class fc implements Runnable {
    public final int f17210a;
    public final Object f17211b;
    public final Object f17212c;

    public fc(int i10, Object obj, Object obj2) {
        this.f17210a = i10;
        this.f17211b = obj;
        this.f17212c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17210a) {
            case 0:
                ((MessagesController) this.f17211b).lambda$processUpdateArray$393((TLRPC.Message) this.f17212c);
                return;
            case 1:
                ((MessagesController) this.f17211b).lambda$processUpdateArray$394((TL_update.TL_updateLangPack) this.f17212c);
                return;
            case 2:
                ((MessagesController) this.f17211b).lambda$processUpdateArray$384((TL_update.TL_updateGroupCallMessage) this.f17212c);
                return;
            case 3:
                ((MessagesController) this.f17211b).lambda$processUpdateArray$385((TL_update.TL_updateDeleteGroupCallMessages) this.f17212c);
                return;
            case 4:
                ((MessagesController) this.f17211b).lambda$processUpdateArray$386((TL_update.TL_updateUserTyping) this.f17212c);
                return;
            case 5:
                ((MessagesController) this.f17211b).lambda$processUpdateArray$387((TL_update.TL_updateChatUserTyping) this.f17212c);
                return;
            case 6:
                MessagesController.lambda$setCustomChatReactions$468((Utilities.Callback) this.f17211b, (TLRPC.TL_error) this.f17212c);
                return;
            case 7:
                ((MessagesController) this.f17211b).lambda$getSponsoredMessages$438((TLRPC.messages_SponsoredMessages) this.f17212c);
                return;
            case 8:
                ((MessagesController) this.f17211b).lambda$processUpdateArray$412((TL_update.TL_updateChannel) this.f17212c);
                return;
            case 9:
                ((MessagesController) this.f17211b).lambda$getChannelDifference$338((TLRPC.updates_ChannelDifference) this.f17212c);
                return;
            case 10:
                ((MessagesController) this.f17211b).lambda$createChat$257((TLRPC.TL_messages_invitedUsers) this.f17212c);
                return;
            case 11:
                ((MessagesController) this.f17211b).lambda$addToViewsQueue$230((MessageObject) this.f17212c);
                return;
            case 12:
                ((MessagesController) this.f17211b).lambda$getSendAsPeers$441((TLRPC.TL_channels_sendAsPeers) this.f17212c);
                return;
            case 13:
                MessagesController.lambda$toggleChatNoForwards$277((Utilities.Callback2) this.f17211b, (TLRPC.TL_error) this.f17212c);
                return;
            case 14:
                ((MessagesController) this.f17211b).lambda$updateConfig$41((TLRPC.TL_config) this.f17212c);
                return;
            case 15:
                MessagesController.lambda$addUsersToChat$294((q0.a) this.f17211b, (TLRPC.User) this.f17212c);
                return;
            case 16:
                ((MessagesController) this.f17211b).lambda$loadAppConfig$32((TLRPC.TL_help_appConfig) this.f17212c);
                return;
            case 17:
                ((MessagesController) this.f17211b).lambda$checkChatInviter$371((TLRPC.TL_channels_channelParticipant) this.f17212c);
                return;
            case 18:
                MessagesController.lambda$addUserToChat$299((Utilities.Callback) this.f17211b, (Runnable) this.f17212c);
                return;
            case 19:
                ((MessagesController.SavedMusicIds) this.f17211b).lambda$load$0((TLObject) this.f17212c);
                return;
            case 20:
                ((MessagesStorage) this.f17211b).lambda$updateTopicsWithReadMessages$59((HashMap) this.f17212c);
                return;
            case 21:
                ((MessagesStorage) this.f17211b).lambda$putGiftChatThemes$265((List) this.f17212c);
                return;
            case 22:
                ((MessagesStorage) this.f17211b).lambda$putPushMessage$42((MessageObject) this.f17212c);
                return;
            case 23:
                MessagesStorage.lambda$getMessages$161((Timer.Task) this.f17211b, (Runnable) this.f17212c);
                return;
            case 24:
                ((MessagesStorage) this.f17211b).lambda$updateChatParticipants$122((TLRPC.ChatParticipants) this.f17212c);
                return;
            case 25:
                ((MessagesStorage) this.f17211b).lambda$deleteDialogFilter$72((MessagesController.DialogFilter) this.f17212c);
                return;
            case 26:
                ((MessagesStorage) this.f17211b).lambda$loadGiftChatTheme$268((Utilities.Callback) this.f17212c);
                return;
            case 27:
                ((MessagesStorage) this.f17211b).lambda$putStoryPushMessage$38((NotificationsController.StoryNotification) this.f17212c);
                return;
            case 28:
                ((MessagesStorage) this.f17211b).lambda$updateMessageStateAndIdInternal$212((TLRPC.TL_updates) this.f17212c);
                return;
            default:
                ((MessagesStorage) this.f17211b).lambda$updateDialogData$241((TLRPC.Dialog) this.f17212c);
                return;
        }
    }
}
