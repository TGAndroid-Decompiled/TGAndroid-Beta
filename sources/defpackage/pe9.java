package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class pe9 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final ye9 e;

    public pe9(ye9 ye9Var, int i, int i2, int i3, int i4) {
        this.e = ye9Var;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final TL_iv.RichMessage a() {
        int i;
        TL_iv.PageBlock K4;
        ye9 ye9Var = this.e;
        ArrayList arrayList = ye9Var.t3;
        int i2 = this.a;
        lk0 lk0Var = (lk0) arrayList.get(i2);
        ArrayList arrayList2 = ye9Var.t3;
        int i3 = this.b;
        lk0 lk0Var2 = (lk0) arrayList2.get(i3);
        TL_iv.PageBlock pageBlock = lk0Var.b;
        TL_iv.PageBlock pageBlock2 = lk0Var2.b;
        int i4 = this.d;
        if (i2 == i3) {
            i = i4;
        } else {
            i = -1;
        }
        TL_iv.PageBlock K42 = ye9Var.K4(lk0Var, this.c, i);
        if (i2 == i3) {
            K4 = null;
        } else {
            K4 = ye9Var.K4(lk0Var2, 0, i4);
        }
        if (K42 != null) {
            lk0Var.b = K42;
        }
        if (K4 != null) {
            lk0Var2.b = K4;
        }
        try {
            ArrayList<TL_iv.PageBlock> U2 = ye9Var.U2(i2, i3 + 1, 0, false);
            ArrayList<TLRPC.Photo> w2 = ye9Var.w2(i2, i3);
            ArrayList<TLRPC.Document> v2 = ye9Var.v2(i2, i3);
            lk0Var.b = pageBlock;
            lk0Var2.b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = U2;
            richMessage.photos = w2;
            richMessage.documents = v2;
            return richMessage;
        } catch (Throwable th) {
            lk0Var.b = pageBlock;
            lk0Var2.b = pageBlock2;
            throw th;
        }
    }
}
