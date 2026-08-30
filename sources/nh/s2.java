package nh;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ma0;
public final class s2 implements ma0 {
    public final d4 f15874a;

    public s2(d4 d4Var) {
        this.f15874a = d4Var;
    }

    @Override
    public final void a(TLRPC.BotInlineResult botInlineResult, boolean z4, int i10) {
        d4 d4Var = this.f15874a;
        org.telegram.ui.Components.z4.a0(d4Var.f15263z2, 1, d4Var.f15258y1, new r2(i10, 0, this, botInlineResult, z4));
    }

    @Override
    public final Paint.FontMetricsInt d() {
        return this.f15874a.Y1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override
    public final void i(TLRPC.TL_document tL_document, String str, Object obj) {
        d4 d4Var = this.f15874a;
        org.telegram.ui.Components.z4.a0(d4Var.f15263z2, 1, d4Var.f15258y1, new gg.c1(this, tL_document, str, obj, 3));
    }

    @Override
    public final void j(int i10, int i11, CharSequence charSequence, boolean z4) {
        this.f15874a.Y1.O0(i10, i11, charSequence, z4);
    }

    @Override
    public final void k(String str) {
        o2 o2Var = this.f15874a.Y1;
        o2Var.U();
        o2Var.R0.h(str);
    }
}
