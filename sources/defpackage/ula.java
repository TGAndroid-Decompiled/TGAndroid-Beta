package defpackage;

import java.util.ArrayList;
public final class ula implements lf7 {
    public final ArrayList a;

    public ula(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((tla) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                } else if (((tla) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((tla) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        jte.f(!z);
    }

    @Override
    public final go4 a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ula.class == obj.getClass()) {
            return this.a.equals(((ula) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }

    @Override
    public final void b(ht6 ht6Var) {
    }
}
