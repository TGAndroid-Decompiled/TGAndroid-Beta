package ai;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qb0;
public final class g4 implements qb0 {
    public final f6 f1050a;

    public g4(f6 f6Var) {
        this.f1050a = f6Var;
    }

    @Override
    public final void a(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        f6 f6Var = this.f1050a;
        org.telegram.ui.Components.g5.Z(f6Var.C2, 1, f6Var.B1, new e4(i10, 0, this, botInlineResult, z10));
    }

    @Override
    public final Paint.FontMetricsInt b() {
        return this.f1050a.f950b2.getEditField().getPaint().getFontMetricsInt();
    }

    @Override
    public final void f(TLRPC.TL_document tL_document, String str, Object obj) {
        f6 f6Var = this.f1050a;
        org.telegram.ui.Components.g5.Z(f6Var.C2, 1, f6Var.B1, new f4(this, tL_document, str, obj, 0));
    }

    @Override
    public final void i(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.f1050a.f950b2.R0(i10, i11, charSequence, z10);
    }

    @Override
    public final void s(String str) {
        b4 b4Var = this.f1050a.f950b2;
        b4Var.V();
        b4Var.U0.h(str);
    }
}
