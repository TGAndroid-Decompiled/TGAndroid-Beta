package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class h84 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        i84 i84Var = (i84) view;
        i84Var.a((TLRPC.StickerSetCovered) c4cVar.H, z, c4cVar.u, false);
        i84Var.f.a(c4cVar.u, false);
        i84Var.setAddOnClickListener(c4cVar.E);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new i84(context, wjbVar);
    }
}
