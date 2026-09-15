package org.telegram.messenger;
public final class of implements Runnable {
    public final int f16957a;
    public final MessagesStorage f16958b;
    public final a0.i f16959c;

    public of(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f16957a = i10;
        this.f16958b = messagesStorage;
        this.f16959c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f16957a) {
            case 0:
                this.f16958b.lambda$getDialogs$239(this.f16959c);
                return;
            case 1:
                this.f16958b.lambda$markMessagesAsDeletedInternal$225(this.f16959c);
                return;
            case 2:
                this.f16958b.lambda$putWebPages$188(this.f16959c);
                return;
            default:
                this.f16958b.lambda$deleteEphemeralMessages$205(this.f16959c);
                return;
        }
    }
}
