package org.telegram.messenger;

import java.util.ArrayList;
public final class re implements Runnable {
    public final int f17452a;
    public final MessagesStorage f17453b;
    public final ArrayList f17454c;
    public final long d;

    public re(MessagesStorage messagesStorage, long j3, ArrayList arrayList, int i10) {
        this.f17452a = i10;
        this.f17453b = messagesStorage;
        this.d = j3;
        this.f17454c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17452a) {
            case 0:
                this.f17453b.lambda$deleteUserChatHistory$86(this.f17454c, this.d);
                return;
            case 1:
                this.f17453b.lambda$emptyMessagesMedia$99(this.f17454c, this.d);
                return;
            case 2:
                this.f17453b.lambda$deleteSavedDialog$54(this.d, this.f17454c);
                return;
            case 3:
                this.f17453b.lambda$updateChannelUsers$125(this.d, this.f17454c);
                return;
            case 4:
                this.f17453b.lambda$markVoiceMessageContentAsRead$217(this.f17454c, this.d);
                return;
            case 5:
                this.f17453b.lambda$markMessagesAsDeletedInternal$226(this.f17454c, this.d);
                return;
            case 6:
                this.f17453b.lambda$removeTopics$58(this.f17454c, this.d);
                return;
            default:
                this.f17453b.lambda$createTaskForSecretChat$117(this.d, this.f17454c);
                return;
        }
    }

    public re(MessagesStorage messagesStorage, ArrayList arrayList, long j3, int i10) {
        this.f17452a = i10;
        this.f17453b = messagesStorage;
        this.f17454c = arrayList;
        this.d = j3;
    }
}
