package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public final class oie extends jke {
    public final fqd a;
    public final int b;

    public oie(fqd fqdVar) {
        fqdVar.getClass();
        this.a = fqdVar;
        int i = 0;
        int i2 = 0;
        while (true) {
            fqd fqdVar2 = this.a;
            if (i >= fqdVar2.s) {
                break;
            }
            int a = ((jke) fqdVar2.get(i)).a();
            if (i2 < a) {
                i2 = a;
            }
            i++;
        }
        int i3 = i2 + 1;
        this.b = i3;
        if (i3 <= 8) {
            return;
        }
        throw new IOException("Exceeded cutoff limit for max depth of cbor value");
    }

    @Override
    public final int a() {
        return this.b;
    }

    @Override
    public final int compareTo(Object obj) {
        fqd fqdVar = this.a;
        int i = fqdVar.s;
        jke jkeVar = (jke) obj;
        int zza = jkeVar.zza();
        int c = jke.c(Byte.MIN_VALUE);
        if (c != zza) {
            return c - jkeVar.zza();
        }
        fqd fqdVar2 = ((oie) jkeVar).a;
        int i2 = fqdVar2.s;
        if (i != i2) {
            return i - i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int compareTo = ((jke) fqdVar.get(i3)).compareTo((jke) fqdVar2.get(i3));
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
        if (obj == null || oie.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((oie) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(jke.c(Byte.MIN_VALUE)), this.a});
    }

    public final String toString() {
        fqd fqdVar = this.a;
        if (fqdVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int i = fqdVar.s;
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(((jke) fqdVar.get(i2)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb.append(ahd.a(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) ",\n  ");
                    sb.append(ahd.a(it.next()));
                }
            }
            sb.append("\n]");
            return sb.toString();
        } catch (IOException e) {
            hz6.e(e);
            return null;
        }
    }
}
