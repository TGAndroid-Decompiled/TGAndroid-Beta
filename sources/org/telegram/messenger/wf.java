package org.telegram.messenger;
public final class wf implements Runnable {
    public final int f16886a;
    public final MessagesStorage f16887b;
    public final a0.i f16888c;

    public wf(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f16886a = i10;
        this.f16887b = messagesStorage;
        this.f16888c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f16886a) {
            case 0:
                this.f16887b.lambda$getDialogs$239(this.f16888c);
                return;
            case 1:
                this.f16887b.lambda$markMessagesAsDeletedInternal$225(this.f16888c);
                return;
            case 2:
                this.f16887b.lambda$putWebPages$188(this.f16888c);
                return;
            default:
                this.f16887b.lambda$deleteEphemeralMessages$205(this.f16888c);
                return;
        }
    }
}
