package org.telegram.messenger;
public final class qf implements Runnable {
    public final int f17921a;
    public final MessagesStorage f17922b;
    public final a0.h f17923c;

    public qf(MessagesStorage messagesStorage, a0.h hVar, int i10) {
        this.f17921a = i10;
        this.f17922b = messagesStorage;
        this.f17923c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f17921a) {
            case 0:
                this.f17922b.lambda$getDialogs$239(this.f17923c);
                return;
            case 1:
                this.f17922b.lambda$markMessagesAsDeletedInternal$225(this.f17923c);
                return;
            case 2:
                this.f17922b.lambda$putWebPages$188(this.f17923c);
                return;
            default:
                this.f17922b.lambda$deleteEphemeralMessages$205(this.f17923c);
                return;
        }
    }
}
