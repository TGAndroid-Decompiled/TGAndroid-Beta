package org.telegram.messenger;
public final class we implements Runnable {
    public final int f20003a;
    public final MessagesStorage f20004b;
    public final long f20005c;
    public final long d;

    public we(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f20003a = i10;
        this.f20004b = messagesStorage;
        this.f20005c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f20003a) {
            case 0:
                this.f20004b.lambda$clearUserPhoto$93(this.f20005c, this.d);
                return;
            case 1:
                this.f20004b.lambda$saveChatInviter$132(this.f20005c, this.d);
                return;
            case 2:
                this.f20004b.lambda$setDialogFlags$37(this.f20005c, this.d);
                return;
            case 3:
                this.f20004b.lambda$removeTopic$57(this.f20005c, this.d);
                return;
            default:
                this.f20004b.lambda$deleteUserChatHistory$87(this.f20005c, this.d);
                return;
        }
    }
}
