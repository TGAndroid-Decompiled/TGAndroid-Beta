package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final int f18638a = 0;
    public final int f18639b;
    public final boolean f18640c;
    public final boolean d;
    public final Object f18641e;
    public final Object f18642f;
    public final Object h;

    public f9(MediaDataController mediaDataController, boolean z4, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, String str, boolean z10) {
        this.f18641e = mediaDataController;
        this.f18640c = z4;
        this.f18642f = tL_messages_stickerSet;
        this.f18639b = i10;
        this.h = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18638a) {
            case 0:
                boolean z4 = this.d;
                ((MediaDataController) this.f18641e).lambda$processLoadedDiceStickers$89(this.f18640c, (TLRPC.TL_messages_stickerSet) this.f18642f, this.f18639b, (String) this.h, z4);
                return;
            case 1:
                boolean z10 = this.d;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(org.telegram.ui.ActionBar.k6.k1((org.telegram.ui.ActionBar.d6) this.f18641e, (File) this.f18642f, this.f18639b, this.f18640c, (TLRPC.Document) this.h, z10), 15));
                return;
            default:
                boolean z11 = this.f18640c;
                boolean z12 = this.d;
                ((uf.u0) this.f18641e).U((CharSequence) this.f18642f, this.f18639b, (ArrayList) this.h, z11, z12);
                return;
        }
    }

    public f9(org.telegram.ui.ActionBar.d6 d6Var, File file, int i10, boolean z4, TLRPC.Document document, boolean z10) {
        this.f18641e = d6Var;
        this.f18642f = file;
        this.f18639b = i10;
        this.f18640c = z4;
        this.h = document;
        this.d = z10;
    }

    public f9(uf.u0 u0Var, CharSequence charSequence, int i10, ArrayList arrayList, boolean z4, boolean z10) {
        this.f18641e = u0Var;
        this.f18642f = charSequence;
        this.f18639b = i10;
        this.h = arrayList;
        this.f18640c = z4;
        this.d = z10;
    }
}
