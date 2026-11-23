package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class c3 {
    public final int f23186a;
    public final int f23187b;
    public final int f23188c;
    public boolean d;

    public c3(int i7, int i10, int i11) {
        this.f23186a = i7;
        this.f23187b = i10;
        this.f23188c = i11;
    }

    public static void a(c3 c3Var, String str) {
        if (c3Var.d) {
            return;
        }
        c3Var.d = true;
        ConnectionsManager.native_receivedCaptchaResult(c3Var.f23186a, c3Var.f23187b, c3Var.f23188c, str);
    }
}
