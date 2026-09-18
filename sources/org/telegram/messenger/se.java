package org.telegram.messenger;

import java.util.ArrayList;
public final class se implements Runnable {
    public final int f17496a;
    public final MessagesStorage f17497b;
    public final ArrayList f17498c;
    public final long d;

    public se(MessagesStorage messagesStorage, long j3, ArrayList arrayList, int i10) {
        this.f17496a = i10;
        this.f17497b = messagesStorage;
        this.d = j3;
        this.f17498c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17496a) {
            case 0:
                this.f17497b.lambda$deleteUserChatHistory$86(this.f17498c, this.d);
                return;
            case 1:
                this.f17497b.lambda$emptyMessagesMedia$99(this.f17498c, this.d);
                return;
            case 2:
                this.f17497b.lambda$deleteSavedDialog$54(this.d, this.f17498c);
                return;
            case 3:
                this.f17497b.lambda$updateChannelUsers$125(this.d, this.f17498c);
                return;
            case 4:
                this.f17497b.lambda$markVoiceMessageContentAsRead$217(this.f17498c, this.d);
                return;
            case 5:
                this.f17497b.lambda$markMessagesAsDeletedInternal$226(this.f17498c, this.d);
                return;
            case 6:
                this.f17497b.lambda$removeTopics$58(this.f17498c, this.d);
                return;
            default:
                this.f17497b.lambda$createTaskForSecretChat$117(this.d, this.f17498c);
                return;
        }
    }

    public se(MessagesStorage messagesStorage, ArrayList arrayList, long j3, int i10) {
        this.f17496a = i10;
        this.f17497b = messagesStorage;
        this.f17498c = arrayList;
        this.d = j3;
    }
}
