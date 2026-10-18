package n7;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
public final class a1 extends d1 {
    public final int f17255a;
    public final s f17256b;

    public a1(s sVar) {
        sVar.getClass();
        this.f17256b = sVar;
        e0 o10 = sVar.entrySet().o();
        int i10 = 0;
        while (o10.hasNext()) {
            Map.Entry entry = (Map.Entry) o10.next();
            int a2 = ((d1) entry.getKey()).a();
            i10 = i10 < a2 ? a2 : i10;
            int a10 = ((d1) entry.getValue()).a();
            if (i10 < a10) {
                i10 = a10;
            }
        }
        int i11 = i10 + 1;
        this.f17255a = i11;
        if (i11 <= 8) {
            return;
        }
        throw new IOException("Exceeded cutoff limit for max depth of cbor value");
    }

    @Override
    public final int a() {
        return this.f17255a;
    }

    @Override
    public final int compareTo(Object obj) {
        int compareTo;
        d1 d1Var = (d1) obj;
        int zza = d1Var.zza();
        int c10 = d1.c((byte) -96);
        if (c10 != zza) {
            return c10 - d1Var.zza();
        }
        s sVar = ((a1) d1Var).f17256b;
        s sVar2 = this.f17256b;
        if (sVar2.d.size() != sVar.d.size()) {
            return sVar2.d.size() - sVar.d.size();
        }
        e0 o10 = sVar2.entrySet().o();
        e0 o11 = sVar.entrySet().o();
        do {
            if (!o10.hasNext() && !o11.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) o10.next();
            Map.Entry entry2 = (Map.Entry) o11.next();
            int compareTo2 = ((d1) entry.getKey()).compareTo((d1) entry2.getKey());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            compareTo = ((d1) entry.getValue()).compareTo((d1) entry2.getValue());
        } while (compareTo == 0);
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a1.class != obj.getClass()) {
            return false;
        }
        return this.f17256b.equals(((a1) obj).f17256b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(d1.c((byte) -96)), this.f17256b});
    }

    public final String toString() {
        s sVar = this.f17256b;
        if (sVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e0 o10 = sVar.entrySet().o();
        while (o10.hasNext()) {
            Map.Entry entry = (Map.Entry) o10.next();
            linkedHashMap.put(((d1) entry.getKey()).toString().replace("\n", "\n  "), ((d1) entry.getValue()).toString().replace("\n", "\n  "));
        }
        sb.a aVar = new sb.a(14);
        StringBuilder sb2 = new StringBuilder("{\n  ");
        try {
            a.g(sb2, linkedHashMap.entrySet().iterator(), aVar);
            sb2.append("\n}");
            return sb2.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public final int zza() {
        return d1.c((byte) -96);
    }
}
