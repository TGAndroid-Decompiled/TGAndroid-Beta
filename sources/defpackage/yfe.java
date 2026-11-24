package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public final class yfe extends the {
    public final qnd a;
    public final int b;

    public yfe(qnd qndVar) {
        qndVar.getClass();
        this.a = qndVar;
        int i = 0;
        int i2 = 0;
        while (true) {
            qnd qndVar2 = this.a;
            if (i >= qndVar2.s) {
                break;
            }
            int a = ((the) qndVar2.get(i)).a();
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
        qnd qndVar = this.a;
        int i = qndVar.s;
        the theVar = (the) obj;
        int zza = theVar.zza();
        int c = the.c(Byte.MIN_VALUE);
        if (c != zza) {
            return c - theVar.zza();
        }
        qnd qndVar2 = ((yfe) theVar).a;
        int i2 = qndVar2.s;
        if (i != i2) {
            return i - i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int compareTo = ((the) qndVar.get(i3)).compareTo((the) qndVar2.get(i3));
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
        if (obj == null || yfe.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((yfe) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(the.c(Byte.MIN_VALUE)), this.a});
    }

    public final String toString() {
        qnd qndVar = this.a;
        if (qndVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int i = qndVar.s;
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(((the) qndVar.get(i2)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb.append(jed.a(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) ",\n  ");
                    sb.append(jed.a(it.next()));
                }
            }
            sb.append("\n]");
            return sb.toString();
        } catch (IOException e) {
            bh7.j(e);
            return null;
        }
    }
}
