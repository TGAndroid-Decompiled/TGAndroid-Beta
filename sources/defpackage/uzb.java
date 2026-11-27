package defpackage;

import java.util.Iterator;
public final class uzb implements fd {
    public final wzb a;

    public uzb(wzb wzbVar) {
        this.a = wzbVar;
    }

    @Override
    public final void w(id idVar, int i) {
        zzb zzbVar = this.a.a;
        Iterator it = zzbVar.e.iterator();
        while (it.hasNext()) {
            zzbVar.Y(((Integer) it.next()).intValue());
        }
        zzbVar.e.clear();
        zzbVar.Z();
    }
}
