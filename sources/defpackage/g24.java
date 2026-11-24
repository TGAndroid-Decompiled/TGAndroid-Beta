package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g24 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    public static c6c i(TLRPC.StickerSetCovered stickerSetCovered, x14 x14Var, boolean z) {
        c6c K = c6c.K(g24.class);
        long j = stickerSetCovered.set.id;
        long j2 = 1 + j;
        K.d = (int) (j2 ^ (j2 >>> 32));
        K.C = j;
        K.H = stickerSetCovered;
        K.I = x14Var;
        K.e = z;
        return K;
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        wo4 wo4Var = (wo4) view;
        Object obj = c6cVar.H;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            wo4Var.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((x14) c6cVar.I).e;
            wo4Var.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            wo4Var.c.d(document, null, null, null, false, false);
        }
        wo4Var.a(c6cVar.e, false);
    }

    @Override
    public final boolean c(c6c c6cVar, c6c c6cVar2) {
        if (c6cVar.C == c6cVar2.C && c6cVar.e == c6cVar2.e) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        wo4 wo4Var = new wo4(context, ylbVar);
        wo4Var.setLayoutParams(new g69(gm.L(64.0f), -1));
        return wo4Var;
    }

    @Override
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        if (c6cVar.C == c6cVar2.C) {
            return true;
        }
        return false;
    }
}
