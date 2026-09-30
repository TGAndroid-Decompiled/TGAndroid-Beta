package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f16744a;
    public final MessagesStorage f16745b;
    public final boolean f16746c;

    public jf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f16744a = i10;
        this.f16745b = messagesStorage;
        this.f16746c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16744a) {
            case 0:
                this.f16745b.lambda$getCachedPhoneBook$150(this.f16746c);
                return;
            default:
                this.f16745b.lambda$cleanup$6(this.f16746c);
                return;
        }
    }
}
