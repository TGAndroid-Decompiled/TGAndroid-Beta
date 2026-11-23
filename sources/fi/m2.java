package fi;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.s90;
public final class m2 implements s90 {
    public final z3 f12255a;

    public m2(z3 z3Var) {
        this.f12255a = z3Var;
    }

    @Override
    public final Paint.FontMetricsInt P() {
        return this.f12255a.L1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override
    public final void Y(TLRPC.TL_document tL_document, String str, Object obj) {
        z3 z3Var = this.f12255a;
        org.telegram.ui.Components.c5.X(z3Var.f12842m2, 1, z3Var.l1, new bi.o2(this, tL_document, str, obj, 1));
    }

    @Override
    public final void g(TLRPC.BotInlineResult botInlineResult, boolean z10, int i7) {
        z3 z3Var = this.f12255a;
        org.telegram.ui.Components.c5.X(z3Var.f12842m2, 1, z3Var.l1, new l2(i7, 0, this, botInlineResult, z10));
    }

    @Override
    public final void l0(int i7, int i10, CharSequence charSequence, boolean z10) {
        this.f12255a.L1.p1(i7, i10, charSequence, z10);
    }

    @Override
    public final void q0(String str) {
        i2 i2Var = this.f12255a.L1;
        i2Var.Z();
        i2Var.V0.h(str);
    }
}
