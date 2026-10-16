package n7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public final class v0 extends d1 {
    public final n f15938a;
    public final int f15939b;

    public v0(y yVar) {
        yVar.getClass();
        this.f15938a = yVar;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            n nVar = this.f15938a;
            if (i10 >= nVar.size()) {
                break;
            }
            int a2 = ((d1) nVar.get(i10)).a();
            if (i11 < a2) {
                i11 = a2;
            }
            i10++;
        }
        int i12 = i11 + 1;
        this.f15939b = i12;
        if (i12 <= 8) {
            return;
        }
        throw new IOException("Exceeded cutoff limit for max depth of cbor value");
    }

    @Override
    public final int a() {
        return this.f15939b;
    }

    @Override
    public final int compareTo(Object obj) {
        d1 d1Var = (d1) obj;
        int zza = d1Var.zza();
        int c10 = d1.c(Byte.MIN_VALUE);
        if (c10 != zza) {
            return c10 - d1Var.zza();
        }
        n nVar = ((v0) d1Var).f15938a;
        n nVar2 = this.f15938a;
        if (nVar2.size() != nVar.size()) {
            return nVar2.size() - nVar.size();
        }
        for (int i10 = 0; i10 < nVar2.size(); i10++) {
            int compareTo = ((d1) nVar2.get(i10)).compareTo((d1) nVar.get(i10));
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
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        return this.f15938a.equals(((v0) obj).f15938a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(d1.c(Byte.MIN_VALUE)), this.f15938a});
    }

    public final String toString() {
        n nVar = this.f15938a;
        if (nVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = nVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((d1) nVar.get(i10)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb2 = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb2.append(sb.a.x2(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ",\n  ");
                    sb2.append(sb.a.x2(it.next()));
                }
            }
            sb2.append("\n]");
            return sb2.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public final int zza() {
        return d1.c(Byte.MIN_VALUE);
    }
}
