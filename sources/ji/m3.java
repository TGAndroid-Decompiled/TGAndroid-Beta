package ji;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class m3 {
    public final int f14085a;
    public final int f14086b;
    public final int f14087c;
    public final int d;
    public final v3 f14088e;

    public m3(v3 v3Var, int i10, int i11, int i12, int i13) {
        this.f14088e = v3Var;
        this.f14085a = i10;
        this.f14086b = i11;
        this.f14087c = i12;
        this.d = i13;
    }

    public final TL_iv.RichMessage a() {
        int i10;
        TL_iv.PageBlock K1;
        v3 v3Var = this.f14088e;
        ArrayList arrayList = v3Var.f14282l3;
        int i11 = this.f14085a;
        a aVar = (a) arrayList.get(i11);
        ArrayList arrayList2 = v3Var.f14282l3;
        int i12 = this.f14086b;
        a aVar2 = (a) arrayList2.get(i12);
        TL_iv.PageBlock pageBlock = aVar.f13758b;
        TL_iv.PageBlock pageBlock2 = aVar2.f13758b;
        int i13 = this.d;
        if (i11 == i12) {
            i10 = i13;
        } else {
            i10 = -1;
        }
        TL_iv.PageBlock K12 = v3.K1(v3Var, aVar, this.f14087c, i10);
        if (i11 == i12) {
            K1 = null;
        } else {
            K1 = v3.K1(v3Var, aVar2, 0, i13);
        }
        if (K12 != null) {
            aVar.f13758b = K12;
        }
        if (K1 != null) {
            aVar2.f13758b = K1;
        }
        try {
            ArrayList<TL_iv.PageBlock> X2 = v3Var.X2(i11, i12 + 1, 0, false);
            ArrayList<TLRPC.Photo> z22 = v3Var.z2(i11, i12);
            ArrayList<TLRPC.Document> y22 = v3Var.y2(i11, i12);
            aVar.f13758b = pageBlock;
            aVar2.f13758b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = X2;
            richMessage.photos = z22;
            richMessage.documents = y22;
            return richMessage;
        } catch (Throwable th2) {
            aVar.f13758b = pageBlock;
            aVar2.f13758b = pageBlock2;
            throw th2;
        }
    }
}
