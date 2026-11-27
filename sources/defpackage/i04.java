package defpackage;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class i04 extends ly3 {
    public final TLRPC.StickerSet Q1;
    public final o24 R1;

    public i04(o24 o24Var, e eVar, Context context, vnb vnbVar, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(eVar, context, vnbVar, arrayList);
        this.R1 = o24Var;
        this.Q1 = stickerSet;
    }

    @Override
    public final void G0(boolean z) {
        o24 o24Var = this.R1;
        ArrayList arrayList = o24Var.q1;
        TLRPC.StickerSet stickerSet = this.Q1;
        if (z) {
            if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
                arrayList.add(Long.valueOf(stickerSet.id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.id));
        }
        o24Var.T();
    }

    @Override
    public final void dismiss() {
        this.R1.w2 = false;
        super.dismiss();
    }
}
