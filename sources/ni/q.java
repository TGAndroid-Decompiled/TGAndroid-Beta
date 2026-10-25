package ni;

import e2.l0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k2.e0;
import m4.x0;
public final class q implements AutoCloseable {
    public final x0 f18899b;
    public final x0 f18900c;
    public long f18903r;
    public boolean f18904s;
    public b v;
    public Throwable f18905w;
    public volatile Set f18906x;
    public final Object f18898a = new Object();
    public final LinkedHashMap h = new LinkedHashMap(16, 0.75f, true);
    public final HashMap f18902n = new HashMap();
    public final int e = 256;
    public final long f18901f = 8388608;
    public final ExecutorService d = Executors.newSingleThreadExecutor(new l0(1));

    public q(x0 x0Var, x0 x0Var2) {
        this.f18899b = x0Var;
        this.f18900c = x0Var2;
    }

    public static String b(String str) {
        if (str == null) {
            return "";
        }
        String lowerCase = str.trim().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        char c10 = 65535;
        switch (lowerCase.hashCode()) {
            case 3104:
                if (lowerCase.equals("c#")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3261:
                if (lowerCase.equals("fc")) {
                    c10 = 1;
                    break;
                }
                break;
            case 96515:
                if (lowerCase.equals("c++")) {
                    c10 = 2;
                    break;
                }
                break;
            case 101379:
                if (lowerCase.equals("fif")) {
                    c10 = 3;
                    break;
                }
                break;
            case 3561037:
                if (lowerCase.equals("tl-b")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
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
        throw new UnsupportedOperationException("Method not decompiled: ni.q.a():boolean");
    }

    public final void c(o oVar, m4.c cVar) {
        m mVar = new m(oVar, cVar);
        int i10 = this.e;
        if (i10 != 0) {
            long j10 = mVar.f18893b;
            long j11 = this.f18901f;
            if (j10 <= j11) {
                LinkedHashMap linkedHashMap = this.h;
                linkedHashMap.put(oVar, mVar);
                this.f18903r += j10;
                while (true) {
                    if (linkedHashMap.size() > i10 || this.f18903r > j11) {
                        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                        this.f18903r -= ((m) entry.getValue()).f18893b;
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
        synchronized (this.f18898a) {
            try {
                if (this.f18904s) {
                    return;
                }
                this.f18904s = true;
                for (ArrayList arrayList : this.f18902n.values()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((p) obj).f18897a = null;
                    }
                }
                this.f18902n.clear();
                this.h.clear();
                this.f18903r = 0L;
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
            obj.f18897a = nVar;
            synchronized (this.f18898a) {
                try {
                    if (!this.f18904s) {
                        ArrayList arrayList = (ArrayList) this.f18902n.get(oVar);
                        if (arrayList != null) {
                            arrayList.add(obj);
                            return obj;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(obj);
                        this.f18902n.put(oVar, arrayList2);
                        this.d.execute(new e0(18, this, oVar));
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
