package org.telegram.messenger;
public final class mf implements Runnable {
    public final int f17569a;
    public final MessagesStorage f17570b;
    public final boolean f17571c;

    public mf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f17569a = i10;
        this.f17570b = messagesStorage;
        this.f17571c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17569a) {
            case 0:
                this.f17570b.lambda$getCachedPhoneBook$150(this.f17571c);
                return;
            default:
                this.f17570b.lambda$cleanup$6(this.f17571c);
                return;
        }
    }
}
