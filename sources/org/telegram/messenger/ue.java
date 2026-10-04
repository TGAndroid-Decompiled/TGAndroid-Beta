package org.telegram.messenger;
public final class ue implements Runnable {
    public final int f19338a;
    public final MessagesStorage f19339b;
    public final long f19340c;
    public final long d;

    public ue(int i10, long j3, long j10, MessagesStorage messagesStorage) {
        this.f19338a = i10;
        this.f19339b = messagesStorage;
        this.f19340c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19338a) {
            case 0:
                this.f19339b.lambda$clearUserPhoto$93(this.f19340c, this.d);
                return;
            case 1:
                this.f19339b.lambda$saveChatInviter$132(this.f19340c, this.d);
                return;
            case 2:
                this.f19339b.lambda$setDialogFlags$37(this.f19340c, this.d);
                return;
            case 3:
                this.f19339b.lambda$removeTopic$57(this.f19340c, this.d);
                return;
            default:
                this.f19339b.lambda$deleteUserChatHistory$87(this.f19340c, this.d);
                return;
        }
    }
}
