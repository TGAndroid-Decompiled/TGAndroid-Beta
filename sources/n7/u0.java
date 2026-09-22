package n7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public final class u0 extends c1 {
    public final m f15401a;
    public final int f15402b;

    public u0(x xVar) {
        xVar.getClass();
        this.f15401a = xVar;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            m mVar = this.f15401a;
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
        this.f15402b = i12;
        if (i12 <= 8) {
            return;
        }
        throw new IOException("Exceeded cutoff limit for max depth of cbor value");
    }

    @Override
    public final int a() {
        return this.f15402b;
    }

    @Override
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int zza = c1Var.zza();
        int c10 = c1.c(Byte.MIN_VALUE);
        if (c10 != zza) {
            return c10 - c1Var.zza();
        }
        m mVar = ((u0) c1Var).f15401a;
        m mVar2 = this.f15401a;
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
        return this.f15401a.equals(((u0) obj).f15401a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c(Byte.MIN_VALUE)), this.f15401a});
    }

    public final String toString() {
        m mVar = this.f15401a;
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
                sb2.append(na.d.G3(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ",\n  ");
                    sb2.append(na.d.G3(it.next()));
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
        return c1.c(Byte.MIN_VALUE);
    }
}
