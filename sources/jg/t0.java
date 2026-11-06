package jg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.kg;
import org.telegram.messenger.lg;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m5;
public final class t0 implements Runnable {
    public final int f16923a = 0;
    public final boolean f16924b;
    public final int f16925c;
    public final boolean d;
    public final Object f16926e;
    public final Object f16927f;
    public final Object h;

    public t0(i1 i1Var, CharSequence charSequence, int i7, ArrayList arrayList, boolean z9, boolean z10) {
        this.f16926e = i1Var;
        this.f16927f = charSequence;
        this.f16925c = i7;
        this.h = arrayList;
        this.f16924b = z9;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16923a) {
            case 0:
                ((i1) this.f16926e).U((CharSequence) this.f16927f, this.f16925c, (ArrayList) this.h, this.f16924b, this.d);
                return;
            case 1:
                ui uiVar = (ui) this.f16926e;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.f16927f;
                String str = (String) this.h;
                boolean z9 = this.f16924b;
                int i7 = this.f16925c;
                if (z9) {
                    long j3 = 1000;
                    if (tL_messages_stickerSet == null || Math.abs((System.currentTimeMillis() / 1000) - i7) >= 86400) {
                        org.telegram.messenger.g0.i3(new kg(uiVar, str, this.d, 0), (tL_messages_stickerSet != null || z9) ? 0L : 0L);
                        if (tL_messages_stickerSet == null) {
                            return;
                        }
                    }
                }
                if (tL_messages_stickerSet != null) {
                    if (!z9) {
                        uiVar.F1(str, tL_messages_stickerSet, i7);
                    }
                    org.telegram.messenger.g0.h3(new lg(uiVar, str, tL_messages_stickerSet, 0));
                    return;
                } else if (!z9) {
                    uiVar.F1(str, null, i7);
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.g0.h3(new m5(k6.p1((c6) this.f16926e, (File) this.f16927f, this.f16925c, this.f16924b, (TLRPC.Document) this.h, this.d), 0));
                return;
        }
    }

    public t0(ui uiVar, boolean z9, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i7, String str, boolean z10) {
        this.f16926e = uiVar;
        this.f16924b = z9;
        this.f16927f = tL_messages_stickerSet;
        this.f16925c = i7;
        this.h = str;
        this.d = z10;
    }

    public t0(c6 c6Var, File file, int i7, boolean z9, TLRPC.Document document, boolean z10) {
        this.f16926e = c6Var;
        this.f16927f = file;
        this.f16925c = i7;
        this.f16924b = z9;
        this.h = document;
        this.d = z10;
    }
}
