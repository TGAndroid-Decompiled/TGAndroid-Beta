package defpackage;

import org.telegram.tgnet.TLRPC;
public final class kq1 extends jb8 {
    public final yv1 a;

    public kq1(yv1 yv1Var) {
        this.a = yv1Var;
    }

    @Override
    public final void M(int i, rcc rccVar, boolean z, int i2, int i3, boolean z2) {
        if (i >= 0) {
            yv1 yv1Var = this.a;
            if (i < yv1Var.fb.size()) {
                yv1Var.yb((TLRPC.BotInlineResult) yv1Var.fb.get(i), z, i2, 0L);
            }
        }
    }

    @Override
    public final defpackage.qb8 N(defpackage.k47 r4, org.telegram.tgnet.TLRPC.FileLocation r5, int r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq1.N(k47, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):qb8");
    }
}
