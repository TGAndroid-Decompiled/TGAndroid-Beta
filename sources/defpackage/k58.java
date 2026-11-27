package defpackage;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class k58 implements y17 {
    public final o68 a;

    public k58(o68 o68Var) {
        this.a = o68Var;
    }

    @Override
    public final void H0(int i, int i2, CharSequence charSequence, boolean z) {
        this.a.L1.y1(i, i2, charSequence, z);
    }

    @Override
    public final void T0(String str) {
        h58 h58Var = this.a.L1;
        h58Var.Z();
        h58Var.V0.d(str);
    }

    @Override
    public final void m0(TLRPC.TL_document tL_document, String str, Object obj) {
        o68 o68Var = this.a;
        jj.X(o68Var.m2, o68Var.l1, 1, new ku0(this, tL_document, str, obj, (byte) 13));
    }

    @Override
    public final void s(TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
        o68 o68Var = this.a;
        jj.X(o68Var.m2, o68Var.l1, 1, new g32(this, i, botInlineResult, z, (byte) 1));
    }

    @Override
    public final Paint.FontMetricsInt w() {
        return this.a.L1.getEditField().getPaint().getFontMetricsInt();
    }
}
