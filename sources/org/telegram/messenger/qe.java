package org.telegram.messenger;
public final class qe implements Runnable {
    public final int f21329a;
    public final MessagesStorage f21330b;
    public final long f21331c;
    public final long d;

    public qe(int i9, long j10, long j11, MessagesStorage messagesStorage) {
        this.f21329a = i9;
        this.f21330b = messagesStorage;
        this.f21331c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f21329a) {
            case 0:
                this.f21330b.lambda$clearUserPhoto$93(this.f21331c, this.d);
                return;
            case 1:
                this.f21330b.lambda$saveChatInviter$132(this.f21331c, this.d);
                return;
            case 2:
                this.f21330b.lambda$setDialogFlags$37(this.f21331c, this.d);
                return;
            case 3:
                this.f21330b.lambda$removeTopic$57(this.f21331c, this.d);
                return;
            default:
                this.f21330b.lambda$deleteUserChatHistory$87(this.f21331c, this.d);
                return;
        }
    }
}
