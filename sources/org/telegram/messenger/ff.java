package org.telegram.messenger;
public final class ff implements Runnable {
    public final int f20089a;
    public final MessagesStorage f20090b;
    public final a0.h f20091c;

    public ff(MessagesStorage messagesStorage, a0.h hVar, int i10) {
        this.f20089a = i10;
        this.f20090b = messagesStorage;
        this.f20091c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f20089a) {
            case 0:
                this.f20090b.lambda$deleteEphemeralMessages$208(this.f20091c);
                return;
            case 1:
                this.f20090b.lambda$markMessagesAsDeletedInternal$228(this.f20091c);
                return;
            case 2:
                this.f20090b.lambda$putWebPages$191(this.f20091c);
                return;
            default:
                this.f20090b.lambda$getDialogs$242(this.f20091c);
                return;
        }
    }
}
