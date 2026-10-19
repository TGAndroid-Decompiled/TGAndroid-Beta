package org.telegram.messenger;

import java.util.ArrayList;
public final class qe implements Runnable {
    public final int f19361a;
    public final MessagesStorage f19362b;
    public final ArrayList f19363c;
    public final long d;

    public qe(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.f19361a = i10;
        this.f19362b = messagesStorage;
        this.d = j10;
        this.f19363c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19361a) {
            case 0:
                this.f19362b.lambda$deleteUserChatHistory$86(this.f19363c, this.d);
                return;
            case 1:
                this.f19362b.lambda$emptyMessagesMedia$99(this.f19363c, this.d);
                return;
            case 2:
                this.f19362b.lambda$deleteSavedDialog$54(this.d, this.f19363c);
                return;
            case 3:
                this.f19362b.lambda$updateChannelUsers$125(this.d, this.f19363c);
                return;
            case 4:
                this.f19362b.lambda$markVoiceMessageContentAsRead$217(this.f19363c, this.d);
                return;
            case 5:
                this.f19362b.lambda$markMessagesAsDeletedInternal$226(this.f19363c, this.d);
                return;
            case 6:
                this.f19362b.lambda$removeTopics$58(this.f19363c, this.d);
                return;
            default:
                this.f19362b.lambda$createTaskForSecretChat$117(this.d, this.f19363c);
                return;
        }
    }

    public qe(MessagesStorage messagesStorage, ArrayList arrayList, long j10, int i10) {
        this.f19361a = i10;
        this.f19362b = messagesStorage;
        this.f19363c = arrayList;
        this.d = j10;
    }
}
