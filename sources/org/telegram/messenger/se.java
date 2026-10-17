package org.telegram.messenger;
public final class se implements Runnable {
    public final int f19497a;
    public final MessagesStorage f19498b;
    public final long f19499c;
    public final long d;

    public se(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f19497a = i10;
        this.f19498b = messagesStorage;
        this.f19499c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19497a) {
            case 0:
                this.f19498b.lambda$clearUserPhoto$93(this.f19499c, this.d);
                return;
            case 1:
                this.f19498b.lambda$saveChatInviter$132(this.f19499c, this.d);
                return;
            case 2:
                this.f19498b.lambda$setDialogFlags$37(this.f19499c, this.d);
                return;
            case 3:
                this.f19498b.lambda$removeTopic$57(this.f19499c, this.d);
                return;
            default:
                this.f19498b.lambda$deleteUserChatHistory$87(this.f19499c, this.d);
                return;
        }
    }
}
