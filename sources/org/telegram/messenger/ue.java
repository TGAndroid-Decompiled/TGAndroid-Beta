package org.telegram.messenger;
public final class ue implements Runnable {
    public final int f19346a;
    public final MessagesStorage f19347b;
    public final long f19348c;
    public final long d;

    public ue(int i10, long j3, long j10, MessagesStorage messagesStorage) {
        this.f19346a = i10;
        this.f19347b = messagesStorage;
        this.f19348c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19346a) {
            case 0:
                this.f19347b.lambda$clearUserPhoto$93(this.f19348c, this.d);
                return;
            case 1:
                this.f19347b.lambda$saveChatInviter$132(this.f19348c, this.d);
                return;
            case 2:
                this.f19347b.lambda$setDialogFlags$37(this.f19348c, this.d);
                return;
            case 3:
                this.f19347b.lambda$removeTopic$57(this.f19348c, this.d);
                return;
            default:
                this.f19347b.lambda$deleteUserChatHistory$87(this.f19348c, this.d);
                return;
        }
    }
}
