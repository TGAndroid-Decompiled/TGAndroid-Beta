package ig;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.y6;
public final class u0 implements Runnable {
    public final int f14262a = 0;
    public final boolean f14263b;
    public final int f14264c;
    public final boolean d;
    public final Object e;
    public final Object f14265f;
    public final Object h;

    public u0(j1 j1Var, CharSequence charSequence, int i10, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = j1Var;
        this.f14265f = charSequence;
        this.f14264c = i10;
        this.h = arrayList;
        this.f14263b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f14262a) {
            case 0:
                boolean z10 = this.f14263b;
                boolean z11 = this.d;
                ((j1) this.e).U((CharSequence) this.f14265f, this.f14264c, (ArrayList) this.h, z10, z11);
                return;
            case 1:
                boolean z12 = this.d;
                ((MediaDataController) this.e).lambda$processLoadedDiceStickers$89(this.f14263b, (TLRPC.TL_messages_stickerSet) this.f14265f, this.f14264c, (String) this.h, z12);
                return;
            default:
                boolean z13 = this.d;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q(y6.n1((r6) this.e, (File) this.f14265f, this.f14264c, this.f14263b, (TLRPC.Document) this.h, z13), 16));
                return;
        }
    }

    public u0(MediaDataController mediaDataController, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, String str, boolean z11) {
        this.e = mediaDataController;
        this.f14263b = z10;
        this.f14265f = tL_messages_stickerSet;
        this.f14264c = i10;
        this.h = str;
        this.d = z11;
    }

    public u0(r6 r6Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        this.e = r6Var;
        this.f14265f = file;
        this.f14264c = i10;
        this.f14263b = z10;
        this.h = document;
        this.d = z11;
    }
}
