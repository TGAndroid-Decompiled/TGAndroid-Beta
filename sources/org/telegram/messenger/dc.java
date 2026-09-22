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
public final class dc implements Runnable {
    public final int f15960a;
    public final Object f15961b;
    public final Object f15962c;

    public dc(int i10, Object obj, Object obj2) {
        this.f15960a = i10;
        this.f15961b = obj;
        this.f15962c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f15960a) {
            case 0:
                ((MessagesController) this.f15961b).lambda$processUpdateArray$394((TL_update.TL_updateLangPack) this.f15962c);
                return;
            case 1:
                ((MessagesController) this.f15961b).lambda$processUpdateArray$384((TL_update.TL_updateGroupCallMessage) this.f15962c);
                return;
            case 2:
                ((MessagesController) this.f15961b).lambda$processUpdateArray$385((TL_update.TL_updateDeleteGroupCallMessages) this.f15962c);
                return;
            case 3:
                ((MessagesController) this.f15961b).lambda$processUpdateArray$386((TL_update.TL_updateUserTyping) this.f15962c);
                return;
            case 4:
                ((MessagesController) this.f15961b).lambda$processUpdateArray$387((TL_update.TL_updateChatUserTyping) this.f15962c);
                return;
            case 5:
                MessagesController.lambda$setCustomChatReactions$468((Utilities.Callback) this.f15961b, (TLRPC.TL_error) this.f15962c);
                return;
            case 6:
                ((MessagesController) this.f15961b).lambda$getSponsoredMessages$438((TLRPC.messages_SponsoredMessages) this.f15962c);
                return;
            case 7:
                ((MessagesController) this.f15961b).lambda$processUpdateArray$412((TL_update.TL_updateChannel) this.f15962c);
                return;
            case 8:
                ((MessagesController) this.f15961b).lambda$getChannelDifference$338((TLRPC.updates_ChannelDifference) this.f15962c);
                return;
            case 9:
                ((MessagesController) this.f15961b).lambda$createChat$257((TLRPC.TL_messages_invitedUsers) this.f15962c);
                return;
            case 10:
                ((MessagesController) this.f15961b).lambda$addToViewsQueue$230((MessageObject) this.f15962c);
                return;
            case 11:
                ((MessagesController) this.f15961b).lambda$getSendAsPeers$441((TLRPC.TL_channels_sendAsPeers) this.f15962c);
                return;
            case 12:
                MessagesController.lambda$toggleChatNoForwards$277((Utilities.Callback2) this.f15961b, (TLRPC.TL_error) this.f15962c);
                return;
            case 13:
                ((MessagesController) this.f15961b).lambda$updateConfig$41((TLRPC.TL_config) this.f15962c);
                return;
            case 14:
                MessagesController.lambda$addUsersToChat$294((q0.a) this.f15961b, (TLRPC.User) this.f15962c);
                return;
            case 15:
                ((MessagesController) this.f15961b).lambda$loadAppConfig$32((TLRPC.TL_help_appConfig) this.f15962c);
                return;
            case 16:
                ((MessagesController) this.f15961b).lambda$checkChatInviter$371((TLRPC.TL_channels_channelParticipant) this.f15962c);
                return;
            case 17:
                MessagesController.lambda$addUserToChat$299((Utilities.Callback) this.f15961b, (Runnable) this.f15962c);
                return;
            case 18:
                ((MessagesController.SavedMusicIds) this.f15961b).lambda$load$0((TLObject) this.f15962c);
                return;
            case 19:
                ((MessagesStorage) this.f15961b).lambda$updateTopicsWithReadMessages$59((HashMap) this.f15962c);
                return;
            case 20:
                ((MessagesStorage) this.f15961b).lambda$putGiftChatThemes$265((List) this.f15962c);
                return;
            case 21:
                ((MessagesStorage) this.f15961b).lambda$putPushMessage$42((MessageObject) this.f15962c);
                return;
            case 22:
                MessagesStorage.lambda$getMessages$161((Timer.Task) this.f15961b, (Runnable) this.f15962c);
                return;
            case 23:
                ((MessagesStorage) this.f15961b).lambda$updateChatParticipants$122((TLRPC.ChatParticipants) this.f15962c);
                return;
            case 24:
                ((MessagesStorage) this.f15961b).lambda$deleteDialogFilter$72((MessagesController.DialogFilter) this.f15962c);
                return;
            case 25:
                ((MessagesStorage) this.f15961b).lambda$loadGiftChatTheme$268((Utilities.Callback) this.f15962c);
                return;
            case 26:
                ((MessagesStorage) this.f15961b).lambda$putStoryPushMessage$38((NotificationsController.StoryNotification) this.f15962c);
                return;
            case 27:
                ((MessagesStorage) this.f15961b).lambda$updateMessageStateAndIdInternal$212((TLRPC.TL_updates) this.f15962c);
                return;
            case 28:
                ((MessagesStorage) this.f15961b).lambda$updateDialogData$241((TLRPC.Dialog) this.f15962c);
                return;
            default:
                NotificationBadge.NewHtcHomeBadger.lambda$executeBadge$0((Intent) this.f15961b, (Intent) this.f15962c);
                return;
        }
    }
}
