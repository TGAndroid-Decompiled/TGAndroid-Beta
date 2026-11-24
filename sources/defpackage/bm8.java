package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class bm8 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public bm8(t3a t3aVar, TLRPC.TL_error tL_error, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet, TLObject tLObject) {
        this.a = (byte) 17;
        this.c = t3aVar;
        this.e = tL_error;
        this.d = tL_stickers_createStickerSet;
        this.b = tLObject;
    }

    private final void a() {
        vqa vqaVar = (vqa) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
        vqaVar.j3 = true;
        vqaVar.l2((k27) this.b, null);
        vqaVar.z2(0, true, null);
        qh4 qh4Var = vqaVar.V1;
        if (qh4Var != null) {
            qh4Var.c(true);
        }
        gta.v(vqaVar.a, false).L();
        xsa D = gta.v(vqaVar.a, false).D(y6c.h(vqaVar.a).e(), false);
        if (D != null) {
            D.l(arrayList, starGift);
        }
    }

    private final void b() {
        vqa vqaVar = (vqa) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        TLObject tLObject = (TLObject) this.b;
        TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.d;
        if (tL_error == null && (tLObject instanceof TLRPC.Updates)) {
            vqaVar.m2 = true;
            vqaVar.q3 = null;
            vqaVar.c1(inputSavedStarGift, (TLRPC.Updates) tLObject, new nna(vqaVar, (byte) 14));
            Utilities.d.c(new t7a(vqaVar, tLObject, (byte) 17));
            return;
        }
        vqaVar.j().g0(tL_error, false);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm8.run():void");
    }

    public bm8(gk7 gk7Var, TLRPC.TL_error tL_error, TLObject tLObject, Object obj, byte b) {
        this.a = b;
        this.c = gk7Var;
        this.e = tL_error;
        this.b = tLObject;
        this.d = obj;
    }

    public bm8(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public bm8(Object obj, Object obj2, TLRPC.TL_error tL_error, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.e = tL_error;
        this.d = obj3;
    }

    public bm8(TLObject tLObject, boolean[] zArr, pt0 pt0Var, TLRPC.UserFull userFull) {
        this.a = (byte) 22;
        this.b = tLObject;
        this.c = zArr;
        this.d = pt0Var;
        this.e = userFull;
    }
}
