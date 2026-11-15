package fi;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f90;
public final class o2 implements f90 {
    public final b4 f12111a;

    public o2(b4 b4Var) {
        this.f12111a = b4Var;
    }

    @Override
    public final Paint.FontMetricsInt Q() {
        return this.f12111a.L1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override
    public final void a0(TLRPC.TL_document tL_document, String str, Object obj) {
        b4 b4Var = this.f12111a;
        org.telegram.ui.Components.t4.X(b4Var.f11497m2, 1, b4Var.l1, new bi.o1(this, tL_document, str, obj, 1));
    }

    @Override
    public final void p0(int i7, int i10, CharSequence charSequence, boolean z10) {
        this.f12111a.L1.d1(i7, i10, charSequence, z10);
    }

    @Override
    public final void r(TLRPC.BotInlineResult botInlineResult, boolean z10, int i7) {
        b4 b4Var = this.f12111a;
        org.telegram.ui.Components.t4.X(b4Var.f11497m2, 1, b4Var.l1, new n2(i7, 0, this, botInlineResult, z10));
    }

    @Override
    public final void v0(String str) {
        k2 k2Var = this.f12111a.L1;
        k2Var.X();
        k2Var.V0.h(str);
    }
}
