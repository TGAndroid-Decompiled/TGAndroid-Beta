package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f17113a;
    public final MessagesStorage f17114b;
    public final a0.i f17115c;

    public nf(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f17113a = i10;
        this.f17114b = messagesStorage;
        this.f17115c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f17113a) {
            case 0:
                this.f17114b.lambda$getDialogs$239(this.f17115c);
                return;
            case 1:
                this.f17114b.lambda$markMessagesAsDeletedInternal$225(this.f17115c);
                return;
            case 2:
                this.f17114b.lambda$putWebPages$188(this.f17115c);
                return;
            default:
                this.f17114b.lambda$deleteEphemeralMessages$205(this.f17115c);
                return;
        }
    }
}
