package org.telegram.messenger;
public final class sf implements Runnable {
    public final int f16315a;
    public final MessagesStorage f16316b;
    public final boolean f16317c;

    public sf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f16315a = i10;
        this.f16316b = messagesStorage;
        this.f16317c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16315a) {
            case 0:
                this.f16316b.lambda$getCachedPhoneBook$150(this.f16317c);
                return;
            default:
                this.f16316b.lambda$cleanup$6(this.f16317c);
                return;
        }
    }
}
