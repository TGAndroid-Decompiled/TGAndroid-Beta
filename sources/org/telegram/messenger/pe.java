package org.telegram.messenger;

import java.util.ArrayList;
public final class pe implements Runnable {
    public final int f17055a;
    public final MessagesStorage f17056b;
    public final ArrayList f17057c;

    public pe(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f17055a = i10;
        this.f17056b = messagesStorage;
        this.f17057c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17055a) {
            case 0:
                this.f17056b.lambda$markMessagesAsDeletedInternal$230(this.f17057c);
                return;
            case 1:
                this.f17056b.lambda$markVoiceMessageContentAsRead$216(this.f17057c);
                return;
            case 2:
                this.f17056b.lambda$emptyMessagesMedia$96(this.f17057c);
                return;
            case 3:
                this.f17056b.lambda$emptyMessagesMedia$97(this.f17057c);
                return;
            case 4:
                this.f17056b.lambda$loadUserInfo$128(this.f17057c);
                return;
            case 5:
                this.f17056b.lambda$replaceMessageIfExists$233(this.f17057c);
                return;
            case 6:
                this.f17056b.lambda$markMessagesAsDeletedByRandoms$220(this.f17057c);
                return;
            case 7:
                this.f17056b.lambda$deleteFromDownloadQueue$183(this.f17057c);
                return;
            case 8:
                this.f17056b.lambda$deleteContacts$147(this.f17057c);
                return;
            case 9:
                this.f17056b.lambda$updateMessageVerifyFlags$195(this.f17057c);
                return;
            case 10:
                this.f17056b.lambda$putMessagesInternal$198(this.f17057c);
                return;
            case 11:
                this.f17056b.lambda$putMessagesInternal$197(this.f17057c);
                return;
            case 12:
                this.f17056b.lambda$markMessagesAsDeletedByRandoms$221(this.f17057c);
                return;
            case 13:
                this.f17056b.lambda$markMessagesAsDeletedInternal$224(this.f17057c);
                return;
            case 14:
                this.f17056b.lambda$markMessagesAsDeletedInternal$227(this.f17057c);
                return;
            case 15:
                this.f17056b.lambda$onReactionsUpdate$105(this.f17057c);
                return;
            case 16:
                this.f17056b.lambda$deleteDialog$88(this.f17057c);
                return;
            case 17:
                this.f17056b.lambda$saveDialogFiltersOrder$75(this.f17057c);
                return;
            case 18:
                this.f17056b.lambda$putMessages$236(this.f17057c);
                return;
            case 19:
                this.f17056b.lambda$putMessages$237(this.f17057c);
                return;
            default:
                this.f17056b.lambda$putWebPages$187(this.f17057c);
                return;
        }
    }
}
