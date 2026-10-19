package org.telegram.messenger;
public final class se implements Runnable {
    public final int f19495a;
    public final MessagesStorage f19496b;
    public final long f19497c;
    public final long d;

    public se(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f19495a = i10;
        this.f19496b = messagesStorage;
        this.f19497c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19495a) {
            case 0:
                this.f19496b.lambda$clearUserPhoto$93(this.f19497c, this.d);
                return;
            case 1:
                this.f19496b.lambda$saveChatInviter$132(this.f19497c, this.d);
                return;
            case 2:
                this.f19496b.lambda$setDialogFlags$37(this.f19497c, this.d);
                return;
            case 3:
                this.f19496b.lambda$removeTopic$57(this.f19497c, this.d);
                return;
            default:
                this.f19496b.lambda$deleteUserChatHistory$87(this.f19497c, this.d);
                return;
        }
    }
}
