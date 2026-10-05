package ii;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class o3 {
    public final int f12557a;
    public final int f12558b;
    public final int f12559c;
    public final int d;
    public final x3 f12560e;

    public o3(x3 x3Var, int i10, int i11, int i12, int i13) {
        this.f12560e = x3Var;
        this.f12557a = i10;
        this.f12558b = i11;
        this.f12559c = i12;
        this.d = i13;
    }

    public final TL_iv.RichMessage a() {
        int i10;
        TL_iv.PageBlock M1;
        x3 x3Var = this.f12560e;
        ArrayList arrayList = x3Var.f12778s3;
        int i11 = this.f12557a;
        a aVar = (a) arrayList.get(i11);
        ArrayList arrayList2 = x3Var.f12778s3;
        int i12 = this.f12558b;
        a aVar2 = (a) arrayList2.get(i12);
        TL_iv.PageBlock pageBlock = aVar.f12187b;
        TL_iv.PageBlock pageBlock2 = aVar2.f12187b;
        int i13 = this.d;
        if (i11 == i12) {
            i10 = i13;
        } else {
            i10 = -1;
        }
        TL_iv.PageBlock M12 = x3.M1(x3Var, aVar, this.f12559c, i10);
        if (i11 == i12) {
            M1 = null;
        } else {
            M1 = x3.M1(x3Var, aVar2, 0, i13);
        }
        if (M12 != null) {
            aVar.f12187b = M12;
        }
        if (M1 != null) {
            aVar2.f12187b = M1;
        }
        try {
            ArrayList<TL_iv.PageBlock> Z2 = x3Var.Z2(i11, i12 + 1, 0, false);
            ArrayList<TLRPC.Photo> B2 = x3Var.B2(i11, i12);
            ArrayList<TLRPC.Document> A2 = x3Var.A2(i11, i12);
            aVar.f12187b = pageBlock;
            aVar2.f12187b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = Z2;
            richMessage.photos = B2;
            richMessage.documents = A2;
            return richMessage;
        } catch (Throwable th2) {
            aVar.f12187b = pageBlock;
            aVar2.f12187b = pageBlock2;
            throw th2;
        }
    }
}
