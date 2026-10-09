package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f18650a;
    public final MessagesStorage f18651b;
    public final a0.i f18652c;

    public nf(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f18650a = i10;
        this.f18651b = messagesStorage;
        this.f18652c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f18650a) {
            case 0:
                this.f18651b.lambda$getDialogs$239(this.f18652c);
                return;
            case 1:
                this.f18651b.lambda$markMessagesAsDeletedInternal$225(this.f18652c);
                return;
            case 2:
                this.f18651b.lambda$putWebPages$188(this.f18652c);
                return;
            default:
                this.f18651b.lambda$deleteEphemeralMessages$205(this.f18652c);
                return;
        }
    }
}
