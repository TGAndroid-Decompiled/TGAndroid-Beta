package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f16737a;
    public final MessagesStorage f16738b;
    public final boolean f16739c;

    public jf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f16737a = i10;
        this.f16738b = messagesStorage;
        this.f16739c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16737a) {
            case 0:
                this.f16738b.lambda$getCachedPhoneBook$150(this.f16739c);
                return;
            default:
                this.f16738b.lambda$cleanup$6(this.f16739c);
                return;
        }
    }
}
