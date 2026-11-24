package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class tr0 implements p8c {
    public final hd a;
    public final Context b;
    public final int c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage e;
    public final wjb f;
    public final st0 g;
    public final p h;

    public tr0(hd hdVar, Context context, int i, long j, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, wjb wjbVar, st0 st0Var, p pVar) {
        this.a = hdVar;
        this.b = context;
        this.c = i;
        this.d = j;
        this.e = tL_messages_preparedInlineMessage;
        this.f = wjbVar;
        this.g = st0Var;
        this.h = pVar;
    }

    @Override
    public final void a(Object obj) {
        this.a.dismiss();
        new ds0(this.b, this.c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f, this.g, this.h).show();
    }
}
