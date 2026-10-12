package mi;

import e2.l0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ji.v2;
import m4.w0;
public final class q implements AutoCloseable {
    public final w0 f15880b;
    public final w0 f15881c;
    public long f15884r;
    public boolean f15885s;
    public b v;
    public Throwable f15886w;
    public volatile Set f15887x;
    public final Object f15879a = new Object();
    public final LinkedHashMap h = new LinkedHashMap(16, 0.75f, true);
    public final HashMap f15883n = new HashMap();
    public final int e = 256;
    public final long f15882f = 8388608;
    public final ExecutorService d = Executors.newSingleThreadExecutor(new l0(3));

    public q(w0 w0Var, w0 w0Var2) {
        this.f15880b = w0Var;
        this.f15881c = w0Var2;
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
        throw new UnsupportedOperationException("Method not decompiled: mi.q.a():boolean");
    }

    public final void c(o oVar, m4.c cVar) {
        m mVar = new m(oVar, cVar);
        int i10 = this.e;
        if (i10 != 0) {
            long j10 = mVar.f15874b;
            long j11 = this.f15882f;
            if (j10 <= j11) {
                LinkedHashMap linkedHashMap = this.h;
                linkedHashMap.put(oVar, mVar);
                this.f15884r += j10;
                while (true) {
                    if (linkedHashMap.size() > i10 || this.f15884r > j11) {
                        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                        this.f15884r -= ((m) entry.getValue()).f15874b;
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
        synchronized (this.f15879a) {
            try {
                if (this.f15885s) {
                    return;
                }
                this.f15885s = true;
                for (ArrayList arrayList : this.f15883n.values()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((p) obj).f15878a = null;
                    }
                }
                this.f15883n.clear();
                this.h.clear();
                this.f15884r = 0L;
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
            obj.f15878a = nVar;
            synchronized (this.f15879a) {
                try {
                    if (!this.f15885s) {
                        ArrayList arrayList = (ArrayList) this.f15883n.get(oVar);
                        if (arrayList != null) {
                            arrayList.add(obj);
                            return obj;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(obj);
                        this.f15883n.put(oVar, arrayList2);
                        this.d.execute(new v2(21, this, oVar));
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
