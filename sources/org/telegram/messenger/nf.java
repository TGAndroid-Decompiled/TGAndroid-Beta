package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f18698a;
    public final MessagesStorage f18699b;
    public final a0.i f18700c;

    public nf(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f18698a = i10;
        this.f18699b = messagesStorage;
        this.f18700c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f18698a) {
            case 0:
                this.f18699b.lambda$getDialogs$239(this.f18700c);
                return;
            case 1:
                this.f18699b.lambda$markMessagesAsDeletedInternal$225(this.f18700c);
                return;
            case 2:
                this.f18699b.lambda$putWebPages$188(this.f18700c);
                return;
            default:
                this.f18699b.lambda$deleteEphemeralMessages$205(this.f18700c);
                return;
        }
    }
}
