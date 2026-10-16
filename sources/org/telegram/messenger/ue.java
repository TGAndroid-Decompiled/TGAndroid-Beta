package org.telegram.messenger;

import java.util.ArrayList;
public final class ue implements Runnable {
    public final int f18292a;
    public final MessagesStorage f18293b;
    public final ArrayList f18294c;
    public final long d;

    public ue(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.f18292a = i10;
        this.f18293b = messagesStorage;
        this.d = j10;
        this.f18294c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18292a) {
            case 0:
                this.f18293b.lambda$deleteUserChatHistory$86(this.f18294c, this.d);
                return;
            case 1:
                this.f18293b.lambda$emptyMessagesMedia$99(this.f18294c, this.d);
                return;
            case 2:
                this.f18293b.lambda$deleteSavedDialog$54(this.d, this.f18294c);
                return;
            case 3:
                this.f18293b.lambda$updateChannelUsers$125(this.d, this.f18294c);
                return;
            case 4:
                this.f18293b.lambda$markVoiceMessageContentAsRead$217(this.f18294c, this.d);
                return;
            case 5:
                this.f18293b.lambda$markMessagesAsDeletedInternal$226(this.f18294c, this.d);
                return;
            case 6:
                this.f18293b.lambda$removeTopics$58(this.f18294c, this.d);
                return;
            default:
                this.f18293b.lambda$createTaskForSecretChat$117(this.d, this.f18294c);
                return;
        }
    }

    public ue(MessagesStorage messagesStorage, ArrayList arrayList, long j10, int i10) {
        this.f18292a = i10;
        this.f18293b = messagesStorage;
        this.f18294c = arrayList;
        this.d = j10;
    }
}
