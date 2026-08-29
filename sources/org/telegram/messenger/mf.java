package org.telegram.messenger;
public final class mf implements Runnable {
    public final int f20965a;
    public final MessagesStorage f20966b;
    public final boolean f20967c;

    public mf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f20965a = i10;
        this.f20966b = messagesStorage;
        this.f20967c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20965a) {
            case 0:
                this.f20966b.lambda$getCachedPhoneBook$150(this.f20967c);
                return;
            default:
                this.f20966b.lambda$cleanup$6(this.f20967c);
                return;
        }
    }
}
