package kg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.cg;
import org.telegram.messenger.dg;
import org.telegram.messenger.li;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.ActionBar.k6;
public final class q0 implements Runnable {
    public final int f17151a = 0;
    public final boolean f17152b;
    public final int f17153c;
    public final boolean d;
    public final Object f17154e;
    public final Object f17155f;
    public final Object h;

    public q0(e1 e1Var, CharSequence charSequence, int i3, ArrayList arrayList, boolean z10, boolean z11) {
        this.f17154e = e1Var;
        this.f17155f = charSequence;
        this.f17153c = i3;
        this.h = arrayList;
        this.f17152b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f17151a) {
            case 0:
                ((e1) this.f17154e).U((CharSequence) this.f17155f, this.f17153c, (ArrayList) this.h, this.f17152b, this.d);
                return;
            case 1:
                li liVar = (li) this.f17154e;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.f17155f;
                String str = (String) this.h;
                boolean z10 = this.f17152b;
                int i3 = this.f17153c;
                if (z10) {
                    long j10 = 1000;
                    if (tL_messages_stickerSet == null || Math.abs((System.currentTimeMillis() / 1000) - i3) >= 86400) {
                        org.telegram.messenger.g0.i3(new cg(liVar, str, this.d, 0), (tL_messages_stickerSet != null || z10) ? 0L : 0L);
                        if (tL_messages_stickerSet == null) {
                            return;
                        }
                    }
                }
                if (tL_messages_stickerSet != null) {
                    if (!z10) {
                        liVar.F1(str, tL_messages_stickerSet, i3);
                    }
                    org.telegram.messenger.g0.h3(new dg(liVar, str, tL_messages_stickerSet, 0));
                    return;
                } else if (!z10) {
                    liVar.F1(str, null, i3);
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.g0.h3(new d4(k6.p1((b6) this.f17154e, (File) this.f17155f, this.f17153c, this.f17152b, (TLRPC.Document) this.h, this.d), 3));
                return;
        }
    }

    public q0(li liVar, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i3, String str, boolean z11) {
        this.f17154e = liVar;
        this.f17152b = z10;
        this.f17155f = tL_messages_stickerSet;
        this.f17153c = i3;
        this.h = str;
        this.d = z11;
    }

    public q0(b6 b6Var, File file, int i3, boolean z10, TLRPC.Document document, boolean z11) {
        this.f17154e = b6Var;
        this.f17155f = file;
        this.f17153c = i3;
        this.f17152b = z10;
        this.h = document;
        this.d = z11;
    }
}
