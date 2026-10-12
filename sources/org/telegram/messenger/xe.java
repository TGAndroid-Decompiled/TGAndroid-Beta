package org.telegram.messenger;
public final class xe implements Runnable {
    public final int f19018a;
    public final MessagesStorage f19019b;
    public final long f19020c;
    public final long d;

    public xe(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f19018a = i10;
        this.f19019b = messagesStorage;
        this.f19020c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19018a) {
            case 0:
                this.f19019b.lambda$clearUserPhoto$93(this.f19020c, this.d);
                return;
            case 1:
                this.f19019b.lambda$saveChatInviter$132(this.f19020c, this.d);
                return;
            case 2:
                this.f19019b.lambda$setDialogFlags$37(this.f19020c, this.d);
                return;
            case 3:
                this.f19019b.lambda$removeTopic$57(this.f19020c, this.d);
                return;
            default:
                this.f19019b.lambda$deleteUserChatHistory$87(this.f19020c, this.d);
                return;
        }
    }
}
