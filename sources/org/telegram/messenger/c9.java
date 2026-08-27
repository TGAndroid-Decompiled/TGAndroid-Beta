package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class c9 implements Runnable {

    public final int f19895a = 0;

    public final int f19896b;

    public final boolean f19897c;
    public final boolean d;

    public final Object f19898e;

    public final Object f19899f;
    public final Object h;

    public c9(MediaDataController mediaDataController, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, String str, boolean z11) {
        this.f19898e = mediaDataController;
        this.f19897c = z10;
        this.f19899f = tL_messages_stickerSet;
        this.f19896b = i10;
        this.h = str;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f19895a) {
            case 0:
                ((MediaDataController) this.f19898e).lambda$processLoadedDiceStickers$89(this.f19897c, (TLRPC.TL_messages_stickerSet) this.f19899f, this.f19896b, (String) this.h, this.d);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(org.telegram.ui.ActionBar.g6.k1((org.telegram.ui.ActionBar.z5) this.f19898e, (File) this.f19899f, this.f19896b, this.f19897c, (TLRPC.Document) this.h, this.d), 15));
                break;
            default:
                ((pf.u0) this.f19898e).U((CharSequence) this.f19899f, this.f19896b, (ArrayList) this.h, this.f19897c, this.d);
                break;
        }
    }

    public c9(org.telegram.ui.ActionBar.z5 z5Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        this.f19898e = z5Var;
        this.f19899f = file;
        this.f19896b = i10;
        this.f19897c = z10;
        this.h = document;
        this.d = z11;
    }

    public c9(pf.u0 u0Var, CharSequence charSequence, int i10, ArrayList arrayList, boolean z10, boolean z11) {
        this.f19898e = u0Var;
        this.f19899f = charSequence;
        this.f19896b = i10;
        this.h = arrayList;
        this.f19897c = z10;
        this.d = z11;
    }
}
