package org.telegram.messenger;
public final class lf implements Runnable {
    public final int f18890a;
    public final MessagesStorage f18891b;
    public final a0.h f18892c;

    public lf(MessagesStorage messagesStorage, a0.h hVar, int i10) {
        this.f18890a = i10;
        this.f18891b = messagesStorage;
        this.f18892c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f18890a) {
            case 0:
                this.f18891b.lambda$getDialogs$239(this.f18892c);
                return;
            case 1:
                this.f18891b.lambda$markMessagesAsDeletedInternal$225(this.f18892c);
                return;
            case 2:
                this.f18891b.lambda$putWebPages$188(this.f18892c);
                return;
            default:
                this.f18891b.lambda$deleteEphemeralMessages$205(this.f18892c);
                return;
        }
    }
}
