package org.telegram.messenger;

import java.util.ArrayList;

public final class re implements Runnable {

    public final int f21436a;

    public final MessagesStorage f21437b;

    public final ArrayList f21438c;
    public final long d;

    public re(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.f21436a = i10;
        this.f21437b = messagesStorage;
        this.d = j10;
        this.f21438c = arrayList;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f21436a) {
            case 0:
                this.f21437b.lambda$deleteUserChatHistory$86(this.f21438c, this.d);
                break;
            case 1:
                this.f21437b.lambda$emptyMessagesMedia$99(this.f21438c, this.d);
                break;
            case 2:
                this.f21437b.lambda$deleteSavedDialog$54(this.d, this.f21438c);
                break;
            case 3:
                this.f21437b.lambda$updateChannelUsers$125(this.d, this.f21438c);
                break;
            case 4:
                this.f21437b.lambda$markVoiceMessageContentAsRead$217(this.f21438c, this.d);
                break;
            case 5:
                this.f21437b.lambda$markMessagesAsDeletedInternal$226(this.f21438c, this.d);
                break;
            case 6:
                this.f21437b.lambda$removeTopics$58(this.f21438c, this.d);
                break;
            default:
                this.f21437b.lambda$createTaskForSecretChat$117(this.d, this.f21438c);
                break;
        }
    }

    public re(MessagesStorage messagesStorage, ArrayList arrayList, long j10, int i10) {
        this.f21436a = i10;
        this.f21437b = messagesStorage;
        this.f21438c = arrayList;
        this.d = j10;
    }
}
