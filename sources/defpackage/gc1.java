package defpackage;

import org.telegram.tgnet.ConnectionsManager;
public final class gc1 {
    public final int a;
    public final int b;
    public final int c;
    public boolean d;

    public gc1(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final void a(String str) {
        if (this.d) {
            return;
        }
        this.d = true;
        ConnectionsManager.native_receivedCaptchaResult(this.a, this.b, this.c, str);
    }
}
