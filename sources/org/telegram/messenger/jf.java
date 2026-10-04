package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f18263a;
    public final MessagesStorage f18264b;
    public final boolean f18265c;

    public jf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f18263a = i10;
        this.f18264b = messagesStorage;
        this.f18265c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18263a) {
            case 0:
                this.f18264b.lambda$getCachedPhoneBook$150(this.f18265c);
                return;
            default:
                this.f18264b.lambda$cleanup$6(this.f18265c);
                return;
        }
    }
}
