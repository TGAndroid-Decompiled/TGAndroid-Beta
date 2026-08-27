package org.telegram.messenger;

import android.content.Intent;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

public final class cc implements Runnable {

    public final int f19955a;

    public final Object f19956b;

    public final Object f19957c;

    public cc(int i10, Object obj, Object obj2) {
        this.f19955a = i10;
        this.f19956b = obj;
        this.f19957c = obj2;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f19955a) {
            case 0:
                ((MessagesController) this.f19956b).lambda$processUpdateArray$394((TL_update.TL_updateLangPack) this.f19957c);
                break;
            case 1:
                ((MessagesController) this.f19956b).lambda$processUpdateArray$384((TL_update.TL_updateGroupCallMessage) this.f19957c);
                break;
            case 2:
                ((MessagesController) this.f19956b).lambda$processUpdateArray$385((TL_update.TL_updateDeleteGroupCallMessages) this.f19957c);
                break;
            case 3:
                ((MessagesController) this.f19956b).lambda$processUpdateArray$386((TL_update.TL_updateUserTyping) this.f19957c);
                break;
            case 4:
                ((MessagesController) this.f19956b).lambda$processUpdateArray$387((TL_update.TL_updateChatUserTyping) this.f19957c);
                break;
            case 5:
                MessagesController.lambda$setCustomChatReactions$468((Utilities.Callback) this.f19956b, (TLRPC.TL_error) this.f19957c);
                break;
            case 6:
                ((MessagesController) this.f19956b).lambda$getSponsoredMessages$438((TLRPC.messages_SponsoredMessages) this.f19957c);
                break;
            case 7:
                ((MessagesController) this.f19956b).lambda$processUpdateArray$412((TL_update.TL_updateChannel) this.f19957c);
                break;
            case 8:
                ((MessagesController) this.f19956b).lambda$getChannelDifference$338((TLRPC.updates_ChannelDifference) this.f19957c);
                break;
            case 9:
                ((MessagesController) this.f19956b).lambda$createChat$257((TLRPC.TL_messages_invitedUsers) this.f19957c);
                break;
            case 10:
                ((MessagesController) this.f19956b).lambda$addToViewsQueue$230((MessageObject) this.f19957c);
                break;
            case 11:
                ((MessagesController) this.f19956b).lambda$getSendAsPeers$441((TLRPC.TL_channels_sendAsPeers) this.f19957c);
                break;
            case 12:
                MessagesController.lambda$toggleChatNoForwards$277((Utilities.Callback2) this.f19956b, (TLRPC.TL_error) this.f19957c);
                break;
            case 13:
                ((MessagesController) this.f19956b).lambda$updateConfig$41((TLRPC.TL_config) this.f19957c);
                break;
            case 14:
                MessagesController.lambda$addUsersToChat$294((q0.a) this.f19956b, (TLRPC.User) this.f19957c);
                break;
            case 15:
                ((MessagesController) this.f19956b).lambda$loadAppConfig$32((TLRPC.TL_help_appConfig) this.f19957c);
                break;
            case 16:
                ((MessagesController) this.f19956b).lambda$checkChatInviter$371((TLRPC.TL_channels_channelParticipant) this.f19957c);
                break;
            case 17:
                MessagesController.lambda$addUserToChat$299((Utilities.Callback) this.f19956b, (Runnable) this.f19957c);
                break;
            case 18:
                ((MessagesController.SavedMusicIds) this.f19956b).lambda$load$0((TLObject) this.f19957c);
                break;
            case 19:
                ((MessagesStorage) this.f19956b).lambda$updateTopicsWithReadMessages$59((HashMap) this.f19957c);
                break;
            case 20:
                ((MessagesStorage) this.f19956b).lambda$putGiftChatThemes$265((List) this.f19957c);
                break;
            case 21:
                ((MessagesStorage) this.f19956b).lambda$putPushMessage$42((MessageObject) this.f19957c);
                break;
            case 22:
                MessagesStorage.lambda$getMessages$161((Timer.Task) this.f19956b, (Runnable) this.f19957c);
                break;
            case 23:
                ((MessagesStorage) this.f19956b).lambda$updateChatParticipants$122((TLRPC.ChatParticipants) this.f19957c);
                break;
            case 24:
                ((MessagesStorage) this.f19956b).lambda$deleteDialogFilter$72((MessagesController.DialogFilter) this.f19957c);
                break;
            case 25:
                ((MessagesStorage) this.f19956b).lambda$loadGiftChatTheme$268((Utilities.Callback) this.f19957c);
                break;
            case 26:
                ((MessagesStorage) this.f19956b).lambda$putStoryPushMessage$38((NotificationsController.StoryNotification) this.f19957c);
                break;
            case 27:
                ((MessagesStorage) this.f19956b).lambda$updateMessageStateAndIdInternal$212((TLRPC.TL_updates) this.f19957c);
                break;
            case 28:
                ((MessagesStorage) this.f19956b).lambda$updateDialogData$241((TLRPC.Dialog) this.f19957c);
                break;
            default:
                NotificationBadge.NewHtcHomeBadger.lambda$executeBadge$0((Intent) this.f19956b, (Intent) this.f19957c);
                break;
        }
    }
}
