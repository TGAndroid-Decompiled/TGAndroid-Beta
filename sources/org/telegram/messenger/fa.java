package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fa implements RequestDelegate {
    public final int f20224a;
    public final MessagesController f20225b;

    public fa(MessagesController messagesController, int i10) {
        this.f20224a = i10;
        this.f20225b = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20224a) {
            case 0:
                this.f20225b.lambda$updateTimerProc$152(tLObject, tL_error);
                return;
            case 1:
                this.f20225b.lambda$updateTimerProc$153(tLObject, tL_error);
                return;
            case 2:
                this.f20225b.lambda$loadCurrentState$325(tLObject, tL_error);
                return;
            case 3:
                this.f20225b.lambda$getContentSettings$502(tLObject, tL_error);
                return;
            case 4:
                this.f20225b.lambda$sendBotStart$293(tLObject, tL_error);
                return;
            case 5:
                this.f20225b.lambda$loadSignUpNotificationsSettings$207(tLObject, tL_error);
                return;
            case 6:
                this.f20225b.lambda$reloadDialogsReadValue$64(tLObject, tL_error);
                return;
            case 7:
                this.f20225b.lambda$completeReadTask$238(tLObject, tL_error);
                return;
            case 8:
                this.f20225b.lambda$markMentionMessageAsRead$234(tLObject, tL_error);
                return;
            case 9:
                this.f20225b.lambda$toggleChannelForum$286(tLObject, tL_error);
                return;
            case 10:
                this.f20225b.lambda$setDialogHistoryTTL$137(tLObject, tL_error);
                return;
            case 11:
                this.f20225b.lambda$loadUnreadDialogs$362(tLObject, tL_error);
                return;
            case 12:
                this.f20225b.lambda$checkTosUpdate$163(tLObject, tL_error);
                return;
            case 13:
                this.f20225b.lambda$reloadReactionsNotifySettings$205(tLObject, tL_error);
                return;
            case 14:
                this.f20225b.lambda$loadHintDialogs$196(tLObject, tL_error);
                return;
            case 15:
                this.f20225b.lambda$reloadUser$56(tLObject, tL_error);
                return;
            case 16:
                this.f20225b.lambda$processUpdateArray$414(tLObject, tL_error);
                return;
            case 17:
                this.f20225b.lambda$markMessageContentAsRead$232(tLObject, tL_error);
                return;
            case 18:
                this.f20225b.lambda$loadRemoteFilters$30(tLObject, tL_error);
                return;
            case 19:
                this.f20225b.lambda$didReceivedNotification$43(tLObject, tL_error);
                return;
            case 20:
                this.f20225b.lambda$loadGlobalNotificationsSettings$203(tLObject, tL_error);
                return;
            case 21:
                this.f20225b.lambda$performLogout$322(tLObject, tL_error);
                return;
            case 22:
                this.f20225b.lambda$checkPeerColors$491(tLObject, tL_error);
                return;
            case 23:
                this.f20225b.lambda$checkPeerColors$493(tLObject, tL_error);
                return;
            case 24:
                this.f20225b.lambda$loadSuggestedFilters$25(tLObject, tL_error);
                return;
            case 25:
                this.f20225b.lambda$toggleChannelInvitesHistory$288(tLObject, tL_error);
                return;
            default:
                this.f20225b.lambda$toggleChannelSignatures$284(tLObject, tL_error);
                return;
        }
    }
}
