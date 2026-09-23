package org.telegram.messenger;

import java.util.ArrayList;
public final class re implements Runnable {
    public final int f17219a;
    public final MessagesStorage f17220b;
    public final ArrayList f17221c;
    public final long d;

    public re(MessagesStorage messagesStorage, long j3, ArrayList arrayList, int i10) {
        this.f17219a = i10;
        this.f17220b = messagesStorage;
        this.d = j3;
        this.f17221c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17219a) {
            case 0:
                this.f17220b.lambda$deleteUserChatHistory$86(this.f17221c, this.d);
                return;
            case 1:
                this.f17220b.lambda$emptyMessagesMedia$99(this.f17221c, this.d);
                return;
            case 2:
                this.f17220b.lambda$deleteSavedDialog$54(this.d, this.f17221c);
                return;
            case 3:
                this.f17220b.lambda$updateChannelUsers$125(this.d, this.f17221c);
                return;
            case 4:
                this.f17220b.lambda$markVoiceMessageContentAsRead$217(this.f17221c, this.d);
                return;
            case 5:
                this.f17220b.lambda$markMessagesAsDeletedInternal$226(this.f17221c, this.d);
                return;
            case 6:
                this.f17220b.lambda$removeTopics$58(this.f17221c, this.d);
                return;
            default:
                this.f17220b.lambda$createTaskForSecretChat$117(this.d, this.f17221c);
                return;
        }
    }

    public re(MessagesStorage messagesStorage, ArrayList arrayList, long j3, int i10) {
        this.f17219a = i10;
        this.f17220b = messagesStorage;
        this.f17221c = arrayList;
        this.d = j3;
    }
}
