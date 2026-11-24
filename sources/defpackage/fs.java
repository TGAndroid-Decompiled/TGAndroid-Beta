package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class fs implements s0b {
    public final View a;
    public final TLRPC.StickerSetCovered b;
    public final hs c;

    public fs(hs hsVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.c = hsVar;
        this.a = view;
        this.b = stickerSetCovered;
    }

    @Override
    public final void a() {
        ls8 ls8Var = ((es) this.a).f;
        if (ls8Var != null) {
            ls8Var.a(true, true);
        }
        vf6 vf6Var = this.c.a;
        TLRPC.StickerSetCovered stickerSetCovered = this.b;
        vf6Var.k(stickerSetCovered, stickerSetCovered.set.id);
    }
}
