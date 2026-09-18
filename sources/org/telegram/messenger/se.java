package org.telegram.messenger;

import java.util.ArrayList;
public final class se implements Runnable {
    public final int f17324a;
    public final MessagesStorage f17325b;
    public final ArrayList f17326c;
    public final long d;

    public se(MessagesStorage messagesStorage, long j3, ArrayList arrayList, int i10) {
        this.f17324a = i10;
        this.f17325b = messagesStorage;
        this.d = j3;
        this.f17326c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17324a) {
            case 0:
                this.f17325b.lambda$deleteUserChatHistory$86(this.f17326c, this.d);
                return;
            case 1:
                this.f17325b.lambda$emptyMessagesMedia$99(this.f17326c, this.d);
                return;
            case 2:
                this.f17325b.lambda$deleteSavedDialog$54(this.d, this.f17326c);
                return;
            case 3:
                this.f17325b.lambda$updateChannelUsers$125(this.d, this.f17326c);
                return;
            case 4:
                this.f17325b.lambda$markVoiceMessageContentAsRead$217(this.f17326c, this.d);
                return;
            case 5:
                this.f17325b.lambda$markMessagesAsDeletedInternal$226(this.f17326c, this.d);
                return;
            case 6:
                this.f17325b.lambda$removeTopics$58(this.f17326c, this.d);
                return;
            default:
                this.f17325b.lambda$createTaskForSecretChat$117(this.d, this.f17326c);
                return;
        }
    }

    public se(MessagesStorage messagesStorage, ArrayList arrayList, long j3, int i10) {
        this.f17324a = i10;
        this.f17325b = messagesStorage;
        this.f17326c = arrayList;
        this.d = j3;
    }
}
