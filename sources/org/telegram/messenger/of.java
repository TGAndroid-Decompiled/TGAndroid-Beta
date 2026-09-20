package org.telegram.messenger;
public final class of implements Runnable {
    public final int f17180a;
    public final MessagesStorage f17181b;
    public final a0.i f17182c;

    public of(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f17180a = i10;
        this.f17181b = messagesStorage;
        this.f17182c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f17180a) {
            case 0:
                this.f17181b.lambda$getDialogs$239(this.f17182c);
                return;
            case 1:
                this.f17181b.lambda$markMessagesAsDeletedInternal$225(this.f17182c);
                return;
            case 2:
                this.f17181b.lambda$putWebPages$188(this.f17182c);
                return;
            default:
                this.f17181b.lambda$deleteEphemeralMessages$205(this.f17182c);
                return;
        }
    }
}
