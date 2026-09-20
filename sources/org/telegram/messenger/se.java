package org.telegram.messenger;

import java.util.ArrayList;
public final class se implements Runnable {
    public final int f17530a;
    public final MessagesStorage f17531b;
    public final ArrayList f17532c;
    public final long d;

    public se(MessagesStorage messagesStorage, long j3, ArrayList arrayList, int i10) {
        this.f17530a = i10;
        this.f17531b = messagesStorage;
        this.d = j3;
        this.f17532c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17530a) {
            case 0:
                this.f17531b.lambda$deleteUserChatHistory$86(this.f17532c, this.d);
                return;
            case 1:
                this.f17531b.lambda$emptyMessagesMedia$99(this.f17532c, this.d);
                return;
            case 2:
                this.f17531b.lambda$deleteSavedDialog$54(this.d, this.f17532c);
                return;
            case 3:
                this.f17531b.lambda$updateChannelUsers$125(this.d, this.f17532c);
                return;
            case 4:
                this.f17531b.lambda$markVoiceMessageContentAsRead$217(this.f17532c, this.d);
                return;
            case 5:
                this.f17531b.lambda$markMessagesAsDeletedInternal$226(this.f17532c, this.d);
                return;
            case 6:
                this.f17531b.lambda$removeTopics$58(this.f17532c, this.d);
                return;
            default:
                this.f17531b.lambda$createTaskForSecretChat$117(this.d, this.f17532c);
                return;
        }
    }

    public se(MessagesStorage messagesStorage, ArrayList arrayList, long j3, int i10) {
        this.f17530a = i10;
        this.f17531b = messagesStorage;
        this.f17532c = arrayList;
        this.d = j3;
    }
}
