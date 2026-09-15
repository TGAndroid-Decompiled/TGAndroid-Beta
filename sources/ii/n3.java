package ii;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class n3 {
    public final int f11515a;
    public final int f11516b;
    public final int f11517c;
    public final int d;
    public final w3 e;

    public n3(w3 w3Var, int i10, int i11, int i12, int i13) {
        this.e = w3Var;
        this.f11515a = i10;
        this.f11516b = i11;
        this.f11517c = i12;
        this.d = i13;
    }

    public final TL_iv.RichMessage a() {
        int i10;
        TL_iv.PageBlock L1;
        w3 w3Var = this.e;
        ArrayList arrayList = w3Var.f11718l3;
        int i11 = this.f11515a;
        a aVar = (a) arrayList.get(i11);
        ArrayList arrayList2 = w3Var.f11718l3;
        int i12 = this.f11516b;
        a aVar2 = (a) arrayList2.get(i12);
        TL_iv.PageBlock pageBlock = aVar.f11201b;
        TL_iv.PageBlock pageBlock2 = aVar2.f11201b;
        int i13 = this.d;
        if (i11 == i12) {
            i10 = i13;
        } else {
            i10 = -1;
        }
        TL_iv.PageBlock L12 = w3.L1(w3Var, aVar, this.f11517c, i10);
        if (i11 == i12) {
            L1 = null;
        } else {
            L1 = w3.L1(w3Var, aVar2, 0, i13);
        }
        if (L12 != null) {
            aVar.f11201b = L12;
        }
        if (L1 != null) {
            aVar2.f11201b = L1;
        }
        try {
            ArrayList<TL_iv.PageBlock> Y2 = w3Var.Y2(i11, i12 + 1, 0, false);
            ArrayList<TLRPC.Photo> A2 = w3Var.A2(i11, i12);
            ArrayList<TLRPC.Document> z22 = w3Var.z2(i11, i12);
            aVar.f11201b = pageBlock;
            aVar2.f11201b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = Y2;
            richMessage.photos = A2;
            richMessage.documents = z22;
            return richMessage;
        } catch (Throwable th2) {
            aVar.f11201b = pageBlock;
            aVar2.f11201b = pageBlock2;
            throw th2;
        }
    }
}
