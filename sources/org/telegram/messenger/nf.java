package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f17104a;
    public final MessagesStorage f17105b;
    public final a0.i f17106c;

    public nf(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f17104a = i10;
        this.f17105b = messagesStorage;
        this.f17106c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f17104a) {
            case 0:
                this.f17105b.lambda$getDialogs$239(this.f17106c);
                return;
            case 1:
                this.f17105b.lambda$markMessagesAsDeletedInternal$225(this.f17106c);
                return;
            case 2:
                this.f17105b.lambda$putWebPages$188(this.f17106c);
                return;
            default:
                this.f17105b.lambda$deleteEphemeralMessages$205(this.f17106c);
                return;
        }
    }
}
