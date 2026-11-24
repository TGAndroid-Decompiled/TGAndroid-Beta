package defpackage;

import org.telegram.tgnet.TLRPC;
public final class nb0 implements Runnable {
    public final d52 a;

    public nb0(d52 d52Var) {
        this.a = d52Var;
    }

    @Override
    public final void run() {
        ml mlVar;
        d52 d52Var = this.a;
        gl.e3(d52Var.E, 1000L);
        TLRPC.TL_emojiList tL_emojiList = d52Var.n;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty() && d52Var.x == 1.0f) {
            if (d52Var.y || ((mlVar = d52Var.b.k) != null && mlVar.C())) {
                int i = d52Var.w + 1;
                d52Var.w = i;
                d52Var.s++;
                if (i > tL_emojiList.document_id.size() - 1) {
                    d52Var.w = 0;
                }
                if (d52Var.s > 6) {
                    d52Var.s = 0;
                }
                vl vlVar = new vl(4, d52Var.r, tL_emojiList.document_id.get(d52Var.w).longValue());
                d52Var.a = vlVar;
                d52Var.d.setAnimatedEmojiDrawable(vlVar);
                int[] iArr = mb0.d0[d52Var.s];
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = iArr[2];
                int i5 = iArr[3];
                kz4 kz4Var = new kz4();
                d52Var.f = kz4Var;
                kz4Var.d(i2, i3, i4, i5);
                d52Var.x = 0.0f;
                d52Var.b();
                d52Var.invalidate();
            }
        }
    }
}
