package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class rh6 extends LinearLayout implements gk7 {
    public final be0 a;
    public final int b;

    public rh6(Context context) {
        super(context);
        this.b = y6c.t0;
        setPadding(0, gl.L(12.0f), 0, gl.L(12.0f));
        setOrientation(1);
        be0 be0Var = new be0(context);
        this.a = be0Var;
        addView(be0Var, nme.t(104, 104, 49, 0, 2, 0, 0));
    }

    public final void a() {
        boolean z;
        int i = this.b;
        TLRPC.TL_messages_stickerSet q0 = hq6.d0(i).q0("tg_placeholders_android");
        if (q0 == null) {
            q0 = hq6.d0(i).o0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = q0;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 4) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(3);
            this.a.n(gl5.b(document), "104_104", "tgs", uo3.f(document, bkb.Z6, 1.0f, null), tL_messages_stickerSet);
            return;
        }
        hq6 d0 = hq6.d0(i);
        if (tL_messages_stickerSet == null) {
            z = true;
        } else {
            z = false;
        }
        d0.d1("tg_placeholders_android", false, z);
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
        kk7.f(this.b).b(this, kk7.x0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.b).n(this, kk7.x0);
    }
}
