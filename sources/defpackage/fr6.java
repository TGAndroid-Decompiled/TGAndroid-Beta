package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
public final class fr6 implements Runnable {
    public final byte a = 3;
    public final boolean b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public fr6(jo6 jo6Var, boolean z, TLRPC.PhotoSize photoSize, r47 r47Var, TLRPC.Photo photo, boolean z2, TLRPC.Document document) {
        this.d = jo6Var;
        this.b = z;
        this.e = photoSize;
        this.f = r47Var;
        this.h = photo;
        this.c = z2;
        this.n = document;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr6.run():void");
    }

    public fr6(ls6 ls6Var, Integer num, ArrayList arrayList, boolean z, boolean z2, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = ls6Var;
        this.e = num;
        this.f = arrayList;
        this.b = z;
        this.c = z2;
        this.h = arrayListArr;
        this.n = runnable;
    }

    public fr6(e17 e17Var, boolean z, v07 v07Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z2) {
        this.d = e17Var;
        this.b = z;
        this.e = v07Var;
        this.f = str;
        this.h = tL_error;
        this.n = tLObject;
        this.c = z2;
    }

    public fr6(uc7 uc7Var, gc7 gc7Var, TLRPC.TL_error tL_error, e eVar, TLObject tLObject, boolean z, boolean z2) {
        this.d = uc7Var;
        this.e = gc7Var;
        this.f = tL_error;
        this.h = eVar;
        this.n = tLObject;
        this.b = z;
        this.c = z2;
    }

    public fr6(wua wuaVar, TLObject tLObject, boolean z, TLRPC.Document document, boolean z2, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.d = wuaVar;
        this.e = tLObject;
        this.b = z;
        this.f = document;
        this.c = z2;
        this.h = tL_error;
        this.n = savestargift;
    }
}
