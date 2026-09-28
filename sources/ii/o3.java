package ii;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class o3 {
    public final int f11528a;
    public final int f11529b;
    public final int f11530c;
    public final int d;
    public final x3 e;

    public o3(x3 x3Var, int i10, int i11, int i12, int i13) {
        this.e = x3Var;
        this.f11528a = i10;
        this.f11529b = i11;
        this.f11530c = i12;
        this.d = i13;
    }

    public final TL_iv.RichMessage a() {
        int i10;
        TL_iv.PageBlock L1;
        x3 x3Var = this.e;
        ArrayList arrayList = x3Var.f11735l3;
        int i11 = this.f11528a;
        a aVar = (a) arrayList.get(i11);
        ArrayList arrayList2 = x3Var.f11735l3;
        int i12 = this.f11529b;
        a aVar2 = (a) arrayList2.get(i12);
        TL_iv.PageBlock pageBlock = aVar.f11191b;
        TL_iv.PageBlock pageBlock2 = aVar2.f11191b;
        int i13 = this.d;
        if (i11 == i12) {
            i10 = i13;
        } else {
            i10 = -1;
        }
        TL_iv.PageBlock L12 = x3.L1(x3Var, aVar, this.f11530c, i10);
        if (i11 == i12) {
            L1 = null;
        } else {
            L1 = x3.L1(x3Var, aVar2, 0, i13);
        }
        if (L12 != null) {
            aVar.f11191b = L12;
        }
        if (L1 != null) {
            aVar2.f11191b = L1;
        }
        try {
            ArrayList<TL_iv.PageBlock> Y2 = x3Var.Y2(i11, i12 + 1, 0, false);
            ArrayList<TLRPC.Photo> A2 = x3Var.A2(i11, i12);
            ArrayList<TLRPC.Document> z22 = x3Var.z2(i11, i12);
            aVar.f11191b = pageBlock;
            aVar2.f11191b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = Y2;
            richMessage.photos = A2;
            richMessage.documents = z22;
            return richMessage;
        } catch (Throwable th2) {
            aVar.f11191b = pageBlock;
            aVar2.f11191b = pageBlock2;
            throw th2;
        }
    }
}
