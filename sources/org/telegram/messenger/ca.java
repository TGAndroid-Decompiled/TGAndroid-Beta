package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ca implements RequestDelegate {
    public final int f16062a;
    public final MessagesController f16063b;

    public ca(MessagesController messagesController, int i10) {
        this.f16062a = i10;
        this.f16063b = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16062a) {
            case 0:
                this.f16063b.lambda$updateTimerProc$152(tLObject, tL_error);
                return;
            case 1:
                this.f16063b.lambda$updateTimerProc$153(tLObject, tL_error);
                return;
            case 2:
                this.f16063b.lambda$loadCurrentState$325(tLObject, tL_error);
                return;
            case 3:
                this.f16063b.lambda$getContentSettings$502(tLObject, tL_error);
                return;
            case 4:
                this.f16063b.lambda$sendBotStart$293(tLObject, tL_error);
                return;
            case 5:
                this.f16063b.lambda$loadSignUpNotificationsSettings$207(tLObject, tL_error);
                return;
            case 6:
                this.f16063b.lambda$reloadDialogsReadValue$64(tLObject, tL_error);
                return;
            case 7:
                this.f16063b.lambda$completeReadTask$238(tLObject, tL_error);
                return;
            case 8:
                this.f16063b.lambda$markMentionMessageAsRead$234(tLObject, tL_error);
                return;
            case 9:
                this.f16063b.lambda$toggleChannelForum$286(tLObject, tL_error);
                return;
            case 10:
                this.f16063b.lambda$setDialogHistoryTTL$137(tLObject, tL_error);
                return;
            case 11:
                this.f16063b.lambda$loadUnreadDialogs$362(tLObject, tL_error);
                return;
            case 12:
                this.f16063b.lambda$checkTosUpdate$163(tLObject, tL_error);
                return;
            case 13:
                this.f16063b.lambda$reloadReactionsNotifySettings$205(tLObject, tL_error);
                return;
            case 14:
                this.f16063b.lambda$loadHintDialogs$196(tLObject, tL_error);
                return;
            case 15:
                this.f16063b.lambda$reloadUser$56(tLObject, tL_error);
                return;
            case 16:
                this.f16063b.lambda$processUpdateArray$414(tLObject, tL_error);
                return;
            case 17:
                this.f16063b.lambda$markMessageContentAsRead$232(tLObject, tL_error);
                return;
            case 18:
                this.f16063b.lambda$loadRemoteFilters$30(tLObject, tL_error);
                return;
            case 19:
                this.f16063b.lambda$didReceivedNotification$43(tLObject, tL_error);
                return;
            case 20:
                this.f16063b.lambda$loadGlobalNotificationsSettings$203(tLObject, tL_error);
                return;
            case 21:
                this.f16063b.lambda$performLogout$322(tLObject, tL_error);
                return;
            case 22:
                this.f16063b.lambda$checkPeerColors$491(tLObject, tL_error);
                return;
            case 23:
                this.f16063b.lambda$checkPeerColors$493(tLObject, tL_error);
                return;
            case 24:
                this.f16063b.lambda$loadSuggestedFilters$25(tLObject, tL_error);
                return;
            case 25:
                this.f16063b.lambda$toggleChannelInvitesHistory$288(tLObject, tL_error);
                return;
            default:
                this.f16063b.lambda$toggleChannelSignatures$284(tLObject, tL_error);
                return;
        }
    }
}
