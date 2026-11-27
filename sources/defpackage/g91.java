package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g91 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        String lowerCase;
        h91 h91Var = (h91) view;
        TLRPC.Chat chat = (TLRPC.Chat) b8cVar.H;
        View.OnClickListener onClickListener = b8cVar.E;
        h91Var.c = chat;
        uv8 uv8Var = h91Var.b;
        uv8Var.setTag(Long.valueOf(chat.id));
        if (xc2.T(chat) && !chat.megagroup) {
            if (!xc2.t0(chat)) {
                lowerCase = ob6.M0(2131752299, null).toLowerCase();
            } else {
                lowerCase = ob6.M0(2131752288, null).toLowerCase();
            }
        } else if (chat.has_geo) {
            lowerCase = ob6.M0(2131748396, null);
        } else if (!xc2.t0(chat)) {
            lowerCase = ob6.M0(2131748395, null).toLowerCase();
        } else {
            lowerCase = ob6.M0(2131748392, null).toLowerCase();
        }
        h91Var.a.C(chat, null, null, lowerCase, false, false);
        uv8Var.setOnClickListener(onClickListener);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new h91(context);
    }
}
