package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f18688a;
    public final MessagesStorage f18689b;
    public final a0.i f18690c;

    public nf(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f18688a = i10;
        this.f18689b = messagesStorage;
        this.f18690c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f18688a) {
            case 0:
                this.f18689b.lambda$getDialogs$239(this.f18690c);
                return;
            case 1:
                this.f18689b.lambda$markMessagesAsDeletedInternal$225(this.f18690c);
                return;
            case 2:
                this.f18689b.lambda$putWebPages$188(this.f18690c);
                return;
            default:
                this.f18689b.lambda$deleteEphemeralMessages$205(this.f18690c);
                return;
        }
    }
}
