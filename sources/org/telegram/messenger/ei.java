package org.telegram.messenger;
public final class ei implements Runnable {
    public final int f20011a;
    public final SecretChatHelper f20012b;
    public final long f20013c;

    public ei(SecretChatHelper secretChatHelper, long j10, int i10) {
        this.f20011a = i10;
        this.f20012b = secretChatHelper;
        this.f20013c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20011a) {
            case 0:
                SecretChatHelper.y(this.f20012b, this.f20013c);
                return;
            case 1:
                SecretChatHelper.u(this.f20012b, this.f20013c);
                return;
            case 2:
                SecretChatHelper.j(this.f20012b, this.f20013c);
                return;
            default:
                SecretChatHelper.x(this.f20012b, this.f20013c);
                return;
        }
    }
}
