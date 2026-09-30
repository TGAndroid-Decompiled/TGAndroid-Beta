package org.telegram.messenger;
public final class ue implements Runnable {
    public final int f17720a;
    public final MessagesStorage f17721b;
    public final long f17722c;
    public final long d;

    public ue(int i10, long j3, long j10, MessagesStorage messagesStorage) {
        this.f17720a = i10;
        this.f17721b = messagesStorage;
        this.f17722c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17720a) {
            case 0:
                this.f17721b.lambda$clearUserPhoto$93(this.f17722c, this.d);
                return;
            case 1:
                this.f17721b.lambda$saveChatInviter$132(this.f17722c, this.d);
                return;
            case 2:
                this.f17721b.lambda$setDialogFlags$37(this.f17722c, this.d);
                return;
            case 3:
                this.f17721b.lambda$removeTopic$57(this.f17722c, this.d);
                return;
            default:
                this.f17721b.lambda$deleteUserChatHistory$87(this.f17722c, this.d);
                return;
        }
    }
}
