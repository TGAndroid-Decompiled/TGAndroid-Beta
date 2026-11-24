package defpackage;

import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public abstract class vl3 extends LinearLayout implements jm7 {
    public int a;
    public bf0 b;
    public TextView c;
    public TextView d;
    public TextView e;

    public final void a() {
        TLRPC.Document document;
        bf0 bf0Var = this.b;
        int i = this.a;
        TLRPC.TL_messages_stickerSet q0 = hs6.d0(i).q0("tg_placeholders_android");
        if (q0 == null) {
            q0 = hs6.d0(i).o0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = q0;
        boolean z = true;
        if (tL_messages_stickerSet != null && 1 < tL_messages_stickerSet.documents.size()) {
            document = tL_messages_stickerSet.documents.get(1);
        } else {
            document = null;
        }
        if (document != null) {
            meb d = eq3.d(document.thumbs, cmb.Z6, 0.2f, false);
            if (d != null) {
                d.e = 512;
                d.f = 512;
            }
            this.b.n(gn5.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
            bf0Var.getImageReceiver().M(2);
            return;
        }
        hs6 d0 = hs6.d0(i);
        if (tL_messages_stickerSet != null) {
            z = false;
        }
        d0.d1("tg_placeholders_android", false, z);
        bf0Var.getImageReceiver().f();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.a).b(this, nm7.y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.a).n(this, nm7.y0);
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        TextView textView = this.c;
        TextView textView2 = this.d;
        TextView textView3 = this.e;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            textView.setText(jb6.M0(2131747878, null));
            textView2.setText(jb6.M0(2131747877, null));
            textView3.setVisibility(0);
            textView3.setText(jb6.M0(2131751689, null));
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            textView.setText(jb6.M0(2131747876, null));
            textView2.setText(jb6.M0(2131747875, null));
            textView3.setVisibility(0);
            textView3.setText(jb6.M0(2131751683, null));
        } else {
            textView.setText(jb6.M0(2131747874, null));
            textView2.setText(jb6.M0(2131747873, null));
            textView3.setVisibility(8);
        }
    }
}
