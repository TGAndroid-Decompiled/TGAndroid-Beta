package org.telegram.messenger;

import java.util.ArrayList;
public final class te implements Runnable {
    public final int f19681a;
    public final MessagesStorage f19682b;
    public final ArrayList f19683c;
    public final long d;

    public te(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.f19681a = i10;
        this.f19682b = messagesStorage;
        this.d = j10;
        this.f19683c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19681a) {
            case 0:
                this.f19682b.lambda$deleteUserChatHistory$86(this.f19683c, this.d);
                return;
            case 1:
                this.f19682b.lambda$emptyMessagesMedia$99(this.f19683c, this.d);
                return;
            case 2:
                this.f19682b.lambda$deleteSavedDialog$54(this.d, this.f19683c);
                return;
            case 3:
                this.f19682b.lambda$updateChannelUsers$125(this.d, this.f19683c);
                return;
            case 4:
                this.f19682b.lambda$markVoiceMessageContentAsRead$217(this.f19683c, this.d);
                return;
            case 5:
                this.f19682b.lambda$markMessagesAsDeletedInternal$226(this.f19683c, this.d);
                return;
            case 6:
                this.f19682b.lambda$removeTopics$58(this.f19683c, this.d);
                return;
            default:
                this.f19682b.lambda$createTaskForSecretChat$117(this.d, this.f19683c);
                return;
        }
    }

    public te(MessagesStorage messagesStorage, ArrayList arrayList, long j10, int i10) {
        this.f19681a = i10;
        this.f19682b = messagesStorage;
        this.f19683c = arrayList;
        this.d = j10;
    }
}
