package org.telegram.messenger;
public final class pf implements Runnable {
    public final int f19238a;
    public final MessagesStorage f19239b;
    public final a0.h f19240c;

    public pf(MessagesStorage messagesStorage, a0.h hVar, int i10) {
        this.f19238a = i10;
        this.f19239b = messagesStorage;
        this.f19240c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f19238a) {
            case 0:
                this.f19239b.lambda$getDialogs$239(this.f19240c);
                return;
            case 1:
                this.f19239b.lambda$markMessagesAsDeletedInternal$225(this.f19240c);
                return;
            case 2:
                this.f19239b.lambda$putWebPages$188(this.f19240c);
                return;
            default:
                this.f19239b.lambda$deleteEphemeralMessages$205(this.f19240c);
                return;
        }
    }
}
