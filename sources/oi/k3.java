package oi;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class k3 {
    public final int f22208a;
    public final int f22209b;
    public final int f22210c;
    public final int d;
    public final t3 f22211e;

    public k3(t3 t3Var, int i7, int i10, int i11, int i12) {
        this.f22211e = t3Var;
        this.f22208a = i7;
        this.f22209b = i10;
        this.f22210c = i11;
        this.d = i12;
    }

    public final TL_iv.RichMessage a() {
        int i7;
        TL_iv.PageBlock P1;
        t3 t3Var = this.f22211e;
        ArrayList arrayList = t3Var.f22433t3;
        int i10 = this.f22208a;
        a aVar = (a) arrayList.get(i10);
        ArrayList arrayList2 = t3Var.f22433t3;
        int i11 = this.f22209b;
        a aVar2 = (a) arrayList2.get(i11);
        TL_iv.PageBlock pageBlock = aVar.f21932b;
        TL_iv.PageBlock pageBlock2 = aVar2.f21932b;
        int i12 = this.d;
        if (i10 == i11) {
            i7 = i12;
        } else {
            i7 = -1;
        }
        TL_iv.PageBlock P12 = t3.P1(t3Var, aVar, this.f22210c, i7);
        if (i10 == i11) {
            P1 = null;
        } else {
            P1 = t3.P1(t3Var, aVar2, 0, i12);
        }
        if (P12 != null) {
            aVar.f21932b = P12;
        }
        if (P1 != null) {
            aVar2.f21932b = P1;
        }
        try {
            ArrayList<TL_iv.PageBlock> b32 = t3Var.b3(i10, i11 + 1, 0, false);
            ArrayList<TLRPC.Photo> D2 = t3Var.D2(i10, i11);
            ArrayList<TLRPC.Document> C2 = t3Var.C2(i10, i11);
            aVar.f21932b = pageBlock;
            aVar2.f21932b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = b32;
            richMessage.photos = D2;
            richMessage.documents = C2;
            return richMessage;
        } catch (Throwable th2) {
            aVar.f21932b = pageBlock;
            aVar2.f21932b = pageBlock2;
            throw th2;
        }
    }
}
