package org.telegram.messenger;

import java.util.ArrayList;
public final class ne implements Runnable {
    public final int f21055a;
    public final MessagesStorage f21056b;
    public final ArrayList f21057c;
    public final long d;

    public ne(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i9) {
        this.f21055a = i9;
        this.f21056b = messagesStorage;
        this.d = j10;
        this.f21057c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f21055a) {
            case 0:
                this.f21056b.lambda$deleteUserChatHistory$86(this.f21057c, this.d);
                return;
            case 1:
                this.f21056b.lambda$emptyMessagesMedia$99(this.f21057c, this.d);
                return;
            case 2:
                this.f21056b.lambda$deleteSavedDialog$54(this.d, this.f21057c);
                return;
            case 3:
                this.f21056b.lambda$updateChannelUsers$125(this.d, this.f21057c);
                return;
            case 4:
                this.f21056b.lambda$markVoiceMessageContentAsRead$217(this.f21057c, this.d);
                return;
            case 5:
                this.f21056b.lambda$markMessagesAsDeletedInternal$226(this.f21057c, this.d);
                return;
            case 6:
                this.f21056b.lambda$removeTopics$58(this.f21057c, this.d);
                return;
            default:
                this.f21056b.lambda$createTaskForSecretChat$117(this.d, this.f21057c);
                return;
        }
    }

    public ne(MessagesStorage messagesStorage, ArrayList arrayList, long j10, int i9) {
        this.f21055a = i9;
        this.f21056b = messagesStorage;
        this.f21057c = arrayList;
        this.d = j10;
    }
}
