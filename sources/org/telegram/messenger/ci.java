package org.telegram.messenger;
public final class ci implements Runnable {
    public final int f16145a;
    public final SecretChatHelper f16146b;
    public final long f16147c;

    public ci(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f16145a = i10;
        this.f16146b = secretChatHelper;
        this.f16147c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16145a) {
            case 0:
                SecretChatHelper.y(this.f16146b, this.f16147c);
                return;
            case 1:
                SecretChatHelper.u(this.f16146b, this.f16147c);
                return;
            case 2:
                SecretChatHelper.j(this.f16146b, this.f16147c);
                return;
            default:
                SecretChatHelper.x(this.f16146b, this.f16147c);
                return;
        }
    }
}
