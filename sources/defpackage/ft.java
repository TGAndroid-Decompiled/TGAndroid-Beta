package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ft implements v2b {
    public final View a;
    public final TLRPC.StickerSetCovered b;
    public final ht c;

    public ft(ht htVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.c = htVar;
        this.a = view;
        this.b = stickerSetCovered;
    }

    @Override
    public final void a() {
        mu8 mu8Var = ((et) this.a).f;
        if (mu8Var != null) {
            mu8Var.a(true, true);
        }
        vh6 vh6Var = this.c.a;
        TLRPC.StickerSetCovered stickerSetCovered = this.b;
        vh6Var.k(stickerSetCovered, stickerSetCovered.set.id);
    }
}
