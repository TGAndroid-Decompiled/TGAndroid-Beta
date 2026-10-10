package org.telegram.messenger;

import java.util.ArrayList;
public final class re implements Runnable {
    public final int f19053a;
    public final MessagesStorage f19054b;
    public final ArrayList f19055c;
    public final long d;

    public re(MessagesStorage messagesStorage, long j3, ArrayList arrayList, int i10) {
        this.f19053a = i10;
        this.f19054b = messagesStorage;
        this.d = j3;
        this.f19055c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19053a) {
            case 0:
                this.f19054b.lambda$deleteUserChatHistory$86(this.f19055c, this.d);
                return;
            case 1:
                this.f19054b.lambda$emptyMessagesMedia$99(this.f19055c, this.d);
                return;
            case 2:
                this.f19054b.lambda$deleteSavedDialog$54(this.d, this.f19055c);
                return;
            case 3:
                this.f19054b.lambda$updateChannelUsers$125(this.d, this.f19055c);
                return;
            case 4:
                this.f19054b.lambda$markVoiceMessageContentAsRead$217(this.f19055c, this.d);
                return;
            case 5:
                this.f19054b.lambda$markMessagesAsDeletedInternal$226(this.f19055c, this.d);
                return;
            case 6:
                this.f19054b.lambda$removeTopics$58(this.f19055c, this.d);
                return;
            default:
                this.f19054b.lambda$createTaskForSecretChat$117(this.d, this.f19055c);
                return;
        }
    }

    public re(MessagesStorage messagesStorage, ArrayList arrayList, long j3, int i10) {
        this.f19053a = i10;
        this.f19054b = messagesStorage;
        this.f19055c = arrayList;
        this.d = j3;
    }
}
