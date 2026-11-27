package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q14 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    public static b8c i(TLRPC.StickerSetCovered stickerSetCovered, h14 h14Var, boolean z) {
        b8c K = b8c.K(q14.class);
        long j = stickerSetCovered.set.id;
        long j2 = 1 + j;
        K.d = (int) (j2 ^ (j2 >>> 32));
        K.C = j;
        K.H = stickerSetCovered;
        K.I = h14Var;
        K.e = z;
        return K;
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ap4 ap4Var = (ap4) view;
        Object obj = b8cVar.H;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            ap4Var.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((h14) b8cVar.I).e;
            ap4Var.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            ap4Var.c.d(document, null, null, null, false, false);
        }
        ap4Var.a(b8cVar.e, false);
    }

    @Override
    public final boolean c(b8c b8cVar, b8c b8cVar2) {
        if (b8cVar.C == b8cVar2.C && b8cVar.e == b8cVar2.e) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        ap4 ap4Var = new ap4(context, vnbVar);
        ap4Var.setLayoutParams(new r79(hl.L(64.0f), -1));
        return ap4Var;
    }

    @Override
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        if (b8cVar.C == b8cVar2.C) {
            return true;
        }
        return false;
    }
}
