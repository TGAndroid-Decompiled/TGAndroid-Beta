package org.telegram.messenger;
public final class qf implements Runnable {
    public final int f21364a;
    public final MessagesStorage f21365b;
    public final a0.h f21366c;

    public qf(MessagesStorage messagesStorage, a0.h hVar, int i10) {
        this.f21364a = i10;
        this.f21365b = messagesStorage;
        this.f21366c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f21364a) {
            case 0:
                this.f21365b.lambda$getDialogs$239(this.f21366c);
                return;
            case 1:
                this.f21365b.lambda$markMessagesAsDeletedInternal$225(this.f21366c);
                return;
            case 2:
                this.f21365b.lambda$putWebPages$188(this.f21366c);
                return;
            default:
                this.f21365b.lambda$deleteEphemeralMessages$205(this.f21366c);
                return;
        }
    }
}
