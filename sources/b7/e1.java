package b7;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
public final class e1 extends h1 {
    public final int f1677a;
    public final u f1678b;

    public e1(u uVar) {
        uVar.getClass();
        this.f1678b = uVar;
        g0 p10 = uVar.entrySet().p();
        int i10 = 0;
        while (p10.hasNext()) {
            Map.Entry entry = (Map.Entry) p10.next();
            int a2 = ((h1) entry.getKey()).a();
            i10 = i10 < a2 ? a2 : i10;
            int a10 = ((h1) entry.getValue()).a();
            if (i10 < a10) {
                i10 = a10;
            }
        }
        int i11 = i10 + 1;
        this.f1677a = i11;
        if (i11 <= 8) {
            return;
        }
        throw new IOException("Exceeded cutoff limit for max depth of cbor value");
    }

    @Override
    public final int a() {
        return this.f1677a;
    }

    @Override
    public final int compareTo(Object obj) {
        int compareTo;
        h1 h1Var = (h1) obj;
        int zza = h1Var.zza();
        int c3 = h1.c((byte) -96);
        if (c3 != zza) {
            return c3 - h1Var.zza();
        }
        u uVar = ((e1) h1Var).f1678b;
        u uVar2 = this.f1678b;
        if (uVar2.d.size() != uVar.d.size()) {
            return uVar2.d.size() - uVar.d.size();
        }
        g0 p10 = uVar2.entrySet().p();
        g0 p11 = uVar.entrySet().p();
        do {
            if (!p10.hasNext() && !p11.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) p10.next();
            Map.Entry entry2 = (Map.Entry) p11.next();
            int compareTo2 = ((h1) entry.getKey()).compareTo((h1) entry2.getKey());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            compareTo = ((h1) entry.getValue()).compareTo((h1) entry2.getValue());
        } while (compareTo == 0);
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e1.class != obj.getClass()) {
            return false;
        }
        return this.f1678b.equals(((e1) obj).f1678b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(h1.c((byte) -96)), this.f1678b});
    }

    public final String toString() {
        u uVar = this.f1678b;
        if (uVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        g0 p10 = uVar.entrySet().p();
        while (p10.hasNext()) {
            Map.Entry entry = (Map.Entry) p10.next();
            linkedHashMap.put(((h1) entry.getKey()).toString().replace("\n", "\n  "), ((h1) entry.getValue()).toString().replace("\n", "\n  "));
        }
        h7.u uVar2 = new h7.u(3);
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            b.g(sb, linkedHashMap.entrySet().iterator(), uVar2);
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public final int zza() {
        return h1.c((byte) -96);
    }
}
