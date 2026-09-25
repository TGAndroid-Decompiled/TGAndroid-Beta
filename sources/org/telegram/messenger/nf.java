package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f17119a;
    public final MessagesStorage f17120b;
    public final a0.i f17121c;

    public nf(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f17119a = i10;
        this.f17120b = messagesStorage;
        this.f17121c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f17119a) {
            case 0:
                this.f17120b.lambda$getDialogs$239(this.f17121c);
                return;
            case 1:
                this.f17120b.lambda$markMessagesAsDeletedInternal$225(this.f17121c);
                return;
            case 2:
                this.f17120b.lambda$putWebPages$188(this.f17121c);
                return;
            default:
                this.f17120b.lambda$deleteEphemeralMessages$205(this.f17121c);
                return;
        }
    }
}
