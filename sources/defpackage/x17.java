package defpackage;

import org.telegram.tgnet.TLRPC;
public final class x17 extends yc8 {
    public final b27 a;

    public x17(b27 b27Var) {
        this.a = b27Var;
    }

    @Override
    public final void L(int i, oec oecVar, boolean z, int i2, int i3, boolean z2) {
        if (i >= 0) {
            b27 b27Var = this.a;
            if (i < b27Var.Q.size()) {
                b27Var.y.s((TLRPC.BotInlineResult) b27Var.Q.get(i), z, i2);
            }
        }
    }

    @Override
    public final defpackage.fd8 M(defpackage.r47 r4, org.telegram.tgnet.TLRPC.FileLocation r5, int r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x17.M(r47, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):fd8");
    }
}
