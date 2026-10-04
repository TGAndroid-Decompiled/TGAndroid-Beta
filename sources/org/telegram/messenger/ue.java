package org.telegram.messenger;
public final class ue implements Runnable {
    public final int f19344a;
    public final MessagesStorage f19345b;
    public final long f19346c;
    public final long d;

    public ue(int i10, long j3, long j10, MessagesStorage messagesStorage) {
        this.f19344a = i10;
        this.f19345b = messagesStorage;
        this.f19346c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19344a) {
            case 0:
                this.f19345b.lambda$clearUserPhoto$93(this.f19346c, this.d);
                return;
            case 1:
                this.f19345b.lambda$saveChatInviter$132(this.f19346c, this.d);
                return;
            case 2:
                this.f19345b.lambda$setDialogFlags$37(this.f19346c, this.d);
                return;
            case 3:
                this.f19345b.lambda$removeTopic$57(this.f19346c, this.d);
                return;
            default:
                this.f19345b.lambda$deleteUserChatHistory$87(this.f19346c, this.d);
                return;
        }
    }
}
