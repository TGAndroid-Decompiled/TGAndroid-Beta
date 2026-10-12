package org.telegram.messenger;

import java.util.ArrayList;
public final class ue implements Runnable {
    public final int f18591a;
    public final MessagesStorage f18592b;
    public final ArrayList f18593c;
    public final long d;

    public ue(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.f18591a = i10;
        this.f18592b = messagesStorage;
        this.d = j10;
        this.f18593c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18591a) {
            case 0:
                this.f18592b.lambda$deleteUserChatHistory$86(this.f18593c, this.d);
                return;
            case 1:
                this.f18592b.lambda$emptyMessagesMedia$99(this.f18593c, this.d);
                return;
            case 2:
                this.f18592b.lambda$deleteSavedDialog$54(this.d, this.f18593c);
                return;
            case 3:
                this.f18592b.lambda$updateChannelUsers$125(this.d, this.f18593c);
                return;
            case 4:
                this.f18592b.lambda$markVoiceMessageContentAsRead$217(this.f18593c, this.d);
                return;
            case 5:
                this.f18592b.lambda$markMessagesAsDeletedInternal$226(this.f18593c, this.d);
                return;
            case 6:
                this.f18592b.lambda$removeTopics$58(this.f18593c, this.d);
                return;
            default:
                this.f18592b.lambda$createTaskForSecretChat$117(this.d, this.f18593c);
                return;
        }
    }

    public ue(MessagesStorage messagesStorage, ArrayList arrayList, long j10, int i10) {
        this.f18591a = i10;
        this.f18592b = messagesStorage;
        this.f18593c = arrayList;
        this.d = j10;
    }
}
