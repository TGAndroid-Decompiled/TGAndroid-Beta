package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f16827a;
    public final MessagesStorage f16828b;
    public final boolean f16829c;

    public kf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f16827a = i10;
        this.f16828b = messagesStorage;
        this.f16829c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16827a) {
            case 0:
                this.f16828b.lambda$getCachedPhoneBook$150(this.f16829c);
                return;
            default:
                this.f16828b.lambda$cleanup$6(this.f16829c);
                return;
        }
    }
}
