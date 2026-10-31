package di;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public final class s implements AutoCloseable {
    public final d2.c f5986b;
    public final d2.c f5987c;
    public long f5990r;
    public boolean f5991s;
    public c f5992w;
    public Throwable f5993x;
    public volatile Set f5994y;
    public final Object f5985a = new Object();
    public final LinkedHashMap h = new LinkedHashMap(16, 0.75f, true);
    public final HashMap f5989n = new HashMap();
    public final int e = 256;
    public final long f5988f = 8388608;
    public final ExecutorService d = Executors.newSingleThreadExecutor(new n(0));

    public s(d2.c cVar, d2.c cVar2) {
        this.f5986b = cVar;
        this.f5987c = cVar2;
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
        throw new UnsupportedOperationException("Method not decompiled: di.s.a():boolean");
    }

    public final void c(q qVar, n4.q qVar2) {
        o oVar = new o(qVar, qVar2);
        int i10 = this.e;
        if (i10 != 0) {
            long j10 = oVar.f5980b;
            long j11 = this.f5988f;
            if (j10 <= j11) {
                LinkedHashMap linkedHashMap = this.h;
                linkedHashMap.put(qVar, oVar);
                this.f5990r += j10;
                while (true) {
                    if (linkedHashMap.size() > i10 || this.f5990r > j11) {
                        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                        this.f5990r -= ((o) entry.getValue()).f5980b;
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
        synchronized (this.f5985a) {
            try {
                if (this.f5991s) {
                    return;
                }
                this.f5991s = true;
                for (ArrayList arrayList : this.f5989n.values()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((r) obj).f5984a = null;
                    }
                }
                this.f5989n.clear();
                this.h.clear();
                this.f5990r = 0L;
                this.d.execute(new m(this, 0));
                this.d.shutdown();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final r d(String str, String str2, p pVar) {
        if (str != null) {
            q qVar = new q(str, b(str2));
            ?? obj = new Object();
            obj.f5984a = pVar;
            synchronized (this.f5985a) {
                try {
                    if (!this.f5991s) {
                        ArrayList arrayList = (ArrayList) this.f5989n.get(qVar);
                        if (arrayList != null) {
                            arrayList.add(obj);
                            return obj;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(obj);
                        this.f5989n.put(qVar, arrayList2);
                        this.d.execute(new d1.e(3, this, qVar));
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
