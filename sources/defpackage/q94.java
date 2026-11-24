package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q94 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        r94 r94Var = (r94) view;
        r94Var.a((TLRPC.StickerSetCovered) c6cVar.H, z, c6cVar.u, false);
        r94Var.f.a(c6cVar.u, false);
        r94Var.setAddOnClickListener(c6cVar.E);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new r94(context, ylbVar);
    }
}
