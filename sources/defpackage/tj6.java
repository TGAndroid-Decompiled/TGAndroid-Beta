package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class tj6 extends LinearLayout implements jm7 {
    public final bf0 a;
    public final int b;

    public tj6(Context context) {
        super(context);
        this.b = z8c.t0;
        setPadding(0, gm.L(12.0f), 0, gm.L(12.0f));
        setOrientation(1);
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        addView(bf0Var, qoe.t(104, 104, 49, 0, 2, 0, 0));
    }

    public final void a() {
        boolean z;
        int i = this.b;
        TLRPC.TL_messages_stickerSet q0 = hs6.d0(i).q0("tg_placeholders_android");
        if (q0 == null) {
            q0 = hs6.d0(i).o0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = q0;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 4) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(3);
            this.a.n(gn5.b(document), "104_104", "tgs", eq3.f(document, cmb.Z6, 1.0f, null), tL_messages_stickerSet);
            return;
        }
        hs6 d0 = hs6.d0(i);
        if (tL_messages_stickerSet == null) {
            z = true;
        } else {
            z = false;
        }
        d0.d1("tg_placeholders_android", false, z);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        nm7.f(this.b).b(this, nm7.y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.b).n(this, nm7.y0);
    }
}
