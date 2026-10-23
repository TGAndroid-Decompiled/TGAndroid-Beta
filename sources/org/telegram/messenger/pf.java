package org.telegram.messenger;
public final class pf implements Runnable {
    public final int f19303a;
    public final MessagesStorage f19304b;
    public final a0.h f19305c;

    public pf(MessagesStorage messagesStorage, a0.h hVar, int i10) {
        this.f19303a = i10;
        this.f19304b = messagesStorage;
        this.f19305c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f19303a) {
            case 0:
                this.f19304b.lambda$getDialogs$239(this.f19305c);
                return;
            case 1:
                this.f19304b.lambda$markMessagesAsDeletedInternal$225(this.f19305c);
                return;
            case 2:
                this.f19304b.lambda$putWebPages$188(this.f19305c);
                return;
            default:
                this.f19304b.lambda$deleteEphemeralMessages$205(this.f19305c);
                return;
        }
    }
}
