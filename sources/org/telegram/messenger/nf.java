package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f18654a;
    public final MessagesStorage f18655b;
    public final a0.i f18656c;

    public nf(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f18654a = i10;
        this.f18655b = messagesStorage;
        this.f18656c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f18654a) {
            case 0:
                this.f18655b.lambda$getDialogs$239(this.f18656c);
                return;
            case 1:
                this.f18655b.lambda$markMessagesAsDeletedInternal$225(this.f18656c);
                return;
            case 2:
                this.f18655b.lambda$putWebPages$188(this.f18656c);
                return;
            default:
                this.f18655b.lambda$deleteEphemeralMessages$205(this.f18656c);
                return;
        }
    }
}
