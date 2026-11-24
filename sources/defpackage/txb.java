package defpackage;

import java.util.Iterator;
public final class txb implements ee {
    public final wxb a;

    public txb(wxb wxbVar) {
        this.a = wxbVar;
    }

    @Override
    public final void r(he heVar, int i) {
        zxb zxbVar = this.a.a;
        Iterator it = zxbVar.e.iterator();
        while (it.hasNext()) {
            zxbVar.Z(((Integer) it.next()).intValue());
        }
        zxbVar.e.clear();
        zxbVar.a0();
    }
}
