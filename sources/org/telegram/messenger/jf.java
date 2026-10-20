package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f18694a;
    public final MessagesStorage f18695b;
    public final boolean f18696c;

    public jf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f18694a = i10;
        this.f18695b = messagesStorage;
        this.f18696c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18694a) {
            case 0:
                this.f18695b.lambda$getCachedPhoneBook$150(this.f18696c);
                return;
            default:
                this.f18695b.lambda$cleanup$6(this.f18696c);
                return;
        }
    }
}
