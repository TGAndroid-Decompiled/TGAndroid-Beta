package org.telegram.messenger;

import java.util.ArrayList;
public final class re implements Runnable {
    public final int f17467a;
    public final MessagesStorage f17468b;
    public final ArrayList f17469c;
    public final long d;

    public re(MessagesStorage messagesStorage, long j3, ArrayList arrayList, int i10) {
        this.f17467a = i10;
        this.f17468b = messagesStorage;
        this.d = j3;
        this.f17469c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17467a) {
            case 0:
                this.f17468b.lambda$deleteUserChatHistory$86(this.f17469c, this.d);
                return;
            case 1:
                this.f17468b.lambda$emptyMessagesMedia$99(this.f17469c, this.d);
                return;
            case 2:
                this.f17468b.lambda$deleteSavedDialog$54(this.d, this.f17469c);
                return;
            case 3:
                this.f17468b.lambda$updateChannelUsers$125(this.d, this.f17469c);
                return;
            case 4:
                this.f17468b.lambda$markVoiceMessageContentAsRead$217(this.f17469c, this.d);
                return;
            case 5:
                this.f17468b.lambda$markMessagesAsDeletedInternal$226(this.f17469c, this.d);
                return;
            case 6:
                this.f17468b.lambda$removeTopics$58(this.f17469c, this.d);
                return;
            default:
                this.f17468b.lambda$createTaskForSecretChat$117(this.d, this.f17469c);
                return;
        }
    }

    public re(MessagesStorage messagesStorage, ArrayList arrayList, long j3, int i10) {
        this.f17467a = i10;
        this.f17468b = messagesStorage;
        this.f17469c = arrayList;
        this.d = j3;
    }
}
