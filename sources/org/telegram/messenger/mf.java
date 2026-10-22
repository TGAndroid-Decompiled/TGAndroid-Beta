package org.telegram.messenger;
public final class mf implements Runnable {
    public final int f18969a;
    public final MessagesStorage f18970b;
    public final boolean f18971c;

    public mf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f18969a = i10;
        this.f18970b = messagesStorage;
        this.f18971c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18969a) {
            case 0:
                this.f18970b.lambda$getCachedPhoneBook$150(this.f18971c);
                return;
            default:
                this.f18970b.lambda$cleanup$6(this.f18971c);
                return;
        }
    }
}
