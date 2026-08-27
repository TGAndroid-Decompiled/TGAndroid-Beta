package org.telegram.messenger;

public final class ue implements Runnable {

    public final int f21729a;

    public final MessagesStorage f21730b;

    public final long f21731c;
    public final long d;

    public ue(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f21729a = i10;
        this.f21730b = messagesStorage;
        this.f21731c = j10;
        this.d = j11;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f21729a) {
            case 0:
                this.f21730b.lambda$clearUserPhoto$93(this.f21731c, this.d);
                break;
            case 1:
                this.f21730b.lambda$saveChatInviter$132(this.f21731c, this.d);
                break;
            case 2:
                this.f21730b.lambda$setDialogFlags$37(this.f21731c, this.d);
                break;
            case 3:
                this.f21730b.lambda$removeTopic$57(this.f21731c, this.d);
                break;
            default:
                this.f21730b.lambda$deleteUserChatHistory$87(this.f21731c, this.d);
                break;
        }
    }
}
