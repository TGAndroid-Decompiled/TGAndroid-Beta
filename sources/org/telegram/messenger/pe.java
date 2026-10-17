package org.telegram.messenger;

import java.util.ArrayList;
public final class pe implements Runnable {
    public final int f19278a;
    public final MessagesStorage f19279b;
    public final ArrayList f19280c;
    public final long d;

    public pe(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.f19278a = i10;
        this.f19279b = messagesStorage;
        this.d = j10;
        this.f19280c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19278a) {
            case 0:
                this.f19279b.lambda$deleteUserChatHistory$86(this.f19280c, this.d);
                return;
            case 1:
                this.f19279b.lambda$emptyMessagesMedia$99(this.f19280c, this.d);
                return;
            case 2:
                this.f19279b.lambda$deleteSavedDialog$54(this.d, this.f19280c);
                return;
            case 3:
                this.f19279b.lambda$updateChannelUsers$125(this.d, this.f19280c);
                return;
            case 4:
                this.f19279b.lambda$markVoiceMessageContentAsRead$217(this.f19280c, this.d);
                return;
            case 5:
                this.f19279b.lambda$markMessagesAsDeletedInternal$226(this.f19280c, this.d);
                return;
            case 6:
                this.f19279b.lambda$removeTopics$58(this.f19280c, this.d);
                return;
            default:
                this.f19279b.lambda$createTaskForSecretChat$117(this.d, this.f19280c);
                return;
        }
    }

    public pe(MessagesStorage messagesStorage, ArrayList arrayList, long j10, int i10) {
        this.f19278a = i10;
        this.f19279b = messagesStorage;
        this.f19280c = arrayList;
        this.d = j10;
    }
}
