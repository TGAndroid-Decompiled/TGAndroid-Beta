package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f17126a;
    public final MessagesStorage f17127b;
    public final a0.i f17128c;

    public nf(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f17126a = i10;
        this.f17127b = messagesStorage;
        this.f17128c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f17126a) {
            case 0:
                this.f17127b.lambda$getDialogs$239(this.f17128c);
                return;
            case 1:
                this.f17127b.lambda$markMessagesAsDeletedInternal$225(this.f17128c);
                return;
            case 2:
                this.f17127b.lambda$putWebPages$188(this.f17128c);
                return;
            default:
                this.f17127b.lambda$deleteEphemeralMessages$205(this.f17128c);
                return;
        }
    }
}
