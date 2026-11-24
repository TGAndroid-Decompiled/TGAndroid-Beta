package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class v04 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    public static c4c i(TLRPC.StickerSetCovered stickerSetCovered, m04 m04Var, boolean z) {
        c4c K = c4c.K(v04.class);
        long j = stickerSetCovered.set.id;
        long j2 = 1 + j;
        K.d = (int) (j2 ^ (j2 >>> 32));
        K.C = j;
        K.H = stickerSetCovered;
        K.I = m04Var;
        K.e = z;
        return K;
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        vm4 vm4Var = (vm4) view;
        Object obj = c4cVar.H;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            vm4Var.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((m04) c4cVar.I).e;
            vm4Var.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            vm4Var.c.d(document, null, null, null, false, false);
        }
        vm4Var.a(c4cVar.e, false);
    }

    @Override
    public final boolean c(c4c c4cVar, c4c c4cVar2) {
        if (c4cVar.C == c4cVar2.C && c4cVar.e == c4cVar2.e) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        vm4 vm4Var = new vm4(context, wjbVar);
        vm4Var.setLayoutParams(new e49(gl.L(64.0f), -1));
        return vm4Var;
    }

    @Override
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        if (c4cVar.C == c4cVar2.C) {
            return true;
        }
        return false;
    }
}
