package org.telegram.messenger;
public final class of implements Runnable {
    public final int f16953a;
    public final MessagesStorage f16954b;
    public final a0.i f16955c;

    public of(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f16953a = i10;
        this.f16954b = messagesStorage;
        this.f16955c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f16953a) {
            case 0:
                this.f16954b.lambda$getDialogs$239(this.f16955c);
                return;
            case 1:
                this.f16954b.lambda$markMessagesAsDeletedInternal$225(this.f16955c);
                return;
            case 2:
                this.f16954b.lambda$putWebPages$188(this.f16955c);
                return;
            default:
                this.f16954b.lambda$deleteEphemeralMessages$205(this.f16955c);
                return;
        }
    }
}
