package defpackage;

import java.util.ArrayList;
public final class tja implements jd7 {
    public final ArrayList a;

    public tja(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((sja) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                } else if (((sja) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((sja) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        gre.f(!z);
    }

    @Override
    public final fm4 a() {
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
        if (obj != null && tja.class == obj.getClass()) {
            return this.a.equals(((tja) obj).a);
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
    public final void b(hr6 hr6Var) {
    }
}
