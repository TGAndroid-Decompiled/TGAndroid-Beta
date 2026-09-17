package org.telegram.messenger;
public final class ue implements Runnable {
    public final int f19193a;
    public final MessagesStorage f19194b;
    public final long f19195c;
    public final long d;

    public ue(int i10, long j3, long j10, MessagesStorage messagesStorage) {
        this.f19193a = i10;
        this.f19194b = messagesStorage;
        this.f19195c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19193a) {
            case 0:
                this.f19194b.lambda$clearUserPhoto$93(this.f19195c, this.d);
                return;
            case 1:
                this.f19194b.lambda$saveChatInviter$132(this.f19195c, this.d);
                return;
            case 2:
                this.f19194b.lambda$setDialogFlags$37(this.f19195c, this.d);
                return;
            case 3:
                this.f19194b.lambda$removeTopic$57(this.f19195c, this.d);
                return;
            default:
                this.f19194b.lambda$deleteUserChatHistory$87(this.f19195c, this.d);
                return;
        }
    }
}
