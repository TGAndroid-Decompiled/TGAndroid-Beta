package org.telegram.messenger;
public final class te implements Runnable {
    public final int f19583a;
    public final MessagesStorage f19584b;
    public final long f19585c;
    public final long d;

    public te(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f19583a = i10;
        this.f19584b = messagesStorage;
        this.f19585c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19583a) {
            case 0:
                this.f19584b.lambda$clearUserPhoto$93(this.f19585c, this.d);
                return;
            case 1:
                this.f19584b.lambda$saveChatInviter$132(this.f19585c, this.d);
                return;
            case 2:
                this.f19584b.lambda$setDialogFlags$37(this.f19585c, this.d);
                return;
            case 3:
                this.f19584b.lambda$removeTopic$57(this.f19585c, this.d);
                return;
            default:
                this.f19584b.lambda$deleteUserChatHistory$87(this.f19585c, this.d);
                return;
        }
    }
}
