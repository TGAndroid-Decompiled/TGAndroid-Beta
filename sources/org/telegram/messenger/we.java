package org.telegram.messenger;

import java.util.ArrayList;
public final class we implements Runnable {
    public final int f21758a;
    public final MessagesStorage f21759b;
    public final long f21760c;
    public final ArrayList d;

    public we(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.f21758a = i10;
        this.f21759b = messagesStorage;
        this.f21760c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f21758a) {
            case 0:
                this.f21759b.lambda$updateChannelUsers$128(this.f21760c, this.d);
                return;
            case 1:
                this.f21759b.lambda$deleteSavedDialog$57(this.f21760c, this.d);
                return;
            case 2:
                this.f21759b.lambda$markVoiceMessageContentAsRead$220(this.d, this.f21760c);
                return;
            case 3:
                this.f21759b.lambda$markMessagesAsDeletedInternal$229(this.d, this.f21760c);
                return;
            case 4:
                this.f21759b.lambda$createTaskForSecretChat$120(this.f21760c, this.d);
                return;
            case 5:
                this.f21759b.lambda$deleteUserChatHistory$89(this.d, this.f21760c);
                return;
            case 6:
                this.f21759b.lambda$removeTopics$61(this.d, this.f21760c);
                return;
            default:
                this.f21759b.lambda$emptyMessagesMedia$102(this.d, this.f21760c);
                return;
        }
    }

    public we(MessagesStorage messagesStorage, ArrayList arrayList, long j10, int i10) {
        this.f21758a = i10;
        this.f21759b = messagesStorage;
        this.d = arrayList;
        this.f21760c = j10;
    }
}
