package org.telegram.messenger;
public final class of implements Runnable {
    public final int f18615a;
    public final MessagesStorage f18616b;
    public final a0.i f18617c;

    public of(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f18615a = i10;
        this.f18616b = messagesStorage;
        this.f18617c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f18615a) {
            case 0:
                this.f18616b.lambda$getDialogs$239(this.f18617c);
                return;
            case 1:
                this.f18616b.lambda$markMessagesAsDeletedInternal$225(this.f18617c);
                return;
            case 2:
                this.f18616b.lambda$putWebPages$188(this.f18617c);
                return;
            default:
                this.f18616b.lambda$deleteEphemeralMessages$205(this.f18617c);
                return;
        }
    }
}
