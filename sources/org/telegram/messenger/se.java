package org.telegram.messenger;

import java.util.ArrayList;
public final class se implements Runnable {
    public final int f19010a;
    public final MessagesStorage f19011b;
    public final ArrayList f19012c;
    public final long d;

    public se(MessagesStorage messagesStorage, long j3, ArrayList arrayList, int i10) {
        this.f19010a = i10;
        this.f19011b = messagesStorage;
        this.d = j3;
        this.f19012c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19010a) {
            case 0:
                this.f19011b.lambda$deleteUserChatHistory$86(this.f19012c, this.d);
                return;
            case 1:
                this.f19011b.lambda$emptyMessagesMedia$99(this.f19012c, this.d);
                return;
            case 2:
                this.f19011b.lambda$deleteSavedDialog$54(this.d, this.f19012c);
                return;
            case 3:
                this.f19011b.lambda$updateChannelUsers$125(this.d, this.f19012c);
                return;
            case 4:
                this.f19011b.lambda$markVoiceMessageContentAsRead$217(this.f19012c, this.d);
                return;
            case 5:
                this.f19011b.lambda$markMessagesAsDeletedInternal$226(this.f19012c, this.d);
                return;
            case 6:
                this.f19011b.lambda$removeTopics$58(this.f19012c, this.d);
                return;
            default:
                this.f19011b.lambda$createTaskForSecretChat$117(this.d, this.f19012c);
                return;
        }
    }

    public se(MessagesStorage messagesStorage, ArrayList arrayList, long j3, int i10) {
        this.f19010a = i10;
        this.f19011b = messagesStorage;
        this.f19012c = arrayList;
        this.d = j3;
    }
}
