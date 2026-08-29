package org.telegram.messenger;

import java.util.ArrayList;
public final class ue implements Runnable {
    public final int f21734a;
    public final MessagesStorage f21735b;
    public final ArrayList f21736c;
    public final long d;

    public ue(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.f21734a = i10;
        this.f21735b = messagesStorage;
        this.d = j10;
        this.f21736c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f21734a) {
            case 0:
                this.f21735b.lambda$deleteUserChatHistory$86(this.f21736c, this.d);
                return;
            case 1:
                this.f21735b.lambda$emptyMessagesMedia$99(this.f21736c, this.d);
                return;
            case 2:
                this.f21735b.lambda$deleteSavedDialog$54(this.d, this.f21736c);
                return;
            case 3:
                this.f21735b.lambda$updateChannelUsers$125(this.d, this.f21736c);
                return;
            case 4:
                this.f21735b.lambda$markVoiceMessageContentAsRead$217(this.f21736c, this.d);
                return;
            case 5:
                this.f21735b.lambda$markMessagesAsDeletedInternal$226(this.f21736c, this.d);
                return;
            case 6:
                this.f21735b.lambda$removeTopics$58(this.f21736c, this.d);
                return;
            default:
                this.f21735b.lambda$createTaskForSecretChat$117(this.d, this.f21736c);
                return;
        }
    }

    public ue(MessagesStorage messagesStorage, ArrayList arrayList, long j10, int i10) {
        this.f21734a = i10;
        this.f21735b = messagesStorage;
        this.f21736c = arrayList;
        this.d = j10;
    }
}
