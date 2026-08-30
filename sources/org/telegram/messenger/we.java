package org.telegram.messenger;

import java.util.ArrayList;
public final class we implements Runnable {
    public final int f18903a;
    public final MessagesStorage f18904b;
    public final ArrayList f18905c;
    public final long d;

    public we(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.f18903a = i10;
        this.f18904b = messagesStorage;
        this.d = j10;
        this.f18905c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18903a) {
            case 0:
                this.f18904b.lambda$deleteUserChatHistory$86(this.f18905c, this.d);
                return;
            case 1:
                this.f18904b.lambda$emptyMessagesMedia$99(this.f18905c, this.d);
                return;
            case 2:
                this.f18904b.lambda$deleteSavedDialog$54(this.d, this.f18905c);
                return;
            case 3:
                this.f18904b.lambda$updateChannelUsers$125(this.d, this.f18905c);
                return;
            case 4:
                this.f18904b.lambda$markVoiceMessageContentAsRead$217(this.f18905c, this.d);
                return;
            case 5:
                this.f18904b.lambda$markMessagesAsDeletedInternal$226(this.f18905c, this.d);
                return;
            case 6:
                this.f18904b.lambda$removeTopics$58(this.f18905c, this.d);
                return;
            default:
                this.f18904b.lambda$createTaskForSecretChat$117(this.d, this.f18905c);
                return;
        }
    }

    public we(MessagesStorage messagesStorage, ArrayList arrayList, long j10, int i10) {
        this.f18903a = i10;
        this.f18904b = messagesStorage;
        this.f18905c = arrayList;
        this.d = j10;
    }
}
