package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f18305a;
    public final MessagesStorage f18306b;
    public final boolean f18307c;

    public jf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f18305a = i10;
        this.f18306b = messagesStorage;
        this.f18307c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18305a) {
            case 0:
                this.f18306b.lambda$getCachedPhoneBook$150(this.f18307c);
                return;
            default:
                this.f18306b.lambda$cleanup$6(this.f18307c);
                return;
        }
    }
}
