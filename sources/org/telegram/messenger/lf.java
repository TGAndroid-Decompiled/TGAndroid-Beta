package org.telegram.messenger;
public final class lf implements Runnable {
    public final int f18887a;
    public final MessagesStorage f18888b;
    public final a0.h f18889c;

    public lf(MessagesStorage messagesStorage, a0.h hVar, int i10) {
        this.f18887a = i10;
        this.f18888b = messagesStorage;
        this.f18889c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f18887a) {
            case 0:
                this.f18888b.lambda$getDialogs$239(this.f18889c);
                return;
            case 1:
                this.f18888b.lambda$markMessagesAsDeletedInternal$225(this.f18889c);
                return;
            case 2:
                this.f18888b.lambda$putWebPages$188(this.f18889c);
                return;
            default:
                this.f18888b.lambda$deleteEphemeralMessages$205(this.f18889c);
                return;
        }
    }
}
