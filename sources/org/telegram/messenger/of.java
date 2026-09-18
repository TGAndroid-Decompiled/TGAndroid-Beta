package org.telegram.messenger;
public final class of implements Runnable {
    public final int f17133a;
    public final MessagesStorage f17134b;
    public final a0.i f17135c;

    public of(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f17133a = i10;
        this.f17134b = messagesStorage;
        this.f17135c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f17133a) {
            case 0:
                this.f17134b.lambda$getDialogs$239(this.f17135c);
                return;
            case 1:
                this.f17134b.lambda$markMessagesAsDeletedInternal$225(this.f17135c);
                return;
            case 2:
                this.f17134b.lambda$putWebPages$188(this.f17135c);
                return;
            default:
                this.f17134b.lambda$deleteEphemeralMessages$205(this.f17135c);
                return;
        }
    }
}
