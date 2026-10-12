package hg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.z5;
public final class u0 implements Runnable {
    public final int f10758a = 0;
    public final boolean f10759b;
    public final int f10760c;
    public final boolean d;
    public final Object e;
    public final Object f10761f;
    public final Object h;

    public u0(j1 j1Var, CharSequence charSequence, int i10, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = j1Var;
        this.f10761f = charSequence;
        this.f10760c = i10;
        this.h = arrayList;
        this.f10759b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f10758a) {
            case 0:
                boolean z10 = this.f10759b;
                boolean z11 = this.d;
                ((j1) this.e).U((CharSequence) this.f10761f, this.f10760c, (ArrayList) this.h, z10, z11);
                return;
            case 1:
                boolean z12 = this.d;
                ((MediaDataController) this.e).lambda$processLoadedDiceStickers$89(this.f10759b, (TLRPC.TL_messages_stickerSet) this.f10761f, this.f10760c, (String) this.h, z12);
                return;
            default:
                boolean z13 = this.d;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(g6.l1((z5) this.e, (File) this.f10761f, this.f10760c, this.f10759b, (TLRPC.Document) this.h, z13), 15));
                return;
        }
    }

    public u0(MediaDataController mediaDataController, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, String str, boolean z11) {
        this.e = mediaDataController;
        this.f10759b = z10;
        this.f10761f = tL_messages_stickerSet;
        this.f10760c = i10;
        this.h = str;
        this.d = z11;
    }

    public u0(z5 z5Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        this.e = z5Var;
        this.f10761f = file;
        this.f10760c = i10;
        this.f10759b = z10;
        this.h = document;
        this.d = z11;
    }
}
