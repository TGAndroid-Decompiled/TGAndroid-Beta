package defpackage;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public final class mhf {
    public static final dc6 n = new dc6("SessionFlowSummary", null);
    public static final String o = "21.4.0";
    public static long p = System.currentTimeMillis();
    public final yv2 a;
    public final List b;
    public final List c;
    public final List d;
    public final Map e;
    public final h6e f;
    public final String g;
    public final long h;
    public final long i;
    public ed1 j;
    public String k;
    public String l;
    public String m;

    public mhf(h6e h6eVar, String str) {
        ize izeVar = ize.F;
        yv2 yv2Var = new yv2((byte) 2);
        yv2Var.c = izeVar;
        this.a = yv2Var;
        this.b = DesugarCollections.synchronizedList(new ArrayList());
        this.c = DesugarCollections.synchronizedList(new ArrayList());
        this.d = DesugarCollections.synchronizedList(new ArrayList());
        this.e = DesugarCollections.synchronizedMap(new HashMap());
        this.f = h6eVar;
        this.g = str;
        this.h = System.currentTimeMillis();
        long j = p;
        p = 1 + j;
        this.i = j;
    }

    public final void a(ed1 ed1Var) {
        if (ed1Var == null) {
            b(2);
            return;
        }
        fre.e("Must be called from the main thread.");
        CastDevice castDevice = ed1Var.k;
        if (castDevice == null) {
            b(3);
            return;
        }
        this.j = ed1Var;
        String str = this.l;
        String str2 = castDevice.x;
        if (str == null) {
            this.l = str2;
            this.m = castDevice.e;
            ed1Var.e();
        } else if (!TextUtils.equals(str, str2)) {
            b(5);
        }
    }

    public final void b(int i) {
        Integer valueOf = Integer.valueOf(i - 1);
        Map map = this.e;
        a6d a6dVar = (a6d) map.get(valueOf);
        if (a6dVar == null) {
            a6d a6dVar2 = new a6d(new d00(i));
            a6dVar2.c = this.h;
            map.put(valueOf, a6dVar2);
            return;
        }
        a6dVar.d.incrementAndGet();
        a6dVar.b = System.currentTimeMillis();
    }
}
