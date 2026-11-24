package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class x81 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        String lowerCase;
        y81 y81Var = (y81) view;
        TLRPC.Chat chat = (TLRPC.Chat) c4cVar.H;
        View.OnClickListener onClickListener = c4cVar.E;
        y81Var.c = chat;
        ls8 ls8Var = y81Var.b;
        ls8Var.setTag(Long.valueOf(chat.id));
        if (hc2.T(chat) && !chat.megagroup) {
            if (!hc2.t0(chat)) {
                lowerCase = k96.M0(2131752317, null).toLowerCase();
            } else {
                lowerCase = k96.M0(2131752306, null).toLowerCase();
            }
        } else if (chat.has_geo) {
            lowerCase = k96.M0(2131748450, null);
        } else if (!hc2.t0(chat)) {
            lowerCase = k96.M0(2131748449, null).toLowerCase();
        } else {
            lowerCase = k96.M0(2131748446, null).toLowerCase();
        }
        y81Var.a.z(chat, null, null, lowerCase, false, false);
        ls8Var.setOnClickListener(onClickListener);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new y81(context);
    }
}
