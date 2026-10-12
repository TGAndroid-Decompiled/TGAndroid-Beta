package org.telegram.messenger;
public final class xe implements Runnable {
    public final int f19581a;
    public final MessagesStorage f19582b;
    public final long f19583c;
    public final long d;

    public xe(int i10, long j3, long j10, MessagesStorage messagesStorage) {
        this.f19581a = i10;
        this.f19582b = messagesStorage;
        this.f19583c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19581a) {
            case 0:
                this.f19582b.lambda$clearUserPhoto$93(this.f19583c, this.d);
                return;
            case 1:
                this.f19582b.lambda$saveChatInviter$132(this.f19583c, this.d);
                return;
            case 2:
                this.f19582b.lambda$setDialogFlags$37(this.f19583c, this.d);
                return;
            case 3:
                this.f19582b.lambda$removeTopic$57(this.f19583c, this.d);
                return;
            default:
                this.f19582b.lambda$deleteUserChatHistory$87(this.f19583c, this.d);
                return;
        }
    }
}
