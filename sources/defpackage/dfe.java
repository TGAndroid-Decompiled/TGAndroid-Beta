package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
public final class dfe extends sfe {
    public final int a;
    public final njd b;

    public dfe(njd njdVar) {
        njdVar.getClass();
        this.b = njdVar;
        v5c u = njdVar.entrySet().u();
        int i = 0;
        while (u.hasNext()) {
            Map.Entry entry = (Map.Entry) u.next();
            int a = ((sfe) entry.getKey()).a();
            i = i < a ? a : i;
            int a2 = ((sfe) entry.getValue()).a();
            if (i < a2) {
                i = a2;
            }
        }
        int i2 = i + 1;
        this.a = i2;
        if (i2 <= 8) {
            return;
        }
        throw new IOException("Exceeded cutoff limit for max depth of cbor value");
    }

    @Override
    public final int a() {
        return this.a;
    }

    @Override
    public final int compareTo(Object obj) {
        int compareTo;
        sfe sfeVar = (sfe) obj;
        int zza = sfeVar.zza();
        int c = sfe.c((byte) -96);
        if (c != zza) {
            return c - sfeVar.zza();
        }
        njd njdVar = ((dfe) sfeVar).b;
        njd njdVar2 = this.b;
        if (njdVar2.d.size() != njdVar.d.size()) {
            return njdVar2.d.size() - njdVar.d.size();
        }
        v5c u = njdVar2.entrySet().u();
        v5c u2 = njdVar.entrySet().u();
        do {
            if (!u.hasNext() && !u2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) u.next();
            Map.Entry entry2 = (Map.Entry) u2.next();
            int compareTo2 = ((sfe) entry.getKey()).compareTo((sfe) entry2.getKey());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            compareTo = ((sfe) entry.getValue()).compareTo((sfe) entry2.getValue());
        } while (compareTo == 0);
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dfe.class != obj.getClass()) {
            return false;
        }
        return this.b.equals(((dfe) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(sfe.c((byte) -96)), this.b});
    }

    public final String toString() {
        njd njdVar = this.b;
        if (njdVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        v5c u = njdVar.entrySet().u();
        while (u.hasNext()) {
            Map.Entry entry = (Map.Entry) u.next();
            linkedHashMap.put(((sfe) entry.getKey()).toString().replace("\n", "\n  "), ((sfe) entry.getValue()).toString().replace("\n", "\n  "));
        }
        ?? obj = new Object();
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            rze.a(sb, linkedHashMap.entrySet().iterator(), obj);
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e) {
            fi7.g(e);
            return null;
        }
    }

    @Override
    public final int zza() {
        return sfe.c((byte) -96);
    }
}
