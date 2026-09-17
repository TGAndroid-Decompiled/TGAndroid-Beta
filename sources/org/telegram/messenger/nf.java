package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f18511a;
    public final MessagesStorage f18512b;
    public final a0.i f18513c;

    public nf(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f18511a = i10;
        this.f18512b = messagesStorage;
        this.f18513c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f18511a) {
            case 0:
                this.f18512b.lambda$getDialogs$239(this.f18513c);
                return;
            case 1:
                this.f18512b.lambda$markMessagesAsDeletedInternal$225(this.f18513c);
                return;
            case 2:
                this.f18512b.lambda$putWebPages$188(this.f18513c);
                return;
            default:
                this.f18512b.lambda$deleteEphemeralMessages$205(this.f18513c);
                return;
        }
    }
}
