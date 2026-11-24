package defpackage;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class w38 implements r17 {
    public final a58 a;

    public w38(a58 a58Var) {
        this.a = a58Var;
    }

    @Override
    public final void Y0(int i, int i2, CharSequence charSequence, boolean z) {
        this.a.R1.q1(i, i2, charSequence, z);
    }

    @Override
    public final void c1(String str) {
        t38 t38Var = this.a.R1;
        t38Var.X();
        t38Var.V0.d(str);
    }

    @Override
    public final void r(TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
        a58 a58Var = this.a;
        ik.X(a58Var.s2, a58Var.r1, 1, new b42(this, i, botInlineResult, z, (byte) 1));
    }

    @Override
    public final Paint.FontMetricsInt u0() {
        return this.a.R1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override
    public final void w0(TLRPC.TL_document tL_document, String str, Object obj) {
        a58 a58Var = this.a;
        ik.X(a58Var.s2, a58Var.r1, 1, new jv0(this, tL_document, str, obj, (byte) 13));
    }
}
