package ci;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fb0;
public final class a3 implements fb0 {
    public final q4 f5138a;

    public a3(q4 q4Var) {
        this.f5138a = q4Var;
    }

    @Override
    public final void A(TLRPC.TL_document tL_document, String str, Object obj) {
        q4 q4Var = this.f5138a;
        org.telegram.ui.Components.f5.Z(q4Var.C2, 1, q4Var.B1, new z2(this, tL_document, str, obj, 0));
    }

    @Override
    public final void I(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.f5138a.f5766b2.M0(i10, i11, charSequence, z10);
    }

    @Override
    public final void L(String str) {
        v2 v2Var = this.f5138a.f5766b2;
        v2Var.S();
        v2Var.U0.h(str);
    }

    @Override
    public final void i(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        q4 q4Var = this.f5138a;
        org.telegram.ui.Components.f5.Z(q4Var.C2, 1, q4Var.B1, new y2(i10, 0, this, botInlineResult, z10));
    }

    @Override
    public final Paint.FontMetricsInt t() {
        return this.f5138a.f5766b2.getEditField().getPaint().getFontMetricsInt();
    }
}
