package defpackage;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.o;
public final class gu implements Runnable {
    public final byte a = 2;
    public final Object b;
    public final int c;
    public final boolean d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public gu(k11 k11Var, he[] heVarArr, TLObject tLObject, int i, Uri uri, Context context, boolean z) {
        this.e = k11Var;
        this.f = heVarArr;
        this.b = tLObject;
        this.c = i;
        this.h = uri;
        this.n = context;
        this.d = z;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gu.run():void");
    }

    public gu(jn3 jn3Var, int[] iArr, String str, String str2, boolean z, int i, Runnable runnable) {
        this.e = jn3Var;
        this.b = iArr;
        this.n = str;
        this.f = str2;
        this.d = z;
        this.c = i;
        this.h = runnable;
    }

    public gu(o oVar, TLObject tLObject, int i, TLRPC.WebPage webPage, k47 k47Var, boolean z, String str) {
        this.e = oVar;
        this.b = tLObject;
        this.c = i;
        this.f = webPage;
        this.h = k47Var;
        this.d = z;
        this.n = str;
    }
}
