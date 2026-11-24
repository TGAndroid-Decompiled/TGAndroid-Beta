package defpackage;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class jl9 implements Runnable {
    public final byte a = 2;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public jl9(int i, u41 u41Var, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z, boolean z2, fx0[] fx0VarArr) {
        this.e = u41Var;
        this.f = fx0VarArr;
        this.d = i;
        this.b = z;
        this.h = starsSubscription;
        this.c = z2;
        this.n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jl9.run():void");
    }

    public jl9(ul9 ul9Var, nk9 nk9Var, boolean z, File file, boolean z2, int i, ql9 ql9Var) {
        this.e = ul9Var;
        this.f = nk9Var;
        this.b = z;
        this.h = file;
        this.c = z2;
        this.d = i;
        this.n = ql9Var;
    }

    public jl9(z3a z3aVar, boolean z, TLRPC.Message message, ArrayList arrayList, boolean z2, ArrayList arrayList2, int i) {
        this.e = z3aVar;
        this.b = z;
        this.f = message;
        this.h = arrayList;
        this.c = z2;
        this.n = arrayList2;
        this.d = i;
    }
}
