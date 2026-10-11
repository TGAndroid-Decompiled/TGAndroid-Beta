package ai;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nb0;
public final class g4 implements nb0 {
    public final f6 f1052a;

    public g4(f6 f6Var) {
        this.f1052a = f6Var;
    }

    @Override
    public final void e(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        f6 f6Var = this.f1052a;
        org.telegram.ui.Components.g5.Z(f6Var.C2, 1, f6Var.B1, new e4(i10, 0, this, botInlineResult, z10));
    }

    @Override
    public final Paint.FontMetricsInt f() {
        return this.f1052a.f952b2.getEditField().getPaint().getFontMetricsInt();
    }

    @Override
    public final void i(TLRPC.TL_document tL_document, String str, Object obj) {
        f6 f6Var = this.f1052a;
        org.telegram.ui.Components.g5.Z(f6Var.C2, 1, f6Var.B1, new f4(this, tL_document, str, obj, 0));
    }

    @Override
    public final void k(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.f1052a.f952b2.M0(i10, i11, charSequence, z10);
    }

    @Override
    public final void n(String str) {
        b4 b4Var = this.f1052a.f952b2;
        b4Var.S();
        b4Var.U0.h(str);
    }
}
