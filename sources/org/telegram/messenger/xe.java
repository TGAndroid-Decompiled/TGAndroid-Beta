package org.telegram.messenger;
public final class xe implements Runnable {
    public final int f20080a;
    public final MessagesStorage f20081b;
    public final long f20082c;
    public final long d;

    public xe(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f20080a = i10;
        this.f20081b = messagesStorage;
        this.f20082c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f20080a) {
            case 0:
                this.f20081b.lambda$clearUserPhoto$93(this.f20082c, this.d);
                return;
            case 1:
                this.f20081b.lambda$saveChatInviter$132(this.f20082c, this.d);
                return;
            case 2:
                this.f20081b.lambda$setDialogFlags$37(this.f20082c, this.d);
                return;
            case 3:
                this.f20081b.lambda$removeTopic$57(this.f20082c, this.d);
                return;
            default:
                this.f20081b.lambda$deleteUserChatHistory$87(this.f20082c, this.d);
                return;
        }
    }
}
