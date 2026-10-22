package org.telegram.messenger;
public final class qf implements Runnable {
    public final int f19311a;
    public final MessagesStorage f19312b;
    public final a0.h f19313c;

    public qf(MessagesStorage messagesStorage, a0.h hVar, int i10) {
        this.f19311a = i10;
        this.f19312b = messagesStorage;
        this.f19313c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f19311a) {
            case 0:
                this.f19312b.lambda$getDialogs$239(this.f19313c);
                return;
            case 1:
                this.f19312b.lambda$markMessagesAsDeletedInternal$225(this.f19313c);
                return;
            case 2:
                this.f19312b.lambda$putWebPages$188(this.f19313c);
                return;
            default:
                this.f19312b.lambda$deleteEphemeralMessages$205(this.f19313c);
                return;
        }
    }
}
