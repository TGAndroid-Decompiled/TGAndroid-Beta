package ai;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.va0;
public final class f4 implements va0 {
    public final f6 f789a;

    public f4(f6 f6Var) {
        this.f789a = f6Var;
    }

    @Override
    public final void M(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.f789a.f797b2.O0(i10, i11, charSequence, z10);
    }

    @Override
    public final void P(String str) {
        a4 a4Var = this.f789a.f797b2;
        a4Var.U();
        a4Var.U0.h(str);
    }

    @Override
    public final void f(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        f6 f6Var = this.f789a;
        org.telegram.ui.Components.d5.a0(f6Var.C2, 1, f6Var.B1, new d4(i10, 0, this, botInlineResult, z10));
    }

    @Override
    public final Paint.FontMetricsInt t() {
        return this.f789a.f797b2.getEditField().getPaint().getFontMetricsInt();
    }

    @Override
    public final void z(TLRPC.TL_document tL_document, String str, Object obj) {
        f6 f6Var = this.f789a;
        org.telegram.ui.Components.d5.a0(f6Var.C2, 1, f6Var.B1, new e4(this, tL_document, str, obj, 0));
    }
}
