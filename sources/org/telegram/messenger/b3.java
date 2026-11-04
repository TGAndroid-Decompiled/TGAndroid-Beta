package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class b3 {
    public final int f21733a;
    public final int f21734b;
    public final int f21735c;
    public boolean d;

    public b3(int i3, int i10, int i11) {
        this.f21733a = i3;
        this.f21734b = i10;
        this.f21735c = i11;
    }

    public static void a(b3 b3Var, String str) {
        if (b3Var.d) {
            return;
        }
        b3Var.d = true;
        ConnectionsManager.native_receivedCaptchaResult(b3Var.f21733a, b3Var.f21734b, b3Var.f21735c, str);
    }
}
