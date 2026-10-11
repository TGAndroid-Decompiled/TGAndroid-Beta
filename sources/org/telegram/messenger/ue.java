package org.telegram.messenger;
public final class ue implements Runnable {
    public final int f19348a;
    public final MessagesStorage f19349b;
    public final long f19350c;
    public final long d;

    public ue(int i10, long j3, long j10, MessagesStorage messagesStorage) {
        this.f19348a = i10;
        this.f19349b = messagesStorage;
        this.f19350c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19348a) {
            case 0:
                this.f19349b.lambda$clearUserPhoto$93(this.f19350c, this.d);
                return;
            case 1:
                this.f19349b.lambda$saveChatInviter$132(this.f19350c, this.d);
                return;
            case 2:
                this.f19349b.lambda$setDialogFlags$37(this.f19350c, this.d);
                return;
            case 3:
                this.f19349b.lambda$removeTopic$57(this.f19350c, this.d);
                return;
            default:
                this.f19349b.lambda$deleteUserChatHistory$87(this.f19350c, this.d);
                return;
        }
    }
}
