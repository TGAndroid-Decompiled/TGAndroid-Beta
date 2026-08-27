package jh;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x90;

public final class s2 implements x90 {

    public final e4 f13937a;

    public s2(e4 e4Var) {
        this.f13937a = e4Var;
    }

    @Override
    public final void H(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.f13937a.X1.O0(i10, i11, charSequence, z10);
    }

    @Override
    public final void K(String str) {
        o2 o2Var = this.f13937a.X1;
        o2Var.U();
        o2Var.Q0.h(str);
    }

    @Override
    public final void c(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        e4 e4Var = this.f13937a;
        org.telegram.ui.Components.y4.a0(e4Var.f13296y2, 1, e4Var.f13291x1, new r2(i10, 0, this, botInlineResult, z10));
    }

    @Override
    public final Paint.FontMetricsInt u() {
        return this.f13937a.X1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override
    public final void x(TLRPC.TL_document tL_document, String str, Object obj) {
        e4 e4Var = this.f13937a;
        org.telegram.ui.Components.y4.a0(e4Var.f13296y2, 1, e4Var.f13291x1, new cg.e1(this, tL_document, str, obj, 3));
    }
}
