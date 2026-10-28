package org.telegram.messenger;
public final class cf implements Runnable {
    public final int f19828a;
    public final MessagesStorage f19829b;
    public final long f19830c;
    public final long d;

    public cf(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f19828a = i10;
        this.f19829b = messagesStorage;
        this.f19830c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19828a) {
            case 0:
                this.f19829b.lambda$saveChatInviter$136(this.f19830c, this.d);
                return;
            case 1:
                this.f19829b.lambda$setDialogFlags$37(this.f19830c, this.d);
                return;
            case 2:
                this.f19829b.lambda$removeTopic$60(this.f19830c, this.d);
                return;
            case 3:
                this.f19829b.lambda$deleteUserChatHistory$90(this.f19830c, this.d);
                return;
            default:
                this.f19829b.lambda$clearUserPhoto$96(this.f19830c, this.d);
                return;
        }
    }
}
