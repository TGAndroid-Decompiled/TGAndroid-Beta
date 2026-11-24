package defpackage;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class x04 extends az3 {
    public final TLRPC.StickerSet Q1;
    public final e34 R1;

    public x04(e34 e34Var, d dVar, Context context, ylb ylbVar, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(dVar, context, ylbVar, arrayList);
        this.R1 = e34Var;
        this.Q1 = stickerSet;
    }

    @Override
    public final void F0(boolean z) {
        e34 e34Var = this.R1;
        ArrayList arrayList = e34Var.q1;
        TLRPC.StickerSet stickerSet = this.Q1;
        if (z) {
            if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
                arrayList.add(Long.valueOf(stickerSet.id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.id));
        }
        e34Var.T();
    }

    @Override
    public final void dismiss() {
        this.R1.w2 = false;
        super.dismiss();
    }
}
