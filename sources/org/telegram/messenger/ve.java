package org.telegram.messenger;

import java.util.ArrayList;
public final class ve implements Runnable {
    public final int f21528a;
    public final MessagesStorage f21529b;
    public final ArrayList f21530c;

    public ve(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f21528a = i10;
        this.f21529b = messagesStorage;
        this.f21530c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f21528a) {
            case 0:
                this.f21529b.lambda$markVoiceMessageContentAsRead$219(this.f21530c);
                return;
            case 1:
                this.f21529b.lambda$deleteDialog$91(this.f21530c);
                return;
            case 2:
                this.f21529b.lambda$loadUserInfo$131(this.f21530c);
                return;
            case 3:
                this.f21529b.lambda$deleteFromDownloadQueue$186(this.f21530c);
                return;
            case 4:
                this.f21529b.lambda$deleteContacts$150(this.f21530c);
                return;
            case 5:
                this.f21529b.lambda$updateMessageVerifyFlags$198(this.f21530c);
                return;
            case 6:
                this.f21529b.lambda$replaceMessageIfExists$236(this.f21530c);
                return;
            case 7:
                this.f21529b.lambda$putWebPages$190(this.f21530c);
                return;
            case 8:
                this.f21529b.lambda$emptyMessagesMedia$99(this.f21530c);
                return;
            case 9:
                this.f21529b.lambda$emptyMessagesMedia$100(this.f21530c);
                return;
            case 10:
                this.f21529b.lambda$putMessagesInternal$201(this.f21530c);
                return;
            case 11:
                this.f21529b.lambda$putMessagesInternal$200(this.f21530c);
                return;
            case 12:
                this.f21529b.lambda$markMessagesAsDeletedByRandoms$224(this.f21530c);
                return;
            case 13:
                this.f21529b.lambda$markMessagesAsDeletedInternal$227(this.f21530c);
                return;
            case 14:
                this.f21529b.lambda$markMessagesAsDeletedInternal$230(this.f21530c);
                return;
            case 15:
                this.f21529b.lambda$markMessagesAsDeletedByRandoms$223(this.f21530c);
                return;
            case 16:
                this.f21529b.lambda$onReactionsUpdate$108(this.f21530c);
                return;
            case 17:
                this.f21529b.lambda$saveDialogFiltersOrder$78(this.f21530c);
                return;
            case 18:
                this.f21529b.lambda$putMessages$239(this.f21530c);
                return;
            case 19:
                this.f21529b.lambda$putMessages$240(this.f21530c);
                return;
            default:
                this.f21529b.lambda$markMessagesAsDeletedInternal$233(this.f21530c);
                return;
        }
    }
}
