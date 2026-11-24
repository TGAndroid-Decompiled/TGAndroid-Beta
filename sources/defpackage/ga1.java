package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ga1 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        String lowerCase;
        ha1 ha1Var = (ha1) view;
        TLRPC.Chat chat = (TLRPC.Chat) c6cVar.H;
        View.OnClickListener onClickListener = c6cVar.E;
        ha1Var.c = chat;
        mu8 mu8Var = ha1Var.b;
        mu8Var.setTag(Long.valueOf(chat.id));
        if (sd2.T(chat) && !chat.megagroup) {
            if (!sd2.t0(chat)) {
                lowerCase = jb6.M0(2131752271, null).toLowerCase();
            } else {
                lowerCase = jb6.M0(2131752260, null).toLowerCase();
            }
        } else if (chat.has_geo) {
            lowerCase = jb6.M0(2131748399, null);
        } else if (!sd2.t0(chat)) {
            lowerCase = jb6.M0(2131748398, null).toLowerCase();
        } else {
            lowerCase = jb6.M0(2131748395, null).toLowerCase();
        }
        ha1Var.a.x(chat, null, null, lowerCase, false, false);
        mu8Var.setOnClickListener(onClickListener);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new ha1(context);
    }
}
