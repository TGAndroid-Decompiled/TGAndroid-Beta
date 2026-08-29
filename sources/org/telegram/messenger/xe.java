package org.telegram.messenger;
public final class xe implements Runnable {
    public final int f22175a;
    public final MessagesStorage f22176b;
    public final long f22177c;
    public final long d;

    public xe(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f22175a = i10;
        this.f22176b = messagesStorage;
        this.f22177c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f22175a) {
            case 0:
                this.f22176b.lambda$clearUserPhoto$93(this.f22177c, this.d);
                return;
            case 1:
                this.f22176b.lambda$saveChatInviter$132(this.f22177c, this.d);
                return;
            case 2:
                this.f22176b.lambda$setDialogFlags$37(this.f22177c, this.d);
                return;
            case 3:
                this.f22176b.lambda$removeTopic$57(this.f22177c, this.d);
                return;
            default:
                this.f22176b.lambda$deleteUserChatHistory$87(this.f22177c, this.d);
                return;
        }
    }
}
