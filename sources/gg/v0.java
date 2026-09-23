package gg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.h6;
public final class v0 implements Runnable {
    public final int f9940a = 0;
    public final boolean f9941b;
    public final int f9942c;
    public final boolean d;
    public final Object e;
    public final Object f9943f;
    public final Object h;

    public v0(k1 k1Var, CharSequence charSequence, int i10, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = k1Var;
        this.f9943f = charSequence;
        this.f9942c = i10;
        this.h = arrayList;
        this.f9941b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f9940a) {
            case 0:
                boolean z10 = this.f9941b;
                boolean z11 = this.d;
                ((k1) this.e).U((CharSequence) this.f9943f, this.f9942c, (ArrayList) this.h, z10, z11);
                return;
            case 1:
                boolean z12 = this.d;
                ((MediaDataController) this.e).lambda$processLoadedDiceStickers$89(this.f9941b, (TLRPC.TL_messages_stickerSet) this.f9943f, this.f9942c, (String) this.h, z12);
                return;
            default:
                boolean z13 = this.d;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q(h6.k1((a6) this.e, (File) this.f9943f, this.f9942c, this.f9941b, (TLRPC.Document) this.h, z13), 15));
                return;
        }
    }

    public v0(MediaDataController mediaDataController, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, String str, boolean z11) {
        this.e = mediaDataController;
        this.f9941b = z10;
        this.f9943f = tL_messages_stickerSet;
        this.f9942c = i10;
        this.h = str;
        this.d = z11;
    }

    public v0(a6 a6Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        this.e = a6Var;
        this.f9943f = file;
        this.f9942c = i10;
        this.f9941b = z10;
        this.h = document;
        this.d = z11;
    }
}
