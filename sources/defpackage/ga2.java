package defpackage;

import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class ga2 extends LinearLayout implements fn7 {
    public de0 a;
    public za6 b;
    public int c;

    public final void a() {
        boolean z;
        de0 de0Var = this.a;
        int i = this.c;
        TLRPC.TL_messages_stickerSet q0 = ls6.d0(i).q0("tg_placeholders_android");
        if (q0 == null) {
            q0 = ls6.d0(i).o0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = q0;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 3) {
            de0Var.n(jn5.b(tL_messages_stickerSet.documents.get(2)), "104_104", "tgs", this.b, tL_messages_stickerSet);
            return;
        }
        ls6 d0 = ls6.d0(i);
        if (tL_messages_stickerSet == null) {
            z = true;
        } else {
            z = false;
        }
        d0.d1("tg_placeholders_android", false, z);
        de0Var.setImageDrawable(this.b);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        jn7.f(this.c).b(this, jn7.y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.c).n(this, jn7.y0);
    }
}
