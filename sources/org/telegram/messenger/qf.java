package org.telegram.messenger;
public final class qf implements Runnable {
    public final int f18223a;
    public final MessagesStorage f18224b;
    public final a0.h f18225c;

    public qf(MessagesStorage messagesStorage, a0.h hVar, int i10) {
        this.f18223a = i10;
        this.f18224b = messagesStorage;
        this.f18225c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f18223a) {
            case 0:
                this.f18224b.lambda$getDialogs$239(this.f18225c);
                return;
            case 1:
                this.f18224b.lambda$markMessagesAsDeletedInternal$225(this.f18225c);
                return;
            case 2:
                this.f18224b.lambda$putWebPages$188(this.f18225c);
                return;
            default:
                this.f18224b.lambda$deleteEphemeralMessages$205(this.f18225c);
                return;
        }
    }
}
