package nh;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.na0;
public final class s2 implements na0 {
    public final d4 f15854a;

    public s2(d4 d4Var) {
        this.f15854a = d4Var;
    }

    @Override
    public final void E(String str) {
        o2 o2Var = this.f15854a.Y1;
        o2Var.U();
        o2Var.R0.h(str);
    }

    @Override
    public final void a(TLRPC.BotInlineResult botInlineResult, boolean z4, int i10) {
        d4 d4Var = this.f15854a;
        org.telegram.ui.Components.z4.a0(d4Var.f15243z2, 1, d4Var.f15238y1, new r2(i10, 0, this, botInlineResult, z4));
    }

    @Override
    public final Paint.FontMetricsInt f() {
        return this.f15854a.Y1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override
    public final void j(TLRPC.TL_document tL_document, String str, Object obj) {
        d4 d4Var = this.f15854a;
        org.telegram.ui.Components.z4.a0(d4Var.f15243z2, 1, d4Var.f15238y1, new gg.c1(this, tL_document, str, obj, 3));
    }

    @Override
    public final void v(int i10, int i11, CharSequence charSequence, boolean z4) {
        this.f15854a.Y1.O0(i10, i11, charSequence, z4);
    }
}
