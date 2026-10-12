package org.telegram.messenger;
public final class mf implements Runnable {
    public final int f18285a;
    public final MessagesStorage f18286b;
    public final boolean f18287c;

    public mf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f18285a = i10;
        this.f18286b = messagesStorage;
        this.f18287c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18285a) {
            case 0:
                this.f18286b.lambda$getCachedPhoneBook$150(this.f18287c);
                return;
            default:
                this.f18286b.lambda$cleanup$6(this.f18287c);
                return;
        }
    }
}
