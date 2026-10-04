package org.telegram.messenger;
public final class ci implements Runnable {
    public final int f17593a;
    public final SecretChatHelper f17594b;
    public final long f17595c;

    public ci(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f17593a = i10;
        this.f17594b = secretChatHelper;
        this.f17595c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17593a) {
            case 0:
                SecretChatHelper.y(this.f17594b, this.f17595c);
                return;
            case 1:
                SecretChatHelper.u(this.f17594b, this.f17595c);
                return;
            case 2:
                SecretChatHelper.j(this.f17594b, this.f17595c);
                return;
            default:
                SecretChatHelper.x(this.f17594b, this.f17595c);
                return;
        }
    }
}
