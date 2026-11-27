package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class e4b implements n7, hf7 {
    public final s4b a;

    public e4b(s4b s4bVar) {
        this.a = s4bVar;
    }

    @Override
    public final void a(String str) {
        s4b s4bVar = this.a;
        new ep5(s4bVar.getContext(), s4bVar.i2, null, s4bVar.J0).show();
    }

    @Override
    public final void g(int i) {
        String str;
        s4b s4bVar = this.a;
        e eVar = s4bVar.F1;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = s4bVar.M1;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + uc7.s1(s4bVar.a).N2 + "/addemoji/" + s4bVar.M1.set.short_name;
            } else {
                str = "https://" + uc7.s1(s4bVar.a).N2 + "/addstickers/" + s4bVar.M1.set.short_name;
            }
            String str2 = str;
            if (i == 1) {
                Context context = s4bVar.H1;
                if (context == null && eVar != null) {
                    context = eVar.getParentActivity();
                }
                if (context == null) {
                    context = s4bVar.getContext();
                }
                g4b g4bVar = new g4b(s4bVar, context, str2, str2, s4bVar.J0);
                if (eVar != null) {
                    eVar.showDialog(g4bVar);
                    if (eVar instanceof zu1) {
                        boolean Y7 = ((zu1) eVar).Y7();
                        g4bVar.i0 = Y7;
                        g4bVar.n = Y7;
                        return;
                    }
                    return;
                }
                g4bVar.show();
            } else if (i == 2) {
                try {
                    hl.g(str2);
                    new d31((FrameLayout) s4bVar.b, s4bVar.J0).k(false).j();
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            } else if (i == 3) {
                if (s4bVar.L1) {
                    s4bVar.G0();
                } else {
                    s4bVar.I0();
                }
            } else if (i == 4) {
                x4b.c(s4bVar.M1.set, s4bVar.J0, s4bVar.getContext(), new hj8(s4bVar, (byte) 29));
            } else if (i == 5) {
                x4b.b(s4bVar.M1.set, s4bVar.J0, s4bVar.getContext(), new f4b(s4bVar, (byte) 2));
            }
        }
    }
}
