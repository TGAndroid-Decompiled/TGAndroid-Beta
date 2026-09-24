package ai;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wa0;
public final class f4 implements wa0 {
    public final e6 f873a;

    public f4(e6 e6Var) {
        this.f873a = e6Var;
    }

    @Override
    public final void A(TLRPC.TL_document tL_document, String str, Object obj) {
        e6 e6Var = this.f873a;
        org.telegram.ui.Components.e5.a0(e6Var.C2, 1, e6Var.B1, new e4(this, tL_document, str, obj, 0));
    }

    @Override
    public final void O(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.f873a.f773b2.O0(i10, i11, charSequence, z10);
    }

    @Override
    public final void P(String str) {
        a4 a4Var = this.f873a.f773b2;
        a4Var.U();
        a4Var.U0.h(str);
    }

    @Override
    public final void f(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        e6 e6Var = this.f873a;
        org.telegram.ui.Components.e5.a0(e6Var.C2, 1, e6Var.B1, new d4(i10, 0, this, botInlineResult, z10));
    }

    @Override
    public final Paint.FontMetricsInt w() {
        return this.f873a.f773b2.getEditField().getPaint().getFontMetricsInt();
    }
}
