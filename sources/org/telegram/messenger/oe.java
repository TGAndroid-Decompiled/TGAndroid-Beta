package org.telegram.messenger;

import java.util.ArrayList;
public final class oe implements Runnable {
    public final int f16960a;
    public final MessagesStorage f16961b;
    public final ArrayList f16962c;

    public oe(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f16960a = i10;
        this.f16961b = messagesStorage;
        this.f16962c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16960a) {
            case 0:
                this.f16961b.lambda$markMessagesAsDeletedInternal$230(this.f16962c);
                return;
            case 1:
                this.f16961b.lambda$markVoiceMessageContentAsRead$216(this.f16962c);
                return;
            case 2:
                this.f16961b.lambda$emptyMessagesMedia$96(this.f16962c);
                return;
            case 3:
                this.f16961b.lambda$emptyMessagesMedia$97(this.f16962c);
                return;
            case 4:
                this.f16961b.lambda$loadUserInfo$128(this.f16962c);
                return;
            case 5:
                this.f16961b.lambda$replaceMessageIfExists$233(this.f16962c);
                return;
            case 6:
                this.f16961b.lambda$markMessagesAsDeletedByRandoms$220(this.f16962c);
                return;
            case 7:
                this.f16961b.lambda$deleteFromDownloadQueue$183(this.f16962c);
                return;
            case 8:
                this.f16961b.lambda$deleteContacts$147(this.f16962c);
                return;
            case 9:
                this.f16961b.lambda$updateMessageVerifyFlags$195(this.f16962c);
                return;
            case 10:
                this.f16961b.lambda$putMessagesInternal$198(this.f16962c);
                return;
            case 11:
                this.f16961b.lambda$putMessagesInternal$197(this.f16962c);
                return;
            case 12:
                this.f16961b.lambda$markMessagesAsDeletedByRandoms$221(this.f16962c);
                return;
            case 13:
                this.f16961b.lambda$markMessagesAsDeletedInternal$224(this.f16962c);
                return;
            case 14:
                this.f16961b.lambda$markMessagesAsDeletedInternal$227(this.f16962c);
                return;
            case 15:
                this.f16961b.lambda$onReactionsUpdate$105(this.f16962c);
                return;
            case 16:
                this.f16961b.lambda$deleteDialog$88(this.f16962c);
                return;
            case 17:
                this.f16961b.lambda$saveDialogFiltersOrder$75(this.f16962c);
                return;
            case 18:
                this.f16961b.lambda$putMessages$236(this.f16962c);
                return;
            case 19:
                this.f16961b.lambda$putMessages$237(this.f16962c);
                return;
            default:
                this.f16961b.lambda$putWebPages$187(this.f16962c);
                return;
        }
    }
}
