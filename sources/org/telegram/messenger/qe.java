package org.telegram.messenger;

import java.util.ArrayList;
public final class qe implements Runnable {
    public final int f19328a;
    public final MessagesStorage f19329b;
    public final ArrayList f19330c;

    public qe(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19328a = i10;
        this.f19329b = messagesStorage;
        this.f19330c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19328a) {
            case 0:
                this.f19329b.lambda$markMessagesAsDeletedInternal$230(this.f19330c);
                return;
            case 1:
                this.f19329b.lambda$markVoiceMessageContentAsRead$216(this.f19330c);
                return;
            case 2:
                this.f19329b.lambda$emptyMessagesMedia$96(this.f19330c);
                return;
            case 3:
                this.f19329b.lambda$emptyMessagesMedia$97(this.f19330c);
                return;
            case 4:
                this.f19329b.lambda$loadUserInfo$128(this.f19330c);
                return;
            case 5:
                this.f19329b.lambda$replaceMessageIfExists$233(this.f19330c);
                return;
            case 6:
                this.f19329b.lambda$markMessagesAsDeletedByRandoms$220(this.f19330c);
                return;
            case 7:
                this.f19329b.lambda$deleteFromDownloadQueue$183(this.f19330c);
                return;
            case 8:
                this.f19329b.lambda$deleteContacts$147(this.f19330c);
                return;
            case 9:
                this.f19329b.lambda$updateMessageVerifyFlags$195(this.f19330c);
                return;
            case 10:
                this.f19329b.lambda$putMessagesInternal$198(this.f19330c);
                return;
            case 11:
                this.f19329b.lambda$putMessagesInternal$197(this.f19330c);
                return;
            case 12:
                this.f19329b.lambda$markMessagesAsDeletedByRandoms$221(this.f19330c);
                return;
            case 13:
                this.f19329b.lambda$markMessagesAsDeletedInternal$224(this.f19330c);
                return;
            case 14:
                this.f19329b.lambda$markMessagesAsDeletedInternal$227(this.f19330c);
                return;
            case 15:
                this.f19329b.lambda$onReactionsUpdate$105(this.f19330c);
                return;
            case 16:
                this.f19329b.lambda$deleteDialog$88(this.f19330c);
                return;
            case 17:
                this.f19329b.lambda$saveDialogFiltersOrder$75(this.f19330c);
                return;
            case 18:
                this.f19329b.lambda$putMessages$236(this.f19330c);
                return;
            case 19:
                this.f19329b.lambda$putMessages$237(this.f19330c);
                return;
            default:
                this.f19329b.lambda$putWebPages$187(this.f19330c);
                return;
        }
    }
}
