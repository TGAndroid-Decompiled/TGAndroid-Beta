package ni;

import h2.l0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import li.j3;
public final class s implements AutoCloseable {
    public final a f20645b;
    public final a f20646c;
    public long f20650r;
    public boolean f20651s;
    public d f20652w;
    public Throwable f20653x;
    public volatile Set f20654y;
    public final Object f20644a = new Object();
    public final LinkedHashMap h = new LinkedHashMap(16, 0.75f, true);
    public final HashMap f20649n = new HashMap();
    public final int f20647e = 256;
    public final long f20648f = 8388608;
    public final ExecutorService d = Executors.newSingleThreadExecutor(new l0(1));

    public s(a aVar, a aVar2) {
        this.f20645b = aVar;
        this.f20646c = aVar2;
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
        throw new UnsupportedOperationException("Method not decompiled: ni.s.a():boolean");
    }

    public final void c(q qVar, j2.n nVar) {
        o oVar = new o(qVar, nVar);
        int i7 = this.f20647e;
        if (i7 != 0) {
            long j3 = oVar.f20639b;
            long j10 = this.f20648f;
            if (j3 <= j10) {
                LinkedHashMap linkedHashMap = this.h;
                linkedHashMap.put(qVar, oVar);
                this.f20650r += j3;
                while (true) {
                    if (linkedHashMap.size() > i7 || this.f20650r > j10) {
                        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                        this.f20650r -= ((o) entry.getValue()).f20639b;
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
        synchronized (this.f20644a) {
            try {
                if (this.f20651s) {
                    return;
                }
                this.f20651s = true;
                for (ArrayList arrayList : this.f20649n.values()) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((r) obj).f20643a = null;
                    }
                }
                this.f20649n.clear();
                this.h.clear();
                this.f20650r = 0L;
                this.d.execute(new n(this, 0));
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
            obj.f20643a = pVar;
            synchronized (this.f20644a) {
                try {
                    if (!this.f20651s) {
                        ArrayList arrayList = (ArrayList) this.f20649n.get(qVar);
                        if (arrayList != null) {
                            arrayList.add(obj);
                            return obj;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(obj);
                        this.f20649n.put(qVar, arrayList2);
                        this.d.execute(new j3(14, this, qVar));
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
