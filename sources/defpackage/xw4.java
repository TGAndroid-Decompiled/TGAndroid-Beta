package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class xw4 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        m1a m1aVar = (m1a) view;
        m1aVar.setUser((TLRPC.User) c6cVar.H);
        CharSequence charSequence = c6cVar.n;
        if (charSequence != null) {
            m1aVar.setSubtitle(charSequence);
            m1aVar.setSubtitleColorKey(cmb.q5);
        }
        m1aVar.setOptions(c6cVar.E);
        m1aVar.setDivider(z);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        m1a m1aVar = new m1a(context, false, false, ylbVar, false);
        m1aVar.setCellBackgroundVisible(false);
        return m1aVar;
    }
}
