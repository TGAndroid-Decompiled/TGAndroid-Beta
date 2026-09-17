package org.telegram.messenger;

import java.util.ArrayList;
public final class oe implements Runnable {
    public final int f18621a;
    public final MessagesStorage f18622b;
    public final ArrayList f18623c;

    public oe(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f18621a = i10;
        this.f18622b = messagesStorage;
        this.f18623c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18621a) {
            case 0:
                this.f18622b.lambda$markMessagesAsDeletedInternal$230(this.f18623c);
                return;
            case 1:
                this.f18622b.lambda$markVoiceMessageContentAsRead$216(this.f18623c);
                return;
            case 2:
                this.f18622b.lambda$emptyMessagesMedia$96(this.f18623c);
                return;
            case 3:
                this.f18622b.lambda$emptyMessagesMedia$97(this.f18623c);
                return;
            case 4:
                this.f18622b.lambda$loadUserInfo$128(this.f18623c);
                return;
            case 5:
                this.f18622b.lambda$replaceMessageIfExists$233(this.f18623c);
                return;
            case 6:
                this.f18622b.lambda$markMessagesAsDeletedByRandoms$220(this.f18623c);
                return;
            case 7:
                this.f18622b.lambda$deleteFromDownloadQueue$183(this.f18623c);
                return;
            case 8:
                this.f18622b.lambda$deleteContacts$147(this.f18623c);
                return;
            case 9:
                this.f18622b.lambda$updateMessageVerifyFlags$195(this.f18623c);
                return;
            case 10:
                this.f18622b.lambda$putMessagesInternal$198(this.f18623c);
                return;
            case 11:
                this.f18622b.lambda$putMessagesInternal$197(this.f18623c);
                return;
            case 12:
                this.f18622b.lambda$markMessagesAsDeletedByRandoms$221(this.f18623c);
                return;
            case 13:
                this.f18622b.lambda$markMessagesAsDeletedInternal$224(this.f18623c);
                return;
            case 14:
                this.f18622b.lambda$markMessagesAsDeletedInternal$227(this.f18623c);
                return;
            case 15:
                this.f18622b.lambda$onReactionsUpdate$105(this.f18623c);
                return;
            case 16:
                this.f18622b.lambda$deleteDialog$88(this.f18623c);
                return;
            case 17:
                this.f18622b.lambda$saveDialogFiltersOrder$75(this.f18623c);
                return;
            case 18:
                this.f18622b.lambda$putMessages$236(this.f18623c);
                return;
            case 19:
                this.f18622b.lambda$putMessages$237(this.f18623c);
                return;
            default:
                this.f18622b.lambda$putWebPages$187(this.f18623c);
                return;
        }
    }
}
