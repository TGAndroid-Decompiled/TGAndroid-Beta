package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
public final class ehe extends the {
    public final int a;
    public final pld b;

    public ehe(pld pldVar) {
        pldVar.getClass();
        this.b = pldVar;
        v7c u = pldVar.entrySet().u();
        int i = 0;
        while (u.hasNext()) {
            Map.Entry entry = (Map.Entry) u.next();
            int a = ((the) entry.getKey()).a();
            i = i < a ? a : i;
            int a2 = ((the) entry.getValue()).a();
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
        the theVar = (the) obj;
        int zza = theVar.zza();
        int c = the.c((byte) -96);
        if (c != zza) {
            return c - theVar.zza();
        }
        pld pldVar = ((ehe) theVar).b;
        pld pldVar2 = this.b;
        if (pldVar2.d.size() != pldVar.d.size()) {
            return pldVar2.d.size() - pldVar.d.size();
        }
        v7c u = pldVar2.entrySet().u();
        v7c u2 = pldVar.entrySet().u();
        do {
            if (!u.hasNext() && !u2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) u.next();
            Map.Entry entry2 = (Map.Entry) u2.next();
            int compareTo2 = ((the) entry.getKey()).compareTo((the) entry2.getKey());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            compareTo = ((the) entry.getValue()).compareTo((the) entry2.getValue());
        } while (compareTo == 0);
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ehe.class != obj.getClass()) {
            return false;
        }
        return this.b.equals(((ehe) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(the.c((byte) -96)), this.b});
    }

    public final String toString() {
        pld pldVar = this.b;
        if (pldVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        v7c u = pldVar.entrySet().u();
        while (u.hasNext()) {
            Map.Entry entry = (Map.Entry) u.next();
            linkedHashMap.put(((the) entry.getKey()).toString().replace("\n", "\n  "), ((the) entry.getValue()).toString().replace("\n", "\n  "));
        }
        ?? obj = new Object();
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            t1f.a(sb, linkedHashMap.entrySet().iterator(), obj);
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e) {
            bh7.j(e);
            return null;
        }
    }

    @Override
    public final int zza() {
        return the.c((byte) -96);
    }
}
