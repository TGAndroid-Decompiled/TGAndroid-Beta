package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f20714a;
    public final MessagesStorage f20715b;
    public final a0.h f20716c;

    public jf(MessagesStorage messagesStorage, a0.h hVar, int i9) {
        this.f20714a = i9;
        this.f20715b = messagesStorage;
        this.f20716c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f20714a) {
            case 0:
                this.f20715b.lambda$getDialogs$239(this.f20716c);
                return;
            case 1:
                this.f20715b.lambda$markMessagesAsDeletedInternal$225(this.f20716c);
                return;
            case 2:
                this.f20715b.lambda$putWebPages$188(this.f20716c);
                return;
            default:
                this.f20715b.lambda$deleteEphemeralMessages$205(this.f20716c);
                return;
        }
    }
}
