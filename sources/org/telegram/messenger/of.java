package org.telegram.messenger;
public final class of implements Runnable {
    public final int f18588a;
    public final MessagesStorage f18589b;
    public final a0.i f18590c;

    public of(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f18588a = i10;
        this.f18589b = messagesStorage;
        this.f18590c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f18588a) {
            case 0:
                this.f18589b.lambda$getDialogs$239(this.f18590c);
                return;
            case 1:
                this.f18589b.lambda$markMessagesAsDeletedInternal$225(this.f18590c);
                return;
            case 2:
                this.f18589b.lambda$putWebPages$188(this.f18590c);
                return;
            default:
                this.f18589b.lambda$deleteEphemeralMessages$205(this.f18590c);
                return;
        }
    }
}
