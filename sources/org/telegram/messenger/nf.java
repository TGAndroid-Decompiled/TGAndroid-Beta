package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f18693a;
    public final MessagesStorage f18694b;
    public final a0.i f18695c;

    public nf(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f18693a = i10;
        this.f18694b = messagesStorage;
        this.f18695c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f18693a) {
            case 0:
                this.f18694b.lambda$getDialogs$239(this.f18695c);
                return;
            case 1:
                this.f18694b.lambda$markMessagesAsDeletedInternal$225(this.f18695c);
                return;
            case 2:
                this.f18694b.lambda$putWebPages$188(this.f18695c);
                return;
            default:
                this.f18694b.lambda$deleteEphemeralMessages$205(this.f18695c);
                return;
        }
    }
}
