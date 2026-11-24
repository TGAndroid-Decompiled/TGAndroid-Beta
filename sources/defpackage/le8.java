package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;
public final class le8 {
    public static final kc q = new kc((byte) 2);
    public final Context a;
    public final je8 b;
    public final SparseArray c;
    public final boolean d;
    public final je3 e;
    public final bfb f;
    public final CopyOnWriteArraySet g;
    public final long h;
    public final ycc i;
    public ir j = new ir();
    public dfb k;
    public Pair l;
    public int m;
    public byte n;
    public long o;
    public int p;

    public le8(kn3 kn3Var) {
        long j;
        this.a = (Context) kn3Var.d;
        je8 je8Var = (je8) kn3Var.f;
        je8Var.getClass();
        this.b = je8Var;
        this.c = new SparseArray();
        ko5 ko5Var = mo5.b;
        y79 y79Var = y79.e;
        this.d = kn3Var.a;
        bfb bfbVar = (bfb) kn3Var.g;
        this.f = bfbVar;
        long j2 = kn3Var.c;
        if (j2 != -9223372036854775807L) {
            j = -j2;
        } else {
            j = -9223372036854775807L;
        }
        this.h = j;
        ycc yccVar = (ycc) kn3Var.h;
        this.i = yccVar;
        this.e = new je3((xcc) kn3Var.e, yccVar, bfbVar);
        this.g = new CopyOnWriteArraySet();
        new go4(new fo4());
        this.o = -9223372036854775807L;
        this.p = -1;
        this.n = (byte) 0;
    }
}
