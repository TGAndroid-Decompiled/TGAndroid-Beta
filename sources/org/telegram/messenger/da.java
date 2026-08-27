package org.telegram.messenger;

import java.io.FileNotFoundException;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class da implements RequestDelegate {

    public final int f20037a;

    public final MessagesController f20038b;

    public da(MessagesController messagesController, int i10) {
        this.f20037a = i10;
        this.f20038b = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        switch (this.f20037a) {
            case 0:
                this.f20038b.lambda$updateTimerProc$152(tLObject, tL_error);
                break;
            case 1:
                this.f20038b.lambda$updateTimerProc$153(tLObject, tL_error);
                break;
            case 2:
                this.f20038b.lambda$loadCurrentState$325(tLObject, tL_error);
                break;
            case 3:
                this.f20038b.lambda$getContentSettings$502(tLObject, tL_error);
                break;
            case 4:
                this.f20038b.lambda$sendBotStart$293(tLObject, tL_error);
                break;
            case 5:
                this.f20038b.lambda$loadSignUpNotificationsSettings$207(tLObject, tL_error);
                break;
            case 6:
                this.f20038b.lambda$reloadDialogsReadValue$64(tLObject, tL_error);
                break;
            case 7:
                this.f20038b.lambda$completeReadTask$238(tLObject, tL_error);
                break;
            case 8:
                this.f20038b.lambda$markMentionMessageAsRead$234(tLObject, tL_error);
                break;
            case 9:
                this.f20038b.lambda$toggleChannelForum$286(tLObject, tL_error);
                break;
            case 10:
                this.f20038b.lambda$setDialogHistoryTTL$137(tLObject, tL_error);
                break;
            case 11:
                this.f20038b.lambda$loadUnreadDialogs$362(tLObject, tL_error);
                break;
            case 12:
                this.f20038b.lambda$checkTosUpdate$163(tLObject, tL_error);
                break;
            case 13:
                this.f20038b.lambda$reloadReactionsNotifySettings$205(tLObject, tL_error);
                break;
            case 14:
                this.f20038b.lambda$loadHintDialogs$196(tLObject, tL_error);
                break;
            case 15:
                this.f20038b.lambda$reloadUser$56(tLObject, tL_error);
                break;
            case 16:
                this.f20038b.lambda$processUpdateArray$414(tLObject, tL_error);
                break;
            case 17:
                this.f20038b.lambda$markMessageContentAsRead$232(tLObject, tL_error);
                break;
            case 18:
                this.f20038b.lambda$loadRemoteFilters$30(tLObject, tL_error);
                break;
            case 19:
                this.f20038b.lambda$didReceivedNotification$43(tLObject, tL_error);
                break;
            case 20:
                this.f20038b.lambda$loadGlobalNotificationsSettings$203(tLObject, tL_error);
                break;
            case 21:
                this.f20038b.lambda$performLogout$322(tLObject, tL_error);
                break;
            case 22:
                this.f20038b.lambda$checkPeerColors$491(tLObject, tL_error);
                break;
            case 23:
                this.f20038b.lambda$checkPeerColors$493(tLObject, tL_error);
                break;
            case 24:
                this.f20038b.lambda$loadSuggestedFilters$25(tLObject, tL_error);
                break;
            case 25:
                this.f20038b.lambda$toggleChannelInvitesHistory$288(tLObject, tL_error);
                break;
            default:
                this.f20038b.lambda$toggleChannelSignatures$284(tLObject, tL_error);
                break;
        }
    }
}
