package defpackage;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class vo9 implements Runnable {
    public final byte a = 2;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public vo9(int i, c51 c51Var, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z, boolean z2, nx0[] nx0VarArr) {
        this.e = c51Var;
        this.f = nx0VarArr;
        this.d = i;
        this.b = z;
        this.h = starsSubscription;
        this.c = z2;
        this.n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vo9.run():void");
    }

    public vo9(jp9 jp9Var, bo9 bo9Var, boolean z, File file, boolean z2, int i, fp9 fp9Var) {
        this.e = jp9Var;
        this.f = bo9Var;
        this.b = z;
        this.h = file;
        this.c = z2;
        this.d = i;
        this.n = fp9Var;
    }

    public vo9(r7a r7aVar, boolean z, TLRPC.Message message, ArrayList arrayList, boolean z2, ArrayList arrayList2, int i) {
        this.e = r7aVar;
        this.b = z;
        this.f = message;
        this.h = arrayList;
        this.c = z2;
        this.n = arrayList2;
        this.d = i;
    }
}
