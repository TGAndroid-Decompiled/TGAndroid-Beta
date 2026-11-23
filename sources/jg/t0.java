package jg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.kg;
import org.telegram.messenger.lg;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.m6;
public final class t0 implements Runnable {
    public final int f17660a = 0;
    public final boolean f17661b;
    public final int f17662c;
    public final boolean d;
    public final Object f17663e;
    public final Object f17664f;
    public final Object h;

    public t0(h1 h1Var, CharSequence charSequence, int i7, ArrayList arrayList, boolean z10, boolean z11) {
        this.f17663e = h1Var;
        this.f17664f = charSequence;
        this.f17662c = i7;
        this.h = arrayList;
        this.f17661b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f17660a) {
            case 0:
                ((h1) this.f17663e).U((CharSequence) this.f17664f, this.f17662c, (ArrayList) this.h, this.f17661b, this.d);
                return;
            case 1:
                si siVar = (si) this.f17663e;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.f17664f;
                String str = (String) this.h;
                boolean z10 = this.f17661b;
                int i7 = this.f17662c;
                if (z10) {
                    long j3 = 1000;
                    if (tL_messages_stickerSet == null || Math.abs((System.currentTimeMillis() / 1000) - i7) >= 86400) {
                        org.telegram.messenger.g0.h3(new kg(siVar, str, this.d, 0), (tL_messages_stickerSet != null || z10) ? 0L : 0L);
                        if (tL_messages_stickerSet == null) {
                            return;
                        }
                    }
                }
                if (tL_messages_stickerSet != null) {
                    if (!z10) {
                        siVar.K1(str, tL_messages_stickerSet, i7);
                    }
                    org.telegram.messenger.g0.g3(new lg(siVar, str, tL_messages_stickerSet, 0));
                    return;
                } else if (!z10) {
                    siVar.K1(str, null, i7);
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.g0.g3(new org.telegram.tgnet.m(m6.p1((d6) this.f17663e, (File) this.f17664f, this.f17662c, this.f17661b, (TLRPC.Document) this.h, this.d), 14));
                return;
        }
    }

    public t0(si siVar, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i7, String str, boolean z11) {
        this.f17663e = siVar;
        this.f17661b = z10;
        this.f17664f = tL_messages_stickerSet;
        this.f17662c = i7;
        this.h = str;
        this.d = z11;
    }

    public t0(d6 d6Var, File file, int i7, boolean z10, TLRPC.Document document, boolean z11) {
        this.f17663e = d6Var;
        this.f17664f = file;
        this.f17662c = i7;
        this.f17661b = z10;
        this.h = document;
        this.d = z11;
    }
}
