package org.telegram.messenger;
public final class of implements Runnable {
    public final int f16966a;
    public final MessagesStorage f16967b;
    public final a0.i f16968c;

    public of(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.f16966a = i10;
        this.f16967b = messagesStorage;
        this.f16968c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f16966a) {
            case 0:
                this.f16967b.lambda$getDialogs$239(this.f16968c);
                return;
            case 1:
                this.f16967b.lambda$markMessagesAsDeletedInternal$225(this.f16968c);
                return;
            case 2:
                this.f16967b.lambda$putWebPages$188(this.f16968c);
                return;
            default:
                this.f16967b.lambda$deleteEphemeralMessages$205(this.f16968c);
                return;
        }
    }
}
