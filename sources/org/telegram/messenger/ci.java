package org.telegram.messenger;
public final class ci implements Runnable {
    public final int f17581a;
    public final SecretChatHelper f17582b;
    public final long f17583c;

    public ci(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f17581a = i10;
        this.f17582b = secretChatHelper;
        this.f17583c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17581a) {
            case 0:
                SecretChatHelper.y(this.f17582b, this.f17583c);
                return;
            case 1:
                SecretChatHelper.u(this.f17582b, this.f17583c);
                return;
            case 2:
                SecretChatHelper.j(this.f17582b, this.f17583c);
                return;
            default:
                SecretChatHelper.x(this.f17582b, this.f17583c);
                return;
        }
    }
}
