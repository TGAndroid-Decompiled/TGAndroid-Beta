package di;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eb0;
public final class z2 implements eb0 {
    public final q4 f9481a;

    public z2(q4 q4Var) {
        this.f9481a = q4Var;
    }

    @Override
    public final Paint.FontMetricsInt D() {
        return this.f9481a.Q1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override
    public final void J(TLRPC.TL_document tL_document, String str, Object obj) {
        q4 q4Var = this.f9481a;
        org.telegram.ui.Components.g5.Z(q4Var.f9020r2, 1, q4Var.f9015q1, new y2(this, tL_document, str, obj, 0));
    }

    @Override
    public final void X(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.f9481a.Q1.L0(i10, i11, charSequence, z10);
    }

    @Override
    public final void b0(String str) {
        u2 u2Var = this.f9481a.Q1;
        u2Var.Q();
        u2Var.U0.h(str);
    }

    @Override
    public final void j(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        q4 q4Var = this.f9481a;
        org.telegram.ui.Components.g5.Z(q4Var.f9020r2, 1, q4Var.f9015q1, new x2(i10, 0, this, botInlineResult, z10));
    }
}
