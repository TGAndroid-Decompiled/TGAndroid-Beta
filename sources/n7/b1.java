package n7;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
public final class b1 extends e1 {
    public final int f13942a;
    public final s f13943b;

    public b1(s sVar) {
        sVar.getClass();
        this.f13943b = sVar;
        e0 p5 = sVar.entrySet().p();
        int i10 = 0;
        while (p5.hasNext()) {
            Map.Entry entry = (Map.Entry) p5.next();
            int a2 = ((e1) entry.getKey()).a();
            i10 = i10 < a2 ? a2 : i10;
            int a10 = ((e1) entry.getValue()).a();
            if (i10 < a10) {
                i10 = a10;
            }
        }
        int i11 = i10 + 1;
        this.f13942a = i11;
        if (i11 <= 8) {
            return;
        }
        throw new IOException("Exceeded cutoff limit for max depth of cbor value");
    }

    @Override
    public final int a() {
        return this.f13942a;
    }

    @Override
    public final int compareTo(Object obj) {
        int compareTo;
        e1 e1Var = (e1) obj;
        int zza = e1Var.zza();
        int c10 = e1.c((byte) -96);
        if (c10 != zza) {
            return c10 - e1Var.zza();
        }
        s sVar = ((b1) e1Var).f13943b;
        s sVar2 = this.f13943b;
        if (sVar2.d.size() != sVar.d.size()) {
            return sVar2.d.size() - sVar.d.size();
        }
        e0 p5 = sVar2.entrySet().p();
        e0 p10 = sVar.entrySet().p();
        do {
            if (!p5.hasNext() && !p10.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) p5.next();
            Map.Entry entry2 = (Map.Entry) p10.next();
            int compareTo2 = ((e1) entry.getKey()).compareTo((e1) entry2.getKey());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            compareTo = ((e1) entry.getValue()).compareTo((e1) entry2.getValue());
        } while (compareTo == 0);
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        return this.f13943b.equals(((b1) obj).f13943b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(e1.c((byte) -96)), this.f13943b});
    }

    public final String toString() {
        s sVar = this.f13943b;
        if (sVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e0 p5 = sVar.entrySet().p();
        while (p5.hasNext()) {
            Map.Entry entry = (Map.Entry) p5.next();
            linkedHashMap.put(((e1) entry.getKey()).toString().replace("\n", "\n  "), ((e1) entry.getValue()).toString().replace("\n", "\n  "));
        }
        na.d dVar = new na.d(14);
        StringBuilder sb2 = new StringBuilder("{\n  ");
        try {
            a.g(sb2, linkedHashMap.entrySet().iterator(), dVar);
            sb2.append("\n}");
            return sb2.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public final int zza() {
        return e1.c((byte) -96);
    }
}
