package org.telegram.messenger;

import java.util.ArrayList;
public final class se implements Runnable {
    public final int f18983a;
    public final MessagesStorage f18984b;
    public final ArrayList f18985c;
    public final long d;

    public se(MessagesStorage messagesStorage, long j3, ArrayList arrayList, int i10) {
        this.f18983a = i10;
        this.f18984b = messagesStorage;
        this.d = j3;
        this.f18985c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18983a) {
            case 0:
                this.f18984b.lambda$deleteUserChatHistory$86(this.f18985c, this.d);
                return;
            case 1:
                this.f18984b.lambda$emptyMessagesMedia$99(this.f18985c, this.d);
                return;
            case 2:
                this.f18984b.lambda$deleteSavedDialog$54(this.d, this.f18985c);
                return;
            case 3:
                this.f18984b.lambda$updateChannelUsers$125(this.d, this.f18985c);
                return;
            case 4:
                this.f18984b.lambda$markVoiceMessageContentAsRead$217(this.f18985c, this.d);
                return;
            case 5:
                this.f18984b.lambda$markMessagesAsDeletedInternal$226(this.f18985c, this.d);
                return;
            case 6:
                this.f18984b.lambda$removeTopics$58(this.f18985c, this.d);
                return;
            default:
                this.f18984b.lambda$createTaskForSecretChat$117(this.d, this.f18985c);
                return;
        }
    }

    public se(MessagesStorage messagesStorage, ArrayList arrayList, long j3, int i10) {
        this.f18983a = i10;
        this.f18984b = messagesStorage;
        this.f18985c = arrayList;
        this.d = j3;
    }
}
