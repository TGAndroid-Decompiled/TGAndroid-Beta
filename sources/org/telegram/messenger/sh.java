package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sh implements Runnable {
    public final int f18096a = 0;
    public final int f18097b;
    public final boolean f18098c;
    public final boolean d;
    public final Object e;
    public final Object f18099f;
    public final Object h;

    public sh(vi viVar, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, String str, boolean z11) {
        this.e = viVar;
        this.f18098c = z10;
        this.f18099f = tL_messages_stickerSet;
        this.f18097b = i10;
        this.h = str;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f18096a) {
            case 0:
                vi viVar = (vi) this.e;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.f18099f;
                String str = (String) this.h;
                boolean z10 = this.f18098c;
                int i10 = this.f18097b;
                if (z10) {
                    long j10 = 1000;
                    if (tL_messages_stickerSet == null || Math.abs((System.currentTimeMillis() / 1000) - i10) >= 86400) {
                        i0.h3(new kg(viVar, str, this.d, 0), (tL_messages_stickerSet != null || z10) ? 0L : 0L);
                        if (tL_messages_stickerSet == null) {
                            return;
                        }
                    }
                }
                if (tL_messages_stickerSet != null) {
                    if (!z10) {
                        viVar.F1(str, tL_messages_stickerSet, i10);
                    }
                    i0.g3(new lg(viVar, str, tL_messages_stickerSet, 0));
                    return;
                } else if (!z10) {
                    viVar.F1(str, null, i10);
                    return;
                } else {
                    return;
                }
            case 1:
                i0.g3(new lg.s(org.telegram.ui.ActionBar.t6.p1((org.telegram.ui.ActionBar.m6) this.e, (File) this.f18099f, this.f18097b, this.f18098c, (TLRPC.Document) this.h, this.d), 29));
                return;
            default:
                ((zf.x0) this.e).U((CharSequence) this.f18099f, this.f18097b, (ArrayList) this.h, this.f18098c, this.d);
                return;
        }
    }

    public sh(org.telegram.ui.ActionBar.m6 m6Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        this.e = m6Var;
        this.f18099f = file;
        this.f18097b = i10;
        this.f18098c = z10;
        this.h = document;
        this.d = z11;
    }

    public sh(zf.x0 x0Var, CharSequence charSequence, int i10, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = x0Var;
        this.f18099f = charSequence;
        this.f18097b = i10;
        this.h = arrayList;
        this.f18098c = z10;
        this.d = z11;
    }
}
