package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f18694a;
    public final MessagesStorage f18695b;
    public final a0.i f18696c;

    public nf(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f18694a = i10;
        this.f18695b = messagesStorage;
        this.f18696c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f18694a) {
            case 0:
                this.f18695b.lambda$getDialogs$239(this.f18696c);
                return;
            case 1:
                this.f18695b.lambda$markMessagesAsDeletedInternal$225(this.f18696c);
                return;
            case 2:
                this.f18695b.lambda$putWebPages$188(this.f18696c);
                return;
            default:
                this.f18695b.lambda$deleteEphemeralMessages$205(this.f18696c);
                return;
        }
    }
}
