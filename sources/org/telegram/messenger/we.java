package org.telegram.messenger;

import java.util.ArrayList;
public final class we implements Runnable {
    public final int f20545a;
    public final MessagesStorage f20546b;
    public final ArrayList f20547c;
    public final long d;

    public we(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.f20545a = i10;
        this.f20546b = messagesStorage;
        this.d = j10;
        this.f20547c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20545a) {
            case 0:
                this.f20546b.lambda$deleteUserChatHistory$86(this.f20547c, this.d);
                return;
            case 1:
                this.f20546b.lambda$emptyMessagesMedia$99(this.f20547c, this.d);
                return;
            case 2:
                this.f20546b.lambda$deleteSavedDialog$54(this.d, this.f20547c);
                return;
            case 3:
                this.f20546b.lambda$updateChannelUsers$125(this.d, this.f20547c);
                return;
            case 4:
                this.f20546b.lambda$markVoiceMessageContentAsRead$217(this.f20547c, this.d);
                return;
            case 5:
                this.f20546b.lambda$markMessagesAsDeletedInternal$226(this.f20547c, this.d);
                return;
            case 6:
                this.f20546b.lambda$removeTopics$58(this.f20547c, this.d);
                return;
            default:
                this.f20546b.lambda$createTaskForSecretChat$117(this.d, this.f20547c);
                return;
        }
    }

    public we(MessagesStorage messagesStorage, ArrayList arrayList, long j10, int i10) {
        this.f20545a = i10;
        this.f20546b = messagesStorage;
        this.f20547c = arrayList;
        this.d = j10;
    }
}
