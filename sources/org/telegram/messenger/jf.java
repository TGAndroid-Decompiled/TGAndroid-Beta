package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f16480a;
    public final MessagesStorage f16481b;
    public final boolean f16482c;

    public jf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f16480a = i10;
        this.f16481b = messagesStorage;
        this.f16482c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16480a) {
            case 0:
                this.f16481b.lambda$getCachedPhoneBook$150(this.f16482c);
                return;
            default:
                this.f16481b.lambda$cleanup$6(this.f16482c);
                return;
        }
    }
}
