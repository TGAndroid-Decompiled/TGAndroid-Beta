package jg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.jg;
import org.telegram.messenger.kg;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.j6;
public final class t0 implements Runnable {
    public final int f17283a = 0;
    public final boolean f17284b;
    public final int f17285c;
    public final boolean d;
    public final Object f17286e;
    public final Object f17287f;
    public final Object h;

    public t0(h1 h1Var, CharSequence charSequence, int i7, ArrayList arrayList, boolean z10, boolean z11) {
        this.f17286e = h1Var;
        this.f17287f = charSequence;
        this.f17285c = i7;
        this.h = arrayList;
        this.f17284b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f17283a) {
            case 0:
                ((h1) this.f17286e).U((CharSequence) this.f17287f, this.f17285c, (ArrayList) this.h, this.f17284b, this.d);
                return;
            case 1:
                si siVar = (si) this.f17286e;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.f17287f;
                String str = (String) this.h;
                boolean z10 = this.f17284b;
                int i7 = this.f17285c;
                if (z10) {
                    long j3 = 1000;
                    if (tL_messages_stickerSet == null || Math.abs((System.currentTimeMillis() / 1000) - i7) >= 86400) {
                        org.telegram.messenger.g0.i3(new jg(siVar, str, this.d, 0), (tL_messages_stickerSet != null || z10) ? 0L : 0L);
                        if (tL_messages_stickerSet == null) {
                            return;
                        }
                    }
                }
                if (tL_messages_stickerSet != null) {
                    if (!z10) {
                        siVar.F1(str, tL_messages_stickerSet, i7);
                    }
                    org.telegram.messenger.g0.h3(new kg(siVar, str, tL_messages_stickerSet, 0));
                    return;
                } else if (!z10) {
                    siVar.F1(str, null, i7);
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.r0(j6.p1((b6) this.f17286e, (File) this.f17287f, this.f17285c, this.f17284b, (TLRPC.Document) this.h, this.d), 11));
                return;
        }
    }

    public t0(si siVar, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i7, String str, boolean z11) {
        this.f17286e = siVar;
        this.f17284b = z10;
        this.f17287f = tL_messages_stickerSet;
        this.f17285c = i7;
        this.h = str;
        this.d = z11;
    }

    public t0(b6 b6Var, File file, int i7, boolean z10, TLRPC.Document document, boolean z11) {
        this.f17286e = b6Var;
        this.f17287f = file;
        this.f17285c = i7;
        this.f17284b = z10;
        this.h = document;
        this.d = z11;
    }
}
