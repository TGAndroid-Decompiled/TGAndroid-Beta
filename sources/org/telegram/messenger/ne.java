package org.telegram.messenger;

import java.util.ArrayList;
public final class ne implements Runnable {
    public final int f19062a;
    public final MessagesStorage f19063b;
    public final ArrayList f19064c;

    public ne(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19062a = i10;
        this.f19063b = messagesStorage;
        this.f19064c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19062a) {
            case 0:
                this.f19063b.lambda$markMessagesAsDeletedInternal$230(this.f19064c);
                return;
            case 1:
                this.f19063b.lambda$markVoiceMessageContentAsRead$216(this.f19064c);
                return;
            case 2:
                this.f19063b.lambda$emptyMessagesMedia$96(this.f19064c);
                return;
            case 3:
                this.f19063b.lambda$emptyMessagesMedia$97(this.f19064c);
                return;
            case 4:
                this.f19063b.lambda$loadUserInfo$128(this.f19064c);
                return;
            case 5:
                this.f19063b.lambda$replaceMessageIfExists$233(this.f19064c);
                return;
            case 6:
                this.f19063b.lambda$markMessagesAsDeletedByRandoms$220(this.f19064c);
                return;
            case 7:
                this.f19063b.lambda$deleteFromDownloadQueue$183(this.f19064c);
                return;
            case 8:
                this.f19063b.lambda$deleteContacts$147(this.f19064c);
                return;
            case 9:
                this.f19063b.lambda$updateMessageVerifyFlags$195(this.f19064c);
                return;
            case 10:
                this.f19063b.lambda$putMessagesInternal$198(this.f19064c);
                return;
            case 11:
                this.f19063b.lambda$putMessagesInternal$197(this.f19064c);
                return;
            case 12:
                this.f19063b.lambda$markMessagesAsDeletedByRandoms$221(this.f19064c);
                return;
            case 13:
                this.f19063b.lambda$markMessagesAsDeletedInternal$224(this.f19064c);
                return;
            case 14:
                this.f19063b.lambda$markMessagesAsDeletedInternal$227(this.f19064c);
                return;
            case 15:
                this.f19063b.lambda$onReactionsUpdate$105(this.f19064c);
                return;
            case 16:
                this.f19063b.lambda$deleteDialog$88(this.f19064c);
                return;
            case 17:
                this.f19063b.lambda$saveDialogFiltersOrder$75(this.f19064c);
                return;
            case 18:
                this.f19063b.lambda$putMessages$236(this.f19064c);
                return;
            case 19:
                this.f19063b.lambda$putMessages$237(this.f19064c);
                return;
            default:
                this.f19063b.lambda$putWebPages$187(this.f19064c);
                return;
        }
    }
}
