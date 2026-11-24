package defpackage;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class jn9 implements Runnable {
    public final byte a = 2;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public jn9(int i, b61 b61Var, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z, boolean z2, my0[] my0VarArr) {
        this.e = b61Var;
        this.f = my0VarArr;
        this.d = i;
        this.b = z;
        this.h = starsSubscription;
        this.c = z2;
        this.n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jn9.run():void");
    }

    public jn9(un9 un9Var, om9 om9Var, boolean z, File file, boolean z2, int i, qn9 qn9Var) {
        this.e = un9Var;
        this.f = om9Var;
        this.b = z;
        this.h = file;
        this.c = z2;
        this.d = i;
        this.n = qn9Var;
    }

    public jn9(a6a a6aVar, boolean z, TLRPC.Message message, ArrayList arrayList, boolean z2, ArrayList arrayList2, int i) {
        this.e = a6aVar;
        this.b = z;
        this.f = message;
        this.h = arrayList;
        this.c = z2;
        this.n = arrayList2;
        this.d = i;
    }
}
