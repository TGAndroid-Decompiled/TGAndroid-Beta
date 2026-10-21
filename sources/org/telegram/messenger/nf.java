package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f19058a;
    public final MessagesStorage f19059b;
    public final a0.h f19060c;

    public nf(MessagesStorage messagesStorage, a0.h hVar, int i10) {
        this.f19058a = i10;
        this.f19059b = messagesStorage;
        this.f19060c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f19058a) {
            case 0:
                this.f19059b.lambda$getDialogs$239(this.f19060c);
                return;
            case 1:
                this.f19059b.lambda$markMessagesAsDeletedInternal$225(this.f19060c);
                return;
            case 2:
                this.f19059b.lambda$putWebPages$188(this.f19060c);
                return;
            default:
                this.f19059b.lambda$deleteEphemeralMessages$205(this.f19060c);
                return;
        }
    }
}
