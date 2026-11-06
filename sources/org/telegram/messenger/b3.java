package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class b3 {
    public final int f21581a;
    public final int f21582b;
    public final int f21583c;
    public boolean d;

    public b3(int i7, int i10, int i11) {
        this.f21581a = i7;
        this.f21582b = i10;
        this.f21583c = i11;
    }

    public static void a(b3 b3Var, String str) {
        if (b3Var.d) {
            return;
        }
        b3Var.d = true;
        ConnectionsManager.native_receivedCaptchaResult(b3Var.f21581a, b3Var.f21582b, b3Var.f21583c, str);
    }
}
