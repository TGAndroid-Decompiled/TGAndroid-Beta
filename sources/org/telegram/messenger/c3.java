package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class c3 {
    public final int f23280a;
    public final int f23281b;
    public final int f23282c;
    public boolean d;

    public c3(int i7, int i10, int i11) {
        this.f23280a = i7;
        this.f23281b = i10;
        this.f23282c = i11;
    }

    public static void a(c3 c3Var, String str) {
        if (c3Var.d) {
            return;
        }
        c3Var.d = true;
        ConnectionsManager.native_receivedCaptchaResult(c3Var.f23280a, c3Var.f23281b, c3Var.f23282c, str);
    }
}
