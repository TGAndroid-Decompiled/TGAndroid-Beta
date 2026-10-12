package org.telegram.messenger;

import java.util.ArrayList;
public final class ue implements Runnable {
    public final int f19106a;
    public final MessagesStorage f19107b;
    public final ArrayList f19108c;
    public final long d;

    public ue(MessagesStorage messagesStorage, long j3, ArrayList arrayList, int i10) {
        this.f19106a = i10;
        this.f19107b = messagesStorage;
        this.d = j3;
        this.f19108c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19106a) {
            case 0:
                this.f19107b.lambda$deleteUserChatHistory$86(this.f19108c, this.d);
                return;
            case 1:
                this.f19107b.lambda$emptyMessagesMedia$99(this.f19108c, this.d);
                return;
            case 2:
                this.f19107b.lambda$deleteSavedDialog$54(this.d, this.f19108c);
                return;
            case 3:
                this.f19107b.lambda$updateChannelUsers$125(this.d, this.f19108c);
                return;
            case 4:
                this.f19107b.lambda$markVoiceMessageContentAsRead$217(this.f19108c, this.d);
                return;
            case 5:
                this.f19107b.lambda$markMessagesAsDeletedInternal$226(this.f19108c, this.d);
                return;
            case 6:
                this.f19107b.lambda$removeTopics$58(this.f19108c, this.d);
                return;
            default:
                this.f19107b.lambda$createTaskForSecretChat$117(this.d, this.f19108c);
                return;
        }
    }

    public ue(MessagesStorage messagesStorage, ArrayList arrayList, long j3, int i10) {
        this.f19106a = i10;
        this.f19107b = messagesStorage;
        this.f19108c = arrayList;
        this.d = j3;
    }
}
