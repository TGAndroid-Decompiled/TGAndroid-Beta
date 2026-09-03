package org.telegram.messenger;

import java.util.ArrayList;
public final class we implements Runnable {
    public final int f20547a;
    public final MessagesStorage f20548b;
    public final ArrayList f20549c;
    public final long d;

    public we(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.f20547a = i10;
        this.f20548b = messagesStorage;
        this.d = j10;
        this.f20549c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20547a) {
            case 0:
                this.f20548b.lambda$deleteUserChatHistory$86(this.f20549c, this.d);
                return;
            case 1:
                this.f20548b.lambda$emptyMessagesMedia$99(this.f20549c, this.d);
                return;
            case 2:
                this.f20548b.lambda$deleteSavedDialog$54(this.d, this.f20549c);
                return;
            case 3:
                this.f20548b.lambda$updateChannelUsers$125(this.d, this.f20549c);
                return;
            case 4:
                this.f20548b.lambda$markVoiceMessageContentAsRead$217(this.f20549c, this.d);
                return;
            case 5:
                this.f20548b.lambda$markMessagesAsDeletedInternal$226(this.f20549c, this.d);
                return;
            case 6:
                this.f20548b.lambda$removeTopics$58(this.f20549c, this.d);
                return;
            default:
                this.f20548b.lambda$createTaskForSecretChat$117(this.d, this.f20549c);
                return;
        }
    }

    public we(MessagesStorage messagesStorage, ArrayList arrayList, long j10, int i10) {
        this.f20547a = i10;
        this.f20548b = messagesStorage;
        this.f20549c = arrayList;
        this.d = j10;
    }
}
