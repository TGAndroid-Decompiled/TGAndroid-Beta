package org.telegram.messenger;
public final class ue implements Runnable {
    public final int f17693a;
    public final MessagesStorage f17694b;
    public final long f17695c;
    public final long d;

    public ue(int i10, long j3, long j10, MessagesStorage messagesStorage) {
        this.f17693a = i10;
        this.f17694b = messagesStorage;
        this.f17695c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17693a) {
            case 0:
                this.f17694b.lambda$clearUserPhoto$93(this.f17695c, this.d);
                return;
            case 1:
                this.f17694b.lambda$saveChatInviter$132(this.f17695c, this.d);
                return;
            case 2:
                this.f17694b.lambda$setDialogFlags$37(this.f17695c, this.d);
                return;
            case 3:
                this.f17694b.lambda$removeTopic$57(this.f17695c, this.d);
                return;
            default:
                this.f17694b.lambda$deleteUserChatHistory$87(this.f17695c, this.d);
                return;
        }
    }
}
