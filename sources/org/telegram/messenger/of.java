package org.telegram.messenger;
public final class of implements Runnable {
    public final int f17195a;
    public final MessagesStorage f17196b;
    public final a0.i f17197c;

    public of(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f17195a = i10;
        this.f17196b = messagesStorage;
        this.f17197c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f17195a) {
            case 0:
                this.f17196b.lambda$getDialogs$239(this.f17197c);
                return;
            case 1:
                this.f17196b.lambda$markMessagesAsDeletedInternal$225(this.f17197c);
                return;
            case 2:
                this.f17196b.lambda$putWebPages$188(this.f17197c);
                return;
            default:
                this.f17196b.lambda$deleteEphemeralMessages$205(this.f17197c);
                return;
        }
    }
}
