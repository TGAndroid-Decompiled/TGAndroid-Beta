package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class c3 {
    public final int f23370a;
    public final int f23371b;
    public final int f23372c;
    public boolean d;

    public c3(int i7, int i10, int i11) {
        this.f23370a = i7;
        this.f23371b = i10;
        this.f23372c = i11;
    }

    public static void a(c3 c3Var, String str) {
        if (c3Var.d) {
            return;
        }
        c3Var.d = true;
        ConnectionsManager.native_receivedCaptchaResult(c3Var.f23370a, c3Var.f23371b, c3Var.f23372c, str);
    }
}
