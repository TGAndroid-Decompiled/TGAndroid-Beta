package jg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.jg;
import org.telegram.messenger.kg;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.n6;
public final class t0 implements Runnable {
    public final int f17669a = 0;
    public final boolean f17670b;
    public final int f17671c;
    public final boolean d;
    public final Object f17672e;
    public final Object f17673f;
    public final Object h;

    public t0(h1 h1Var, CharSequence charSequence, int i7, ArrayList arrayList, boolean z10, boolean z11) {
        this.f17672e = h1Var;
        this.f17673f = charSequence;
        this.f17671c = i7;
        this.h = arrayList;
        this.f17670b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f17669a) {
            case 0:
                ((h1) this.f17672e).U((CharSequence) this.f17673f, this.f17671c, (ArrayList) this.h, this.f17670b, this.d);
                return;
            case 1:
                ri riVar = (ri) this.f17672e;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.f17673f;
                String str = (String) this.h;
                boolean z10 = this.f17670b;
                int i7 = this.f17671c;
                if (z10) {
                    long j3 = 1000;
                    if (tL_messages_stickerSet == null || Math.abs((System.currentTimeMillis() / 1000) - i7) >= 86400) {
                        org.telegram.messenger.g0.h3(new jg(riVar, str, this.d, 0), (tL_messages_stickerSet != null || z10) ? 0L : 0L);
                        if (tL_messages_stickerSet == null) {
                            return;
                        }
                    }
                }
                if (tL_messages_stickerSet != null) {
                    if (!z10) {
                        riVar.K1(str, tL_messages_stickerSet, i7);
                    }
                    org.telegram.messenger.g0.g3(new kg(riVar, str, tL_messages_stickerSet, 0));
                    return;
                } else if (!z10) {
                    riVar.K1(str, null, i7);
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.g0.g3(new oi.a2(n6.p1((e6) this.f17672e, (File) this.f17673f, this.f17671c, this.f17670b, (TLRPC.Document) this.h, this.d), 15));
                return;
        }
    }

    public t0(ri riVar, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i7, String str, boolean z11) {
        this.f17672e = riVar;
        this.f17670b = z10;
        this.f17673f = tL_messages_stickerSet;
        this.f17671c = i7;
        this.h = str;
        this.d = z11;
    }

    public t0(e6 e6Var, File file, int i7, boolean z10, TLRPC.Document document, boolean z11) {
        this.f17672e = e6Var;
        this.f17673f = file;
        this.f17671c = i7;
        this.f17670b = z10;
        this.h = document;
        this.d = z11;
    }
}
