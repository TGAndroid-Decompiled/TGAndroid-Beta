package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public final class xde extends sfe {
    public final old a;
    public final int b;

    public xde(old oldVar) {
        oldVar.getClass();
        this.a = oldVar;
        int i = 0;
        int i2 = 0;
        while (true) {
            old oldVar2 = this.a;
            if (i >= oldVar2.s) {
                break;
            }
            int a = ((sfe) oldVar2.get(i)).a();
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
        old oldVar = this.a;
        int i = oldVar.s;
        sfe sfeVar = (sfe) obj;
        int zza = sfeVar.zza();
        int c = sfe.c(Byte.MIN_VALUE);
        if (c != zza) {
            return c - sfeVar.zza();
        }
        old oldVar2 = ((xde) sfeVar).a;
        int i2 = oldVar2.s;
        if (i != i2) {
            return i - i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int compareTo = ((sfe) oldVar.get(i3)).compareTo((sfe) oldVar2.get(i3));
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
        if (obj == null || xde.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((xde) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(sfe.c(Byte.MIN_VALUE)), this.a});
    }

    public final String toString() {
        old oldVar = this.a;
        if (oldVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int i = oldVar.s;
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(((sfe) oldVar.get(i2)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb.append(hcd.a(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) ",\n  ");
                    sb.append(hcd.a(it.next()));
                }
            }
            sb.append("\n]");
            return sb.toString();
        } catch (IOException e) {
            fi7.g(e);
            return null;
        }
    }
}
