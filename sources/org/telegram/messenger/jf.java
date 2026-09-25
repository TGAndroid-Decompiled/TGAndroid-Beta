package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f16740a;
    public final MessagesStorage f16741b;
    public final boolean f16742c;

    public jf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f16740a = i10;
        this.f16741b = messagesStorage;
        this.f16742c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16740a) {
            case 0:
                this.f16741b.lambda$getCachedPhoneBook$150(this.f16742c);
                return;
            default:
                this.f16741b.lambda$cleanup$6(this.f16742c);
                return;
        }
    }
}
