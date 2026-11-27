package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ow2 extends c79 {
    public final ArrayList c;
    public final rw2 d;

    public ow2(rw2 rw2Var, ArrayList arrayList) {
        this.d = rw2Var;
        this.c = arrayList;
    }

    @Override
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.c.size();
    }

    @Override
    public final void t(f89 f89Var, int i) {
        qw2 qw2Var = (qw2) f89Var.a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.c.get(i);
        de0 de0Var = qw2Var.a;
        qw2Var.d = stickerSetCovered;
        boolean z = stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered;
        ema emaVar = qw2Var.b;
        if (z) {
            emaVar.l(ob6.M0(2131748016, null), false);
            de0Var.setImageResource(2131232049);
            return;
        }
        emaVar.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize w = xb4.w(document.thumbs, 90, false, null, false);
            ggb f = lp3.f(stickerSetCovered.cover, aob.a7, 1.0f, qw2Var.c);
            TLRPC.Document document2 = stickerSetCovered.cover;
            if (f != null) {
                if (w != null) {
                    de0Var.n(jn5.c(w, document2), null, "webp", f, stickerSetCovered);
                    return;
                } else {
                    de0Var.n(jn5.b(document2), null, "webp", f, stickerSetCovered);
                    return;
                }
            }
            de0Var.n(jn5.c(w, document2), null, "webp", null, stickerSetCovered);
            return;
        }
        de0Var.j(null, null, null, null, null, 0);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        qw2 qw2Var = new qw2(viewGroup.getContext(), this.d.c0);
        qw2Var.setLayoutParams(new r79(-2, hl.L(48.0f)));
        return new f89(qw2Var);
    }
}
