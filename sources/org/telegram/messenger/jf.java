package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f18269a;
    public final MessagesStorage f18270b;
    public final boolean f18271c;

    public jf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f18269a = i10;
        this.f18270b = messagesStorage;
        this.f18271c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18269a) {
            case 0:
                this.f18270b.lambda$getCachedPhoneBook$150(this.f18271c);
                return;
            default:
                this.f18270b.lambda$cleanup$6(this.f18271c);
                return;
        }
    }
}
