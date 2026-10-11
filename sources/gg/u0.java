package gg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.z5;
public final class u0 implements Runnable {
    public final int f10824a = 0;
    public final boolean f10825b;
    public final int f10826c;
    public final boolean d;
    public final Object f10827e;
    public final Object f10828f;
    public final Object h;

    public u0(j1 j1Var, CharSequence charSequence, int i10, ArrayList arrayList, boolean z10, boolean z11) {
        this.f10827e = j1Var;
        this.f10828f = charSequence;
        this.f10826c = i10;
        this.h = arrayList;
        this.f10825b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f10824a) {
            case 0:
                boolean z10 = this.f10825b;
                boolean z11 = this.d;
                ((j1) this.f10827e).U((CharSequence) this.f10828f, this.f10826c, (ArrayList) this.h, z10, z11);
                return;
            case 1:
                boolean z12 = this.d;
                ((MediaDataController) this.f10827e).lambda$processLoadedDiceStickers$89(this.f10825b, (TLRPC.TL_messages_stickerSet) this.f10828f, this.f10826c, (String) this.h, z12);
                return;
            default:
                boolean z13 = this.d;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(h6.l1((z5) this.f10827e, (File) this.f10828f, this.f10826c, this.f10825b, (TLRPC.Document) this.h, z13), 15));
                return;
        }
    }

    public u0(MediaDataController mediaDataController, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, String str, boolean z11) {
        this.f10827e = mediaDataController;
        this.f10825b = z10;
        this.f10828f = tL_messages_stickerSet;
        this.f10826c = i10;
        this.h = str;
        this.d = z11;
    }

    public u0(z5 z5Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        this.f10827e = z5Var;
        this.f10828f = file;
        this.f10826c = i10;
        this.f10825b = z10;
        this.h = document;
        this.d = z11;
    }
}
