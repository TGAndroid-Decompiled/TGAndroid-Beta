package org.telegram.messenger;

public final class nf implements Runnable {

    public final int f21086a;

    public final MessagesStorage f21087b;

    public final a0.h f21088c;

    public nf(MessagesStorage messagesStorage, a0.h hVar, int i10) {
        this.f21086a = i10;
        this.f21087b = messagesStorage;
        this.f21088c = hVar;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f21086a) {
            case 0:
                this.f21087b.lambda$getDialogs$239(this.f21088c);
                break;
            case 1:
                this.f21087b.lambda$markMessagesAsDeletedInternal$225(this.f21088c);
                break;
            case 2:
                this.f21087b.lambda$putWebPages$188(this.f21088c);
                break;
            default:
                this.f21087b.lambda$deleteEphemeralMessages$205(this.f21088c);
                break;
        }
    }
}
