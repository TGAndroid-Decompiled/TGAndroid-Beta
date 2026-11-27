package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ax4 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        e3a e3aVar = (e3a) view;
        e3aVar.setUser((TLRPC.User) b8cVar.H);
        CharSequence charSequence = b8cVar.n;
        if (charSequence != null) {
            e3aVar.setSubtitle(charSequence);
            e3aVar.setSubtitleColorKey(aob.r5);
        }
        e3aVar.setOptions(b8cVar.E);
        e3aVar.setDivider(z);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        e3a e3aVar = new e3a(context, false, false, vnbVar, false);
        e3aVar.setCellBackgroundVisible(false);
        return e3aVar;
    }
}
