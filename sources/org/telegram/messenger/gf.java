package org.telegram.messenger;
public final class gf implements Runnable {
    public final int f18462a;
    public final MessagesStorage f18463b;
    public final boolean f18464c;

    public gf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f18462a = i10;
        this.f18463b = messagesStorage;
        this.f18464c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18462a) {
            case 0:
                this.f18463b.lambda$getCachedPhoneBook$150(this.f18464c);
                return;
            default:
                this.f18463b.lambda$cleanup$6(this.f18464c);
                return;
        }
    }
}
