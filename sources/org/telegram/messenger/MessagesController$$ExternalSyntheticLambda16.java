package org.telegram.messenger;

import java.io.FileNotFoundException;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class MessagesController$$ExternalSyntheticLambda16 implements RequestDelegate {
    public final int $r8$classId;
    public final MessagesController f$0;

    public MessagesController$$ExternalSyntheticLambda16(MessagesController messagesController, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$sendBotStart$293(tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$updateTimerProc$152(tLObject, tL_error);
                break;
            case 2:
                this.f$0.lambda$updateTimerProc$153(tLObject, tL_error);
                break;
            case 3:
                this.f$0.lambda$loadCurrentState$325(tLObject, tL_error);
                break;
            case 4:
                this.f$0.lambda$getContentSettings$502(tLObject, tL_error);
                break;
            case 5:
                this.f$0.lambda$loadSignUpNotificationsSettings$207(tLObject, tL_error);
                break;
            case 6:
                this.f$0.lambda$reloadDialogsReadValue$64(tLObject, tL_error);
                break;
            case 7:
                this.f$0.lambda$completeReadTask$238(tLObject, tL_error);
                break;
            case 8:
                this.f$0.lambda$markMentionMessageAsRead$234(tLObject, tL_error);
                break;
            case 9:
                this.f$0.lambda$toggleChannelForum$286(tLObject, tL_error);
                break;
            case 10:
                this.f$0.lambda$setDialogHistoryTTL$137(tLObject, tL_error);
                break;
            case 11:
                this.f$0.lambda$loadUnreadDialogs$362(tLObject, tL_error);
                break;
            case 12:
                this.f$0.lambda$checkTosUpdate$163(tLObject, tL_error);
                break;
            case 13:
                this.f$0.lambda$reloadReactionsNotifySettings$205(tLObject, tL_error);
                break;
            case 14:
                this.f$0.lambda$loadHintDialogs$196(tLObject, tL_error);
                break;
            case 15:
                this.f$0.lambda$reloadUser$56(tLObject, tL_error);
                break;
            case 16:
                this.f$0.lambda$processUpdateArray$414(tLObject, tL_error);
                break;
            case 17:
                this.f$0.lambda$markMessageContentAsRead$232(tLObject, tL_error);
                break;
            case 18:
                this.f$0.lambda$loadRemoteFilters$30(tLObject, tL_error);
                break;
            case 19:
                this.f$0.lambda$didReceivedNotification$43(tLObject, tL_error);
                break;
            case 20:
                this.f$0.lambda$loadGlobalNotificationsSettings$203(tLObject, tL_error);
                break;
            case 21:
                this.f$0.lambda$performLogout$322(tLObject, tL_error);
                break;
            case 22:
                this.f$0.lambda$checkPeerColors$491(tLObject, tL_error);
                break;
            case 23:
                this.f$0.lambda$checkPeerColors$493(tLObject, tL_error);
                break;
            case 24:
                this.f$0.lambda$loadSuggestedFilters$25(tLObject, tL_error);
                break;
            case 25:
                this.f$0.lambda$toggleChannelInvitesHistory$288(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$toggleChannelSignatures$284(tLObject, tL_error);
                break;
        }
    }
}
