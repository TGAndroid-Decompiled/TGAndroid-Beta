package org.telegram.messenger;
public final class ue implements Runnable {
    public final int f19166a;
    public final MessagesStorage f19167b;
    public final long f19168c;
    public final long d;

    public ue(int i10, long j3, long j10, MessagesStorage messagesStorage) {
        this.f19166a = i10;
        this.f19167b = messagesStorage;
        this.f19168c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19166a) {
            case 0:
                this.f19167b.lambda$clearUserPhoto$93(this.f19168c, this.d);
                return;
            case 1:
                this.f19167b.lambda$saveChatInviter$132(this.f19168c, this.d);
                return;
            case 2:
                this.f19167b.lambda$setDialogFlags$37(this.f19168c, this.d);
                return;
            case 3:
                this.f19167b.lambda$removeTopic$57(this.f19168c, this.d);
                return;
            default:
                this.f19167b.lambda$deleteUserChatHistory$87(this.f19168c, this.d);
                return;
        }
    }
}
