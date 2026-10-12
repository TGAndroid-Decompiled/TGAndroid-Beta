package ki;

import e2.c0;
import gg.w1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import n4.y;
public final class q implements AutoCloseable {
    public final j2.e f14905b;
    public final j2.e f14906c;
    public long f14910r;
    public boolean f14911s;
    public b v;
    public Throwable f14912w;
    public volatile Set f14913x;
    public final Object f14904a = new Object();
    public final LinkedHashMap h = new LinkedHashMap(16, 0.75f, true);
    public final HashMap f14909n = new HashMap();
    public final int f14907e = 256;
    public final long f14908f = 8388608;
    public final ExecutorService d = Executors.newSingleThreadExecutor(new c0(1));

    public q(j2.e eVar, j2.e eVar2) {
        this.f14905b = eVar;
        this.f14906c = eVar2;
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
        throw new UnsupportedOperationException("Method not decompiled: ki.q.a():boolean");
    }

    public final void c(o oVar, y yVar) {
        m mVar = new m(oVar, yVar);
        int i10 = this.f14907e;
        if (i10 != 0) {
            long j3 = mVar.f14899b;
            long j10 = this.f14908f;
            if (j3 <= j10) {
                LinkedHashMap linkedHashMap = this.h;
                linkedHashMap.put(oVar, mVar);
                this.f14910r += j3;
                while (true) {
                    if (linkedHashMap.size() > i10 || this.f14910r > j10) {
                        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                        this.f14910r -= ((m) entry.getValue()).f14899b;
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
        synchronized (this.f14904a) {
            try {
                if (this.f14911s) {
                    return;
                }
                this.f14911s = true;
                for (ArrayList arrayList : this.f14909n.values()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((p) obj).f14903a = null;
                    }
                }
                this.f14909n.clear();
                this.h.clear();
                this.f14910r = 0L;
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
            obj.f14903a = nVar;
            synchronized (this.f14904a) {
                try {
                    if (!this.f14911s) {
                        ArrayList arrayList = (ArrayList) this.f14909n.get(oVar);
                        if (arrayList != null) {
                            arrayList.add(obj);
                            return obj;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(obj);
                        this.f14909n.put(oVar, arrayList2);
                        this.d.execute(new w1(28, this, oVar));
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
