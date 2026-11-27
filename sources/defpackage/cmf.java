package defpackage;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public final class cmf {
    public static final he6 n = new he6("SessionFlowSummary", null);
    public static final String o = "21.4.0";
    public static long p = System.currentTimeMillis();
    public final sw2 a;
    public final List b;
    public final List c;
    public final List d;
    public final Map e;
    public final wae f;
    public final String g;
    public final long h;
    public final long i;
    public md1 j;
    public String k;
    public String l;
    public String m;

    public cmf(wae waeVar, String str) {
        z3f z3fVar = z3f.F;
        sw2 sw2Var = new sw2((byte) 2);
        sw2Var.c = z3fVar;
        this.a = sw2Var;
        this.b = DesugarCollections.synchronizedList(new ArrayList());
        this.c = DesugarCollections.synchronizedList(new ArrayList());
        this.d = DesugarCollections.synchronizedList(new ArrayList());
        this.e = DesugarCollections.synchronizedMap(new HashMap());
        this.f = waeVar;
        this.g = str;
        this.h = System.currentTimeMillis();
        long j = p;
        p = 1 + j;
        this.i = j;
    }

    public final void a(md1 md1Var) {
        if (md1Var == null) {
            b(2);
            return;
        }
        xve.e("Must be called from the main thread.");
        CastDevice castDevice = md1Var.k;
        if (castDevice == null) {
            b(3);
            return;
        }
        this.j = md1Var;
        String str = this.l;
        String str2 = castDevice.x;
        if (str == null) {
            this.l = str2;
            this.m = castDevice.e;
            md1Var.e();
        } else if (!TextUtils.equals(str, str2)) {
            b(5);
        }
    }

    public final void b(int i) {
        Integer valueOf = Integer.valueOf(i - 1);
        Map map = this.e;
        tad tadVar = (tad) map.get(valueOf);
        if (tadVar == null) {
            tad tadVar2 = new tad(new e00(i));
            tadVar2.c = this.h;
            map.put(valueOf, tadVar2);
            return;
        }
        tadVar.d.incrementAndGet();
        tadVar.b = System.currentTimeMillis();
    }
}
