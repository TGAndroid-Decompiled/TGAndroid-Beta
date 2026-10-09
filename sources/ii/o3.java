package ii;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class o3 {
    public final int f12604a;
    public final int f12605b;
    public final int f12606c;
    public final int d;
    public final x3 f12607e;

    public o3(x3 x3Var, int i10, int i11, int i12, int i13) {
        this.f12607e = x3Var;
        this.f12604a = i10;
        this.f12605b = i11;
        this.f12606c = i12;
        this.d = i13;
    }

    public final TL_iv.RichMessage a() {
        int i10;
        TL_iv.PageBlock M1;
        x3 x3Var = this.f12607e;
        ArrayList arrayList = x3Var.j3;
        int i11 = this.f12604a;
        a aVar = (a) arrayList.get(i11);
        ArrayList arrayList2 = x3Var.j3;
        int i12 = this.f12605b;
        a aVar2 = (a) arrayList2.get(i12);
        TL_iv.PageBlock pageBlock = aVar.f12234b;
        TL_iv.PageBlock pageBlock2 = aVar2.f12234b;
        int i13 = this.d;
        if (i11 == i12) {
            i10 = i13;
        } else {
            i10 = -1;
        }
        TL_iv.PageBlock M12 = x3.M1(x3Var, aVar, this.f12606c, i10);
        if (i11 == i12) {
            M1 = null;
        } else {
            M1 = x3.M1(x3Var, aVar2, 0, i13);
        }
        if (M12 != null) {
            aVar.f12234b = M12;
        }
        if (M1 != null) {
            aVar2.f12234b = M1;
        }
        try {
            ArrayList<TL_iv.PageBlock> Z2 = x3Var.Z2(i11, i12 + 1, 0, false);
            ArrayList<TLRPC.Photo> B2 = x3Var.B2(i11, i12);
            ArrayList<TLRPC.Document> A2 = x3Var.A2(i11, i12);
            aVar.f12234b = pageBlock;
            aVar2.f12234b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = Z2;
            richMessage.photos = B2;
            richMessage.documents = A2;
            return richMessage;
        } catch (Throwable th2) {
            aVar.f12234b = pageBlock;
            aVar2.f12234b = pageBlock2;
            throw th2;
        }
    }
}
