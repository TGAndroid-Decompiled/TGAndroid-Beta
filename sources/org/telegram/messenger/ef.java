package org.telegram.messenger;

import java.util.ArrayList;
public final class ef implements Runnable {
    public final int f20004a;
    public final MessagesStorage f20005b;
    public final ArrayList f20006c;

    public ef(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f20004a = i10;
        this.f20005b = messagesStorage;
        this.f20006c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20004a) {
            case 0:
                this.f20005b.lambda$deleteDialog$91(this.f20006c);
                return;
            case 1:
                this.f20005b.lambda$replaceMessageIfExists$237(this.f20006c);
                return;
            case 2:
                this.f20005b.lambda$markVoiceMessageContentAsRead$220(this.f20006c);
                return;
            case 3:
                this.f20005b.lambda$deleteFromDownloadQueue$187(this.f20006c);
                return;
            case 4:
                this.f20005b.lambda$deleteContacts$151(this.f20006c);
                return;
            case 5:
                this.f20005b.lambda$updateMessageVerifyFlags$199(this.f20006c);
                return;
            case 6:
                this.f20005b.lambda$loadUserInfo$132(this.f20006c);
                return;
            case 7:
                this.f20005b.lambda$markMessagesAsDeletedByRandoms$224(this.f20006c);
                return;
            case 8:
                this.f20005b.lambda$emptyMessagesMedia$99(this.f20006c);
                return;
            case 9:
                this.f20005b.lambda$emptyMessagesMedia$100(this.f20006c);
                return;
            case 10:
                this.f20005b.lambda$putMessagesInternal$202(this.f20006c);
                return;
            case 11:
                this.f20005b.lambda$putMessagesInternal$201(this.f20006c);
                return;
            case 12:
                this.f20005b.lambda$markMessagesAsDeletedByRandoms$225(this.f20006c);
                return;
            case 13:
                this.f20005b.lambda$markMessagesAsDeletedInternal$228(this.f20006c);
                return;
            case 14:
                this.f20005b.lambda$markMessagesAsDeletedInternal$231(this.f20006c);
                return;
            case 15:
                this.f20005b.lambda$onReactionsUpdate$109(this.f20006c);
                return;
            case 16:
                this.f20005b.lambda$putMessages$240(this.f20006c);
                return;
            case 17:
                this.f20005b.lambda$putMessages$241(this.f20006c);
                return;
            case 18:
                this.f20005b.lambda$putWebPages$191(this.f20006c);
                return;
            case 19:
                this.f20005b.lambda$saveDialogFiltersOrder$78(this.f20006c);
                return;
            default:
                this.f20005b.lambda$markMessagesAsDeletedInternal$234(this.f20006c);
                return;
        }
    }
}
