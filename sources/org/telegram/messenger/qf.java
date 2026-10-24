package org.telegram.messenger;
public final class qf implements Runnable {
    public final int f19378a;
    public final MessagesStorage f19379b;
    public final a0.h f19380c;

    public qf(MessagesStorage messagesStorage, a0.h hVar, int i10) {
        this.f19378a = i10;
        this.f19379b = messagesStorage;
        this.f19380c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f19378a) {
            case 0:
                this.f19379b.lambda$getDialogs$239(this.f19380c);
                return;
            case 1:
                this.f19379b.lambda$markMessagesAsDeletedInternal$225(this.f19380c);
                return;
            case 2:
                this.f19379b.lambda$putWebPages$188(this.f19380c);
                return;
            default:
                this.f19379b.lambda$deleteEphemeralMessages$205(this.f19380c);
                return;
        }
    }
}
