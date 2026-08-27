package org.telegram.messenger;

import java.util.ArrayList;

public final class oe implements Runnable {

    public final int f21178a;

    public final MessagesStorage f21179b;

    public final ArrayList f21180c;

    public oe(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f21178a = i10;
        this.f21179b = messagesStorage;
        this.f21180c = arrayList;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f21178a) {
            case 0:
                this.f21179b.lambda$markMessagesAsDeletedInternal$230(this.f21180c);
                break;
            case 1:
                this.f21179b.lambda$markVoiceMessageContentAsRead$216(this.f21180c);
                break;
            case 2:
                this.f21179b.lambda$emptyMessagesMedia$96(this.f21180c);
                break;
            case 3:
                this.f21179b.lambda$emptyMessagesMedia$97(this.f21180c);
                break;
            case 4:
                this.f21179b.lambda$loadUserInfo$128(this.f21180c);
                break;
            case 5:
                this.f21179b.lambda$replaceMessageIfExists$233(this.f21180c);
                break;
            case 6:
                this.f21179b.lambda$markMessagesAsDeletedByRandoms$220(this.f21180c);
                break;
            case 7:
                this.f21179b.lambda$deleteFromDownloadQueue$183(this.f21180c);
                break;
            case 8:
                this.f21179b.lambda$deleteContacts$147(this.f21180c);
                break;
            case 9:
                this.f21179b.lambda$updateMessageVerifyFlags$195(this.f21180c);
                break;
            case 10:
                this.f21179b.lambda$putMessagesInternal$198(this.f21180c);
                break;
            case 11:
                this.f21179b.lambda$putMessagesInternal$197(this.f21180c);
                break;
            case 12:
                this.f21179b.lambda$markMessagesAsDeletedByRandoms$221(this.f21180c);
                break;
            case 13:
                this.f21179b.lambda$markMessagesAsDeletedInternal$224(this.f21180c);
                break;
            case 14:
                this.f21179b.lambda$markMessagesAsDeletedInternal$227(this.f21180c);
                break;
            case 15:
                this.f21179b.lambda$onReactionsUpdate$105(this.f21180c);
                break;
            case 16:
                this.f21179b.lambda$deleteDialog$88(this.f21180c);
                break;
            case 17:
                this.f21179b.lambda$saveDialogFiltersOrder$75(this.f21180c);
                break;
            case 18:
                this.f21179b.lambda$putMessages$236(this.f21180c);
                break;
            case 19:
                this.f21179b.lambda$putMessages$237(this.f21180c);
                break;
            default:
                this.f21179b.lambda$putWebPages$187(this.f21180c);
                break;
        }
    }
}
