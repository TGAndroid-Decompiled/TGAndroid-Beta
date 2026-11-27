package defpackage;

import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public abstract class cl3 extends LinearLayout implements fn7 {
    public int a;
    public de0 b;
    public TextView c;
    public TextView d;
    public TextView e;

    public final void a() {
        TLRPC.Document document;
        de0 de0Var = this.b;
        int i = this.a;
        TLRPC.TL_messages_stickerSet q0 = ls6.d0(i).q0("tg_placeholders_android");
        if (q0 == null) {
            q0 = ls6.d0(i).o0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = q0;
        boolean z = true;
        if (tL_messages_stickerSet != null && 1 < tL_messages_stickerSet.documents.size()) {
            document = tL_messages_stickerSet.documents.get(1);
        } else {
            document = null;
        }
        if (document != null) {
            ggb d = lp3.d(document.thumbs, aob.a7, 0.2f, false);
            if (d != null) {
                d.e = 512;
                d.f = 512;
            }
            this.b.n(jn5.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
            de0Var.getImageReceiver().M(2);
            return;
        }
        ls6 d0 = ls6.d0(i);
        if (tL_messages_stickerSet != null) {
            z = false;
        }
        d0.d1("tg_placeholders_android", false, z);
        de0Var.getImageReceiver().f();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.a).b(this, jn7.y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.a).n(this, jn7.y0);
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        TextView textView = this.c;
        TextView textView2 = this.d;
        TextView textView3 = this.e;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            textView.setText(ob6.M0(2131747875, null));
            textView2.setText(ob6.M0(2131747874, null));
            textView3.setVisibility(0);
            textView3.setText(ob6.M0(2131751717, null));
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            textView.setText(ob6.M0(2131747873, null));
            textView2.setText(ob6.M0(2131747872, null));
            textView3.setVisibility(0);
            textView3.setText(ob6.M0(2131751711, null));
        } else {
            textView.setText(ob6.M0(2131747871, null));
            textView2.setText(ob6.M0(2131747870, null));
            textView3.setVisibility(8);
        }
    }
}
