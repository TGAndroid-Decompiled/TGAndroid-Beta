package gg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.i6;
public final class v0 implements Runnable {
    public final int f10823a = 0;
    public final boolean f10824b;
    public final int f10825c;
    public final boolean d;
    public final Object f10826e;
    public final Object f10827f;
    public final Object h;

    public v0(k1 k1Var, CharSequence charSequence, int i10, ArrayList arrayList, boolean z10, boolean z11) {
        this.f10826e = k1Var;
        this.f10827f = charSequence;
        this.f10825c = i10;
        this.h = arrayList;
        this.f10824b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f10823a) {
            case 0:
                boolean z10 = this.f10824b;
                boolean z11 = this.d;
                ((k1) this.f10826e).U((CharSequence) this.f10827f, this.f10825c, (ArrayList) this.h, z10, z11);
                return;
            case 1:
                boolean z12 = this.d;
                ((MediaDataController) this.f10826e).lambda$processLoadedDiceStickers$89(this.f10824b, (TLRPC.TL_messages_stickerSet) this.f10827f, this.f10825c, (String) this.h, z12);
                return;
            default:
                boolean z13 = this.d;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q(i6.k1((a6) this.f10826e, (File) this.f10827f, this.f10825c, this.f10824b, (TLRPC.Document) this.h, z13), 15));
                return;
        }
    }

    public v0(MediaDataController mediaDataController, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, String str, boolean z11) {
        this.f10826e = mediaDataController;
        this.f10824b = z10;
        this.f10827f = tL_messages_stickerSet;
        this.f10825c = i10;
        this.h = str;
        this.d = z11;
    }

    public v0(a6 a6Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        this.f10826e = a6Var;
        this.f10827f = file;
        this.f10825c = i10;
        this.f10824b = z10;
        this.h = document;
        this.d = z11;
    }
}
