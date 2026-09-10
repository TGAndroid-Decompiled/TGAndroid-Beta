package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ja implements RequestDelegate {
    public final int f15524a;
    public final MessagesController f15525b;

    public ja(MessagesController messagesController, int i10) {
        this.f15524a = i10;
        this.f15525b = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15524a) {
            case 0:
                this.f15525b.lambda$updateTimerProc$152(tLObject, tL_error);
                return;
            case 1:
                this.f15525b.lambda$updateTimerProc$153(tLObject, tL_error);
                return;
            case 2:
                this.f15525b.lambda$loadCurrentState$325(tLObject, tL_error);
                return;
            case 3:
                this.f15525b.lambda$getContentSettings$502(tLObject, tL_error);
                return;
            case 4:
                this.f15525b.lambda$sendBotStart$293(tLObject, tL_error);
                return;
            case 5:
                this.f15525b.lambda$loadSignUpNotificationsSettings$207(tLObject, tL_error);
                return;
            case 6:
                this.f15525b.lambda$reloadDialogsReadValue$64(tLObject, tL_error);
                return;
            case 7:
                this.f15525b.lambda$completeReadTask$238(tLObject, tL_error);
                return;
            case 8:
                this.f15525b.lambda$markMentionMessageAsRead$234(tLObject, tL_error);
                return;
            case 9:
                this.f15525b.lambda$toggleChannelForum$286(tLObject, tL_error);
                return;
            case 10:
                this.f15525b.lambda$setDialogHistoryTTL$137(tLObject, tL_error);
                return;
            case 11:
                this.f15525b.lambda$loadUnreadDialogs$362(tLObject, tL_error);
                return;
            case 12:
                this.f15525b.lambda$checkTosUpdate$163(tLObject, tL_error);
                return;
            case 13:
                this.f15525b.lambda$reloadReactionsNotifySettings$205(tLObject, tL_error);
                return;
            case 14:
                this.f15525b.lambda$loadHintDialogs$196(tLObject, tL_error);
                return;
            case 15:
                this.f15525b.lambda$reloadUser$56(tLObject, tL_error);
                return;
            case 16:
                this.f15525b.lambda$processUpdateArray$414(tLObject, tL_error);
                return;
            case 17:
                this.f15525b.lambda$markMessageContentAsRead$232(tLObject, tL_error);
                return;
            case 18:
                this.f15525b.lambda$loadRemoteFilters$30(tLObject, tL_error);
                return;
            case 19:
                this.f15525b.lambda$didReceivedNotification$43(tLObject, tL_error);
                return;
            case 20:
                this.f15525b.lambda$loadGlobalNotificationsSettings$203(tLObject, tL_error);
                return;
            case 21:
                this.f15525b.lambda$performLogout$322(tLObject, tL_error);
                return;
            case 22:
                this.f15525b.lambda$checkPeerColors$491(tLObject, tL_error);
                return;
            case 23:
                this.f15525b.lambda$checkPeerColors$493(tLObject, tL_error);
                return;
            case 24:
                this.f15525b.lambda$loadSuggestedFilters$25(tLObject, tL_error);
                return;
            case 25:
                this.f15525b.lambda$toggleChannelInvitesHistory$288(tLObject, tL_error);
                return;
            default:
                this.f15525b.lambda$toggleChannelSignatures$284(tLObject, tL_error);
                return;
        }
    }
}
