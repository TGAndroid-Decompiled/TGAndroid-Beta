package org.telegram.messenger;

import java.util.ArrayList;
public final class re implements Runnable {
    public final int f18931a;
    public final MessagesStorage f18932b;
    public final ArrayList f18933c;
    public final long d;

    public re(MessagesStorage messagesStorage, long j3, ArrayList arrayList, int i10) {
        this.f18931a = i10;
        this.f18932b = messagesStorage;
        this.d = j3;
        this.f18933c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18931a) {
            case 0:
                this.f18932b.lambda$deleteUserChatHistory$86(this.f18933c, this.d);
                return;
            case 1:
                this.f18932b.lambda$emptyMessagesMedia$99(this.f18933c, this.d);
                return;
            case 2:
                this.f18932b.lambda$deleteSavedDialog$54(this.d, this.f18933c);
                return;
            case 3:
                this.f18932b.lambda$updateChannelUsers$125(this.d, this.f18933c);
                return;
            case 4:
                this.f18932b.lambda$markVoiceMessageContentAsRead$217(this.f18933c, this.d);
                return;
            case 5:
                this.f18932b.lambda$markMessagesAsDeletedInternal$226(this.f18933c, this.d);
                return;
            case 6:
                this.f18932b.lambda$removeTopics$58(this.f18933c, this.d);
                return;
            default:
                this.f18932b.lambda$createTaskForSecretChat$117(this.d, this.f18933c);
                return;
        }
    }

    public re(MessagesStorage messagesStorage, ArrayList arrayList, long j3, int i10) {
        this.f18931a = i10;
        this.f18932b = messagesStorage;
        this.f18933c = arrayList;
        this.d = j3;
    }
}
