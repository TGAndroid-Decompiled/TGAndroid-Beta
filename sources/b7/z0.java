package b7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public final class z0 extends h1 {
    public final o f1743a;
    public final int f1744b;

    public z0(a0 a0Var) {
        a0Var.getClass();
        this.f1743a = a0Var;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            o oVar = this.f1743a;
            if (i10 >= oVar.size()) {
                break;
            }
            int a2 = ((h1) oVar.get(i10)).a();
            if (i11 < a2) {
                i11 = a2;
            }
            i10++;
        }
        int i12 = i11 + 1;
        this.f1744b = i12;
        if (i12 <= 8) {
            return;
        }
        throw new IOException("Exceeded cutoff limit for max depth of cbor value");
    }

    @Override
    public final int a() {
        return this.f1744b;
    }

    @Override
    public final int compareTo(Object obj) {
        h1 h1Var = (h1) obj;
        int zza = h1Var.zza();
        int c3 = h1.c(Byte.MIN_VALUE);
        if (c3 != zza) {
            return c3 - h1Var.zza();
        }
        o oVar = ((z0) h1Var).f1743a;
        o oVar2 = this.f1743a;
        if (oVar2.size() != oVar.size()) {
            return oVar2.size() - oVar.size();
        }
        for (int i10 = 0; i10 < oVar2.size(); i10++) {
            int compareTo = ((h1) oVar2.get(i10)).compareTo((h1) oVar.get(i10));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z0.class != obj.getClass()) {
            return false;
        }
        return this.f1743a.equals(((z0) obj).f1743a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(h1.c(Byte.MIN_VALUE)), this.f1743a});
    }

    public final String toString() {
        o oVar = this.f1743a;
        if (oVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = oVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((h1) oVar.get(i10)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb.append(h7.u.H2(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) ",\n  ");
                    sb.append(h7.u.H2(it.next()));
                }
            }
            sb.append("\n]");
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public final int zza() {
        return h1.c(Byte.MIN_VALUE);
    }
}
