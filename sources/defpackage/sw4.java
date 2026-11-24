package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class sw4 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        m1a m1aVar = (m1a) view;
        TLRPC.Chat chat = (TLRPC.Chat) c6cVar.H;
        m1aVar.h(chat.participants_count, chat);
        m1aVar.setDivider(z);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        m1a m1aVar = new m1a(context, false, false, ylbVar, false);
        m1aVar.setCellBackgroundVisible(false);
        return m1aVar;
    }
}
