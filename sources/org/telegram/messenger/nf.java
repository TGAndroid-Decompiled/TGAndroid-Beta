package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f16860a;
    public final MessagesStorage f16861b;
    public final a0.i f16862c;

    public nf(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f16860a = i10;
        this.f16861b = messagesStorage;
        this.f16862c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f16860a) {
            case 0:
                this.f16861b.lambda$getDialogs$239(this.f16862c);
                return;
            case 1:
                this.f16861b.lambda$markMessagesAsDeletedInternal$225(this.f16862c);
                return;
            case 2:
                this.f16861b.lambda$putWebPages$188(this.f16862c);
                return;
            default:
                this.f16861b.lambda$deleteEphemeralMessages$205(this.f16862c);
                return;
        }
    }
}
