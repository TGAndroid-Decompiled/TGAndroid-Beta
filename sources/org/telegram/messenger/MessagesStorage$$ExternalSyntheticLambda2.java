package org.telegram.messenger;

import java.util.ArrayList;

public final class MessagesStorage$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;
    public final ArrayList f$1;

    public MessagesStorage$$ExternalSyntheticLambda2(int i, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.$r8$classId = i;
        this.f$0 = messagesStorage;
        this.f$1 = arrayList;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onReactionsUpdate$105(this.f$1);
                break;
            case 1:
                this.f$0.lambda$markMessagesAsDeletedInternal$230(this.f$1);
                break;
            case 2:
                this.f$0.lambda$markVoiceMessageContentAsRead$216(this.f$1);
                break;
            case 3:
                this.f$0.lambda$emptyMessagesMedia$96(this.f$1);
                break;
            case 4:
                this.f$0.lambda$emptyMessagesMedia$97(this.f$1);
                break;
            case 5:
                this.f$0.lambda$loadUserInfo$128(this.f$1);
                break;
            case 6:
                this.f$0.lambda$replaceMessageIfExists$233(this.f$1);
                break;
            case 7:
                this.f$0.lambda$markMessagesAsDeletedByRandoms$220(this.f$1);
                break;
            case 8:
                this.f$0.lambda$deleteFromDownloadQueue$183(this.f$1);
                break;
            case 9:
                this.f$0.lambda$deleteContacts$147(this.f$1);
                break;
            case 10:
                this.f$0.lambda$updateMessageVerifyFlags$195(this.f$1);
                break;
            case 11:
                this.f$0.lambda$putMessagesInternal$198(this.f$1);
                break;
            case 12:
                this.f$0.lambda$putMessagesInternal$197(this.f$1);
                break;
            case 13:
                this.f$0.lambda$markMessagesAsDeletedByRandoms$221(this.f$1);
                break;
            case 14:
                this.f$0.lambda$markMessagesAsDeletedInternal$224(this.f$1);
                break;
            case 15:
                this.f$0.lambda$markMessagesAsDeletedInternal$227(this.f$1);
                break;
            case 16:
                this.f$0.lambda$deleteDialog$88(this.f$1);
                break;
            case 17:
                this.f$0.lambda$saveDialogFiltersOrder$75(this.f$1);
                break;
            case 18:
                this.f$0.lambda$putMessages$236(this.f$1);
                break;
            case 19:
                this.f$0.lambda$putMessages$237(this.f$1);
                break;
            default:
                this.f$0.lambda$putWebPages$187(this.f$1);
                break;
        }
    }
}
