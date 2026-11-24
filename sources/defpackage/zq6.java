package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
public final class zq6 implements Runnable {
    public final byte a = 2;
    public final boolean b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public zq6(fo6 fo6Var, boolean z, TLRPC.PhotoSize photoSize, k47 k47Var, TLRPC.Photo photo, boolean z2, TLRPC.Document document) {
        this.d = fo6Var;
        this.b = z;
        this.e = photoSize;
        this.f = k47Var;
        this.h = photo;
        this.c = z2;
        this.n = document;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zq6.run():void");
    }

    public zq6(hs6 hs6Var, Integer num, ArrayList arrayList, boolean z, boolean z2, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = hs6Var;
        this.e = num;
        this.f = arrayList;
        this.b = z;
        this.c = z2;
        this.h = arrayListArr;
        this.n = runnable;
    }

    public zq6(x07 x07Var, boolean z, o07 o07Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z2) {
        this.d = x07Var;
        this.b = z;
        this.e = o07Var;
        this.f = str;
        this.h = tL_error;
        this.n = tLObject;
        this.c = z2;
    }

    public zq6(oc7 oc7Var, ac7 ac7Var, TLRPC.TL_error tL_error, d dVar, TLObject tLObject, boolean z, boolean z2) {
        this.d = oc7Var;
        this.e = ac7Var;
        this.f = tL_error;
        this.h = dVar;
        this.n = tLObject;
        this.b = z;
        this.c = z2;
    }

    public zq6(wsa wsaVar, TLObject tLObject, boolean z, TLRPC.Document document, boolean z2, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.d = wsaVar;
        this.e = tLObject;
        this.b = z;
        this.f = document;
        this.c = z2;
        this.h = tL_error;
        this.n = savestargift;
    }
}
