package org.telegram.messenger;
public final class qf implements Runnable {
    public final int f18707a;
    public final MessagesStorage f18708b;
    public final a0.i f18709c;

    public qf(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f18707a = i10;
        this.f18708b = messagesStorage;
        this.f18709c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f18707a) {
            case 0:
                this.f18708b.lambda$getDialogs$239(this.f18709c);
                return;
            case 1:
                this.f18708b.lambda$markMessagesAsDeletedInternal$225(this.f18709c);
                return;
            case 2:
                this.f18708b.lambda$putWebPages$188(this.f18709c);
                return;
            default:
                this.f18708b.lambda$deleteEphemeralMessages$205(this.f18709c);
                return;
        }
    }
}
