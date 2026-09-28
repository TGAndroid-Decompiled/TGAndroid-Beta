package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f17125a;
    public final MessagesStorage f17126b;
    public final a0.i f17127c;

    public nf(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f17125a = i10;
        this.f17126b = messagesStorage;
        this.f17127c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f17125a) {
            case 0:
                this.f17126b.lambda$getDialogs$239(this.f17127c);
                return;
            case 1:
                this.f17126b.lambda$markMessagesAsDeletedInternal$225(this.f17127c);
                return;
            case 2:
                this.f17126b.lambda$putWebPages$188(this.f17127c);
                return;
            default:
                this.f17126b.lambda$deleteEphemeralMessages$205(this.f17127c);
                return;
        }
    }
}
