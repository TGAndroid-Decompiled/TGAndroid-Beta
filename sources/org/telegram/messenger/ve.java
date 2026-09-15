package org.telegram.messenger;
public final class ve implements Runnable {
    public final int f17544a;
    public final MessagesStorage f17545b;
    public final long f17546c;
    public final long d;

    public ve(int i10, long j3, long j10, MessagesStorage messagesStorage) {
        this.f17544a = i10;
        this.f17545b = messagesStorage;
        this.f17546c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17544a) {
            case 0:
                this.f17545b.lambda$clearUserPhoto$93(this.f17546c, this.d);
                return;
            case 1:
                this.f17545b.lambda$saveChatInviter$132(this.f17546c, this.d);
                return;
            case 2:
                this.f17545b.lambda$setDialogFlags$37(this.f17546c, this.d);
                return;
            case 3:
                this.f17545b.lambda$removeTopic$57(this.f17546c, this.d);
                return;
            default:
                this.f17545b.lambda$deleteUserChatHistory$87(this.f17546c, this.d);
                return;
        }
    }
}
