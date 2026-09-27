package org.telegram.messenger;

import java.util.ArrayList;
public final class re implements Runnable {
    public final int f17461a;
    public final MessagesStorage f17462b;
    public final ArrayList f17463c;
    public final long d;

    public re(MessagesStorage messagesStorage, long j3, ArrayList arrayList, int i10) {
        this.f17461a = i10;
        this.f17462b = messagesStorage;
        this.d = j3;
        this.f17463c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17461a) {
            case 0:
                this.f17462b.lambda$deleteUserChatHistory$86(this.f17463c, this.d);
                return;
            case 1:
                this.f17462b.lambda$emptyMessagesMedia$99(this.f17463c, this.d);
                return;
            case 2:
                this.f17462b.lambda$deleteSavedDialog$54(this.d, this.f17463c);
                return;
            case 3:
                this.f17462b.lambda$updateChannelUsers$125(this.d, this.f17463c);
                return;
            case 4:
                this.f17462b.lambda$markVoiceMessageContentAsRead$217(this.f17463c, this.d);
                return;
            case 5:
                this.f17462b.lambda$markMessagesAsDeletedInternal$226(this.f17463c, this.d);
                return;
            case 6:
                this.f17462b.lambda$removeTopics$58(this.f17463c, this.d);
                return;
            default:
                this.f17462b.lambda$createTaskForSecretChat$117(this.d, this.f17463c);
                return;
        }
    }

    public re(MessagesStorage messagesStorage, ArrayList arrayList, long j3, int i10) {
        this.f17461a = i10;
        this.f17462b = messagesStorage;
        this.f17463c = arrayList;
        this.d = j3;
    }
}
