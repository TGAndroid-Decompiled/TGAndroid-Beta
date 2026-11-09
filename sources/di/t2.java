package di;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e90;
public final class t2 implements e90 {
    public final j4 f9775a;

    public t2(j4 j4Var) {
        this.f9775a = j4Var;
    }

    @Override
    public final void G1(String str) {
        o2 o2Var = this.f9775a.K1;
        o2Var.Q();
        o2Var.U0.h(str);
    }

    @Override
    public final void M(TLRPC.BotInlineResult botInlineResult, boolean z9, int i7) {
        j4 j4Var = this.f9775a;
        org.telegram.ui.Components.v4.X(j4Var.f9200l2, 1, j4Var.f9196k1, new r2(i7, 0, this, botInlineResult, z9));
    }

    @Override
    public final Paint.FontMetricsInt R0() {
        return this.f9775a.K1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override
    public final void e1(TLRPC.TL_document tL_document, String str, Object obj) {
        j4 j4Var = this.f9775a;
        org.telegram.ui.Components.v4.X(j4Var.f9200l2, 1, j4Var.f9196k1, new s2(this, tL_document, str, obj, 0));
    }

    @Override
    public final void z1(int i7, int i10, CharSequence charSequence, boolean z9) {
        this.f9775a.K1.O0(i7, i10, charSequence, z9);
    }
}
