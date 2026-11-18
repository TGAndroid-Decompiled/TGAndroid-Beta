package oi;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class j3 {
    public final int f22124a;
    public final int f22125b;
    public final int f22126c;
    public final int d;
    public final s3 f22127e;

    public j3(s3 s3Var, int i7, int i10, int i11, int i12) {
        this.f22127e = s3Var;
        this.f22124a = i7;
        this.f22125b = i10;
        this.f22126c = i11;
        this.d = i12;
    }

    public final TL_iv.RichMessage a() {
        int i7;
        TL_iv.PageBlock P1;
        s3 s3Var = this.f22127e;
        ArrayList arrayList = s3Var.f22345t3;
        int i10 = this.f22124a;
        a aVar = (a) arrayList.get(i10);
        ArrayList arrayList2 = s3Var.f22345t3;
        int i11 = this.f22125b;
        a aVar2 = (a) arrayList2.get(i11);
        TL_iv.PageBlock pageBlock = aVar.f21910b;
        TL_iv.PageBlock pageBlock2 = aVar2.f21910b;
        int i12 = this.d;
        if (i10 == i11) {
            i7 = i12;
        } else {
            i7 = -1;
        }
        TL_iv.PageBlock P12 = s3.P1(s3Var, aVar, this.f22126c, i7);
        if (i10 == i11) {
            P1 = null;
        } else {
            P1 = s3.P1(s3Var, aVar2, 0, i12);
        }
        if (P12 != null) {
            aVar.f21910b = P12;
        }
        if (P1 != null) {
            aVar2.f21910b = P1;
        }
        try {
            ArrayList<TL_iv.PageBlock> b32 = s3Var.b3(i10, i11 + 1, 0, false);
            ArrayList<TLRPC.Photo> D2 = s3Var.D2(i10, i11);
            ArrayList<TLRPC.Document> C2 = s3Var.C2(i10, i11);
            aVar.f21910b = pageBlock;
            aVar2.f21910b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = b32;
            richMessage.photos = D2;
            richMessage.documents = C2;
            return richMessage;
        } catch (Throwable th2) {
            aVar.f21910b = pageBlock;
            aVar2.f21910b = pageBlock2;
            throw th2;
        }
    }
}
