package bi;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class u3 {
    public final int f3382a;
    public final int f3383b;
    public final int f3384c;
    public final int d;
    public final d4 e;

    public u3(d4 d4Var, int i10, int i11, int i12, int i13) {
        this.e = d4Var;
        this.f3382a = i10;
        this.f3383b = i11;
        this.f3384c = i12;
        this.d = i13;
    }

    public final TL_iv.RichMessage a() {
        int i10;
        TL_iv.PageBlock O1;
        d4 d4Var = this.e;
        ArrayList arrayList = d4Var.f2946s3;
        int i11 = this.f3382a;
        a aVar = (a) arrayList.get(i11);
        ArrayList arrayList2 = d4Var.f2946s3;
        int i12 = this.f3383b;
        a aVar2 = (a) arrayList2.get(i12);
        TL_iv.PageBlock pageBlock = aVar.f2818b;
        TL_iv.PageBlock pageBlock2 = aVar2.f2818b;
        int i13 = this.d;
        if (i11 == i12) {
            i10 = i13;
        } else {
            i10 = -1;
        }
        TL_iv.PageBlock O12 = d4.O1(d4Var, aVar, this.f3384c, i10);
        if (i11 == i12) {
            O1 = null;
        } else {
            O1 = d4.O1(d4Var, aVar2, 0, i13);
        }
        if (O12 != null) {
            aVar.f2818b = O12;
        }
        if (O1 != null) {
            aVar2.f2818b = O1;
        }
        try {
            ArrayList<TL_iv.PageBlock> b32 = d4Var.b3(i11, i12 + 1, 0, false);
            ArrayList<TLRPC.Photo> D2 = d4Var.D2(i11, i12);
            ArrayList<TLRPC.Document> C2 = d4Var.C2(i11, i12);
            aVar.f2818b = pageBlock;
            aVar2.f2818b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = b32;
            richMessage.photos = D2;
            richMessage.documents = C2;
            return richMessage;
        } catch (Throwable th2) {
            aVar.f2818b = pageBlock;
            aVar2.f2818b = pageBlock2;
            throw th2;
        }
    }
}
