package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class b3 {
    public final int f21606a;
    public final int f21607b;
    public final int f21608c;
    public boolean d;

    public b3(int i7, int i10, int i11) {
        this.f21606a = i7;
        this.f21607b = i10;
        this.f21608c = i11;
    }

    public static void a(b3 b3Var, String str) {
        if (b3Var.d) {
            return;
        }
        b3Var.d = true;
        ConnectionsManager.native_receivedCaptchaResult(b3Var.f21606a, b3Var.f21607b, b3Var.f21608c, str);
    }
}
