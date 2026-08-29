package org.telegram.messenger;

import java.util.ArrayList;
public final class re implements Runnable {
    public final int f21454a;
    public final MessagesStorage f21455b;
    public final ArrayList f21456c;

    public re(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f21454a = i10;
        this.f21455b = messagesStorage;
        this.f21456c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f21454a) {
            case 0:
                this.f21455b.lambda$markMessagesAsDeletedInternal$230(this.f21456c);
                return;
            case 1:
                this.f21455b.lambda$markVoiceMessageContentAsRead$216(this.f21456c);
                return;
            case 2:
                this.f21455b.lambda$emptyMessagesMedia$96(this.f21456c);
                return;
            case 3:
                this.f21455b.lambda$emptyMessagesMedia$97(this.f21456c);
                return;
            case 4:
                this.f21455b.lambda$loadUserInfo$128(this.f21456c);
                return;
            case 5:
                this.f21455b.lambda$replaceMessageIfExists$233(this.f21456c);
                return;
            case 6:
                this.f21455b.lambda$markMessagesAsDeletedByRandoms$220(this.f21456c);
                return;
            case 7:
                this.f21455b.lambda$deleteFromDownloadQueue$183(this.f21456c);
                return;
            case 8:
                this.f21455b.lambda$deleteContacts$147(this.f21456c);
                return;
            case 9:
                this.f21455b.lambda$updateMessageVerifyFlags$195(this.f21456c);
                return;
            case 10:
                this.f21455b.lambda$putMessagesInternal$198(this.f21456c);
                return;
            case 11:
                this.f21455b.lambda$putMessagesInternal$197(this.f21456c);
                return;
            case 12:
                this.f21455b.lambda$markMessagesAsDeletedByRandoms$221(this.f21456c);
                return;
            case 13:
                this.f21455b.lambda$markMessagesAsDeletedInternal$224(this.f21456c);
                return;
            case 14:
                this.f21455b.lambda$markMessagesAsDeletedInternal$227(this.f21456c);
                return;
            case 15:
                this.f21455b.lambda$onReactionsUpdate$105(this.f21456c);
                return;
            case 16:
                this.f21455b.lambda$deleteDialog$88(this.f21456c);
                return;
            case 17:
                this.f21455b.lambda$saveDialogFiltersOrder$75(this.f21456c);
                return;
            case 18:
                this.f21455b.lambda$putMessages$236(this.f21456c);
                return;
            case 19:
                this.f21455b.lambda$putMessages$237(this.f21456c);
                return;
            default:
                this.f21455b.lambda$putWebPages$187(this.f21456c);
                return;
        }
    }
}
