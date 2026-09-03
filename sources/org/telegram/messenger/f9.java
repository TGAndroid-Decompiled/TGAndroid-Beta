package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final int f17176a = 0;
    public final int f17177b;
    public final boolean f17178c;
    public final boolean d;
    public final Object e;
    public final Object f17179f;
    public final Object h;

    public f9(MediaDataController mediaDataController, boolean z4, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, String str, boolean z10) {
        this.e = mediaDataController;
        this.f17178c = z4;
        this.f17179f = tL_messages_stickerSet;
        this.f17177b = i10;
        this.h = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17176a) {
            case 0:
                boolean z4 = this.d;
                ((MediaDataController) this.e).lambda$processLoadedDiceStickers$89(this.f17178c, (TLRPC.TL_messages_stickerSet) this.f17179f, this.f17177b, (String) this.h, z4);
                return;
            case 1:
                boolean z10 = this.d;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(org.telegram.ui.ActionBar.j6.k1((org.telegram.ui.ActionBar.c6) this.e, (File) this.f17179f, this.f17177b, this.f17178c, (TLRPC.Document) this.h, z10), 15));
                return;
            default:
                boolean z11 = this.f17178c;
                boolean z12 = this.d;
                ((tf.u0) this.e).U((CharSequence) this.f17179f, this.f17177b, (ArrayList) this.h, z11, z12);
                return;
        }
    }

    public f9(org.telegram.ui.ActionBar.c6 c6Var, File file, int i10, boolean z4, TLRPC.Document document, boolean z10) {
        this.e = c6Var;
        this.f17179f = file;
        this.f17177b = i10;
        this.f17178c = z4;
        this.h = document;
        this.d = z10;
    }

    public f9(tf.u0 u0Var, CharSequence charSequence, int i10, ArrayList arrayList, boolean z4, boolean z10) {
        this.e = u0Var;
        this.f17179f = charSequence;
        this.f17177b = i10;
        this.h = arrayList;
        this.f17178c = z4;
        this.d = z10;
    }
}
