package org.telegram.messenger;
public final class ue implements Runnable {
    public final int f19350a;
    public final MessagesStorage f19351b;
    public final long f19352c;
    public final long d;

    public ue(int i10, long j3, long j10, MessagesStorage messagesStorage) {
        this.f19350a = i10;
        this.f19351b = messagesStorage;
        this.f19352c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19350a) {
            case 0:
                this.f19351b.lambda$clearUserPhoto$93(this.f19352c, this.d);
                return;
            case 1:
                this.f19351b.lambda$saveChatInviter$132(this.f19352c, this.d);
                return;
            case 2:
                this.f19351b.lambda$setDialogFlags$37(this.f19352c, this.d);
                return;
            case 3:
                this.f19351b.lambda$removeTopic$57(this.f19352c, this.d);
                return;
            default:
                this.f19351b.lambda$deleteUserChatHistory$87(this.f19352c, this.d);
                return;
        }
    }
}
