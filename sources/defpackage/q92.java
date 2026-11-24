package defpackage;

import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class q92 extends LinearLayout implements gk7 {
    public be0 a;
    public v86 b;
    public int c;

    public final void a() {
        boolean z;
        be0 be0Var = this.a;
        int i = this.c;
        TLRPC.TL_messages_stickerSet q0 = hq6.d0(i).q0("tg_placeholders_android");
        if (q0 == null) {
            q0 = hq6.d0(i).o0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = q0;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 3) {
            be0Var.n(gl5.b(tL_messages_stickerSet.documents.get(2)), "104_104", "tgs", this.b, tL_messages_stickerSet);
            return;
        }
        hq6 d0 = hq6.d0(i);
        if (tL_messages_stickerSet == null) {
            z = true;
        } else {
            z = false;
        }
        d0.d1("tg_placeholders_android", false, z);
        be0Var.setImageDrawable(this.b);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.x0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        kk7.f(this.c).b(this, kk7.x0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.c).n(this, kk7.x0);
    }
}
