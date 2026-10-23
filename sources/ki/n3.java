package ki;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class n3 {
    public final int f15463a;
    public final int f15464b;
    public final int f15465c;
    public final int d;
    public final w3 e;

    public n3(w3 w3Var, int i10, int i11, int i12, int i13) {
        this.e = w3Var;
        this.f15463a = i10;
        this.f15464b = i11;
        this.f15465c = i12;
        this.d = i13;
    }

    public final TL_iv.RichMessage a() {
        int i10;
        TL_iv.PageBlock R1;
        w3 w3Var = this.e;
        ArrayList arrayList = w3Var.f15663m3;
        int i11 = this.f15463a;
        a aVar = (a) arrayList.get(i11);
        ArrayList arrayList2 = w3Var.f15663m3;
        int i12 = this.f15464b;
        a aVar2 = (a) arrayList2.get(i12);
        TL_iv.PageBlock pageBlock = aVar.f15141b;
        TL_iv.PageBlock pageBlock2 = aVar2.f15141b;
        int i13 = this.d;
        if (i11 == i12) {
            i10 = i13;
        } else {
            i10 = -1;
        }
        TL_iv.PageBlock R12 = w3.R1(w3Var, aVar, this.f15465c, i10);
        if (i11 == i12) {
            R1 = null;
        } else {
            R1 = w3.R1(w3Var, aVar2, 0, i13);
        }
        if (R12 != null) {
            aVar.f15141b = R12;
        }
        if (R1 != null) {
            aVar2.f15141b = R1;
        }
        try {
            ArrayList<TL_iv.PageBlock> e32 = w3Var.e3(i11, i12 + 1, 0, false);
            ArrayList<TLRPC.Photo> G2 = w3Var.G2(i11, i12);
            ArrayList<TLRPC.Document> F2 = w3Var.F2(i11, i12);
            aVar.f15141b = pageBlock;
            aVar2.f15141b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = e32;
            richMessage.photos = G2;
            richMessage.documents = F2;
            return richMessage;
        } catch (Throwable th2) {
            aVar.f15141b = pageBlock;
            aVar2.f15141b = pageBlock2;
            throw th2;
        }
    }
}
