package ih;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t90;
public final class t2 implements t90 {
    public final i4 f12158a;

    public t2(i4 i4Var) {
        this.f12158a = i4Var;
    }

    @Override
    public final void A(String str) {
        p2 p2Var = this.f12158a.X1;
        p2Var.T();
        p2Var.Q0.h(str);
    }

    @Override
    public final void a(TLRPC.BotInlineResult botInlineResult, boolean z10, int i9) {
        i4 i4Var = this.f12158a;
        org.telegram.ui.Components.y4.a0(i4Var.f11609y2, 1, i4Var.f11604x1, new s2(i9, 0, this, botInlineResult, z10));
    }

    @Override
    public final Paint.FontMetricsInt h() {
        return this.f12158a.X1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override
    public final void p(TLRPC.TL_document tL_document, String str, Object obj) {
        i4 i4Var = this.f12158a;
        org.telegram.ui.Components.y4.a0(i4Var.f11609y2, 1, i4Var.f11604x1, new bg.j1(this, tL_document, str, obj, 3));
    }

    @Override
    public final void y(int i9, int i10, CharSequence charSequence, boolean z10) {
        this.f12158a.X1.O0(i9, i10, charSequence, z10);
    }
}
