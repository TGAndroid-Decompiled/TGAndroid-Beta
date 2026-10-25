package li;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class m3 {
    public final int f17362a;
    public final int f17363b;
    public final int f17364c;
    public final int d;
    public final v3 e;

    public m3(v3 v3Var, int i10, int i11, int i12, int i13) {
        this.e = v3Var;
        this.f17362a = i10;
        this.f17363b = i11;
        this.f17364c = i12;
        this.d = i13;
    }

    public final TL_iv.RichMessage a() {
        int i10;
        TL_iv.PageBlock R1;
        v3 v3Var = this.e;
        ArrayList arrayList = v3Var.f17565t3;
        int i11 = this.f17362a;
        a aVar = (a) arrayList.get(i11);
        ArrayList arrayList2 = v3Var.f17565t3;
        int i12 = this.f17363b;
        a aVar2 = (a) arrayList2.get(i12);
        TL_iv.PageBlock pageBlock = aVar.f17054b;
        TL_iv.PageBlock pageBlock2 = aVar2.f17054b;
        int i13 = this.d;
        if (i11 == i12) {
            i10 = i13;
        } else {
            i10 = -1;
        }
        TL_iv.PageBlock R12 = v3.R1(v3Var, aVar, this.f17364c, i10);
        if (i11 == i12) {
            R1 = null;
        } else {
            R1 = v3.R1(v3Var, aVar2, 0, i13);
        }
        if (R12 != null) {
            aVar.f17054b = R12;
        }
        if (R1 != null) {
            aVar2.f17054b = R1;
        }
        try {
            ArrayList<TL_iv.PageBlock> e32 = v3Var.e3(i11, i12 + 1, 0, false);
            ArrayList<TLRPC.Photo> G2 = v3Var.G2(i11, i12);
            ArrayList<TLRPC.Document> F2 = v3Var.F2(i11, i12);
            aVar.f17054b = pageBlock;
            aVar2.f17054b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = e32;
            richMessage.photos = G2;
            richMessage.documents = F2;
            return richMessage;
        } catch (Throwable th2) {
            aVar.f17054b = pageBlock;
            aVar2.f17054b = pageBlock2;
            throw th2;
        }
    }
}
