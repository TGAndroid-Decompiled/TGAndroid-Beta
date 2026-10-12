package org.telegram.messenger;
public final class xe implements Runnable {
    public final int f19580a;
    public final MessagesStorage f19581b;
    public final long f19582c;
    public final long d;

    public xe(int i10, long j3, long j10, MessagesStorage messagesStorage) {
        this.f19580a = i10;
        this.f19581b = messagesStorage;
        this.f19582c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19580a) {
            case 0:
                this.f19581b.lambda$clearUserPhoto$93(this.f19582c, this.d);
                return;
            case 1:
                this.f19581b.lambda$saveChatInviter$132(this.f19582c, this.d);
                return;
            case 2:
                this.f19581b.lambda$setDialogFlags$37(this.f19582c, this.d);
                return;
            case 3:
                this.f19581b.lambda$removeTopic$57(this.f19582c, this.d);
                return;
            default:
                this.f19581b.lambda$deleteUserChatHistory$87(this.f19582c, this.d);
                return;
        }
    }
}
