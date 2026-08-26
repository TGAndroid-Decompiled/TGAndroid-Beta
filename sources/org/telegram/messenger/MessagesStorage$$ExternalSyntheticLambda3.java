package org.telegram.messenger;

import android.content.Intent;
import androidx.core.util.Consumer;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

public final class MessagesStorage$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public MessagesStorage$$ExternalSyntheticLambda3(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((MessagesStorage) this.f$0).lambda$updateDialogData$241((TLRPC.Dialog) this.f$1);
                break;
            case 1:
                ((MessagesController) this.f$0).lambda$processUpdateArray$384((TL_update.TL_updateGroupCallMessage) this.f$1);
                break;
            case 2:
                ((MessagesController) this.f$0).lambda$processUpdateArray$385((TL_update.TL_updateDeleteGroupCallMessages) this.f$1);
                break;
            case 3:
                ((MessagesController) this.f$0).lambda$processUpdateArray$392((TL_update.TL_updateServiceNotification) this.f$1);
                break;
            case 4:
                ((MessagesController) this.f$0).lambda$processUpdateArray$394((TL_update.TL_updateLangPack) this.f$1);
                break;
            case 5:
                ((MessagesController) this.f$0).lambda$processUpdateArray$393((TLRPC.Message) this.f$1);
                break;
            case 6:
                MessagesController.lambda$setCustomChatReactions$468((Utilities.Callback) this.f$0, (TLRPC.TL_error) this.f$1);
                break;
            case 7:
                ((MessagesController) this.f$0).lambda$getSponsoredMessages$438((TLRPC.messages_SponsoredMessages) this.f$1);
                break;
            case 8:
                ((MessagesController) this.f$0).lambda$processUpdateArray$412((TL_update.TL_updateChannel) this.f$1);
                break;
            case 9:
                ((MessagesController) this.f$0).lambda$getChannelDifference$338((TLRPC.updates_ChannelDifference) this.f$1);
                break;
            case 10:
                ((MessagesController) this.f$0).lambda$createChat$257((TLRPC.TL_messages_invitedUsers) this.f$1);
                break;
            case 11:
                ((MessagesController) this.f$0).lambda$addToViewsQueue$230((MessageObject) this.f$1);
                break;
            case 12:
                ((MessagesController) this.f$0).lambda$getSendAsPeers$441((TLRPC.TL_channels_sendAsPeers) this.f$1);
                break;
            case 13:
                MessagesController.lambda$toggleChatNoForwards$277((Utilities.Callback2) this.f$0, (TLRPC.TL_error) this.f$1);
                break;
            case 14:
                ((MessagesController) this.f$0).lambda$updateConfig$41((TLRPC.TL_config) this.f$1);
                break;
            case 15:
                MessagesController.lambda$addUsersToChat$294((Consumer) this.f$0, (TLRPC.User) this.f$1);
                break;
            case 16:
                ((MessagesController) this.f$0).lambda$loadAppConfig$32((TLRPC.TL_help_appConfig) this.f$1);
                break;
            case 17:
                ((MessagesController) this.f$0).lambda$checkChatInviter$371((TLRPC.TL_channels_channelParticipant) this.f$1);
                break;
            case 18:
                MessagesController.lambda$addUserToChat$299((Utilities.Callback) this.f$0, (Runnable) this.f$1);
                break;
            case 19:
                ((MessagesController.SavedMusicIds) this.f$0).lambda$load$0((TLObject) this.f$1);
                break;
            case 20:
                ((MessagesStorage) this.f$0).lambda$updateTopicsWithReadMessages$59((HashMap) this.f$1);
                break;
            case 21:
                ((MessagesStorage) this.f$0).lambda$putGiftChatThemes$265((List) this.f$1);
                break;
            case 22:
                ((MessagesStorage) this.f$0).lambda$putPushMessage$42((MessageObject) this.f$1);
                break;
            case 23:
                MessagesStorage.lambda$getMessages$161((Timer.Task) this.f$0, (Runnable) this.f$1);
                break;
            case 24:
                ((MessagesStorage) this.f$0).lambda$updateChatParticipants$122((TLRPC.ChatParticipants) this.f$1);
                break;
            case 25:
                ((MessagesStorage) this.f$0).lambda$deleteDialogFilter$72((MessagesController.DialogFilter) this.f$1);
                break;
            case 26:
                ((MessagesStorage) this.f$0).lambda$loadGiftChatTheme$268((Utilities.Callback) this.f$1);
                break;
            case 27:
                ((MessagesStorage) this.f$0).lambda$putStoryPushMessage$38((NotificationsController.StoryNotification) this.f$1);
                break;
            case 28:
                ((MessagesStorage) this.f$0).lambda$updateMessageStateAndIdInternal$212((TLRPC.TL_updates) this.f$1);
                break;
            default:
                NotificationBadge.NewHtcHomeBadger.lambda$executeBadge$0((Intent) this.f$0, (Intent) this.f$1);
                break;
        }
    }
}
