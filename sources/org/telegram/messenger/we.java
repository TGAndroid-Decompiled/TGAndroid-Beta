package org.telegram.messenger;

import java.util.ArrayList;
public final class we implements Runnable {
    public final int f18886a;
    public final MessagesStorage f18887b;
    public final ArrayList f18888c;
    public final long d;

    public we(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.f18886a = i10;
        this.f18887b = messagesStorage;
        this.d = j10;
        this.f18888c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18886a) {
            case 0:
                this.f18887b.lambda$deleteUserChatHistory$86(this.f18888c, this.d);
                return;
            case 1:
                this.f18887b.lambda$emptyMessagesMedia$99(this.f18888c, this.d);
                return;
            case 2:
                this.f18887b.lambda$deleteSavedDialog$54(this.d, this.f18888c);
                return;
            case 3:
                this.f18887b.lambda$updateChannelUsers$125(this.d, this.f18888c);
                return;
            case 4:
                this.f18887b.lambda$markVoiceMessageContentAsRead$217(this.f18888c, this.d);
                return;
            case 5:
                this.f18887b.lambda$markMessagesAsDeletedInternal$226(this.f18888c, this.d);
                return;
            case 6:
                this.f18887b.lambda$removeTopics$58(this.f18888c, this.d);
                return;
            default:
                this.f18887b.lambda$createTaskForSecretChat$117(this.d, this.f18888c);
                return;
        }
    }

    public we(MessagesStorage messagesStorage, ArrayList arrayList, long j10, int i10) {
        this.f18886a = i10;
        this.f18887b = messagesStorage;
        this.f18888c = arrayList;
        this.d = j10;
    }
}
