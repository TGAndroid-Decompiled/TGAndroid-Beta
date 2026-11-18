package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class c3 {
    public final int f23255a;
    public final int f23256b;
    public final int f23257c;
    public boolean d;

    public c3(int i7, int i10, int i11) {
        this.f23255a = i7;
        this.f23256b = i10;
        this.f23257c = i11;
    }

    public static void a(c3 c3Var, String str) {
        if (c3Var.d) {
            return;
        }
        c3Var.d = true;
        ConnectionsManager.native_receivedCaptchaResult(c3Var.f23255a, c3Var.f23256b, c3Var.f23257c, str);
    }
}
