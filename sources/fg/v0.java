package fg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.j6;
public final class v0 implements Runnable {
    public final int f8235a = 0;
    public final boolean f8236b;
    public final int f8237c;
    public final boolean d;
    public final Object e;
    public final Object f8238f;
    public final Object h;

    public v0(l1 l1Var, CharSequence charSequence, int i10, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = l1Var;
        this.f8238f = charSequence;
        this.f8237c = i10;
        this.h = arrayList;
        this.f8236b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f8235a) {
            case 0:
                boolean z10 = this.f8236b;
                boolean z11 = this.d;
                ((l1) this.e).U((CharSequence) this.f8238f, this.f8237c, (ArrayList) this.h, z10, z11);
                return;
            case 1:
                boolean z12 = this.d;
                ((MediaDataController) this.e).lambda$processLoadedDiceStickers$89(this.f8236b, (TLRPC.TL_messages_stickerSet) this.f8238f, this.f8237c, (String) this.h, z12);
                return;
            default:
                boolean z13 = this.d;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q(j6.k1((c6) this.e, (File) this.f8238f, this.f8237c, this.f8236b, (TLRPC.Document) this.h, z13), 15));
                return;
        }
    }

    public v0(MediaDataController mediaDataController, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, String str, boolean z11) {
        this.e = mediaDataController;
        this.f8236b = z10;
        this.f8238f = tL_messages_stickerSet;
        this.f8237c = i10;
        this.h = str;
        this.d = z11;
    }

    public v0(c6 c6Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        this.e = c6Var;
        this.f8238f = file;
        this.f8237c = i10;
        this.f8236b = z10;
        this.h = document;
        this.d = z11;
    }
}
