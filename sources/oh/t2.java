package oh;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oa0;
public final class t2 implements oa0 {
    public final f4 f17765a;

    public t2(f4 f4Var) {
        this.f17765a = f4Var;
    }

    @Override
    public final void N(TLRPC.TL_document tL_document, String str, Object obj) {
        f4 f4Var = this.f17765a;
        org.telegram.ui.Components.z4.a0(f4Var.f17135z2, 1, f4Var.f17130y1, new hg.c1(this, tL_document, str, obj, 3));
    }

    @Override
    public final void U(int i10, int i11, CharSequence charSequence, boolean z4) {
        this.f17765a.Y1.O0(i10, i11, charSequence, z4);
    }

    @Override
    public final void X(String str) {
        p2 p2Var = this.f17765a.Y1;
        p2Var.U();
        p2Var.R0.h(str);
    }

    @Override
    public final void l(TLRPC.BotInlineResult botInlineResult, boolean z4, int i10) {
        f4 f4Var = this.f17765a;
        org.telegram.ui.Components.z4.a0(f4Var.f17135z2, 1, f4Var.f17130y1, new s2(i10, 0, this, botInlineResult, z4));
    }

    @Override
    public final Paint.FontMetricsInt w() {
        return this.f17765a.Y1.getEditField().getPaint().getFontMetricsInt();
    }
}
