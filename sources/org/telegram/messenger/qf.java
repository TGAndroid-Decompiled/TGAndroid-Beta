package org.telegram.messenger;
public final class qf implements Runnable {
    public final int f18706a;
    public final MessagesStorage f18707b;
    public final a0.i f18708c;

    public qf(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f18706a = i10;
        this.f18707b = messagesStorage;
        this.f18708c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f18706a) {
            case 0:
                this.f18707b.lambda$getDialogs$239(this.f18708c);
                return;
            case 1:
                this.f18707b.lambda$markMessagesAsDeletedInternal$225(this.f18708c);
                return;
            case 2:
                this.f18707b.lambda$putWebPages$188(this.f18708c);
                return;
            default:
                this.f18707b.lambda$deleteEphemeralMessages$205(this.f18708c);
                return;
        }
    }
}
