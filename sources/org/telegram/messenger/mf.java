package org.telegram.messenger;
public final class mf implements Runnable {
    public final int f18284a;
    public final MessagesStorage f18285b;
    public final boolean f18286c;

    public mf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f18284a = i10;
        this.f18285b = messagesStorage;
        this.f18286c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18284a) {
            case 0:
                this.f18285b.lambda$getCachedPhoneBook$150(this.f18286c);
                return;
            default:
                this.f18285b.lambda$cleanup$6(this.f18286c);
                return;
        }
    }
}
