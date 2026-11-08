package hi;

import android.content.Context;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
public final class z0 implements c20 {
    public final org.telegram.ui.ActionBar.u1 f15061a;
    public final Context f15062b;
    public final int f15063c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage f15064e;
    public final f6 f15065f;
    public final org.telegram.ui.web.p f15066g;
    public final bi.t0 h;

    public z0(org.telegram.ui.ActionBar.u1 u1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, f6 f6Var, org.telegram.ui.web.p pVar, bi.t0 t0Var) {
        this.f15061a = u1Var;
        this.f15062b = context;
        this.f15063c = i7;
        this.d = j3;
        this.f15064e = tL_messages_preparedInlineMessage;
        this.f15065f = f6Var;
        this.f15066g = pVar;
        this.h = t0Var;
    }

    @Override
    public final void a(Object obj) {
        this.f15061a.dismiss();
        new i1(this.f15062b, this.f15063c, this.d, this.f15064e, null, (TLRPC.WebPage) obj, this.f15065f, this.f15066g, this.h).show();
    }
}
