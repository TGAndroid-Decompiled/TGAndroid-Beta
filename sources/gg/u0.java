package gg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.i6;
public final class u0 implements Runnable {
    public final int f10825a = 0;
    public final boolean f10826b;
    public final int f10827c;
    public final boolean d;
    public final Object f10828e;
    public final Object f10829f;
    public final Object h;

    public u0(j1 j1Var, CharSequence charSequence, int i10, ArrayList arrayList, boolean z10, boolean z11) {
        this.f10828e = j1Var;
        this.f10829f = charSequence;
        this.f10827c = i10;
        this.h = arrayList;
        this.f10826b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f10825a) {
            case 0:
                boolean z10 = this.f10826b;
                boolean z11 = this.d;
                ((j1) this.f10828e).U((CharSequence) this.f10829f, this.f10827c, (ArrayList) this.h, z10, z11);
                return;
            case 1:
                boolean z12 = this.d;
                ((MediaDataController) this.f10828e).lambda$processLoadedDiceStickers$89(this.f10826b, (TLRPC.TL_messages_stickerSet) this.f10829f, this.f10827c, (String) this.h, z12);
                return;
            default:
                boolean z13 = this.d;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q(i6.l1((b6) this.f10828e, (File) this.f10829f, this.f10827c, this.f10826b, (TLRPC.Document) this.h, z13), 15));
                return;
        }
    }

    public u0(MediaDataController mediaDataController, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, String str, boolean z11) {
        this.f10828e = mediaDataController;
        this.f10826b = z10;
        this.f10829f = tL_messages_stickerSet;
        this.f10827c = i10;
        this.h = str;
        this.d = z11;
    }

    public u0(b6 b6Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        this.f10828e = b6Var;
        this.f10829f = file;
        this.f10827c = i10;
        this.f10826b = z10;
        this.h = document;
        this.d = z11;
    }
}
