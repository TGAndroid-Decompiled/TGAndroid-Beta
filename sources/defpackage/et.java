package defpackage;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.o;
public final class et implements Runnable {
    public final byte a = 1;
    public final Object b;
    public final int c;
    public final boolean d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public et(l01 l01Var, id[] idVarArr, TLObject tLObject, int i, Uri uri, Context context, boolean z) {
        this.e = l01Var;
        this.f = idVarArr;
        this.b = tLObject;
        this.c = i;
        this.h = uri;
        this.n = context;
        this.d = z;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et.run():void");
    }

    public et(qm3 qm3Var, int[] iArr, String str, String str2, boolean z, int i, Runnable runnable) {
        this.e = qm3Var;
        this.b = iArr;
        this.n = str;
        this.f = str2;
        this.d = z;
        this.c = i;
        this.h = runnable;
    }

    public et(o oVar, TLObject tLObject, int i, TLRPC.WebPage webPage, r47 r47Var, boolean z, String str) {
        this.e = oVar;
        this.b = tLObject;
        this.c = i;
        this.f = webPage;
        this.h = r47Var;
        this.d = z;
        this.n = str;
    }
}
