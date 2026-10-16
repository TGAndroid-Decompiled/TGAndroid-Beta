package bi;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lb0;
public final class v3 implements lb0 {
    public final q5 f3859a;

    public v3(q5 q5Var) {
        this.f3859a = q5Var;
    }

    @Override
    public final void g(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        q5 q5Var = this.f3859a;
        org.telegram.ui.Components.g5.Z(q5Var.C2, 1, q5Var.B1, new t3(i10, 0, this, botInlineResult, z10));
    }

    @Override
    public final Paint.FontMetricsInt i() {
        return this.f3859a.f3512b2.getEditField().getPaint().getFontMetricsInt();
    }

    @Override
    public final void m(TLRPC.TL_document tL_document, String str, Object obj) {
        q5 q5Var = this.f3859a;
        org.telegram.ui.Components.g5.Z(q5Var.C2, 1, q5Var.B1, new u3(this, tL_document, str, obj, 0));
    }

    @Override
    public final void r(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.f3859a.f3512b2.M0(i10, i11, charSequence, z10);
    }

    @Override
    public final void y(String str) {
        q3 q3Var = this.f3859a.f3512b2;
        q3Var.S();
        q3Var.U0.h(str);
    }
}
