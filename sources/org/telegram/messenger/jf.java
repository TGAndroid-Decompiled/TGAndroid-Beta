package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f18260a;
    public final MessagesStorage f18261b;
    public final boolean f18262c;

    public jf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f18260a = i10;
        this.f18261b = messagesStorage;
        this.f18262c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18260a) {
            case 0:
                this.f18261b.lambda$getCachedPhoneBook$150(this.f18262c);
                return;
            default:
                this.f18261b.lambda$cleanup$6(this.f18262c);
                return;
        }
    }
}
