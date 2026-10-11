package li;

import e2.c0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ki.i0;
import n4.x;
public final class q implements AutoCloseable {
    public final j2.e f15636b;
    public final j2.e f15637c;
    public long f15641r;
    public boolean f15642s;
    public b v;
    public Throwable f15643w;
    public volatile Set f15644x;
    public final Object f15635a = new Object();
    public final LinkedHashMap h = new LinkedHashMap(16, 0.75f, true);
    public final HashMap f15640n = new HashMap();
    public final int f15638e = 256;
    public final long f15639f = 8388608;
    public final ExecutorService d = Executors.newSingleThreadExecutor(new c0(3));

    public q(j2.e eVar, j2.e eVar2) {
        this.f15636b = eVar;
        this.f15637c = eVar2;
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
        throw new UnsupportedOperationException("Method not decompiled: li.q.a():boolean");
    }

    public final void c(o oVar, x xVar) {
        m mVar = new m(oVar, xVar);
        int i10 = this.f15638e;
        if (i10 != 0) {
            long j3 = mVar.f15630b;
            long j10 = this.f15639f;
            if (j3 <= j10) {
                LinkedHashMap linkedHashMap = this.h;
                linkedHashMap.put(oVar, mVar);
                this.f15641r += j3;
                while (true) {
                    if (linkedHashMap.size() > i10 || this.f15641r > j10) {
                        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                        this.f15641r -= ((m) entry.getValue()).f15630b;
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
        synchronized (this.f15635a) {
            try {
                if (this.f15642s) {
                    return;
                }
                this.f15642s = true;
                for (ArrayList arrayList : this.f15640n.values()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((p) obj).f15634a = null;
                    }
                }
                this.f15640n.clear();
                this.h.clear();
                this.f15641r = 0L;
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
            obj.f15634a = nVar;
            synchronized (this.f15635a) {
                try {
                    if (!this.f15642s) {
                        ArrayList arrayList = (ArrayList) this.f15640n.get(oVar);
                        if (arrayList != null) {
                            arrayList.add(obj);
                            return obj;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(obj);
                        this.f15640n.put(oVar, arrayList2);
                        this.d.execute(new i0(3, this, oVar));
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
