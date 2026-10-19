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
import m4.v0;
import m4.z;
public final class r implements AutoCloseable {
    public final v0 f16976b;
    public final v0 f16977c;
    public long f16980r;
    public boolean f16981s;
    public b v;
    public Throwable f16982w;
    public volatile Set f16983x;
    public final Object f16975a = new Object();
    public final LinkedHashMap h = new LinkedHashMap(16, 0.75f, true);
    public final HashMap f16979n = new HashMap();
    public final int e = 256;
    public final long f16978f = 8388608;
    public final ExecutorService d = Executors.newSingleThreadExecutor(new l0(1));

    public r(v0 v0Var, v0 v0Var2) {
        this.f16976b = v0Var;
        this.f16977c = v0Var2;
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
        throw new UnsupportedOperationException("Method not decompiled: mi.r.a():boolean");
    }

    public final void c(o oVar, q qVar) {
        m mVar = new m(oVar, qVar);
        int i10 = this.e;
        if (i10 != 0) {
            long j10 = mVar.f16967b;
            long j11 = this.f16978f;
            if (j10 <= j11) {
                LinkedHashMap linkedHashMap = this.h;
                linkedHashMap.put(oVar, mVar);
                this.f16980r += j10;
                while (true) {
                    if (linkedHashMap.size() > i10 || this.f16980r > j11) {
                        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                        this.f16980r -= ((m) entry.getValue()).f16967b;
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
        synchronized (this.f16975a) {
            try {
                if (this.f16981s) {
                    return;
                }
                this.f16981s = true;
                for (ArrayList arrayList : this.f16979n.values()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((p) obj).f16971a = null;
                    }
                }
                this.f16979n.clear();
                this.h.clear();
                this.f16980r = 0L;
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
            obj.f16971a = nVar;
            synchronized (this.f16975a) {
                try {
                    if (!this.f16981s) {
                        ArrayList arrayList = (ArrayList) this.f16979n.get(oVar);
                        if (arrayList != null) {
                            arrayList.add(obj);
                            return obj;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(obj);
                        this.f16979n.put(oVar, arrayList2);
                        this.d.execute(new z(5, this, oVar));
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
