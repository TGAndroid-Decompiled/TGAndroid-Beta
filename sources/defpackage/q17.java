package defpackage;

import org.telegram.tgnet.TLRPC;
public final class q17 extends jb8 {
    public final u17 a;

    public q17(u17 u17Var) {
        this.a = u17Var;
    }

    @Override
    public final void M(int i, rcc rccVar, boolean z, int i2, int i3, boolean z2) {
        if (i >= 0) {
            u17 u17Var = this.a;
            if (i < u17Var.Q.size()) {
                u17Var.y.r((TLRPC.BotInlineResult) u17Var.Q.get(i), z, i2);
            }
        }
    }

    @Override
    public final defpackage.qb8 N(defpackage.k47 r4, org.telegram.tgnet.TLRPC.FileLocation r5, int r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q17.N(k47, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):qb8");
    }
}
