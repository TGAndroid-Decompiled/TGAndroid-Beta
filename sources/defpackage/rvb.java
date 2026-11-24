package defpackage;

import java.util.Iterator;
public final class rvb implements ed {
    public final tvb a;

    public rvb(tvb tvbVar) {
        this.a = tvbVar;
    }

    @Override
    public final void u(hd hdVar, int i) {
        wvb wvbVar = this.a.a;
        Iterator it = wvbVar.e.iterator();
        while (it.hasNext()) {
            wvbVar.Y(((Integer) it.next()).intValue());
        }
        wvbVar.e.clear();
        wvbVar.Z();
    }
}
