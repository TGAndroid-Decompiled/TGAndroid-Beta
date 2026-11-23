package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class c3 {
    public final int f23222a;
    public final int f23223b;
    public final int f23224c;
    public boolean d;

    public c3(int i7, int i10, int i11) {
        this.f23222a = i7;
        this.f23223b = i10;
        this.f23224c = i11;
    }

    public static void a(c3 c3Var, String str) {
        if (c3Var.d) {
            return;
        }
        c3Var.d = true;
        ConnectionsManager.native_receivedCaptchaResult(c3Var.f23222a, c3Var.f23223b, c3Var.f23224c, str);
    }
}
