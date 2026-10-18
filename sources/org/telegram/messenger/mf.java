package org.telegram.messenger;
public final class mf implements Runnable {
    public final int f18965a;
    public final MessagesStorage f18966b;
    public final a0.h f18967c;

    public mf(MessagesStorage messagesStorage, a0.h hVar, int i10) {
        this.f18965a = i10;
        this.f18966b = messagesStorage;
        this.f18967c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f18965a) {
            case 0:
                this.f18966b.lambda$getDialogs$239(this.f18967c);
                return;
            case 1:
                this.f18966b.lambda$markMessagesAsDeletedInternal$225(this.f18967c);
                return;
            case 2:
                this.f18966b.lambda$putWebPages$188(this.f18967c);
                return;
            default:
                this.f18966b.lambda$deleteEphemeralMessages$205(this.f18967c);
                return;
        }
    }
}
