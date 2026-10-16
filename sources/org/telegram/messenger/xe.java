package org.telegram.messenger;
public final class xe implements Runnable {
    public final int f18722a;
    public final MessagesStorage f18723b;
    public final long f18724c;
    public final long d;

    public xe(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f18722a = i10;
        this.f18723b = messagesStorage;
        this.f18724c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18722a) {
            case 0:
                this.f18723b.lambda$clearUserPhoto$93(this.f18724c, this.d);
                return;
            case 1:
                this.f18723b.lambda$saveChatInviter$132(this.f18724c, this.d);
                return;
            case 2:
                this.f18723b.lambda$setDialogFlags$37(this.f18724c, this.d);
                return;
            case 3:
                this.f18723b.lambda$removeTopic$57(this.f18724c, this.d);
                return;
            default:
                this.f18723b.lambda$deleteUserChatHistory$87(this.f18724c, this.d);
                return;
        }
    }
}
