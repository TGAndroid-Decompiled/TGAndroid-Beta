package o7;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
public final class z0 extends c1 {
    public final int f19272a;
    public final r f19273b;

    public z0(r rVar) {
        rVar.getClass();
        this.f19273b = rVar;
        d0 o10 = rVar.entrySet().o();
        int i10 = 0;
        while (o10.hasNext()) {
            Map.Entry entry = (Map.Entry) o10.next();
            int a2 = ((c1) entry.getKey()).a();
            i10 = i10 < a2 ? a2 : i10;
            int a10 = ((c1) entry.getValue()).a();
            if (i10 < a10) {
                i10 = a10;
            }
        }
        int i11 = i10 + 1;
        this.f19272a = i11;
        if (i11 <= 8) {
            return;
        }
        throw new IOException("Exceeded cutoff limit for max depth of cbor value");
    }

    @Override
    public final int a() {
        return this.f19272a;
    }

    @Override
    public final int compareTo(Object obj) {
        int compareTo;
        c1 c1Var = (c1) obj;
        int zza = c1Var.zza();
        int c10 = c1.c((byte) -96);
        if (c10 != zza) {
            return c10 - c1Var.zza();
        }
        r rVar = ((z0) c1Var).f19273b;
        r rVar2 = this.f19273b;
        if (rVar2.d.size() != rVar.d.size()) {
            return rVar2.d.size() - rVar.d.size();
        }
        d0 o10 = rVar2.entrySet().o();
        d0 o11 = rVar.entrySet().o();
        do {
            if (!o10.hasNext() && !o11.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) o10.next();
            Map.Entry entry2 = (Map.Entry) o11.next();
            int compareTo2 = ((c1) entry.getKey()).compareTo((c1) entry2.getKey());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            compareTo = ((c1) entry.getValue()).compareTo((c1) entry2.getValue());
        } while (compareTo == 0);
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z0.class != obj.getClass()) {
            return false;
        }
        return this.f19273b.equals(((z0) obj).f19273b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c((byte) -96)), this.f19273b});
    }

    public final String toString() {
        r rVar = this.f19273b;
        if (rVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d0 o10 = rVar.entrySet().o();
        while (o10.hasNext()) {
            Map.Entry entry = (Map.Entry) o10.next();
            linkedHashMap.put(((c1) entry.getKey()).toString().replace("\n", "\n  "), ((c1) entry.getValue()).toString().replace("\n", "\n  "));
        }
        ?? obj = new Object();
        StringBuilder sb2 = new StringBuilder("{\n  ");
        try {
            a.g(sb2, linkedHashMap.entrySet().iterator(), obj);
            sb2.append("\n}");
            return sb2.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public final int zza() {
        return c1.c((byte) -96);
    }
}
