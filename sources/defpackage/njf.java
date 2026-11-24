package defpackage;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public final class njf {
    public static final ce6 n = new ce6("SessionFlowSummary", null);
    public static final String o = "21.4.0";
    public static long p = System.currentTimeMillis();
    public final ix2 a;
    public final List b;
    public final List c;
    public final List d;
    public final Map e;
    public final i8e f;
    public final String g;
    public final long h;
    public final long i;
    public me1 j;
    public String k;
    public String l;
    public String m;

    public njf(i8e i8eVar, String str) {
        k1f k1fVar = k1f.F;
        ix2 ix2Var = new ix2((byte) 2);
        ix2Var.c = k1fVar;
        this.a = ix2Var;
        this.b = DesugarCollections.synchronizedList(new ArrayList());
        this.c = DesugarCollections.synchronizedList(new ArrayList());
        this.d = DesugarCollections.synchronizedList(new ArrayList());
        this.e = DesugarCollections.synchronizedMap(new HashMap());
        this.f = i8eVar;
        this.g = str;
        this.h = System.currentTimeMillis();
        long j = p;
        p = 1 + j;
        this.i = j;
    }

    public final void a(me1 me1Var) {
        if (me1Var == null) {
            b(2);
            return;
        }
        ite.e("Must be called from the main thread.");
        CastDevice castDevice = me1Var.k;
        if (castDevice == null) {
            b(3);
            return;
        }
        this.j = me1Var;
        String str = this.l;
        String str2 = castDevice.x;
        if (str == null) {
            this.l = str2;
            this.m = castDevice.e;
            me1Var.e();
        } else if (!TextUtils.equals(str, str2)) {
            b(5);
        }
    }

    public final void b(int i) {
        Integer valueOf = Integer.valueOf(i - 1);
        Map map = this.e;
        c8d c8dVar = (c8d) map.get(valueOf);
        if (c8dVar == null) {
            c8d c8dVar2 = new c8d(new d10(i));
            c8dVar2.c = this.h;
            map.put(valueOf, c8dVar2);
            return;
        }
        c8dVar.d.incrementAndGet();
        c8dVar.b = System.currentTimeMillis();
    }
}
