package ei;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z80;
public final class w2 implements z80 {
    public final j4 f11176a;

    public w2(j4 j4Var) {
        this.f11176a = j4Var;
    }

    @Override
    public final void e(TLRPC.BotInlineResult botInlineResult, boolean z10, int i3) {
        j4 j4Var = this.f11176a;
        org.telegram.ui.Components.t4.Z(j4Var.f10480m2, 1, j4Var.f10477l1, new v2(i3, 0, this, botInlineResult, z10));
    }

    @Override
    public final Paint.FontMetricsInt n() {
        return this.f11176a.L1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override
    public final void q(TLRPC.TL_document tL_document, String str, Object obj) {
        j4 j4Var = this.f11176a;
        org.telegram.ui.Components.t4.Z(j4Var.f10480m2, 1, j4Var.f10477l1, new ai.v1(this, tL_document, str, obj, 1));
    }

    @Override
    public final void t(int i3, int i10, CharSequence charSequence, boolean z10) {
        this.f11176a.L1.N0(i3, i10, charSequence, z10);
    }

    @Override
    public final void w(String str) {
        s2 s2Var = this.f11176a.L1;
        s2Var.Q();
        s2Var.V0.h(str);
    }
}
