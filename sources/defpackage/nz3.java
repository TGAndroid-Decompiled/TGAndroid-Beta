package defpackage;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class nz3 extends qx3 {
    public final TLRPC.StickerSet Q1;
    public final t14 R1;

    public nz3(t14 t14Var, d dVar, Context context, wjb wjbVar, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(dVar, context, wjbVar, arrayList);
        this.R1 = t14Var;
        this.Q1 = stickerSet;
    }

    @Override
    public final void F0(boolean z) {
        t14 t14Var = this.R1;
        ArrayList arrayList = t14Var.q1;
        TLRPC.StickerSet stickerSet = this.Q1;
        if (z) {
            if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
                arrayList.add(Long.valueOf(stickerSet.id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.id));
        }
        t14Var.U();
    }

    @Override
    public final void dismiss() {
        this.R1.w2 = false;
        super.dismiss();
    }
}
