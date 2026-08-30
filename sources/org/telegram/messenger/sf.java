package org.telegram.messenger;
public final class sf implements Runnable {
    public final int f18410a;
    public final MessagesStorage f18411b;
    public final a0.h f18412c;

    public sf(MessagesStorage messagesStorage, a0.h hVar, int i10) {
        this.f18410a = i10;
        this.f18411b = messagesStorage;
        this.f18412c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f18410a) {
            case 0:
                this.f18411b.lambda$getDialogs$239(this.f18412c);
                return;
            case 1:
                this.f18411b.lambda$markMessagesAsDeletedInternal$225(this.f18412c);
                return;
            case 2:
                this.f18411b.lambda$putWebPages$188(this.f18412c);
                return;
            default:
                this.f18411b.lambda$deleteEphemeralMessages$205(this.f18412c);
                return;
        }
    }
}
