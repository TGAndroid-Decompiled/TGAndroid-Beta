package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class b3 {
    public final int f21582a;
    public final int f21583b;
    public final int f21584c;
    public boolean d;

    public b3(int i7, int i10, int i11) {
        this.f21582a = i7;
        this.f21583b = i10;
        this.f21584c = i11;
    }

    public static void a(b3 b3Var, String str) {
        if (b3Var.d) {
            return;
        }
        b3Var.d = true;
        ConnectionsManager.native_receivedCaptchaResult(b3Var.f21582a, b3Var.f21583b, b3Var.f21584c, str);
    }
}
