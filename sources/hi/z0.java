package hi;

import android.content.Context;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
public final class z0 implements c20 {
    public final org.telegram.ui.ActionBar.u1 f15058a;
    public final Context f15059b;
    public final int f15060c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage f15061e;
    public final f6 f15062f;
    public final org.telegram.ui.web.p f15063g;
    public final bi.t0 h;

    public z0(org.telegram.ui.ActionBar.u1 u1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, f6 f6Var, org.telegram.ui.web.p pVar, bi.t0 t0Var) {
        this.f15058a = u1Var;
        this.f15059b = context;
        this.f15060c = i7;
        this.d = j3;
        this.f15061e = tL_messages_preparedInlineMessage;
        this.f15062f = f6Var;
        this.f15063g = pVar;
        this.h = t0Var;
    }

    @Override
    public final void a(Object obj) {
        this.f15058a.dismiss();
        new i1(this.f15059b, this.f15060c, this.d, this.f15061e, null, (TLRPC.WebPage) obj, this.f15062f, this.f15063g, this.h).show();
    }
}
