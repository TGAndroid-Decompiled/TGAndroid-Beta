package org.telegram.messenger;
public final class df implements Runnable {
    public final int f15010a;
    public final MessagesStorage f15011b;
    public final long f15012c;
    public final long d;

    public df(int i10, long j3, long j10, MessagesStorage messagesStorage) {
        this.f15010a = i10;
        this.f15011b = messagesStorage;
        this.f15012c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f15010a) {
            case 0:
                this.f15011b.lambda$clearUserPhoto$93(this.f15012c, this.d);
                return;
            case 1:
                this.f15011b.lambda$saveChatInviter$132(this.f15012c, this.d);
                return;
            case 2:
                this.f15011b.lambda$setDialogFlags$37(this.f15012c, this.d);
                return;
            case 3:
                this.f15011b.lambda$removeTopic$57(this.f15012c, this.d);
                return;
            default:
                this.f15011b.lambda$deleteUserChatHistory$87(this.f15012c, this.d);
                return;
        }
    }
}
