package of;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.y5;
public final class r0 implements Runnable {
    public final int f19482a = 0;
    public final boolean f19483b;
    public final int f19484c;
    public final boolean d;
    public final Object f19485e;
    public final Object f19486f;
    public final Object h;

    public r0(f1 f1Var, CharSequence charSequence, int i9, ArrayList arrayList, boolean z10, boolean z11) {
        this.f19485e = f1Var;
        this.f19486f = charSequence;
        this.f19484c = i9;
        this.h = arrayList;
        this.f19483b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f19482a) {
            case 0:
                boolean z10 = this.f19483b;
                boolean z11 = this.d;
                ((f1) this.f19485e).U((CharSequence) this.f19486f, this.f19484c, (ArrayList) this.h, z10, z11);
                return;
            case 1:
                boolean z12 = this.d;
                ((MediaDataController) this.f19485e).lambda$processLoadedDiceStickers$89(this.f19483b, (TLRPC.TL_messages_stickerSet) this.f19486f, this.f19484c, (String) this.h, z12);
                return;
            default:
                boolean z13 = this.d;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(f6.k1((y5) this.f19485e, (File) this.f19486f, this.f19484c, this.f19483b, (TLRPC.Document) this.h, z13), 15));
                return;
        }
    }

    public r0(MediaDataController mediaDataController, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i9, String str, boolean z11) {
        this.f19485e = mediaDataController;
        this.f19483b = z10;
        this.f19486f = tL_messages_stickerSet;
        this.f19484c = i9;
        this.h = str;
        this.d = z11;
    }

    public r0(y5 y5Var, File file, int i9, boolean z10, TLRPC.Document document, boolean z11) {
        this.f19485e = y5Var;
        this.f19486f = file;
        this.f19484c = i9;
        this.f19483b = z10;
        this.h = document;
        this.d = z11;
    }
}
