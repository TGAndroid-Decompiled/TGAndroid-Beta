package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class e9 implements Runnable {
    public final int f20105a = 0;
    public final int f20106b;
    public final boolean f20107c;
    public final boolean d;
    public final Object f20108e;
    public final Object f20109f;
    public final Object h;

    public e9(MediaDataController mediaDataController, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, String str, boolean z11) {
        this.f20108e = mediaDataController;
        this.f20107c = z10;
        this.f20109f = tL_messages_stickerSet;
        this.f20106b = i10;
        this.h = str;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f20105a) {
            case 0:
                boolean z10 = this.d;
                ((MediaDataController) this.f20108e).lambda$processLoadedDiceStickers$89(this.f20107c, (TLRPC.TL_messages_stickerSet) this.f20109f, this.f20106b, (String) this.h, z10);
                return;
            case 1:
                boolean z11 = this.d;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q(org.telegram.ui.ActionBar.g6.k1((org.telegram.ui.ActionBar.z5) this.f20108e, (File) this.f20109f, this.f20106b, this.f20107c, (TLRPC.Document) this.h, z11), 15));
                return;
            default:
                boolean z12 = this.f20107c;
                boolean z13 = this.d;
                ((rf.v0) this.f20108e).U((CharSequence) this.f20109f, this.f20106b, (ArrayList) this.h, z12, z13);
                return;
        }
    }

    public e9(org.telegram.ui.ActionBar.z5 z5Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        this.f20108e = z5Var;
        this.f20109f = file;
        this.f20106b = i10;
        this.f20107c = z10;
        this.h = document;
        this.d = z11;
    }

    public e9(rf.v0 v0Var, CharSequence charSequence, int i10, ArrayList arrayList, boolean z10, boolean z11) {
        this.f20108e = v0Var;
        this.f20109f = charSequence;
        this.f20106b = i10;
        this.h = arrayList;
        this.f20107c = z10;
        this.d = z11;
    }
}
