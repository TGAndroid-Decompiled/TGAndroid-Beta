package org.telegram.messenger;

import java.util.ArrayList;
public final class pe implements Runnable {
    public final int f19277a;
    public final MessagesStorage f19278b;
    public final ArrayList f19279c;
    public final long d;

    public pe(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.f19277a = i10;
        this.f19278b = messagesStorage;
        this.d = j10;
        this.f19279c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19277a) {
            case 0:
                this.f19278b.lambda$deleteUserChatHistory$86(this.f19279c, this.d);
                return;
            case 1:
                this.f19278b.lambda$emptyMessagesMedia$99(this.f19279c, this.d);
                return;
            case 2:
                this.f19278b.lambda$deleteSavedDialog$54(this.d, this.f19279c);
                return;
            case 3:
                this.f19278b.lambda$updateChannelUsers$125(this.d, this.f19279c);
                return;
            case 4:
                this.f19278b.lambda$markVoiceMessageContentAsRead$217(this.f19279c, this.d);
                return;
            case 5:
                this.f19278b.lambda$markMessagesAsDeletedInternal$226(this.f19279c, this.d);
                return;
            case 6:
                this.f19278b.lambda$removeTopics$58(this.f19279c, this.d);
                return;
            default:
                this.f19278b.lambda$createTaskForSecretChat$117(this.d, this.f19279c);
                return;
        }
    }

    public pe(MessagesStorage messagesStorage, ArrayList arrayList, long j10, int i10) {
        this.f19277a = i10;
        this.f19278b = messagesStorage;
        this.f19279c = arrayList;
        this.d = j10;
    }
}
