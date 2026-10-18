package org.telegram.messenger;
public final class se implements Runnable {
    public final int f19498a;
    public final MessagesStorage f19499b;
    public final long f19500c;
    public final long d;

    public se(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f19498a = i10;
        this.f19499b = messagesStorage;
        this.f19500c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19498a) {
            case 0:
                this.f19499b.lambda$clearUserPhoto$93(this.f19500c, this.d);
                return;
            case 1:
                this.f19499b.lambda$saveChatInviter$132(this.f19500c, this.d);
                return;
            case 2:
                this.f19499b.lambda$setDialogFlags$37(this.f19500c, this.d);
                return;
            case 3:
                this.f19499b.lambda$removeTopic$57(this.f19500c, this.d);
                return;
            default:
                this.f19499b.lambda$deleteUserChatHistory$87(this.f19500c, this.d);
                return;
        }
    }
}
