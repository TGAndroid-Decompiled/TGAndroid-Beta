package org.telegram.messenger;

import java.util.ArrayList;
public final class se implements Runnable {
    public final int f17315a;
    public final MessagesStorage f17316b;
    public final ArrayList f17317c;
    public final long d;

    public se(MessagesStorage messagesStorage, long j3, ArrayList arrayList, int i10) {
        this.f17315a = i10;
        this.f17316b = messagesStorage;
        this.d = j3;
        this.f17317c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17315a) {
            case 0:
                this.f17316b.lambda$deleteUserChatHistory$86(this.f17317c, this.d);
                return;
            case 1:
                this.f17316b.lambda$emptyMessagesMedia$99(this.f17317c, this.d);
                return;
            case 2:
                this.f17316b.lambda$deleteSavedDialog$54(this.d, this.f17317c);
                return;
            case 3:
                this.f17316b.lambda$updateChannelUsers$125(this.d, this.f17317c);
                return;
            case 4:
                this.f17316b.lambda$markVoiceMessageContentAsRead$217(this.f17317c, this.d);
                return;
            case 5:
                this.f17316b.lambda$markMessagesAsDeletedInternal$226(this.f17317c, this.d);
                return;
            case 6:
                this.f17316b.lambda$removeTopics$58(this.f17317c, this.d);
                return;
            default:
                this.f17316b.lambda$createTaskForSecretChat$117(this.d, this.f17317c);
                return;
        }
    }

    public se(MessagesStorage messagesStorage, ArrayList arrayList, long j3, int i10) {
        this.f17315a = i10;
        this.f17316b = messagesStorage;
        this.f17317c = arrayList;
        this.d = j3;
    }
}
