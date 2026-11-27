package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class bs0 implements pcc {
    public final id a;
    public final Context b;
    public final int c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage e;
    public final vnb f;
    public final bu0 g;
    public final p h;

    public bs0(id idVar, Context context, int i, long j, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, vnb vnbVar, bu0 bu0Var, p pVar) {
        this.a = idVar;
        this.b = context;
        this.c = i;
        this.d = j;
        this.e = tL_messages_preparedInlineMessage;
        this.f = vnbVar;
        this.g = bu0Var;
        this.h = pVar;
    }

    @Override
    public final void a(Object obj) {
        this.a.dismiss();
        new ls0(this.b, this.c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f, this.g, this.h).show();
    }
}
