package org.telegram.messenger;

import java.util.ArrayList;
public final class ue implements Runnable {
    public final int f19105a;
    public final MessagesStorage f19106b;
    public final ArrayList f19107c;
    public final long d;

    public ue(MessagesStorage messagesStorage, long j3, ArrayList arrayList, int i10) {
        this.f19105a = i10;
        this.f19106b = messagesStorage;
        this.d = j3;
        this.f19107c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19105a) {
            case 0:
                this.f19106b.lambda$deleteUserChatHistory$86(this.f19107c, this.d);
                return;
            case 1:
                this.f19106b.lambda$emptyMessagesMedia$99(this.f19107c, this.d);
                return;
            case 2:
                this.f19106b.lambda$deleteSavedDialog$54(this.d, this.f19107c);
                return;
            case 3:
                this.f19106b.lambda$updateChannelUsers$125(this.d, this.f19107c);
                return;
            case 4:
                this.f19106b.lambda$markVoiceMessageContentAsRead$217(this.f19107c, this.d);
                return;
            case 5:
                this.f19106b.lambda$markMessagesAsDeletedInternal$226(this.f19107c, this.d);
                return;
            case 6:
                this.f19106b.lambda$removeTopics$58(this.f19107c, this.d);
                return;
            default:
                this.f19106b.lambda$createTaskForSecretChat$117(this.d, this.f19107c);
                return;
        }
    }

    public ue(MessagesStorage messagesStorage, ArrayList arrayList, long j3, int i10) {
        this.f19105a = i10;
        this.f19106b = messagesStorage;
        this.f19107c = arrayList;
        this.d = j3;
    }
}
