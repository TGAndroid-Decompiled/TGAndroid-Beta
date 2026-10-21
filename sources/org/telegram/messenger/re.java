package org.telegram.messenger;

import java.util.ArrayList;
public final class re implements Runnable {
    public final int f19450a;
    public final MessagesStorage f19451b;
    public final ArrayList f19452c;
    public final long d;

    public re(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.f19450a = i10;
        this.f19451b = messagesStorage;
        this.d = j10;
        this.f19452c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19450a) {
            case 0:
                this.f19451b.lambda$deleteUserChatHistory$86(this.f19452c, this.d);
                return;
            case 1:
                this.f19451b.lambda$emptyMessagesMedia$99(this.f19452c, this.d);
                return;
            case 2:
                this.f19451b.lambda$deleteSavedDialog$54(this.d, this.f19452c);
                return;
            case 3:
                this.f19451b.lambda$updateChannelUsers$125(this.d, this.f19452c);
                return;
            case 4:
                this.f19451b.lambda$markVoiceMessageContentAsRead$217(this.f19452c, this.d);
                return;
            case 5:
                this.f19451b.lambda$markMessagesAsDeletedInternal$226(this.f19452c, this.d);
                return;
            case 6:
                this.f19451b.lambda$removeTopics$58(this.f19452c, this.d);
                return;
            default:
                this.f19451b.lambda$createTaskForSecretChat$117(this.d, this.f19452c);
                return;
        }
    }

    public re(MessagesStorage messagesStorage, ArrayList arrayList, long j10, int i10) {
        this.f19450a = i10;
        this.f19451b = messagesStorage;
        this.f19452c = arrayList;
        this.d = j10;
    }
}
