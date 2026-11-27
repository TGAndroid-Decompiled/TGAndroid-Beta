package defpackage;

import org.telegram.tgnet.TLRPC;
public final class pb0 implements Runnable {
    public final t52 a;

    public pb0(t52 t52Var) {
        this.a = t52Var;
    }

    @Override
    public final void run() {
        nl nlVar;
        t52 t52Var = this.a;
        hl.d3(t52Var.E, 1000L);
        TLRPC.TL_emojiList tL_emojiList = t52Var.n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && t52Var.x == 1.0f) {
            if (t52Var.y || ((nlVar = t52Var.b.k) != null && nlVar.C())) {
                int i = t52Var.w + 1;
                t52Var.w = i;
                t52Var.s++;
                if (i > tL_emojiList.document_id.size() - 1) {
                    t52Var.w = 0;
                }
                if (t52Var.s > 6) {
                    t52Var.s = 0;
                }
                wl wlVar = new wl(4, t52Var.r, tL_emojiList.document_id.get(t52Var.w).longValue());
                t52Var.a = wlVar;
                t52Var.d.setAnimatedEmojiDrawable(wlVar);
                int[] iArr = ob0.d0[t52Var.s];
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = iArr[2];
                int i5 = iArr[3];
                o15 o15Var = new o15();
                t52Var.f = o15Var;
                o15Var.d(i2, i3, i4, i5);
                t52Var.x = 0.0f;
                t52Var.b();
                t52Var.invalidate();
            }
        }
    }
}
