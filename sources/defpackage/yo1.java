package defpackage;

import org.telegram.tgnet.TLRPC;
public final class yo1 extends i98 {
    public final mu1 a;

    public yo1(mu1 mu1Var) {
        this.a = mu1Var;
    }

    @Override
    public final void L(int i, oac oacVar, boolean z, int i2, int i3, boolean z2) {
        if (i >= 0) {
            mu1 mu1Var = this.a;
            if (i < mu1Var.fb.size()) {
                mu1Var.ob((TLRPC.BotInlineResult) mu1Var.fb.get(i), z, i2, 0L);
            }
        }
    }

    @Override
    public final defpackage.p98 M(defpackage.k27 r4, org.telegram.tgnet.TLRPC.FileLocation r5, int r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yo1.M(k27, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):p98");
    }
}
