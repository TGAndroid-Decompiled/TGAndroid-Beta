package ii;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class n3 {
    public final int f11519a;
    public final int f11520b;
    public final int f11521c;
    public final int d;
    public final w3 e;

    public n3(w3 w3Var, int i10, int i11, int i12, int i13) {
        this.e = w3Var;
        this.f11519a = i10;
        this.f11520b = i11;
        this.f11521c = i12;
        this.d = i13;
    }

    public final TL_iv.RichMessage a() {
        int i10;
        TL_iv.PageBlock M1;
        w3 w3Var = this.e;
        ArrayList arrayList = w3Var.f11722l3;
        int i11 = this.f11519a;
        a aVar = (a) arrayList.get(i11);
        ArrayList arrayList2 = w3Var.f11722l3;
        int i12 = this.f11520b;
        a aVar2 = (a) arrayList2.get(i12);
        TL_iv.PageBlock pageBlock = aVar.f11205b;
        TL_iv.PageBlock pageBlock2 = aVar2.f11205b;
        int i13 = this.d;
        if (i11 == i12) {
            i10 = i13;
        } else {
            i10 = -1;
        }
        TL_iv.PageBlock M12 = w3.M1(w3Var, aVar, this.f11521c, i10);
        if (i11 == i12) {
            M1 = null;
        } else {
            M1 = w3.M1(w3Var, aVar2, 0, i13);
        }
        if (M12 != null) {
            aVar.f11205b = M12;
        }
        if (M1 != null) {
            aVar2.f11205b = M1;
        }
        try {
            ArrayList<TL_iv.PageBlock> Z2 = w3Var.Z2(i11, i12 + 1, 0, false);
            ArrayList<TLRPC.Photo> B2 = w3Var.B2(i11, i12);
            ArrayList<TLRPC.Document> A2 = w3Var.A2(i11, i12);
            aVar.f11205b = pageBlock;
            aVar2.f11205b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = Z2;
            richMessage.photos = B2;
            richMessage.documents = A2;
            return richMessage;
        } catch (Throwable th2) {
            aVar.f11205b = pageBlock;
            aVar2.f11205b = pageBlock2;
            throw th2;
        }
    }
}
