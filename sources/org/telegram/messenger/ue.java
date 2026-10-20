package org.telegram.messenger;
public final class ue implements Runnable {
    public final int f19670a;
    public final MessagesStorage f19671b;
    public final long f19672c;
    public final long d;

    public ue(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f19670a = i10;
        this.f19671b = messagesStorage;
        this.f19672c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19670a) {
            case 0:
                this.f19671b.lambda$clearUserPhoto$93(this.f19672c, this.d);
                return;
            case 1:
                this.f19671b.lambda$saveChatInviter$132(this.f19672c, this.d);
                return;
            case 2:
                this.f19671b.lambda$setDialogFlags$37(this.f19672c, this.d);
                return;
            case 3:
                this.f19671b.lambda$removeTopic$57(this.f19672c, this.d);
                return;
            default:
                this.f19671b.lambda$deleteUserChatHistory$87(this.f19672c, this.d);
                return;
        }
    }
}
