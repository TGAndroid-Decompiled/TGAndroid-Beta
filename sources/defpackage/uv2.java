package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class uv2 extends n39 {
    public final ArrayList c;
    public final xv2 d;

    public uv2(xv2 xv2Var, ArrayList arrayList) {
        this.d = xv2Var;
        this.c = arrayList;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.c.size();
    }

    @Override
    public final void t(s49 s49Var, int i) {
        wv2 wv2Var = (wv2) s49Var.a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.c.get(i);
        be0 be0Var = wv2Var.a;
        wv2Var.d = stickerSetCovered;
        boolean z = stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered;
        jia jiaVar = wv2Var.b;
        if (z) {
            jiaVar.l(k96.M0(2131748070, null), false);
            be0Var.setImageResource(2131232049);
            return;
        }
        jiaVar.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize w = ba4.w(document.thumbs, 90, false, null, false);
            kcb f = uo3.f(stickerSetCovered.cover, bkb.Z6, 1.0f, wv2Var.c);
            TLRPC.Document document2 = stickerSetCovered.cover;
            if (f != null) {
                if (w != null) {
                    be0Var.n(gl5.c(w, document2), null, "webp", f, stickerSetCovered);
                    return;
                } else {
                    be0Var.n(gl5.b(document2), null, "webp", f, stickerSetCovered);
                    return;
                }
            }
            be0Var.n(gl5.c(w, document2), null, "webp", null, stickerSetCovered);
            return;
        }
        be0Var.j(null, null, null, null, null, 0);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        wv2 wv2Var = new wv2(viewGroup.getContext(), this.d.c0);
        wv2Var.setLayoutParams(new e49(-2, gl.L(48.0f)));
        return new s49(wv2Var);
    }
}
