package org.telegram.messenger;

import java.util.ArrayList;
public final class ke implements Runnable {
    public final int f20804a;
    public final MessagesStorage f20805b;
    public final ArrayList f20806c;

    public ke(int i9, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f20804a = i9;
        this.f20805b = messagesStorage;
        this.f20806c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20804a) {
            case 0:
                this.f20805b.lambda$markMessagesAsDeletedInternal$230(this.f20806c);
                return;
            case 1:
                this.f20805b.lambda$markVoiceMessageContentAsRead$216(this.f20806c);
                return;
            case 2:
                this.f20805b.lambda$emptyMessagesMedia$96(this.f20806c);
                return;
            case 3:
                this.f20805b.lambda$emptyMessagesMedia$97(this.f20806c);
                return;
            case 4:
                this.f20805b.lambda$loadUserInfo$128(this.f20806c);
                return;
            case 5:
                this.f20805b.lambda$replaceMessageIfExists$233(this.f20806c);
                return;
            case 6:
                this.f20805b.lambda$markMessagesAsDeletedByRandoms$220(this.f20806c);
                return;
            case 7:
                this.f20805b.lambda$deleteFromDownloadQueue$183(this.f20806c);
                return;
            case 8:
                this.f20805b.lambda$deleteContacts$147(this.f20806c);
                return;
            case 9:
                this.f20805b.lambda$updateMessageVerifyFlags$195(this.f20806c);
                return;
            case 10:
                this.f20805b.lambda$putMessagesInternal$198(this.f20806c);
                return;
            case 11:
                this.f20805b.lambda$putMessagesInternal$197(this.f20806c);
                return;
            case 12:
                this.f20805b.lambda$markMessagesAsDeletedByRandoms$221(this.f20806c);
                return;
            case 13:
                this.f20805b.lambda$markMessagesAsDeletedInternal$224(this.f20806c);
                return;
            case 14:
                this.f20805b.lambda$markMessagesAsDeletedInternal$227(this.f20806c);
                return;
            case 15:
                this.f20805b.lambda$onReactionsUpdate$105(this.f20806c);
                return;
            case 16:
                this.f20805b.lambda$deleteDialog$88(this.f20806c);
                return;
            case 17:
                this.f20805b.lambda$saveDialogFiltersOrder$75(this.f20806c);
                return;
            case 18:
                this.f20805b.lambda$putMessages$236(this.f20806c);
                return;
            case 19:
                this.f20805b.lambda$putMessages$237(this.f20806c);
                return;
            default:
                this.f20805b.lambda$putWebPages$187(this.f20806c);
                return;
        }
    }
}
