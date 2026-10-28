package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class la implements RequestDelegate {
    public final int f20596a;
    public final MessagesController f20597b;

    public la(MessagesController messagesController, int i10) {
        this.f20596a = i10;
        this.f20597b = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20596a) {
            case 0:
                this.f20597b.lambda$processUpdateArray$420(tLObject, tL_error);
                return;
            case 1:
                this.f20597b.lambda$updateTimerProc$151(tLObject, tL_error);
                return;
            case 2:
                this.f20597b.lambda$updateTimerProc$152(tLObject, tL_error);
                return;
            case 3:
                this.f20597b.lambda$loadCurrentState$326(tLObject, tL_error);
                return;
            case 4:
                this.f20597b.lambda$getContentSettings$508(tLObject, tL_error);
                return;
            case 5:
                this.f20597b.lambda$loadSignUpNotificationsSettings$206(tLObject, tL_error);
                return;
            case 6:
                this.f20597b.lambda$reloadDialogsReadValue$63(tLObject, tL_error);
                return;
            case 7:
                this.f20597b.lambda$completeReadTask$237(tLObject, tL_error);
                return;
            case 8:
                this.f20597b.lambda$markMentionMessageAsRead$233(tLObject, tL_error);
                return;
            case 9:
                this.f20597b.lambda$sendBotStart$292(tLObject, tL_error);
                return;
            case 10:
                this.f20597b.lambda$toggleChannelForum$285(tLObject, tL_error);
                return;
            case 11:
                this.f20597b.lambda$setDialogHistoryTTL$136(tLObject, tL_error);
                return;
            case 12:
                this.f20597b.lambda$loadUnreadDialogs$363(tLObject, tL_error);
                return;
            case 13:
                this.f20597b.lambda$checkTosUpdate$162(tLObject, tL_error);
                return;
            case 14:
                this.f20597b.lambda$reloadReactionsNotifySettings$204(tLObject, tL_error);
                return;
            case 15:
                this.f20597b.lambda$loadHintDialogs$195(tLObject, tL_error);
                return;
            case 16:
                this.f20597b.lambda$reloadUser$55(tLObject, tL_error);
                return;
            case 17:
                this.f20597b.lambda$markMessageContentAsRead$231(tLObject, tL_error);
                return;
            case 18:
                this.f20597b.lambda$loadRemoteFilters$30(tLObject, tL_error);
                return;
            case 19:
                this.f20597b.lambda$didReceivedNotification$42(tLObject, tL_error);
                return;
            case 20:
                this.f20597b.lambda$loadGlobalNotificationsSettings$202(tLObject, tL_error);
                return;
            case 21:
                this.f20597b.lambda$performLogout$323(tLObject, tL_error);
                return;
            case 22:
                this.f20597b.lambda$checkPeerColors$497(tLObject, tL_error);
                return;
            case 23:
                this.f20597b.lambda$checkPeerColors$499(tLObject, tL_error);
                return;
            case 24:
                this.f20597b.lambda$loadSuggestedFilters$25(tLObject, tL_error);
                return;
            case 25:
                this.f20597b.lambda$toggleChannelInvitesHistory$287(tLObject, tL_error);
                return;
            default:
                this.f20597b.lambda$toggleChannelSignatures$283(tLObject, tL_error);
                return;
        }
    }
}
