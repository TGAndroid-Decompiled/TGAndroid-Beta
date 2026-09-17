package hg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.j6;
public final class v0 implements Runnable {
    public final int f11308a = 0;
    public final boolean f11309b;
    public final int f11310c;
    public final boolean d;
    public final Object f11311e;
    public final Object f11312f;
    public final Object h;

    public v0(k1 k1Var, CharSequence charSequence, int i10, ArrayList arrayList, boolean z10, boolean z11) {
        this.f11311e = k1Var;
        this.f11312f = charSequence;
        this.f11310c = i10;
        this.h = arrayList;
        this.f11309b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f11308a) {
            case 0:
                boolean z10 = this.f11309b;
                boolean z11 = this.d;
                ((k1) this.f11311e).U((CharSequence) this.f11312f, this.f11310c, (ArrayList) this.h, z10, z11);
                return;
            case 1:
                boolean z12 = this.d;
                ((MediaDataController) this.f11311e).lambda$processLoadedDiceStickers$89(this.f11309b, (TLRPC.TL_messages_stickerSet) this.f11312f, this.f11310c, (String) this.h, z12);
                return;
            default:
                boolean z13 = this.d;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q(j6.k1((b6) this.f11311e, (File) this.f11312f, this.f11310c, this.f11309b, (TLRPC.Document) this.h, z13), 15));
                return;
        }
    }

    public v0(MediaDataController mediaDataController, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, String str, boolean z11) {
        this.f11311e = mediaDataController;
        this.f11309b = z10;
        this.f11312f = tL_messages_stickerSet;
        this.f11310c = i10;
        this.h = str;
        this.d = z11;
    }

    public v0(b6 b6Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        this.f11311e = b6Var;
        this.f11312f = file;
        this.f11310c = i10;
        this.f11309b = z10;
        this.h = document;
        this.d = z11;
    }
}
