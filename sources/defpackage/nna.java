package defpackage;

import java.util.ArrayList;
public final class nna implements tf7 {
    public final ArrayList a;

    public nna(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((mna) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                } else if (((mna) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((mna) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        yve.f(!z);
    }

    @Override
    public final ko4 a() {
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
        if (obj != null && nna.class == obj.getClass()) {
            return this.a.equals(((nna) obj).a);
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
    public final void b(lt6 lt6Var) {
    }
}
