package defpackage;

import org.telegram.tgnet.TLRPC;
public final class nc0 implements Runnable {
    public final o62 a;

    public nc0(o62 o62Var) {
        this.a = o62Var;
    }

    @Override
    public final void run() {
        mm mmVar;
        o62 o62Var = this.a;
        gm.d3(o62Var.E, 1000L);
        TLRPC.TL_emojiList tL_emojiList = o62Var.n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && o62Var.x == 1.0f) {
            if (o62Var.y || ((mmVar = o62Var.b.k) != null && mmVar.C())) {
                int i = o62Var.w + 1;
                o62Var.w = i;
                o62Var.s++;
                if (i > tL_emojiList.document_id.size() - 1) {
                    o62Var.w = 0;
                }
                if (o62Var.s > 6) {
                    o62Var.s = 0;
                }
                vm vmVar = new vm(4, o62Var.r, tL_emojiList.document_id.get(o62Var.w).longValue());
                o62Var.a = vmVar;
                o62Var.d.setAnimatedEmojiDrawable(vmVar);
                int[] iArr = mc0.d0[o62Var.s];
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = iArr[2];
                int i5 = iArr[3];
                j15 j15Var = new j15();
                o62Var.f = j15Var;
                j15Var.d(i2, i3, i4, i5);
                o62Var.x = 0.0f;
                o62Var.b();
                o62Var.invalidate();
            }
        }
    }
}
