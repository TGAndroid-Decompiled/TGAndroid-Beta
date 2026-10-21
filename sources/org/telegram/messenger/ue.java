package org.telegram.messenger;
public final class ue implements Runnable {
    public final int f19667a;
    public final MessagesStorage f19668b;
    public final long f19669c;
    public final long d;

    public ue(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f19667a = i10;
        this.f19668b = messagesStorage;
        this.f19669c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19667a) {
            case 0:
                this.f19668b.lambda$clearUserPhoto$93(this.f19669c, this.d);
                return;
            case 1:
                this.f19668b.lambda$saveChatInviter$132(this.f19669c, this.d);
                return;
            case 2:
                this.f19668b.lambda$setDialogFlags$37(this.f19669c, this.d);
                return;
            case 3:
                this.f19668b.lambda$removeTopic$57(this.f19669c, this.d);
                return;
            default:
                this.f19668b.lambda$deleteUserChatHistory$87(this.f19669c, this.d);
                return;
        }
    }
}
