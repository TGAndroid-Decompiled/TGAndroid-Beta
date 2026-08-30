package org.telegram.messenger;
public final class fi implements Runnable {
    public final int f17240a;
    public final SecretChatHelper f17241b;
    public final long f17242c;

    public fi(SecretChatHelper secretChatHelper, long j10, int i10) {
        this.f17240a = i10;
        this.f17241b = secretChatHelper;
        this.f17242c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17240a) {
            case 0:
                SecretChatHelper.x(this.f17241b, this.f17242c);
                return;
            case 1:
                SecretChatHelper.t(this.f17241b, this.f17242c);
                return;
            case 2:
                SecretChatHelper.j(this.f17241b, this.f17242c);
                return;
            default:
                SecretChatHelper.w(this.f17241b, this.f17242c);
                return;
        }
    }
}
