package hg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.h6;
public final class u0 implements Runnable {
    public final int f12066a = 0;
    public final boolean f12067b;
    public final int f12068c;
    public final boolean d;
    public final Object e;
    public final Object f12069f;
    public final Object h;

    public u0(j1 j1Var, CharSequence charSequence, int i10, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = j1Var;
        this.f12069f = charSequence;
        this.f12068c = i10;
        this.h = arrayList;
        this.f12067b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f12066a) {
            case 0:
                boolean z10 = this.f12067b;
                boolean z11 = this.d;
                ((j1) this.e).U((CharSequence) this.f12069f, this.f12068c, (ArrayList) this.h, z10, z11);
                return;
            case 1:
                boolean z12 = this.d;
                ((MediaDataController) this.e).lambda$processLoadedDiceStickers$89(this.f12067b, (TLRPC.TL_messages_stickerSet) this.f12069f, this.f12068c, (String) this.h, z12);
                return;
            default:
                boolean z13 = this.d;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(h6.l1((a6) this.e, (File) this.f12069f, this.f12068c, this.f12067b, (TLRPC.Document) this.h, z13), 15));
                return;
        }
    }

    public u0(MediaDataController mediaDataController, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, String str, boolean z11) {
        this.e = mediaDataController;
        this.f12067b = z10;
        this.f12069f = tL_messages_stickerSet;
        this.f12068c = i10;
        this.h = str;
        this.d = z11;
    }

    public u0(a6 a6Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        this.e = a6Var;
        this.f12069f = file;
        this.f12068c = i10;
        this.f12067b = z10;
        this.h = document;
        this.d = z11;
    }
}
