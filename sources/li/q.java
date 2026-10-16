package li;

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
import k2.y0;
public final class q implements AutoCloseable {
    public final y0 f14773b;
    public final y0 f14774c;
    public long f14777r;
    public boolean f14778s;
    public b v;
    public Throwable f14779w;
    public volatile Set f14780x;
    public final Object f14772a = new Object();
    public final LinkedHashMap h = new LinkedHashMap(16, 0.75f, true);
    public final HashMap f14776n = new HashMap();
    public final int e = 256;
    public final long f14775f = 8388608;
    public final ExecutorService d = Executors.newSingleThreadExecutor(new l0(1));

    public q(y0 y0Var, y0 y0Var2) {
        this.f14773b = y0Var;
        this.f14774c = y0Var2;
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

    public final void c(o oVar, n4.s sVar) {
        m mVar = new m(oVar, sVar);
        int i10 = this.e;
        if (i10 != 0) {
            long j10 = mVar.f14767b;
            long j11 = this.f14775f;
            if (j10 <= j11) {
                LinkedHashMap linkedHashMap = this.h;
                linkedHashMap.put(oVar, mVar);
                this.f14777r += j10;
                while (true) {
                    if (linkedHashMap.size() > i10 || this.f14777r > j11) {
                        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                        this.f14777r -= ((m) entry.getValue()).f14767b;
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
        synchronized (this.f14772a) {
            try {
                if (this.f14778s) {
                    return;
                }
                this.f14778s = true;
                for (ArrayList arrayList : this.f14776n.values()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((p) obj).f14771a = null;
                    }
                }
                this.f14776n.clear();
                this.h.clear();
                this.f14777r = 0L;
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
            obj.f14771a = nVar;
            synchronized (this.f14772a) {
                try {
                    if (!this.f14778s) {
                        ArrayList arrayList = (ArrayList) this.f14776n.get(oVar);
                        if (arrayList != null) {
                            arrayList.add(obj);
                            return obj;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(obj);
                        this.f14776n.put(oVar, arrayList2);
                        this.d.execute(new v2(10, this, oVar));
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
