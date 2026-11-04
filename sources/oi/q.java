package oi;

import g2.m0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import m2.s;
import mi.h0;
import o4.v0;
public final class q implements AutoCloseable {
    public final v0 f21162b;
    public final v0 f21163c;
    public long f21167r;
    public boolean f21168s;
    public b f21169w;
    public Throwable f21170x;
    public volatile Set f21171y;
    public final Object f21161a = new Object();
    public final LinkedHashMap h = new LinkedHashMap(16, 0.75f, true);
    public final HashMap f21166n = new HashMap();
    public final int f21164e = 256;
    public final long f21165f = 8388608;
    public final ExecutorService d = Executors.newSingleThreadExecutor(new m0(1));

    public q(v0 v0Var, v0 v0Var2) {
        this.f21162b = v0Var;
        this.f21163c = v0Var2;
    }

    public static String b(String str) {
        if (str == null) {
            return "";
        }
        String lowerCase = str.trim().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        char c2 = 65535;
        switch (lowerCase.hashCode()) {
            case 3104:
                if (lowerCase.equals("c#")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3261:
                if (lowerCase.equals("fc")) {
                    c2 = 1;
                    break;
                }
                break;
            case 96515:
                if (lowerCase.equals("c++")) {
                    c2 = 2;
                    break;
                }
                break;
            case 101379:
                if (lowerCase.equals("fif")) {
                    c2 = 3;
                    break;
                }
                break;
            case 3561037:
                if (lowerCase.equals("tl-b")) {
                    c2 = 4;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return "csharp";
            case 1:
                return "func";
            case 2:
                return "cpp";
            case 3:
                return "fift";
            case 4:
                return "tlb";
            default:
                return lowerCase;
        }
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: oi.q.a():boolean");
    }

    public final void c(o oVar, h0 h0Var) {
        m mVar = new m(oVar, h0Var);
        int i3 = this.f21164e;
        if (i3 != 0) {
            long j10 = mVar.f21156b;
            long j11 = this.f21165f;
            if (j10 <= j11) {
                LinkedHashMap linkedHashMap = this.h;
                linkedHashMap.put(oVar, mVar);
                this.f21167r += j10;
                while (true) {
                    if (linkedHashMap.size() > i3 || this.f21167r > j11) {
                        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                        this.f21167r -= ((m) entry.getValue()).f21156b;
                        linkedHashMap.remove(entry.getKey());
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void close() {
        synchronized (this.f21161a) {
            try {
                if (this.f21168s) {
                    return;
                }
                this.f21168s = true;
                for (ArrayList arrayList : this.f21166n.values()) {
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        ((p) obj).f21160a = null;
                    }
                }
                this.f21166n.clear();
                this.h.clear();
                this.f21167r = 0L;
                this.d.execute(new l(this, 0));
                this.d.shutdown();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final p d(String str, String str2, n nVar) {
        if (str != null) {
            o oVar = new o(str, b(str2));
            ?? obj = new Object();
            obj.f21160a = nVar;
            synchronized (this.f21161a) {
                try {
                    if (!this.f21168s) {
                        ArrayList arrayList = (ArrayList) this.f21166n.get(oVar);
                        if (arrayList != null) {
                            arrayList.add(obj);
                            return obj;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(obj);
                        this.f21166n.put(oVar, arrayList2);
                        this.d.execute(new s(19, this, oVar));
                        return obj;
                    }
                    throw new IllegalStateException("Service is closed");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw null;
    }
}
