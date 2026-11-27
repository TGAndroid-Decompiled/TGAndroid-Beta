package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class c94 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        d94 d94Var = (d94) view;
        d94Var.a((TLRPC.StickerSetCovered) b8cVar.H, z, b8cVar.u, false);
        d94Var.f.a(b8cVar.u, false);
        d94Var.setAddOnClickListener(b8cVar.E);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new d94(context, vnbVar);
    }
}
