package ii;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class o3 {
    public final int f11542a;
    public final int f11543b;
    public final int f11544c;
    public final int d;
    public final x3 e;

    public o3(x3 x3Var, int i10, int i11, int i12, int i13) {
        this.e = x3Var;
        this.f11542a = i10;
        this.f11543b = i11;
        this.f11544c = i12;
        this.d = i13;
    }

    public final TL_iv.RichMessage a() {
        int i10;
        TL_iv.PageBlock N1;
        x3 x3Var = this.e;
        ArrayList arrayList = x3Var.f11756s3;
        int i11 = this.f11542a;
        a aVar = (a) arrayList.get(i11);
        ArrayList arrayList2 = x3Var.f11756s3;
        int i12 = this.f11543b;
        a aVar2 = (a) arrayList2.get(i12);
        TL_iv.PageBlock pageBlock = aVar.f11205b;
        TL_iv.PageBlock pageBlock2 = aVar2.f11205b;
        int i13 = this.d;
        if (i11 == i12) {
            i10 = i13;
        } else {
            i10 = -1;
        }
        TL_iv.PageBlock N12 = x3.N1(x3Var, aVar, this.f11544c, i10);
        if (i11 == i12) {
            N1 = null;
        } else {
            N1 = x3.N1(x3Var, aVar2, 0, i13);
        }
        if (N12 != null) {
            aVar.f11205b = N12;
        }
        if (N1 != null) {
            aVar2.f11205b = N1;
        }
        try {
            ArrayList<TL_iv.PageBlock> a32 = x3Var.a3(i11, i12 + 1, 0, false);
            ArrayList<TLRPC.Photo> C2 = x3Var.C2(i11, i12);
            ArrayList<TLRPC.Document> B2 = x3Var.B2(i11, i12);
            aVar.f11205b = pageBlock;
            aVar2.f11205b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = a32;
            richMessage.photos = C2;
            richMessage.documents = B2;
            return richMessage;
        } catch (Throwable th2) {
            aVar.f11205b = pageBlock;
            aVar2.f11205b = pageBlock2;
            throw th2;
        }
    }
}
