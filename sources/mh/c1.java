package mh;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
public final class c1 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.c2 f17738a;
    public final Context f17739b;
    public final int f17740c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage f17741e;
    public final b6 f17742f;
    public final org.telegram.ui.web.t f17743g;
    public final bg.y0 h;

    public c1(org.telegram.ui.ActionBar.c2 c2Var, Context context, int i9, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, b6 b6Var, org.telegram.ui.web.t tVar, bg.y0 y0Var) {
        this.f17738a = c2Var;
        this.f17739b = context;
        this.f17740c = i9;
        this.d = j10;
        this.f17741e = tL_messages_preparedInlineMessage;
        this.f17742f = b6Var;
        this.f17743g = tVar;
        this.h = y0Var;
    }

    @Override
    public final void run(Object obj) {
        this.f17738a.dismiss();
        new l1(this.f17739b, this.f17740c, this.d, this.f17741e, null, (TLRPC.WebPage) obj, this.f17742f, this.f17743g, this.h).show();
    }
}
