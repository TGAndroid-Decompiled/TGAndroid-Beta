package hi;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class q3 {
    public final int f9799a;
    public final int f9800b;
    public final int f9801c;
    public final int d;
    public final z3 e;

    public q3(z3 z3Var, int i10, int i11, int i12, int i13) {
        this.e = z3Var;
        this.f9799a = i10;
        this.f9800b = i11;
        this.f9801c = i12;
        this.d = i13;
    }

    public final TL_iv.RichMessage a() {
        int i10;
        TL_iv.PageBlock K1;
        z3 z3Var = this.e;
        ArrayList arrayList = z3Var.f10008l3;
        int i11 = this.f9799a;
        a aVar = (a) arrayList.get(i11);
        ArrayList arrayList2 = z3Var.f10008l3;
        int i12 = this.f9800b;
        a aVar2 = (a) arrayList2.get(i12);
        TL_iv.PageBlock pageBlock = aVar.f9421b;
        TL_iv.PageBlock pageBlock2 = aVar2.f9421b;
        int i13 = this.d;
        if (i11 == i12) {
            i10 = i13;
        } else {
            i10 = -1;
        }
        TL_iv.PageBlock K12 = z3.K1(z3Var, aVar, this.f9801c, i10);
        if (i11 == i12) {
            K1 = null;
        } else {
            K1 = z3.K1(z3Var, aVar2, 0, i13);
        }
        if (K12 != null) {
            aVar.f9421b = K12;
        }
        if (K1 != null) {
            aVar2.f9421b = K1;
        }
        try {
            ArrayList<TL_iv.PageBlock> X2 = z3Var.X2(i11, i12 + 1, 0, false);
            ArrayList<TLRPC.Photo> z22 = z3Var.z2(i11, i12);
            ArrayList<TLRPC.Document> y22 = z3Var.y2(i11, i12);
            aVar.f9421b = pageBlock;
            aVar2.f9421b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = X2;
            richMessage.photos = z22;
            richMessage.documents = y22;
            return richMessage;
        } catch (Throwable th2) {
            aVar.f9421b = pageBlock;
            aVar2.f9421b = pageBlock2;
            throw th2;
        }
    }
}
