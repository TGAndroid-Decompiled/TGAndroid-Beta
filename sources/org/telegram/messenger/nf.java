package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f19062a;
    public final MessagesStorage f19063b;
    public final a0.h f19064c;

    public nf(MessagesStorage messagesStorage, a0.h hVar, int i10) {
        this.f19062a = i10;
        this.f19063b = messagesStorage;
        this.f19064c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f19062a) {
            case 0:
                this.f19063b.lambda$getDialogs$239(this.f19064c);
                return;
            case 1:
                this.f19063b.lambda$markMessagesAsDeletedInternal$225(this.f19064c);
                return;
            case 2:
                this.f19063b.lambda$putWebPages$188(this.f19064c);
                return;
            default:
                this.f19063b.lambda$deleteEphemeralMessages$205(this.f19064c);
                return;
        }
    }
}
