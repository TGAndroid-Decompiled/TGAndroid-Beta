package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class c3 {
    public final int f23252a;
    public final int f23253b;
    public final int f23254c;
    public boolean d;

    public c3(int i7, int i10, int i11) {
        this.f23252a = i7;
        this.f23253b = i10;
        this.f23254c = i11;
    }

    public static void a(c3 c3Var, String str) {
        if (c3Var.d) {
            return;
        }
        c3Var.d = true;
        ConnectionsManager.native_receivedCaptchaResult(c3Var.f23252a, c3Var.f23253b, c3Var.f23254c, str);
    }
}
