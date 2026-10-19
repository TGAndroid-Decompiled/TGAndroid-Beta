package hg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.h6;
public final class u0 implements Runnable {
    public final int f12068a = 0;
    public final boolean f12069b;
    public final int f12070c;
    public final boolean d;
    public final Object e;
    public final Object f12071f;
    public final Object h;

    public u0(j1 j1Var, CharSequence charSequence, int i10, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = j1Var;
        this.f12071f = charSequence;
        this.f12070c = i10;
        this.h = arrayList;
        this.f12069b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f12068a) {
            case 0:
                boolean z10 = this.f12069b;
                boolean z11 = this.d;
                ((j1) this.e).U((CharSequence) this.f12071f, this.f12070c, (ArrayList) this.h, z10, z11);
                return;
            case 1:
                boolean z12 = this.d;
                ((MediaDataController) this.e).lambda$processLoadedDiceStickers$89(this.f12069b, (TLRPC.TL_messages_stickerSet) this.f12071f, this.f12070c, (String) this.h, z12);
                return;
            default:
                boolean z13 = this.d;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(h6.l1((a6) this.e, (File) this.f12071f, this.f12070c, this.f12069b, (TLRPC.Document) this.h, z13), 15));
                return;
        }
    }

    public u0(MediaDataController mediaDataController, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, String str, boolean z11) {
        this.e = mediaDataController;
        this.f12069b = z10;
        this.f12071f = tL_messages_stickerSet;
        this.f12070c = i10;
        this.h = str;
        this.d = z11;
    }

    public u0(a6 a6Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        this.e = a6Var;
        this.f12071f = file;
        this.f12070c = i10;
        this.f12069b = z10;
        this.h = document;
        this.d = z11;
    }
}
