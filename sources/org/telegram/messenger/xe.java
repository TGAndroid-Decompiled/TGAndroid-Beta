package org.telegram.messenger;
public final class xe implements Runnable {
    public final int f20145a;
    public final MessagesStorage f20146b;
    public final long f20147c;
    public final long d;

    public xe(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f20145a = i10;
        this.f20146b = messagesStorage;
        this.f20147c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f20145a) {
            case 0:
                this.f20146b.lambda$clearUserPhoto$93(this.f20147c, this.d);
                return;
            case 1:
                this.f20146b.lambda$saveChatInviter$132(this.f20147c, this.d);
                return;
            case 2:
                this.f20146b.lambda$setDialogFlags$37(this.f20147c, this.d);
                return;
            case 3:
                this.f20146b.lambda$removeTopic$57(this.f20147c, this.d);
                return;
            default:
                this.f20146b.lambda$deleteUserChatHistory$87(this.f20147c, this.d);
                return;
        }
    }
}
