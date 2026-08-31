package org.telegram.messenger;
public final class sf implements Runnable {
    public final int f19997a;
    public final MessagesStorage f19998b;
    public final a0.h f19999c;

    public sf(MessagesStorage messagesStorage, a0.h hVar, int i10) {
        this.f19997a = i10;
        this.f19998b = messagesStorage;
        this.f19999c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f19997a) {
            case 0:
                this.f19998b.lambda$getDialogs$239(this.f19999c);
                return;
            case 1:
                this.f19998b.lambda$markMessagesAsDeletedInternal$225(this.f19999c);
                return;
            case 2:
                this.f19998b.lambda$putWebPages$188(this.f19999c);
                return;
            default:
                this.f19998b.lambda$deleteEphemeralMessages$205(this.f19999c);
                return;
        }
    }
}
