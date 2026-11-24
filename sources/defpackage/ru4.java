package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ru4 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        kz9 kz9Var = (kz9) view;
        TLRPC.Chat chat = (TLRPC.Chat) c4cVar.H;
        kz9Var.h(chat.participants_count, chat);
        kz9Var.setDivider(z);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        kz9 kz9Var = new kz9(context, false, false, wjbVar, false);
        kz9Var.setCellBackgroundVisible(false);
        return kz9Var;
    }
}
