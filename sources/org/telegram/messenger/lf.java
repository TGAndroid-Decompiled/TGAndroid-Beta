package org.telegram.messenger;
public final class lf implements Runnable {
    public final int f18889a;
    public final MessagesStorage f18890b;
    public final a0.h f18891c;

    public lf(MessagesStorage messagesStorage, a0.h hVar, int i10) {
        this.f18889a = i10;
        this.f18890b = messagesStorage;
        this.f18891c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f18889a) {
            case 0:
                this.f18890b.lambda$getDialogs$239(this.f18891c);
                return;
            case 1:
                this.f18890b.lambda$markMessagesAsDeletedInternal$225(this.f18891c);
                return;
            case 2:
                this.f18890b.lambda$putWebPages$188(this.f18891c);
                return;
            default:
                this.f18890b.lambda$deleteEphemeralMessages$205(this.f18891c);
                return;
        }
    }
}
