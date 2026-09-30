package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f17142a;
    public final MessagesStorage f17143b;
    public final a0.i f17144c;

    public nf(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f17142a = i10;
        this.f17143b = messagesStorage;
        this.f17144c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f17142a) {
            case 0:
                this.f17143b.lambda$getDialogs$239(this.f17144c);
                return;
            case 1:
                this.f17143b.lambda$markMessagesAsDeletedInternal$225(this.f17144c);
                return;
            case 2:
                this.f17143b.lambda$putWebPages$188(this.f17144c);
                return;
            default:
                this.f17143b.lambda$deleteEphemeralMessages$205(this.f17144c);
                return;
        }
    }
}
