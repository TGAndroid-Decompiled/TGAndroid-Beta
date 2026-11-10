package hi;

import android.content.Context;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
public final class z0 implements c20 {
    public final org.telegram.ui.ActionBar.u1 f15063a;
    public final Context f15064b;
    public final int f15065c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage f15066e;
    public final h6 f15067f;
    public final org.telegram.ui.web.p f15068g;
    public final bi.t0 h;

    public z0(org.telegram.ui.ActionBar.u1 u1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, h6 h6Var, org.telegram.ui.web.p pVar, bi.t0 t0Var) {
        this.f15063a = u1Var;
        this.f15064b = context;
        this.f15065c = i7;
        this.d = j3;
        this.f15066e = tL_messages_preparedInlineMessage;
        this.f15067f = h6Var;
        this.f15068g = pVar;
        this.h = t0Var;
    }

    @Override
    public final void a(Object obj) {
        this.f15063a.dismiss();
        new i1(this.f15064b, this.f15065c, this.d, this.f15066e, null, (TLRPC.WebPage) obj, this.f15067f, this.f15068g, this.h).show();
    }
}
