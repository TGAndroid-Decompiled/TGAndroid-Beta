package lh;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ha0;
public final class r2 implements ha0 {
    public final d4 f16160a;

    public r2(d4 d4Var) {
        this.f16160a = d4Var;
    }

    @Override
    public final void b(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        d4 d4Var = this.f16160a;
        org.telegram.ui.Components.c5.a0(d4Var.f15545y2, 1, d4Var.f15540x1, new q2(i10, 0, this, botInlineResult, z10));
    }

    @Override
    public final Paint.FontMetricsInt n() {
        return this.f16160a.X1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override
    public final void p(TLRPC.TL_document tL_document, String str, Object obj) {
        d4 d4Var = this.f16160a;
        org.telegram.ui.Components.c5.a0(d4Var.f15545y2, 1, d4Var.f15540x1, new eg.d1(this, tL_document, str, obj, 3));
    }

    @Override
    public final void r(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.f16160a.X1.O0(i10, i11, charSequence, z10);
    }

    @Override
    public final void s(String str) {
        n2 n2Var = this.f16160a.X1;
        n2Var.U();
        n2Var.Q0.h(str);
    }
}
