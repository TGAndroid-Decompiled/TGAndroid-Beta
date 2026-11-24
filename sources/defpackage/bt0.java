package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class bt0 implements qac {
    public final he a;
    public final Context b;
    public final int c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage e;
    public final ylb f;
    public final bv0 g;
    public final p h;

    public bt0(he heVar, Context context, int i, long j, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, ylb ylbVar, bv0 bv0Var, p pVar) {
        this.a = heVar;
        this.b = context;
        this.c = i;
        this.d = j;
        this.e = tL_messages_preparedInlineMessage;
        this.f = ylbVar;
        this.g = bv0Var;
        this.h = pVar;
    }

    @Override
    public final void a(Object obj) {
        this.a.dismiss();
        new lt0(this.b, this.c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f, this.g, this.h).show();
    }
}
