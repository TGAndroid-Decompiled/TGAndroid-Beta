package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f20518a;
    public final MessagesStorage f20519b;
    public final a0.h f20520c;

    public kf(MessagesStorage messagesStorage, a0.h hVar, int i10) {
        this.f20518a = i10;
        this.f20519b = messagesStorage;
        this.f20520c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f20518a) {
            case 0:
                this.f20519b.lambda$getDialogs$243(this.f20520c);
                return;
            case 1:
                this.f20519b.lambda$markMessagesAsDeletedInternal$229(this.f20520c);
                return;
            case 2:
                this.f20519b.lambda$deleteEphemeralMessages$209(this.f20520c);
                return;
            default:
                this.f20519b.lambda$putWebPages$192(this.f20520c);
                return;
        }
    }
}
