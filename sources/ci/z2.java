package ci;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fb0;
public final class z2 implements fb0 {
    public final p4 f6173a;

    public z2(p4 p4Var) {
        this.f6173a = p4Var;
    }

    @Override
    public final void A(TLRPC.TL_document tL_document, String str, Object obj) {
        p4 p4Var = this.f6173a;
        org.telegram.ui.Components.f5.Z(p4Var.C2, 1, p4Var.B1, new y2(this, tL_document, str, obj, 0));
    }

    @Override
    public final void H(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.f6173a.f5649b2.M0(i10, i11, charSequence, z10);
    }

    @Override
    public final void P(String str) {
        u2 u2Var = this.f6173a.f5649b2;
        u2Var.S();
        u2Var.U0.h(str);
    }

    @Override
    public final void b(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        p4 p4Var = this.f6173a;
        org.telegram.ui.Components.f5.Z(p4Var.C2, 1, p4Var.B1, new x2(i10, 0, this, botInlineResult, z10));
    }

    @Override
    public final Paint.FontMetricsInt w() {
        return this.f6173a.f5649b2.getEditField().getPaint().getFontMetricsInt();
    }
}
