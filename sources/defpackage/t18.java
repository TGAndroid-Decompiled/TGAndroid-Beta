package defpackage;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class t18 implements rz6 {
    public final y28 a;

    public t18(y28 y28Var) {
        this.a = y28Var;
    }

    @Override
    public final void c(TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
        y28 y28Var = this.a;
        ij.X(y28Var.s2, y28Var.r1, 1, new p22(this, i, botInlineResult, z, (byte) 1));
    }

    @Override
    public final Paint.FontMetricsInt d() {
        return this.a.R1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override
    public final void h(TLRPC.TL_document tL_document, String str, Object obj) {
        y28 y28Var = this.a;
        ij.X(y28Var.s2, y28Var.r1, 1, new au0(this, tL_document, str, obj, (byte) 13));
    }

    @Override
    public final void k(int i, int i2, CharSequence charSequence, boolean z) {
        this.a.R1.o1(i, i2, charSequence, z);
    }

    @Override
    public final void m(String str) {
        q18 q18Var = this.a.R1;
        q18Var.X();
        q18Var.V0.d(str);
    }
}
