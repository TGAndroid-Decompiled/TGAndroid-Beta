package defpackage;
public abstract class n9e {
    public static fga a;

    public static final void a() {
        try {
            fga fgaVar = a;
            if (fgaVar == null) {
                fgaVar = (fga) ((b53) ((ih4) jg4.c().b(ih4.class))).o.mo9get();
                fgaVar.getClass();
                a = fgaVar;
            }
            if (fgaVar != null) {
                if (fgaVar.i) {
                    if (fgaVar != null) {
                        fgaVar.a();
                        return;
                    } else {
                        rp5.e("sharedSessionRepository");
                        throw null;
                    }
                }
                return;
            }
            rp5.e("sharedSessionRepository");
            throw null;
        } catch (Exception unused) {
        }
    }
}
