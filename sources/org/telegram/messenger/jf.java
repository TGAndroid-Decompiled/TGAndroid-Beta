package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f18122a;
    public final MessagesStorage f18123b;
    public final boolean f18124c;

    public jf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f18122a = i10;
        this.f18123b = messagesStorage;
        this.f18124c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18122a) {
            case 0:
                this.f18123b.lambda$getCachedPhoneBook$150(this.f18124c);
                return;
            default:
                this.f18123b.lambda$cleanup$6(this.f18124c);
                return;
        }
    }
}
