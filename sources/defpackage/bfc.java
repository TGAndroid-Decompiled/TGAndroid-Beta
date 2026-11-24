package defpackage;

import java.util.ArrayList;
public final class bfc extends efc {
    public boolean a = false;
    public int b = 0;
    public final cfc c;

    public bfc(cfc cfcVar) {
        this.c = cfcVar;
    }

    @Override
    public final void b() {
        if (!this.a) {
            this.a = true;
            efc efcVar = (efc) this.c.e;
            if (efcVar != null) {
                efcVar.b();
            }
        }
    }

    @Override
    public final void c() {
        int i = this.b + 1;
        this.b = i;
        cfc cfcVar = this.c;
        if (i == ((ArrayList) cfcVar.c).size()) {
            efc efcVar = (efc) cfcVar.e;
            if (efcVar != null) {
                efcVar.c();
            }
            this.b = 0;
            this.a = false;
            cfcVar.b = false;
        }
    }
}
