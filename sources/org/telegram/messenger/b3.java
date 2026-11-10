package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class b3 {
    public final int f21611a;
    public final int f21612b;
    public final int f21613c;
    public boolean d;

    public b3(int i7, int i10, int i11) {
        this.f21611a = i7;
        this.f21612b = i10;
        this.f21613c = i11;
    }

    public static void a(b3 b3Var, String str) {
        if (b3Var.d) {
            return;
        }
        b3Var.d = true;
        ConnectionsManager.native_receivedCaptchaResult(b3Var.f21611a, b3Var.f21612b, b3Var.f21613c, str);
    }
}
