package org.telegram.messenger;
public final class ue implements Runnable {
    public final int f19384a;
    public final MessagesStorage f19385b;
    public final long f19386c;
    public final long d;

    public ue(int i10, long j3, long j10, MessagesStorage messagesStorage) {
        this.f19384a = i10;
        this.f19385b = messagesStorage;
        this.f19386c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19384a) {
            case 0:
                this.f19385b.lambda$clearUserPhoto$93(this.f19386c, this.d);
                return;
            case 1:
                this.f19385b.lambda$saveChatInviter$132(this.f19386c, this.d);
                return;
            case 2:
                this.f19385b.lambda$setDialogFlags$37(this.f19386c, this.d);
                return;
            case 3:
                this.f19385b.lambda$removeTopic$57(this.f19386c, this.d);
                return;
            default:
                this.f19385b.lambda$deleteUserChatHistory$87(this.f19386c, this.d);
                return;
        }
    }
}
