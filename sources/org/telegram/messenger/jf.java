package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f16760a;
    public final MessagesStorage f16761b;
    public final boolean f16762c;

    public jf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f16760a = i10;
        this.f16761b = messagesStorage;
        this.f16762c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16760a) {
            case 0:
                this.f16761b.lambda$getCachedPhoneBook$150(this.f16762c);
                return;
            default:
                this.f16761b.lambda$cleanup$6(this.f16762c);
                return;
        }
    }
}
