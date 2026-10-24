package org.telegram.messenger;

import java.util.ArrayList;
public final class ue implements Runnable {
    public final int f19757a;
    public final MessagesStorage f19758b;
    public final ArrayList f19759c;
    public final long d;

    public ue(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.f19757a = i10;
        this.f19758b = messagesStorage;
        this.d = j10;
        this.f19759c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19757a) {
            case 0:
                this.f19758b.lambda$deleteUserChatHistory$86(this.f19759c, this.d);
                return;
            case 1:
                this.f19758b.lambda$emptyMessagesMedia$99(this.f19759c, this.d);
                return;
            case 2:
                this.f19758b.lambda$deleteSavedDialog$54(this.d, this.f19759c);
                return;
            case 3:
                this.f19758b.lambda$updateChannelUsers$125(this.d, this.f19759c);
                return;
            case 4:
                this.f19758b.lambda$markVoiceMessageContentAsRead$217(this.f19759c, this.d);
                return;
            case 5:
                this.f19758b.lambda$markMessagesAsDeletedInternal$226(this.f19759c, this.d);
                return;
            case 6:
                this.f19758b.lambda$removeTopics$58(this.f19759c, this.d);
                return;
            default:
                this.f19758b.lambda$createTaskForSecretChat$117(this.d, this.f19759c);
                return;
        }
    }

    public ue(MessagesStorage messagesStorage, ArrayList arrayList, long j10, int i10) {
        this.f19757a = i10;
        this.f19758b = messagesStorage;
        this.f19759c = arrayList;
        this.d = j10;
    }
}
