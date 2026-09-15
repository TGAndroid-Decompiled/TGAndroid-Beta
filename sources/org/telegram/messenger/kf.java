package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f16582a;
    public final MessagesStorage f16583b;
    public final boolean f16584c;

    public kf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f16582a = i10;
        this.f16583b = messagesStorage;
        this.f16584c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16582a) {
            case 0:
                this.f16583b.lambda$getCachedPhoneBook$150(this.f16584c);
                return;
            default:
                this.f16583b.lambda$cleanup$6(this.f16584c);
                return;
        }
    }
}
