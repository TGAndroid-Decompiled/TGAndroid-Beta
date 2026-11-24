package defpackage;

import org.telegram.tgnet.TLRPC;
public final class qz6 extends i98 {
    public final uz6 a;

    public qz6(uz6 uz6Var) {
        this.a = uz6Var;
    }

    @Override
    public final void L(int i, oac oacVar, boolean z, int i2, int i3, boolean z2) {
        if (i >= 0) {
            uz6 uz6Var = this.a;
            if (i < uz6Var.Q.size()) {
                uz6Var.y.c((TLRPC.BotInlineResult) uz6Var.Q.get(i), z, i2);
            }
        }
    }

    @Override
    public final defpackage.p98 M(defpackage.k27 r4, org.telegram.tgnet.TLRPC.FileLocation r5, int r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz6.M(k27, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):p98");
    }
}
