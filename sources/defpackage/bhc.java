package defpackage;

import java.util.ArrayList;
public final class bhc extends ehc {
    public boolean a = false;
    public int b = 0;
    public final chc c;

    public bhc(chc chcVar) {
        this.c = chcVar;
    }

    @Override
    public final void b() {
        if (!this.a) {
            this.a = true;
            ehc ehcVar = (ehc) this.c.e;
            if (ehcVar != null) {
                ehcVar.b();
            }
        }
    }

    @Override
    public final void c() {
        int i = this.b + 1;
        this.b = i;
        chc chcVar = this.c;
        if (i == ((ArrayList) chcVar.c).size()) {
            ehc ehcVar = (ehc) chcVar.e;
            if (ehcVar != null) {
                ehcVar.c();
            }
            this.b = 0;
            this.a = false;
            chcVar.b = false;
        }
    }
}
