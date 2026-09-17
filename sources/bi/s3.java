package bi;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.la0;
public final class s3 implements la0 {
    public final o5 f3711a;

    public s3(o5 o5Var) {
        this.f3711a = o5Var;
    }

    @Override
    public final void f(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        o5 o5Var = this.f3711a;
        org.telegram.ui.Components.e5.a0(o5Var.C2, 1, o5Var.B1, new q3(i10, 0, this, botInlineResult, z10));
    }

    @Override
    public final Paint.FontMetricsInt k() {
        return this.f3711a.f3433b2.getEditField().getPaint().getFontMetricsInt();
    }

    @Override
    public final void n(TLRPC.TL_document tL_document, String str, Object obj) {
        o5 o5Var = this.f3711a;
        org.telegram.ui.Components.e5.a0(o5Var.C2, 1, o5Var.B1, new r3(this, tL_document, str, obj, 0));
    }

    @Override
    public final void v(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.f3711a.f3433b2.O0(i10, i11, charSequence, z10);
    }

    @Override
    public final void x(String str) {
        n3 n3Var = this.f3711a.f3433b2;
        n3Var.U();
        n3Var.U0.h(str);
    }
}
