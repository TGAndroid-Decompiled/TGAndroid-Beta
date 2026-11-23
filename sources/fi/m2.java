package fi;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p90;
public final class m2 implements p90 {
    public final z3 f12268a;

    public m2(z3 z3Var) {
        this.f12268a = z3Var;
    }

    @Override
    public final void E2(String str) {
        i2 i2Var = this.f12268a.L1;
        i2Var.Z();
        i2Var.V0.h(str);
    }

    @Override
    public final void G1(TLRPC.TL_document tL_document, String str, Object obj) {
        z3 z3Var = this.f12268a;
        org.telegram.ui.Components.b5.X(z3Var.f12853m2, 1, z3Var.l1, new bi.o2(this, tL_document, str, obj, 1));
    }

    @Override
    public final void a0(TLRPC.BotInlineResult botInlineResult, boolean z10, int i7) {
        z3 z3Var = this.f12268a;
        org.telegram.ui.Components.b5.X(z3Var.f12853m2, 1, z3Var.l1, new l2(i7, 0, this, botInlineResult, z10));
    }

    @Override
    public final Paint.FontMetricsInt j1() {
        return this.f12268a.L1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override
    public final void x2(int i7, int i10, CharSequence charSequence, boolean z10) {
        this.f12268a.L1.q1(i7, i10, charSequence, z10);
    }
}
