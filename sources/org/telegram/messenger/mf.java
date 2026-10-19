package org.telegram.messenger;
public final class mf implements Runnable {
    public final int f18968a;
    public final MessagesStorage f18969b;
    public final a0.h f18970c;

    public mf(MessagesStorage messagesStorage, a0.h hVar, int i10) {
        this.f18968a = i10;
        this.f18969b = messagesStorage;
        this.f18970c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f18968a) {
            case 0:
                this.f18969b.lambda$getDialogs$239(this.f18970c);
                return;
            case 1:
                this.f18969b.lambda$markMessagesAsDeletedInternal$225(this.f18970c);
                return;
            case 2:
                this.f18969b.lambda$putWebPages$188(this.f18970c);
                return;
            default:
                this.f18969b.lambda$deleteEphemeralMessages$205(this.f18970c);
                return;
        }
    }
}
