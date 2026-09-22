package org.telegram.messenger;

import java.util.ArrayList;
public final class se implements Runnable {
    public final int f17312a;
    public final MessagesStorage f17313b;
    public final ArrayList f17314c;
    public final long d;

    public se(MessagesStorage messagesStorage, long j3, ArrayList arrayList, int i10) {
        this.f17312a = i10;
        this.f17313b = messagesStorage;
        this.d = j3;
        this.f17314c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17312a) {
            case 0:
                this.f17313b.lambda$deleteUserChatHistory$86(this.f17314c, this.d);
                return;
            case 1:
                this.f17313b.lambda$emptyMessagesMedia$99(this.f17314c, this.d);
                return;
            case 2:
                this.f17313b.lambda$deleteSavedDialog$54(this.d, this.f17314c);
                return;
            case 3:
                this.f17313b.lambda$updateChannelUsers$125(this.d, this.f17314c);
                return;
            case 4:
                this.f17313b.lambda$markVoiceMessageContentAsRead$217(this.f17314c, this.d);
                return;
            case 5:
                this.f17313b.lambda$markMessagesAsDeletedInternal$226(this.f17314c, this.d);
                return;
            case 6:
                this.f17313b.lambda$removeTopics$58(this.f17314c, this.d);
                return;
            default:
                this.f17313b.lambda$createTaskForSecretChat$117(this.d, this.f17314c);
                return;
        }
    }

    public se(MessagesStorage messagesStorage, ArrayList arrayList, long j3, int i10) {
        this.f17312a = i10;
        this.f17313b = messagesStorage;
        this.f17314c = arrayList;
        this.d = j3;
    }
}
