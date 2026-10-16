package org.telegram.messenger;

import java.util.ArrayList;
public final class re implements Runnable {
    public final int f18008a;
    public final MessagesStorage f18009b;
    public final ArrayList f18010c;

    public re(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f18008a = i10;
        this.f18009b = messagesStorage;
        this.f18010c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18008a) {
            case 0:
                this.f18009b.lambda$markMessagesAsDeletedInternal$230(this.f18010c);
                return;
            case 1:
                this.f18009b.lambda$markVoiceMessageContentAsRead$216(this.f18010c);
                return;
            case 2:
                this.f18009b.lambda$emptyMessagesMedia$96(this.f18010c);
                return;
            case 3:
                this.f18009b.lambda$emptyMessagesMedia$97(this.f18010c);
                return;
            case 4:
                this.f18009b.lambda$loadUserInfo$128(this.f18010c);
                return;
            case 5:
                this.f18009b.lambda$replaceMessageIfExists$233(this.f18010c);
                return;
            case 6:
                this.f18009b.lambda$markMessagesAsDeletedByRandoms$220(this.f18010c);
                return;
            case 7:
                this.f18009b.lambda$deleteFromDownloadQueue$183(this.f18010c);
                return;
            case 8:
                this.f18009b.lambda$deleteContacts$147(this.f18010c);
                return;
            case 9:
                this.f18009b.lambda$updateMessageVerifyFlags$195(this.f18010c);
                return;
            case 10:
                this.f18009b.lambda$putMessagesInternal$198(this.f18010c);
                return;
            case 11:
                this.f18009b.lambda$putMessagesInternal$197(this.f18010c);
                return;
            case 12:
                this.f18009b.lambda$markMessagesAsDeletedByRandoms$221(this.f18010c);
                return;
            case 13:
                this.f18009b.lambda$markMessagesAsDeletedInternal$224(this.f18010c);
                return;
            case 14:
                this.f18009b.lambda$markMessagesAsDeletedInternal$227(this.f18010c);
                return;
            case 15:
                this.f18009b.lambda$onReactionsUpdate$105(this.f18010c);
                return;
            case 16:
                this.f18009b.lambda$deleteDialog$88(this.f18010c);
                return;
            case 17:
                this.f18009b.lambda$saveDialogFiltersOrder$75(this.f18010c);
                return;
            case 18:
                this.f18009b.lambda$putMessages$236(this.f18010c);
                return;
            case 19:
                this.f18009b.lambda$putMessages$237(this.f18010c);
                return;
            default:
                this.f18009b.lambda$putWebPages$187(this.f18010c);
                return;
        }
    }
}
