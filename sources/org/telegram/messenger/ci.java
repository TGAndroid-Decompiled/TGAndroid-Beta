package org.telegram.messenger;
public final class ci implements Runnable {
    public final int f17416a;
    public final SecretChatHelper f17417b;
    public final long f17418c;

    public ci(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f17416a = i10;
        this.f17417b = secretChatHelper;
        this.f17418c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17416a) {
            case 0:
                SecretChatHelper.x(this.f17417b, this.f17418c);
                return;
            case 1:
                SecretChatHelper.t(this.f17417b, this.f17418c);
                return;
            case 2:
                SecretChatHelper.j(this.f17417b, this.f17418c);
                return;
            default:
                SecretChatHelper.w(this.f17417b, this.f17418c);
                return;
        }
    }
}
