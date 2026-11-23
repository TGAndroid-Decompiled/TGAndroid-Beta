package oi;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class j3 {
    public final int f22150a;
    public final int f22151b;
    public final int f22152c;
    public final int d;
    public final s3 f22153e;

    public j3(s3 s3Var, int i7, int i10, int i11, int i12) {
        this.f22153e = s3Var;
        this.f22150a = i7;
        this.f22151b = i10;
        this.f22152c = i11;
        this.d = i12;
    }

    public final TL_iv.RichMessage a() {
        int i7;
        TL_iv.PageBlock P1;
        s3 s3Var = this.f22153e;
        ArrayList arrayList = s3Var.f22373t3;
        int i10 = this.f22150a;
        a aVar = (a) arrayList.get(i10);
        ArrayList arrayList2 = s3Var.f22373t3;
        int i11 = this.f22151b;
        a aVar2 = (a) arrayList2.get(i11);
        TL_iv.PageBlock pageBlock = aVar.f21901b;
        TL_iv.PageBlock pageBlock2 = aVar2.f21901b;
        int i12 = this.d;
        if (i10 == i11) {
            i7 = i12;
        } else {
            i7 = -1;
        }
        TL_iv.PageBlock P12 = s3.P1(s3Var, aVar, this.f22152c, i7);
        if (i10 == i11) {
            P1 = null;
        } else {
            P1 = s3.P1(s3Var, aVar2, 0, i12);
        }
        if (P12 != null) {
            aVar.f21901b = P12;
        }
        if (P1 != null) {
            aVar2.f21901b = P1;
        }
        try {
            ArrayList<TL_iv.PageBlock> b32 = s3Var.b3(i10, i11 + 1, 0, false);
            ArrayList<TLRPC.Photo> D2 = s3Var.D2(i10, i11);
            ArrayList<TLRPC.Document> C2 = s3Var.C2(i10, i11);
            aVar.f21901b = pageBlock;
            aVar2.f21901b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = b32;
            richMessage.photos = D2;
            richMessage.documents = C2;
            return richMessage;
        } catch (Throwable th2) {
            aVar.f21901b = pageBlock;
            aVar2.f21901b = pageBlock2;
            throw th2;
        }
    }
}
