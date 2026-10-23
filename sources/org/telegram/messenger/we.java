package org.telegram.messenger;
public final class we implements Runnable {
    public final int f20068a;
    public final MessagesStorage f20069b;
    public final long f20070c;
    public final long d;

    public we(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f20068a = i10;
        this.f20069b = messagesStorage;
        this.f20070c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f20068a) {
            case 0:
                this.f20069b.lambda$clearUserPhoto$93(this.f20070c, this.d);
                return;
            case 1:
                this.f20069b.lambda$saveChatInviter$132(this.f20070c, this.d);
                return;
            case 2:
                this.f20069b.lambda$setDialogFlags$37(this.f20070c, this.d);
                return;
            case 3:
                this.f20069b.lambda$removeTopic$57(this.f20070c, this.d);
                return;
            default:
                this.f20069b.lambda$deleteUserChatHistory$87(this.f20070c, this.d);
                return;
        }
    }
}
