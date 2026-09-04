package org.telegram.messenger;
public final class ve implements Runnable {
    public final int f19240a;
    public final MessagesStorage f19241b;
    public final long f19242c;
    public final long d;

    public ve(int i10, long j3, long j10, MessagesStorage messagesStorage) {
        this.f19240a = i10;
        this.f19241b = messagesStorage;
        this.f19242c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19240a) {
            case 0:
                this.f19241b.lambda$clearUserPhoto$93(this.f19242c, this.d);
                return;
            case 1:
                this.f19241b.lambda$saveChatInviter$132(this.f19242c, this.d);
                return;
            case 2:
                this.f19241b.lambda$setDialogFlags$37(this.f19242c, this.d);
                return;
            case 3:
                this.f19241b.lambda$removeTopic$57(this.f19242c, this.d);
                return;
            default:
                this.f19241b.lambda$deleteUserChatHistory$87(this.f19242c, this.d);
                return;
        }
    }
}
