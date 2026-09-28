package org.telegram.messenger;
public final class ue implements Runnable {
    public final int f17703a;
    public final MessagesStorage f17704b;
    public final long f17705c;
    public final long d;

    public ue(int i10, long j3, long j10, MessagesStorage messagesStorage) {
        this.f17703a = i10;
        this.f17704b = messagesStorage;
        this.f17705c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17703a) {
            case 0:
                this.f17704b.lambda$clearUserPhoto$93(this.f17705c, this.d);
                return;
            case 1:
                this.f17704b.lambda$saveChatInviter$132(this.f17705c, this.d);
                return;
            case 2:
                this.f17704b.lambda$setDialogFlags$37(this.f17705c, this.d);
                return;
            case 3:
                this.f17704b.lambda$removeTopic$57(this.f17705c, this.d);
                return;
            default:
                this.f17704b.lambda$deleteUserChatHistory$87(this.f17705c, this.d);
                return;
        }
    }
}
