package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zo6 implements Runnable {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public zo6(em6 em6Var, boolean z, TLRPC.PhotoSize photoSize, k27 k27Var, TLRPC.Photo photo, boolean z2, TLRPC.Document document) {
        this.a = (byte) 3;
        this.d = em6Var;
        this.b = z;
        this.e = photoSize;
        this.f = k27Var;
        this.h = photo;
        this.c = z2;
        this.n = document;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo6.run():void");
    }

    public zo6(hq6 hq6Var, Integer num, ArrayList arrayList, boolean z, boolean z2, ArrayList[] arrayListArr, Runnable runnable) {
        this.a = (byte) 0;
        this.d = hq6Var;
        this.e = num;
        this.f = arrayList;
        this.b = z;
        this.c = z2;
        this.h = arrayListArr;
        this.n = runnable;
    }

    public zo6(xy6 xy6Var, boolean z, oy6 oy6Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z2) {
        this.a = (byte) 4;
        this.d = xy6Var;
        this.b = z;
        this.e = oy6Var;
        this.f = str;
        this.h = tL_error;
        this.n = tLObject;
        this.c = z2;
    }

    public zo6(gk7 gk7Var, Object obj, Object obj2, Object obj3, Object obj4, boolean z, boolean z2, byte b) {
        this.a = b;
        this.d = gk7Var;
        this.e = obj;
        this.f = obj2;
        this.h = obj3;
        this.n = obj4;
        this.b = z;
        this.c = z2;
    }

    public zo6(vqa vqaVar, TLObject tLObject, boolean z, TLRPC.Document document, boolean z2, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.a = (byte) 5;
        this.d = vqaVar;
        this.e = tLObject;
        this.b = z;
        this.f = document;
        this.c = z2;
        this.h = tL_error;
        this.n = savestargift;
    }
}
