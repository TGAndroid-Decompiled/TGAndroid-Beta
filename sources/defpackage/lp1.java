package defpackage;

import org.telegram.tgnet.TLRPC;
public final class lp1 extends yc8 {
    public final zu1 a;

    public lp1(zu1 zu1Var) {
        this.a = zu1Var;
    }

    @Override
    public final void L(int i, oec oecVar, boolean z, int i2, int i3, boolean z2) {
        if (i >= 0) {
            zu1 zu1Var = this.a;
            if (i < zu1Var.fb.size()) {
                zu1Var.zb((TLRPC.BotInlineResult) zu1Var.fb.get(i), z, i2, 0L);
            }
        }
    }

    @Override
    public final defpackage.fd8 M(defpackage.r47 r4, org.telegram.tgnet.TLRPC.FileLocation r5, int r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp1.M(r47, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):fd8");
    }
}
