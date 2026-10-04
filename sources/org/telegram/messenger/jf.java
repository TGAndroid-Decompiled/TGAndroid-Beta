package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f18268a;
    public final MessagesStorage f18269b;
    public final boolean f18270c;

    public jf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f18268a = i10;
        this.f18269b = messagesStorage;
        this.f18270c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18268a) {
            case 0:
                this.f18269b.lambda$getCachedPhoneBook$150(this.f18270c);
                return;
            default:
                this.f18269b.lambda$cleanup$6(this.f18270c);
                return;
        }
    }
}
