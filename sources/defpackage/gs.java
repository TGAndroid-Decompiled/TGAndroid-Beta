package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class gs implements q4b {
    public final View a;
    public final TLRPC.StickerSetCovered b;
    public final is c;

    public gs(is isVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.c = isVar;
        this.a = view;
        this.b = stickerSetCovered;
    }

    @Override
    public final void a() {
        uv8 uv8Var = ((fs) this.a).f;
        if (uv8Var != null) {
            uv8Var.a(true, true);
        }
        zh6 zh6Var = this.c.a;
        TLRPC.StickerSetCovered stickerSetCovered = this.b;
        zh6Var.k(stickerSetCovered.set.id, stickerSetCovered);
    }
}
