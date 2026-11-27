package defpackage;

import java.util.ArrayList;
public final class ajc extends djc {
    public boolean a = false;
    public int b = 0;
    public final bjc c;

    public ajc(bjc bjcVar) {
        this.c = bjcVar;
    }

    @Override
    public final void b() {
        if (!this.a) {
            this.a = true;
            djc djcVar = (djc) this.c.e;
            if (djcVar != null) {
                djcVar.b();
            }
        }
    }

    @Override
    public final void c() {
        int i = this.b + 1;
        this.b = i;
        bjc bjcVar = this.c;
        if (i == ((ArrayList) bjcVar.c).size()) {
            djc djcVar = (djc) bjcVar.e;
            if (djcVar != null) {
                djcVar.c();
            }
            this.b = 0;
            this.a = false;
            bjcVar.b = false;
        }
    }
}
