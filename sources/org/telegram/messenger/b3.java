package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class b3 {
    public final int f22650a;
    public final int f22651b;
    public final int f22652c;
    public boolean d;

    public b3(int i7, int i10, int i11) {
        this.f22650a = i7;
        this.f22651b = i10;
        this.f22652c = i11;
    }

    public static void a(b3 b3Var, String str) {
        if (b3Var.d) {
            return;
        }
        b3Var.d = true;
        ConnectionsManager.native_receivedCaptchaResult(b3Var.f22650a, b3Var.f22651b, b3Var.f22652c, str);
    }
}
