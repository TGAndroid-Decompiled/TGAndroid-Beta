package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ca implements RequestDelegate {
    public final int f17548a;
    public final MessagesController f17549b;

    public ca(MessagesController messagesController, int i10) {
        this.f17548a = i10;
        this.f17549b = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17548a) {
            case 0:
                this.f17549b.lambda$updateTimerProc$151(tLObject, tL_error);
                return;
            case 1:
                this.f17549b.lambda$updateTimerProc$152(tLObject, tL_error);
                return;
            case 2:
                this.f17549b.lambda$processUpdateArray$417(tLObject, tL_error);
                return;
            case 3:
                this.f17549b.lambda$loadCurrentState$324(tLObject, tL_error);
                return;
            case 4:
                this.f17549b.lambda$getContentSettings$505(tLObject, tL_error);
                return;
            case 5:
                this.f17549b.lambda$loadSignUpNotificationsSettings$206(tLObject, tL_error);
                return;
            case 6:
                this.f17549b.lambda$sendBotStart$292(tLObject, tL_error);
                return;
            case 7:
                this.f17549b.lambda$reloadDialogsReadValue$63(tLObject, tL_error);
                return;
            case 8:
                this.f17549b.lambda$completeReadTask$237(tLObject, tL_error);
                return;
            case 9:
                this.f17549b.lambda$markMentionMessageAsRead$233(tLObject, tL_error);
                return;
            case 10:
                this.f17549b.lambda$toggleChannelForum$285(tLObject, tL_error);
                return;
            case 11:
                this.f17549b.lambda$setDialogHistoryTTL$136(tLObject, tL_error);
                return;
            case 12:
                this.f17549b.lambda$loadUnreadDialogs$361(tLObject, tL_error);
                return;
            case 13:
                this.f17549b.lambda$checkTosUpdate$162(tLObject, tL_error);
                return;
            case 14:
                this.f17549b.lambda$reloadReactionsNotifySettings$204(tLObject, tL_error);
                return;
            case 15:
                this.f17549b.lambda$reloadUser$55(tLObject, tL_error);
                return;
            case 16:
                this.f17549b.lambda$loadHintDialogs$195(tLObject, tL_error);
                return;
            case 17:
                this.f17549b.lambda$markMessageContentAsRead$231(tLObject, tL_error);
                return;
            case 18:
                this.f17549b.lambda$loadRemoteFilters$30(tLObject, tL_error);
                return;
            case 19:
                this.f17549b.lambda$didReceivedNotification$42(tLObject, tL_error);
                return;
            case 20:
                this.f17549b.lambda$loadGlobalNotificationsSettings$202(tLObject, tL_error);
                return;
            case 21:
                this.f17549b.lambda$performLogout$321(tLObject, tL_error);
                return;
            case 22:
                this.f17549b.lambda$checkPeerColors$494(tLObject, tL_error);
                return;
            case 23:
                this.f17549b.lambda$checkPeerColors$496(tLObject, tL_error);
                return;
            case 24:
                this.f17549b.lambda$loadSuggestedFilters$25(tLObject, tL_error);
                return;
            case 25:
                this.f17549b.lambda$toggleChannelInvitesHistory$287(tLObject, tL_error);
                return;
            default:
                this.f17549b.lambda$toggleChannelSignatures$283(tLObject, tL_error);
                return;
        }
    }
}
