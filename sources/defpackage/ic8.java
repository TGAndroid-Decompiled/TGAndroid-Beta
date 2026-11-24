package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;
public final class ic8 {
    public static final hc q = new hc((byte) 2);
    public final Context a;
    public final gc8 b;
    public final SparseArray c;
    public final boolean d;
    public final xc3 e;
    public final adb f;
    public final CopyOnWriteArraySet g;
    public final long h;
    public final vac i;
    public iq j = new iq();
    public cdb k;
    public Pair l;
    public int m;
    public byte n;
    public long o;
    public int p;

    public ic8(zl3 zl3Var) {
        long j;
        this.a = (Context) zl3Var.d;
        gc8 gc8Var = (gc8) zl3Var.f;
        gc8Var.getClass();
        this.b = gc8Var;
        this.c = new SparseArray();
        km5 km5Var = mm5.b;
        w59 w59Var = w59.e;
        this.d = zl3Var.a;
        adb adbVar = (adb) zl3Var.g;
        this.f = adbVar;
        long j2 = zl3Var.c;
        if (j2 != -9223372036854775807L) {
            j = -j2;
        } else {
            j = -9223372036854775807L;
        }
        this.h = j;
        vac vacVar = (vac) zl3Var.h;
        this.i = vacVar;
        this.e = new xc3((uac) zl3Var.e, vacVar, adbVar);
        this.g = new CopyOnWriteArraySet();
        new fm4(new em4());
        this.o = -9223372036854775807L;
        this.p = -1;
        this.n = (byte) 0;
    }
}
