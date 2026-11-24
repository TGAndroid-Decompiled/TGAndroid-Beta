package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class h2b implements m7, af7 {
    public final x2b a;

    public h2b(x2b x2bVar) {
        this.a = x2bVar;
    }

    @Override
    public final void a(String str) {
        x2b x2bVar = this.a;
        new bp5(x2bVar.getContext(), x2bVar.i2, null, x2bVar.J0).show();
    }

    @Override
    public final void h(int i) {
        String str;
        x2b x2bVar = this.a;
        d dVar = x2bVar.F1;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = x2bVar.M1;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + oc7.r1(x2bVar.a).N2 + "/addemoji/" + x2bVar.M1.set.short_name;
            } else {
                str = "https://" + oc7.r1(x2bVar.a).N2 + "/addstickers/" + x2bVar.M1.set.short_name;
            }
            String str2 = str;
            if (i == 1) {
                Context context = x2bVar.H1;
                if (context == null && dVar != null) {
                    context = dVar.getParentActivity();
                }
                if (context == null) {
                    context = x2bVar.getContext();
                }
                l2b l2bVar = new l2b(x2bVar, context, str2, str2, x2bVar.J0);
                if (dVar != null) {
                    dVar.showDialog(l2bVar);
                    if (dVar instanceof yv1) {
                        boolean Y7 = ((yv1) dVar).Y7();
                        l2bVar.i0 = Y7;
                        l2bVar.n = Y7;
                        return;
                    }
                    return;
                }
                l2bVar.show();
            } else if (i == 2) {
                try {
                    gm.g(str2);
                    new c41((FrameLayout) x2bVar.b, x2bVar.J0).k(false).j();
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            } else if (i == 3) {
                if (x2bVar.L1) {
                    x2bVar.F0();
                } else {
                    x2bVar.H0();
                }
            } else if (i == 4) {
                c3b.c(x2bVar.M1.set, x2bVar.J0, x2bVar.getContext(), new vh8(x2bVar, (byte) 29));
            } else if (i == 5) {
                c3b.b(x2bVar.M1.set, x2bVar.J0, x2bVar.getContext(), new i2b(x2bVar, (byte) 2));
            }
        }
    }
}
