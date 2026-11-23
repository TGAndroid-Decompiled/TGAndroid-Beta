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
    public final int f17762a = 0;
    public final boolean f17763b;
    public final int f17764c;
    public final boolean d;
    public final Object f17765e;
    public final Object f17766f;
    public final Object h;

    public t0(h1 h1Var, CharSequence charSequence, int i7, ArrayList arrayList, boolean z10, boolean z11) {
        this.f17765e = h1Var;
        this.f17766f = charSequence;
        this.f17764c = i7;
        this.h = arrayList;
        this.f17763b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f17762a) {
            case 0:
                ((h1) this.f17765e).U((CharSequence) this.f17766f, this.f17764c, (ArrayList) this.h, this.f17763b, this.d);
                return;
            case 1:
                ri riVar = (ri) this.f17765e;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.f17766f;
                String str = (String) this.h;
                boolean z10 = this.f17763b;
                int i7 = this.f17764c;
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
                org.telegram.messenger.g0.g3(new oi.c2(n6.p1((e6) this.f17765e, (File) this.f17766f, this.f17764c, this.f17763b, (TLRPC.Document) this.h, this.d), 15));
                return;
        }
    }

    public t0(ri riVar, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i7, String str, boolean z11) {
        this.f17765e = riVar;
        this.f17763b = z10;
        this.f17766f = tL_messages_stickerSet;
        this.f17764c = i7;
        this.h = str;
        this.d = z11;
    }

    public t0(e6 e6Var, File file, int i7, boolean z10, TLRPC.Document document, boolean z11) {
        this.f17765e = e6Var;
        this.f17766f = file;
        this.f17764c = i7;
        this.f17763b = z10;
        this.h = document;
        this.d = z11;
    }
}
