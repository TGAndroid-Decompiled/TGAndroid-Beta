package org.telegram.messenger;

import java.util.ArrayList;
public final class qe implements Runnable {
    public final int f19358a;
    public final MessagesStorage f19359b;
    public final ArrayList f19360c;
    public final long d;

    public qe(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.f19358a = i10;
        this.f19359b = messagesStorage;
        this.d = j10;
        this.f19360c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19358a) {
            case 0:
                this.f19359b.lambda$deleteUserChatHistory$86(this.f19360c, this.d);
                return;
            case 1:
                this.f19359b.lambda$emptyMessagesMedia$99(this.f19360c, this.d);
                return;
            case 2:
                this.f19359b.lambda$deleteSavedDialog$54(this.d, this.f19360c);
                return;
            case 3:
                this.f19359b.lambda$updateChannelUsers$125(this.d, this.f19360c);
                return;
            case 4:
                this.f19359b.lambda$markVoiceMessageContentAsRead$217(this.f19360c, this.d);
                return;
            case 5:
                this.f19359b.lambda$markMessagesAsDeletedInternal$226(this.f19360c, this.d);
                return;
            case 6:
                this.f19359b.lambda$removeTopics$58(this.f19360c, this.d);
                return;
            default:
                this.f19359b.lambda$createTaskForSecretChat$117(this.d, this.f19360c);
                return;
        }
    }

    public qe(MessagesStorage messagesStorage, ArrayList arrayList, long j10, int i10) {
        this.f19358a = i10;
        this.f19359b = messagesStorage;
        this.f19360c = arrayList;
        this.d = j10;
    }
}
