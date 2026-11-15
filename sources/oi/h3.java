package oi;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class h3 {
    public final int f21727a;
    public final int f21728b;
    public final int f21729c;
    public final int d;
    public final q3 f21730e;

    public h3(q3 q3Var, int i7, int i10, int i11, int i12) {
        this.f21730e = q3Var;
        this.f21727a = i7;
        this.f21728b = i10;
        this.f21729c = i11;
        this.d = i12;
    }

    public final TL_iv.RichMessage a() {
        int i7;
        TL_iv.PageBlock P1;
        q3 q3Var = this.f21730e;
        ArrayList arrayList = q3Var.f21939t3;
        int i10 = this.f21727a;
        a aVar = (a) arrayList.get(i10);
        ArrayList arrayList2 = q3Var.f21939t3;
        int i11 = this.f21728b;
        a aVar2 = (a) arrayList2.get(i11);
        TL_iv.PageBlock pageBlock = aVar.f21544b;
        TL_iv.PageBlock pageBlock2 = aVar2.f21544b;
        int i12 = this.d;
        if (i10 == i11) {
            i7 = i12;
        } else {
            i7 = -1;
        }
        TL_iv.PageBlock P12 = q3.P1(q3Var, aVar, this.f21729c, i7);
        if (i10 == i11) {
            P1 = null;
        } else {
            P1 = q3.P1(q3Var, aVar2, 0, i12);
        }
        if (P12 != null) {
            aVar.f21544b = P12;
        }
        if (P1 != null) {
            aVar2.f21544b = P1;
        }
        try {
            ArrayList<TL_iv.PageBlock> b32 = q3Var.b3(i10, i11 + 1, 0, false);
            ArrayList<TLRPC.Photo> D2 = q3Var.D2(i10, i11);
            ArrayList<TLRPC.Document> C2 = q3Var.C2(i10, i11);
            aVar.f21544b = pageBlock;
            aVar2.f21544b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = b32;
            richMessage.photos = D2;
            richMessage.documents = C2;
            return richMessage;
        } catch (Throwable th2) {
            aVar.f21544b = pageBlock;
            aVar2.f21544b = pageBlock2;
            throw th2;
        }
    }
}
