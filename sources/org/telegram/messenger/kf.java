package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f16591a;
    public final MessagesStorage f16592b;
    public final boolean f16593c;

    public kf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f16591a = i10;
        this.f16592b = messagesStorage;
        this.f16593c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16591a) {
            case 0:
                this.f16592b.lambda$getCachedPhoneBook$150(this.f16593c);
                return;
            default:
                this.f16592b.lambda$cleanup$6(this.f16593c);
                return;
        }
    }
}
