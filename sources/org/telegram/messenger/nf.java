package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f18697a;
    public final MessagesStorage f18698b;
    public final a0.i f18699c;

    public nf(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f18697a = i10;
        this.f18698b = messagesStorage;
        this.f18699c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f18697a) {
            case 0:
                this.f18698b.lambda$getDialogs$239(this.f18699c);
                return;
            case 1:
                this.f18698b.lambda$markMessagesAsDeletedInternal$225(this.f18699c);
                return;
            case 2:
                this.f18698b.lambda$putWebPages$188(this.f18699c);
                return;
            default:
                this.f18698b.lambda$deleteEphemeralMessages$205(this.f18699c);
                return;
        }
    }
}
