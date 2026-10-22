package org.telegram.messenger;

import java.util.ArrayList;
public final class ue implements Runnable {
    public final int f19692a;
    public final MessagesStorage f19693b;
    public final ArrayList f19694c;
    public final long d;

    public ue(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.f19692a = i10;
        this.f19693b = messagesStorage;
        this.d = j10;
        this.f19694c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19692a) {
            case 0:
                this.f19693b.lambda$deleteUserChatHistory$86(this.f19694c, this.d);
                return;
            case 1:
                this.f19693b.lambda$emptyMessagesMedia$99(this.f19694c, this.d);
                return;
            case 2:
                this.f19693b.lambda$deleteSavedDialog$54(this.d, this.f19694c);
                return;
            case 3:
                this.f19693b.lambda$updateChannelUsers$125(this.d, this.f19694c);
                return;
            case 4:
                this.f19693b.lambda$markVoiceMessageContentAsRead$217(this.f19694c, this.d);
                return;
            case 5:
                this.f19693b.lambda$markMessagesAsDeletedInternal$226(this.f19694c, this.d);
                return;
            case 6:
                this.f19693b.lambda$removeTopics$58(this.f19694c, this.d);
                return;
            default:
                this.f19693b.lambda$createTaskForSecretChat$117(this.d, this.f19694c);
                return;
        }
    }

    public ue(MessagesStorage messagesStorage, ArrayList arrayList, long j10, int i10) {
        this.f19692a = i10;
        this.f19693b = messagesStorage;
        this.f19694c = arrayList;
        this.d = j10;
    }
}
