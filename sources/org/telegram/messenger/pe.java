package org.telegram.messenger;

import java.util.ArrayList;
public final class pe implements Runnable {
    public final int f19280a;
    public final MessagesStorage f19281b;
    public final ArrayList f19282c;
    public final long d;

    public pe(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.f19280a = i10;
        this.f19281b = messagesStorage;
        this.d = j10;
        this.f19282c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19280a) {
            case 0:
                this.f19281b.lambda$deleteUserChatHistory$86(this.f19282c, this.d);
                return;
            case 1:
                this.f19281b.lambda$emptyMessagesMedia$99(this.f19282c, this.d);
                return;
            case 2:
                this.f19281b.lambda$deleteSavedDialog$54(this.d, this.f19282c);
                return;
            case 3:
                this.f19281b.lambda$updateChannelUsers$125(this.d, this.f19282c);
                return;
            case 4:
                this.f19281b.lambda$markVoiceMessageContentAsRead$217(this.f19282c, this.d);
                return;
            case 5:
                this.f19281b.lambda$markMessagesAsDeletedInternal$226(this.f19282c, this.d);
                return;
            case 6:
                this.f19281b.lambda$removeTopics$58(this.f19282c, this.d);
                return;
            default:
                this.f19281b.lambda$createTaskForSecretChat$117(this.d, this.f19282c);
                return;
        }
    }

    public pe(MessagesStorage messagesStorage, ArrayList arrayList, long j10, int i10) {
        this.f19280a = i10;
        this.f19281b = messagesStorage;
        this.f19282c = arrayList;
        this.d = j10;
    }
}
