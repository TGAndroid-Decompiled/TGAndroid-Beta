package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class g0b implements m7, yc7 {
    public final u0b a;

    public g0b(u0b u0bVar) {
        this.a = u0bVar;
    }

    @Override
    public final void a(String str) {
        u0b u0bVar = this.a;
        new bn5(u0bVar.getContext(), u0bVar.i2, null, u0bVar.J0).show();
    }

    @Override
    public final void h(int i) {
        String str;
        u0b u0bVar = this.a;
        d dVar = u0bVar.F1;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = u0bVar.M1;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + na7.q1(u0bVar.a).N2 + "/addemoji/" + u0bVar.M1.set.short_name;
            } else {
                str = "https://" + na7.q1(u0bVar.a).N2 + "/addstickers/" + u0bVar.M1.set.short_name;
            }
            String str2 = str;
            if (i == 1) {
                Context context = u0bVar.H1;
                if (context == null && dVar != null) {
                    context = dVar.getParentActivity();
                }
                if (context == null) {
                    context = u0bVar.getContext();
                }
                i0b i0bVar = new i0b(u0bVar, context, str2, str2, u0bVar.J0);
                if (dVar != null) {
                    dVar.showDialog(i0bVar);
                    if (dVar instanceof mu1) {
                        boolean Q7 = ((mu1) dVar).Q7();
                        i0bVar.i0 = Q7;
                        i0bVar.n = Q7;
                        return;
                    }
                    return;
                }
                i0bVar.show();
            } else if (i == 2) {
                try {
                    gl.g(str2);
                    new u21((FrameLayout) u0bVar.b, u0bVar.J0).k(false).j();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            } else if (i == 3) {
                if (u0bVar.L1) {
                    u0bVar.F0();
                } else {
                    u0bVar.H0();
                }
            } else if (i == 4) {
                a1b.c(u0bVar.M1.set, u0bVar.J0, u0bVar.getContext(), new tf8(u0bVar, (byte) 29));
            } else if (i == 5) {
                a1b.b(u0bVar.M1.set, u0bVar.J0, u0bVar.getContext(), new h0b(u0bVar, (byte) 2));
            }
        }
    }
}
