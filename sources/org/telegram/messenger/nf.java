package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f18658a;
    public final MessagesStorage f18659b;
    public final a0.i f18660c;

    public nf(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f18658a = i10;
        this.f18659b = messagesStorage;
        this.f18660c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f18658a) {
            case 0:
                this.f18659b.lambda$getDialogs$239(this.f18660c);
                return;
            case 1:
                this.f18659b.lambda$markMessagesAsDeletedInternal$225(this.f18660c);
                return;
            case 2:
                this.f18659b.lambda$putWebPages$188(this.f18660c);
                return;
            default:
                this.f18659b.lambda$deleteEphemeralMessages$205(this.f18660c);
                return;
        }
    }
}
