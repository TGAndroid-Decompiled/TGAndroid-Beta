package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f18538a;
    public final MessagesStorage f18539b;
    public final a0.i f18540c;

    public nf(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f18538a = i10;
        this.f18539b = messagesStorage;
        this.f18540c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f18538a) {
            case 0:
                this.f18539b.lambda$getDialogs$239(this.f18540c);
                return;
            case 1:
                this.f18539b.lambda$markMessagesAsDeletedInternal$225(this.f18540c);
                return;
            case 2:
                this.f18539b.lambda$putWebPages$188(this.f18540c);
                return;
            default:
                this.f18539b.lambda$deleteEphemeralMessages$205(this.f18540c);
                return;
        }
    }
}
