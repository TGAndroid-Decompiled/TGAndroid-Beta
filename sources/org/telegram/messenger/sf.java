package org.telegram.messenger;
public final class sf implements Runnable {
    public final int f18390a;
    public final MessagesStorage f18391b;
    public final a0.h f18392c;

    public sf(MessagesStorage messagesStorage, a0.h hVar, int i10) {
        this.f18390a = i10;
        this.f18391b = messagesStorage;
        this.f18392c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f18390a) {
            case 0:
                this.f18391b.lambda$getDialogs$239(this.f18392c);
                return;
            case 1:
                this.f18391b.lambda$markMessagesAsDeletedInternal$225(this.f18392c);
                return;
            case 2:
                this.f18391b.lambda$putWebPages$188(this.f18392c);
                return;
            default:
                this.f18391b.lambda$deleteEphemeralMessages$205(this.f18392c);
                return;
        }
    }
}
