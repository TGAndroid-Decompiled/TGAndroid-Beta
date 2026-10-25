package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class da implements RequestDelegate {
    public final int f19897a;
    public final MessagesController f19898b;

    public da(MessagesController messagesController, int i10) {
        this.f19897a = i10;
        this.f19898b = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19897a) {
            case 0:
                this.f19898b.lambda$updateTimerProc$151(tLObject, tL_error);
                return;
            case 1:
                this.f19898b.lambda$updateTimerProc$152(tLObject, tL_error);
                return;
            case 2:
                this.f19898b.lambda$loadCurrentState$326(tLObject, tL_error);
                return;
            case 3:
                this.f19898b.lambda$getContentSettings$507(tLObject, tL_error);
                return;
            case 4:
                this.f19898b.lambda$loadSignUpNotificationsSettings$206(tLObject, tL_error);
                return;
            case 5:
                this.f19898b.lambda$reloadDialogsReadValue$63(tLObject, tL_error);
                return;
            case 6:
                this.f19898b.lambda$completeReadTask$237(tLObject, tL_error);
                return;
            case 7:
                this.f19898b.lambda$markMentionMessageAsRead$233(tLObject, tL_error);
                return;
            case 8:
                this.f19898b.lambda$sendBotStart$292(tLObject, tL_error);
                return;
            case 9:
                this.f19898b.lambda$toggleChannelForum$285(tLObject, tL_error);
                return;
            case 10:
                this.f19898b.lambda$setDialogHistoryTTL$136(tLObject, tL_error);
                return;
            case 11:
                this.f19898b.lambda$loadUnreadDialogs$363(tLObject, tL_error);
                return;
            case 12:
                this.f19898b.lambda$checkTosUpdate$162(tLObject, tL_error);
                return;
            case 13:
                this.f19898b.lambda$reloadReactionsNotifySettings$204(tLObject, tL_error);
                return;
            case 14:
                this.f19898b.lambda$loadHintDialogs$195(tLObject, tL_error);
                return;
            case 15:
                this.f19898b.lambda$reloadUser$55(tLObject, tL_error);
                return;
            case 16:
                this.f19898b.lambda$markMessageContentAsRead$231(tLObject, tL_error);
                return;
            case 17:
                this.f19898b.lambda$loadRemoteFilters$30(tLObject, tL_error);
                return;
            case 18:
                this.f19898b.lambda$didReceivedNotification$42(tLObject, tL_error);
                return;
            case 19:
                this.f19898b.lambda$loadGlobalNotificationsSettings$202(tLObject, tL_error);
                return;
            case 20:
                this.f19898b.lambda$performLogout$323(tLObject, tL_error);
                return;
            case 21:
                this.f19898b.lambda$processUpdateArray$419(tLObject, tL_error);
                return;
            case 22:
                this.f19898b.lambda$checkPeerColors$496(tLObject, tL_error);
                return;
            case 23:
                this.f19898b.lambda$checkPeerColors$498(tLObject, tL_error);
                return;
            case 24:
                this.f19898b.lambda$loadSuggestedFilters$25(tLObject, tL_error);
                return;
            case 25:
                this.f19898b.lambda$toggleChannelInvitesHistory$287(tLObject, tL_error);
                return;
            default:
                this.f19898b.lambda$toggleChannelSignatures$283(tLObject, tL_error);
                return;
        }
    }
}
