package org.telegram.messenger;

import java.util.ArrayList;
public final class re implements Runnable {
    public final int f19079a;
    public final MessagesStorage f19080b;
    public final ArrayList f19081c;
    public final long d;

    public re(MessagesStorage messagesStorage, long j3, ArrayList arrayList, int i10) {
        this.f19079a = i10;
        this.f19080b = messagesStorage;
        this.d = j3;
        this.f19081c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19079a) {
            case 0:
                this.f19080b.lambda$deleteUserChatHistory$86(this.f19081c, this.d);
                return;
            case 1:
                this.f19080b.lambda$emptyMessagesMedia$99(this.f19081c, this.d);
                return;
            case 2:
                this.f19080b.lambda$deleteSavedDialog$54(this.d, this.f19081c);
                return;
            case 3:
                this.f19080b.lambda$updateChannelUsers$125(this.d, this.f19081c);
                return;
            case 4:
                this.f19080b.lambda$markVoiceMessageContentAsRead$217(this.f19081c, this.d);
                return;
            case 5:
                this.f19080b.lambda$markMessagesAsDeletedInternal$226(this.f19081c, this.d);
                return;
            case 6:
                this.f19080b.lambda$removeTopics$58(this.f19081c, this.d);
                return;
            default:
                this.f19080b.lambda$createTaskForSecretChat$117(this.d, this.f19081c);
                return;
        }
    }

    public re(MessagesStorage messagesStorage, ArrayList arrayList, long j3, int i10) {
        this.f19079a = i10;
        this.f19080b = messagesStorage;
        this.f19081c = arrayList;
        this.d = j3;
    }
}
