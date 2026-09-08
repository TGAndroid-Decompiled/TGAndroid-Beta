package org.telegram.messenger;
public final class ve implements Runnable {
    public final int f19267a;
    public final MessagesStorage f19268b;
    public final long f19269c;
    public final long d;

    public ve(int i10, long j3, long j10, MessagesStorage messagesStorage) {
        this.f19267a = i10;
        this.f19268b = messagesStorage;
        this.f19269c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19267a) {
            case 0:
                this.f19268b.lambda$clearUserPhoto$93(this.f19269c, this.d);
                return;
            case 1:
                this.f19268b.lambda$saveChatInviter$132(this.f19269c, this.d);
                return;
            case 2:
                this.f19268b.lambda$setDialogFlags$37(this.f19269c, this.d);
                return;
            case 3:
                this.f19268b.lambda$removeTopic$57(this.f19269c, this.d);
                return;
            default:
                this.f19268b.lambda$deleteUserChatHistory$87(this.f19269c, this.d);
                return;
        }
    }
}
