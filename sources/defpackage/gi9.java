package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class gi9 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final pi9 e;

    public gi9(pi9 pi9Var, int i, int i2, int i3, int i4) {
        this.e = pi9Var;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final TL_iv.RichMessage a() {
        int i;
        TL_iv.PageBlock L4;
        pi9 pi9Var = this.e;
        ArrayList arrayList = pi9Var.t3;
        int i2 = this.a;
        mk0 mk0Var = (mk0) arrayList.get(i2);
        ArrayList arrayList2 = pi9Var.t3;
        int i3 = this.b;
        mk0 mk0Var2 = (mk0) arrayList2.get(i3);
        TL_iv.PageBlock pageBlock = mk0Var.b;
        TL_iv.PageBlock pageBlock2 = mk0Var2.b;
        int i4 = this.d;
        if (i2 == i3) {
            i = i4;
        } else {
            i = -1;
        }
        TL_iv.PageBlock L42 = pi9Var.L4(mk0Var, this.c, i);
        if (i2 == i3) {
            L4 = null;
        } else {
            L4 = pi9Var.L4(mk0Var2, 0, i4);
        }
        if (L42 != null) {
            mk0Var.b = L42;
        }
        if (L4 != null) {
            mk0Var2.b = L4;
        }
        try {
            ArrayList<TL_iv.PageBlock> V2 = pi9Var.V2(i2, i3 + 1, 0, false);
            ArrayList<TLRPC.Photo> x2 = pi9Var.x2(i2, i3);
            ArrayList<TLRPC.Document> w2 = pi9Var.w2(i2, i3);
            mk0Var.b = pageBlock;
            mk0Var2.b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = V2;
            richMessage.photos = x2;
            richMessage.documents = w2;
            return richMessage;
        } catch (Throwable th) {
            mk0Var.b = pageBlock;
            mk0Var2.b = pageBlock2;
            throw th;
        }
    }
}
