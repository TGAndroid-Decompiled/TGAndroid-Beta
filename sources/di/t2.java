package di;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d90;
public final class t2 implements d90 {
    public final i4 f9781a;

    public t2(i4 i4Var) {
        this.f9781a = i4Var;
    }

    @Override
    public final void G1(String str) {
        o2 o2Var = this.f9781a.K1;
        o2Var.Q();
        o2Var.U0.h(str);
    }

    @Override
    public final void M(TLRPC.BotInlineResult botInlineResult, boolean z9, int i7) {
        i4 i4Var = this.f9781a;
        org.telegram.ui.Components.v4.X(i4Var.f9168l2, 1, i4Var.f9164k1, new r2(i7, 0, this, botInlineResult, z9));
    }

    @Override
    public final Paint.FontMetricsInt R0() {
        return this.f9781a.K1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override
    public final void e1(TLRPC.TL_document tL_document, String str, Object obj) {
        i4 i4Var = this.f9781a;
        org.telegram.ui.Components.v4.X(i4Var.f9168l2, 1, i4Var.f9164k1, new s2(this, tL_document, str, obj, 0));
    }

    @Override
    public final void z1(int i7, int i10, CharSequence charSequence, boolean z9) {
        this.f9781a.K1.O0(i7, i10, charSequence, z9);
    }
}
