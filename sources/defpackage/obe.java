package defpackage;
public abstract class obe {
    public static hia a;

    public static final void a() {
        try {
            hia hiaVar = a;
            if (hiaVar == null) {
                hiaVar = (hia) ((m63) ((kj4) li4.c().b(kj4.class))).o.mo8get();
                hiaVar.getClass();
                a = hiaVar;
            }
            if (hiaVar != null) {
                if (hiaVar.i) {
                    if (hiaVar != null) {
                        hiaVar.a();
                        return;
                    } else {
                        rr5.e("sharedSessionRepository");
                        throw null;
                    }
                }
                return;
            }
            rr5.e("sharedSessionRepository");
            throw null;
        } catch (Exception unused) {
        }
    }
}
