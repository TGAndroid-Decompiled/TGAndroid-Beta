package org.telegram.messenger;
public final class gf implements Runnable {
    public final int f18465a;
    public final MessagesStorage f18466b;
    public final boolean f18467c;

    public gf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f18465a = i10;
        this.f18466b = messagesStorage;
        this.f18467c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18465a) {
            case 0:
                this.f18466b.lambda$getCachedPhoneBook$150(this.f18467c);
                return;
            default:
                this.f18466b.lambda$cleanup$6(this.f18467c);
                return;
        }
    }
}
