package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f16743a;
    public final MessagesStorage f16744b;
    public final boolean f16745c;

    public jf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f16743a = i10;
        this.f16744b = messagesStorage;
        this.f16745c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16743a) {
            case 0:
                this.f16744b.lambda$getCachedPhoneBook$150(this.f16745c);
                return;
            default:
                this.f16744b.lambda$cleanup$6(this.f16745c);
                return;
        }
    }
}
