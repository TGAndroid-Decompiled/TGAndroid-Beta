package org.telegram.messenger;
public final class sf implements Runnable {
    public final int f19999a;
    public final MessagesStorage f20000b;
    public final a0.h f20001c;

    public sf(MessagesStorage messagesStorage, a0.h hVar, int i10) {
        this.f19999a = i10;
        this.f20000b = messagesStorage;
        this.f20001c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f19999a) {
            case 0:
                this.f20000b.lambda$getDialogs$239(this.f20001c);
                return;
            case 1:
                this.f20000b.lambda$markMessagesAsDeletedInternal$225(this.f20001c);
                return;
            case 2:
                this.f20000b.lambda$putWebPages$188(this.f20001c);
                return;
            default:
                this.f20000b.lambda$deleteEphemeralMessages$205(this.f20001c);
                return;
        }
    }
}
