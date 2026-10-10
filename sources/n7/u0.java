package n7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public final class u0 extends c1 {
    public final m f16808a;
    public final int f16809b;

    public u0(x xVar) {
        xVar.getClass();
        this.f16808a = xVar;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            m mVar = this.f16808a;
            if (i10 >= mVar.size()) {
                break;
            }
            int a2 = ((c1) mVar.get(i10)).a();
            if (i11 < a2) {
                i11 = a2;
            }
            i10++;
        }
        int i12 = i11 + 1;
        this.f16809b = i12;
        if (i12 <= 8) {
            return;
        }
        throw new IOException("Exceeded cutoff limit for max depth of cbor value");
    }

    @Override
    public final int a() {
        return this.f16809b;
    }

    @Override
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int zza = c1Var.zza();
        int c10 = c1.c(Byte.MIN_VALUE);
        if (c10 != zza) {
            return c10 - c1Var.zza();
        }
        m mVar = ((u0) c1Var).f16808a;
        m mVar2 = this.f16808a;
        if (mVar2.size() != mVar.size()) {
            return mVar2.size() - mVar.size();
        }
        for (int i10 = 0; i10 < mVar2.size(); i10++) {
            int compareTo = ((c1) mVar2.get(i10)).compareTo((c1) mVar.get(i10));
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
        if (obj == null || u0.class != obj.getClass()) {
            return false;
        }
        return this.f16808a.equals(((u0) obj).f16808a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c(Byte.MIN_VALUE)), this.f16808a});
    }

    public final String toString() {
        m mVar = this.f16808a;
        if (mVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = mVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((c1) mVar.get(i10)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb2 = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb2.append(na.d.J3(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ",\n  ");
                    sb2.append(na.d.J3(it.next()));
                }
            }
            sb2.append("\n]");
            return sb2.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override
    public final int zza() {
        return c1.c(Byte.MIN_VALUE);
    }
}
